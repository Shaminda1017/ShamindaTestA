package shaminda.abeysekara.s301056885;
//Shaminda_Abeysekara_301056885_002

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ShamindaActivity extends AppCompatActivity {
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonConfirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.shamindaUsername);
        editTextPassword = findViewById(R.id.shamindaPassword);
        buttonConfirm = findViewById(R.id.shamindaSighIn);

        editTextUsername.addTextChangedListener(loginTextWatcher);
        editTextPassword.addTextChangedListener(loginTextWatcher);

        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLocalNewActivity = new Intent (ShamindaActivity.this, AbeysekaraActivity.class);
                startActivity(intentLocalNewActivity);
            }
        });

    }

    private TextWatcher loginTextWatcher = new TextWatcher()
    {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        String usernameInput = editTextUsername.getText().toString().trim();
        String passwordInput = editTextUsername.getText().toString().trim();

        buttonConfirm.setEnabled(!usernameInput.isEmpty() && !passwordInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };


}