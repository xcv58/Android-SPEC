package com.xcv58.spec.android.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.xcv58.spec.R;
import com.xcv58.spec.android.utils.Utils;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.prepareButtons(this);
        Bundle extras = this.getIntent().getExtras();
        if (extras != null) {
            for (String key : extras.keySet()) {
                String value = extras.getString(key);
                Toast.makeText(this, key + ": " + value, Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean prepareButtons(Context context) {
        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.main);
        for (String method : Utils.MEASURE_METHODS) {
            Button button = new Button(this);
            button.setText(method);
            button.setOnClickListener(onClickListenerForButton);
            mainLayout.addView(button);
        }
        return true;
    }

    private View.OnClickListener onClickListenerForButton = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Button button = (Button) view;
            String method = button.getText().toString();
            sendIntent(view.getContext(), method);
//            double result = Utils.measure(method);
//            Toast.makeText(view.getContext(), method + ": " + result, Toast.LENGTH_SHORT).show();
        }
    };

    private void sendIntent(Context context, String method) {
//        Intent intent = new Intent(context, SPECIntentService.class);
//        intent.setAction(method);
//        startService(intent);
        Intent intent = new Intent("com.xcv58.spec.intentservice");
        intent.putExtra("method", method);
        startService(intent);
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
