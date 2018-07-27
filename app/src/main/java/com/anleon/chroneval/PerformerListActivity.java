package com.anleon.chroneval;

import android.support.v4.app.Fragment;

public class PerformerListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new PerformerListFragment();
    }
}
