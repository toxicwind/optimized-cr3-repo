package Xhamster;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Xhamster/classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"LXhamster/VideoEntity;", "", "title", "", "description", "thumbBig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getThumbBig", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class VideoEntity {

    @Nullable
    private final String description;

    @Nullable
    private final String thumbBig;

    @Nullable
    private final String title;

    public VideoEntity() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ VideoEntity copy$default(VideoEntity videoEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoEntity.title;
        }
        if ((i & 2) != 0) {
            str2 = videoEntity.description;
        }
        if ((i & 4) != 0) {
            str3 = videoEntity.thumbBig;
        }
        return videoEntity.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getThumbBig() {
        return this.thumbBig;
    }

    @NotNull
    public final VideoEntity copy(@Nullable String title, @Nullable String description, @Nullable String thumbBig) {
        return new VideoEntity(title, description, thumbBig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoEntity)) {
            return false;
        }
        VideoEntity videoEntity = (VideoEntity) other;
        return Intrinsics.areEqual(this.title, videoEntity.title) && Intrinsics.areEqual(this.description, videoEntity.description) && Intrinsics.areEqual(this.thumbBig, videoEntity.thumbBig);
    }

    public int hashCode() {
        return ((((this.title == null ? 0 : this.title.hashCode()) * 31) + (this.description == null ? 0 : this.description.hashCode())) * 31) + (this.thumbBig != null ? this.thumbBig.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VideoEntity(title=" + this.title + ", description=" + this.description + ", thumbBig=" + this.thumbBig + ')';
    }

    public VideoEntity(@Nullable String title, @Nullable String description, @Nullable String thumbBig) {
        this.title = title;
        this.description = description;
        this.thumbBig = thumbBig;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
      (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED] (LINE:79)) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
      (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED] (LINE:79)) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
      (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED] (LINE:79)) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
     A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:79) call: Xhamster.VideoEntity.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [79=4] */
    public /* synthetic */ VideoEntity(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getThumbBig() {
        return this.thumbBig;
    }
}
