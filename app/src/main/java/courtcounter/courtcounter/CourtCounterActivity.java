package courtcounter.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CourtCounterActivity extends AppCompatActivity
        implements View.OnClickListener{

    private Integer Score_A;
    private Integer Score_B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_counter);

        displayA(0);
        displayB(0);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.b1_Points_A:
                displayA(1);
                break;
            case R.id.b2_Points_A:
                displayA(2);
                break;
            case R.id.b3_Points_A:
                displayA(3);
                break;
            case R.id.b1_Points_B:
                displayB(1);
                break;
            case R.id.b2_Points_B:
                displayB(2);
                break;
            case R.id.b3_Points_B:
                displayB(3);
                break;
            case R.id.Reset:
                displayA(0);
                displayB(0);
                break;
        }
    }
    public void displayA(Integer Score){
        if (Score == 0 ){
            Score_A = 0;
        }else {
            Score_A = Score_A + Score;
        }
        TextView text = (TextView)findViewById(R.id.scoreA);
        text.setText(Score_A);
    }
    public void displayB(Integer Score){
        if (Score == 0 ){
            Score_B = 0;
        }else {
            Score_B = Score_B + Score;
        }
        TextView text = (TextView)findViewById(R.id.scoreB);
        text.setText(Score_B);
    }
}
