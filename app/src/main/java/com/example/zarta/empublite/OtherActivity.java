package com.example.zarta.empublite;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by zarta on 12/09/2017.
 */

public class OtherActivity extends LifecycleLoggingActivity {

    public static final String EXTRA_MESSAGE = "msg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);

        TextView tv = (TextView) findViewById(R.id.msg);
        tv.setText(getIntent().getStringExtra(EXTRA_MESSAGE));
    }
}
