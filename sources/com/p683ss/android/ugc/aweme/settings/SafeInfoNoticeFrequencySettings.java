package com.p683ss.android.ugc.aweme.settings;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.settings.SafeInfoNoticeFrequencySettings */
public final class SafeInfoNoticeFrequencySettings {
    public static final SafeInfoNoticeFrequencySettings INSTANCE = new SafeInfoNoticeFrequencySettings();
    @C10179b
    private static final long SAFE_INFO_NOTICE_FREQUENCY = SAFE_INFO_NOTICE_FREQUENCY;

    private SafeInfoNoticeFrequencySettings() {
    }

    public final long getSAFE_INFO_NOTICE_FREQUENCY() {
        return SAFE_INFO_NOTICE_FREQUENCY;
    }
}
