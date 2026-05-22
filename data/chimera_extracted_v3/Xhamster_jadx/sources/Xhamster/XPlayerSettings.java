package Xhamster;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /tmp/tmp.X4wNI9Fn9T/classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u00d6\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"LXhamster/XPlayerSettings;", "", "sources", "LXhamster/VideoSources;", "poster", "LXhamster/Poster;", "subtitles", "LXhamster/Subtitles;", "<init>", "(LXhamster/VideoSources;LXhamster/Poster;LXhamster/Subtitles;)V", "getSources", "()LXhamster/VideoSources;", "getPoster", "()LXhamster/Poster;", "getSubtitles", "()LXhamster/Subtitles;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class XPlayerSettings {

    @org.jetbrains.annotations.Nullable
    private final Xhamster.Poster poster;

    @org.jetbrains.annotations.Nullable
    private final Xhamster.VideoSources sources;

    @org.jetbrains.annotations.Nullable
    private final Xhamster.Subtitles subtitles;

    public XPlayerSettings() {
            r6 = this;
            r4 = 7
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public XPlayerSettings(@org.jetbrains.annotations.Nullable Xhamster.VideoSources r1, @org.jetbrains.annotations.Nullable Xhamster.Poster r2, @org.jetbrains.annotations.Nullable Xhamster.Subtitles r3) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.poster = r2
            r0.subtitles = r3
            return
    }

    public /* synthetic */ XPlayerSettings(Xhamster.VideoSources r2, Xhamster.Poster r3, Xhamster.Subtitles r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
            r1 = this;
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = r0
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lb
            r3 = r0
        Lb:
            r5 = r5 & 4
            if (r5 == 0) goto L10
            r4 = r0
        L10:
            r1.<init>(r2, r3, r4)
            return
    }

    public static /* synthetic */ Xhamster.XPlayerSettings copy$default(Xhamster.XPlayerSettings r0, Xhamster.VideoSources r1, Xhamster.Poster r2, Xhamster.Subtitles r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            Xhamster.VideoSources r1 = r0.sources
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            Xhamster.Poster r2 = r0.poster
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            Xhamster.Subtitles r3 = r0.subtitles
        L12:
            Xhamster.XPlayerSettings r0 = r0.copy(r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.VideoSources component1() {
            r1 = this;
            Xhamster.VideoSources r0 = r1.sources
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.Poster component2() {
            r1 = this;
            Xhamster.Poster r0 = r1.poster
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.Subtitles component3() {
            r1 = this;
            Xhamster.Subtitles r0 = r1.subtitles
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final Xhamster.XPlayerSettings copy(@org.jetbrains.annotations.Nullable Xhamster.VideoSources r2, @org.jetbrains.annotations.Nullable Xhamster.Poster r3, @org.jetbrains.annotations.Nullable Xhamster.Subtitles r4) {
            r1 = this;
            Xhamster.XPlayerSettings r0 = new Xhamster.XPlayerSettings
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof Xhamster.XPlayerSettings
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            Xhamster.XPlayerSettings r1 = (Xhamster.XPlayerSettings) r1
            Xhamster.VideoSources r3 = r5.sources
            Xhamster.VideoSources r4 = r1.sources
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L18
            return r2
        L18:
            Xhamster.Poster r3 = r5.poster
            Xhamster.Poster r4 = r1.poster
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L23
            return r2
        L23:
            Xhamster.Subtitles r3 = r5.subtitles
            Xhamster.Subtitles r1 = r1.subtitles
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 != 0) goto L2e
            return r2
        L2e:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.Poster getPoster() {
            r1 = this;
            Xhamster.Poster r0 = r1.poster
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.VideoSources getSources() {
            r1 = this;
            Xhamster.VideoSources r0 = r1.sources
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.Subtitles getSubtitles() {
            r1 = this;
            Xhamster.Subtitles r0 = r1.subtitles
            return r0
    }

    public int hashCode() {
            r4 = this;
            Xhamster.VideoSources r0 = r4.sources
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Ld
        L7:
            Xhamster.VideoSources r0 = r4.sources
            int r0 = r0.hashCode()
        Ld:
            int r2 = r0 * 31
            Xhamster.Poster r3 = r4.poster
            if (r3 != 0) goto L15
            r3 = 0
            goto L1b
        L15:
            Xhamster.Poster r3 = r4.poster
            int r3 = r3.hashCode()
        L1b:
            int r2 = r2 + r3
            int r0 = r2 * 31
            Xhamster.Subtitles r3 = r4.subtitles
            if (r3 != 0) goto L23
            goto L29
        L23:
            Xhamster.Subtitles r1 = r4.subtitles
            int r1 = r1.hashCode()
        L29:
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "XPlayerSettings(sources="
            java.lang.StringBuilder r0 = r0.append(r1)
            Xhamster.VideoSources r1 = r2.sources
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", poster="
            java.lang.StringBuilder r0 = r0.append(r1)
            Xhamster.Poster r1 = r2.poster
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", subtitles="
            java.lang.StringBuilder r0 = r0.append(r1)
            Xhamster.Subtitles r1 = r2.subtitles
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
