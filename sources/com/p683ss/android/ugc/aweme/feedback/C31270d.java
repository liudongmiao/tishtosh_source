package com.p683ss.android.ugc.aweme.feedback;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feedback.d */
final /* synthetic */ class C31270d implements OnClickListener {

    /* renamed from: a */
    private final FeedbackActivity f81941a;

    C31270d(FeedbackActivity feedbackActivity) {
        this.f81941a = feedbackActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f81941a.mo64141c();
    }
}
