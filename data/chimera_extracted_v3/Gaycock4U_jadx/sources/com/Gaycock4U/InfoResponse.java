package com.Gaycock4U;

/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /tmp/tmp.gEcNE2slhR/classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u00d6\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u00d6\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/Gaycock4U/InfoResponse;", "", "success", "", "data", "Lcom/Gaycock4U/VideoData;", "<init>", "(Ljava/lang/Boolean;Lcom/Gaycock4U/VideoData;)V", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getData", "()Lcom/Gaycock4U/VideoData;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Lcom/Gaycock4U/VideoData;)Lcom/Gaycock4U/InfoResponse;", "equals", "other", "hashCode", "", "toString", "", "Gaycock4U"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InfoResponse {

    @org.jetbrains.annotations.Nullable
    private final com.Gaycock4U.VideoData data;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean success;

    public InfoResponse(@org.jetbrains.annotations.Nullable java.lang.Boolean r1, @org.jetbrains.annotations.Nullable com.Gaycock4U.VideoData r2) {
            r0 = this;
            r0.<init>()
            r0.success = r1
            r0.data = r2
            return
    }

    public static /* synthetic */ com.Gaycock4U.InfoResponse copy$default(com.Gaycock4U.InfoResponse r0, java.lang.Boolean r1, com.Gaycock4U.VideoData r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.Boolean r1 = r0.success
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            com.Gaycock4U.VideoData r2 = r0.data
        Lc:
            com.Gaycock4U.InfoResponse r0 = r0.copy(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component1() {
            r1 = this;
            java.lang.Boolean r0 = r1.success
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.Gaycock4U.VideoData component2() {
            r1 = this;
            com.Gaycock4U.VideoData r0 = r1.data
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.Gaycock4U.InfoResponse copy(@org.jetbrains.annotations.Nullable java.lang.Boolean r2, @org.jetbrains.annotations.Nullable com.Gaycock4U.VideoData r3) {
            r1 = this;
            com.Gaycock4U.InfoResponse r0 = new com.Gaycock4U.InfoResponse
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.Gaycock4U.InfoResponse
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            com.Gaycock4U.InfoResponse r1 = (com.Gaycock4U.InfoResponse) r1
            java.lang.Boolean r3 = r5.success
            java.lang.Boolean r4 = r1.success
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L18
            return r2
        L18:
            com.Gaycock4U.VideoData r3 = r5.data
            com.Gaycock4U.VideoData r1 = r1.data
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 != 0) goto L23
            return r2
        L23:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final com.Gaycock4U.VideoData getData() {
            r1 = this;
            com.Gaycock4U.VideoData r0 = r1.data
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getSuccess() {
            r1 = this;
            java.lang.Boolean r0 = r1.success
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.Boolean r0 = r4.success
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Ld
        L7:
            java.lang.Boolean r0 = r4.success
            int r0 = r0.hashCode()
        Ld:
            int r2 = r0 * 31
            com.Gaycock4U.VideoData r3 = r4.data
            if (r3 != 0) goto L14
            goto L1a
        L14:
            com.Gaycock4U.VideoData r1 = r4.data
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
            java.lang.String r1 = "InfoResponse(success="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Boolean r1 = r2.success
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", data="
            java.lang.StringBuilder r0 = r0.append(r1)
            com.Gaycock4U.VideoData r1 = r2.data
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
