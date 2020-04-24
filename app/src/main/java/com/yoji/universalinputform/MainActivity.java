package com.yoji.universalinputform;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttons();
    }

    public void buttons (){
        Button okButton = findViewById(R.id.buttonOkID);
        Button clearButton = findViewById(R.id.buttonClearID);
        final TextView subscriptionConfirmationText = findViewById(R.id.
                subscriptionConfirmationTextID);
        final EditText userNameEditText = findViewById(R.id.userNameEditTextID);
        final EditText emailEditText = findViewById(R.id.emailEditTextID);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = userNameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                @SuppressLint("StringFormatMatches") String confirmationMessage = getString
                        (R.string.subscriptionConfirmationText, userName, email);
                subscriptionConfirmationText.setText(confirmationMessage);
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userNameEditText.setText("");
                emailEditText.setText("");
            }
        });
    }
}