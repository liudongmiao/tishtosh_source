package com.google.android.gms.analytics.p1031a;

import com.google.android.gms.analytics.C15096j;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.analytics.a.a */
public final class C15085a {

    /* renamed from: a */
    private Map<String, String> f38945a = new HashMap();

    /* renamed from: a */
    public final Map<String, String> mo27822a(String str) {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f38945a.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf((String) entry.getKey());
            hashMap.put(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), (String) entry.getValue());
        }
        return hashMap;
    }

    public final String toString() {
        return C15096j.m31260a((Map) this.f38945a);
    }
}
