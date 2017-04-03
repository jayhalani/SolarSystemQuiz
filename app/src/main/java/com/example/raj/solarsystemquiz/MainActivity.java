package com.example.raj.solarsystemquiz;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateScore(View view) {
        String answerEight = "Gravity";

        RadioGroup buttonGroupOne = (RadioGroup) findViewById(R.id.button_group_1);
        RadioGroup buttonGroupTwo = (RadioGroup) findViewById(R.id.button_group_2);
        RadioGroup buttonGroupThree = (RadioGroup) findViewById(R.id.button_group_3);
        RadioGroup buttonGroupFour = (RadioGroup) findViewById(R.id.button_group_4);
        RadioGroup buttonGroupFive = (RadioGroup) findViewById(R.id.button_group_5);
        RadioGroup buttonGroupSix = (RadioGroup) findViewById(R.id.button_group_6);
        RadioGroup buttonGroupSeven = (RadioGroup) findViewById(R.id.button_group_7);
        RadioGroup buttonGroupEight = (RadioGroup) findViewById(R.id.button_group_10);

        RadioButton radioButton1 = (RadioButton) findViewById(R.id.answer1);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.answer2);
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.answer3);
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.answer4);
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.answer5);
        RadioButton radioButton6 = (RadioButton) findViewById(R.id.answer6);
        RadioButton radioButton7 = (RadioButton) findViewById(R.id.answer7);
        EditText editText = (EditText) findViewById(R.id.answer8);
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.answer9_1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.answer9_2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.answer9_3);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.answer9_4);
        RadioButton radioButton8 = (RadioButton) findViewById(R.id.answer10);


        if (radioButton1.isChecked()) {
            totalScore++;
        }
        if (radioButton2.isChecked()) {
            totalScore++;
        }
        if (radioButton3.isChecked()) {
            totalScore++;
        }
        if (radioButton4.isChecked()) {
            totalScore++;
        }
        if (radioButton5.isChecked()) {
            totalScore++;
        }
        if (radioButton6.isChecked()) {
            totalScore++;
        }
        if (radioButton7.isChecked()) {
            totalScore++;
        }
        if (editText.getText().toString().equalsIgnoreCase(answerEight)) {
            totalScore++;
        }
        if (checkBox1.isChecked() && checkBox2.isChecked() && !checkBox3.isChecked() && !checkBox4.isChecked()) {
            totalScore++;
        }

        if (radioButton8.isChecked()) {
            totalScore++;
        }

        if (totalScore == 0) {
            Toast toast = Toast.makeText(getApplicationContext(), "Try again, Your score is " + totalScore + "!", Toast.LENGTH_LONG);
            toast.show();
        } else if (totalScore <= 5 && totalScore > 0) {
            Toast toast = Toast.makeText(getApplicationContext(), "Your Score is: " + totalScore, Toast.LENGTH_LONG);
            toast.show();
        } else if (totalScore <= 8 && totalScore > 5) {
            Toast toast = Toast.makeText(getApplicationContext(), "Your Score is: " + totalScore + ", Good Score!", Toast.LENGTH_LONG);
            toast.show();
        } else if (totalScore <= 10 && totalScore > 8) {
            Toast toast = Toast.makeText(getApplicationContext(), "Your Score is: " + totalScore + ". Amazing, you know so much about Solar System.", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Something went wrong, Try again.", Toast.LENGTH_LONG);
            toast.show();
        }

        buttonGroupOne.clearCheck();
        buttonGroupTwo.clearCheck();
        buttonGroupThree.clearCheck();
        buttonGroupFour.clearCheck();
        buttonGroupFive.clearCheck();
        buttonGroupSix.clearCheck();
        buttonGroupSeven.clearCheck();
        buttonGroupEight.clearCheck();
        checkBox1.setChecked(false);
        checkBox2.setChecked(false);
        checkBox3.setChecked(false);
        checkBox4.setChecked(false);
        editText.setText("");
        editText.clearFocus();
        totalScore = 0;

    }


}
