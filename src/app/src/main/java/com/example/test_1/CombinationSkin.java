package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class CombinationSkin extends AppCompatActivity {
    TextView tv5,tv9,tv11,tv15;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combination_skin);

        tv5 = (TextView)findViewById(R.id.tv5);
        tv9 = (TextView)findViewById(R.id.tv9);
        tv11 = (TextView)findViewById(R.id.tv11);
        tv15 = (TextView)findViewById(R.id.tv15);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),SkinConcerns.class);
                startActivity(i);
            }
        });

        tv5.setOnClickListener(new View.OnClickListener()
        {   @Override
        public void onClick(View v) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nykaa.com/cetaphil-oily-skin-cleanser/p/20992?productId=20992&pps=2"));
            Intent browserChooserIntent = Intent.createChooser(browserIntent , "Choose browser of your choice");
            startActivity(browserChooserIntent );
        }
        });

        tv9.setOnClickListener(new View.OnClickListener()
        {   @Override
        public void onClick(View v) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nykaa.com/ponds-super-light-gel-moisturiser/p/502719?productId=502719&pps=2&skuId=5526262"));
            Intent browserChooserIntent = Intent.createChooser(browserIntent , "Choose browser of your choice");
            startActivity(browserChooserIntent );
        }
        });

        tv11.setOnClickListener(new View.OnClickListener()
        {   @Override
        public void onClick(View v) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nykaa.com/aqualogica-glow-dewy-sunscreen-with-papaya-vitamin-c/p/10593377?productId=10593377&pps=1&skuId=5009759"));
            Intent browserChooserIntent = Intent.createChooser(browserIntent , "Choose browser of your choice");
            startActivity(browserChooserIntent );
        }
        });

        tv15.setOnClickListener(new View.OnClickListener()
        {   @Override
        public void onClick(View v) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nykaa.com/earth-rhythm-retinol-intense-repair-night-cream/p/7589767?productId=7589767&pps=8"));
            Intent browserChooserIntent = Intent.createChooser(browserIntent , "Choose browser of your choice");
            startActivity(browserChooserIntent );
        }
        });
    }
}