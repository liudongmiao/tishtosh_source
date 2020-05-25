package com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.i.b.b */
public enum C34384b {
    COLUMN_UID("UID", "TEXT PRIMARY KEY NOT NULL"),
    COLUMN_SEC_UID("SEC_UID", "TEXT"),
    COLUMN_NICK_NAME("NICK_NAME", "TEXT"),
    COLUMN_SIGNATURE("SIGNATURE", "TEXT"),
    COLUMN_AVATAR_THUMB("AVATAR_THUMB", "TEXT"),
    COLUMN_FOLLOW_STATUS("FOLLOW_STATUS", "INTEGER NOT NULL"),
    COLUMN_UNIQUE_ID("UNIQUE_ID", "TEXT"),
    COLUMN_WEIBO_VERIFY("WEIBO_VERIFY", "TEXT"),
    COLUMN_CUSTOM_VERIFY("CUSTOM_VERIFY", "TEXT"),
    COLUMN_ENTERPRISE_VERIFY_REASON("ENTERPRISE_VERIFY_REASON", "TEXT"),
    COLUMN_VERIFICATION_TYPE("VERIFICATION_TYPE", "TEXT"),
    COLUMN_REMARK_NAME("REMARK_NAME", "TEXT"),
    COLUMN_SORT_WEIGHT("SORT_WEIGHT", "TEXT"),
    COLUMN_INITIAL_LETTER("INITIAL_LETTER", "TEXT"),
    COLUMN_SHORT_ID("SHORT_ID", "TEXT"),
    COLUMN_REMARK_PINYIN("REMARK_PINYIN", "TEXT"),
    COLUMN_REMARK_INITIAL("REMARK_INITIAL", "TEXT"),
    COLUMN_NICK_NAME_PINYIN("NICK_NAME_PINYIN", "TEXT"),
    COLUMN_NICK_NAME_INITIAL("NICK_NAME_INITIAL", "TEXT"),
    COLUMN_COMMERCE_USER_LEVEL("COMMERCE_USER_LEVEL", "INTEGER"),
    COLUMN_CONTACT_NAME("COLUMN_CONTACT_NAME", "TEXT"),
    COLUMN_CONTACT_NAME_PINYIN("COLUMN_CONTACT_NAME_PINYIN", "TEXT"),
    COLUMN_CONTACT_NAME_INITIAL("COLUMN_CONTACT_NAME_INITIAL", "TEXT"),
    COLUMN_USER_SHARE_STATUS("COLUMN_USER_SHARE_STATUS", "INTEGER DEFAULT 0");
    
    public String key;
    public String type;

    private C34384b(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
