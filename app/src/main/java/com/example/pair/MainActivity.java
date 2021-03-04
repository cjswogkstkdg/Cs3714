package com.example.pair;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    Date date;
    Button record;
    TextView timeView;
    String recordedTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize
        record = (Button) findViewById(R.id.record);
        timeView = (TextView) findViewById(R.id.time);

        recordedTime = "";
    }


    /**
     *
     * @param viewgi
     */
    public void recordTime(View view){
        date = java.util.Calendar.getInstance().getTime();

        Log.d(TAG, "currentTime: " + date.toString());
        recordedTime += date.toString() + "\n";
        Log.d(TAG, "recordedTime: " + recordedTime);
        timeView.setText(recordedTime);

    }

}