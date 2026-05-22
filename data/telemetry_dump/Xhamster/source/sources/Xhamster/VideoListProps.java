package Xhamster;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Xhamster/classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"LXhamster/VideoListProps;", "", "videoThumbProps", "", "LXhamster/VideoThumbProps;", "<init>", "(Ljava/util/List;)V", "getVideoThumbProps", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class VideoListProps {

    @Nullable
    private final List<VideoThumbProps> videoThumbProps;

    /* JADX WARN: Illegal instructions before constructor call */
    public VideoListProps() {
        List list = null;
        this(list, 1, list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Xhamster.VideoListProps */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoListProps copy$default(VideoListProps videoListProps, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = videoListProps.videoThumbProps;
        }
        return videoListProps.copy(list);
    }

    @Nullable
    public final List<VideoThumbProps> component1() {
        return this.videoThumbProps;
    }

    @NotNull
    public final VideoListProps copy(@Nullable List<VideoThumbProps> videoThumbProps) {
        return new VideoListProps(videoThumbProps);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VideoListProps) && Intrinsics.areEqual(this.videoThumbProps, ((VideoListProps) other).videoThumbProps);
    }

    public int hashCode() {
        if (this.videoThumbProps == null) {
            return 0;
        }
        return this.videoThumbProps.hashCode();
    }

    @NotNull
    public String toString() {
        return "VideoListProps(videoThumbProps=" + this.videoThumbProps + ')';
    }

    public VideoListProps(@Nullable List<VideoThumbProps> list) {
        this.videoThumbProps = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED] (LINE:106)) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
     A[MD:(java.util.List<Xhamster.VideoThumbProps>):void (m)] (LINE:106) call: Xhamster.VideoListProps.<init>(java.util.List):void type: THIS */
    public /* synthetic */ VideoListProps(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    @Nullable
    public final List<VideoThumbProps> getVideoThumbProps() {
        return this.videoThumbProps;
    }
}
