package com.p683ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.notice.api.bean.NoticeList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.NoticeCountCombineModel */
public final class NoticeCountCombineModel extends BaseCombineMode {
    @C17952c(mo34828a = "body")
    private NoticeList noticeList;

    public static /* synthetic */ NoticeCountCombineModel copy$default(NoticeCountCombineModel noticeCountCombineModel, NoticeList noticeList2, int i, Object obj) {
        if ((i & 1) != 0) {
            noticeList2 = noticeCountCombineModel.noticeList;
        }
        return noticeCountCombineModel.copy(noticeList2);
    }

    public final NoticeList component1() {
        return this.noticeList;
    }

    public final NoticeCountCombineModel copy(NoticeList noticeList2) {
        C52711k.m112240b(noticeList2, "noticeList");
        return new NoticeCountCombineModel(noticeList2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.noticeList, (java.lang.Object) ((com.p683ss.android.ugc.aweme.requestcombine.model.NoticeCountCombineModel) r2).noticeList) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.requestcombine.model.NoticeCountCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.NoticeCountCombineModel r2 = (com.p683ss.android.ugc.aweme.requestcombine.model.NoticeCountCombineModel) r2
            com.ss.android.ugc.aweme.notice.api.bean.NoticeList r0 = r1.noticeList
            com.ss.android.ugc.aweme.notice.api.bean.NoticeList r2 = r2.noticeList
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.model.NoticeCountCombineModel.equals(java.lang.Object):boolean");
    }

    public final NoticeList getNoticeList() {
        return this.noticeList;
    }

    public final int hashCode() {
        NoticeList noticeList2 = this.noticeList;
        if (noticeList2 != null) {
            return noticeList2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoticeCountCombineModel(noticeList=");
        sb.append(this.noticeList);
        sb.append(")");
        return sb.toString();
    }

    public final void setNoticeList(NoticeList noticeList2) {
        C52711k.m112240b(noticeList2, "<set-?>");
        this.noticeList = noticeList2;
    }

    public NoticeCountCombineModel(NoticeList noticeList2) {
        C52711k.m112240b(noticeList2, "noticeList");
        this.noticeList = noticeList2;
    }
}
