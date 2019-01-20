package com.tiego.makaleng.espresso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
* @author Tiego Makaleng
*/

public class MainActivity extends AppCompatActivity {
    private TextView mNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNote = (TextView) findViewById(R.id.textViewNote);
    }

    public void writeNote(View view) {
        mNote.setText(R.string.note);
    }
}
