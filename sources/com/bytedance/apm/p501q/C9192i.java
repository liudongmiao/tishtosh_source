package com.bytedance.apm.p501q;

/* renamed from: com.bytedance.apm.q.i */
public final class C9192i {
    /* renamed from: a */
    public static void m18257a(String str, String str2) {
        if (!(str.length() == 0 || str2 == null || str2.length() == 0 || ((long) str2.length()) <= 3072)) {
            while (str2.length() > 3072) {
                str2 = str2.replace(str2.substring(0, 3072), "");
            }
        }
    }
}
