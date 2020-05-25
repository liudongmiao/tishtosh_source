package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.GetConversationCoreInfoRequestBody */
public final class GetConversationCoreInfoRequestBody extends Message<GetConversationCoreInfoRequestBody, Builder> {
    public static final ProtoAdapter<GetConversationCoreInfoRequestBody> ADAPTER = new ProtoAdapter_GetConversationCoreInfoRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;

    /* renamed from: com.bytedance.im.core.proto.GetConversationCoreInfoRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationCoreInfoRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;

        public final GetConversationCoreInfoRequestBody build() {
            return new GetConversationCoreInfoRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, super.buildUnknownFields());
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationCoreInfoRequestBody$ProtoAdapter_GetConversationCoreInfoRequestBody */
    static final class ProtoAdapter_GetConversationCoreInfoRequestBody extends ProtoAdapter<GetConversationCoreInfoRequestBody> {
        public ProtoAdapter_GetConversationCoreInfoRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationCoreInfoRequestBody.class);
        }

        public final GetConversationCoreInfoRequestBody redact(GetConversationCoreInfoRequestBody getConversationCoreInfoRequestBody) {
            Builder newBuilder = getConversationCoreInfoRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GetConversationCoreInfoRequestBody getConversationCoreInfoRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getConversationCoreInfoRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, getConversationCoreInfoRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, getConversationCoreInfoRequestBody.conversation_type) + getConversationCoreInfoRequestBody.unknownFields().size();
        }

        public final GetConversationCoreInfoRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationCoreInfoRequestBody getConversationCoreInfoRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getConversationCoreInfoRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getConversationCoreInfoRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getConversationCoreInfoRequestBody.conversation_type);
            protoWriter.writeBytes(getConversationCoreInfoRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConversationCoreInfoRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationCoreInfoRequestBody(String str, Long l, Integer num) {
        this(str, l, num, ByteString.EMPTY);
    }

    public GetConversationCoreInfoRequestBody(String str, Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
    }
}
