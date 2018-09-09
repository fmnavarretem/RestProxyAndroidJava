package fmnavarretem.co.restproxyandroidjava.Presenter.SportItem;

import fmnavarretem.co.restproxyandroidjava.Model.BL.ISportItemBL;
import fmnavarretem.co.restproxyandroidjava.Model.BL.SportItemBL;
import fmnavarretem.co.restproxyandroidjava.Model.POJO.Response;
import fmnavarretem.co.restproxyandroidjava.View.SportItem.ISportItemView;

public class SportItemPresenter implements ISportItemPresenter,ISportItemListener {

    private ISportItemBL bl;
    private ISportItemView view;

    public SportItemPresenter(ISportItemView view) {
        this.view = view;
        this.bl = new SportItemBL(this);
    }

    public ISportItemBL getBl() {
        return bl;
    }

    public void setBl(ISportItemBL bl) {
        this.bl = bl;
    }

    public ISportItemView getView() {
        return view;
    }

    public void setView(ISportItemView view) {
        this.view = view;
    }

    //    MARK: ISportItemListener
    @Override
    public void onReceivedSportItem(Response response) {
        view.notifyReceivedSportItem(response);
    }
//    MARK: ISportItemPresenter
    @Override
    public void getSportItem() {
        bl.getSportItem();
    }
}
