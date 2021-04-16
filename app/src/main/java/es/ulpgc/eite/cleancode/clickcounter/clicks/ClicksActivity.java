package es.ulpgc.eite.cleancode.clickcounter.clicks;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import es.ulpgc.eite.cleancode.clickcounter.R;

public class ClicksActivity
    extends AppCompatActivity implements ClicksContract.View {

  public static String TAG = ClicksActivity.class.getSimpleName();

  private ClicksContract.Presenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_clicks);
    getSupportActionBar().setTitle(R.string.clicks_title);

    // do the setup
    ClicksScreen.configure(this);

    if (savedInstanceState == null) {
      presenter.onStart();

    } else {
      presenter.onRestart();
    }
  }

  @Override
  protected void onResume() {
    super.onResume();

    // load the data
    presenter.onResume();
  }

  @Override
  public void onBackPressed() {
    super.onBackPressed();

    presenter.onBackPressed();
  }

  @Override
  protected void onPause() {
    super.onPause();

    presenter.onPause();
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();

    presenter.onDestroy();
  }


  public void onClearPressed(View view) {
    presenter.onClearPressed();
  }

  @Override
  public void onDataUpdated(ClicksViewModel viewModel) {
    //Log.e(TAG, "onDataUpdated()");

    // deal with the data
    ((TextView) findViewById(R.id.tvClicks)).setText(viewModel.data);
  }

  @Override
  public void injectPresenter(ClicksContract.Presenter presenter) {
    this.presenter = presenter;
  }

}
