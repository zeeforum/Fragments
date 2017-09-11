package com.example.zarta.empublite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by zarta on 12/09/2017.
 */

public class StaticFragmentsDemoActivity extends LifecycleLoggingActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void showOther(View v) {
        Intent other = new Intent(this, OtherActivity.class);
        other.putExtra(OtherActivity.EXTRA_MESSAGE, getString(R.string.other));
        startActivity(other);
    }
}
