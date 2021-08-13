package util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Loop
{
    private final BigDecimal ONE = new BigDecimal(1);
    private final BigDecimal MILLION = new BigDecimal(1000000);
    private final BigDecimal BILLION = new BigDecimal(1000000000);
    private final BigDecimal MAX_VALUE = new BigDecimal(Long.MAX_VALUE);

    private final double fps;
    private final Runnable updatable;

    protected Thread thread;
    private volatile boolean running;

    public Loop(double fps, Runnable updatable)
    {
        this.fps = fps;
        this.updatable = updatable;
        running = false;
        thread = new Thread(this::run);
    }

    public void start()
    {
        running = true;
        thread.start();
    }

    public void restart()
    {
        thread = new Thread(this::run);
        running = true;
        thread.start();
    }

    public void stop() {
        running = false;
        if (Thread.currentThread().equals(thread))
        {
            return;
        }
        try
        {
            thread.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    private void run()
    {
        BigDecimal lastCycleTime = new BigDecimal(System.nanoTime());
        BigDecimal nanosecondsPerUpdate = BILLION.divide(new BigDecimal(fps), RoundingMode.UNNECESSARY);
        BigDecimal delta = new BigDecimal(0);
        while (running)
        {
            BigDecimal now = new BigDecimal(System.nanoTime());
            delta = delta.add(now.subtract(lastCycleTime).divide(nanosecondsPerUpdate, RoundingMode.UNNECESSARY));
            lastCycleTime = now;
            if (delta.compareTo(ONE) < 0)
            {
                sleep(nanosecondsPerUpdate.multiply(ONE.subtract(delta)));
            }
            while (running && delta.compareTo(ONE) >= 0)
            {
                try
                {
                    update();
                }
                catch (Throwable throwable)
                {
                    throwable.printStackTrace();
                }
                delta = delta.subtract(ONE);
            }
        }
    }

    public void sleep(BigDecimal time)
    {
        BigDecimal temp = time.divide(MILLION, RoundingMode.UNNECESSARY);
        long milliseconds = temp.compareTo(MAX_VALUE) < 0 ? Long.MAX_VALUE : temp.longValue();
        int nanoseconds = time.remainder(MILLION).intValue();
        try
        {
            Thread.sleep(milliseconds, nanoseconds);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public void update()
    {
        if (updatable != null)
        {
            updatable.run();
        }
    }
}