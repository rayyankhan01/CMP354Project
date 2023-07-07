package com.example.cmp354project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class LoggedIn extends AppCompatActivity implements View.OnClickListener
{

    Button searchButton;
    EditText et_accountName;
    Spinner regionSelect;

    Button setupButton;

    TextView summonerLevel;

    ArrayAdapter<CharSequence> adapter;

    String jsonStr = "";


    //UPDATEE EVERY DAY -- not needed
    String api_key = "";


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);

        regionSelect = findViewById(R.id.regionSelect);
        searchButton = findViewById(R.id.btn_searchSummoner);
        setupButton = findViewById(R.id.btn_setAccount);

        et_accountName = findViewById(R.id.et_accountName);
    //    summonerLevel = findViewById(R.id.summonerLevel);

        searchButton.setOnClickListener(this);
        setupButton.setOnClickListener(this);
        adapter = ArrayAdapter.createFromResource(this, R.array.Regions, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        regionSelect.setAdapter(adapter);



    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_setAccount)
        {

            Intent setupIntent = new Intent(this,AccountSetup.class);
            startActivity(setupIntent);
        }
        else if(v.getId() == R.id.btn_searchSummoner)
        {
        //    Intent searchIntent = new Intent (this, );

        }






        // do we even need any of this anymore ?

/*        String userName = et_accountName.getText().toString();
        final URL[] api_url = {null};


        new Thread(new Runnable(){
            @Override
            public void run() {

                try {
                    api_url[0] = new URL("https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + userName + "?api_key=" + api_key);
                    // HttpHeaders headers = new HttpHeaders();//headers.add("Accept","/");
                    // HttpURLConnection huc = (HttpURLConnection) api_url[0].openConnection();
                    //InputStream inputStream = huc.getInputStream();
                    StringBuilder builder = new StringBuilder();
                    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(api_url[0].openStream(), UTF_8))) {
                        String str;
                        while ((str = bufferedReader.readLine()) != null) {
                            builder.append(str);
                            builder.append(System.getProperty("line.separator"));                        }
                    }
                    String jsonStr = builder.toString();
                    summonerLevel.setText(jsonStr);

                   // for(int i=1;i<=8;i++){
                        //tempString = tempString + (huc.getOutputStream().);
                    //}



                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }).start();*/






    }


}