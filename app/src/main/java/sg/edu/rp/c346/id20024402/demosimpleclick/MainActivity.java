package sg.edu.rp.c346.id20024402.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btnDisplay;
    TextView tvMsg;
    EditText etData;
    ToggleButton tbEnabler;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplay = findViewById(R.id.buttonDisplay);
        etData = findViewById(R.id.editTextInput);
        tvMsg = findViewById(R.id.textViewDisplay);
        tbEnabler = findViewById(R.id.toggleButton);
        rgGender = findViewById(R.id.radioGroupGender);



        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = etData.getText().toString();
                String message = "";
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    // Write the code when male selected
                    message = "He says ";

                }
                else if (checkedRadioId == R.id.radioButtonGenderFemale){
                    // Write the code when female selected
                    message = "She says ";

                }
                tvMsg.setText(message + text);

               /* Toast.makeText(MainActivity.this,
                        "My First Toast",
                        Toast.LENGTH_SHORT).show();

                */

            }
        });


        tbEnabler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbEnabler.isChecked() == true){
                    etData.setEnabled(true);
                    etData.setBackgroundColor(Color.TRANSPARENT);
                } else {
                    etData.setEnabled(false);
                    etData.setBackgroundColor(Color.RED);
                }
            }
        });

    }



}