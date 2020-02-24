package com.example.southafrican_id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etID;
    Button btnSubmit;
    TextView tvResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etID = findViewById(R.id.etID);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResults = findViewById(R.id.tvResults);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idnum = etID.getText().toString().trim();

                String dob = idnum.substring(0,6);

                int gender = Integer.parseInt(Character.toString(idnum.charAt(6)));
                String sGender;
                if(gender < 5)
                {
                    sGender = "female";
                }
                else
                    sGender = "male";

                int nationality = Integer.parseInt(Character.toString(idnum.charAt(10)));

                String snationality;

                if(nationality == 0)
                    snationality = "SA Citizen";
                else
                    snationality = "Permanent Resident";

                tvResults.setText("DOB: " + dob + "\n" +
                                    "Gender: " + sGender +"\n" +
                        "Nationality: " + snationality);


            }
        });

    }
}
