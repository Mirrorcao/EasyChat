package cn.com.caobin.easychat.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import cn.com.caobin.easychat.R;

/**
 * Created by Caobin on 2015/7/2.
 */
public class HomeUI extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.ui_home);
    }
}
