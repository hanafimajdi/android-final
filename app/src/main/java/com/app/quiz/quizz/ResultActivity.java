package com.app.quiz.quizz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
/**
 * Created by acer on 06-Apr-16.
 */
public class ResultActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView textResult = (TextView) findViewById(R.id.textResult);
        Bundle b = getIntent().getExtras();
        int score = b.getInt("score");
        textResult.setText("Votre score est " + " " + score + ". Merci pour jouer notre quiz.");
    }
    public void playagain(View o) {
        Intent intent = new Intent(this, Options.class);
        startActivity(intent);
    }
}