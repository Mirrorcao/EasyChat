package cn.com.caobin.easychat.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import cn.com.caobin.easychat.R;
import cn.com.caobin.easychat.entity.Constant;
import cn.com.caobin.easychat.utils.SPUtils;
import cn.com.caobin.easychat.utils.UIUtils;

public class WelcomeUI extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_welcome);

        skip();


    }

    /**
     * 跳转页面
     */
    private void skip() {

       boolean isFirstTime = (boolean) SPUtils.get(UIUtils.getContext(), Constant.FIRST_TIME,Boolean.class);
        if(isFirstTime) {
            Intent intent = new Intent(this, GuideUI.class);
        }

    }


}
