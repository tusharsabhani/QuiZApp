package com.example.android.quizapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        String valueReceived1 = bundle.getString("key");

        TextView name = findViewById(R.id.name);
        name.setText(valueReceived1);
    }

    int score = 0;

    //to check if the correct answer is selected for first five questions
    public void onButtonClicked(View view){
        score = 0;
        //checking correct answer for question 1
        RadioButton optionOneCorrect = findViewById(R.id.correctAnswer1);
        if(optionOneCorrect.isChecked())
            score+=1;

        //checking correct answer for question 2
        RadioButton optionTwoCorrect = findViewById(R.id.correctAnswer2);
        if(optionTwoCorrect.isChecked())
            score+=1;

        //checking correct answer for question 3
        RadioButton optionThreeCorrect = findViewById(R.id.correctAnswer3);
        if(optionThreeCorrect.isChecked())
            score+=1;

        //checking correct answer for question 4
        RadioButton optionFourCorrect = findViewById(R.id.correctAnswer4);
        if(optionFourCorrect.isChecked())
            score+=1;

        //checking correct answer for question 5
        RadioButton optionFiveCorrect = findViewById(R.id.correctAnswer5);
        if(optionFiveCorrect.isChecked())
            score+=1;

        //checking correct answer for question 6
        CheckBox optionSixA = findViewById(R.id.sixA);
        CheckBox optionSixB = findViewById(R.id.sixB);
        CheckBox optionSixC = findViewById(R.id.sixC);
        CheckBox optionSixD = findViewById(R.id.sixD);

        if(optionSixA.isChecked() && optionSixB.isChecked() && optionSixD.isChecked() && !optionSixC.isChecked())
            score+=5;

        //checking correct answer for question 7
        CheckBox optionSevenA = findViewById(R.id.sevenA);
        CheckBox optionSevenB = findViewById(R.id.sevenB);
        CheckBox optionSevenC = findViewById(R.id.sevenC);
        CheckBox optionSevenD = findViewById(R.id.sevenD);

        if(optionSevenB.isChecked() && optionSevenD.isChecked() && !optionSevenA.isChecked() && !optionSevenC.isChecked())
            score+=5;

        //checking correct answer for question 8
        CheckBox optionEightA = findViewById(R.id.eightA);
        CheckBox optionEightB = findViewById(R.id.eightB);
        CheckBox optionEightC = findViewById(R.id.eightC);
        CheckBox optionEightD = findViewById(R.id.eightD);

        if(optionEightB.isChecked() && optionEightC.isChecked() && !optionEightA.isChecked() && !optionEightD.isChecked())
            score+=5;

        //checking correct answer for question 9
        EditText answerNine = findViewById(R.id.neil);
        if(answerNine.getText().toString().toLowerCase().equals("neil armstrong"))
            score+=10;

        //checking correct answer for question 10
        EditText answerTen = findViewById(R.id.nasa);
        if(answerTen.getText().toString().toLowerCase().equals("national aeronautics and space administration"))
            score+=10;

        if(score==40)
            Toast.makeText(this, "Congrats! You scored a perfect 40", Toast.LENGTH_SHORT).show();

        else if(score<40  && score>=30)
            Toast.makeText(this, "Nicely done! You scored "+ score + "/40", Toast.LENGTH_SHORT).show();

        else if(score<30)
            Toast.makeText(this, "You need to improve \n You scored "+ score + "/40", Toast.LENGTH_SHORT).show();
    }

}
