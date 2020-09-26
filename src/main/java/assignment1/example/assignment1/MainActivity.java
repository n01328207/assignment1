package assignment1.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private bottomfragment fragment;
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = (bottomfragment)getSupportFragmentManager().findFragmentById(R.id.displayfragment);
        this.message ="Main Activity:\nonCreate executed\n";

        fragment.display(message);
    }

    //    @Override
    protected void onStart() {
        super.onStart();
        this.message += "onStart executed";
        fragment.display(this.message);
    }


}