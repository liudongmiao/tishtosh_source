package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.utils.C47702b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.m */
final /* synthetic */ class C43635m implements OnClickListener {

    /* renamed from: a */
    private final C43535i f110533a;

    C43635m(C43535i iVar) {
        this.f110533a = iVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C43535i iVar = this.f110533a;
        iVar.f110161d.mo88448d();
        iVar.f110134C.clear();
        C47702b.f120193a.mo94984a("prop_timeset_confirm", C23089d.m56640a().mo47829a("prop_id", iVar.mo88647c()).mo47829a("creation_id", iVar.f110170m.creationId).mo47826a("draft_id", iVar.f110170m.draftId).mo47829a("content_source", iVar.f110170m.getAvetParameter().getContentSource()).mo47829a("shoot_entrance", iVar.f110170m.mShootWay).mo47829a("enter_from", iVar.f110158a ? "edit_post_page" : "video_edit_page").f61491a);
        iVar.mo88660i();
    }
}
