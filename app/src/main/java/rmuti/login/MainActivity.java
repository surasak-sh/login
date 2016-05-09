package rmuti.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnLogin = (Button)findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("test", "click em..");

                EditText editText = (EditText) findViewById(R.id.editText);
                String message = editText.getText().toString();
                Log.v("test", message);

                EditText editText2 = (EditText) findViewById(R.id.editText2);
                String password = editText2.getText().toString();
                Log.v("test", password);

                if (message.equals(password)) {
                    Log.v("test", "same value");
                } else {
                    Log.v("test", "difference value");
                }
            }
        });


    }
}
