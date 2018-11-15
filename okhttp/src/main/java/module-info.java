module okhttp {
    exports okhttp3.internal;
    exports okhttp3.internal.platform;
    exports okhttp3;
    requires okio;
    requires java.logging;
    requires jsr305;
    requires android;
    requires conscrypt.openjdk.uber;
    requires animal.sniffer.annotations;

}
