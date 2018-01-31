package com.example.ian.coolcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnDoubleTapListener,
GestureDetector.OnGestureListener{
    private TextView visualText, resultText;
    private EditText number1,number2;
    private Button myButton;
    private int num1, num2;
    private GestureDetector myGesture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visualText = (TextView) findViewById(R.id.visualText);
        resultText = (TextView) findViewById(R.id.resultText);
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        myButton = (Button) findViewById(R.id.myButton);
        this.myGesture = new GestureDetector(this, this);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button Tapped", Toast.LENGTH_SHORT).show();
                visualText.setText("The SUM is: \t");
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                int sum = num1 + num2;
                resultText.setText(Integer.toString(sum));
            }
        });


    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.myGesture.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        Toast.makeText(this, "Button DoubleTapped", Toast.LENGTH_SHORT).show();
        visualText.setText("The MINUS is: ");
        num1 = Integer.parseInt(number1.getText().toString());
        num2 = Integer.parseInt(number2.getText().toString());
        int minus = num1 - num2;
        resultText.setText(Integer.toString(minus));
        return true;

    }


        @Override
        public boolean onDoubleTapEvent (MotionEvent motionEvent){
            Toast.makeText(this, "Button DoubleTapped", Toast.LENGTH_SHORT).show();
            visualText.setText("The MINUS is: ");
            num1 = Integer.parseInt(number1.getText().toString());
            num2 = Integer.parseInt(number2.getText().toString());
            int minus = num1 - num2;
            resultText.setText(Integer.toString(minus));
            return true;
        }


    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }
}
