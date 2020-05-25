package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: com.google.android.gms.measurement.internal.ep */
final class C17105ep extends SSLSocket {

    /* renamed from: a */
    private final SSLSocket f48312a;

    C17105ep(C17103en enVar, SSLSocket sSLSocket) {
        this.f48312a = sSLSocket;
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f48312a.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f48312a.setEnabledProtocols(strArr);
    }

    public final String[] getSupportedCipherSuites() {
        return this.f48312a.getSupportedCipherSuites();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f48312a.getEnabledCipherSuites();
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f48312a.setEnabledCipherSuites(strArr);
    }

    public final String[] getSupportedProtocols() {
        return this.f48312a.getSupportedProtocols();
    }

    public final String[] getEnabledProtocols() {
        return this.f48312a.getEnabledProtocols();
    }

    public final SSLSession getSession() {
        return this.f48312a.getSession();
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f48312a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f48312a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void startHandshake() throws IOException {
        this.f48312a.startHandshake();
    }

    public final void setUseClientMode(boolean z) {
        this.f48312a.setUseClientMode(z);
    }

    public final boolean getUseClientMode() {
        return this.f48312a.getUseClientMode();
    }

    public final void setNeedClientAuth(boolean z) {
        this.f48312a.setNeedClientAuth(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f48312a.setWantClientAuth(z);
    }

    public final boolean getNeedClientAuth() {
        return this.f48312a.getNeedClientAuth();
    }

    public final boolean getWantClientAuth() {
        return this.f48312a.getWantClientAuth();
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f48312a.setEnableSessionCreation(z);
    }

    public final boolean getEnableSessionCreation() {
        return this.f48312a.getEnableSessionCreation();
    }

    public final void bind(SocketAddress socketAddress) throws IOException {
        this.f48312a.bind(socketAddress);
    }

    public final synchronized void close() throws IOException {
        this.f48312a.close();
    }

    public final void connect(SocketAddress socketAddress) throws IOException {
        this.f48312a.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int i) throws IOException {
        this.f48312a.connect(socketAddress, i);
    }

    public final SocketChannel getChannel() {
        return this.f48312a.getChannel();
    }

    public final InetAddress getInetAddress() {
        return this.f48312a.getInetAddress();
    }

    public final InputStream getInputStream() throws IOException {
        return this.f48312a.getInputStream();
    }

    public final boolean getKeepAlive() throws SocketException {
        return this.f48312a.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f48312a.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f48312a.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f48312a.getLocalSocketAddress();
    }

    public final boolean getOOBInline() throws SocketException {
        return this.f48312a.getOOBInline();
    }

    public final OutputStream getOutputStream() throws IOException {
        return this.f48312a.getOutputStream();
    }

    public final int getPort() {
        return this.f48312a.getPort();
    }

    public final synchronized int getReceiveBufferSize() throws SocketException {
        return this.f48312a.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f48312a.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() throws SocketException {
        return this.f48312a.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() throws SocketException {
        return this.f48312a.getSendBufferSize();
    }

    public final int getSoLinger() throws SocketException {
        return this.f48312a.getSoLinger();
    }

    public final synchronized int getSoTimeout() throws SocketException {
        return this.f48312a.getSoTimeout();
    }

    public final boolean getTcpNoDelay() throws SocketException {
        return this.f48312a.getTcpNoDelay();
    }

    public final int getTrafficClass() throws SocketException {
        return this.f48312a.getTrafficClass();
    }

    public final boolean isBound() {
        return this.f48312a.isBound();
    }

    public final boolean isClosed() {
        return this.f48312a.isClosed();
    }

    public final boolean isConnected() {
        return this.f48312a.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f48312a.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f48312a.isOutputShutdown();
    }

    public final void sendUrgentData(int i) throws IOException {
        this.f48312a.sendUrgentData(i);
    }

    public final void setKeepAlive(boolean z) throws SocketException {
        this.f48312a.setKeepAlive(z);
    }

    public final void setOOBInline(boolean z) throws SocketException {
        this.f48312a.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f48312a.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) throws SocketException {
        this.f48312a.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) throws SocketException {
        this.f48312a.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) throws SocketException {
        this.f48312a.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) throws SocketException {
        this.f48312a.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) throws SocketException {
        this.f48312a.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) throws SocketException {
        this.f48312a.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) throws SocketException {
        this.f48312a.setTrafficClass(i);
    }

    public final void shutdownInput() throws IOException {
        this.f48312a.shutdownInput();
    }

    public final void shutdownOutput() throws IOException {
        this.f48312a.shutdownOutput();
    }

    public final String toString() {
        return this.f48312a.toString();
    }

    public final boolean equals(Object obj) {
        return this.f48312a.equals(obj);
    }
}
