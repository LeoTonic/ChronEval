package com.anleon.chroneval;

import android.support.v4.app.Fragment;

public class TransferActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new TransferFragment();
    }
}
