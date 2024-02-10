package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class DullSkin extends AppCompatActivity {
    Button b1,b2;
    TextView tv11,tv9,tv15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dull_skin);

        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        tv9 = (TextView)findViewById(R.id.tv9);
        tv11 = (TextView)findViewById(R.id.tv11);
        tv15 = (TextView)findViewById(R.id.tv15);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SkinConcerns.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(i);
            }
        });

        tv11.setOnClickListener(new View.OnClickListener()
        {   @Override
        public void onClick(View v) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nykaa.com/the-derma-co-10percent-vitamin-c-face-serum-with-vitamin-c-5percent-niacinamide-hyaluronic-acid/p/1498463?productId=1498463&pps=1&skuId=1498461"));
            Intent browserChooserIntent = Intent.createChooser(browserIntent , "Choose browser of your choice");
            startActivity(browserChooserIntent );
        }
        });

        tv9.setOnClickListener(new View.OnClickListener()
        {   @Override
        public void onClick(View v) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nykaa.com/l-oreal-paris-glycolic-bright-skin-brightening-serum/p/7010178?productId=7010178&pps=1&skuId=7010173"));
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