package es.ulpgc.eite.cleancode.clickcounter;

import androidx.test.filters.LargeTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

//@RunWith(AndroidJUnit4ClassRunner.class)
@RunWith(RobolectricTestRunner.class)
@LargeTest
public class CounterLandscapeUnitTests {

  CounterUnitRobot robot = new CounterUnitRobot();



  @Test
  public void pulsar_boton_1_vez_rotando_pantalla() {

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("texto en COUNTER muestra 0")
    robot.texto_en_COUNTER_muestra(0);
    // And("boton INCREMENT se encuentra ACTIVADO")
    robot.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra DESACTIVADO")
    robot.boton_RESET_se_encuentra(false);
    // And("boton CLICKS se encuentra DESACTIVADO")
    robot.boton_CLICKS_se_encuentra(false);
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();

    // When("rotamos pantalla COUNTER")
    robot.rotamos_pantalla_COUNTER();

    // Then("texto en COUNTER muestra 1")
    robot.texto_en_COUNTER_muestra(1);
    // And("boton INCREMENT se encuentra ACTIVADO")
    robot.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra ACTIVADO")
    robot.boton_RESET_se_encuentra(true);
    // And("boton CLICKS se encuentra ACTIVADO")
    robot.boton_CLICKS_se_encuentra(true);

  }



  @Test
  public void pulsar_boton_10_veces_rotando_pantalla() {

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("texto en COUNTER muestra 0")
    robot.texto_en_COUNTER_muestra(0);
    // And("boton INCREMENT se encuentra ACTIVADO")
    robot.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra DESACTIVADO")
    robot.boton_RESET_se_encuentra(false);
    // And("boton CLICKS se encuentra DESACTIVADO")
    robot.boton_CLICKS_se_encuentra(false);
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();

    // When("rotamos pantalla COUNTER")
    robot.rotamos_pantalla_COUNTER();

    // Then("texto en COUNTER muestra 0")
    robot.texto_en_COUNTER_muestra(0);
    // And("boton INCREMENT se encuentra ACTIVADO")
    robot.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra DESACTIVADO")
    robot.boton_RESET_se_encuentra(false);
    // And("boton CLICKS se encuentra ACTIVADO")
    robot.boton_CLICKS_se_encuentra(true);

  }




  @Test
  public void pulsar_boton_10_veces_y_ver_numero_clicks_rotando_pantalla() {

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton CLICKS")
    robot.hacemos_clic_en_boton_CLICKS();
    // And("pausamos pantalla COUNTER")
    robot.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    robot.iniciamos_pantalla_CLICKS();

    // When("rotamos pantalla COUNTER")
    robot.rotamos_pantalla_COUNTER();
    // And("rotamos pantalla CLICKS")
    robot.rotamos_pantalla_CLICKS();

    // Then("texto en CLICKS muestra 10")
    robot.texto_en_CLICKS_muestra(10);
    // And("boton CLEAR se encuentra ACTIVADO")
    robot.boton_CLEAR_se_encuentra(true);

  }




  @Test
  public void pulsar_boton_11_veces_y_resetear_clicks_rotando_pantalla() {

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton CLICKS")
    robot.hacemos_clic_en_boton_CLICKS();
    // And("pausamos pantalla COUNTER")
    robot.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    robot.iniciamos_pantalla_CLICKS();
    // And("texto en CLICKS muestra 11")
    robot.texto_en_CLICKS_muestra(11);
    // And("boton CLEAR se encuentra ACTIVADO")
    robot.boton_CLEAR_se_encuentra(true);
    // And("hacemos clic en boton CLEAR")
    robot.hacemos_clic_en_boton_CLEAR();
    // And("texto en CLICKS muestra 0")
    robot.texto_en_CLICKS_muestra(0);
    // And("boton CLEAR se encuentra DESACTIVADO")
    robot.boton_CLEAR_se_encuentra(false);
    // And("finalizamos pantalla CLICKS")
    robot.finalizamos_pantalla_CLICKS();
    // And("resumimos pantalla COUNTER")
    robot.resumimos_pantalla_COUNTER();

    // When("rotamos pantalla COUNTER")
    robot.rotamos_pantalla_COUNTER();
    // And("rotamos pantalla CLICKS")
    robot.rotamos_pantalla_CLICKS();

    // Then("texto en COUNTER muestra 1")
    robot.texto_en_COUNTER_muestra(1);
    // And("boton INCREMENT se encuentra ACTIVADO")
    robot.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra ACTIVADO")
    robot.boton_RESET_se_encuentra(true);
    // And("boton CLICKS se encuentra ACTIVADO")
    robot.boton_CLICKS_se_encuentra(true);
  }



