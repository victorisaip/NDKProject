package com.example.victo.mathematicalndk;

import android.os.Bundle;
import android.widget.TextView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText("Addition");
        tv.append("\n");
        int res = add(1,2);
        tv.append(String.valueOf(res));
        tv.append("\n");
        tv.append("Multiplication");
        int multi = multiply(9,6);
        tv.append("\n");
        tv.append(String.valueOf(multi));
        tv.append("\n");
        tv.append("Division");
        int divisi = division(14,2);
        tv.append("\n");
        tv.append(String.valueOf(divisi));
        tv.append("\n");
        tv.append("Difference");
        tv.append("\n");
        int dif = diference(67,98);
        tv.append(String.valueOf(dif));


    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native int add(int a,int b);

    public native int multiply(int a,int b);

    public native int division(int a,int b);

    public native int diference(int a,int b);



    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("hello-android");
    }
}
