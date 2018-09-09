package fmnavarretem.co.restproxyandroidjava.Model.DataAccess.Connection;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * Created by fmnavarretem on 17/01/18.
 */

public interface IProxyMembers {
    @GET
    Call<Object> getData(@Url String patch, @QueryMap Map<String, String> queries);
    @GET
    Call<Object> getData(@Url String patch);
    @PATCH
    Call<Object> patchData(@Url String patch, @QueryMap Map<String, String> queries, @Body Object object);
    @DELETE
    Call<Object> deleteData(@Url String patch, @QueryMap Map<String, String> queries);
}
