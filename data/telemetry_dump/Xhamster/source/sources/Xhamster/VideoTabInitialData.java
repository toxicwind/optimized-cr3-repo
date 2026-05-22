package Xhamster;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Xhamster/classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"LXhamster/VideoTabInitialData;", "", "videoListProps", "LXhamster/VideoListProps;", "<init>", "(LXhamster/VideoListProps;)V", "getVideoListProps", "()LXhamster/VideoListProps;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class VideoTabInitialData {

    @Nullable
    private final VideoListProps videoListProps;

    /* JADX WARN: Illegal instructions before constructor call */
    public VideoTabInitialData() {
        VideoListProps videoListProps = null;
        this(videoListProps, 1, videoListProps);
    }

    public static /* synthetic */ VideoTabInitialData copy$default(VideoTabInitialData videoTabInitialData, VideoListProps videoListProps, int i, Object obj) {
        if ((i & 1) != 0) {
            videoListProps = videoTabInitialData.videoListProps;
        }
        return videoTabInitialData.copy(videoListProps);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VideoListProps getVideoListProps() {
        return this.videoListProps;
    }

    @NotNull
    public final VideoTabInitialData copy(@Nullable VideoListProps videoListProps) {
        return new VideoTabInitialData(videoListProps);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VideoTabInitialData) && Intrinsics.areEqual(this.videoListProps, ((VideoTabInitialData) other).videoListProps);
    }

    public int hashCode() {
        if (this.videoListProps == null) {
            return 0;
        }
        return this.videoListProps.hashCode();
    }

    @NotNull
    public String toString() {
        return "VideoTabInitialData(videoListProps=" + this.videoListProps + ')';
    }

    public VideoTabInitialData(@Nullable VideoListProps videoListProps) {
        this.videoListProps = videoListProps;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (wrap:Xhamster.VideoListProps:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED] (LINE:98)) != (0 int)) ? (null Xhamster.VideoListProps) : (r1v0 Xhamster.VideoListProps))
     A[MD:(Xhamster.VideoListProps):void (m)] (LINE:98) call: Xhamster.VideoTabInitialData.<init>(Xhamster.VideoListProps):void type: THIS */
    public /* synthetic */ VideoTabInitialData(VideoListProps videoListProps, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : videoListProps);
    }

    @Nullable
    public final VideoListProps getVideoListProps() {
        return this.videoListProps;
    }
}
