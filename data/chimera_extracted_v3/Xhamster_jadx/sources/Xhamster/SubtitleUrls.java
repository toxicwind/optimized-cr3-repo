package Xhamster;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /tmp/tmp.X4wNI9Fn9T/classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\r\u001a\u00020\u000eH\u00d6\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"LXhamster/SubtitleUrls;", "", "vtt", "", "<init>", "(Ljava/lang/String;)V", "getVtt", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SubtitleUrls {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String vtt;

    public SubtitleUrls() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public SubtitleUrls(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.vtt = r1
            return
    }

    public /* synthetic */ SubtitleUrls(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ Xhamster.SubtitleUrls copy$default(Xhamster.SubtitleUrls r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = r0.vtt
        L6:
            Xhamster.SubtitleUrls r0 = r0.copy(r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.vtt
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final Xhamster.SubtitleUrls copy(@org.jetbrains.annotations.Nullable java.lang.String r2) {
            r1 = this;
            Xhamster.SubtitleUrls r0 = new Xhamster.SubtitleUrls
            r0.<init>(r2)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Xhamster.SubtitleUrls
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r5
            Xhamster.SubtitleUrls r1 = (Xhamster.SubtitleUrls) r1
            java.lang.String r3 = r4.vtt
            java.lang.String r1 = r1.vtt
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 != 0) goto L18
            return r2
        L18:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVtt() {
            r1 = this;
            java.lang.String r0 = r1.vtt
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.vtt
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            java.lang.String r0 = r1.vtt
            int r0 = r0.hashCode()
        Lc:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SubtitleUrls(vtt="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.vtt
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
