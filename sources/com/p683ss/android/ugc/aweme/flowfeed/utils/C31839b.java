package com.p683ss.android.ugc.aweme.flowfeed.utils;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.b */
public final class C31839b {
    /* renamed from: a */
    public static boolean m74197a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (aweme.getAwemeType() == 0 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 33 || aweme.getAwemeType() == 1 || aweme.getAwemeType() == 12 || aweme.getAwemeType() == 30 || aweme.getAwemeType() == 31 || aweme.getAwemeType() == 34 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53 || aweme.getAwemeType() == 56 || aweme.getAwemeType() == 55) {
            return true;
        }
        return false;
    }
}
