package es.iessaladillo.ismaelraqi.primeraaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txt_name;
    private EditText txt_surname;
    private Button btn_greetings;
    private CheckBox checkbox_kindly;
    TextView lbl_response;
    private Button btn_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    protected void initViews(){
       txt_name = findViewById(R.id.txt_name);
       txt_surname = findViewById(R.id.txt_surname);
       btn_greetings = findViewById(R.id.btn_greetings);
       btn_reset = findViewById(R.id.btn_reset);
       checkbox_kindly = findViewById(R.id.checkbox_kindly);
       lbl_response = findViewById(R.id.lbl_response);

       btn_greetings.setOnClickListener(this);
       btn_reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == btn_greetings.getId()){
            greetings();
        }else{
            reset();
        }
    }

    private void greetings(){
        if (!checkbox_kindly.isChecked()){
            lbl_response.setText(getString(R.string.greeting1, txt_name.getText().toString(),
                    txt_surname.getText().toString()));
        }else{
            lbl_response.setText(getString(R.string.greeting2, txt_name.getText().toString(),
                    txt_surname.getText().toString()));
        }
    }
    private void reset(){
        txt_name.setText("");
        txt_surname.setText("");
        lbl_response.setText("");
        checkbox_kindly.setChecked(false);
    }
}

