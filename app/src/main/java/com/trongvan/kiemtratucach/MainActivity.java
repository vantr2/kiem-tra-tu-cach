package com.trongvan.kiemtratucach;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String XANH_DUONG_HEXA = "#0000ff";
    public static final String XANH_LA_HEXA = "#A3E30E";
    public static final String DO_HEXA = "#ff0000";
    public static final String TAG = "kttucach";

    private LinearLayout xla2, xduong2;

    private TienIch tienIch;
    private int ktThuTu = 1;
    private int c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
        initView();
        tienIch = new TienIch();
        tienIch.khoitaoMangTuyY();
        tienIch.inMang();
    }

    public void hieuUng(View view){
        sapXepThuTu();
        c++;
    }

    private void initView() {
        xla2 = (LinearLayout) findViewById(R.id.xla2);
        xduong2 = (LinearLayout) findViewById(R.id.xduong2);
    }

    private void sapXepThuTu() {
        if(ktThuTu == 4) {
            ktThuTu = 1;
        }
        switch (ktThuTu){
            case 1:
                xla2.setBackgroundColor(Color.parseColor(DO_HEXA));
                xduong2.setBackgroundColor(Color.parseColor(XANH_DUONG_HEXA));
                break;
            case 2:
                xla2.setBackgroundColor(Color.parseColor(DO_HEXA));
                xduong2.setBackgroundColor(Color.parseColor(DO_HEXA));
                break;
            case 3:
                xla2.setBackgroundColor(Color.parseColor(XANH_LA_HEXA));
                xduong2.setBackgroundColor(Color.parseColor(XANH_DUONG_HEXA));
                break;
        }
        ktThuTu++;
    }

    @Override
    protected void onStop() {
        if(tienIch.NotInClass(c)){
            Log.e(TAG,c + " - Có");
        }else{
            Log.e(TAG,c + " - Không");
        }
        c = 0;
        super.onStop();
    }
}
