package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.gr */
public final class C7989gr implements C2888b<C7875co> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7875co coVar = new C7875co();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        coVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        coVar.f21820a = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        coVar.f21821b = C2896h.m8231b(gVar);
                        break;
                    case 4:
                        coVar.f21822c = C2896h.m8231b(gVar);
                        break;
                    case 5:
                        coVar.f21823d = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return coVar;
            }
        }
    }
}
