package com.p683ss.android.ugc.aweme.privacychecker.impl.fake;

import android.app.Application;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.privacychecker.api.PrivacyCheckerService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.privacychecker.impl.fake.PrivacyCheckerServiceImpl */
public class PrivacyCheckerServiceImpl implements PrivacyCheckerService {
    public void enableLog(boolean z) {
    }

    public void init(Application application, String str, Callable<String> callable, Callable<String> callable2, Callable<String> callable3, Callable<String> callable4, Callable<String> callable5) {
    }

    public boolean isLogEnabled() {
        return false;
    }

    public static PrivacyCheckerService createPrivacyCheckerServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(PrivacyCheckerService.class);
        if (a != null) {
            return (PrivacyCheckerService) a;
        }
        if (C27991b.f73494ay == null) {
            synchronized (PrivacyCheckerService.class) {
                if (C27991b.f73494ay == null) {
                    C27991b.f73494ay = new PrivacyCheckerServiceImpl();
                }
            }
        }
        return (PrivacyCheckerServiceImpl) C27991b.f73494ay;
    }
}
