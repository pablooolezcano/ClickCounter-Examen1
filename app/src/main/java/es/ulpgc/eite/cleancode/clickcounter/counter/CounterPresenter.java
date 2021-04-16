package es.ulpgc.eite.cleancode.clickcounter.counter;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.clickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.clickcounter.app.ClicksToCounterState;
import es.ulpgc.eite.cleancode.clickcounter.app.CounterToClicksState;

public class CounterPresenter implements CounterContract.Presenter {

  public static String TAG = CounterPresenter.class.getSimpleName();

  private WeakReference<CounterContract.View> view;
  private CounterState state;
  private CounterContract.Model model;
  private int clicks;

  private AppMediator mediator;

  public CounterPresenter(AppMediator mediator) {
    this.mediator = mediator;
    state = mediator.getCounterState();
  }


  @Override
  public void onStart() {
    // Log.e(TAG, "onStart()");

    // initialize the state if is necessary
    if (state == null) {
      state = new CounterState();
    }
    clicks = 0;
    // call the model and update the state
    state.data = model.getStoredData();
    state.incrementButton =true;
    state.clicksButton = false;
    if(state.data != model.getStoredData()){
      state.resetButton=true;
    }
    /*
    // use passed state if is necessary
    PreviousToCounterState savedState = getStateFromPreviousScreen();
    if (savedState != null) {

      // update the model if is necessary
      model.onDataFromPreviousScreen(savedState.data);

      // update the state if is necessary
      state.data = savedState.data;
    }
    */
  }

  @Override
  public void onRestart() {
    // Log.e(TAG, "onRestart()");

    // update the model if is necessary
    model.onRestartScreen(state.data);
  }

  @Override
  public void onResume() {
    // Log.e(TAG, "onResume()");

    // use passed state if is necessary
    ClicksToCounterState savedState = getStateFromNextScreen();
    if (savedState != null) {

      // update the model if is necessary
      model.onDataFromNextScreen(savedState.data);
      state.clicks = savedState.data;
      clicks = Integer.parseInt(state.clicks);
      // update the state if is necessary
      //state.data = savedState.data;
      //state.clicks = savedState.data;
    }

    // call the model and update the state
    //state.data = model.getStoredData();

    // update the view

    view.get().onDataUpdated(state);

  }


  @Override
  public void onBackPressed() {
    // Log.e(TAG, "onBackPressed()");
  }

  @Override
  public void onPause() {
    // Log.e(TAG, "onPause()");
  }

  @Override
  public void onDestroy() {
    // Log.e(TAG, "onDestroy()");
  }

  @Override
  public void onClicksPressed() {
    // Log.e(TAG, "onClicksPressed()");
    CounterToClicksState newState = new CounterToClicksState(state.clicks);
    passStateToNextScreen(newState);
    view.get().navigateToNextScreen();
  }

  @Override
  public void onResetPressed() {
    // Log.e(TAG, "onResetPressed()");
    state.data = "0";
    model.setData(state.data);
    view.get().resetCounter();
  }

  @Override
  public void onIncrementPressed() {
    // Log.e(TAG, "onIncrementPressed()");
      state.resetButton = true;
      state.clicksButton = true;
    clicks++;
    state.clicks = "" + clicks;
    int cuenta = Integer.parseInt(state.data);
    cuenta++;
    state.data = "" + cuenta;
    model.setData(state.data);
    if(state.data == "9"){
      state.incrementButton = false;
    }
    if(state.data == "0"){
      state.resetButton = false;
    }
    //disableIncrementButton();
    view.get().onDataUpdated(state);

  }

//  private void disableIncrementButton(){
//    if(state.data == " 9"){
//      state.incrementButton = false;
//    }
//  }
  private void passStateToNextScreen(CounterToClicksState state) {
    mediator.setCounterNextScreenState(state);
  }

  private ClicksToCounterState getStateFromNextScreen() {
    return mediator.getCounterNextScreenState();
  }

  @Override
  public void injectView(WeakReference<CounterContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(CounterContract.Model model) {
    this.model = model;
  }

}
