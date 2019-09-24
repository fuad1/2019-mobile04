package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView usernameTeks;
    private TextView nameTeks;
    private TextView ageTeks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);
        usernameTeks = findViewById(R.id.text_username);
        nameTeks = findViewById(R.id.text_name);
        ageTeks = findViewById(R.id.text_age);

        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            usernameTeks.setText(extras.getString("username"));
            nameTeks.setText(extras.getString("name"));
            ageTeks.setText(String.valueOf(getIntent().getIntExtra("age",0)));
        }
    }
}