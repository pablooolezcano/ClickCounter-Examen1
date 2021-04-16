package es.ulpgc.eite.cleancode.clickcounter;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.rule.ActivityTestRule;

import es.ulpgc.eite.cleancode.clickcounter.counter.CounterActivity;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isEnabled;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

public class CounterInstrumentedRobot {


  private ActivityTestRule<CounterActivity> testRule =
      new ActivityTestRule<>(CounterActivity.class,false, false);



  public void iniciamos_pantalla_COUNTER() {
    testRule.launchActivity(null);
  }


  public void iniciamos_pantalla_CLICKS() {

    try {
      Thread.sleep(700);
    } catch (InterruptedException e) {

    }
  }

  public void resumimos_pantalla_COUNTER() {
    //counterTestRule.finishActivity();
    //counterTestRule.launchActivity(null);

    /*
    try {
      Thread.sleep(700);
    } catch (InterruptedException e) {

    }
    */
  }

  public void finalizamos_pantalla_CLICKS() {
    pressBack();

    try {
      Thread.sleep(700);
    } catch (InterruptedException e) {

    }
  }


  public void pausamos_pantalla_COUNTER() {

  }

  public void texto_en_COUNTER_muestra(int numero) {

    String text= String.valueOf(numero);

    onView(withId(R.id.tvCounter))
        .check(matches(isDisplayed()))
        .check(matches(withText(text)));

  }


  public void texto_en_CLICKS_muestra(int numero) {

    String text= String.valueOf(numero);

    onView(withId(R.id.tvClicks))
        .check(matches(isDisplayed()))
        .check(matches(withText(text)));
  }


  public void boton_INCREMENT_se_encuentra(boolean activado) {

    onView(withId(R.id.btnIncrement))
        .check(matches(isDisplayed()))
        .check(matches(activado ? isEnabled() : not(isEnabled())));
  }

  public void boton_RESET_se_encuentra(boolean activado) {

    onView(withId(R.id.btnReset))
        .check(matches(isDisplayed()))
        .check(matches(activado ? isEnabled() : not(isEnabled())));
  }

  public void boton_CLICKS_se_encuentra(boolean activado) {

    onView(withId(R.id.btnClicks))
        .check(matches(isDisplayed()))
        .check(matches(activado ? isEnabled() : not(isEnabled())));
  }

  public void boton_CLEAR_se_encuentra(boolean activado) {

    onView(withId(R.id.btnClear))
        .check(matches(isDisplayed()))
        .check(matches(activado ? isEnabled() : not(isEnabled())));
  }

  public void hacemos_clic_en_boton_INCREMENT() {
    onView(withId(R.id.btnIncrement)).perform(click());
  }

  public void hacemos_clic_en_boton_CLICKS() {
    onView(withId(R.id.btnClicks)).perform(click());
  }


  public void hacemos_clic_en_boton_CLEAR() {
    onView(withId(R.id.btnClear)).perform(click());
  }


  public void hacemos_clic_en_boton_RESET() {
    onView(withId(R.id.btnReset)).perform(click());
  }


  public void rotamos_pantalla_COUNTER() {
    Context context = ApplicationProvider.getApplicationContext();
    int orientation = context.getResources().getConfiguration().orientation;
    Activity activity = testRule.getActivity();

    if(orientation  == Configuration.ORIENTATION_PORTRAIT) {
      activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    } else {
      activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    try {
      Thread.sleep(700);
    } catch (InterruptedException e) {

    }

  }

  public void rotamos_pantalla_CLICKS() {

  }

}
