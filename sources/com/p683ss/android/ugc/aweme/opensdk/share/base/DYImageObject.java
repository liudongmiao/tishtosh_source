package com.p683ss.android.ugc.aweme.opensdk.share.base;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.base.DYImageObject */
public class DYImageObject implements C38522a {
    private static final String TAG = "DYImageObject";
    public ArrayList<String> mImagePaths;

    public DYImageObject() {
    }

    public boolean checkArgs() {
        return true;
    }

    public int type() {
        return 2;
    }

    public void serialize(Bundle bundle) {
        bundle.putStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH", this.mImagePaths);
    }

    public DYImageObject(ArrayList<String> arrayList) {
        this.mImagePaths = new ArrayList<>();
        this.mImagePaths.addAll(arrayList);
    }

    public void unserialize(Bundle bundle) {
        this.mImagePaths = bundle.getStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH");
    }
}
