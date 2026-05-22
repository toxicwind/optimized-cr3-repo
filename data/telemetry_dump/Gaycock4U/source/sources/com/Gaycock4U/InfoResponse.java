package com.Gaycock4U;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Gaycock4U/classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/Gaycock4U/InfoResponse;", "", "success", "", "data", "Lcom/Gaycock4U/VideoData;", "<init>", "(Ljava/lang/Boolean;Lcom/Gaycock4U/VideoData;)V", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getData", "()Lcom/Gaycock4U/VideoData;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Lcom/Gaycock4U/VideoData;)Lcom/Gaycock4U/InfoResponse;", "equals", "other", "hashCode", "", "toString", "", "Gaycock4U"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class InfoResponse {

    @Nullable
    private final VideoData data;

    @Nullable
    private final Boolean success;

    public static /* synthetic */ InfoResponse copy$default(InfoResponse infoResponse, Boolean bool, VideoData videoData, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = infoResponse.success;
        }
        if ((i & 2) != 0) {
            videoData = infoResponse.data;
        }
        return infoResponse.copy(bool, videoData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VideoData getData() {
        return this.data;
    }

    @NotNull
    public final InfoResponse copy(@Nullable Boolean success, @Nullable VideoData data) {
        return new InfoResponse(success, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoResponse)) {
            return false;
        }
        InfoResponse infoResponse = (InfoResponse) other;
        return Intrinsics.areEqual(this.success, infoResponse.success) && Intrinsics.areEqual(this.data, infoResponse.data);
    }

    public int hashCode() {
        return ((this.success == null ? 0 : this.success.hashCode()) * 31) + (this.data != null ? this.data.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InfoResponse(success=" + this.success + ", data=" + this.data + ')';
    }

    public InfoResponse(@Nullable Boolean success, @Nullable VideoData data) {
        this.success = success;
        this.data = data;
    }

    @Nullable
    public final VideoData getData() {
        return this.data;
    }

    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }
}
