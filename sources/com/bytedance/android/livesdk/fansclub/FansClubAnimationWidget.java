package com.bytedance.android.livesdk.fansclub;

import com.bytedance.android.livesdk.app.dataholder.C4641g;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;

public class FansClubAnimationWidget extends LiveRecyclableWidget implements C4641g<KVData> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9061a(Object obj) {
    }

    public int getLayoutId() {
        return R.layout.an2;
    }

    public void onInit(Object[] objArr) {
    }

    public void onUnload() {
    }

    public void onLoad(Object[] objArr) {
        this.dataCenter.lambda$put$1$DataCenter("data_fans_club_anim_view", this.containerView.findViewById(R.id.b5w));
    }
}
