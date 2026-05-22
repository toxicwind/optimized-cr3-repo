package Xhamster;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /tmp/tmp.X4wNI9Fn9T/classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0013"}, d2 = {"LXhamster/Tag;", "", "name", "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Tag {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String name;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String url;

    public Tag() {
            r2 = this;
            r0 = 0
            r1 = 3
            r2.<init>(r0, r0, r1, r0)
            return
    }

    public Tag(@org.jetbrains.annotations.Nullable java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.url = r2
            return
    }

    public /* synthetic */ Tag(java.lang.String r2, java.lang.String r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
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

    public static /* synthetic */ Xhamster.Tag copy$default(Xhamster.Tag r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.name
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = r0.url
        Lc:
            Xhamster.Tag r0 = r0.copy(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final Xhamster.Tag copy(@org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            r1 = this;
            Xhamster.Tag r0 = new Xhamster.Tag
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof Xhamster.Tag
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            Xhamster.Tag r1 = (Xhamster.Tag) r1
            java.lang.String r3 = r5.name
            java.lang.String r4 = r1.name
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L18
            return r2
        L18:
            java.lang.String r3 = r5.url
            java.lang.String r1 = r1.url
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 != 0) goto L23
            return r2
        L23:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.name
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Ld
        L7:
            java.lang.String r0 = r4.name
            int r0 = r0.hashCode()
        Ld:
            int r2 = r0 * 31
            java.lang.String r3 = r4.url
            if (r3 != 0) goto L14
            goto L1a
        L14:
            java.lang.String r1 = r4.url
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
            java.lang.String r1 = "Tag(name="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.name
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", url="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.url
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
