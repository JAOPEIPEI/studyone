package com.example.a2_lab.studyone_6;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.example.a2_lab.studyone_6.R.id.text_ans;
import static com.example.a2_lab.studyone_6.R.id.text_ques;
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link examFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class examFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    View myView;
    Button b = null;

    Button buttoncheck,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    TextView text_question,text_answer;
    RadioGroup mRadioGroup;
    RadioButton mRadioButton_true;
    RadioButton mRadioButton_false;
    int Quesnum[]=new int[17];

    String ans = "";
    String ans_user = "";
    int btn_index = 0;

   public examFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment examFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static examFragment newInstance(String param1, String param2) {
        examFragment fragment = new examFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    String correct = "Correct";
    String incorrect = "Incorrect";
        View.OnClickListener lis_check = new View.OnClickListener() {//Check按鈕:對答案
            @Override
            public void onClick(View v) {
                if (mRadioButton_true.isChecked()) {
                    ans_user = "True";//
                    if (ans_user.equals(ans)) {
                        text_answer.setText(correct);
                        draw(btn_index,correct);
                    } else {
                        text_answer.setText(incorrect);
                        draw(btn_index,incorrect);
                    }
                } else if (mRadioButton_false.isChecked()) {
                    ans_user = "False";//抓使用者選擇的是False
                    if (ans_user.equals(ans)) {
                        text_answer.setText(correct);
                        draw(btn_index,correct);
                    } else {
                        text_answer.setText(incorrect);
                        draw(btn_index,incorrect);
                    }
                }
            }
        };
        int text = 24;//在按鈕中畫OX
        public  void  draw(int btn_index, String ci){
            switch (btn_index){
                case 1:
                    if(ci.equals(correct)) {
                        b1.setText("O");
                        Quesnum[0]=1;
                        b1.setTextSize(text);
                    }else if(ci.equals(incorrect)){
                        b1.setText("X");
                        b1.setTextSize(text);
                    }
                    b1.setEnabled(false);
                    break;
                case 2:
                    if(ci.equals(correct)) {
                        b2.setText("O");
                        Quesnum[1]=1;
                        b2.setTextSize(text);
                    }else if(ci.equals(incorrect)){
                        b2.setText("X");
                        b2.setTextSize(text);
                    }
                    b2.setEnabled(false);
                    break;
                case 3:
                    if(ci.equals(correct)) {
                        b3.setText("O");
                        Quesnum[2]=1;
                        b3.setTextSize(text);
                    }else if(ci.equals(incorrect)){
                        b3.setText("X");
                        b3.setTextSize(text);
                    }
                    b3.setEnabled(false);
                    break;
                case 4:
                    if(ci.equals(correct)) {
                        b4.setText("O");
                        Quesnum[3]=1;
                        b4.setTextSize(text);
                    }else if(ci.equals(incorrect)){
                        b4.setText("X");
                        b4.setTextSize(text);
                    }
                    b4.setEnabled(false);
                    break;
                case 5:
                    if(ci.equals(correct)) {
                        b5.setText("O");
                        b5.setTextSize(text);
                        Quesnum[4]=1;
                    }else if(ci.equals(incorrect)){
                        b5.setText("X");
                        b5.setTextSize(text);
                    }
                    b5.setEnabled(false);
                    break;
                case 6:
                    if(ci.equals(correct)) {
                        b6.setText("O");
                        b6.setTextSize(text);
                        Quesnum[5]=1;
                    }else if(ci.equals(incorrect)){
                        b6.setText("X");
                        b6.setTextSize(text);
                    }
                    b6.setEnabled(false);
                    break;
                case 7:
                    if(ci.equals(correct)) {
                        b7.setText("O");
                        b7.setTextSize(text);
                        Quesnum[6]=1;
                    }else if(ci.equals(incorrect)){
                        b7.setText("X");
                        b7.setTextSize(text);
                    }
                    b7.setEnabled(false);
                    break;

                case 8:
                    if(ci.equals(correct)) {
                        b8.setText("O");
                        Quesnum[7]=1;
                        b8.setTextSize(text);

                    }else if(ci.equals(incorrect)){
                        b8.setText("X");
                        b8.setTextSize(text);
                    }
                    b8.setEnabled(false);
                    break;
                case 9:
                    if(ci.equals(correct)) {
                        b9.setText("O");
                        b9.setTextSize(text);
                        Quesnum[8]=1;
                    }else if(ci.equals(incorrect)){
                        b9.setText("X");
                        b9.setTextSize(text);
                    }
                    b9.setEnabled(false);
                    break;
                case 10:
                    if(ci.equals(correct)) {
                        b10.setText("O");
                        Quesnum[9]=1;
                        b10.setTextSize(text);
                    }else if(ci.equals(incorrect)){
                        b10.setText("X");
                        b10.setTextSize(text);
                    }
                    b10.setEnabled(false);
                    break;
                case 11:
                    if(ci.equals(correct)) {
                        b11.setText("O");
                        Quesnum[10]=1;
                        b11.setTextSize(text);
                    }else if(ci.equals(incorrect)){
                        b11.setText("X");
                        b11.setTextSize(text);
                    }
                    b11.setEnabled(false);
                    break;
                case 12:
                    if(ci.equals(correct)) {
                        b12.setText("O");
                        b12.setTextSize(text);
                        Quesnum[11]=1;
                    }else if(ci.equals(incorrect)){
                        b12.setText("X");
                        b12.setTextSize(text);
                    }
                    b12.setEnabled(false);
                    break;
                case 13:
                    if(ci.equals(correct)) {
                        b13.setText("O");
                        Quesnum[12]=1;
                        b13.setTextSize(text);
                    }else if(ci.equals(incorrect)){
                        b13.setText("X");
                        b13.setTextSize(text);
                    }
                    b13.setEnabled(false);
                    break;
                case 14:
                    if(ci.equals(correct)) {
                        b14.setText("O");
                        Quesnum[13]=1;
                        b14.setTextSize(text);
                    }else if(ci.equals(incorrect)){
                        b14.setText("X");
                        b14.setTextSize(text);
                    }
                    b14.setEnabled(false);
                    break;
                case 15:
                    if(ci.equals(correct)) {
                        b15.setText("O");
                        Quesnum[14]=1;
                        b15.setTextSize(text);
                    }else if(ci.equals(incorrect)){
                        b15.setText("X");
                        b15.setTextSize(text);
                    }
                    b15.setEnabled(false);
                    break;
                case 16:
                    if(ci.equals(correct)) {
                        b16.setText("O");
                        Quesnum[15]=1;
                        b16.setTextSize(text);
                    }else if(ci.equals(incorrect)){
                        b16.setText("X");
                        b16.setTextSize(text);
                    }
                    b16.setEnabled(false);
                    break;
            }
            if(Quesnum[0]==Quesnum[1]&&Quesnum[1]==Quesnum[2]&&Quesnum[2]==Quesnum[3]&&Quesnum[0]==1)//橫判斷
            {
                text_answer.setText("YOU Win!!");
                disableButtons();
            }else if(Quesnum[4]==Quesnum[5]&&Quesnum[5]==Quesnum[6]&&Quesnum[6]==Quesnum[7]&&Quesnum[4]==1) {
                text_answer.setText("YOU Win!!");
                disableButtons();
            }else if(Quesnum[8]==Quesnum[9]&&Quesnum[9]==Quesnum[10]&&Quesnum[10]==Quesnum[11]&&Quesnum[11]==1) {
                text_answer.setText("YOU Win!!");
                disableButtons();
            }else if(Quesnum[12]==Quesnum[13]&&Quesnum[13]==Quesnum[14]&&Quesnum[14]==Quesnum[15]&&Quesnum[15]==1) {
                text_answer.setText("YOU Win!!");
                disableButtons();
            }else if(Quesnum[0]==Quesnum[4]&&Quesnum[4]==Quesnum[8]&&Quesnum[8]==Quesnum[12]&&Quesnum[0]==1){//直判斷
                text_answer.setText("YOU Win!!");
                disableButtons();
            }else if(Quesnum[1]==Quesnum[5]&&Quesnum[5]==Quesnum[9]&&Quesnum[9]==Quesnum[13]&&Quesnum[1]==1) {
                text_answer.setText("YOU Win!!");
                disableButtons();
            }else if(Quesnum[2]==Quesnum[6]&&Quesnum[6]==Quesnum[10]&&Quesnum[10]==Quesnum[14]&&Quesnum[14]==1) {
                text_answer.setText("YOU Win!!");
                disableButtons();
            }else if(Quesnum[3]==Quesnum[7]&&Quesnum[7]==Quesnum[11]&&Quesnum[11]==Quesnum[15]&&Quesnum[15]==1) {
                text_answer.setText("YOU Win!!");
                disableButtons();
            }else if(Quesnum[0]==Quesnum[5]&&Quesnum[5]==Quesnum[10]&&Quesnum[10]==Quesnum[15]&&Quesnum[15]==1){//斜判斷
                text_answer.setText("YOU Win!!");
                disableButtons();
            }else if(Quesnum[3] == Quesnum[6] && Quesnum[6] == Quesnum[9] && Quesnum[9] == Quesnum[12] && Quesnum[12] == 1) {
                text_answer.setText("YOU Win!!");
                disableButtons();
            }
       }

    private void disableButtons() {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        b10.setEnabled(false);
        b11.setEnabled(false);
        b12.setEnabled(false);
        b13.setEnabled(false);
        b14.setEnabled(false);
        b15.setEnabled(false);
        b16.setEnabled(false);
    }



    View.OnClickListener buttonListener = new Button.OnClickListener() {//4X4按鈕按下呼叫對應題目
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button101:
                        text_question.setText(exam_ques.ArrayQues[0]);
                        ans = exam_ques.ArrayAns[0];
                        text_answer.setText("");//清除上一題答案畫面
                        btn_index = 1;
                        break;
                    case R.id.button102:
                        text_question.setText(exam_ques.ArrayQues[1].toString());
                        ans = exam_ques.ArrayAns[1];
                        text_answer.setText("");
                        btn_index = 2;
                        break;
                    case R.id.button103:
                        text_question.setText(exam_ques.ArrayQues[2].toString());
                        ans = exam_ques.ArrayAns[2];
                        text_answer.setText("");
                        btn_index = 3;
                        break;
                    case R.id.button104:
                        text_question.setText(exam_ques.ArrayQues[3].toString());
                        ans = exam_ques.ArrayAns[3];
                        text_answer.setText("");
                        btn_index = 4;
                        break;
                    case R.id.button105:
                        text_question.setText(exam_ques.ArrayQues[4].toString());
                        ans = exam_ques.ArrayAns[4];
                        text_answer.setText("");
                        btn_index = 5;
                        break;
                    case R.id.button106:
                        text_question.setText(exam_ques.ArrayQues[5].toString());
                        ans = exam_ques.ArrayAns[5];
                        text_answer.setText("");
                        btn_index = 6;
                        break;
                    case R.id.button107:
                        text_question.setText(exam_ques.ArrayQues[6].toString());
                        ans = exam_ques.ArrayAns[6];
                        text_answer.setText("");
                        btn_index = 7;
                        break;
                    case R.id.button108:
                        text_question.setText(exam_ques.ArrayQues[7].toString());
                        ans = exam_ques.ArrayAns[7];
                        text_answer.setText("");
                        btn_index = 8;
                        break;
                    case R.id.button109:
                        text_question.setText(exam_ques.ArrayQues[8].toString());
                        ans = exam_ques.ArrayAns[8];
                        text_answer.setText("");
                        btn_index = 9;
                        break;
                    case R.id.button110:
                        text_question.setText(exam_ques.ArrayQues[9].toString());
                        ans = exam_ques.ArrayAns[9];
                        text_answer.setText("");
                        btn_index = 10;
                        break;
                    case R.id.button111:
                        text_question.setText(exam_ques.ArrayQues[10].toString());
                        ans = exam_ques.ArrayAns[10];
                        text_answer.setText("");
                        btn_index = 11;
                        break;
                    case R.id.button112:
                        text_question.setText(exam_ques.ArrayQues[11].toString());
                        ans = exam_ques.ArrayAns[11];
                        text_answer.setText("");
                        btn_index = 12;
                        break;
                    case R.id.button113:
                        text_question.setText(exam_ques.ArrayQues[12].toString());
                        ans = exam_ques.ArrayAns[12];
                        text_answer.setText("");
                        btn_index = 13;
                        break;
                    case R.id.button114:
                        text_question.setText(exam_ques.ArrayQues[13].toString());
                        ans = exam_ques.ArrayAns[13];
                        text_answer.setText("");
                        btn_index = 14;
                        break;
                    case R.id.button115:
                        text_question.setText(exam_ques.ArrayQues[14]);
                        ans = exam_ques.ArrayAns[14];
                        text_answer.setText("");
                        btn_index = 15;
                        break;
                    case R.id.button116:
                        text_question.setText(exam_ques.ArrayQues[15]);
                        ans = exam_ques.ArrayAns[15];
                        text_answer.setText("");
                        btn_index = 16;
                        break;
                }


            }
        };
        @Override
        public void onViewCreated (View view, @Nullable Bundle savedIstanceState){
            super.onViewCreated(view, savedIstanceState);
            getActivity().setTitle("exam");
        }

        @Override
        public View onCreateView (LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState){
            // Inflate the layout for this fragment
            myView = inflater.inflate(R.layout.fragment_exam, container, false);//我的畫面
            mRadioGroup = (RadioGroup) myView.findViewById(R.id.radioGroup);
            mRadioButton_true = (RadioButton) myView.findViewById(R.id.radiobuttin_true);
            mRadioButton_false = (RadioButton) myView.findViewById(R.id.radiobutton_false);
            text_question = (TextView) myView.findViewById(text_ques);
            text_answer = (TextView) myView.findViewById(text_ans);
            buttoncheck = (Button) myView.findViewById(R.id.button_check);

            b1 = (Button) myView.findViewById(R.id.button101);//抓id
            b2 = (Button) myView.findViewById(R.id.button102);
            b3 = (Button) myView.findViewById(R.id.button103);
            b4 = (Button) myView.findViewById(R.id.button104);
            b5 = (Button) myView.findViewById(R.id.button105);
            b6 = (Button) myView.findViewById(R.id.button106);
            b7 = (Button) myView.findViewById(R.id.button107);
            b8 = (Button) myView.findViewById(R.id.button108);
            b9 = (Button) myView.findViewById(R.id.button109);
            b10 = (Button) myView.findViewById(R.id.button110);
            b11 = (Button) myView.findViewById(R.id.button111);
            b12 = (Button) myView.findViewById(R.id.button112);
            b13 = (Button) myView.findViewById(R.id.button113);
            b14 = (Button) myView.findViewById(R.id.button114);
            b15 = (Button) myView.findViewById(R.id.button115);
            b16 = (Button) myView.findViewById(R.id.button116);

            buttoncheck.setOnClickListener(lis_check);//check按鈕呼叫



            b1.setOnClickListener(buttonListener);//4X4按下呼叫題目
            b2.setOnClickListener(buttonListener);
            b3.setOnClickListener(buttonListener);
            b4.setOnClickListener(buttonListener);
            b5.setOnClickListener(buttonListener);
            b6.setOnClickListener(buttonListener);
            b7.setOnClickListener(buttonListener);
            b8.setOnClickListener(buttonListener);
            b9.setOnClickListener(buttonListener);
            b10.setOnClickListener(buttonListener);
            b11.setOnClickListener(buttonListener);
            b12.setOnClickListener(buttonListener);
            b13.setOnClickListener(buttonListener);
            b14.setOnClickListener(buttonListener);
            b15.setOnClickListener(buttonListener);
            b16.setOnClickListener(buttonListener);


            return myView;
        }



}
