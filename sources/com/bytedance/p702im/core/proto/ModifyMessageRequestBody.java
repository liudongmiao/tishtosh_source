package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ModifyMessageRequestBody */
public final class ModifyMessageRequestBody extends Message<ModifyMessageRequestBody, Builder> {
    public static final ProtoAdapter<ModifyMessageRequestBody> ADAPTER = new ProtoAdapter_ModifyMessageRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;
    public final Map<String, String> ext;
    public final String server_message_id;
    public final String ticket;

    /* renamed from: com.bytedance.im.core.proto.ModifyMessageRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ModifyMessageRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Map<String, String> ext = Internal.newMutableMap();
        public String server_message_id;
        public String ticket;

        public final ModifyMessageRequestBody build() {
            ModifyMessageRequestBody modifyMessageRequestBody = new ModifyMessageRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.server_message_id, this.ext, this.ticket, super.buildUnknownFields());
            return modifyMessageRequestBody;
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

        public final Builder server_message_id(String str) {
            this.server_message_id = str;
            return this;
        }

        public final Builder ticket(String str) {
            this.ticket = str;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ModifyMessageRequestBody$ProtoAdapter_ModifyMessageRequestBody */
    static final class ProtoAdapter_ModifyMessageRequestBody extends ProtoAdapter<ModifyMessageRequestBody> {
        private final ProtoAdapter<Map<String, String>> ext;

        public ProtoAdapter_ModifyMessageRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifyMessageRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final ModifyMessageRequestBody redact(ModifyMessageRequestBody modifyMessageRequestBody) {
            Builder newBuilder = modifyMessageRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ModifyMessageRequestBody modifyMessageRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, modifyMessageRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, modifyMessageRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, modifyMessageRequestBody.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, modifyMessageRequestBody.server_message_id) + this.ext.encodedSizeWithTag(5, modifyMessageRequestBody.ext) + ProtoAdapter.STRING.encodedSizeWithTag(6, modifyMessageRequestBody.ticket) + modifyMessageRequestBody.unknownFields().size();
        }

        public final ModifyMessageRequestBody decode(ProtoReader protoReader) throws IOException {
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
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.server_message_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.ext.putAll((Map) this.ext.decode(protoReader));
                            break;
                        case 6:
                            builder.ticket((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ModifyMessageRequestBody modifyMessageRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, modifyMessageRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, modifyMessageRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, modifyMessageRequestBody.conversation_short_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, modifyMessageRequestBody.server_message_id);
            this.ext.encodeWithTag(protoWriter, 5, modifyMessageRequestBody.ext);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, modifyMessageRequestBody.ticket);
            protoWriter.writeBytes(modifyMessageRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.server_message_id = this.server_message_id;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.ticket = this.ticket;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (!this.ext.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        StringBuilder replace = sb.replace(0, 2, "ModifyMessageRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public ModifyMessageRequestBody(String str, Integer num, Long l, String str2, Map<String, String> map, String str3) {
        this(str, num, l, str2, map, str3, ByteString.EMPTY);
    }

    public ModifyMessageRequestBody(String str, Integer num, Long l, String str2, Map<String, String> map, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.server_message_id = str2;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.ticket = str3;
    }
}
