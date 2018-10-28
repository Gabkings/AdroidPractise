package com.calculator.developer.pcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtEnterPercent;
    private EditText edtEnterNumber;
    private Button btnResults;
    private TextView edtViewResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        edtEnterPercent = (EditText) findViewById(R.id.edtEnterPercent);
        edtEnterNumber = (EditText) findViewById(R.id.edtEnterNumber);
        btnResults = (Button) findViewById(R.id.btnResults);
        edtViewResults = (TextView) findViewById(R.id.edtViewResults);
        btnResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float enterPercentNumericV = Float.parseFloat(edtEnterPercent.getText().toString());
                float enterNumberNumericV = Float.parseFloat(edtEnterNumber.getText().toString());
                float results = (enterNumberNumericV)*(enterPercentNumericV/100);
                edtViewResults.setText(Float.toString(results));
            }
        });

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
}
