package es.iessaladillo.ismaelraqi.primeraaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   // protected void onCheckboxClicked(view: View){

    protected void greetings(){

        EditText text = findViewById(R.id.txt_response);
        //Boolean flag = findViewById(R.id)

       // text.setText("%1$s %2$s %3$s",);

    }
}

