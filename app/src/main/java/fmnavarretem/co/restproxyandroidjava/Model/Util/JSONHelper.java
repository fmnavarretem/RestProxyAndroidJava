package fmnavarretem.co.restproxyandroidjava.Model.Util;

import com.google.gson.Gson;

public class JSONHelper {
    public static Object objectFromJson(Object object, Class<?> type) {
        String jsonString = new Gson().toJson(object);
        return new Gson().fromJson(jsonString,type);
    }
}
