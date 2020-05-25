package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKNotesArray */
public class VKNotesArray extends VKList<VKApiNote> {
    public static Creator<VKNotesArray> CREATOR = new Creator<VKNotesArray>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKNotesArray[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKNotesArray(parcel);
        }
    };

    public VKNotesArray() {
    }

    public VKNotesArray(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public final VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
        mo109353a(jSONObject, VKApiNote.class);
        return this;
    }
}
