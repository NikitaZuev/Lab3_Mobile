package com.example.recyclerview;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        Bundle arg = getIntent().getExtras();
        String details = arg.get("ARG_ITEM_DETAILS").toString();

        TextView tv1 = findViewById(R.id.textView);
        tv1.setText(details);
    }
}