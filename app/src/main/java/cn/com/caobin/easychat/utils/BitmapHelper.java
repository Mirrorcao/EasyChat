package cn.com.caobin.easychat.utils;

import com.lidroid.xutils.BitmapUtils;

import android.view.View;


public class BitmapHelper
{
	private static BitmapUtils	utils;

	static
	{
		utils = new BitmapUtils(UIUtils.getContext());
	}

	public static <T extends View> void display(T container, String uri)
	{
		utils.display(container, uri);
	}
}
