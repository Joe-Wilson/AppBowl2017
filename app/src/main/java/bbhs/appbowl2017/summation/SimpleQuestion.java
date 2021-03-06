package bbhs.appbowl2017.summation;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import bbhs.appbowl2017.R;

public class SimpleQuestion extends Question {

    private String question;
    private String[] answers;
    private int correctAnswer;
    private Button[] answerButtons = new Button[4];
    private TextView text;
    private int imageResId = 0;

    protected SimpleQuestion(SummationGame game, String question, String[] answers, final int correctAnswer) {
        super(R.layout.activity_summation_simple, game);

        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    protected SimpleQuestion(SummationGame game, String question, String[] answers, final int correctAnswer, int imageResId) {
        this(game, question, answers, correctAnswer);
        this.imageResId = imageResId;
    }

    public void initiate() {
        game.setContentView(layoutResID);

        if (imageResId != 0)
            ((ImageView) game.findViewById(R.id.image)).setImageResource(imageResId);

        answerButtons[0] = (Button) game.findViewById(R.id.answer1);
        answerButtons[1] = (Button) game.findViewById(R.id.answer2);
        answerButtons[2] = (Button) game.findViewById(R.id.answer3);
        answerButtons[3] = (Button) game.findViewById(R.id.answer4);

        text = (TextView) game.findViewById(R.id.title);
        text.setText(question);

        for (int i = 0; i < answerButtons.length; i++) {
            setupButton(answerButtons[i], answers[i], i);
        }
    }
    
    private void setupButton(Button button, String text, final int buttonIndex) {
        button.setText(text);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                game.onAnswered(correctAnswer == buttonIndex);
            }
        });
    }
}
