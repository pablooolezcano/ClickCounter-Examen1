package es.ulpgc.eite.cleancode.clickcounter.counter;

import androidx.fragment.app.FragmentActivity;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.clickcounter.R;
import es.ulpgc.eite.cleancode.clickcounter.app.AppMediator;

public class CounterScreen {

  public static void configure(CounterContract.View view) {

    WeakReference<FragmentActivity> context =
        new WeakReference<>((FragmentActivity) view);

    String data = context.get().getString(R.string.app_name);

    AppMediator mediator = AppMediator.getInstance();

    CounterContract.Presenter presenter = new CounterPresenter(mediator);
    CounterContract.Model model = new CounterModel(data);
    presenter.injectModel(model);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
