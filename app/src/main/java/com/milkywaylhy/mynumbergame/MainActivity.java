package com.milkywaylhy.mynumbergame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // 멤버화면에 보여지는 view들을 제어하는 참조변수를변수로
    TextView tv;
    Button btn;
    EditText et;


    int num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //참조변수에 객체 연결해주기..
        //XML에서 만들어진 view객체를 찾아와서 참조변수에 대입
        //액티비티 클래스 객체는 본인이 보여주는 xml의 view들을 찾을수 있는
        //기능 메소드가 이미 보유하고 있다.
        tv=findViewById(R.id.aa);
        btn=findViewById(R.id.bb);
        et=findViewById(R.id.et);

        Random rnd=new Random(499);


        //버튼이 클릭하는 것들 듣는 리스너객체를 생성 및 설정
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //EditText에 써있는 글씨를 얻어오기
                String s=et.getText().toString();

                //얻어온 글씨를 TextView에 보여주기
                tv.setText(s);

                //EditText의 글씨를 지우고 싶다면??
                et.setText("");//빈 문자열을 설정
                if(s.equals("apple")){
                    tv.setText("정답");
                }else{
                    tv.setText("오답");
                }

            }
        });




    }
}