package com.p683ss.avframework.livestreamv2.game;

import android.os.Message;

/* renamed from: com.ss.avframework.livestreamv2.game.MessageBox */
public class MessageBox {
    private Message mMessage;
    private Message mResponse;
    private ResponHandler mResponseHandler;

    /* renamed from: com.ss.avframework.livestreamv2.game.MessageBox$ResponHandler */
    public interface ResponHandler {
        void onError(MessageBox messageBox, Throwable th);

        void onSucceed(MessageBox messageBox);
    }

    public Message getMessage() {
        return this.mMessage;
    }

    public Message getResponse() {
        return this.mResponse;
    }

    public ResponHandler getResponseHandler() {
        return this.mResponseHandler;
    }

    public void setResponse(Message message) {
        this.mResponse = message;
    }

    public MessageBox(int i) {
        this(i, (ResponHandler) null);
    }

    public MessageBox(Message message) {
        this(message, (ResponHandler) null);
    }

    public MessageBox(int i, ResponHandler responHandler) {
        this(i, null, responHandler);
    }

    public MessageBox(Message message, ResponHandler responHandler) {
        this.mMessage = message;
        this.mResponseHandler = responHandler;
    }

    public MessageBox(int i, Object obj, ResponHandler responHandler) {
        this(Message.obtain(null, i, obj), responHandler);
    }
}
