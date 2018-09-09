package fmnavarretem.co.restproxyandroidjava.Model.DataAccess.Connection;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by fmnavarretem on 17/01/18.
 */

public class ProxyAdapter {

    public static IProxyMembers startConnection(String urlRoot){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(urlRoot)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(IProxyMembers.class);
    }

}
