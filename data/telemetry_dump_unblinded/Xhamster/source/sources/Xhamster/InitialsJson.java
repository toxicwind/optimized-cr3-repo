package Xhamster;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump_unblinded/Xhamster/classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rH\u00c6\u0003JQ\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010&\u001a\u00020'H\u00d6\u0081\u0004J\n\u0010(\u001a\u00020)H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006*"}, d2 = {"LXhamster/InitialsJson;", "", "xplayerSettings", "LXhamster/XPlayerSettings;", "videoEntity", "LXhamster/VideoEntity;", "videoTagsComponent", "LXhamster/VideoTagsComponent;", "relatedVideos", "LXhamster/RelatedVideos;", "layoutPage", "LXhamster/LayoutPage;", "searchResult", "LXhamster/SearchResult;", "<init>", "(LXhamster/XPlayerSettings;LXhamster/VideoEntity;LXhamster/VideoTagsComponent;LXhamster/RelatedVideos;LXhamster/LayoutPage;LXhamster/SearchResult;)V", "getXplayerSettings", "()LXhamster/XPlayerSettings;", "getVideoEntity", "()LXhamster/VideoEntity;", "getVideoTagsComponent", "()LXhamster/VideoTagsComponent;", "getRelatedVideos", "()LXhamster/RelatedVideos;", "getLayoutPage", "()LXhamster/LayoutPage;", "getSearchResult", "()LXhamster/SearchResult;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InitialsJson {

    @org.jetbrains.annotations.Nullable
    private final Xhamster.LayoutPage layoutPage;

    @org.jetbrains.annotations.Nullable
    private final Xhamster.RelatedVideos relatedVideos;

    @org.jetbrains.annotations.Nullable
    private final Xhamster.SearchResult searchResult;

    @org.jetbrains.annotations.Nullable
    private final Xhamster.VideoEntity videoEntity;

    @org.jetbrains.annotations.Nullable
    private final Xhamster.VideoTagsComponent videoTagsComponent;

    @org.jetbrains.annotations.Nullable
    private final Xhamster.XPlayerSettings xplayerSettings;

    public InitialsJson() {
            r9 = this;
            r7 = 63
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public InitialsJson(@org.jetbrains.annotations.Nullable Xhamster.XPlayerSettings r1, @org.jetbrains.annotations.Nullable Xhamster.VideoEntity r2, @org.jetbrains.annotations.Nullable Xhamster.VideoTagsComponent r3, @org.jetbrains.annotations.Nullable Xhamster.RelatedVideos r4, @org.jetbrains.annotations.Nullable Xhamster.LayoutPage r5, @org.jetbrains.annotations.Nullable Xhamster.SearchResult r6) {
            r0 = this;
            r0.<init>()
            r0.xplayerSettings = r1
            r0.videoEntity = r2
            r0.videoTagsComponent = r3
            r0.relatedVideos = r4
            r0.layoutPage = r5
            r0.searchResult = r6
            return
    }

    public /* synthetic */ InitialsJson(Xhamster.XPlayerSettings r2, Xhamster.VideoEntity r3, Xhamster.VideoTagsComponent r4, Xhamster.RelatedVideos r5, Xhamster.LayoutPage r6, Xhamster.SearchResult r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            r1 = this;
            r9 = r8 & 1
            r0 = 0
            if (r9 == 0) goto L6
            r2 = r0
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L15
            r5 = r0
        L15:
            r9 = r8 & 16
            if (r9 == 0) goto L1a
            r6 = r0
        L1a:
            r8 = r8 & 32
            if (r8 == 0) goto L20
            r8 = r0
            goto L21
        L20:
            r8 = r7
        L21:
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
    }

    public static /* synthetic */ Xhamster.InitialsJson copy$default(Xhamster.InitialsJson r0, Xhamster.XPlayerSettings r1, Xhamster.VideoEntity r2, Xhamster.VideoTagsComponent r3, Xhamster.RelatedVideos r4, Xhamster.LayoutPage r5, Xhamster.SearchResult r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L6
            Xhamster.XPlayerSettings r1 = r0.xplayerSettings
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            Xhamster.VideoEntity r2 = r0.videoEntity
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L12
            Xhamster.VideoTagsComponent r3 = r0.videoTagsComponent
        L12:
            r8 = r7 & 8
            if (r8 == 0) goto L18
            Xhamster.RelatedVideos r4 = r0.relatedVideos
        L18:
            r8 = r7 & 16
            if (r8 == 0) goto L1e
            Xhamster.LayoutPage r5 = r0.layoutPage
        L1e:
            r7 = r7 & 32
            if (r7 == 0) goto L24
            Xhamster.SearchResult r6 = r0.searchResult
        L24:
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            Xhamster.InitialsJson r0 = r2.copy(r3, r4, r5, r6, r7, r8)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.XPlayerSettings component1() {
            r1 = this;
            Xhamster.XPlayerSettings r0 = r1.xplayerSettings
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.VideoEntity component2() {
            r1 = this;
            Xhamster.VideoEntity r0 = r1.videoEntity
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.VideoTagsComponent component3() {
            r1 = this;
            Xhamster.VideoTagsComponent r0 = r1.videoTagsComponent
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.RelatedVideos component4() {
            r1 = this;
            Xhamster.RelatedVideos r0 = r1.relatedVideos
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.LayoutPage component5() {
            r1 = this;
            Xhamster.LayoutPage r0 = r1.layoutPage
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.SearchResult component6() {
            r1 = this;
            Xhamster.SearchResult r0 = r1.searchResult
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final Xhamster.InitialsJson copy(@org.jetbrains.annotations.Nullable Xhamster.XPlayerSettings r8, @org.jetbrains.annotations.Nullable Xhamster.VideoEntity r9, @org.jetbrains.annotations.Nullable Xhamster.VideoTagsComponent r10, @org.jetbrains.annotations.Nullable Xhamster.RelatedVideos r11, @org.jetbrains.annotations.Nullable Xhamster.LayoutPage r12, @org.jetbrains.annotations.Nullable Xhamster.SearchResult r13) {
            r7 = this;
            Xhamster.InitialsJson r0 = new Xhamster.InitialsJson
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof Xhamster.InitialsJson
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            Xhamster.InitialsJson r1 = (Xhamster.InitialsJson) r1
            Xhamster.XPlayerSettings r3 = r5.xplayerSettings
            Xhamster.XPlayerSettings r4 = r1.xplayerSettings
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L18
            return r2
        L18:
            Xhamster.VideoEntity r3 = r5.videoEntity
            Xhamster.VideoEntity r4 = r1.videoEntity
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L23
            return r2
        L23:
            Xhamster.VideoTagsComponent r3 = r5.videoTagsComponent
            Xhamster.VideoTagsComponent r4 = r1.videoTagsComponent
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L2e
            return r2
        L2e:
            Xhamster.RelatedVideos r3 = r5.relatedVideos
            Xhamster.RelatedVideos r4 = r1.relatedVideos
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L39
            return r2
        L39:
            Xhamster.LayoutPage r3 = r5.layoutPage
            Xhamster.LayoutPage r4 = r1.layoutPage
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L44
            return r2
        L44:
            Xhamster.SearchResult r3 = r5.searchResult
            Xhamster.SearchResult r1 = r1.searchResult
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 != 0) goto L4f
            return r2
        L4f:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.LayoutPage getLayoutPage() {
            r1 = this;
            Xhamster.LayoutPage r0 = r1.layoutPage
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.RelatedVideos getRelatedVideos() {
            r1 = this;
            Xhamster.RelatedVideos r0 = r1.relatedVideos
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.SearchResult getSearchResult() {
            r1 = this;
            Xhamster.SearchResult r0 = r1.searchResult
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.VideoEntity getVideoEntity() {
            r1 = this;
            Xhamster.VideoEntity r0 = r1.videoEntity
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.VideoTagsComponent getVideoTagsComponent() {
            r1 = this;
            Xhamster.VideoTagsComponent r0 = r1.videoTagsComponent
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final Xhamster.XPlayerSettings getXplayerSettings() {
            r1 = this;
            Xhamster.XPlayerSettings r0 = r1.xplayerSettings
            return r0
    }

    public int hashCode() {
            r4 = this;
            Xhamster.XPlayerSettings r0 = r4.xplayerSettings
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Ld
        L7:
            Xhamster.XPlayerSettings r0 = r4.xplayerSettings
            int r0 = r0.hashCode()
        Ld:
            int r2 = r0 * 31
            Xhamster.VideoEntity r3 = r4.videoEntity
            if (r3 != 0) goto L15
            r3 = 0
            goto L1b
        L15:
            Xhamster.VideoEntity r3 = r4.videoEntity
            int r3 = r3.hashCode()
        L1b:
            int r2 = r2 + r3
            int r0 = r2 * 31
            Xhamster.VideoTagsComponent r3 = r4.videoTagsComponent
            if (r3 != 0) goto L24
            r3 = 0
            goto L2a
        L24:
            Xhamster.VideoTagsComponent r3 = r4.videoTagsComponent
            int r3 = r3.hashCode()
        L2a:
            int r0 = r0 + r3
            int r2 = r0 * 31
            Xhamster.RelatedVideos r3 = r4.relatedVideos
            if (r3 != 0) goto L33
            r3 = 0
            goto L39
        L33:
            Xhamster.RelatedVideos r3 = r4.relatedVideos
            int r3 = r3.hashCode()
        L39:
            int r2 = r2 + r3
            int r0 = r2 * 31
            Xhamster.LayoutPage r3 = r4.layoutPage
            if (r3 != 0) goto L42
            r3 = 0
            goto L48
        L42:
            Xhamster.LayoutPage r3 = r4.layoutPage
            int r3 = r3.hashCode()
        L48:
            int r0 = r0 + r3
            int r2 = r0 * 31
            Xhamster.SearchResult r3 = r4.searchResult
            if (r3 != 0) goto L50
            goto L56
        L50:
            Xhamster.SearchResult r1 = r4.searchResult
            int r1 = r1.hashCode()
        L56:
            int r2 = r2 + r1
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "InitialsJson(xplayerSettings="
            java.lang.StringBuilder r0 = r0.append(r1)
            Xhamster.XPlayerSettings r1 = r2.xplayerSettings
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", videoEntity="
            java.lang.StringBuilder r0 = r0.append(r1)
            Xhamster.VideoEntity r1 = r2.videoEntity
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", videoTagsComponent="
            java.lang.StringBuilder r0 = r0.append(r1)
            Xhamster.VideoTagsComponent r1 = r2.videoTagsComponent
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", relatedVideos="
            java.lang.StringBuilder r0 = r0.append(r1)
            Xhamster.RelatedVideos r1 = r2.relatedVideos
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", layoutPage="
            java.lang.StringBuilder r0 = r0.append(r1)
            Xhamster.LayoutPage r1 = r2.layoutPage
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", searchResult="
            java.lang.StringBuilder r0 = r0.append(r1)
            Xhamster.SearchResult r1 = r2.searchResult
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
