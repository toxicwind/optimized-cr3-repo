package com.iGay69;

/* JADX INFO: compiled from: Extractors.kt */
/* JADX INFO: loaded from: /tmp/tmp.brqy2b1ylM/classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/iGay69/MixDropCv;", "Lcom/lagradost/cloudstream3/extractors/MixDrop;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "iGay69"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MixDropCv extends com.lagradost.cloudstream3.extractors.MixDrop {

    @org.jetbrains.annotations.NotNull
    private java.lang.String mainUrl;

    public MixDropCv() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "https://mixdrop.cv"
            r1.mainUrl = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getMainUrl() {
            r1 = this;
            java.lang.String r0 = r1.mainUrl
            return r0
    }

    public void setMainUrl(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            r0 = this;
            r0.mainUrl = r1
            return
    }
}
