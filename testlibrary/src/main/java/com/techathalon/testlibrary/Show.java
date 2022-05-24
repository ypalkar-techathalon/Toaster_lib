package com.techathalon.testlibrary;

import android.content.Context;
import android.widget.Toast;

public class Show {
    public static void showToast(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
