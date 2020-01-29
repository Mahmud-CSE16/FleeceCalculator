package com.example.fleececalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class InputActivity extends AppCompatActivity {

    EditText editTextGSM,editTextCotton,editTextPolyester,editTextAmount;
    Spinner spinnerColor;

    double gsm,cotton,amount;

    int a1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        ViewById();



        Bundle bundle = getIntent().getExtras();
        a1 = bundle.getInt("a1");

        if(a1==1){
            setTitle("Spun Yarn Calculation");
        }else {
            setTitle("Filament Yarn Calculation");
        }

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.colors, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerColor.setAdapter(adapter);


    }

    public void calculate(View view){

        Double.parseDouble(editTextCotton.getText().toString());
        Double.parseDouble(editTextAmount.getText().toString());

        Intent intent = new Intent(InputActivity.this, CalculateAndResultActivity.class);
        intent.putExtra("a1",a1);
        intent.putExtra("gsm", editTextGSM.getText().toString());
        intent.putExtra("cotton", editTextCotton.getText().toString());
        intent.putExtra("amount", editTextAmount.getText().toString());
        intent.putExtra("color",spinnerColor.getSelectedItem().toString());
        startActivity(intent);

    }

    private void ViewById(){
        editTextGSM = findViewById(R.id.editText_GSM);
        editTextCotton = findViewById(R.id.editText_Cotton);
        editTextPolyester = findViewById(R.id.editText_Polyester);
        editTextAmount = findViewById(R.id.editText_Amount);
        spinnerColor = findViewById(R.id.spinner_Color);
    }
}
