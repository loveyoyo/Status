package com.pro.statusbar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/**
 * Created by MockingJay on 2019/5/15;
 * Description:
 */

public class Sofia {

    private Sofia(){

    }

    public static Bar with(Activity activity){
        Window window = activity.getWindow();
        ViewGroup contentLayout = window.getDecorView().findViewById(Window.ID_ANDROID_CONTENT);
        if(contentLayout.getChildCount() > 0){
            View contentView = contentLayout.getChildAt(0);
            if(contentView instanceof Bar){
                return (Bar) contentView;
            }
        }
        return new HostLayout(activity);
    }
}
