package com.scnu.zhou.calendardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.scnu.zhou.widget.NoteCalendar;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private NoteCalendar nc_calendar;
    private Map<String, Boolean> note01;
    private Map<String, Boolean> note02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nc_calendar = (NoteCalendar) findViewById(R.id.nc_calendar);
        note01 = new HashMap<>();
        note01.put("2016-12-21", true);
        note02 = new HashMap<>();
        note02.put("2016-12-01", true);
        nc_calendar.setNote01(note01);
        nc_calendar.setNote02(note02);
    }

}
