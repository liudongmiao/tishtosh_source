package com.bytedance.p702im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.MessageType */
public enum MessageType implements WireEnum {
    MESSAGE_TYPE_NOT_USED(0),
    LEGACY_MESSAGE_TYPE_SYSTEM(1),
    LEGACY_MESSAGE_TYPE_IMAGE(2),
    LEGACY_MESSAGE_TYPE_AUDIO(3),
    LEGACY_MESSAGE_TYPE_VIDEO(4),
    LEGACY_MESSAGE_TYPE_EMOJI(5),
    LEGACY_MESSAGE_TYPE_FILE(6),
    LEGACY_MESSAGE_TYPE_TEXT(7),
    LEGACY_MESSAGE_TYPE_USER_CARD(8),
    LEGACY_MESSAGE_TYPE_TOAST(9),
    LEGACY_MESSAGE_TYPE_GROUP_CARD(10),
    MESSAGE_TYPE_TEXT(10001),
    MESSAGE_TYPE_STICKER(10002),
    MESSAGE_TYPE_IMAGE(10003),
    MESSAGE_TYPE_VIDEO(10004),
    MESSAGE_TYPE_FILE(10005),
    MESSAGE_TYPE_AUDIO(10006),
    MESSAGE_TYPE_LOCATION(10007),
    MESSAGE_TYPE_SYSTEM(10008),
    MESSAGE_TYPE_LINK(10009),
    MESSAGE_TYPE_COMMAND(50001),
    MESSAGE_TYPE_UPDATE_MESSAGE_EXT(50002),
    MESSAGE_TYPE_MODE_CHANGE(50010),
    MESSAGE_TYPE_UPDATE_MIN_INDEX(50003),
    MESSAGE_TYPE_USER_ACTION(50004),
    MESSAGE_TYPE_CONVERSATION_DESTROY(50005),
    MESSAGE_TYPE_NOTIFY_COMMAND(60001),
    MESSAGE_TYPE_MESSAGE_PROPERTY(70001),
    MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY(70002);
    
    public static final ProtoAdapter<MessageType> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.MessageType$ProtoAdapter_MessageType */
    static final class ProtoAdapter_MessageType extends EnumAdapter<MessageType> {
        ProtoAdapter_MessageType() {
            super(MessageType.class);
        }

        /* access modifiers changed from: protected */
        public final MessageType fromValue(int i) {
            return MessageType.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_MessageType();
    }

    public static MessageType fromValue(int i) {
        if (i == 50010) {
            return MESSAGE_TYPE_MODE_CHANGE;
        }
        if (i == 60001) {
            return MESSAGE_TYPE_NOTIFY_COMMAND;
        }
        switch (i) {
            case 0:
                return MESSAGE_TYPE_NOT_USED;
            case 1:
                return LEGACY_MESSAGE_TYPE_SYSTEM;
            case 2:
                return LEGACY_MESSAGE_TYPE_IMAGE;
            case 3:
                return LEGACY_MESSAGE_TYPE_AUDIO;
            case 4:
                return LEGACY_MESSAGE_TYPE_VIDEO;
            case 5:
                return LEGACY_MESSAGE_TYPE_EMOJI;
            case 6:
                return LEGACY_MESSAGE_TYPE_FILE;
            case 7:
                return LEGACY_MESSAGE_TYPE_TEXT;
            case 8:
                return LEGACY_MESSAGE_TYPE_USER_CARD;
            case 9:
                return LEGACY_MESSAGE_TYPE_TOAST;
            case 10:
                return LEGACY_MESSAGE_TYPE_GROUP_CARD;
            default:
                switch (i) {
                    case 10001:
                        return MESSAGE_TYPE_TEXT;
                    case 10002:
                        return MESSAGE_TYPE_STICKER;
                    case 10003:
                        return MESSAGE_TYPE_IMAGE;
                    case 10004:
                        return MESSAGE_TYPE_VIDEO;
                    case 10005:
                        return MESSAGE_TYPE_FILE;
                    case 10006:
                        return MESSAGE_TYPE_AUDIO;
                    case 10007:
                        return MESSAGE_TYPE_LOCATION;
                    case 10008:
                        return MESSAGE_TYPE_SYSTEM;
                    case 10009:
                        return MESSAGE_TYPE_LINK;
                    default:
                        switch (i) {
                            case 50001:
                                return MESSAGE_TYPE_COMMAND;
                            case 50002:
                                return MESSAGE_TYPE_UPDATE_MESSAGE_EXT;
                            case 50003:
                                return MESSAGE_TYPE_UPDATE_MIN_INDEX;
                            case 50004:
                                return MESSAGE_TYPE_USER_ACTION;
                            case 50005:
                                return MESSAGE_TYPE_CONVERSATION_DESTROY;
                            default:
                                switch (i) {
                                    case 70001:
                                        return MESSAGE_TYPE_MESSAGE_PROPERTY;
                                    case 70002:
                                        return MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    private MessageType(int i) {
        this.value = i;
    }
}
