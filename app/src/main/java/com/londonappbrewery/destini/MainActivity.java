package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView StoryView;
    private Button TopButton;
    private Button DownButton;

    // TODO: Steps 4 & 8 - Declare member variables here:


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        StoryView = (TextView)findViewById(R.id.storyTextView);
        TopButton= (Button)findViewById(R.id.buttonTop);
        DownButton=(Button)findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        TopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Story1();
            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        DownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Story2();
            }
        });

        }
    void Story1(){
        StoryView.setText(R.string.T3_Story);
        TopButton.setText(R.string.T3_Ans1);
        DownButton.setText(R.string.T3_Ans2);
        TopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TopButton.setVisibility(View.INVISIBLE);
                DownButton.setVisibility(View.INVISIBLE);
                StoryView.setText(R.string.T6_End);
            }
        });
        DownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StoryView.setText(R.string.T5_End);
                TopButton.setVisibility(View.INVISIBLE);
                DownButton.setVisibility(View.INVISIBLE);
            }
        });

    }
    void Story2(){
        StoryView.setText(R.string.T2_Story);
        TopButton.setText(R.string.T2_Ans1);
        DownButton.setText(R.string.T2_Ans2);

        TopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Story3();
            }
        });
        DownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StoryView.setText(R.string.T4_End);
                TopButton.setVisibility(View.INVISIBLE);
                DownButton.setVisibility(View.INVISIBLE);
            }
        });

    }
    void Story3(){
        StoryView.setText(R.string.T3_Story);
        TopButton.setText(R.string.T3_Ans1);
        DownButton.setText(R.string.T3_Ans2);
        TopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StoryView.setText(R.string.T6_End);
                TopButton.setVisibility(View.INVISIBLE);
                DownButton.setVisibility(View.INVISIBLE);
            }
        });
        DownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StoryView.setText(R.string.T5_End);
                TopButton.setVisibility(View.INVISIBLE);
                DownButton.setVisibility(View.INVISIBLE);
            }
        });

    }
}
