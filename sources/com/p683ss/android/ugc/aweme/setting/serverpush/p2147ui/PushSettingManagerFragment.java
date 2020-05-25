package com.p683ss.android.ugc.aweme.setting.serverpush.p2147ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.setting.Divider;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1807im.C33205o;
import com.p683ss.android.ugc.aweme.p1807im.IMInnerNotificationExperiment;
import com.p683ss.android.ugc.aweme.setting.p2132ab.InAppPushLiveExperiment;
import com.p683ss.android.ugc.aweme.setting.p2141j.C41629b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41692a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41693b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41700e;
import com.p683ss.android.ugc.aweme.setting.services.C41712a;
import com.p683ss.android.ugc.aweme.setting.services.C41714c;
import com.p683ss.android.ugc.aweme.utils.C47818dm;
import com.p683ss.android.ugc.aweme.utils.C47819dn;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragment */
public class PushSettingManagerFragment extends C23526a implements C41692a, C41693b {

    /* renamed from: a */
    C41700e f105536a;

    /* renamed from: b */
    private List<CommonItemView> f105537b = new ArrayList();
    ImageView backBtn;

    /* renamed from: c */
    private List<String> f105538c;
    Divider interactionDivider;
    Divider interactionDividerWithoutLine;
    CommonItemView itemInnerPushIm;
    CommonItemView itemInnerPushLive;
    CommonItemView itemOther;
    CommonItemView itemOuterPushIm;
    CommonItemView itemPushComment;
    CommonItemView itemPushDig;
    CommonItemView itemPushFollow;
    CommonItemView itemPushFollowNewVideo;
    CommonItemView itemPushLive;
    CommonItemView itemPushMain;
    CommonItemView itemPushMention;
    CommonItemView itemPushRecommendVideo;
    Divider liveDivider;
    LinearLayout mPushItemParent;
    TextView mTitle;
    Divider messageDivider;
    Divider otherDivider;
    Divider pushDivider;

    /* renamed from: e_ */
    public final void mo55285e_(Exception exc) {
    }

    /* renamed from: g */
    public final void mo55287g() {
    }

    /* renamed from: l */
    public final void mo55288l() {
        C10691a.m21542b(C11010c.m22280a(), (int) R.string.cfw).mo19066a();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f105536a.mo46991S_();
    }

    /* renamed from: a */
    private void m91564a() {
        String str;
        boolean a = C47818dm.m103457a(getContext());
        if (a) {
            str = getString(R.string.dh4);
        } else {
            str = getString(R.string.dh3);
        }
        if (a) {
            this.itemPushMain.setVisibility(8);
            this.interactionDivider.setVisibility(8);
            this.interactionDividerWithoutLine.setVisibility(0);
        } else {
            m91568a(a);
            this.itemPushMain.setVisibility(0);
            this.interactionDivider.setVisibility(0);
            this.interactionDividerWithoutLine.setVisibility(8);
        }
        this.itemPushMain.setRightText(str);
    }

