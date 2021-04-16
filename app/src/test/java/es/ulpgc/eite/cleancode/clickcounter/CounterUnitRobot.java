package es.ulpgc.eite.cleancode.clickcounter;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.robolectric.Robolectric;
import org.robolectric.android.controller.ActivityController;

import es.ulpgc.eite.cleancode.clickcounter.clicks.ClicksActivity;
import es.ulpgc.eite.cleancode.clickcounter.counter.CounterActivity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CounterUnitRobot {


  private ActivityController<CounterActivity> counterTestCtrl;
  private ActivityController<ClicksActivity> clicksTestCtrl;

  public void iniciamos_pantalla_COUNTER() {
    counterTestCtrl = Robolectric.buildActivity(CounterActivity.class);
    counterTestCtrl.create().resume().visible();
  }


  public void iniciamos_pantalla_CLICKS() {
    clicksTestCtrl = Robolectric.buildActivity(ClicksActivity.class);
    clicksTestCtrl.create().resume().visible();
  }

  public void resumimos_pantalla_COUNTER() {
    counterTestCtrl.resume();
  }

  public void finalizamos_pantalla_CLICKS() {
    ClicksActivity activity = clicksTestCtrl.get();
    activity.onBackPressed();

  }


  public void pausamos_pantalla_COUNTER() {
    counterTestCtrl.pause();
  }

  public void texto_en_COUNTER_muestra(int numero) {
    CounterActivity activity = counterTestCtrl.get();

    TextView tv = activity.findViewById(R.id.tvCounter);
    int valor = Integer.valueOf(tv.getText().toString());
    assertThat(valor, equalTo(numero));

  }


  public void texto_en_CLICKS_muestra(int numero) {
    ClicksActivity activity = clicksTestCtrl.get();

    TextView tv = activity.findViewById(R.id.tvClicks);
    int valor = Integer.valueOf(tv.getText().toString());
    assertThat(valor, equalTo(numero));
  }


  public void boton_INCREMENT_se_encuentra(boolean activado) {

    CounterActivity activity = counterTestCtrl.get();

    Button btn = activity.findViewById(R.id.btnIncrement);
    assertThat(btn.isEnabled(), equalTo(activado));
  }

  public void boton_RESET_se_encuentra(boolean activado) {
    CounterActivity activity = counterTestCtrl.get();

    Button btn = activity.findViewById(R.id.btnReset);
    assertThat(btn.isEnabled(), equalTo(activado));
    
  }

  public void boton_CLICKS_se_encuentra(boolean activado) {
    CounterActivity activity = counterTestCtrl.get();

    Button btn = activity.findViewById(R.id.btnClicks);
    assertThat(btn.isEnabled(), equalTo(activado));
    
  }

  public void boton_CLEAR_se_encuentra(boolean activado) {
    ClicksActivity activity = clicksTestCtrl.get();

    Button btn = activity.findViewById(R.id.btnClear);
    assertThat(btn.isEnabled(), equalTo(activado));
  }

  public void hacemos_clic_en_boton_INCREMENT() {
    CounterActivity activity = counterTestCtrl.get();

    Button btn = activity.findViewById(R.id.btnIncrement);
    btn.performClick();
  }

  public void hacemos_clic_en_boton_CLICKS() {
    CounterActivity activity = counterTestCtrl.get();

    Button btn = activity.findViewById(R.id.btnClicks);
    btn.performClick();
  }


  public void hacemos_clic_en_boton_CLEAR() {
    ClicksActivity activity = clicksTestCtrl.get();

    Button btn = activity.findViewById(R.id.btnClear);
    btn.performClick();
  }


  public void hacemos_clic_en_boton_RESET() {
    CounterActivity activity = counterTestCtrl.get();

    Button btn = activity.findViewById(R.id.btnReset);
    btn.performClick();
  }


  public void rotamos_pantalla_COUNTER() {
    Bundle bundle = new Bundle();

    counterTestCtrl
        .saveInstanceState(bundle)
        .pause()
        .stop()
        .destroy();

    counterTestCtrl = Robolectric.buildActivity(CounterActivity.class)
        .create(bundle)
        .restoreInstanceState(bundle)
        .resume()
        .visible();
  }

  public void rotamos_pantalla_CLICKS() {
    Bundle bundle = new Bundle();

    clicksTestCtrl
        .saveInstanceState(bundle)
        .pause()
        .stop()
        .destroy();

    clicksTestCtrl = Robolectric.buildActivity(ClicksActivity.class)
        .create(bundle)
        .restoreInstanceState(bundle)
        .resume()
        .visible();
  }

}
