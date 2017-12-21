package com.example.jzabar7531.jordanzabarmidterm;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button commentBtn = (Button) findViewById(R.id.commentBtn);

        commentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent (MainActivity.this, Activity2.class);
                Toast.makeText(MainActivity.this,"Jordan Zabar",Toast.LENGTH_SHORT).show();
                MainActivity.this.startActivity(intent1);
            }
        });
    }

    public void process(View view)
    {
        Intent intent = null, chooser = null;

        if(view.getId() == R.id.contactBtn)
        {
            intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to ={"jzabar7531@conestogac.on.ca"};
            intent.putExtra(Intent.EXTRA_EMAIL,to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "HI");
            intent.putExtra(Intent.EXTRA_TEXT,"hey what's up");
            intent.setType("message/rfc822");
            chooser = Intent.createChooser(intent,"Send Email");
            startActivity(chooser);
        }
    }
}
