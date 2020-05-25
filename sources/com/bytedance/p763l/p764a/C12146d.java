package com.bytedance.p763l.p764a;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: com.bytedance.l.a.d */
public final class C12146d {
    /* renamed from: a */
    public static String m24580a(Context context, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open(str)));
        String str2 = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return str2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(readLine);
            str2 = sb.toString();
        }
    }
}
