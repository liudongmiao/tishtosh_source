package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.al */
public enum C16541al {
    NONE,
    BATCH_BY_SESSION,
    BATCH_BY_TIME,
    BATCH_BY_BRUTE_FORCE,
    BATCH_BY_COUNT,
    BATCH_BY_SIZE;

    public static C16541al zzz(String str) {
        if ("BATCH_BY_SESSION".equalsIgnoreCase(str)) {
            return BATCH_BY_SESSION;
        }
        if ("BATCH_BY_TIME".equalsIgnoreCase(str)) {
            return BATCH_BY_TIME;
        }
        if ("BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(str)) {
            return BATCH_BY_BRUTE_FORCE;
        }
        if ("BATCH_BY_COUNT".equalsIgnoreCase(str)) {
            return BATCH_BY_COUNT;
        }
        if ("BATCH_BY_SIZE".equalsIgnoreCase(str)) {
            return BATCH_BY_SIZE;
        }
        return NONE;
    }
}