    public void onResume() {
        float f;
        super.onResume();
        m91564a();
        if (C47818dm.m103457a(getContext())) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        m91565a(this.itemPushDig, f);
        m91565a(this.itemPushComment, f);
        m91565a(this.itemPushFollow, f);
        m91565a(this.itemPushMention, f);
        m91565a(this.itemPushFollowNewVideo, f);
        m91565a(this.itemPushRecommendVideo, f);
        m91565a(this.itemPushLive, f);
        m91565a(this.itemOuterPushIm, f);
        m91565a(this.itemOther, f);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ik && getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    /* renamed from: a */
    private static void m91568a(boolean z) {
        String str;
        String str2 = "notifications_show";
        C23089d a = C23089d.m56640a();
        String str3 = "status";
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
    }

    /* renamed from: a */
    public final void mo55281a(C41686c cVar) {
        m91566a(this.itemPushDig, cVar.f105484a);
        m91566a(this.itemPushComment, cVar.f105486b);
        m91566a(this.itemPushFollow, cVar.f105487c);
        m91566a(this.itemPushMention, cVar.f105488d);
        m91566a(this.itemPushFollowNewVideo, cVar.f105491g);
        m91566a(this.itemPushRecommendVideo, cVar.f105492h);
        m91566a(this.itemPushLive, cVar.f105493i);
        m91566a(this.itemOuterPushIm, cVar.f105496l);
        m91566a(this.itemInnerPushLive, cVar.f105495k);
        m91566a(this.itemOther, cVar.f105497m);
        C23794bh.m58385K().setLiveInnerPushOpen(Integer.valueOf(cVar.f105495k));
        if (C10181b.m20511a().mo18168a(IMInnerNotificationExperiment.class, true, "im_inner_push_strategy", 31744, 0) != 0) {
            m91566a(this.itemInnerPushIm, cVar.f105498n);
            C23794bh.m58385K().setImInnerPushOpen(Integer.valueOf(cVar.f105498n));
        }
        C41714c.f105571a.updateCurrentSetting(cVar);
    }

    /* renamed from: a */
    private static void m91566a(CommonItemView commonItemView, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        commonItemView.setChecked(z);
    }

    /* renamed from: a */
    private static void m91565a(CommonItemView commonItemView, float f) {
        View findViewById = commonItemView.findViewById(R.id.cct);
        if (findViewById != null) {
            findViewById.setAlpha(f);
        }
        if (commonItemView != null) {
            commonItemView.setAlpha(f);
        }
    }

    /* renamed from: a */
    private void m91567a(final CommonItemView commonItemView, String str) {
        commonItemView.setTag(str);
        commonItemView.setOnClickListener(new OnClickListener() {

            /* renamed from: c */
            private C2180b f105542c;

            public final void onClick(View view) {
                String str;
                boolean z;
                String str2;
                String str3;
                ClickInstrumentation.onClick(view);
                if (PushSettingManagerFragment.this.isViewValid() && PushSettingManagerFragment.this.getContext() != null) {
                    String str4 = (String) commonItemView.getTag();
                    if (TextUtils.equals(str4, "live_inner_push")) {
                        if (commonItemView.mo19040c()) {
                            str3 = "off";
                        } else {
                            str3 = "on";
                        }
                        C33205o.m76301d(str3);
                        C23794bh.m58385K().setLiveInnerPushOpen(Integer.valueOf(commonItemView.mo19040c() ^ true ? 1 : 0));
                    } else if (TextUtils.equals(str4, "im_inner_push")) {
                        if (commonItemView.mo19040c()) {
                            str2 = "off";
                        } else {
                            str2 = "on";
                        }
                        C33205o.m76300c(str2);
                        C23794bh.m58385K().setImInnerPushOpen(Integer.valueOf(commonItemView.mo19040c() ^ true ? 1 : 0));
                    } else {
                        PushSettingManagerFragment pushSettingManagerFragment = PushSettingManagerFragment.this;
                        if (C47818dm.m103457a(pushSettingManagerFragment.getContext())) {
                            z = true;
                        } else {
                            C47819dn.m103465a(pushSettingManagerFragment.getContext(), true, true);
                            z = false;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    if (this.f105542c == null) {
                        this.f105542c = C2180b.m6534l();
                        this.f105542c.mo6534c(400, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C41710a<Object>(this));
                    }
                    commonItemView.setChecked(true ^ commonItemView.mo19040c());
                    this.f105542c.onNext(commonItemView);
                    if (commonItemView.mo19040c()) {
                        str = "on";
                    } else {
                        str = "off";
                    }
                    C26890h.m65011a("notification_switch", C23089d.m56640a().mo47829a("label", str4).mo47829a("to_status", str).f61491a);
                }
            }
        });
        this.f105537b.add(commonItemView);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mTitle.setText(R.string.df6);
        this.itemPushMain.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                try {
                    C47818dm.m103459b(PushSettingManagerFragment.this.getContext());
                } catch (Exception unused) {
                    PushSettingManagerFragment.this.getContext().startActivity(new Intent("android.settings.SETTINGS"));
                }
                String str2 = "notifications_click";
                C23089d a = C23089d.m56640a();
                String str3 = "status";
                if (C47818dm.m103457a(PushSettingManagerFragment.this.getContext())) {
                    str = "on";
                } else {
                    str = "off";
                }
                C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
            }
        });
        m91564a();
        m91567a(this.itemPushDig, "digg_push");
        m91567a(this.itemPushComment, "comment_push");
        m91567a(this.itemPushFollow, "follow_push");
        m91567a(this.itemPushMention, "mention_push");
        m91567a(this.itemPushFollowNewVideo, "follow_new_video_push");
        m91567a(this.itemPushRecommendVideo, "recommend_video_push");
        m91567a(this.itemPushLive, "live_push");
        m91567a(this.itemOuterPushIm, "im_push");
        m91567a(this.itemInnerPushLive, "live_inner_push");
        m91567a(this.itemOther, "other_channel");
        if (C10181b.m20511a().mo18168a(IMInnerNotificationExperiment.class, true, "im_inner_push_strategy", 31744, 0) == 0) {
            this.itemOuterPushIm.setLeftText(C11010c.m22280a().getResources().getString(R.string.d1o));
            this.itemPushLive.setLeftText(C11010c.m22280a().getResources().getString(R.string.d1w));
            this.itemInnerPushIm.setVisibility(8);
        } else {
            this.itemOuterPushIm.setLeftText(C11010c.m22280a().getResources().getString(R.string.a1s));
            this.itemPushLive.setLeftText(C11010c.m22280a().getResources().getString(R.string.a1t));
            m91567a(this.itemInnerPushIm, "im_inner_push");
            this.itemInnerPushIm.setVisibility(0);
        }
        this.itemInnerPushIm.setVisibility(8);
        if (InAppPushLiveExperiment.m91346a()) {
            this.itemInnerPushLive.setLeftText(getContext().getString(R.string.fm3));
            this.itemInnerPushLive.setVisibility(0);
        } else {
            this.itemInnerPushLive.setVisibility(8);
        }
        if (C11010c.m22292m() == 5) {
            if (this.f105538c == null) {
                this.f105538c = C41712a.f105567a.itemListForPushSetting();
            }
            if (this.f105538c != null) {
                C41629b.m91504a(this.mPushItemParent, this.f105538c);
                this.messageDivider.setVisibility(8);
                this.pushDivider.setVisibility(8);
                this.liveDivider.setVisibility(8);
            }
        }
        this.f105536a = new C41700e();
        this.f105536a.mo54800a(this);
        this.f105536a.mo44934a_(new Object[0]);
        this.mTitle.setText(R.string.dgt);
        this.itemPushMain.setLeftText(getContext().getString(R.string.dgt));
        this.interactionDivider.getTxtLeft().setText(R.string.dgx);
        this.interactionDivider.setVisibility(8);
        this.interactionDividerWithoutLine.getTxtLeft().setText(R.string.dgx);
        this.interactionDividerWithoutLine.setVisibility(0);
        this.itemPushDig.setLeftText(getContext().getString(R.string.dgy));
        this.itemPushComment.setLeftText(getContext().getString(R.string.dgu));
        this.itemPushFollow.setLeftText(getContext().getString(R.string.dgw));
        this.itemPushMention.setLeftText(getContext().getString(R.string.dh1));
        this.messageDivider.getTxtLeft().setText(R.string.dh2);
        this.itemOuterPushIm.setLeftText(getContext().getString(R.string.dgv));
        this.pushDivider.getTxtLeft().setText(R.string.dh9);
        this.itemPushFollowNewVideo.setLeftText(getContext().getString(R.string.dh_));
        this.itemPushRecommendVideo.setLeftText(getContext().getString(R.string.dha));
        this.liveDivider.getTxtLeft().setText(R.string.dgz);
        this.itemPushLive.setLeftText(getContext().getString(R.string.dh0));
        if (!C10181b.m20511a().mo18172a(OtherPushSettingsExperiment.class, true, "enable_other_push_settings", 31744, false)) {
            this.otherDivider.setVisibility(8);
            this.itemOther.setVisibility(8);
            return;
        }
        this.otherDivider.setVisibility(0);
        this.itemOther.setVisibility(0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.bu7, viewGroup, false);
    }
}
