package com.Gaycock4U;

/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /tmp/tmp.gEcNE2slhR/classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J?\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u00d6\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/Gaycock4U/VideoData;", "", "id", "", "title", "poster", "sources", "", "Lcom/Gaycock4U/VideoSource;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getTitle", "getPoster", "getSources", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Gaycock4U"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoData {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String id;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String poster;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.Gaycock4U.VideoSource> sources;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String title;

    public VideoData(@org.jetbrains.annotations.Nullable java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.Nullable java.util.List<com.Gaycock4U.VideoSource> r4) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            r0.title = r2
            r0.poster = r3
            r0.sources = r4
            return
    }

    public static /* synthetic */ com.Gaycock4U.VideoData copy$default(com.Gaycock4U.VideoData r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.List r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.String r1 = r0.id
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.lang.String r2 = r0.title
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            java.lang.String r3 = r0.poster
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            java.util.List<com.Gaycock4U.VideoSource> r4 = r0.sources
        L18:
            com.Gaycock4U.VideoData r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.poster
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.Gaycock4U.VideoSource> component4() {
            r1 = this;
            java.util.List<com.Gaycock4U.VideoSource> r0 = r1.sources
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.Gaycock4U.VideoData copy(@org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.Nullable java.util.List<com.Gaycock4U.VideoSource> r5) {
            r1 = this;
            com.Gaycock4U.VideoData r0 = new com.Gaycock4U.VideoData
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.Gaycock4U.VideoData
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            com.Gaycock4U.VideoData r1 = (com.Gaycock4U.VideoData) r1
            java.lang.String r3 = r5.id
            java.lang.String r4 = r1.id
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L18
            return r2
        L18:
            java.lang.String r3 = r5.title
            java.lang.String r4 = r1.title
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L23
            return r2
        L23:
            java.lang.String r3 = r5.poster
            java.lang.String r4 = r1.poster
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L2e
            return r2
        L2e:
            java.util.List<com.Gaycock4U.VideoSource> r3 = r5.sources
            java.util.List<com.Gaycock4U.VideoSource> r1 = r1.sources
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 != 0) goto L39
            return r2
        L39:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPoster() {
            r1 = this;
            java.lang.String r0 = r1.poster
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.Gaycock4U.VideoSource> getSources() {
            r1 = this;
            java.util.List<com.Gaycock4U.VideoSource> r0 = r1.sources
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
            java.lang.String r0 = r4.id
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Ld
        L7:
            java.lang.String r0 = r4.id
            int r0 = r0.hashCode()
        Ld:
            int r2 = r0 * 31
            java.lang.String r3 = r4.title
            if (r3 != 0) goto L15
            r3 = 0
            goto L1b
        L15:
            java.lang.String r3 = r4.title
            int r3 = r3.hashCode()
        L1b:
            int r2 = r2 + r3
            int r0 = r2 * 31
            java.lang.String r3 = r4.poster
            if (r3 != 0) goto L24
            r3 = 0
            goto L2a
        L24:
            java.lang.String r3 = r4.poster
            int r3 = r3.hashCode()
        L2a:
            int r0 = r0 + r3
            int r2 = r0 * 31
            java.util.List<com.Gaycock4U.VideoSource> r3 = r4.sources
            if (r3 != 0) goto L32
            goto L38
        L32:
            java.util.List<com.Gaycock4U.VideoSource> r1 = r4.sources
            int r1 = r1.hashCode()
        L38:
            int r2 = r2 + r1
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VideoData(id="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.id
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", title="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.title
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", poster="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.poster
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", sources="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List<com.Gaycock4U.VideoSource> r1 = r2.sources
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
