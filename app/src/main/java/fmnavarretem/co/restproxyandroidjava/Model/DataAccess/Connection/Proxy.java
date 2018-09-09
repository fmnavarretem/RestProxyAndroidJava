package fmnavarretem.co.restproxyandroidjava.Model.DataAccess.Connection;


import java.util.Map;

import fmnavarretem.co.restproxyandroidjava.Model.Util.Constants;
import fmnavarretem.co.restproxyandroidjava.Model.Util.JSONHelper;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by fmnavarretem on 14/01/18.
 */

public class Proxy {
    public static void execute(String url,
                               Constants.HTTPMethod methodType,
                               Object body,
                               Map<String, String> queries,
                               Map<String, String> headers,
                               final IResponder responder,
                               final Constants.ServiceTag serviceTag,
                               final Class<?> type) {

        IProxyMembers proxyMembers = ProxyAdapter.startConnection(Constants.EndPoints.URL_ROOT);
        Call<Object> call;
        switch (methodType){
            case GET:
                if (queries == null){
                    call = proxyMembers.getData(url);
                }else {
                    call = proxyMembers.getData(url,queries);
                }
                break;
            case PATCH:
                call = proxyMembers.patchData(url,queries,body);
                break;
            case DELETE:
                call = proxyMembers.deleteData(url,queries);
                break;
            default:
                call = null;
                break;
        }
        call.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                Object object = JSONHelper.objectFromJson(response.body(),type);
                responder.onSuccessResponse(object,serviceTag);
            }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {
                responder.onFailedResponse();
            }
        });
    }
}
