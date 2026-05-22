package Xhamster;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump_unblinded/Xhamster/classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"LXhamster/VideoTagsComponent;", "", "tags", "", "LXhamster/Tag;", "<init>", "(Ljava/util/List;)V", "getTags", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoTagsComponent {

    @org.jetbrains.annotations.Nullable
    private final java.util.List<Xhamster.Tag> tags;

    public VideoTagsComponent() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public VideoTagsComponent(@org.jetbrains.annotations.Nullable java.util.List<Xhamster.Tag> r1) {
            r0 = this;
            r0.<init>()
            r0.tags = r1
            return
    }

    public /* synthetic */ VideoTagsComponent(java.util.List r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ Xhamster.VideoTagsComponent copy$default(Xhamster.VideoTagsComponent r0, java.util.List r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.util.List<Xhamster.Tag> r1 = r0.tags
        L6:
            Xhamster.VideoTagsComponent r0 = r0.copy(r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<Xhamster.Tag> component1() {
            r1 = this;
            java.util.List<Xhamster.Tag> r0 = r1.tags
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final Xhamster.VideoTagsComponent copy(@org.jetbrains.annotations.Nullable java.util.List<Xhamster.Tag> r2) {
            r1 = this;
            Xhamster.VideoTagsComponent r0 = new Xhamster.VideoTagsComponent
            r0.<init>(r2)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Xhamster.VideoTagsComponent
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r5
            Xhamster.VideoTagsComponent r1 = (Xhamster.VideoTagsComponent) r1
            java.util.List<Xhamster.Tag> r3 = r4.tags
            java.util.List<Xhamster.Tag> r1 = r1.tags
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 != 0) goto L18
            return r2
        L18:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<Xhamster.Tag> getTags() {
            r1 = this;
            java.util.List<Xhamster.Tag> r0 = r1.tags
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.List<Xhamster.Tag> r0 = r1.tags
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            java.util.List<Xhamster.Tag> r0 = r1.tags
            int r0 = r0.hashCode()
        Lc:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VideoTagsComponent(tags="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List<Xhamster.Tag> r1 = r2.tags
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
