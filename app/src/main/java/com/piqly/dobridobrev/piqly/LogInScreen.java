package com.piqly.dobridobrev.piqly;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LogInScreen extends Activity {
    private Button submitButton;
    private EditText username;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_screen);
        setUpVariables();
    }

    public void submitClick(View v){
        Toast.makeText(this, username.getText().toString(), Toast.LENGTH_LONG).show();
    }

    private void setUpVariables(){
        username = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
        submitButton = (Button) findViewById(R.id.log_in_button);
    }
}
