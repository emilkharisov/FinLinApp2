package com.example.f;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
     EditText login,name,password;
     RadioGroup radioGroup;
     RadioButton radioYur,radioFiz;
     User user;
     UsersRepo usersRepo;
     Button btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        radioGroup = findViewById(R.id.radioGroup2);
        radioFiz = findViewById(R.id.radioFiz);
        radioYur = findViewById(R.id.radioYur);
        btnSignUp = findViewById(R.id.btnSignUp);
        user = new User();
        usersRepo = new UsersRepo();
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radioFiz:
                if (checked){
                 user.setBussines(1);
                }
                break;
            case R.id.radioYur:
                if (checked){
                  user.setBussines(0);
                }
                break;
        }
    }
    public void btnSignUpListener(View view){
       if(login.getText().equals("")  || name.getText().equals("") || password.getText().equals("")){
           Toast toast2 = Toast.makeText(getApplicationContext(),"Error!!! Empty lines!!",Toast.LENGTH_SHORT);
           toast2.show();
       }
       else {
           user.setName(name.getText().toString());
           user.setLogin(name.getText().toString());
           user.setPassword(name.getText().toString());
           usersRepo.usersRepo.add(user);
       }
    }
}