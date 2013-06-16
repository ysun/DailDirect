package com.sy.daildirect;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent DialIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:15000518994"));
        DialIntent. setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
        /** Finally start the Activity */ 
        startActivity(DialIntent); 
        //DialIntent.clone();
        this.finish();
        
        //setContentView(R.layout.activity_main);
        //TextView tv = new TextView(this);
        //tv.setText("helloWorld");
        //setContentView(tv); 
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
