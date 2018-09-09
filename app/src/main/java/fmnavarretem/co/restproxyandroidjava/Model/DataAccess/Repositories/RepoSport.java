package fmnavarretem.co.restproxyandroidjava.Model.DataAccess.Repositories;

import fmnavarretem.co.restproxyandroidjava.Model.DataAccess.Connection.IResponder;
import fmnavarretem.co.restproxyandroidjava.Model.DataAccess.Connection.Proxy;
import fmnavarretem.co.restproxyandroidjava.Model.POJO.Response;
import fmnavarretem.co.restproxyandroidjava.Model.Util.Constants;

public class RepoSport {
    public static void getSwimming(IResponder responder){
        Proxy.execute(Constants.EndPoints.SWIMMING,
                Constants.HTTPMethod.GET,
                null,
                null,
                null,
                responder,
                Constants.ServiceTag.GET_SWIMMING,
                Response.class);
    }
}
