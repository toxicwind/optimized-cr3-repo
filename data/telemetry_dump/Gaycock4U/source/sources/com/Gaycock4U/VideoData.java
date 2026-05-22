package com.Gaycock4U;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Gaycock4U/classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/Gaycock4U/VideoData;", "", "id", "", "title", "poster", "sources", "", "Lcom/Gaycock4U/VideoSource;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getTitle", "getPoster", "getSources", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Gaycock4U"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class VideoData {

    @Nullable
    private final String id;

    @Nullable
    private final String poster;

    @Nullable
    private final List<VideoSource> sources;

    @Nullable
    private final String title;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.Gaycock4U.VideoData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoData copy$default(VideoData videoData, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoData.id;
        }
        if ((i & 2) != 0) {
            str2 = videoData.title;
        }
        if ((i & 4) != 0) {
            str3 = videoData.poster;
        }
        if ((i & 8) != 0) {
            list = videoData.sources;
        }
        return videoData.copy(str, str2, str3, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPoster() {
        return this.poster;
    }

    @Nullable
    public final List<VideoSource> component4() {
        return this.sources;
    }

    @NotNull
    public final VideoData copy(@Nullable String id, @Nullable String title, @Nullable String poster, @Nullable List<VideoSource> sources) {
        return new VideoData(id, title, poster, sources);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoData)) {
            return false;
        }
        VideoData videoData = (VideoData) other;
        return Intrinsics.areEqual(this.id, videoData.id) && Intrinsics.areEqual(this.title, videoData.title) && Intrinsics.areEqual(this.poster, videoData.poster) && Intrinsics.areEqual(this.sources, videoData.sources);
    }

    public int hashCode() {
        return ((((((this.id == null ? 0 : this.id.hashCode()) * 31) + (this.title == null ? 0 : this.title.hashCode())) * 31) + (this.poster == null ? 0 : this.poster.hashCode())) * 31) + (this.sources != null ? this.sources.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VideoData(id=" + this.id + ", title=" + this.title + ", poster=" + this.poster + ", sources=" + this.sources + ')';
    }

    public VideoData(@Nullable String id, @Nullable String title, @Nullable String poster, @Nullable List<VideoSource> list) {
        this.id = id;
        this.title = title;
        this.poster = poster;
        this.sources = list;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getPoster() {
        return this.poster;
    }

    @Nullable
    public final List<VideoSource> getSources() {
        return this.sources;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }
}
