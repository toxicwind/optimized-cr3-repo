package Xhamster;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Xhamster/classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020'HÖ\u0081\u0004J\n\u0010(\u001a\u00020)HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"LXhamster/InitialsJson;", "", "xplayerSettings", "LXhamster/XPlayerSettings;", "videoEntity", "LXhamster/VideoEntity;", "videoTagsComponent", "LXhamster/VideoTagsComponent;", "relatedVideos", "LXhamster/RelatedVideos;", "layoutPage", "LXhamster/LayoutPage;", "searchResult", "LXhamster/SearchResult;", "<init>", "(LXhamster/XPlayerSettings;LXhamster/VideoEntity;LXhamster/VideoTagsComponent;LXhamster/RelatedVideos;LXhamster/LayoutPage;LXhamster/SearchResult;)V", "getXplayerSettings", "()LXhamster/XPlayerSettings;", "getVideoEntity", "()LXhamster/VideoEntity;", "getVideoTagsComponent", "()LXhamster/VideoTagsComponent;", "getRelatedVideos", "()LXhamster/RelatedVideos;", "getLayoutPage", "()LXhamster/LayoutPage;", "getSearchResult", "()LXhamster/SearchResult;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class InitialsJson {

    @Nullable
    private final LayoutPage layoutPage;

    @Nullable
    private final RelatedVideos relatedVideos;

    @Nullable
    private final SearchResult searchResult;

    @Nullable
    private final VideoEntity videoEntity;

    @Nullable
    private final VideoTagsComponent videoTagsComponent;

    @Nullable
    private final XPlayerSettings xplayerSettings;

    public InitialsJson() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ InitialsJson copy$default(InitialsJson initialsJson, XPlayerSettings xPlayerSettings, VideoEntity videoEntity, VideoTagsComponent videoTagsComponent, RelatedVideos relatedVideos, LayoutPage layoutPage, SearchResult searchResult, int i, Object obj) {
        if ((i & 1) != 0) {
            xPlayerSettings = initialsJson.xplayerSettings;
        }
        if ((i & 2) != 0) {
            videoEntity = initialsJson.videoEntity;
        }
        if ((i & 4) != 0) {
            videoTagsComponent = initialsJson.videoTagsComponent;
        }
        if ((i & 8) != 0) {
            relatedVideos = initialsJson.relatedVideos;
        }
        if ((i & 16) != 0) {
            layoutPage = initialsJson.layoutPage;
        }
        if ((i & 32) != 0) {
            searchResult = initialsJson.searchResult;
        }
        LayoutPage layoutPage2 = layoutPage;
        SearchResult searchResult2 = searchResult;
        return initialsJson.copy(xPlayerSettings, videoEntity, videoTagsComponent, relatedVideos, layoutPage2, searchResult2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final XPlayerSettings getXplayerSettings() {
        return this.xplayerSettings;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VideoEntity getVideoEntity() {
        return this.videoEntity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VideoTagsComponent getVideoTagsComponent() {
        return this.videoTagsComponent;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RelatedVideos getRelatedVideos() {
        return this.relatedVideos;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LayoutPage getLayoutPage() {
        return this.layoutPage;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SearchResult getSearchResult() {
        return this.searchResult;
    }

    @NotNull
    public final InitialsJson copy(@Nullable XPlayerSettings xplayerSettings, @Nullable VideoEntity videoEntity, @Nullable VideoTagsComponent videoTagsComponent, @Nullable RelatedVideos relatedVideos, @Nullable LayoutPage layoutPage, @Nullable SearchResult searchResult) {
        return new InitialsJson(xplayerSettings, videoEntity, videoTagsComponent, relatedVideos, layoutPage, searchResult);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitialsJson)) {
            return false;
        }
        InitialsJson initialsJson = (InitialsJson) other;
        return Intrinsics.areEqual(this.xplayerSettings, initialsJson.xplayerSettings) && Intrinsics.areEqual(this.videoEntity, initialsJson.videoEntity) && Intrinsics.areEqual(this.videoTagsComponent, initialsJson.videoTagsComponent) && Intrinsics.areEqual(this.relatedVideos, initialsJson.relatedVideos) && Intrinsics.areEqual(this.layoutPage, initialsJson.layoutPage) && Intrinsics.areEqual(this.searchResult, initialsJson.searchResult);
    }

    public int hashCode() {
        return ((((((((((this.xplayerSettings == null ? 0 : this.xplayerSettings.hashCode()) * 31) + (this.videoEntity == null ? 0 : this.videoEntity.hashCode())) * 31) + (this.videoTagsComponent == null ? 0 : this.videoTagsComponent.hashCode())) * 31) + (this.relatedVideos == null ? 0 : this.relatedVideos.hashCode())) * 31) + (this.layoutPage == null ? 0 : this.layoutPage.hashCode())) * 31) + (this.searchResult != null ? this.searchResult.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InitialsJson(xplayerSettings=" + this.xplayerSettings + ", videoEntity=" + this.videoEntity + ", videoTagsComponent=" + this.videoTagsComponent + ", relatedVideos=" + this.relatedVideos + ", layoutPage=" + this.layoutPage + ", searchResult=" + this.searchResult + ')';
    }

    public InitialsJson(@Nullable XPlayerSettings xplayerSettings, @Nullable VideoEntity videoEntity, @Nullable VideoTagsComponent videoTagsComponent, @Nullable RelatedVideos relatedVideos, @Nullable LayoutPage layoutPage, @Nullable SearchResult searchResult) {
        this.xplayerSettings = xplayerSettings;
        this.videoEntity = videoEntity;
        this.videoTagsComponent = videoTagsComponent;
        this.relatedVideos = relatedVideos;
        this.layoutPage = layoutPage;
        this.searchResult = searchResult;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
      (wrap:Xhamster.XPlayerSettings:?: TERNARY null = ((wrap:int:0x0000: ARITH (r8v0 int) & (1 int) A[WRAPPED] (LINE:21)) != (0 int)) ? (null Xhamster.XPlayerSettings) : (r2v0 Xhamster.XPlayerSettings))
      (wrap:Xhamster.VideoEntity:?: TERNARY null = ((wrap:int:0x0006: ARITH (r8v0 int) & (2 int) A[WRAPPED] (LINE:21)) != (0 int)) ? (null Xhamster.VideoEntity) : (r3v0 Xhamster.VideoEntity))
      (wrap:Xhamster.VideoTagsComponent:?: TERNARY null = ((wrap:int:0x000b: ARITH (r8v0 int) & (4 int) A[WRAPPED] (LINE:21)) != (0 int)) ? (null Xhamster.VideoTagsComponent) : (r4v0 Xhamster.VideoTagsComponent))
      (wrap:Xhamster.RelatedVideos:?: TERNARY null = ((wrap:int:0x0010: ARITH (r8v0 int) & (8 int) A[WRAPPED] (LINE:21)) != (0 int)) ? (null Xhamster.RelatedVideos) : (r5v0 Xhamster.RelatedVideos))
      (wrap:Xhamster.LayoutPage:?: TERNARY null = ((wrap:int:0x0015: ARITH (r8v0 int) & (16 int) A[WRAPPED] (LINE:21)) != (0 int)) ? (null Xhamster.LayoutPage) : (r6v0 Xhamster.LayoutPage))
      (wrap:Xhamster.SearchResult:?: TERNARY null = ((wrap:int:0x001a: ARITH (r8v0 int) & (32 int) A[WRAPPED] (LINE:21)) != (0 int)) ? (null Xhamster.SearchResult) : (r7v0 Xhamster.SearchResult))
     A[MD:(Xhamster.XPlayerSettings, Xhamster.VideoEntity, Xhamster.VideoTagsComponent, Xhamster.RelatedVideos, Xhamster.LayoutPage, Xhamster.SearchResult):void (m)] (LINE:30) call: Xhamster.InitialsJson.<init>(Xhamster.XPlayerSettings, Xhamster.VideoEntity, Xhamster.VideoTagsComponent, Xhamster.RelatedVideos, Xhamster.LayoutPage, Xhamster.SearchResult):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [21=7] */
    public /* synthetic */ InitialsJson(XPlayerSettings xPlayerSettings, VideoEntity videoEntity, VideoTagsComponent videoTagsComponent, RelatedVideos relatedVideos, LayoutPage layoutPage, SearchResult searchResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : xPlayerSettings, (i & 2) != 0 ? null : videoEntity, (i & 4) != 0 ? null : videoTagsComponent, (i & 8) != 0 ? null : relatedVideos, (i & 16) != 0 ? null : layoutPage, (i & 32) != 0 ? null : searchResult);
    }

    @Nullable
    public final XPlayerSettings getXplayerSettings() {
        return this.xplayerSettings;
    }

    @Nullable
    public final VideoEntity getVideoEntity() {
        return this.videoEntity;
    }

    @Nullable
    public final VideoTagsComponent getVideoTagsComponent() {
        return this.videoTagsComponent;
    }

    @Nullable
    public final RelatedVideos getRelatedVideos() {
        return this.relatedVideos;
    }

    @Nullable
    public final LayoutPage getLayoutPage() {
        return this.layoutPage;
    }

    @Nullable
    public final SearchResult getSearchResult() {
        return this.searchResult;
    }
}
