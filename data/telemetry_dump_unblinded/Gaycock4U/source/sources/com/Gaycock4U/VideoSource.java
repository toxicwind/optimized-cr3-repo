package com.Gaycock4U;

/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump_unblinded/Gaycock4U/classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/Gaycock4U/VideoSource;", "", "file", "", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getLabel", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Gaycock4U"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoSource {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String file;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String label;

    public VideoSource(@org.jetbrains.annotations.Nullable java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.file = r1
            r0.label = r2
            return
    }

    public static /* synthetic */ com.Gaycock4U.VideoSource copy$default(com.Gaycock4U.VideoSource r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.file
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = r0.label
        Lc:
            com.Gaycock4U.VideoSource r0 = r0.copy(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.file
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.label
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.Gaycock4U.VideoSource copy(@org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            r1 = this;
            com.Gaycock4U.VideoSource r0 = new com.Gaycock4U.VideoSource
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.Gaycock4U.VideoSource
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            com.Gaycock4U.VideoSource r1 = (com.Gaycock4U.VideoSource) r1
            java.lang.String r3 = r5.file
            java.lang.String r4 = r1.file
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L18
            return r2
        L18:
            java.lang.String r3 = r5.label
            java.lang.String r1 = r1.label
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 != 0) goto L23
            return r2
        L23:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFile() {
            r1 = this;
            java.lang.String r0 = r1.file
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLabel() {
            r1 = this;
            java.lang.String r0 = r1.label
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.file
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Ld
        L7:
            java.lang.String r0 = r4.file
            int r0 = r0.hashCode()
        Ld:
            int r2 = r0 * 31
            java.lang.String r3 = r4.label
            if (r3 != 0) goto L14
            goto L1a
        L14:
            java.lang.String r1 = r4.label
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
            java.lang.String r1 = "VideoSource(file="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.file
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", label="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.label
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
