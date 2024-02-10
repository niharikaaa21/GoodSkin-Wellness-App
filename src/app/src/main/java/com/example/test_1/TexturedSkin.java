package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class TexturedSkin extends AppCompatActivity {
    Button b1,b2;
    TextView tv11,tv9,tv15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textured_skin);

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
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nykaa.com/the-ordinary-aha-30percent-bha-2percent-peeling-solution/p/12225204?productId=12225204&pps=2&skuId=10241636"));
            Intent browserChooserIntent = Intent.createChooser(browserIntent , "Choose browser of your choice");
            startActivity(browserChooserIntent );
        }
        });

        tv9.setOnClickListener(new View.OnClickListener()
        {   @Override
        public void onClick(View v) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nykaa.com/minimalist-niacinamide-10-serum/p/1067995?productId=1067995&pps=2"));
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