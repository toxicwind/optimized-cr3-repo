package Xhamster;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Xhamster/classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"LXhamster/VideoThumbProps;", "", "title", "", "pageURL", "thumbUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPageURL", "getThumbUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class VideoThumbProps {

    @Nullable
    private final String pageURL;

    @JsonProperty("thumbURL")
    @Nullable
    private final String thumbUrl;

    @Nullable
    private final String title;

    public static /* synthetic */ VideoThumbProps copy$default(VideoThumbProps videoThumbProps, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoThumbProps.title;
        }
        if ((i & 2) != 0) {
            str2 = videoThumbProps.pageURL;
        }
        if ((i & 4) != 0) {
            str3 = videoThumbProps.thumbUrl;
        }
        return videoThumbProps.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageURL() {
        return this.pageURL;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getThumbUrl() {
        return this.thumbUrl;
    }

    @NotNull
    public final VideoThumbProps copy(@Nullable String title, @Nullable String pageURL, @JsonProperty("thumbURL") @Nullable String thumbUrl) {
        return new VideoThumbProps(title, pageURL, thumbUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoThumbProps)) {
            return false;
        }
        VideoThumbProps videoThumbProps = (VideoThumbProps) other;
        return Intrinsics.areEqual(this.title, videoThumbProps.title) && Intrinsics.areEqual(this.pageURL, videoThumbProps.pageURL) && Intrinsics.areEqual(this.thumbUrl, videoThumbProps.thumbUrl);
    }

    public int hashCode() {
        return ((((this.title == null ? 0 : this.title.hashCode()) * 31) + (this.pageURL == null ? 0 : this.pageURL.hashCode())) * 31) + (this.thumbUrl != null ? this.thumbUrl.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VideoThumbProps(title=" + this.title + ", pageURL=" + this.pageURL + ", thumbUrl=" + this.thumbUrl + ')';
    }

    public VideoThumbProps(@Nullable String title, @Nullable String pageURL, @JsonProperty("thumbURL") @Nullable String thumbUrl) {
        this.title = title;
        this.pageURL = pageURL;
        this.thumbUrl = thumbUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getPageURL() {
        return this.pageURL;
    }

    @Nullable
    public final String getThumbUrl() {
        return this.thumbUrl;
    }
}
