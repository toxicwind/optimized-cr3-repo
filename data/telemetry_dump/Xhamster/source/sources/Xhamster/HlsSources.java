package Xhamster;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Xhamster/classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"LXhamster/HlsSources;", "", "h264", "LXhamster/HlsSource;", "<init>", "(LXhamster/HlsSource;)V", "getH264", "()LXhamster/HlsSource;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class HlsSources {

    @Nullable
    private final HlsSource h264;

    /* JADX WARN: Illegal instructions before constructor call */
    public HlsSources() {
        HlsSource hlsSource = null;
        this(hlsSource, 1, hlsSource);
    }

    public static /* synthetic */ HlsSources copy$default(HlsSources hlsSources, HlsSource hlsSource, int i, Object obj) {
        if ((i & 1) != 0) {
            hlsSource = hlsSources.h264;
        }
        return hlsSources.copy(hlsSource);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HlsSource getH264() {
        return this.h264;
    }

    @NotNull
    public final HlsSources copy(@Nullable HlsSource h264) {
        return new HlsSources(h264);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HlsSources) && Intrinsics.areEqual(this.h264, ((HlsSources) other).h264);
    }

    public int hashCode() {
        if (this.h264 == null) {
            return 0;
        }
        return this.h264.hashCode();
    }

    @NotNull
    public String toString() {
        return "HlsSources(h264=" + this.h264 + ')';
    }

    public HlsSources(@Nullable HlsSource h264) {
        this.h264 = h264;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (wrap:Xhamster.HlsSource:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED] (LINE:44)) != (0 int)) ? (null Xhamster.HlsSource) : (r1v0 Xhamster.HlsSource))
     A[MD:(Xhamster.HlsSource):void (m)] (LINE:44) call: Xhamster.HlsSources.<init>(Xhamster.HlsSource):void type: THIS */
    public /* synthetic */ HlsSources(HlsSource hlsSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hlsSource);
    }

    @Nullable
    public final HlsSource getH264() {
        return this.h264;
    }
}
