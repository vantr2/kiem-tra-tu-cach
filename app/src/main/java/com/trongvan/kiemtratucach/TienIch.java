package com.trongvan.kiemtratucach;

import android.util.Log;

import java.util.Random;

public class TienIch {
    private int[] mangSoNguyen;

    public void khoitaoMangTuyY(){
        mangSoNguyen = new int[101];
        for (int i = 0; i < mangSoNguyen.length; i++) {
            mangSoNguyen[i] = -100 + new Random().nextInt(100); // cho trong khoảng (-100,100)
        }
    }

    public void inMang(){
        for (int i = 0; i < mangSoNguyen.length;i++){
            Log.e(MainActivity.TAG,"Phần tử thư " + i + ": " +  mangSoNguyen[i]);
        }
    }

    public boolean NotInClass(int n){
        for (int i = 0; i < mangSoNguyen.length; i++) {
            if(n == mangSoNguyen[i]){
                return false;
            }
        }
        return true;
    }
}