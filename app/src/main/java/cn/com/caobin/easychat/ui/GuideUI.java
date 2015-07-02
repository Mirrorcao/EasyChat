package cn.com.caobin.easychat.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import cn.com.caobin.easychat.R;
import cn.com.caobin.easychat.utils.UIUtils;

/**
 * 引导界面
 * Created by Caobin on 2015/7/2.
 */
public class GuideUI extends Activity{

    private ViewPager mPager;
    private int PagerCount = 4;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {

        setContentView(R.layout.ui_guide);
        mPager = (ViewPager) findViewById(R.id.guide_pager);

    }

    class GuideAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return PagerCount;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView imageView = new ImageView(UIUtils.getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            
            return imageView;

        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            super.destroyItem(container, position, object);
        }
    }

}
