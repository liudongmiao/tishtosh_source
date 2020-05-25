package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.EnableH264HWDecoder */
public final class EnableH264HWDecoder {
    @C10179b
    private static final boolean DEFAULT = false;
    public static final EnableH264HWDecoder INSTANCE = new EnableH264HWDecoder();

    private EnableH264HWDecoder() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean enable() {
        return C10193n.m20607a().mo18204a(EnableH264HWDecoder.class, "enable_h264_hw_decoder", C10181b.m20511a().mo18175c().getEnableH264HwDecoder(), false);
    }
}
