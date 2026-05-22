package Xhamster;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Xhamster/classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"LXhamster/XPlayerSettings;", "", "sources", "LXhamster/VideoSources;", "poster", "LXhamster/Poster;", "subtitles", "LXhamster/Subtitles;", "<init>", "(LXhamster/VideoSources;LXhamster/Poster;LXhamster/Subtitles;)V", "getSources", "()LXhamster/VideoSources;", "getPoster", "()LXhamster/Poster;", "getSubtitles", "()LXhamster/Subtitles;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class XPlayerSettings {

    @Nullable
    private final Poster poster;

    @Nullable
    private final VideoSources sources;

    @Nullable
    private final Subtitles subtitles;

    public XPlayerSettings() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ XPlayerSettings copy$default(XPlayerSettings xPlayerSettings, VideoSources videoSources, Poster poster, Subtitles subtitles, int i, Object obj) {
        if ((i & 1) != 0) {
            videoSources = xPlayerSettings.sources;
        }
        if ((i & 2) != 0) {
            poster = xPlayerSettings.poster;
        }
        if ((i & 4) != 0) {
            subtitles = xPlayerSettings.subtitles;
        }
        return xPlayerSettings.copy(videoSources, poster, subtitles);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VideoSources getSources() {
        return this.sources;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Poster getPoster() {
        return this.poster;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Subtitles getSubtitles() {
        return this.subtitles;
    }

    @NotNull
    public final XPlayerSettings copy(@Nullable VideoSources sources, @Nullable Poster poster, @Nullable Subtitles subtitles) {
        return new XPlayerSettings(sources, poster, subtitles);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XPlayerSettings)) {
            return false;
        }
        XPlayerSettings xPlayerSettings = (XPlayerSettings) other;
        return Intrinsics.areEqual(this.sources, xPlayerSettings.sources) && Intrinsics.areEqual(this.poster, xPlayerSettings.poster) && Intrinsics.areEqual(this.subtitles, xPlayerSettings.subtitles);
    }

    public int hashCode() {
        return ((((this.sources == null ? 0 : this.sources.hashCode()) * 31) + (this.poster == null ? 0 : this.poster.hashCode())) * 31) + (this.subtitles != null ? this.subtitles.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "XPlayerSettings(sources=" + this.sources + ", poster=" + this.poster + ", subtitles=" + this.subtitles + ')';
    }

    public XPlayerSettings(@Nullable VideoSources sources, @Nullable Poster poster, @Nullable Subtitles subtitles) {
        this.sources = sources;
        this.poster = poster;
        this.subtitles = subtitles;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
      (wrap:Xhamster.VideoSources:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED] (LINE:33)) != (0 int)) ? (null Xhamster.VideoSources) : (r2v0 Xhamster.VideoSources))
      (wrap:Xhamster.Poster:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED] (LINE:33)) != (0 int)) ? (null Xhamster.Poster) : (r3v0 Xhamster.Poster))
      (wrap:Xhamster.Subtitles:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED] (LINE:33)) != (0 int)) ? (null Xhamster.Subtitles) : (r4v0 Xhamster.Subtitles))
     A[MD:(Xhamster.VideoSources, Xhamster.Poster, Xhamster.Subtitles):void (m)] (LINE:33) call: Xhamster.XPlayerSettings.<init>(Xhamster.VideoSources, Xhamster.Poster, Xhamster.Subtitles):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [33=4] */
    public /* synthetic */ XPlayerSettings(VideoSources videoSources, Poster poster, Subtitles subtitles, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : videoSources, (i & 2) != 0 ? null : poster, (i & 4) != 0 ? null : subtitles);
    }

    @Nullable
    public final VideoSources getSources() {
        return this.sources;
    }

    @Nullable
    public final Poster getPoster() {
        return this.poster;
    }

    @Nullable
    public final Subtitles getSubtitles() {
        return this.subtitles;
    }
}
