package com.example.yeniactivity.fragments;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.yeniactivity.R;


public class HomeFragment extends Fragment {
    EditText userWeightEt;
    EditText userLengthtEt;
    TextView userResultTv;
    Button calculatebtn;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home,container,false);

        userWeightEt=(EditText)view.findViewById(R.id.et_weight);
        userLengthtEt=(EditText)view.findViewById(R.id.et_height);
        userResultTv=(TextView)view.findViewById(R.id.tv_text);

        calculatebtn=(Button)view.findViewById(R.id.btn_calculate);
        calculatebtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                calculate();
            }
        });
        return view;



    }
    private void calculate(){
        if(userWeightEt.getText().toString().length()>0 && userLengthtEt.getText().toString().length()>0){
            float userWeight=Float.parseFloat(userWeightEt.getText().toString());
            float userLenght=Float.parseFloat(userLengthtEt.getText().toString());
            if(userLenght>0){
                userLenght=userLenght/100;
                float result=(userWeight)/(userLenght*userLenght);
                String resultDescription="";

                if(result<15){
                    resultDescription="Aşırı Zayıf";
                }else if(result>15 && result <=30){
                    resultDescription="Zayıf";
                }else if(result>30 && result<=40){
                    resultDescription="Normal";
                }else{
                    resultDescription="Aşırı Şişman(Morbid Obez)";
                }

                userResultTv.setText("Vücut Kitle Endexsiniz:"+result+"\n"+resultDescription);
            }

        }
        else{
            final AlertDialog.Builder builder=new AlertDialog.Builder(getContext());
            builder.setTitle("Hata!");
            builder.setMessage("Kilo ya da boy boş bırakılamaz.");
//            builder.setNegativeButton("TAMAM", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int id) {
//
//                }
//            });
            builder.show();
        }
    }


}
