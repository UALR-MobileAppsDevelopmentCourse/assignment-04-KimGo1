package com.ualr.resources;

import android.content.Context;

public class Utils {
    public static int getColorValue(Context context, int colorResourceId) {
        return context.getApplicationContext().getResources().getColor(colorResourceId);
    }
}
