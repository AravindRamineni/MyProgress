package com.aravind.myprogress;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;

public class LoadProgress extends Dialog {

    private ProgressBar mProgressBar;

    public LoadProgress(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setContentView(R.layout.load_progress);
        mProgressBar = findViewById(R.id.progressLoad);
    }

    public void showProgress(boolean tapToDismiss){
        if(tapToDismiss)
            setCancelable(true);
        else
            setCancelable(false);
        this.show();
    }

    public void hideProgress(){
        if(this.isShowing()){
            this.dismiss();
        }

    }
}
