package com.example.dialogfragment02;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.DialogFragment;

public class Fragment1 extends DialogFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.dialogfragment,container,false);
        Dialog dialog = getDialog();
        dialog.setTitle("Moj tytuł");
        setCancelable(false);
        Button buttonTAK = (Button) view.findViewById(R.id.buttonTAK);
        buttonTAK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return view;
    }


}
