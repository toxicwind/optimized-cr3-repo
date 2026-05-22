package Xhamster;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Xhamster/classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"LXhamster/VideoSources;", "", "hls", "LXhamster/HlsSources;", "standard", "LXhamster/StandardSources;", "<init>", "(LXhamster/HlsSources;LXhamster/StandardSources;)V", "getHls", "()LXhamster/HlsSources;", "getStandard", "()LXhamster/StandardSources;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class VideoSources {

    @Nullable
    private final HlsSources hls;

    @Nullable
    private final StandardSources standard;

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public VideoSources() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VideoSources copy$default(VideoSources videoSources, HlsSources hlsSources, StandardSources standardSources, int i, Object obj) {
        if ((i & 1) != 0) {
            hlsSources = videoSources.hls;
        }
        if ((i & 2) != 0) {
            standardSources = videoSources.standard;
        }
        return videoSources.copy(hlsSources, standardSources);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HlsSources getHls() {
        return this.hls;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StandardSources getStandard() {
        return this.standard;
    }

    @NotNull
    public final VideoSources copy(@Nullable HlsSources hls, @Nullable StandardSources standard) {
        return new VideoSources(hls, standard);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoSources)) {
            return false;
        }
        VideoSources videoSources = (VideoSources) other;
        return Intrinsics.areEqual(this.hls, videoSources.hls) && Intrinsics.areEqual(this.standard, videoSources.standard);
    }

    public int hashCode() {
        return ((this.hls == null ? 0 : this.hls.hashCode()) * 31) + (this.standard != null ? this.standard.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VideoSources(hls=" + this.hls + ", standard=" + this.standard + ')';
    }

    public VideoSources(@Nullable HlsSources hls, @Nullable StandardSources standard) {
        this.hls = hls;
        this.standard = standard;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
      (wrap:Xhamster.HlsSources:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED] (LINE:39)) != (0 int)) ? (null Xhamster.HlsSources) : (r2v0 Xhamster.HlsSources))
      (wrap:Xhamster.StandardSources:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED] (LINE:39)) != (0 int)) ? (null Xhamster.StandardSources) : (r3v0 Xhamster.StandardSources))
     A[MD:(Xhamster.HlsSources, Xhamster.StandardSources):void (m)] (LINE:39) call: Xhamster.VideoSources.<init>(Xhamster.HlsSources, Xhamster.StandardSources):void type: THIS */
    public /* synthetic */ VideoSources(HlsSources hlsSources, StandardSources standardSources, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hlsSources, (i & 2) != 0 ? null : standardSources);
    }

    @Nullable
    public final HlsSources getHls() {
        return this.hls;
    }

    @Nullable
    public final StandardSources getStandard() {
        return this.standard;
    }
}
