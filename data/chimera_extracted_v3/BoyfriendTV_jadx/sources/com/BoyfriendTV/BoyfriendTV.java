package com.BoyfriendTV;

/* JADX INFO: compiled from: BoyfriendTV.kt */
/* JADX INFO: loaded from: /tmp/tmp.7pP8twI7Qn/classes.dex */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u001f\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0096@\u00a2\u0006\u0002\u0010&J\u000e\u0010'\u001a\u0004\u0018\u00010(*\u00020)H\u0002J\u000e\u0010*\u001a\u0004\u0018\u00010(*\u00020)H\u0002J\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u001d2\u0006\u0010,\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010-J\u0018\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010-JF\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000e2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207052\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020705H\u0096@\u00a2\u0006\u0002\u0010:R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u0006;"}, d2 = {"Lcom/BoyfriendTV/BoyfriendTV;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "hasDownloadSupport", "getHasDownloadSupport", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lorg/jsoup/nodes/Element;", "toRecommendResult", "search", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "BoyfriendTV"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBoyfriendTV.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoyfriendTV.kt\ncom/BoyfriendTV/BoyfriendTV\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1642#2,10:212\n1915#2:222\n1916#2:224\n1652#2:225\n1642#2,10:226\n1915#2:236\n1916#2:238\n1652#2:239\n1586#2:241\n1661#2,3:242\n777#2:245\n873#2,2:246\n1642#2,10:248\n1915#2:258\n1916#2:260\n1652#2:261\n1915#2,2:262\n1#3:223\n1#3:237\n1#3:240\n1#3:259\n*S KotlinDebug\n*F\n+ 1 BoyfriendTV.kt\ncom/BoyfriendTV/BoyfriendTV\n*L\n46#1:212,10\n46#1:222\n46#1:224\n46#1:225\n79#1:226,10\n79#1:236\n79#1:238\n79#1:239\n97#1:241\n97#1:242,3\n98#1:245\n98#1:246,2\n100#1:248,10\n100#1:258\n100#1:260\n100#1:261\n207#1:262,2\n46#1:223\n79#1:237\n100#1:259\n*E\n"})
public final class BoyfriendTV extends com.lagradost.cloudstream3.MainAPI {
    private final boolean hasDownloadSupport;
    private final boolean hasMainPage;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.lagradost.cloudstream3.MainPageData> mainPage;

    @org.jetbrains.annotations.NotNull
    private java.lang.String mainUrl;

    @org.jetbrains.annotations.NotNull
    private java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final java.util.Set<com.lagradost.cloudstream3.TvType> supportedTypes;

    @org.jetbrains.annotations.NotNull
    private final com.lagradost.cloudstream3.VPNStatus vpnStatus;

