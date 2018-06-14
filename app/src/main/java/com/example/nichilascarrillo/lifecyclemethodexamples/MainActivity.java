package com.example.nichilascarrillo.lifecyclemethodexamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //  refrences buttons located in xml associated with this activity
    private Button newActivityButton;
    private Button finishProgramButton;

    private Intent newActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//      creates small popup at the bottom of the screen
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
//      links the variable reference to a specific UI element by id (name)
        newActivityButton = findViewById(R.id.new_activity_button);
        finishProgramButton = findViewById(R.id.Finish_Activity_Button);
//      setting intent to navigate from this activity to a different one
        newActivity = new Intent(this, SecondActivity.class);

//      methods to initiate onClickListeners for the button in the UI
        setListeners();

    }

    private void setListeners() {
//      sets listener for newActivityButton only
        newActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
//          takes our intent and tells it to use that to start a new activity
            public void onClick(View view) {
                startActivity(newActivity);
            }
        });

        finishProgramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            finish();
            }
        });


    }




    @Override
    protected void onStart() {
        super.onStart();


    }

    //
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
    }
}
