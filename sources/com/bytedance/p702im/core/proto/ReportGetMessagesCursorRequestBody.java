package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ReportGetMessagesCursorRequestBody */
public final class ReportGetMessagesCursorRequestBody extends Message<ReportGetMessagesCursorRequestBody, Builder> {
    public static final ProtoAdapter<ReportGetMessagesCursorRequestBody> ADAPTER = new ProtoAdapter_ReportGetMessagesCursorRequestBody();
    public static final Long DEFAULT_CURSOR = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long cursor;

    /* renamed from: com.bytedance.im.core.proto.ReportGetMessagesCursorRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ReportGetMessagesCursorRequestBody, Builder> {
        public Long cursor;

        public final ReportGetMessagesCursorRequestBody build() {
            return new ReportGetMessagesCursorRequestBody(this.cursor, super.buildUnknownFields());
        }

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ReportGetMessagesCursorRequestBody$ProtoAdapter_ReportGetMessagesCursorRequestBody */
    static final class ProtoAdapter_ReportGetMessagesCursorRequestBody extends ProtoAdapter<ReportGetMessagesCursorRequestBody> {
        public ProtoAdapter_ReportGetMessagesCursorRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ReportGetMessagesCursorRequestBody.class);
        }

        public final ReportGetMessagesCursorRequestBody redact(ReportGetMessagesCursorRequestBody reportGetMessagesCursorRequestBody) {
            Builder newBuilder = reportGetMessagesCursorRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ReportGetMessagesCursorRequestBody reportGetMessagesCursorRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, reportGetMessagesCursorRequestBody.cursor) + reportGetMessagesCursorRequestBody.unknownFields().size();
        }

        public final ReportGetMessagesCursorRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ReportGetMessagesCursorRequestBody reportGetMessagesCursorRequestBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, reportGetMessagesCursorRequestBody.cursor);
            protoWriter.writeBytes(reportGetMessagesCursorRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.cursor = this.cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "ReportGetMessagesCursorRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public ReportGetMessagesCursorRequestBody(Long l) {
        this(l, ByteString.EMPTY);
    }

    public ReportGetMessagesCursorRequestBody(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = l;
    }
}
