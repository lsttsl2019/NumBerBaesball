package com.isttis2019.numberbaesball;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.Editable;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

        import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    EditText et3;

    Button btn;

    Random rnd=new Random();
    int rn1;
    int rn2;
    int rn3;

    TextView tv;
    int[] rnds;
    int[] nums;
    int num1;
    int num2;
    int num3;

    int st;
    int ball;
    int ctn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//    while(true){
//        rn1=rnd.nextInt(10);
//        rn2=rnd.nextInt(10);
//        rn3=rnd.nextInt(10);
//        if(rn1!=rn2 && rn1!=rn3 && rn2!=rn3){
//            break;
//        }
//
//    }
//    //랜덤한 컴퓨터 숫자 완료.


//    //xml에서 값 가져오기
//    et1=findViewById(R.id.num1);
//    et2=findViewById(R.id.num2);
//    et3=findViewById(R.id.num3);
//
//    btn=findViewById(R.id.btn);
//
//    tv=findViewById(R.id.tv);


//
//        rnds=new int[3];
//        rnds[0]=rn1;
//        rnds[1]=rn2;
//        rnds[2]=rn3;
//
//        nums=new int[3];
//        nums[0]=num1;
//        nums[1]=num2;
//        nums[2]=num3;
//
//
//        for(int i=0; i<3; i++)
//            for (int j = 0; j < 3; j++) {
//                if (rnds[i] == nums[j] && i == j) {
//                    st++;
//                }
//                if (rnds[i] == nums[j] && i != j) {
//                    ball++;
//                }
//            }
//
//
//        if(st==3){
//            tv.setText("3스트라이크 정답 ");
//
//        }
//        tv.setText(st+"스트라크  "+ ball+"볼입니다.");
//        if(ctn== 9){
//            tv.setText(ctn+"이상 못찾아서 실패하였습니다");
//        }




        //버튼에 리스너 붙여주기
//
//     btn.setOnClickListener(new View.OnClickListener() {
//         @Override
//             public void onClick(View v) {
//
//             //가져온 값을 인트형으로 변환시켜주기
//             Editable editable1 =et1.getText();
//             String str1=editable1.toString();
//             //가져온 str int로 변환
//             num1=Integer.parseInt(str1);
//             Editable editable2= et2.getText();
//             String str2=editable2.toString();
//             num2=Integer.parseInt(str2);
//
//             Editable edit4= et3.getText();
//             String str3=edit4.toString();
//             num3=Integer.parseInt(str3);
//
//
//
//
//
//
//         }
//     });








    }

    public void clcikBtn(View view) {
    }
}






















