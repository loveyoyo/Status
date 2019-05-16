package com.pro.statusbar;

import android.graphics.drawable.Drawable;
import android.view.View;

/**
 * Created by MockingJay on 2019/5/15;
 * Description:
 */

public interface Bar {

    Bar statusBarDarkFont();

    Bar statusBarLightFont();

    Bar statusBarBackgroundColor(int statusBarColor);

    Bar statusBarBackground(Drawable drawable);

    Bar statusBarBackgroundAlpha(int alpha);

    Bar navigationBarBackgroundColor(int navigationBarColor);

    Bar navigationBarBackground(Drawable drawable);

    Bar navigationBarBackgroundAlpha(int alpha);

    Bar invasionStatusBar();

    Bar invasionNavigationBar();

    Bar fitsSystemWindowView(int viewId);

    Bar fitsSystemWindowView(View view);

    Bar fitsStatusBarView(int viewId);

    Bar fitsStatusBarView(View view);

    Bar fitsNavigationBarView(int viewId);

    Bar fitsNavigationBarView(View view);
}
