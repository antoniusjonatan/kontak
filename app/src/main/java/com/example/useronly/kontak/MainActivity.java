package com.example.useronly.kontak;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button plg1,plg2,plg3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plg1 = (Button) findViewById(R.id.button2);
        plg1.setOnClickListener(this);
        plg2 = (Button) findViewById(R.id.button3);
        plg2.setOnClickListener(this);
        plg3 = (Button) findViewById(R.id.button4);
        plg3.setOnClickListener(this);
        plg1.setOnClickListener(this);
    }
            @Override
            public void onClick(View v) {
                switch (v.getId()  ) {
                    case R.id.button2:
                        Intent intcall = new Intent(Intent.ACTION_CALL);
                        intcall.setData(Uri.parse("tel:089610962268"));
                        startActivity(intcall);
                        break;
                    case R.id.button3:
                        Intent inttel = new Intent(Intent.ACTION_CALL);
                        inttel.setData(Uri.parse("tel:08520092121"));
                        startActivity(inttel);
                        break;
                    case R.id.button4:
                        Intent intcal = new Intent(Intent.ACTION_CALL);
                        intcal.setData(Uri.parse("tel:082280802108"));
                        startActivity(intcal);
                        break;
                }
    }
}