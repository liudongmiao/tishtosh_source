package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.av */
final /* synthetic */ class C42818av extends C52720t {

    /* renamed from: a */
    public static final C52771j f108254a = new C42818av();

    C42818av() {
    }

    public final String getName() {
        return "enable";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(CutVideoSpeedState.class);
    }

    public final String getSignature() {
        return "getEnable()Ljava/lang/Boolean;";
    }

    public final Object get(Object obj) {
        return ((CutVideoSpeedState) obj).getEnable();
    }
}
