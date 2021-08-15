package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;
import java.util.LinkedList;

public class ListUtil
{
    private static final GsonBuilder gsonBuilder = new GsonBuilder();
    private static final Gson gson = gsonBuilder.setPrettyPrinting().create();

    public static LinkedList<Long> JsonToList(String json)
    {
        return new LinkedList<>(Arrays.asList(gson.fromJson(json, Long[].class)));
    }
}
