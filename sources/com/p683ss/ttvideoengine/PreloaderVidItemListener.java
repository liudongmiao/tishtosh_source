package com.p683ss.ttvideoengine;

import com.p683ss.ttvideoengine.model.VideoInfo;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.ttvideoengine.PreloaderVidItemListener */
public interface PreloaderVidItemListener {
    String apiString(Map<String, String> map, String str, int i);

    String authString(String str, int i);

    void onUsingUrlInfos(List<VideoInfo> list);
}
