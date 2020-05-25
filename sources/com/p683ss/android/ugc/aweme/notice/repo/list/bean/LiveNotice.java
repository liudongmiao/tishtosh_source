package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.LiveNotice */
public final class LiveNotice {
    @C17952c(mo34828a = "room_info")
    private final RoomInfo roomInfo;
    @C17952c(mo34828a = "type")
    private final int type;
    @C17952c(mo34828a = "user_info")
    private final User user;

    public LiveNotice() {
        this(null, 0, null, 7, null);
    }

    public static /* synthetic */ LiveNotice copy$default(LiveNotice liveNotice, User user2, int i, RoomInfo roomInfo2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            user2 = liveNotice.user;
        }
        if ((i2 & 2) != 0) {
            i = liveNotice.type;
        }
        if ((i2 & 4) != 0) {
            roomInfo2 = liveNotice.roomInfo;
        }
        return liveNotice.copy(user2, i, roomInfo2);
    }

    public final User component1() {
        return this.user;
    }

    public final int component2() {
        return this.type;
    }

    public final RoomInfo component3() {
        return this.roomInfo;
    }

    public final LiveNotice copy(User user2, int i, RoomInfo roomInfo2) {
        return new LiveNotice(user2, i, roomInfo2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LiveNotice) {
                LiveNotice liveNotice = (LiveNotice) obj;
                if (C52711k.m112239a((Object) this.user, (Object) liveNotice.user)) {
                    if (!(this.type == liveNotice.type) || !C52711k.m112239a((Object) this.roomInfo, (Object) liveNotice.roomInfo)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final RoomInfo getRoomInfo() {
        return this.roomInfo;
    }

    public final int getType() {
        return this.type;
    }

    public final User getUser() {
        return this.user;
    }

    public final int hashCode() {
        User user2 = this.user;
        int i = 0;
        int hashCode = (((user2 != null ? user2.hashCode() : 0) * 31) + this.type) * 31;
        RoomInfo roomInfo2 = this.roomInfo;
        if (roomInfo2 != null) {
            i = roomInfo2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveNotice(user=");
        sb.append(this.user);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", roomInfo=");
        sb.append(this.roomInfo);
        sb.append(")");
        return sb.toString();
    }

    public final String getTitle() {
        RoomInfo roomInfo2 = this.roomInfo;
        if (roomInfo2 != null) {
            return roomInfo2.getTitle();
        }
        return null;
    }

    public LiveNotice(User user2, int i, RoomInfo roomInfo2) {
        this.user = user2;
        this.type = i;
        this.roomInfo = roomInfo2;
    }

    public /* synthetic */ LiveNotice(User user2, int i, RoomInfo roomInfo2, int i2, C52707g gVar) {
        if ((i2 & 1) != 0) {
            user2 = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            roomInfo2 = null;
        }
        this(user2, i, roomInfo2);
    }
}
