package cn.com.caobin.easychat.utils;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;


public class DrawableUtils
{

	public static GradientDrawable getShape(int shape, int radius, int argb)
	{
		GradientDrawable gd = new GradientDrawable();
		gd.setShape(shape);// 设置形状
		gd.setCornerRadius(radius);// 设置圆角
		gd.setColor(argb);
		return gd;
	}

	public static StateListDrawable getSelector(Drawable normalBg, Drawable pressedBg)
	{
		StateListDrawable selector = new StateListDrawable();
		selector.addState(new int[] { android.R.attr.state_pressed }, pressedBg);
		selector.addState(new int[] {}, normalBg);
		return selector;
	}
}
