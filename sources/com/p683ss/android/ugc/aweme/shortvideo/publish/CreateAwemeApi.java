package com.p683ss.android.ugc.aweme.shortvideo.publish;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import java.util.LinkedHashMap;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53073d;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeApi */
public final class CreateAwemeApi {

    /* renamed from: a */
    public static API f112263a = ((API) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(API.class));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeApi$API */
    public interface API {
        @C53084o(mo110612a = "/aweme/v1/create/aweme/")
        @C53074e
        C17832m<CreateAwemeResponse> createAweme(@C53072c(mo110600a = "material_id") String str, @C53073d LinkedHashMap<String, String> linkedHashMap);
    }
}
