package com.android.launcher3.util;

/**
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;

/**
 * {@link BroadcastReceiver} which watches configuration changes and
 * restarts the process in case changes which affect the device profile occur.
 */
public class ConfigMonitor extends BroadcastReceiver {


    public ConfigMonitor(Context context) {

    }

    @Override
    public void onReceive(Context context, Intent intent) {

    }

}
