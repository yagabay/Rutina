package com.example.rutina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class EditRoutineActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_routine);
        getSupportActionBar().setTitle("ערוך רוטינה");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return false;
    }
}
