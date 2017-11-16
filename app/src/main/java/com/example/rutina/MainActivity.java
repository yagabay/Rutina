package com.example.rutina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void startCreateRoutineActivity(View view)
    {
        Intent intent = new Intent(this, CreateRoutineActivity.class);
        startActivity(intent);
    }

    public void startEditRoutineActivity(View view)
    {
        Intent intent = new Intent(this, EditRoutineActivity.class);
        startActivity(intent);
    }

    public void startEditEventTime(View view)
    {
        Intent intent = new Intent(this, EditEventTimeActivity.class);
        startActivity(intent);
    }

    public void startEditSetEventReminderActivity(View view)
    {
        Intent intent = new Intent( this, EditSetEventTimeReminderActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.itm_create_routine:
                startCreateRoutineActivity(null);
                return true;
            case R.id.itm_edit_routine:
                startEditRoutineActivity(null);
                return true;
            case R.id.itm_edit_event_time:
                startEditEventTime(null);
                return true;
            case R.id.itm_edit_set_event_time_reminder:
                startEditSetEventReminderActivity(null);
                return true;
        }
        return false;
    }
}
