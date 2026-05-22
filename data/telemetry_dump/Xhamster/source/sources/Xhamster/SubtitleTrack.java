package Xhamster;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Xhamster/classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"LXhamster/SubtitleTrack;", "", "label", "", "lang", "urls", "LXhamster/SubtitleUrls;", "<init>", "(Ljava/lang/String;Ljava/lang/String;LXhamster/SubtitleUrls;)V", "getLabel", "()Ljava/lang/String;", "getLang", "getUrls", "()LXhamster/SubtitleUrls;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SubtitleTrack {

    @Nullable
    private final String label;

    @Nullable
    private final String lang;

    @Nullable
    private final SubtitleUrls urls;

    public SubtitleTrack() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SubtitleTrack copy$default(SubtitleTrack subtitleTrack, String str, String str2, SubtitleUrls subtitleUrls, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subtitleTrack.label;
        }
        if ((i & 2) != 0) {
            str2 = subtitleTrack.lang;
        }
        if ((i & 4) != 0) {
            subtitleUrls = subtitleTrack.urls;
        }
        return subtitleTrack.copy(str, str2, subtitleUrls);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SubtitleUrls getUrls() {
        return this.urls;
    }

    @NotNull
    public final SubtitleTrack copy(@Nullable String label, @Nullable String lang, @Nullable SubtitleUrls urls) {
        return new SubtitleTrack(label, lang, urls);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubtitleTrack)) {
            return false;
        }
        SubtitleTrack subtitleTrack = (SubtitleTrack) other;
        return Intrinsics.areEqual(this.label, subtitleTrack.label) && Intrinsics.areEqual(this.lang, subtitleTrack.lang) && Intrinsics.areEqual(this.urls, subtitleTrack.urls);
    }

    public int hashCode() {
        return ((((this.label == null ? 0 : this.label.hashCode()) * 31) + (this.lang == null ? 0 : this.lang.hashCode())) * 31) + (this.urls != null ? this.urls.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SubtitleTrack(label=" + this.label + ", lang=" + this.lang + ", urls=" + this.urls + ')';
    }

    public SubtitleTrack(@Nullable String label, @Nullable String lang, @Nullable SubtitleUrls urls) {
        this.label = label;
        this.lang = lang;
        this.urls = urls;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
      (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED] (LINE:69)) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
      (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED] (LINE:69)) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
      (wrap:Xhamster.SubtitleUrls:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED] (LINE:69)) != (0 int)) ? (null Xhamster.SubtitleUrls) : (r4v0 Xhamster.SubtitleUrls))
     A[MD:(java.lang.String, java.lang.String, Xhamster.SubtitleUrls):void (m)] (LINE:69) call: Xhamster.SubtitleTrack.<init>(java.lang.String, java.lang.String, Xhamster.SubtitleUrls):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [69=4] */
    public /* synthetic */ SubtitleTrack(String str, String str2, SubtitleUrls subtitleUrls, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : subtitleUrls);
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    public final SubtitleUrls getUrls() {
        return this.urls;
    }
}
