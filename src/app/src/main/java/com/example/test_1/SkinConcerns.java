package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.os.Bundle;

public class SkinConcerns extends AppCompatActivity {

    RadioButton rb1,rb2,rb3,rb4;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_concerns);

        rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton)findViewById(R.id.rb2);
        rb3=(RadioButton)findViewById(R.id.rb3);
        rb4=(RadioButton)findViewById(R.id.rb4);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);

        b2.setOnClickListener(new View.OnClickListener()
        {   @Override
        public void onClick(View v)
        {
            if(rb1.isChecked())
            {   Intent i1 = new Intent(getApplicationContext(), Hyperpigmentation.class);
                startActivity(i1);
            }
            else if(rb2.isChecked())
            {   Intent i1 = new Intent(getApplicationContext(), Acne.class);
                startActivity(i1);
            }
            else if(rb3.isChecked())
            {   Intent i1 = new Intent(getApplicationContext(), DullSkin.class);
                startActivity(i1);
            }
            else if(rb4.isChecked())
            {   Intent i1 = new Intent(getApplicationContext(), TexturedSkin.class);
                startActivity(i1);
            }
            else {
                Toast.makeText(SkinConcerns.this, "Choose any one skin concern", Toast.LENGTH_SHORT).show();
            }
        }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
            }
        });

    }
}