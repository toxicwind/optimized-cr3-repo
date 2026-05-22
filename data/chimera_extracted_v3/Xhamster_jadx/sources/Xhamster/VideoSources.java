package Xhamster;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /tmp/tmp.X4wNI9Fn9T/classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u00d6\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"LXhamster/VideoSources;", "", "hls", "LXhamster/HlsSources;", "standard", "LXhamster/StandardSources;", "<init>", "(LXhamster/HlsSources;LXhamster/StandardSources;)V", "getHls", "()LXhamster/HlsSources;", "getStandard", "()LXhamster/StandardSources;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoSources {

    @org.jetbrains.annotations.Nullable
    private final Xhamster.HlsSources hls;

    @org.jetbrains.annotations.Nullable
    private final Xhamster.StandardSources standard;

    public VideoSources() {
            r2 = this;
            r0 = 0
            r1 = 3
            r2.<init>(r0, r0, r1, r0)
            return
    }

    public VideoSources(@org.jetbrains.annotations.Nullable Xhamster.HlsSources r1, @org.jetbrains.annotations.Nullable Xhamster.StandardSources r2) {
            r0 = this;
            r0.<init>()
            r0.hls = r1
            r0.standard = r2
            return
    }

    public /* synthetic */ VideoSources(Xhamster.HlsSources r2, Xhamster.StandardSources r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r1 = this;
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L6
            r2 = r0
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lb
            r3 = r0
        Lb:
            r1.<init>(r2, r3)
            return
    }

    public static /* synthetic */ Xhamster.VideoSources copy$default(Xhamster.VideoSources r0, Xhamster.HlsSources r1, Xhamster.StandardSources r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            Xhamster.HlsSources r1 = r0.hls
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            Xhamster.StandardSources r2 = r0.standard
        Lc:
            Xhamster.VideoSources r0 = r0.copy(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.HlsSources component1() {
            r1 = this;
            Xhamster.HlsSources r0 = r1.hls
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.StandardSources component2() {
            r1 = this;
            Xhamster.StandardSources r0 = r1.standard
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final Xhamster.VideoSources copy(@org.jetbrains.annotations.Nullable Xhamster.HlsSources r2, @org.jetbrains.annotations.Nullable Xhamster.StandardSources r3) {
            r1 = this;
            Xhamster.VideoSources r0 = new Xhamster.VideoSources
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof Xhamster.VideoSources
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            Xhamster.VideoSources r1 = (Xhamster.VideoSources) r1
            Xhamster.HlsSources r3 = r5.hls
            Xhamster.HlsSources r4 = r1.hls
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L18
            return r2
        L18:
            Xhamster.StandardSources r3 = r5.standard
            Xhamster.StandardSources r1 = r1.standard
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 != 0) goto L23
            return r2
        L23:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.HlsSources getHls() {
            r1 = this;
            Xhamster.HlsSources r0 = r1.hls
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.StandardSources getStandard() {
            r1 = this;
            Xhamster.StandardSources r0 = r1.standard
            return r0
    }

    public int hashCode() {
            r4 = this;
            Xhamster.HlsSources r0 = r4.hls
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Ld
        L7:
            Xhamster.HlsSources r0 = r4.hls
            int r0 = r0.hashCode()
        Ld:
            int r2 = r0 * 31
            Xhamster.StandardSources r3 = r4.standard
            if (r3 != 0) goto L14
            goto L1a
        L14:
            Xhamster.StandardSources r1 = r4.standard
            int r1 = r1.hashCode()
        L1a:
            int r2 = r2 + r1
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VideoSources(hls="
            java.lang.StringBuilder r0 = r0.append(r1)
            Xhamster.HlsSources r1 = r2.hls
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", standard="
            java.lang.StringBuilder r0 = r0.append(r1)
            Xhamster.StandardSources r1 = r2.standard
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
