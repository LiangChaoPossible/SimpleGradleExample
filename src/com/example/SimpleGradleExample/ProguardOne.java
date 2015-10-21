/*
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package com.example.SimpleGradleExample;

import android.util.Log;

/**
 * Created by liangchao04 on 15/10/10.
 * 目的检验混淆。如果这个类被混淆，说明混淆成功
 */
public class ProguardOne {

    public void printXXX() {
        Log.w("XXX", "print xxx");
    }
}
