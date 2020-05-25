package com.squareup.okhttp;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MediaType {
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private final String charset;
    private final String mediaType;
    private final String subtype;
    private final String type;

    public final String subtype() {
        return this.subtype;
    }

    public final String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }

    public final int hashCode() {
        return this.mediaType.hashCode();
    }

    public final Charset charset() {
        if (this.charset != null) {
            return Charset.forName(this.charset);
        }
        return null;
    }

    public final Charset charset(Charset charset2) {
        if (this.charset != null) {
            return Charset.forName(this.charset);
        }
        return charset2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MediaType) || !((MediaType) obj).mediaType.equals(this.mediaType)) {
            return false;
        }
        return true;
    }

    public static MediaType parse(String str) {
        String str2;
        Matcher matcher = TYPE_SUBTYPE.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String lowerCase = matcher.group(1).toLowerCase(Locale.US);
        String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        Matcher matcher2 = PARAMETER.matcher(str);
        String str3 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group = matcher2.group(1);
            if (group != null && group.equalsIgnoreCase("charset")) {
                if (matcher2.group(2) != null) {
                    str2 = matcher2.group(2);
                } else {
                    str2 = matcher2.group(3);
                }
                if (str3 == null || str2.equalsIgnoreCase(str3)) {
                    str3 = str2;
                } else {
                    StringBuilder sb = new StringBuilder("Multiple different charsets: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return new MediaType(str, lowerCase, lowerCase2, str3);
    }

    private MediaType(String str, String str2, String str3, String str4) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.charset = str4;
    }
}
