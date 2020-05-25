package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.PropertyItem */
public final class PropertyItem extends Message<PropertyItem, Builder> {
    public static final ProtoAdapter<PropertyItem> ADAPTER = new ProtoAdapter_PropertyItem();
    public static final Long DEFAULT_CREATE_TIME = Long.valueOf(0);
    public static final Long DEFAULT_UID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long create_time;
    public final String idempotent_id;
    public final String sec_uid;
    public final Long uid;
    public final String value;

    /* renamed from: com.bytedance.im.core.proto.PropertyItem$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PropertyItem, Builder> {
        public Long create_time;
        public String idempotent_id;
        public String sec_uid;
        public Long uid;
        public String value;

        public final PropertyItem build() {
            PropertyItem propertyItem = new PropertyItem(this.uid, this.sec_uid, this.create_time, this.idempotent_id, this.value, super.buildUnknownFields());
            return propertyItem;
        }

        public final Builder create_time(Long l) {
            this.create_time = l;
            return this;
        }

        public final Builder idempotent_id(String str) {
            this.idempotent_id = str;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder uid(Long l) {
            this.uid = l;
            return this;
        }

        public final Builder value(String str) {
            this.value = str;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.PropertyItem$ProtoAdapter_PropertyItem */
    static final class ProtoAdapter_PropertyItem extends ProtoAdapter<PropertyItem> {
        public ProtoAdapter_PropertyItem() {
            super(FieldEncoding.LENGTH_DELIMITED, PropertyItem.class);
        }

        public final PropertyItem redact(PropertyItem propertyItem) {
            Builder newBuilder = propertyItem.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(PropertyItem propertyItem) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, propertyItem.uid) + ProtoAdapter.STRING.encodedSizeWithTag(2, propertyItem.sec_uid) + ProtoAdapter.INT64.encodedSizeWithTag(3, propertyItem.create_time) + ProtoAdapter.STRING.encodedSizeWithTag(4, propertyItem.idempotent_id) + ProtoAdapter.STRING.encodedSizeWithTag(5, propertyItem.value) + propertyItem.unknownFields().size();
        }

        public final PropertyItem decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.uid((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.sec_uid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.create_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.idempotent_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.value((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, PropertyItem propertyItem) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, propertyItem.uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, propertyItem.sec_uid);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, propertyItem.create_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, propertyItem.idempotent_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, propertyItem.value);
            protoWriter.writeBytes(propertyItem.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.uid = this.uid;
        builder.sec_uid = this.sec_uid;
        builder.create_time = this.create_time;
        builder.idempotent_id = this.idempotent_id;
        builder.value = this.value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uid != null) {
            sb.append(", uid=");
            sb.append(this.uid);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.idempotent_id != null) {
            sb.append(", idempotent_id=");
            sb.append(this.idempotent_id);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        StringBuilder replace = sb.replace(0, 2, "PropertyItem{");
        replace.append('}');
        return replace.toString();
    }

    public PropertyItem(Long l, String str, Long l2, String str2, String str3) {
        this(l, str, l2, str2, str3, ByteString.EMPTY);
    }

    public PropertyItem(Long l, String str, Long l2, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uid = l;
        this.sec_uid = str;
        this.create_time = l2;
        this.idempotent_id = str2;
        this.value = str3;
    }
}
