package com.alvesgleibson.mycalendar;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.alvesgleibson.mycalendar.helper.DateCustom;

public class MainActivity extends AppCompatActivity {
    private TextView viewText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewText = findViewById(R.id.txtDataExibir);

        //Irá setar logo ao execultar o programa a data atual;
        viewText.setText(DateCustom.dateShowUser());
        Toast.makeText(this, "Data Selecionada Firebase: "+DateCustom.dateFirebase(2), Toast.LENGTH_SHORT).show();
    }


    public void beforeClick(View view){

        Toast.makeText(this, "Data Selecionada Firebase: "+DateCustom.dateFirebase(0), Toast.LENGTH_SHORT).show();
        viewText.setText(DateCustom.dateShowUser());
    }

    public void afterClick(View view){

        Toast.makeText(this, "Data Selecionada Firebase: "+DateCustom.dateFirebase(1), Toast.LENGTH_SHORT).show();
        viewText.setText(DateCustom.dateShowUser());
    }

}