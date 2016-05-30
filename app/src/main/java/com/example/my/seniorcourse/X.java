package com.example.my.seniorcourse;

import android.app.Activity;
import android.view.View;

import java.lang.reflect.Field;

/**
 * Created by my on 2016/5/30.
 */
public class X  {
    public static void bind(Activity activity){
        Class<? extends Activity> aClass = activity.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();

        for (int i = 0; i <declaredFields.length ; i++) {
            BindView annotation = declaredFields[i].getAnnotation(BindView.class);
            if (annotation!=null){
                int id = annotation.value();
                View view = activity.findViewById(id);
                try {
                    declaredFields[i].set(activity,view);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
