package json;

import com.google.gson.*;
import constants.SharedConstants;

import java.lang.reflect.Type;

public class Deserializer<T> implements JsonDeserializer<T>
{
    @Override
    public T deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException
    {
        JsonObject jsonObject = json.getAsJsonObject();
        JsonPrimitive primitive = (JsonPrimitive) jsonObject.get(SharedConstants.CLASSNAME);
        String className = primitive.getAsString();
        Class<?> clazz;
        try
        {
            clazz = Class.forName(className);
        }
        catch (ClassNotFoundException e)
        {
            throw new JsonParseException(e);
        }
        return context.deserialize(jsonObject.get(SharedConstants.INSTANCE), clazz);
    }
}