    /* JADX INFO: renamed from: com.BoyfriendTV.BoyfriendTV$getMainPage$1 */
    /* JADX INFO: compiled from: BoyfriendTV.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.BoyfriendTV.BoyfriendTV", f = "BoyfriendTV.kt", i = {0, 0, 0}, l = {44}, m = "getMainPage", n = {"request", "pageUrl", "page"}, nl = {46}, s = {"L$0", "L$1", "I$0"}, v = 2)
    static final class C00001 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.BoyfriendTV.BoyfriendTV this$0;

        C00001(com.BoyfriendTV.BoyfriendTV r1, kotlin.coroutines.Continuation<? super com.BoyfriendTV.BoyfriendTV.C00001> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                r4 = this;
                r4.result = r5
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r4.label = r0
                com.BoyfriendTV.BoyfriendTV r0 = r4.this$0
                r1 = 0
                r2 = r4
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r3 = 0
                java.lang.Object r0 = r0.getMainPage(r3, r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: com.BoyfriendTV.BoyfriendTV$load$1 */
    /* JADX INFO: compiled from: BoyfriendTV.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.BoyfriendTV.BoyfriendTV", f = "BoyfriendTV.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {84, 104}, m = "load", n = {"url", "url", "document", "ldJsonText", "ldJson", "title", "description", "poster", "tags", "recommendations"}, nl = {86, -1}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"}, v = 2)
    static final class C00011 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        java.lang.Object L$6;
        java.lang.Object L$7;
        java.lang.Object L$8;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.BoyfriendTV.BoyfriendTV this$0;

        C00011(com.BoyfriendTV.BoyfriendTV r1, kotlin.coroutines.Continuation<? super com.BoyfriendTV.BoyfriendTV.C00011> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                r3 = this;
                r3.result = r4
                int r0 = r3.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r3.label = r0
                com.BoyfriendTV.BoyfriendTV r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.load(r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: com.BoyfriendTV.BoyfriendTV$load$2 */
    /* JADX INFO: compiled from: BoyfriendTV.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.BoyfriendTV.BoyfriendTV$load$2", f = "BoyfriendTV.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00022 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.lagradost.cloudstream3.MovieLoadResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String $description;
        final /* synthetic */ java.lang.String $poster;
        final /* synthetic */ java.util.List<com.lagradost.cloudstream3.SearchResponse> $recommendations;
        final /* synthetic */ java.util.List<java.lang.String> $tags;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        C00022(java.lang.String r2, java.lang.String r3, java.util.List<java.lang.String> r4, java.util.List<? extends com.lagradost.cloudstream3.SearchResponse> r5, kotlin.coroutines.Continuation<? super com.BoyfriendTV.BoyfriendTV.C00022> r6) {
                r1 = this;
                r1.$poster = r2
                r1.$description = r3
                r1.$tags = r4
                r1.$recommendations = r5
                r0 = 2
                r1.<init>(r0, r6)
                return
        }

        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r7, kotlin.coroutines.Continuation<?> r8) {
                r6 = this;
                com.BoyfriendTV.BoyfriendTV$load$2 r0 = new com.BoyfriendTV.BoyfriendTV$load$2
                java.lang.String r1 = r6.$poster
                java.lang.String r2 = r6.$description
                java.util.List<java.lang.String> r3 = r6.$tags
                java.util.List<com.lagradost.cloudstream3.SearchResponse> r4 = r6.$recommendations
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                r0.L$0 = r7
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        public final java.lang.Object invoke(com.lagradost.cloudstream3.MovieLoadResponse r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                com.BoyfriendTV.BoyfriendTV$load$2 r0 = (com.BoyfriendTV.BoyfriendTV.C00022) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
                r1 = this;
                com.lagradost.cloudstream3.MovieLoadResponse r2 = (com.lagradost.cloudstream3.MovieLoadResponse) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = r3.L$0
                com.lagradost.cloudstream3.MovieLoadResponse r0 = (com.lagradost.cloudstream3.MovieLoadResponse) r0
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.label
                switch(r1) {
                    case 0: goto L14;
                    default: goto Lc;
                }
            Lc:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L14:
                kotlin.ResultKt.throwOnFailure(r4)
                java.lang.String r1 = r3.$poster
                r0.setPosterUrl(r1)
                java.lang.String r1 = r3.$description
                r0.setPlot(r1)
                java.util.List<java.lang.String> r1 = r3.$tags
                r0.setTags(r1)
                java.util.List<com.lagradost.cloudstream3.SearchResponse> r1 = r3.$recommendations
                r0.setRecommendations(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    /* JADX INFO: renamed from: com.BoyfriendTV.BoyfriendTV$loadLinks$1 */
    /* JADX INFO: compiled from: BoyfriendTV.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.BoyfriendTV.BoyfriendTV", f = "BoyfriendTV.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {119, 136, 172, 193}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "isCasting", "data", "subtitleCallback", "callback", "html", "templateMatch", "templateUrl", "masterUrl", "isCasting", "data", "subtitleCallback", "callback", "html", "templateMatch", "templateUrl", "masterUrl", "masterContent", "links", "baseDomain", "lines", "currentResolution", "line", "variantPath", "fullVariantUrl", "isCasting", "quality", "data", "subtitleCallback", "callback", "html", "templateMatch", "templateUrl", "masterUrl", "masterContent", "links", "isCasting"}, nl = {125, 139, 177, 198}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$13", "L$14", "L$15", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0"}, v = 2)
    static final class C00031 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$10;
        java.lang.Object L$11;
        java.lang.Object L$12;
        java.lang.Object L$13;
        java.lang.Object L$14;
        java.lang.Object L$15;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        java.lang.Object L$6;
        java.lang.Object L$7;
        java.lang.Object L$8;
        java.lang.Object L$9;
        boolean Z$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.BoyfriendTV.BoyfriendTV this$0;

        C00031(com.BoyfriendTV.BoyfriendTV r1, kotlin.coroutines.Continuation<? super com.BoyfriendTV.BoyfriendTV.C00031> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                r7 = this;
                r7.result = r8
                int r0 = r7.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r7.label = r0
                com.BoyfriendTV.BoyfriendTV r1 = r7.this$0
                r5 = 0
                r6 = r7
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r2 = 0
                r3 = 0
                r4 = 0
                java.lang.Object r0 = r1.loadLinks(r2, r3, r4, r5, r6)
                return r0
        }
    }

    /* JADX INFO: renamed from: com.BoyfriendTV.BoyfriendTV$search$1 */
    /* JADX INFO: compiled from: BoyfriendTV.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.BoyfriendTV.BoyfriendTV", f = "BoyfriendTV.kt", i = {0, 0}, l = {78}, m = "search", n = {"query", "url"}, nl = {79}, s = {"L$0", "L$1"}, v = 2)
    static final class C00041 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.BoyfriendTV.BoyfriendTV this$0;

        C00041(com.BoyfriendTV.BoyfriendTV r1, kotlin.coroutines.Continuation<? super com.BoyfriendTV.BoyfriendTV.C00041> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                r3 = this;
                r3.result = r4
                int r0 = r3.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r3.label = r0
                com.BoyfriendTV.BoyfriendTV r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.search(r1, r2)
                return r0
        }
    }

    public BoyfriendTV() {
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "https://www.boyfriendtv.com"
            r5.mainUrl = r0
            java.lang.String r0 = "Boyfriendtv"
            r5.name = r0
            r0 = 1
            r5.hasMainPage = r0
            r5.hasDownloadSupport = r0
            com.lagradost.cloudstream3.VPNStatus r1 = com.lagradost.cloudstream3.VPNStatus.MightBeNeeded
            r5.vpnStatus = r1
            com.lagradost.cloudstream3.TvType r1 = com.lagradost.cloudstream3.TvType.NSFW
            java.util.Set r1 = kotlin.collections.SetsKt.setOf(r1)
            r5.supportedTypes = r1
            r1 = 14
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            java.lang.String r2 = ""
            java.lang.String r3 = "Trending"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "/?filter_quality=hd&s=&sort=newest"
            java.lang.String r3 = "M\u1edbi nh\u1ea5t"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            r1[r0] = r2
            java.lang.String r0 = "/?filter_quality=hd&s=&sort=most-popular"
            java.lang.String r2 = "Ph\u1ed5 bi\u1ebfn"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r0, r2)
            r4 = 2
            r1[r4] = r3
            java.lang.String r3 = "/search/?q=Vietnamese"
            java.lang.String r4 = "Vi\u1ec7t Nam"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r4 = 3
            r1[r4] = r3
            java.lang.String r3 = "/search/?q=asian&hot="
            java.lang.String r4 = "Asian"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r4 = 4
            r1[r4] = r3
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 5
            r1[r2] = r0
            java.lang.String r0 = "/search/?q=chinese&hot=&quality=hd"
            java.lang.String r2 = "Tung C\u1ee7a"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 6
            r1[r2] = r0
            java.lang.String r0 = "/tags/brazilian/?filter_quality=hd"
            java.lang.String r2 = "B\u1edd ra sin"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 7
            r1[r2] = r0
            java.lang.String r0 = "/tags/gangbang/?filter_quality=hd"
            java.lang.String r2 = "Ch\u1ecbch t\u1eadp th\u1ec3"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 8
            r1[r2] = r0
            java.lang.String r0 = "/tags/latinos/?filter_quality=hd"
            java.lang.String r2 = "M\u1ef9 da m\u00e0u"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 9
            r1[r2] = r0
            java.lang.String r0 = "/search/?q=facedownassup&quality=hd"
            java.lang.String r2 = "Face down Ass up"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 10
            r1[r2] = r0
            java.lang.String r0 = "/search/?q=sketchysex&quality=hd"
            java.lang.String r2 = "Sketchy Sex"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 11
            r1[r2] = r0
            java.lang.String r0 = "/search/?q=fraternity&quality=hd"
            java.lang.String r2 = "Fraternity X"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 12
            r1[r2] = r0
            java.lang.String r0 = "/search/?q=slamrush"
            java.lang.String r2 = "Slam Rush"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 13
            r1[r2] = r0
            java.util.List r0 = com.lagradost.cloudstream3.MainAPIKt.mainPageOf(r1)
            r5.mainPage = r0
            return
    }

    private final com.lagradost.cloudstream3.SearchResponse toRecommendResult(org.jsoup.nodes.Element r11) {
            r10 = this;
            java.lang.String r0 = ".media-item__title"
            org.jsoup.nodes.Element r0 = r11.selectFirst(r0)
            r1 = 0
            if (r0 == 0) goto L51
            java.lang.String r0 = r0.text()
            if (r0 != 0) goto L10
            goto L51
        L10:
            r3 = r0
            r0 = r10
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            java.lang.String r2 = "a"
            org.jsoup.nodes.Element r2 = r11.selectFirst(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.String r4 = "href"
            java.lang.String r2 = r2.attr(r4)
            java.lang.String r4 = com.lagradost.cloudstream3.MainAPIKt.fixUrl(r0, r2)
            r0 = r10
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            java.lang.String r2 = "img"
            org.jsoup.nodes.Element r2 = r11.selectFirst(r2)
            if (r2 == 0) goto L38
            java.lang.String r1 = "src"
            java.lang.String r1 = r2.attr(r1)
        L38:
            java.lang.String r0 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r0, r1)
            r2 = r10
            com.lagradost.cloudstream3.MainAPI r2 = (com.lagradost.cloudstream3.MainAPI) r2
            com.lagradost.cloudstream3.TvType r5 = com.lagradost.cloudstream3.TvType.Movie
            com.BoyfriendTV.BoyfriendTV$$ExternalSyntheticLambda1 r7 = new com.BoyfriendTV.BoyfriendTV$$ExternalSyntheticLambda1
            r7.<init>(r0)
            r8 = 8
            r9 = 0
            r6 = 0
            com.lagradost.cloudstream3.MovieSearchResponse r1 = com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse$default(r2, r3, r4, r5, r6, r7, r8, r9)
            com.lagradost.cloudstream3.SearchResponse r1 = (com.lagradost.cloudstream3.SearchResponse) r1
            return r1
        L51:
            return r1
    }

    static final kotlin.Unit toRecommendResult$lambda$0(java.lang.String r1, com.lagradost.cloudstream3.MovieSearchResponse r2) {
            r2.setPosterUrl(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private final com.lagradost.cloudstream3.SearchResponse toSearchResult(org.jsoup.nodes.Element r10) {
            r9 = this;
            java.lang.String r0 = "p.titlevideospot a"
            org.jsoup.nodes.Element r0 = r10.selectFirst(r0)
            if (r0 == 0) goto L4e
            java.lang.String r0 = r0.text()
            if (r0 != 0) goto Lf
            goto L4e
        Lf:
            r2 = r0
            r0 = r9
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            java.lang.String r1 = "a"
            org.jsoup.nodes.Element r1 = r10.selectFirst(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.String r3 = "href"
            java.lang.String r1 = r1.attr(r3)
            java.lang.String r3 = com.lagradost.cloudstream3.MainAPIKt.fixUrl(r0, r1)
            r0 = r9
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            java.lang.String r1 = "img"
            org.jsoup.select.Elements r1 = r10.select(r1)
            java.lang.String r4 = "src"
            java.lang.String r1 = r1.attr(r4)
            java.lang.String r0 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r0, r1)
            r1 = r9
            com.lagradost.cloudstream3.MainAPI r1 = (com.lagradost.cloudstream3.MainAPI) r1
            com.lagradost.cloudstream3.TvType r4 = com.lagradost.cloudstream3.TvType.Movie
            com.BoyfriendTV.BoyfriendTV$$ExternalSyntheticLambda0 r6 = new com.BoyfriendTV.BoyfriendTV$$ExternalSyntheticLambda0
            r6.<init>(r0)
            r7 = 8
            r8 = 0
            r5 = 0
            com.lagradost.cloudstream3.MovieSearchResponse r1 = com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse$default(r1, r2, r3, r4, r5, r6, r7, r8)
            com.lagradost.cloudstream3.SearchResponse r1 = (com.lagradost.cloudstream3.SearchResponse) r1
            return r1
        L4e:
            r0 = 0
            return r0
    }

    static final kotlin.Unit toSearchResult$lambda$0(java.lang.String r1, com.lagradost.cloudstream3.MovieSearchResponse r2) {
            r2.setPosterUrl(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public boolean getHasDownloadSupport() {
            r1 = this;
            boolean r0 = r1.hasDownloadSupport
            return r0
    }

    public boolean getHasMainPage() {
            r1 = this;
            boolean r0 = r1.hasMainPage
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object getMainPage(int r24, @org.jetbrains.annotations.NotNull com.lagradost.cloudstream3.MainPageRequest r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.HomePageResponse> r26) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r26
            boolean r3 = r2 instanceof com.BoyfriendTV.BoyfriendTV.C00001
            if (r3 == 0) goto L1a
            r3 = r2
            com.BoyfriendTV.BoyfriendTV$getMainPage$1 r3 = (com.BoyfriendTV.BoyfriendTV.C00001) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.BoyfriendTV.BoyfriendTV$getMainPage$1 r3 = new com.BoyfriendTV.BoyfriendTV$getMainPage$1
            r3.<init>(r0, r2)
        L1f:
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r3.label
            r7 = 1
            switch(r6) {
                case 0: goto L46;
                case 1: goto L33;
                default: goto L2b;
            }
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            int r1 = r3.I$0
            java.lang.Object r5 = r3.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r3.L$0
            com.lagradost.cloudstream3.MainPageRequest r6 = (com.lagradost.cloudstream3.MainPageRequest) r6
            kotlin.ResultKt.throwOnFailure(r4)
            r18 = r3
            r3 = r4
            r2 = 1
            goto Lcf
        L46:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            if (r1 != r7) goto L61
            r6.<init>()
            java.lang.String r8 = r0.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = r25.getData()
            java.lang.StringBuilder r6 = r6.append(r8)
            goto L7e
        L61:
            r6.<init>()
            java.lang.String r8 = r0.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = r25.getData()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = "/?page="
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r1)
        L7e:
            java.lang.String r6 = r6.toString()
            r8 = r4
            com.lagradost.nicehttp.Requests r4 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r9 = r25
            r3.L$0 = r9
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r3.L$1 = r10
            r3.I$0 = r1
            r3.label = r7
            r10 = r5
            r5 = r6
            r6 = 0
            r11 = 1
            r7 = 0
            r12 = r8
            r8 = 0
            r9 = 0
            r13 = r10
            r10 = 0
            r14 = 1
            r11 = 0
            r15 = r12
            r12 = 0
            r16 = r13
            r17 = 1
            r13 = 0
            r18 = r15
            r15 = 0
            r19 = r16
            r16 = 0
            r20 = 1
            r17 = 0
            r21 = r19
            r19 = 4094(0xffe, float:5.737E-42)
            r22 = 1
            r20 = 0
            r1 = r18
            r18 = r3
            r3 = r1
            r1 = r21
            r2 = 1
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            if (r4 != r1) goto Lcb
            return r1
        Lcb:
            r1 = r24
            r6 = r25
        Lcf:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r4 = r4.getDocument()
            java.lang.String r7 = "ul.media-listing-grid.main-listing-grid-offset li"
            org.jsoup.select.Elements r7 = r4.select(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r8 = 0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Collection r9 = (java.util.Collection) r9
            r10 = r7
            r11 = 0
            r12 = r10
            r13 = 0
            java.util.Iterator r14 = r12.iterator()
        Led:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L10e
            java.lang.Object r15 = r14.next()
            r16 = r15
            r17 = 0
            r2 = r16
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            r19 = 0
            com.lagradost.cloudstream3.SearchResponse r2 = r0.toSearchResult(r2)
            if (r2 == 0) goto L10c
            r19 = 0
            r9.add(r2)
        L10c:
            r2 = 1
            goto Led
        L10e:
            r2 = r9
            java.util.List r2 = (java.util.List) r2
            com.lagradost.cloudstream3.HomePageList r7 = new com.lagradost.cloudstream3.HomePageList
            java.lang.String r8 = r6.getName()
            r14 = 1
            r7.<init>(r8, r2, r14)
            r8 = r2
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r14
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
            com.lagradost.cloudstream3.HomePageResponse r7 = com.lagradost.cloudstream3.MainAPIKt.newHomePageResponse(r7, r8)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<com.lagradost.cloudstream3.MainPageData> getMainPage() {
            r1 = this;
            java.util.List<com.lagradost.cloudstream3.MainPageData> r0 = r1.mainPage
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getMainUrl() {
            r1 = this;
            java.lang.String r0 = r1.mainUrl
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Set<com.lagradost.cloudstream3.TvType> getSupportedTypes() {
            r1 = this;
            java.util.Set<com.lagradost.cloudstream3.TvType> r0 = r1.supportedTypes
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public com.lagradost.cloudstream3.VPNStatus getVpnStatus() {
            r1 = this;
            com.lagradost.cloudstream3.VPNStatus r0 = r1.vpnStatus
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object load(@org.jetbrains.annotations.NotNull java.lang.String r30, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.LoadResponse> r31) {
            r29 = this;
            r0 = r29
            r1 = r31
            boolean r2 = r1 instanceof com.BoyfriendTV.BoyfriendTV.C00011
            if (r2 == 0) goto L18
            r2 = r1
            com.BoyfriendTV.BoyfriendTV$load$1 r2 = (com.BoyfriendTV.BoyfriendTV.C00011) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.BoyfriendTV.BoyfriendTV$load$1 r2 = new com.BoyfriendTV.BoyfriendTV$load$1
            r2.<init>(r0, r1)
        L1d:
            r9 = r2
            java.lang.Object r2 = r9.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r9.label
            r5 = 1
            switch(r4) {
                case 0: goto L6c;
                case 1: goto L5f;
                case 2: goto L34;
                default: goto L2a;
            }
        L2a:
            r19 = r2
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            java.lang.Object r3 = r9.L$8
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r9.L$7
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r9.L$6
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r9.L$5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.L$4
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r9.L$3
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            java.lang.Object r10 = r9.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r9.L$1
            org.jsoup.nodes.Document r11 = (org.jsoup.nodes.Document) r11
            java.lang.Object r12 = r9.L$0
            java.lang.String r12 = (java.lang.String) r12
            kotlin.ResultKt.throwOnFailure(r2)
            r19 = r2
            goto L240
        L5f:
            java.lang.Object r4 = r9.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r3
            r5 = r4
            r20 = 1
            r3 = r2
            goto Laa
        L6c:
            kotlin.ResultKt.throwOnFailure(r2)
            r4 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r6 = r30
            r9.L$0 = r6
            r9.label = r5
            r7 = 1
            r5 = 0
            r6 = 0
            r8 = 1
            r7 = 0
            r10 = 1
            r8 = 0
            r17 = r9
            r9 = 0
            r11 = 1
            r10 = 0
            r12 = 1
            r11 = 0
            r14 = 1
            r12 = 0
            r15 = 1
            r14 = 0
            r16 = 1
            r15 = 0
            r18 = 1
            r16 = 0
            r19 = 1
            r18 = 4094(0xffe, float:5.737E-42)
            r20 = 1
            r19 = 0
            r1 = r4
            r4 = r30
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r9 = r17
            if (r3 != r1) goto La8
            return r1
        La8:
            r5 = r30
        Laa:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r11 = r3.getDocument()
            java.lang.String r3 = "script[type=application/ld+json]"
            org.jsoup.nodes.Element r3 = r11.selectFirst(r3)
            r4 = 0
            if (r3 == 0) goto L241
            java.lang.String r3 = r3.data()
            if (r3 != 0) goto Lc3
            r19 = r2
            goto L243
        Lc3:
            r10 = r3
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r10)
            r12 = r3
            java.lang.String r3 = "name"
            java.lang.String r3 = r12.optString(r3)
            if (r3 != 0) goto Ld3
            return r4
        Ld3:
            java.lang.String r6 = "description"
            java.lang.String r7 = ""
            java.lang.String r15 = r12.optString(r6, r7)
            java.lang.String r6 = "thumbnailUrl"
            org.json.JSONArray r6 = r12.optJSONArray(r6)
            r7 = 0
            if (r6 == 0) goto Lf4
            java.lang.String r6 = r6.optString(r7)
            if (r6 == 0) goto Lf4
            r4 = 0
            r8 = r0
            com.lagradost.cloudstream3.MainAPI r8 = (com.lagradost.cloudstream3.MainAPI) r8
            java.lang.String r4 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r8, r6)
            r14 = r4
            goto Lf5
        Lf4:
            r14 = r4
        Lf5:
            r21 = r15
            java.lang.CharSequence r21 = (java.lang.CharSequence) r21
            java.lang.String r4 = ","
            java.lang.String[] r22 = new java.lang.String[]{r4}
            r25 = 6
            r26 = 0
            r23 = 0
            r24 = 0
            java.util.List r4 = kotlin.text.StringsKt.split$default(r21, r22, r23, r24, r25, r26)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r6 = 0
            java.util.ArrayList r8 = new java.util.ArrayList
            r13 = 10
            int r13 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r13)
            r8.<init>(r13)
            java.util.Collection r8 = (java.util.Collection) r8
            r13 = r4
            r16 = 0
            java.util.Iterator r17 = r13.iterator()
        L123:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L152
            java.lang.Object r18 = r17.next()
            r19 = r18
            java.lang.String r19 = (java.lang.String) r19
            r21 = 0
            r22 = r19
            java.lang.CharSequence r22 = (java.lang.CharSequence) r22
            java.lang.CharSequence r22 = kotlin.text.StringsKt.trim(r22)
            java.lang.String r23 = r22.toString()
            r27 = 4
            r28 = 0
            java.lang.String r24 = "-"
            java.lang.String r25 = ""
            r26 = 0
            java.lang.String r7 = kotlin.text.StringsKt.replace$default(r23, r24, r25, r26, r27, r28)
            r8.add(r7)
            r7 = 0
            goto L123
        L152:
            r7 = r8
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r4 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            r8 = r7
            r13 = 0
            java.util.Iterator r16 = r8.iterator()
        L168:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L197
            r19 = r2
            java.lang.Object r2 = r16.next()
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            r18 = 0
            r21 = r17
            java.lang.CharSequence r21 = (java.lang.CharSequence) r21
            boolean r21 = kotlin.text.StringsKt.isBlank(r21)
            if (r21 != 0) goto L18d
            boolean r21 = org.jsoup.internal.StringUtil.isNumeric(r17)
            if (r21 != 0) goto L18d
            r17 = 1
            goto L18f
        L18d:
            r17 = 0
        L18f:
            if (r17 == 0) goto L194
            r6.add(r2)
        L194:
            r2 = r19
            goto L168
        L197:
            r19 = r2
            r16 = r6
            java.util.List r16 = (java.util.List) r16
            java.lang.String r2 = ".media-item"
            org.jsoup.select.Elements r2 = r11.select(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r4 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = r2
            r8 = 0
            r13 = r7
            r17 = 0
            java.util.Iterator r18 = r13.iterator()
        L1b9:
            boolean r20 = r18.hasNext()
            if (r20 == 0) goto L1dd
            java.lang.Object r20 = r18.next()
            r21 = r20
            r22 = 0
            r30 = r2
            r2 = r21
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            r23 = 0
            com.lagradost.cloudstream3.SearchResponse r2 = r0.toRecommendResult(r2)
            if (r2 == 0) goto L1da
            r23 = 0
            r6.add(r2)
        L1da:
            r2 = r30
            goto L1b9
        L1dd:
            r30 = r2
            r17 = r6
            java.util.List r17 = (java.util.List) r17
            r4 = r3
            r3 = r0
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            com.lagradost.cloudstream3.TvType r6 = com.lagradost.cloudstream3.TvType.NSFW
            com.BoyfriendTV.BoyfriendTV$load$2 r13 = new com.BoyfriendTV.BoyfriendTV$load$2
            r18 = 0
            r13.<init>(r14, r15, r16, r17, r18)
            r8 = r13
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r9.L$0 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r9.L$1 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r9.L$2 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r9.L$3 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r9.L$4 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r9.L$5 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r9.L$6 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r9.L$7 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r17)
            r9.L$8 = r2
            r2 = 2
            r9.label = r2
            r7 = r5
            java.lang.Object r2 = com.lagradost.cloudstream3.MainAPIKt.newMovieLoadResponse(r3, r4, r5, r6, r7, r8, r9)
            if (r2 != r1) goto L237
            return r1
        L237:
            r7 = r4
            r8 = r12
            r6 = r15
            r4 = r16
            r3 = r17
            r12 = r5
            r5 = r14
        L240:
            return r2
        L241:
            r19 = r2
        L243:
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object loadLinks(@org.jetbrains.annotations.NotNull java.lang.String r48, boolean r49, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r50, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r51, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r52) {
            r47 = this;
            r1 = r52
            boolean r0 = r1 instanceof com.BoyfriendTV.BoyfriendTV.C00031
            if (r0 == 0) goto L18
            r0 = r1
            com.BoyfriendTV.BoyfriendTV$loadLinks$1 r0 = (com.BoyfriendTV.BoyfriendTV.C00031) r0
            int r2 = r0.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r0.label
            int r2 = r2 - r3
            r0.label = r2
            r2 = r47
            goto L1f
        L18:
            com.BoyfriendTV.BoyfriendTV$loadLinks$1 r0 = new com.BoyfriendTV.BoyfriendTV$loadLinks$1
            r2 = r47
            r0.<init>(r2, r1)
        L1f:
            r3 = r0
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            java.lang.String r7 = "#EXT-X-STREAM-INF"
            java.lang.String r10 = "Referer"
            java.lang.String r11 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36"
            java.lang.String r12 = "User-Agent"
            java.lang.String r13 = "https://www.boyfriendtv.com/"
            r17 = r7
            switch(r0) {
                case 0: goto L19b;
                case 1: goto L16e;
                case 2: goto L11b;
                case 3: goto L8a;
                case 4: goto L3f;
                default: goto L37;
            }
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3f:
            boolean r0 = r3.Z$0
            java.lang.Object r5 = r3.L$8
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r7 = r3.L$7
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r3.L$6
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r3.L$5
            java.lang.String r8 = (java.lang.String) r8
            r19 = 0
            java.lang.Object r15 = r3.L$4
            kotlin.text.MatchResult r15 = (kotlin.text.MatchResult) r15
            r20 = 1
            java.lang.Object r14 = r3.L$3
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r6 = r3.L$2
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r16 = r0
            java.lang.Object r0 = r3.L$1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r49 = r0
            java.lang.Object r0 = r3.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r4)
            r24 = r49
            r25 = r0
            r0 = r1
            r26 = r2
            r2 = r11
            r1 = r13
            r11 = r16
            r32 = 1
            r38 = 2
            r16 = r9
            r13 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r12
            r6 = r4
            goto L6c7
        L8a:
            r19 = 0
            r20 = 1
            int r0 = r3.I$0
            boolean r6 = r3.Z$0
            java.lang.Object r8 = r3.L$15
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r14 = r3.L$14
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r3.L$13
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r7 = r3.L$12
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r9 = r3.L$11
            java.lang.Integer r9 = (java.lang.Integer) r9
            r24 = r0
            java.lang.Object r0 = r3.L$10
            java.util.List r0 = (java.util.List) r0
            r49 = r0
            java.lang.Object r0 = r3.L$9
            java.lang.String r0 = (java.lang.String) r0
            r25 = r0
            java.lang.Object r0 = r3.L$8
            java.util.List r0 = (java.util.List) r0
            r26 = r0
            java.lang.Object r0 = r3.L$7
            java.lang.String r0 = (java.lang.String) r0
            r27 = r0
            java.lang.Object r0 = r3.L$6
            java.lang.String r0 = (java.lang.String) r0
            r28 = r0
            java.lang.Object r0 = r3.L$5
            java.lang.String r0 = (java.lang.String) r0
            r29 = r0
            java.lang.Object r0 = r3.L$4
            kotlin.text.MatchResult r0 = (kotlin.text.MatchResult) r0
            r30 = r0
            java.lang.Object r0 = r3.L$3
            java.lang.String r0 = (java.lang.String) r0
            r31 = r0
            java.lang.Object r0 = r3.L$2
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r51 = r0
            java.lang.Object r0 = r3.L$1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r50 = r0
            java.lang.Object r0 = r3.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r4)
            r43 = r5
            r44 = r6
            r18 = r8
            r45 = r9
            r39 = r10
            r40 = r11
            r41 = r12
            r42 = r13
            r33 = r17
            r8 = r24
            r9 = r30
            r5 = r31
            r32 = 1
            r38 = 2
            r10 = r49
            r24 = r50
            r11 = r51
            r12 = r0
            r6 = r3
            r13 = r4
            r0 = r7
            r3 = r26
            r7 = r27
            r26 = r2
            r2 = r29
            goto L574
        L11b:
            r19 = 0
            r20 = 1
            boolean r6 = r3.Z$0
            java.lang.Object r0 = r3.L$6
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r3.L$5
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r3.L$4
            r9 = r0
            kotlin.text.MatchResult r9 = (kotlin.text.MatchResult) r9
            java.lang.Object r0 = r3.L$3
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r0 = r3.L$2
            r15 = r0
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15
            java.lang.Object r0 = r3.L$1
            r24 = r0
            kotlin.jvm.functions.Function1 r24 = (kotlin.jvm.functions.Function1) r24
            java.lang.Object r0 = r3.L$0
            r25 = r0
            java.lang.String r25 = (java.lang.String) r25
            kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Exception -> L15b
            r20 = r4
            r1 = r5
            r39 = r10
            r40 = r11
            r41 = r12
            r42 = r13
            r33 = r17
            r2 = 0
            r17 = r3
            goto L2f6
        L15b:
            r0 = move-exception
            r20 = r4
            r1 = r5
            r39 = r10
            r40 = r11
            r41 = r12
            r42 = r13
            r33 = r17
            r2 = 0
            r17 = r3
            goto L356
        L16e:
            r19 = 0
            r20 = 1
            boolean r0 = r3.Z$0
            java.lang.Object r6 = r3.L$2
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            java.lang.Object r7 = r3.L$1
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r8 = r3.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.throwOnFailure(r4)
            r20 = r4
            r1 = r5
            r5 = r6
            r22 = r7
            r21 = r8
            r34 = r10
            r35 = r11
            r36 = r12
            r37 = r13
            r33 = r17
            r2 = 0
            r4 = r0
            r0 = r20
            goto L21d
        L19b:
            r19 = 0
            r20 = 1
            kotlin.ResultKt.throwOnFailure(r4)
            com.lagradost.nicehttp.Requests r0 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r6 = 2
            kotlin.Pair[] r7 = new kotlin.Pair[r6]
            kotlin.Pair r8 = kotlin.TuplesKt.to(r12, r11)
            r7[r19] = r8
            kotlin.Pair r8 = kotlin.TuplesKt.to(r10, r13)
            r7[r20] = r8
            java.util.Map r7 = kotlin.collections.MapsKt.mapOf(r7)
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r48)
            r3.L$0 = r8
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r50)
            r3.L$1 = r8
            r8 = r51
            r3.L$2 = r8
            r9 = r49
            r3.Z$0 = r9
            r14 = 1
            r3.label = r14
            r21 = 2
            r6 = 0
            r15 = r5
            r5 = r7
            r7 = 0
            r8 = 0
            r9 = 0
            r20 = r10
            r10 = 0
            r24 = r11
            r11 = 0
            r25 = r12
            r26 = r13
            r12 = 0
            r27 = 1
            r14 = 0
            r28 = r15
            r15 = 0
            r29 = 4
            r16 = 0
            r30 = -1
            r18 = 4092(0xffc, float:5.734E-42)
            r31 = 0
            r19 = 0
            r33 = r17
            r34 = r20
            r35 = r24
            r36 = r25
            r37 = r26
            r1 = r28
            r2 = 0
            r17 = r3
            r20 = r4
            r4 = r48
            r3 = r0
            java.lang.Object r0 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r3 = r17
            if (r0 != r1) goto L215
            return r1
        L215:
            r21 = r48
            r4 = r49
            r22 = r50
            r5 = r51
        L21d:
            com.lagradost.nicehttp.NiceResponse r0 = (com.lagradost.nicehttp.NiceResponse) r0
            java.lang.String r0 = r0.getText()
            r23 = r0
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r6 = "\"hlsAuto\"\\s*:\\s*\"([^\"]+)\""
            r0.<init>(r6)
            r6 = r23
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7 = 0
            r8 = 2
            kotlin.text.MatchResult r24 = kotlin.text.Regex.find$default(r0, r6, r7, r8, r2)
            if (r24 == 0) goto L721
            java.util.List r0 = r24.getGroupValues()
            if (r0 == 0) goto L721
            r6 = 1
            java.lang.Object r0 = r0.get(r6)
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L721
            r13 = 4
            r14 = 0
            java.lang.String r10 = "\\/"
            java.lang.String r11 = "/"
            r12 = 0
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r9, r10, r11, r12, r13, r14)
            if (r0 != 0) goto L25d
            r17 = r3
            r26 = r4
            r28 = r5
            goto L727
        L25d:
            r25 = r0
            r9 = r25
            com.lagradost.nicehttp.Requests r0 = com.lagradost.cloudstream3.MainActivityKt.getApp()     // Catch: java.lang.Exception -> L337
            kotlin.Pair[] r10 = new kotlin.Pair[r8]     // Catch: java.lang.Exception -> L337
            r11 = r35
            r12 = r36
            kotlin.Pair r13 = kotlin.TuplesKt.to(r12, r11)     // Catch: java.lang.Exception -> L328
            r10[r7] = r13     // Catch: java.lang.Exception -> L328
            r13 = r34
            r14 = r37
            kotlin.Pair r15 = kotlin.TuplesKt.to(r13, r14)     // Catch: java.lang.Exception -> L317
            r10[r6] = r15     // Catch: java.lang.Exception -> L317
            java.util.Map r10 = kotlin.collections.MapsKt.mapOf(r10)     // Catch: java.lang.Exception -> L317
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r21)     // Catch: java.lang.Exception -> L317
            r3.L$0 = r15     // Catch: java.lang.Exception -> L317
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)     // Catch: java.lang.Exception -> L317
            r3.L$1 = r15     // Catch: java.lang.Exception -> L317
            r3.L$2 = r5     // Catch: java.lang.Exception -> L317
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)     // Catch: java.lang.Exception -> L317
            r3.L$3 = r15     // Catch: java.lang.Exception -> L317
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)     // Catch: java.lang.Exception -> L317
            r3.L$4 = r15     // Catch: java.lang.Exception -> L317
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)     // Catch: java.lang.Exception -> L317
            r3.L$5 = r15     // Catch: java.lang.Exception -> L317
            r3.L$6 = r9     // Catch: java.lang.Exception -> L317
            r3.Z$0 = r4     // Catch: java.lang.Exception -> L317
            r3.label = r8     // Catch: java.lang.Exception -> L317
            r27 = 1
            r6 = 0
            r31 = 0
            r7 = 0
            r38 = 2
            r8 = 0
            r15 = r4
            r4 = r9
            r9 = 0
            r16 = r5
            r5 = r10
            r10 = 0
            r35 = r11
            r11 = 0
            r36 = r12
            r34 = r13
            r12 = 0
            r26 = r14
            r14 = 0
            r17 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r18
            r18 = 4092(0xffc, float:5.734E-42)
            r28 = r19
            r19 = 0
            r42 = r26
            r39 = r34
            r40 = r35
            r41 = r36
            r26 = r17
            r17 = r3
            r3 = r0
            java.lang.Object r0 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L306
            if (r0 != r1) goto L2e6
            return r1
        L2e6:
            r7 = r4
            r14 = r23
            r9 = r24
            r8 = r25
            r6 = r26
            r15 = r28
            r4 = r0
            r25 = r21
            r24 = r22
        L2f6:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4     // Catch: java.lang.Exception -> L303
            java.lang.String r0 = r4.getText()     // Catch: java.lang.Exception -> L303
            r46 = r7
            r7 = r0
            r0 = r46
            goto L358
        L303:
            r0 = move-exception
            goto L356
        L306:
            r0 = move-exception
            r7 = r4
            r14 = r23
            r9 = r24
            r8 = r25
            r6 = r26
            r15 = r28
            r25 = r21
            r24 = r22
            goto L356
        L317:
            r0 = move-exception
            r17 = r3
            r26 = r4
            r28 = r5
            r4 = r9
            r40 = r11
            r41 = r12
            r39 = r13
            r42 = r14
            goto L347
        L328:
            r0 = move-exception
            r17 = r3
            r26 = r4
            r28 = r5
            r4 = r9
            r40 = r11
            r41 = r12
            r39 = r34
            goto L345
        L337:
            r0 = move-exception
            r17 = r3
            r26 = r4
            r28 = r5
            r4 = r9
            r39 = r34
            r40 = r35
            r41 = r36
        L345:
            r42 = r37
        L347:
            r7 = r4
            r14 = r23
            r9 = r24
            r8 = r25
            r6 = r26
            r15 = r28
            r25 = r21
            r24 = r22
        L356:
            r0 = r7
            r7 = r2
        L358:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            r4 = r7
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L36e
            boolean r4 = kotlin.text.StringsKt.isBlank(r4)
            if (r4 == 0) goto L36c
            goto L36e
        L36c:
            r4 = 0
            goto L36f
        L36e:
            r4 = 1
        L36f:
            if (r4 != 0) goto L638
            r4 = r7
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = r33
            r10 = r5
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r11 = 0
            r12 = 2
            boolean r4 = kotlin.text.StringsKt.contains$default(r4, r10, r11, r12, r2)
            if (r4 == 0) goto L638
            java.lang.String r4 = "/key="
            java.lang.String r4 = kotlin.text.StringsKt.substringBefore$default(r0, r4, r2, r12, r2)
            java.lang.String r10 = "/media="
            java.lang.String r4 = kotlin.text.StringsKt.substringBefore$default(r4, r10, r2, r12, r2)
            r10 = r7
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.util.List r10 = kotlin.text.StringsKt.lines(r10)
            r13 = 0
            java.util.Iterator r16 = r10.iterator()
            r26 = r47
            r43 = r1
            r44 = r6
            r45 = r13
            r48 = r16
            r6 = r17
            r13 = r20
            r1 = r0
            r0 = r52
        L3aa:
            boolean r16 = r48.hasNext()
            if (r16 == 0) goto L60c
            java.lang.Object r16 = r48.next()
            r2 = r16
            java.lang.String r2 = (java.lang.String) r2
            r49 = r7
            r7 = 0
            boolean r16 = kotlin.text.StringsKt.startsWith$default(r2, r5, r11, r12, r7)
            if (r16 == 0) goto L3f9
            kotlin.text.Regex r7 = new kotlin.text.Regex
            java.lang.String r11 = "RESOLUTION=\\d+x(\\d+)"
            r7.<init>(r11)
            r11 = r2
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r33 = r5
            r50 = r8
            r5 = 0
            r8 = 0
            kotlin.text.MatchResult r7 = kotlin.text.Regex.find$default(r7, r11, r5, r12, r8)
            if (r7 == 0) goto L3ec
            java.util.List r5 = r7.getGroupValues()
            if (r5 == 0) goto L3ec
            r11 = 1
            java.lang.Object r5 = r5.get(r11)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L3ed
            java.lang.Integer r5 = kotlin.text.StringsKt.toIntOrNull(r5)
            goto L3ee
        L3ec:
            r11 = 1
        L3ed:
            r5 = 0
        L3ee:
            r45 = r5
            r7 = r49
            r8 = r50
            r5 = r33
            r2 = 0
            r11 = 0
            goto L3aa
        L3f9:
            r33 = r5
            r50 = r8
            r11 = 1
            java.lang.String r5 = "#"
            r7 = 0
            r8 = 0
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r2, r5, r7, r12, r8)
            if (r5 != 0) goto L5d0
            r5 = r2
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.isBlank(r5)
            if (r5 != 0) goto L5d0
            r5 = r2
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.CharSequence r5 = kotlin.text.StringsKt.trim(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "http"
            r8 = 0
            r11 = 0
            r32 = 1
            boolean r7 = kotlin.text.StringsKt.startsWith$default(r5, r7, r8, r12, r11)
            if (r7 == 0) goto L42c
            r18 = r5
            goto L465
        L42c:
            java.lang.String r7 = "/"
            boolean r16 = kotlin.text.StringsKt.startsWith$default(r5, r7, r8, r12, r11)
            if (r16 == 0) goto L448
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r4)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r7 = r7.toString()
            r18 = r7
            goto L465
        L448:
            java.lang.String r7 = kotlin.text.StringsKt.substringBeforeLast$default(r1, r7, r11, r12, r11)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r7)
            r11 = 47
            java.lang.StringBuilder r8 = r8.append(r11)
            java.lang.StringBuilder r8 = r8.append(r5)
            java.lang.String r8 = r8.toString()
            r18 = r8
        L465:
            r7 = r45
            if (r7 == 0) goto L46f
            int r8 = r7.intValue()
            goto L470
        L46f:
            r8 = -1
        L470:
            r11 = 1080(0x438, float:1.513E-42)
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r11)
            r16 = 720(0x2d0, float:1.009E-42)
            java.lang.Integer r16 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r16)
            r17 = 480(0x1e0, float:6.73E-43)
            java.lang.Integer r17 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r17)
            r19 = 240(0xf0, float:3.36E-43)
            java.lang.Integer r19 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r19)
            r51 = r0
            r12 = 4
            r38 = 2
            java.lang.Integer[] r0 = new java.lang.Integer[r12]
            r31 = 0
            r0[r31] = r11
            r0[r32] = r16
            r0[r38] = r17
            r11 = 3
            r0[r11] = r19
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
            boolean r0 = r0.contains(r12)
            if (r0 != 0) goto L4c0
            r12 = -1
            if (r8 != r12) goto L4ac
            goto L4c1
        L4ac:
            r0 = r48
            r28 = r1
            r21 = r6
            r6 = r39
            r2 = r40
            r5 = r41
            r1 = r42
            r12 = r43
            r11 = r44
            goto L5eb
        L4c0:
            r12 = -1
        L4c1:
            java.lang.String r16 = r26.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "BoyfriendTV "
            java.lang.StringBuilder r0 = r0.append(r12)
            if (r8 <= 0) goto L4e7
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.StringBuilder r12 = r12.append(r8)
            r11 = 112(0x70, float:1.57E-43)
            java.lang.StringBuilder r11 = r12.append(r11)
            java.lang.String r11 = r11.toString()
            goto L4e9
        L4e7:
            java.lang.String r11 = "Auto"
        L4e9:
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.String r17 = r0.toString()
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)
            r6.L$0 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r6.L$1 = r0
            r6.L$2 = r15
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r6.L$3 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r6.L$4 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r50)
            r6.L$5 = r0
            r6.L$6 = r1
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r49)
            r6.L$7 = r0
            r6.L$8 = r3
            r6.L$9 = r4
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r6.L$10 = r0
            r6.L$11 = r7
            r0 = r48
            r6.L$12 = r0
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r6.L$13 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r6.L$14 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r18)
            r6.L$15 = r11
            r11 = r44
            r6.Z$0 = r11
            r6.I$0 = r8
            r12 = 3
            r6.label = r12
            r19 = 0
            r20 = 0
            r22 = 24
            r23 = 0
            r21 = r6
            java.lang.Object r6 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink$default(r16, r17, r18, r19, r20, r21, r22, r23)
            r12 = r43
            if (r6 != r12) goto L558
            return r12
        L558:
            r28 = r14
            r14 = r5
            r5 = r28
            r28 = r1
            r45 = r7
            r44 = r11
            r43 = r12
            r11 = r15
            r12 = r25
            r7 = r49
            r1 = r51
            r15 = r2
            r25 = r4
            r4 = r6
            r6 = r21
            r2 = r50
        L574:
            com.lagradost.cloudstream3.utils.ExtractorLink r4 = (com.lagradost.cloudstream3.utils.ExtractorLink) r4
            r4.setQuality(r8)
            r48 = r1
            r1 = r42
            r4.setReferer(r1)
            r50 = r0
            r49 = r2
            r2 = 3
            kotlin.Pair[] r0 = new kotlin.Pair[r2]
            r51 = r5
            r2 = r40
            r5 = r41
            kotlin.Pair r16 = kotlin.TuplesKt.to(r5, r2)
            r31 = 0
            r0[r31] = r16
            r16 = r0
            java.lang.String r0 = "Origin"
            r52 = r6
            java.lang.String r6 = "https://www.boyfriendtv.com"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r6)
            r16[r32] = r0
            r6 = r39
            kotlin.Pair r0 = kotlin.TuplesKt.to(r6, r1)
            r16[r38] = r0
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r16)
            r4.setHeaders(r0)
            r3.add(r4)
            r0 = r48
            r8 = r49
            r48 = r50
            r14 = r51
            r15 = r11
            r4 = r25
            r1 = r28
            r5 = r33
            r2 = 0
            r11 = 0
            r6 = r52
            r25 = r12
            r12 = 2
            goto L3aa
        L5d0:
            r51 = r0
            r28 = r1
            r8 = r2
            r21 = r6
            r6 = r39
            r2 = r40
            r5 = r41
            r1 = r42
            r12 = r43
            r11 = r44
            r7 = r45
            r32 = 1
            r38 = 2
            r0 = r48
        L5eb:
            r8 = r50
            r48 = r0
            r42 = r1
            r40 = r2
            r41 = r5
            r39 = r6
            r45 = r7
            r44 = r11
            r43 = r12
            r6 = r21
            r1 = r28
            r5 = r33
            r2 = 0
            r11 = 0
            r12 = 2
            r7 = r49
            r0 = r51
            goto L3aa
        L60c:
            r51 = r0
            r28 = r1
            r21 = r6
            r49 = r7
            r50 = r8
            r6 = r39
            r2 = r40
            r5 = r41
            r1 = r42
            r12 = r43
            r11 = r44
            r7 = r45
            r32 = 1
            r38 = 2
            r8 = r49
            r22 = r9
            r4 = r13
            r16 = r28
            r9 = r50
            r13 = r6
            r6 = r3
            r3 = r21
            r10 = r14
            r7 = r15
            goto L65a
        L638:
            r28 = r1
            r13 = r39
            r2 = r40
            r5 = r41
            r1 = r42
            r32 = 1
            r38 = 2
            r26 = r47
            r16 = r0
            r11 = r6
            r22 = r9
            r4 = r20
            r12 = r28
            r0 = r52
            r6 = r3
            r9 = r8
            r3 = r17
            r8 = r7
            r10 = r14
            r7 = r15
        L65a:
            boolean r14 = r6.isEmpty()
            if (r14 == 0) goto L6f6
        L661:
            java.lang.String r14 = r26.getName()
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)
            r3.L$0 = r15
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r3.L$1 = r15
            r3.L$2 = r7
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r3.L$3 = r15
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r3.L$4 = r15
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r3.L$5 = r15
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r3.L$6 = r15
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r3.L$7 = r15
            r3.L$8 = r6
            r15 = 0
            r3.L$9 = r15
            r3.L$10 = r15
            r3.L$11 = r15
            r3.L$12 = r15
            r3.L$13 = r15
            r3.L$14 = r15
            r3.L$15 = r15
            r3.Z$0 = r11
            r15 = 4
            r3.label = r15
            java.lang.String r15 = "BoyfriendTV"
            r17 = 0
            r18 = 0
            r20 = 24
            r21 = 0
            r19 = r3
            java.lang.Object r3 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink$default(r14, r15, r16, r17, r18, r19, r20, r21)
            if (r3 != r12) goto L6bc
            return r12
        L6bc:
            r14 = r10
            r15 = r22
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r19
        L6c7:
            com.lagradost.cloudstream3.utils.ExtractorLink r4 = (com.lagradost.cloudstream3.utils.ExtractorLink) r4
            r12 = -1
            r4.setQuality(r12)
            r4.setReferer(r1)
            r12 = 2
            kotlin.Pair[] r12 = new kotlin.Pair[r12]
            kotlin.Pair r2 = kotlin.TuplesKt.to(r5, r2)
            r31 = 0
            r12[r31] = r2
            kotlin.Pair r1 = kotlin.TuplesKt.to(r13, r1)
            r12[r32] = r1
            java.util.Map r1 = kotlin.collections.MapsKt.mapOf(r12)
            r4.setHeaders(r1)
            r7.add(r4)
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r14
            r22 = r15
            goto L6f8
        L6f6:
            r19 = r3
        L6f8:
            r1 = r6
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.Iterator r5 = r1.iterator()
        L700:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L712
            java.lang.Object r12 = r5.next()
            r13 = r12
            com.lagradost.cloudstream3.utils.ExtractorLink r13 = (com.lagradost.cloudstream3.utils.ExtractorLink) r13
            r14 = 0
            r7.invoke(r13)
            goto L700
        L712:
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            return r1
        L721:
            r17 = r3
            r26 = r4
            r28 = r5
        L727:
            r31 = 0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r31)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object search(@org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.SearchResponse>> r24) {
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof com.BoyfriendTV.BoyfriendTV.C00041
            if (r2 == 0) goto L18
            r2 = r1
            com.BoyfriendTV.BoyfriendTV$search$1 r2 = (com.BoyfriendTV.BoyfriendTV.C00041) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.BoyfriendTV.BoyfriendTV$search$1 r2 = new com.BoyfriendTV.BoyfriendTV$search$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r3 = r2.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.label
            switch(r5) {
                case 0: goto L43;
                case 1: goto L32;
                default: goto L28;
            }
        L28:
            r17 = r2
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L32:
            java.lang.Object r4 = r2.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r2
            r20 = r3
            goto Laa
        L43:
            kotlin.ResultKt.throwOnFailure(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r0.getMainUrl()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "/search/?q="
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = r23
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r7 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r2.L$0 = r8
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r2.L$1 = r8
            r8 = 1
            r2.label = r8
            r8 = r4
            r4 = r5
            r5 = 0
            r6 = 0
            r9 = r7
            r7 = 0
            r10 = r8
            r8 = 0
            r11 = r9
            r9 = 0
            r12 = r10
            r10 = 0
            r13 = r11
            r11 = 0
            r15 = r12
            r14 = r13
            r12 = 0
            r16 = r14
            r14 = 0
            r17 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r18
            r18 = 4094(0xffe, float:5.737E-42)
            r20 = r19
            r19 = 0
            r21 = r17
            r17 = r2
            r2 = r21
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r3 != r2) goto La8
            return r2
        La8:
            r5 = r23
        Laa:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r2 = r3.getDocument()
            java.lang.String r3 = "ul.media-listing-grid.main-listing-grid-offset li"
            org.jsoup.select.Elements r3 = r2.select(r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r6 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r7 = (java.util.Collection) r7
            r8 = r3
            r9 = 0
            r10 = r8
            r11 = 0
            java.util.Iterator r12 = r10.iterator()
        Lc8:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto Le7
            java.lang.Object r13 = r12.next()
            r14 = r13
            r15 = 0
            r1 = r14
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            r16 = 0
            com.lagradost.cloudstream3.SearchResponse r1 = r0.toSearchResult(r1)
            if (r1 == 0) goto Le4
            r16 = 0
            r7.add(r1)
        Le4:
            r1 = r24
            goto Lc8
        Le7:
            r1 = r7
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public void setMainUrl(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            r0 = this;
            r0.mainUrl = r1
            return
    }

    public void setName(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }
}
