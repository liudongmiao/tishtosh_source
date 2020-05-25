package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.FastImport720pHigherLimitedFps */
public final class FastImport720pHigherLimitedFps {
    @C10179b
    public static final int DEFAULT = 60;
    public static final FastImport720pHigherLimitedFps INSTANCE = new FastImport720pHigherLimitedFps();

    private FastImport720pHigherLimitedFps() {
    }

    public final int getFastImport720pHigherLimitedFps() {
        return C10193n.m20607a().mo18200a(FastImport720pHigherLimitedFps.class, "fast_import_720p_higher_fps_limited", C10181b.m20511a().mo18175c().getFastImport720pHigherFpsLimited(), 60);
    }
}
