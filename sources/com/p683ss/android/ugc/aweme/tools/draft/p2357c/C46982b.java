package com.p683ss.android.ugc.aweme.tools.draft.p2357c;

import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.LivePublishModel;
import com.p683ss.android.ugc.aweme.tools.draft.p2356b.C46978b;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.c.b */
public final class C46982b extends C46981a<LivePublishModel> {
    /* renamed from: b */
    public final boolean mo94274b(C29059c cVar) {
        C52711k.m112240b(cVar, "draft");
        return C46978b.m102027a(this, cVar);
    }

    /* renamed from: a */
    public final void mo94273a(C29059c cVar) {
        if (cVar != null) {
            if (this.f118686b == null) {
                this.f118686b = new ArrayList<>();
                ArrayList<C29059c> arrayList = this.f118686b;
                if (arrayList == null) {
                    C52711k.m112234a();
                }
                arrayList.add(cVar);
                return;
            }
            ArrayList<C29059c> arrayList2 = this.f118686b;
            if (arrayList2 == null) {
                C52711k.m112234a();
            }
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                long j = cVar.f76129G;
                ArrayList<C29059c> arrayList3 = this.f118686b;
                if (arrayList3 == null) {
                    C52711k.m112234a();
                }
                Object obj = arrayList3.get(i);
                if (obj == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a(obj, "drafts!![i]!!");
                if (j > ((C29059c) obj).f76129G) {
                    ArrayList<C29059c> arrayList4 = this.f118686b;
                    if (arrayList4 == null) {
                        C52711k.m112234a();
                    }
                    arrayList4.add(i, cVar);
                    return;
                }
            }
            ArrayList<C29059c> arrayList5 = this.f118686b;
            if (arrayList5 == null) {
                C52711k.m112234a();
            }
            arrayList5.add(cVar);
        }
    }
}
