package kr.hs.emirim.hhe6284.jeungyugyeng;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG="옹아은";
    private ImageView mlmageViewFriendVisual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate 메소드 호출");
        setContentView(R.layout.activity_main);
        Log.d(TAG,"activity_main 레이아웃 세팅");
    }
    void onClick(View view) {
        Log.d(TAG,"onClick 메소드 호출");
        Log.d(TAG,"클릭된 뷰 id: "+view.getId());
        switch(view.getId()) {
            case R.id.button1:
                Log.d(TAG,"버튼1 클릭");
                Toast.makeText(this, "My name is 옹아은.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Log.d(TAG,"버튼2 클릭");
                Toast.makeText(this, "뿌엑", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Log.d(TAG,"버튼3 클릭");
                Toast.makeText(this, "하은이가 좋아하는 랜덤게임 무슨게임", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Log.d(TAG,"버튼4 클릭");
                Toast.makeText(this, "알려드립니다 지금부터 아침회화 방송을 시작하겠으니 학생들은 VCR채널을 41번으로 맞춰주시기 바랍니다", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Log.d(TAG,"버튼5 클릭");
                Toast.makeText(this, "조식이 제일맛있어", Toast.LENGTH_SHORT).show();
                break;
            default:
                Log.d(TAG,"모르는녀석 클릭");
                Toast.makeText(this, "뭐라하는거냐", Toast.LENGTH_SHORT).show();
        }
        Log.d(TAG,"onClick");
        if (view.getId()==R.id.button1)
    }
}