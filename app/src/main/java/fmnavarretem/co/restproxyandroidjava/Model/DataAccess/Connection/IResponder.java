package fmnavarretem.co.restproxyandroidjava.Model.DataAccess.Connection;

import fmnavarretem.co.restproxyandroidjava.Model.Util.Constants;

;

/**
 * Created by fmnavarretem on 16/01/18.
 */

public interface IResponder {
    void onSuccessResponse(Object objectResponse, Constants.ServiceTag serviceTag);
    void onFailedResponse();
}
