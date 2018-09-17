package yash.week3_demo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv1 = (TextView) findViewById(R.id.tv1);

        tv1.setText("PES IO");
        tv1.setTextColor(Color.RED);

        Button bt1 = findViewById(R.id.bt_1);
        bt1.setText("Next Activity");

        final Intent i1 = new Intent(this,SecondActivity.class);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.putExtra("msg","This is a message from the first activity!");
                startActivity(i1);
            }
        });
    }
}
