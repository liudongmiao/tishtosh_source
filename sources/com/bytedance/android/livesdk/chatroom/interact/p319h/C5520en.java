package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.event.C5199r;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.p269aa.C4495a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.en */
final /* synthetic */ class C5520en implements C1710e {

    /* renamed from: a */
    private final C5511eg f14565a;

    C5520en(C5511eg egVar) {
        this.f14565a = egVar;
    }

    public final void accept(Object obj) {
        C5511eg egVar = this.f14565a;
        egVar.mo11751c((Throwable) obj);
        egVar.f14545d = false;
        if (egVar.f14551j) {
            if (egVar.f14555n != null) {
                egVar.f14555n.mo11431d();
            }
            C4639e.m11122a().mo10414a(Integer.valueOf(0));
            egVar.f14556o.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(8));
            C4495a.m10823a().mo10301a((Object) new C5199r(1));
        } else if (egVar.f14555n != null) {
            egVar.f14555n.mo11432e();
        }
    }
}
