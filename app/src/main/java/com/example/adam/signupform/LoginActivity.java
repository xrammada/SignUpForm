package com.example.adam.signupform;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";

    Button mSubmitButton;
    EditText mUsernameInput;
    EditText mPasswordInput;
    EditText mConfirmInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mSubmitButton = (Button)findViewById(R.id.Submit_Button);
        mUsernameInput = (EditText)findViewById(R.id.username_EditText);
        mPasswordInput = (EditText)findViewById(R.id.password_EditText);
        mConfirmInput = (EditText)findViewById(R.id.password_confirm_EditText);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mUsernameInput.getText().toString();
                String password = mPasswordInput.getText().toString();
                String confirmation = mConfirmInput.getText().toString();

                if (password.equals(confirmation)) {
                    Log.d(TAG, "Password Success!!!");
                    User newUser = new User(username, password);

                    Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                    i.putExtra(HomeActivity.EXTRA, newUser);
                    startActivity(i);

                }


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
