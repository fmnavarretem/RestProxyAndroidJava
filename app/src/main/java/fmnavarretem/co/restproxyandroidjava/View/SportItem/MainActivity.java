package fmnavarretem.co.restproxyandroidjava.View.SportItem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import fmnavarretem.co.restproxyandroidjava.Model.POJO.Response;
import fmnavarretem.co.restproxyandroidjava.Presenter.SportItem.ISportItemPresenter;
import fmnavarretem.co.restproxyandroidjava.Presenter.SportItem.SportItemPresenter;
import fmnavarretem.co.restproxyandroidjava.R;

public class MainActivity extends AppCompatActivity implements ISportItemView {

    private ISportItemPresenter presenter;

    private TextView tvMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMainActivity = (TextView) findViewById(R.id.tv_main_activity);
        this.presenter = new SportItemPresenter(this);
        presenter.getSportItem();
    }

//    MARK: ISportItemView
    @Override
    public void notifyReceivedSportItem(Response response) {
        tvMainActivity.setText(response.getData().get(0).getId());
    }
}
