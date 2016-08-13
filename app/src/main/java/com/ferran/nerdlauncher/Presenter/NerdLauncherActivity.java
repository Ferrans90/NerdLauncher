package com.ferran.nerdlauncher.Presenter;

        import android.support.v4.app.Fragment;

        import com.ferran.nerdlauncher.Presenter.NerdLauncherFragment;
        import com.ferran.nerdlauncher.Presenter.SingleFragmentActivity;

public class NerdLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newInstance();
    }
}