  @Test
  public void pulsar_boton_12_veces_y_resetear_contador_rotando_pantalla() {

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton CLICKS")
    robot.hacemos_clic_en_boton_CLICKS();
    // And("pausamos pantalla COUNTER")
    robot.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    robot.iniciamos_pantalla_CLICKS();
    // And("hacemos clic en boton CLEAR")
    robot.hacemos_clic_en_boton_CLEAR();
    // And("finalizamos pantalla CLICKS")
    robot.finalizamos_pantalla_CLICKS();
    // And("resumimos pantalla COUNTER")
    robot.resumimos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("texto en COUNTER muestra 2")
    robot.texto_en_COUNTER_muestra(2);
    // And("boton INCREMENT se encuentra ACTIVADO")
    robot.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra ACTIVADO")
    robot.boton_RESET_se_encuentra(true);
    // And("boton CLICKS se encuentra ACTIVADO")
    robot.boton_CLICKS_se_encuentra(true);
    // And("hacemos clic en boton RESET")
    robot.hacemos_clic_en_boton_RESET();

    // When("rotamos pantalla COUNTER")
    robot.rotamos_pantalla_COUNTER();

    // Then("texto en COUNTER muestra 0")
    robot.texto_en_COUNTER_muestra(0);
    // And("boton INCREMENT se encuentra ACTIVADO")
    robot.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra DESACTIVADO")
    robot.boton_RESET_se_encuentra(false);
    // And("boton CLICKS se encuentra ACTIVADO")
    robot.boton_CLICKS_se_encuentra(true);
  }




  @Test
  public void pulsar_boton_13_veces_y_ver_numero_clicks_rotando_pantalla() {

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("hacemos clic en boton CLICKS")
    robot.hacemos_clic_en_boton_CLICKS();
    // And("pausamos pantalla COUNTER")
    robot.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    robot.iniciamos_pantalla_CLICKS();
    // And("hacemos clic en boton CLEAR")
    robot.hacemos_clic_en_boton_CLEAR();
    // And("finalizamos pantalla CLICKS")
    robot.finalizamos_pantalla_CLICKS();
    // And("resumimos pantalla COUNTER")
    robot.resumimos_pantalla_COUNTER();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("boton INCREMENT se encuentra ACTIVADO")
    robot.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra ACTIVADO")
    robot.boton_RESET_se_encuentra(true);
    // And("boton CLICKS se encuentra ACTIVADO")
    robot.boton_CLICKS_se_encuentra(true);
    // And("hacemos clic en boton RESET")
    robot.hacemos_clic_en_boton_RESET();
    // And("hacemos clic en boton INCREMENT")
    robot.hacemos_clic_en_boton_INCREMENT();
    // And("texto en COUNTER muestra 1")
    robot.texto_en_COUNTER_muestra(1);
    // And("boton INCREMENT se encuentra ACTIVADO")
    robot.boton_INCREMENT_se_encuentra(true);
    // And("boton RESET se encuentra ACTIVADO")
    robot.boton_RESET_se_encuentra(true);
    // And("boton CLICKS se encuentra ACTIVADO")
    robot.boton_CLICKS_se_encuentra(true);
    // And("hacemos clic en boton CLICKS")
    robot.hacemos_clic_en_boton_CLICKS();
    // And("pausamos pantalla COUNTER")
    robot.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    robot.iniciamos_pantalla_CLICKS();

    // When("rotamos pantalla COUNTER")
    robot.rotamos_pantalla_COUNTER();
    // And("rotamos pantalla CLICKS")
    robot.rotamos_pantalla_CLICKS();

    // Then("texto en CLICKS muestra 2")
    robot.texto_en_CLICKS_muestra(2);
    // And("boton CLEAR se encuentra ACTIVADO")
    robot.boton_CLEAR_se_encuentra(true);
  }
}
