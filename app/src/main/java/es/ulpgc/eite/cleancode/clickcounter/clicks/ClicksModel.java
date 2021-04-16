package es.ulpgc.eite.cleancode.clickcounter.clicks;

import android.util.Log;

public class ClicksModel implements ClicksContract.Model {

  public static String TAG = ClicksModel.class.getSimpleName();

  private String data;

  public ClicksModel(String data) {
    this.data = data;
  }

  @Override
  public String getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return data;
  }

  @Override
  public void onRestartScreen(String data) {
    // Log.e(TAG, "onRestartScreen()");
  }

  @Override
  public void onDataFromNextScreen(String data) {
    // Log.e(TAG, "onDataFromNextScreen()");
  }

  @Override
  public void onDataFromPreviousScreen(String data) {
    // Log.e(TAG, "onDataFromPreviousScreen()");
  }
}
