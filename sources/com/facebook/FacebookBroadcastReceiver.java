package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.internal.C14353v;

public class FacebookBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        String stringExtra2 = intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
        if (stringExtra != null && stringExtra2 != null) {
            intent.getExtras();
            C14353v.m29448e(intent);
        }
    }
}
