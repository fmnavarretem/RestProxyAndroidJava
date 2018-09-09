package fmnavarretem.co.restproxyandroidjava.Model.Util;

import retrofit2.http.DELETE;
import retrofit2.http.PATCH;

public class Constants {
    public static class EndPoints{
        public static String URL_ROOT = "https://sports-decathlon.herokuapp.com/api/v1/";
        public static String SWIMMING = "sports";
    }
    public enum ServiceTag{
        GET_SWIMMING
    }
    public enum HTTPMethod{
        GET,
        PATCH,
        DELETE
    }
}
