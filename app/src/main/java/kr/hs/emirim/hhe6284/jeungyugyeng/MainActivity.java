package kr.hs.emirim.hhe6284.jeungyugyeng;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void onClick(View view){
        switch(view.getId()){
            case R.id.button1:
                Toast.makeText(this,"작동해요". Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this,"작동해요". Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this,"작동해요". Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this,"작동해요". Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this,"작동해요". Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
