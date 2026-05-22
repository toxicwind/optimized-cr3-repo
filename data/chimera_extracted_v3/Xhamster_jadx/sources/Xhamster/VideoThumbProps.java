package Xhamster;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /tmp/tmp.X4wNI9Fn9T/classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u00d6\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, d2 = {"LXhamster/VideoThumbProps;", "", "title", "", "pageURL", "thumbUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPageURL", "getThumbUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoThumbProps {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String pageURL;

    @com.fasterxml.jackson.annotation.JsonProperty("thumbURL")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String thumbUrl;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String title;

    public VideoThumbProps(@org.jetbrains.annotations.Nullable java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @com.fasterxml.jackson.annotation.JsonProperty("thumbURL") @org.jetbrains.annotations.Nullable java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.title = r1
            r0.pageURL = r2
            r0.thumbUrl = r3
            return
    }

    public static /* synthetic */ Xhamster.VideoThumbProps copy$default(Xhamster.VideoThumbProps r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.title
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.pageURL
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.lang.String r3 = r0.thumbUrl
        L12:
            Xhamster.VideoThumbProps r0 = r0.copy(r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.pageURL
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.thumbUrl
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final Xhamster.VideoThumbProps copy(@org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @com.fasterxml.jackson.annotation.JsonProperty("thumbURL") @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r1 = this;
            Xhamster.VideoThumbProps r0 = new Xhamster.VideoThumbProps
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof Xhamster.VideoThumbProps
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            Xhamster.VideoThumbProps r1 = (Xhamster.VideoThumbProps) r1
            java.lang.String r3 = r5.title
            java.lang.String r4 = r1.title
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L18
            return r2
        L18:
            java.lang.String r3 = r5.pageURL
            java.lang.String r4 = r1.pageURL
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L23
            return r2
        L23:
            java.lang.String r3 = r5.thumbUrl
            java.lang.String r1 = r1.thumbUrl
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 != 0) goto L2e
            return r2
        L2e:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPageURL() {
            r1 = this;
            java.lang.String r0 = r1.pageURL
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getThumbUrl() {
            r1 = this;
            java.lang.String r0 = r1.thumbUrl
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.title
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Ld
        L7:
            java.lang.String r0 = r4.title
            int r0 = r0.hashCode()
        Ld:
            int r2 = r0 * 31
            java.lang.String r3 = r4.pageURL
            if (r3 != 0) goto L15
            r3 = 0
            goto L1b
        L15:
            java.lang.String r3 = r4.pageURL
            int r3 = r3.hashCode()
        L1b:
            int r2 = r2 + r3
            int r0 = r2 * 31
            java.lang.String r3 = r4.thumbUrl
            if (r3 != 0) goto L23
            goto L29
        L23:
            java.lang.String r1 = r4.thumbUrl
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
            java.lang.String r1 = "VideoThumbProps(title="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.title
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", pageURL="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.pageURL
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", thumbUrl="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.thumbUrl
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
