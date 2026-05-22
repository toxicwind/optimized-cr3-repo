package Xhamster;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump_unblinded/Xhamster/classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u00d6\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"LXhamster/SubtitleTrack;", "", "label", "", "lang", "urls", "LXhamster/SubtitleUrls;", "<init>", "(Ljava/lang/String;Ljava/lang/String;LXhamster/SubtitleUrls;)V", "getLabel", "()Ljava/lang/String;", "getLang", "getUrls", "()LXhamster/SubtitleUrls;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SubtitleTrack {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String label;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String lang;

    @org.jetbrains.annotations.Nullable
    private final Xhamster.SubtitleUrls urls;

    public SubtitleTrack() {
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

    public SubtitleTrack(@org.jetbrains.annotations.Nullable java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable Xhamster.SubtitleUrls r3) {
            r0 = this;
            r0.<init>()
            r0.label = r1
            r0.lang = r2
            r0.urls = r3
            return
    }

    public /* synthetic */ SubtitleTrack(java.lang.String r2, java.lang.String r3, Xhamster.SubtitleUrls r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
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

    public static /* synthetic */ Xhamster.SubtitleTrack copy$default(Xhamster.SubtitleTrack r0, java.lang.String r1, java.lang.String r2, Xhamster.SubtitleUrls r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.label
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.lang
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            Xhamster.SubtitleUrls r3 = r0.urls
        L12:
            Xhamster.SubtitleTrack r0 = r0.copy(r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.label
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.lang
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.SubtitleUrls component3() {
            r1 = this;
            Xhamster.SubtitleUrls r0 = r1.urls
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final Xhamster.SubtitleTrack copy(@org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.Nullable Xhamster.SubtitleUrls r4) {
            r1 = this;
            Xhamster.SubtitleTrack r0 = new Xhamster.SubtitleTrack
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof Xhamster.SubtitleTrack
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            Xhamster.SubtitleTrack r1 = (Xhamster.SubtitleTrack) r1
            java.lang.String r3 = r5.label
            java.lang.String r4 = r1.label
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L18
            return r2
        L18:
            java.lang.String r3 = r5.lang
            java.lang.String r4 = r1.lang
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L23
            return r2
        L23:
            Xhamster.SubtitleUrls r3 = r5.urls
            Xhamster.SubtitleUrls r1 = r1.urls
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 != 0) goto L2e
            return r2
        L2e:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLabel() {
            r1 = this;
            java.lang.String r0 = r1.label
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLang() {
            r1 = this;
            java.lang.String r0 = r1.lang
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.SubtitleUrls getUrls() {
            r1 = this;
            Xhamster.SubtitleUrls r0 = r1.urls
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.label
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Ld
        L7:
            java.lang.String r0 = r4.label
            int r0 = r0.hashCode()
        Ld:
            int r2 = r0 * 31
            java.lang.String r3 = r4.lang
            if (r3 != 0) goto L15
            r3 = 0
            goto L1b
        L15:
            java.lang.String r3 = r4.lang
            int r3 = r3.hashCode()
        L1b:
            int r2 = r2 + r3
            int r0 = r2 * 31
            Xhamster.SubtitleUrls r3 = r4.urls
            if (r3 != 0) goto L23
            goto L29
        L23:
            Xhamster.SubtitleUrls r1 = r4.urls
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
            java.lang.String r1 = "SubtitleTrack(label="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.label
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", lang="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.lang
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", urls="
            java.lang.StringBuilder r0 = r0.append(r1)
            Xhamster.SubtitleUrls r1 = r2.urls
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
