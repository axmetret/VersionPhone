package ru.axmet.vesionphone;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView1);
        textView.setText("Version OS:" + " " +  Build.VERSION.RELEASE);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("SDK:" + " " + Build.VERSION.SDK_INT);

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText("Model:" + " " + Build.MODEL);

        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText("Manufacturer:" + " " + Build.MANUFACTURER );

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText("Brand:" + " " + Build.BRAND);

        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText("ID:" + " " + Build.ID);

        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText("Fingerprint:" + " " + Build.FINGERPRINT);

        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setText("CPU ABI:" + " " + Build.CPU_ABI);

        TextView textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setText("Bootloader:" + " " + Build.BOOTLOADER);

        TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setText("Board:" + " " + Build.BOARD);

        TextView textView11 = (TextView) findViewById(R.id.textView11);
        textView11.setText("Device:" + " " + Build.DEVICE);

        TextView textView12 = (TextView) findViewById(R.id.textView12);
        textView12.setText("Display:" + " " + Build.DISPLAY);

        TextView textView13 = (TextView) findViewById(R.id.textView13);
        textView13.setText("Hardware:" + " " + Build.HARDWARE);

        TextView textView14 = (TextView) findViewById(R.id.textView14);
        textView14.setText("Host:" + " " + Build.HOST);

        TextView textView15 = (TextView) findViewById(R.id.textView15);
        textView15.setText("Tags:" + " " + Build.TAGS);

        TextView textView16 = (TextView) findViewById(R.id.textView16);
        textView16.setText("Time:" + " " + Build.TIME);

        TextView textView17 = (TextView) findViewById(R.id.textView17);
        textView17.setText("Type:" + " " + Build.TYPE);

        TextView textView18 = (TextView) findViewById(R.id.textView18);
        textView18.setText("User:" + " " + Build.USER);

        TextView textView19 = (TextView) findViewById(R.id.textView19);
        textView19.setText("Radio:" + " " + Build.getRadioVersion());

        TextView textView20 = (TextView) findViewById(R.id.textView20);
        textView20.setText("Base_OS:" + " " + Build.VERSION.BASE_OS);

        TextView textView21 = (TextView) findViewById(R.id.textView21);
        textView21.setText("Codename:" + " " + Build.VERSION.CODENAME);

        TextView textView22 = (TextView) findViewById(R.id.textView22);
        textView22.setText("incremental:" + " " + Build.VERSION.INCREMENTAL);

        TextView textView23 = (TextView) findViewById(R.id.textView23);
        textView23.setText("Security patch:" + " " + Build.VERSION.SECURITY_PATCH);


    }
}

