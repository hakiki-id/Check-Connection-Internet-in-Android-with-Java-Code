package com.hakiki95.chekconnectionnetwork;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCek ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCek = (Button) findViewById(R.id.btnCek);

        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CekConnection();
            }
        });

    }

    private void CekConnection (){

        ConnectivityManager cManager = (ConnectivityManager) getSystemService (this.CONNECTIVITY_SERVICE);
        NetworkInfo nInfo = cManager.getActiveNetworkInfo();
        if (nInfo != null && nInfo.isConnected()) {
            Toast.makeText(getApplicationContext(),"this connected",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(),"connection not avalible",Toast.LENGTH_SHORT).show();
        }
    }


}
