package id.ac.umn.week04a_25471;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    private Button btnSecond, btnThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btnSecond = findViewById(R.id.main_button_change_1);
        btnThird = findViewById(R.id.main_button_change_2);

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(FirstActivity.this, SecondActivity.class
                );
                startActivity(intent2);
            }
        });

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(FirstActivity.this, ThirdActivity.class
                );
                startActivity(intent3);
            }
        });
    }
}