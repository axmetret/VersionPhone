package ru.axmet.vesionphone;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView1);
        textView.setText("Version OS:" + " " +  Build.VERSION.RELEASE);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("Build SDK:" + " " + Build.VERSION.SDK_INT);

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText("Build Model:" + " " + Build.MODEL);

        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText("Build Manufacturer:" + " " + Build.MANUFACTURER );

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText("Build Brand:" + " " + Build.BRAND);

        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText("Build ID:" + " " + Build.ID);

        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText("Build Fingerprint:" + " " + Build.FINGERPRINT);

        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setText("CPU ABI:" + " " + Build.CPU_ABI);

    }
}

