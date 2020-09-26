package assignment1.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class VrActivity extends AppCompatActivity {

    protected void onStart()
    {
        super.onStart();
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.vra);
        TextView textView = new TextView(this);
        textView.setText("\n\n onStart executed\n");

        relativeLayout.addView(textView);
        Toast.makeText(this, "OnStart started",  Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vractivity);
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.vra);
        TextView textView = new TextView(this);
        textView.setText("VRActivity:\n onCreate executed\n");
        relativeLayout.addView(textView);
        Toast.makeText(this, "OnCreate started",  Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onStop() {
        super.onStop();
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.vra);
        TextView textView = new TextView(this);
        textView.setText("onStop executed\n");
        Toast.makeText(this, "OnStop started",  Toast.LENGTH_SHORT).show();
        relativeLayout.addView(textView);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.vra);
        TextView textView = new TextView(this);
        textView.setText("onDestroy executed\n");
        Toast.makeText(this, "OnDestroy started",  Toast.LENGTH_SHORT).show();
        relativeLayout.addView(textView);
    }
}