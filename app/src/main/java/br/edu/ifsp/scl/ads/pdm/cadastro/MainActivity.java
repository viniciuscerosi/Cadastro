package br.edu.ifsp.scl.ads.pdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText name;
    private EditText phone;
    private EditText email;
    private CheckBox checkList;
    private RadioButton masc;
    private RadioButton fem;
    private EditText city;
    private Spinner state;
    private Button btnSave;
    private Button btnClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.inputName);
        phone = findViewById(R.id.inputPhone);
        email = findViewById(R.id.inputEmail);
        checkList = findViewById(R.id.checkListEmail);
        masc = findViewById(R.id.mascRb);
        fem = findViewById(R.id.femRb);
        city = findViewById(R.id.inputCity);
        state = findViewById(R.id.opcoesSp);
        btnSave = findViewById(R.id.btnSave);
        btnClear = findViewById(R.id.btnClear);
        btnSave.setOnClickListener(this);
        btnClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        StringBuilder sb = new StringBuilder();
        sb.append(name.getText().toString());
        sb.append("\n");
        sb.append(phone.getText().toString());
        sb.append("\n");
        sb.append(email.getText().toString());
        sb.append("\n");
        sb.append(city.getText().toString());
        sb.append("\n");
        sb.append(masc.isChecked() ? "Masculino" : "Feminino");
        sb.append("\n");
        sb.append(checkList.isChecked() ? "Entrar na lista de email" : "Não entrar na lista de email");
        sb.append("\n");
        sb.append(((TextView) state.getSelectedView()).getText());


        if(v.getId() == R.id.btnSave){
            Toast.makeText(this, sb.toString() , Toast.LENGTH_LONG).show();
        }
        if(v.getId() == R.id.btnClear){
            Toast.makeText(this,"Limpando", Toast.LENGTH_SHORT).show();
            limparCampos();
        }
    }

    private void limparCampos() {
        name.setText("");
        phone.setText("");
        email.setText("");
        city.setText("");

    }
}