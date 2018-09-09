package fmnavarretem.co.restproxyandroidjava.Model.BL;

import fmnavarretem.co.restproxyandroidjava.Model.DataAccess.Connection.IResponder;
import fmnavarretem.co.restproxyandroidjava.Model.DataAccess.Repositories.RepoSport;
import fmnavarretem.co.restproxyandroidjava.Model.POJO.Response;
import fmnavarretem.co.restproxyandroidjava.Model.Util.Constants;
import fmnavarretem.co.restproxyandroidjava.Presenter.SportItem.ISportItemListener;

public class SportItemBL implements ISportItemBL {

    private ISportItemListener listener;

    public SportItemBL(ISportItemListener listener) {
        this.listener = listener;
    }

    public ISportItemListener getListener() {
        return listener;
    }

    public void setListener(ISportItemListener listener) {
        this.listener = listener;
    }

//    MARK: ISportItemBL
    @Override
    public void getSportItem() {
        RepoSport.getSwimming(this);
    }

    //    MARK: IResponder
    @Override
    public void onSuccessResponse(Object objectResponse, Constants.ServiceTag serviceTag) {
        switch (serviceTag){
            case GET_SWIMMING:
                listener.onReceivedSportItem((Response) objectResponse);
                break;
        }
    }

    @Override
    public void onFailedResponse() {

    }
}
