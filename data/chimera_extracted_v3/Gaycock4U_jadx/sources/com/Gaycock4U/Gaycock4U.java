package com.Gaycock4U;

/* JADX INFO: compiled from: Gaycock4U.kt */
/* JADX INFO: loaded from: /tmp/tmp.gEcNE2slhR/classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010)\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0096@\u00a2\u0006\u0002\u00100J\u000e\u00101\u001a\u0004\u0018\u000102*\u000203H\u0002J\u000e\u00104\u001a\u0004\u0018\u000102*\u000203H\u0002J\u001c\u00105\u001a\b\u0012\u0004\u0012\u0002020'2\u0006\u00106\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u00107J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u00107JF\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u000e2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0?2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020A0?H\u0096@\u00a2\u0006\u0002\u0010DR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*\u00a8\u0006E"}, d2 = {"Lcom/Gaycock4U/Gaycock4U;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "lang", "getLang", "setLang", "hasDownloadSupport", "getHasDownloadSupport", "hasChromecastSupport", "getHasChromecastSupport", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "userAgent", "headers", "", "cfKiller", "Lcom/lagradost/cloudstream3/network/CloudflareKiller;", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lorg/jsoup/nodes/Element;", "toRecommendResult", "search", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Gaycock4U"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nGaycock4U.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gaycock4U.kt\ncom/Gaycock4U/Gaycock4U\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1642#2,10:187\n1915#2:197\n1916#2:199\n1652#2:200\n1642#2,10:201\n1915#2:211\n1916#2:213\n1652#2:214\n1642#2,10:215\n1915#2:225\n1916#2:227\n1652#2:228\n1915#2:229\n1916#2:231\n1#3:198\n1#3:212\n1#3:226\n1#3:230\n*S KotlinDebug\n*F\n+ 1 Gaycock4U.kt\ncom/Gaycock4U/Gaycock4U\n*L\n77#1:187,10\n77#1:197\n77#1:199\n77#1:200\n122#1:201,10\n122#1:211\n122#1:213\n122#1:214\n144#1:215,10\n144#1:225\n144#1:227\n144#1:228\n173#1:229\n173#1:231\n77#1:198\n122#1:212\n144#1:226\n*E\n"})
public final class Gaycock4U extends com.lagradost.cloudstream3.MainAPI {

    @org.jetbrains.annotations.NotNull
    private final com.lagradost.cloudstream3.network.CloudflareKiller cfKiller;
    private final boolean hasChromecastSupport;
    private final boolean hasDownloadSupport;
    private final boolean hasMainPage;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.String> headers;

    @org.jetbrains.annotations.NotNull
    private java.lang.String lang;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.lagradost.cloudstream3.MainPageData> mainPage;

    @org.jetbrains.annotations.NotNull
    private java.lang.String mainUrl;

    @org.jetbrains.annotations.NotNull
    private java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final java.util.Set<com.lagradost.cloudstream3.TvType> supportedTypes;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String userAgent;

    @org.jetbrains.annotations.NotNull
    private final com.lagradost.cloudstream3.VPNStatus vpnStatus;

    /* JADX INFO: renamed from: com.Gaycock4U.Gaycock4U$getMainPage$1 */
    /* JADX INFO: compiled from: Gaycock4U.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Gaycock4U.Gaycock4U", f = "Gaycock4U.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {70, 72}, m = "getMainPage", n = {"request", "url", "page", "request", "url", "document", "page"}, nl = {71, 76}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0"}, v = 2)
    static final class C00011 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.Gaycock4U.Gaycock4U this$0;

        C00011(com.Gaycock4U.Gaycock4U r1, kotlin.coroutines.Continuation<? super com.Gaycock4U.Gaycock4U.C00011> r2) {
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
                com.Gaycock4U.Gaycock4U r0 = r4.this$0
                r1 = 0
                r2 = r4
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r3 = 0
                java.lang.Object r0 = r0.getMainPage(r3, r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: com.Gaycock4U.Gaycock4U$load$1 */
    /* JADX INFO: compiled from: Gaycock4U.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Gaycock4U.Gaycock4U", f = "Gaycock4U.kt", i = {0, 1, 1, 1, 1, 1, 1}, l = {138, 148}, m = "load", n = {"url", "url", "document", "title", "poster", "description", "recommendations"}, nl = {140, -1}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
    static final class C00021 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.Gaycock4U.Gaycock4U this$0;

        C00021(com.Gaycock4U.Gaycock4U r1, kotlin.coroutines.Continuation<? super com.Gaycock4U.Gaycock4U.C00021> r2) {
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
                com.Gaycock4U.Gaycock4U r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.load(r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: com.Gaycock4U.Gaycock4U$load$2 */
    /* JADX INFO: compiled from: Gaycock4U.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Gaycock4U.Gaycock4U$load$2", f = "Gaycock4U.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00032 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.lagradost.cloudstream3.MovieLoadResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String $description;
        final /* synthetic */ java.lang.String $poster;
        final /* synthetic */ java.util.List<com.lagradost.cloudstream3.SearchResponse> $recommendations;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        C00032(java.lang.String r2, java.lang.String r3, java.util.List<? extends com.lagradost.cloudstream3.SearchResponse> r4, kotlin.coroutines.Continuation<? super com.Gaycock4U.Gaycock4U.C00032> r5) {
                r1 = this;
                r1.$poster = r2
                r1.$description = r3
                r1.$recommendations = r4
                r0 = 2
                r1.<init>(r0, r5)
                return
        }

        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r5, kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                com.Gaycock4U.Gaycock4U$load$2 r0 = new com.Gaycock4U.Gaycock4U$load$2
                java.lang.String r1 = r4.$poster
                java.lang.String r2 = r4.$description
                java.util.List<com.lagradost.cloudstream3.SearchResponse> r3 = r4.$recommendations
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        public final java.lang.Object invoke(com.lagradost.cloudstream3.MovieLoadResponse r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                com.Gaycock4U.Gaycock4U$load$2 r0 = (com.Gaycock4U.Gaycock4U.C00032) r0
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
                java.util.List<com.lagradost.cloudstream3.SearchResponse> r1 = r3.$recommendations
                r0.setRecommendations(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    /* JADX INFO: renamed from: com.Gaycock4U.Gaycock4U$loadLinks$1 */
    /* JADX INFO: compiled from: Gaycock4U.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Gaycock4U.Gaycock4U", f = "Gaycock4U.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {161, 179}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "isCasting", "data", "subtitleCallback", "callback", "document", "found", "$this$forEach$iv", "element$iv", "f", "url", "isCasting", "$i$f$forEach", "$i$a$-forEach-Gaycock4U$loadLinks$2"}, nl = {162, 181}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "Z$0", "I$0", "I$1"}, v = 2)
    static final class C00041 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
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
        final /* synthetic */ com.Gaycock4U.Gaycock4U this$0;

        C00041(com.Gaycock4U.Gaycock4U r1, kotlin.coroutines.Continuation<? super com.Gaycock4U.Gaycock4U.C00041> r2) {
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
                com.Gaycock4U.Gaycock4U r1 = r7.this$0
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

    /* JADX INFO: renamed from: com.Gaycock4U.Gaycock4U$search$1 */
    /* JADX INFO: compiled from: Gaycock4U.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Gaycock4U.Gaycock4U", f = "Gaycock4U.kt", i = {0, 0, 0}, l = {120}, m = "search", n = {"query", "searchResponse", "i"}, nl = {122}, s = {"L$0", "L$1", "I$0"}, v = 2)
    static final class C00051 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.Gaycock4U.Gaycock4U this$0;

        C00051(com.Gaycock4U.Gaycock4U r1, kotlin.coroutines.Continuation<? super com.Gaycock4U.Gaycock4U.C00051> r2) {
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
                com.Gaycock4U.Gaycock4U r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.search(r1, r2)
                return r0
        }
    }

    public Gaycock4U() {
            r10 = this;
            r10.<init>()
            java.lang.String r0 = "https://gaycock4u.com"
            r10.mainUrl = r0
            java.lang.String r0 = "Gaycock4U"
            r10.name = r0
            r0 = 1
            r10.hasMainPage = r0
            java.lang.String r1 = "en"
            r10.lang = r1
            r10.hasDownloadSupport = r0
            r10.hasChromecastSupport = r0
            com.lagradost.cloudstream3.TvType r1 = com.lagradost.cloudstream3.TvType.NSFW
            java.util.Set r1 = kotlin.collections.SetsKt.setOf(r1)
            r10.supportedTypes = r1
            com.lagradost.cloudstream3.VPNStatus r1 = com.lagradost.cloudstream3.VPNStatus.MightBeNeeded
            r10.vpnStatus = r1
            java.lang.String r1 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36"
            r10.userAgent = r1
            r1 = 6
            kotlin.Pair[] r2 = new kotlin.Pair[r1]
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = r10.userAgent
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "Accept"
            java.lang.String r5 = "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r5)
            r2[r0] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r10.getMainUrl()
            java.lang.StringBuilder r3 = r3.append(r5)
            r5 = 47
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "Referer"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r5, r3)
            r5 = 2
            r2[r5] = r3
            java.lang.String r3 = "Connection"
            java.lang.String r6 = "keep-alive"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r6)
            r6 = 3
            r2[r6] = r3
            java.lang.String r3 = "Accept-Language"
            java.lang.String r7 = "en-US,en;q=0.5"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r7)
            r7 = 4
            r2[r7] = r3
            java.lang.String r3 = "Upgrade-Insecure-Requests"
            java.lang.String r8 = "1"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r8)
            r8 = 5
            r2[r8] = r3
            java.util.Map r2 = kotlin.collections.MapsKt.mapOf(r2)
            r10.headers = r2
            com.lagradost.cloudstream3.network.CloudflareKiller r2 = new com.lagradost.cloudstream3.network.CloudflareKiller
            r2.<init>()
            r10.cfKiller = r2
            r2 = 21
            kotlin.Pair[] r2 = new kotlin.Pair[r2]
            java.lang.String r3 = "/#content"
            java.lang.String r9 = "Latest Updates"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r9)
            r2[r4] = r3
            java.lang.String r3 = "/category/amateur/"
            java.lang.String r4 = "Amateur"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r2[r0] = r3
            java.lang.String r0 = "/category/bareback/"
            java.lang.String r3 = "Bareback"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r3)
            r2[r5] = r0
            java.lang.String r0 = "/category/bigcock/"
            java.lang.String r3 = "Big Cock"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r3)
            r2[r6] = r0
            java.lang.String r0 = "/category/group/"
            java.lang.String r3 = "Group"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r3)
            r2[r7] = r0
            java.lang.String r0 = "/category/hardcore/"
            java.lang.String r3 = "Hardcore"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r3)
            r2[r8] = r0
            java.lang.String r0 = "/category/latino/"
            java.lang.String r3 = "Latino"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r3)
            r2[r1] = r0
            java.lang.String r0 = "/category/interracial/"
            java.lang.String r1 = "Interracial"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 7
            r2[r1] = r0
            java.lang.String r0 = "/category/twink/"
            java.lang.String r1 = "Twink"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 8
            r2[r1] = r0
            java.lang.String r0 = "/studio/asianetwork/"
            java.lang.String r1 = "Asianetwork"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 9
            r2[r1] = r0
            java.lang.String r0 = "/studio/bromo/"
            java.lang.String r1 = "Bromo"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 10
            r2[r1] = r0
            java.lang.String r0 = "/studio/chaosmen/"
            java.lang.String r1 = "Chaos Men"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 11
            r2[r1] = r0
            java.lang.String r0 = "/studio/euronetwork/"
            java.lang.String r1 = "Euro Network"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 12
            r2[r1] = r0
            java.lang.String r0 = "/studio/gayhoopla/"
            java.lang.String r1 = "Gay Hoopla"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 13
            r2[r1] = r0
            java.lang.String r0 = "/studio/latinleche/"
            java.lang.String r1 = "Latino Leche"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 14
            r2[r1] = r0
            java.lang.String r0 = "/studio/latinonetwork/"
            java.lang.String r1 = "Latino Network"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 15
            r2[r1] = r0
            java.lang.String r0 = "/studio/lucasentertainment/"
            java.lang.String r1 = "Lucas Entertainment"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 16
            r2[r1] = r0
            java.lang.String r0 = "/studio/onlyfans/"
            java.lang.String r1 = "Onlyfans"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 17
            r2[r1] = r0
            java.lang.String r0 = "/studio/rawfuckclub/"
            java.lang.String r1 = "Raw Fuck Club"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 18
            r2[r1] = r0
            java.lang.String r0 = "/studio/ragingstallion/"
            java.lang.String r1 = "Ragingstallion"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 19
            r2[r1] = r0
            java.lang.String r0 = "/studio/seancody/"
            java.lang.String r1 = "Sean Cody"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 20
            r2[r1] = r0
            java.util.List r0 = com.lagradost.cloudstream3.MainAPIKt.mainPageOf(r2)
            r10.mainPage = r0
            return
    }

    private static final java.lang.String loadLinks$normalize(java.lang.String r5) {
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r0)
            java.lang.String r0 = r0.toString()
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            r2 = 0
            if (r1 != 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 == 0) goto L1e
            java.lang.String r1 = ""
            goto L3d
        L1e:
            r1 = 2
            r3 = 0
            java.lang.String r4 = "//"
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r0, r4, r2, r1, r3)
            if (r1 == 0) goto L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "https:"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            goto L3d
        L3c:
            r1 = r0
        L3d:
            return r1
    }

    private final com.lagradost.cloudstream3.SearchResponse toRecommendResult(org.jsoup.nodes.Element r2) {
            r1 = this;
            com.lagradost.cloudstream3.SearchResponse r0 = r1.toSearchResult(r2)
            return r0
    }

    private final com.lagradost.cloudstream3.SearchResponse toSearchResult(org.jsoup.nodes.Element r12) {
            r11 = this;
            java.lang.String r0 = "p.elementor-heading-title a, h1.elementor-heading-title a, h2.elementor-heading-title a"
            org.jsoup.nodes.Element r0 = r12.selectFirst(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L1c
            java.lang.String r2 = r0.text()
            if (r2 == 0) goto L1c
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.CharSequence r2 = kotlin.text.StringsKt.trim(r2)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L1d
        L1c:
            r2 = r1
        L1d:
            r4 = r2
            java.lang.String r2 = "href"
            if (r0 == 0) goto L37
            java.lang.String r3 = r0.attr(r2)
            if (r3 == 0) goto L37
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r3 = kotlin.text.StringsKt.trim(r3)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L35
            goto L37
        L35:
            r5 = r3
            goto L53
        L37:
            java.lang.String r3 = "a[href]"
            org.jsoup.nodes.Element r3 = r12.selectFirst(r3)
            if (r3 == 0) goto L51
            java.lang.String r2 = r3.attr(r2)
            if (r2 == 0) goto L51
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.CharSequence r2 = kotlin.text.StringsKt.trim(r2)
            java.lang.String r3 = r2.toString()
            r5 = r3
            goto L53
        L51:
            r5 = r1
        L53:
            java.lang.String r2 = "img[src]"
            org.jsoup.nodes.Element r2 = r12.selectFirst(r2)
            if (r2 == 0) goto L73
            java.lang.String r3 = "src"
            java.lang.String r2 = r2.attr(r3)
            if (r2 == 0) goto L73
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.CharSequence r2 = kotlin.text.StringsKt.trim(r2)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L71
            goto L73
        L71:
            r1 = r2
            goto L90
        L73:
            java.lang.String r2 = "img[data-src]"
            org.jsoup.nodes.Element r2 = r12.selectFirst(r2)
            if (r2 == 0) goto L8e
            java.lang.String r3 = "data-src"
            java.lang.String r2 = r2.attr(r3)
            if (r2 == 0) goto L8e
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r2)
            java.lang.String r1 = r1.toString()
            goto L90
        L8e:
        L90:
            r2 = r4
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 != 0) goto Lb9
            r2 = r5
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 == 0) goto La4
            goto Lb9
        La4:
            r3 = r11
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            com.lagradost.cloudstream3.TvType r6 = com.lagradost.cloudstream3.TvType.NSFW
            com.Gaycock4U.Gaycock4U$$ExternalSyntheticLambda0 r8 = new com.Gaycock4U.Gaycock4U$$ExternalSyntheticLambda0
            r8.<init>(r1)
            r9 = 8
            r10 = 0
            r7 = 0
            com.lagradost.cloudstream3.MovieSearchResponse r2 = com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse$default(r3, r4, r5, r6, r7, r8, r9, r10)
            com.lagradost.cloudstream3.SearchResponse r2 = (com.lagradost.cloudstream3.SearchResponse) r2
            return r2
        Lb9:
            r2 = 0
            return r2
    }

    static final kotlin.Unit toSearchResult$lambda$0(java.lang.String r1, com.lagradost.cloudstream3.MovieSearchResponse r2) {
            r2.setPosterUrl(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public boolean getHasChromecastSupport() {
            r1 = this;
            boolean r0 = r1.hasChromecastSupport
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

    @org.jetbrains.annotations.NotNull
    public java.lang.String getLang() {
            r1 = this;
            java.lang.String r0 = r1.lang
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object getMainPage(int r25, @org.jetbrains.annotations.NotNull com.lagradost.cloudstream3.MainPageRequest r26, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.HomePageResponse> r27) {
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r27
            boolean r3 = r2 instanceof com.Gaycock4U.Gaycock4U.C00011
            if (r3 == 0) goto L1a
            r3 = r2
            com.Gaycock4U.Gaycock4U$getMainPage$1 r3 = (com.Gaycock4U.Gaycock4U.C00011) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.Gaycock4U.Gaycock4U$getMainPage$1 r3 = new com.Gaycock4U.Gaycock4U$getMainPage$1
            r3.<init>(r0, r2)
        L1f:
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r3.label
            r7 = 1
            switch(r6) {
                case 0: goto L61;
                case 1: goto L4a;
                case 2: goto L33;
                default: goto L2b;
            }
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            int r1 = r3.I$0
            java.lang.Object r5 = r3.L$2
            org.jsoup.nodes.Document r5 = (org.jsoup.nodes.Document) r5
            java.lang.Object r6 = r3.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r3.L$0
            com.lagradost.cloudstream3.MainPageRequest r8 = (com.lagradost.cloudstream3.MainPageRequest) r8
            kotlin.ResultKt.throwOnFailure(r4)
            r18 = r3
            r3 = r4
            r2 = 1
            goto L15c
        L4a:
            int r1 = r3.I$0
            java.lang.Object r6 = r3.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r3.L$0
            com.lagradost.cloudstream3.MainPageRequest r8 = (com.lagradost.cloudstream3.MainPageRequest) r8
            kotlin.ResultKt.throwOnFailure(r4)
            r7 = r4
            r2 = 1
            r4 = r1
            r1 = r5
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r7
            goto Lf1
        L61:
            kotlin.ResultKt.throwOnFailure(r4)
            if (r1 <= r7) goto L8a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r0.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = r26.getData()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = "page/"
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            goto La3
        L8a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r0.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = r26.getData()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
        La3:
            r8 = r4
            com.lagradost.nicehttp.Requests r4 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r9 = r26
            r3.L$0 = r9
            r3.L$1 = r6
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
            r6 = r18
            if (r4 != r1) goto Leb
            return r1
        Leb:
            r7 = r4
            r8 = r5
            r4 = r25
            r5 = r26
        Lf1:
            com.lagradost.nicehttp.NiceResponse r7 = (com.lagradost.nicehttp.NiceResponse) r7
            org.jsoup.nodes.Document r7 = r7.getDocument()
            java.lang.String r9 = "title"
            org.jsoup.select.Elements r9 = r7.select(r9)
            java.lang.String r9 = r9.text()
            java.lang.String r10 = "Just a moment..."
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r9 == 0) goto L166
            com.lagradost.nicehttp.Requests r9 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.util.Map<java.lang.String, java.lang.String> r10 = r0.headers
            com.lagradost.cloudstream3.network.CloudflareKiller r11 = r0.cfKiller
            r15 = r11
            okhttp3.Interceptor r15 = (okhttp3.Interceptor) r15
            r6.L$0 = r5
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r6.L$1 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r6.L$2 = r11
            r6.I$0 = r4
            r11 = 2
            r6.label = r11
            r11 = r7
            r7 = 0
            r12 = r5
            r5 = r8
            r8 = 0
            r13 = r4
            r4 = r9
            r9 = 0
            r18 = r6
            r6 = r10
            r10 = 1
            r14 = r11
            r11 = 0
            r16 = r12
            r12 = 0
            r19 = r13
            r17 = r14
            r13 = 120(0x78, double:5.93E-322)
            r20 = r16
            r16 = 0
            r21 = r17
            r17 = 0
            r22 = r19
            r19 = 3292(0xcdc, float:4.613E-42)
            r23 = r20
            r20 = 0
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            if (r4 != r1) goto L155
            return r1
        L155:
            r6 = r5
            r5 = r21
            r1 = r22
            r8 = r23
        L15c:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r7 = r4.getDocument()
            r4 = r1
            r5 = r8
            r8 = r6
            goto L171
        L166:
            r22 = r4
            r23 = r5
            r18 = r6
            r21 = r7
            r5 = r8
            r5 = r23
        L171:
            java.lang.String r1 = "article.dce-post"
            org.jsoup.select.Elements r1 = r7.select(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r6 = 0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Collection r9 = (java.util.Collection) r9
            r10 = r1
            r11 = 0
            r12 = r10
            r13 = 0
            java.util.Iterator r14 = r12.iterator()
        L18a:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L1ab
            java.lang.Object r15 = r14.next()
            r16 = r15
            r17 = 0
            r2 = r16
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            r19 = 0
            com.lagradost.cloudstream3.SearchResponse r2 = r0.toSearchResult(r2)
            if (r2 == 0) goto L1a9
            r19 = 0
            r9.add(r2)
        L1a9:
            r2 = 1
            goto L18a
        L1ab:
            r2 = r9
            java.util.List r2 = (java.util.List) r2
            com.lagradost.cloudstream3.HomePageList r1 = new com.lagradost.cloudstream3.HomePageList
            java.lang.String r6 = r5.getName()
            r14 = 1
            r1.<init>(r6, r2, r14)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r14)
            com.lagradost.cloudstream3.HomePageResponse r1 = com.lagradost.cloudstream3.MainAPIKt.newHomePageResponse(r1, r6)
            return r1
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
    public java.lang.Object load(@org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.LoadResponse> r24) {
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof com.Gaycock4U.Gaycock4U.C00021
            if (r2 == 0) goto L18
            r2 = r1
            com.Gaycock4U.Gaycock4U$load$1 r2 = (com.Gaycock4U.Gaycock4U.C00021) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Gaycock4U.Gaycock4U$load$1 r2 = new com.Gaycock4U.Gaycock4U$load$1
            r2.<init>(r0, r1)
        L1d:
            r9 = r2
            java.lang.Object r2 = r9.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r9.label
            switch(r4) {
                case 0: goto L5c;
                case 1: goto L51;
                case 2: goto L31;
                default: goto L29;
            }
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L31:
            java.lang.Object r3 = r9.L$5
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r9.L$4
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r9.L$3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r9.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.L$1
            org.jsoup.nodes.Document r7 = (org.jsoup.nodes.Document) r7
            java.lang.Object r8 = r9.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r2
            r17 = r9
            goto L16a
        L51:
            java.lang.Object r4 = r9.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r3
            r5 = r4
            r3 = r2
            goto L8c
        L5c:
            kotlin.ResultKt.throwOnFailure(r2)
            r4 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r5 = r23
            r9.L$0 = r5
            r6 = 1
            r9.label = r6
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r17 = r9
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 4094(0xffe, float:5.737E-42)
            r19 = 0
            r1 = r4
            r4 = r23
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r9 = r17
            if (r3 != r1) goto L8a
            return r1
        L8a:
            r5 = r23
        L8c:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r10 = r3.getDocument()
            java.lang.String r3 = "meta[property=og:title]"
            org.jsoup.nodes.Element r3 = r10.selectFirst(r3)
            java.lang.String r4 = "content"
            if (r3 == 0) goto Lad
            java.lang.String r3 = r3.attr(r4)
            if (r3 == 0) goto Lad
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r3 = kotlin.text.StringsKt.trim(r3)
            java.lang.String r3 = r3.toString()
            goto Lae
        Lad:
            r3 = 0
        Lae:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r7 = r0
            com.lagradost.cloudstream3.MainAPI r7 = (com.lagradost.cloudstream3.MainAPI) r7
            java.lang.String r8 = "[property='og:image']"
            org.jsoup.nodes.Element r8 = r10.selectFirst(r8)
            if (r8 == 0) goto Lc2
            java.lang.String r8 = r8.attr(r4)
            goto Lc3
        Lc2:
            r8 = 0
        Lc3:
            java.lang.String r11 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r7, r8)
            java.lang.String r7 = "meta[property=og:description]"
            org.jsoup.nodes.Element r7 = r10.selectFirst(r7)
            if (r7 == 0) goto Le0
            java.lang.String r4 = r7.attr(r4)
            if (r4 == 0) goto Le0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim(r4)
            java.lang.String r4 = r4.toString()
            goto Le1
        Le0:
            r4 = 0
        Le1:
            r12 = r4
            java.lang.String r4 = "div.elementor-widget-container article.elementor-post"
            org.jsoup.select.Elements r4 = r10.select(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r7 = 0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r8 = (java.util.Collection) r8
            r13 = r4
            r14 = 0
            r15 = r13
            r16 = 0
            java.util.Iterator r17 = r15.iterator()
        Lfb:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L11c
            java.lang.Object r18 = r17.next()
            r19 = r18
            r20 = 0
            r6 = r19
            org.jsoup.nodes.Element r6 = (org.jsoup.nodes.Element) r6
            r21 = 0
            com.lagradost.cloudstream3.SearchResponse r6 = r0.toRecommendResult(r6)
            if (r6 == 0) goto L11a
            r21 = 0
            r8.add(r6)
        L11a:
            goto Lfb
        L11c:
            r6 = r8
            java.util.List r6 = (java.util.List) r6
            r13 = r6
            r4 = r3
            r3 = r0
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            com.lagradost.cloudstream3.TvType r6 = com.lagradost.cloudstream3.TvType.NSFW
            com.Gaycock4U.Gaycock4U$load$2 r7 = new com.Gaycock4U.Gaycock4U$load$2
            r8 = 0
            r7.<init>(r11, r12, r13, r8)
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r9.L$0 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r9.L$1 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r9.L$2 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r9.L$3 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r9.L$4 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r9.L$5 = r7
            r7 = 2
            r9.label = r7
            r7 = r5
            java.lang.Object r3 = com.lagradost.cloudstream3.MainAPIKt.newMovieLoadResponse(r3, r4, r5, r6, r7, r8, r9)
            r17 = r9
            if (r3 != r1) goto L163
            return r1
        L163:
            r1 = r3
            r6 = r4
            r8 = r5
            r7 = r10
            r5 = r11
            r4 = r12
            r3 = r13
        L16a:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object loadLinks(@org.jetbrains.annotations.NotNull java.lang.String r22, boolean r23, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r24, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r26) {
            r21 = this;
            r0 = r26
            boolean r1 = r0 instanceof com.Gaycock4U.Gaycock4U.C00041
            if (r1 == 0) goto L18
            r1 = r0
            com.Gaycock4U.Gaycock4U$loadLinks$1 r1 = (com.Gaycock4U.Gaycock4U.C00041) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            r2 = r21
            goto L1f
        L18:
            com.Gaycock4U.Gaycock4U$loadLinks$1 r1 = new com.Gaycock4U.Gaycock4U$loadLinks$1
            r2 = r21
            r1.<init>(r2, r0)
        L1f:
            java.lang.Object r3 = r1.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r1.label
            switch(r5) {
                case 0: goto L92;
                case 1: goto L77;
                case 2: goto L34;
                default: goto L2a;
            }
        L2a:
            r17 = r1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            int r5 = r1.I$1
            int r7 = r1.I$0
            boolean r8 = r1.Z$0
            java.lang.Object r9 = r1.L$9
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r1.L$8
            org.jsoup.nodes.Element r10 = (org.jsoup.nodes.Element) r10
            java.lang.Object r11 = r1.L$7
            java.lang.Object r12 = r1.L$6
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r13 = r1.L$5
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r14 = r1.L$4
            kotlin.jvm.internal.Ref$BooleanRef r14 = (kotlin.jvm.internal.Ref.BooleanRef) r14
            java.lang.Object r15 = r1.L$3
            org.jsoup.nodes.Document r15 = (org.jsoup.nodes.Document) r15
            java.lang.Object r6 = r1.L$2
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            java.lang.Object r0 = r1.L$1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r23 = r0
            java.lang.Object r0 = r1.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r14
            r18 = r15
            r14 = r12
            r15 = r13
            r12 = r10
            r13 = r11
            r11 = r2
            r2 = r6
            r10 = r7
            r6 = r23
            r7 = r0
            r0 = r26
            goto L1a9
        L77:
            boolean r0 = r1.Z$0
            java.lang.Object r5 = r1.L$2
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            java.lang.Object r6 = r1.L$1
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            java.lang.Object r7 = r1.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r1
            r20 = r3
            r1 = r4
            r3 = r0
            r4 = r20
            r0 = 1
            goto Ldc
        L92:
            kotlin.ResultKt.throwOnFailure(r3)
            r0 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r1.L$0 = r5
            r5 = r24
            r1.L$1 = r5
            r6 = r25
            r1.L$2 = r6
            r7 = r23
            r1.Z$0 = r7
            r8 = 1
            r1.label = r8
            r5 = 0
            r6 = 0
            r7 = 0
            r16 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 1
            r16 = 0
            r18 = 4094(0xffe, float:5.737E-42)
            r19 = 0
            r20 = r0
            r17 = r1
            r1 = r4
            r0 = 1
            r4 = r22
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r3 != r1) goto Ld3
            return r1
        Ld3:
            r7 = r22
            r6 = r24
            r5 = r25
            r4 = r3
            r3 = r23
        Ldc:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r4 = r4.getDocument()
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
            r8.<init>()
            java.lang.String r9 = "iframe[src], iframe[data-src]"
            org.jsoup.select.Elements r9 = r4.select(r9)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r10 = 0
            java.util.Iterator r11 = r9.iterator()
            r15 = r4
            r14 = r8
            r13 = r9
            r12 = r11
            r4 = r1
            r9 = r2
            r8 = r3
            r3 = r17
            r1 = r26
        Lff:
            boolean r11 = r12.hasNext()
            if (r11 == 0) goto L1bf
            java.lang.Object r11 = r12.next()
            r0 = r11
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            r22 = r1
            r1 = 0
            java.lang.String r2 = "src"
            java.lang.String r17 = r0.absUrl(r2)
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17
            boolean r18 = kotlin.text.StringsKt.isBlank(r17)
            if (r18 == 0) goto L124
            r17 = 0
            java.lang.String r17 = r0.attr(r2)
        L124:
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17
            boolean r2 = kotlin.text.StringsKt.isBlank(r17)
            r23 = r2
            java.lang.String r2 = "data-src"
            if (r23 == 0) goto L136
            r17 = 0
            java.lang.String r17 = r0.absUrl(r2)
        L136:
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17
            boolean r18 = kotlin.text.StringsKt.isBlank(r17)
            if (r18 == 0) goto L144
            r17 = 0
            java.lang.String r17 = r0.attr(r2)
        L144:
            java.lang.String r17 = (java.lang.String) r17
            r2 = r17
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 != 0) goto L1b6
            r2 = 1
            r14.element = r2
            java.lang.String r2 = loadLinks$normalize(r17)
            r23 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r3.L$0 = r0
            r3.L$1 = r6
            r3.L$2 = r5
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r3.L$3 = r0
            r3.L$4 = r14
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r3.L$5 = r0
            r3.L$6 = r12
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r3.L$7 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)
            r3.L$8 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r17)
            r3.L$9 = r0
            r3.Z$0 = r8
            r3.I$0 = r10
            r3.I$1 = r1
            r0 = 2
            r3.label = r0
            java.lang.Object r0 = com.lagradost.cloudstream3.utils.ExtractorApiKt.loadExtractor(r2, r6, r5, r3)
            if (r0 != r4) goto L196
            return r4
        L196:
            r0 = r22
            r2 = r5
            r18 = r15
            r5 = r1
            r1 = r3
            r15 = r13
            r3 = r20
            r13 = r11
            r11 = r9
            r9 = r17
            r17 = r14
            r14 = r12
            r12 = r23
        L1a9:
            r5 = r2
            r20 = r3
            r9 = r11
            r12 = r14
            r13 = r15
            r14 = r17
            r15 = r18
            r3 = r1
            r1 = r0
            goto L1ba
        L1b6:
            r23 = r0
            r1 = r22
        L1ba:
            r2 = r21
            r0 = 1
            goto Lff
        L1bf:
            boolean r0 = r14.element
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object search(@org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.SearchResponse>> r28) {
            r26 = this;
            r0 = r28
            boolean r1 = r0 instanceof com.Gaycock4U.Gaycock4U.C00051
            if (r1 == 0) goto L18
            r1 = r0
            com.Gaycock4U.Gaycock4U$search$1 r1 = (com.Gaycock4U.Gaycock4U.C00051) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            r2 = r26
            goto L1f
        L18:
            com.Gaycock4U.Gaycock4U$search$1 r1 = new com.Gaycock4U.Gaycock4U$search$1
            r2 = r26
            r1.<init>(r2, r0)
        L1f:
            java.lang.Object r3 = r1.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r1.label
            switch(r5) {
                case 0: goto L48;
                case 1: goto L32;
                default: goto L2a;
            }
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r3)
            throw r1
        L32:
            int r5 = r1.I$0
            java.lang.Object r6 = r1.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r1
            r20 = r3
            r1 = r0
            r0 = r7
            r7 = r2
            goto Ld3
        L48:
            kotlin.ResultKt.throwOnFailure(r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r5 = (java.util.List) r5
            r6 = 1
            r20 = r6
            r6 = r5
            r5 = r20
            r21 = r2
            r20 = r3
            r3 = r1
            r1 = r0
            r0 = r27
        L60:
            r7 = 6
            if (r5 >= r7) goto L144
            com.lagradost.nicehttp.Requests r7 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r21.getMainUrl()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = "/page/"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r5)
            java.lang.String r9 = "/?s="
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            r3.L$0 = r0
            r3.L$1 = r6
            r3.I$0 = r5
            r9 = 1
            r3.label = r9
            r9 = r5
            r5 = 0
            r10 = r6
            r6 = 0
            r17 = r3
            r3 = r7
            r7 = 0
            r11 = r4
            r4 = r8
            r8 = 0
            r12 = r9
            r9 = 0
            r13 = r10
            r10 = 0
            r14 = r11
            r11 = 0
            r15 = r12
            r16 = r13
            r12 = 0
            r18 = r14
            r14 = 0
            r19 = r15
            r15 = 0
            r22 = r16
            r16 = 0
            r23 = r18
            r18 = 4094(0xffe, float:5.737E-42)
            r24 = r19
            r19 = 0
            r25 = r23
            r23 = r0
            r0 = r25
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r3 != r0) goto Lca
            return r0
        Lca:
            r4 = r0
            r7 = r21
            r6 = r22
            r0 = r23
            r5 = r24
        Ld3:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r3 = r3.getDocument()
            java.lang.String r8 = "div.elementor-widget-container article.elementor-post"
            org.jsoup.select.Elements r8 = r3.select(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r9 = 0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Collection r10 = (java.util.Collection) r10
            r11 = r8
            r12 = 0
            r13 = r11
            r14 = 0
            java.util.Iterator r15 = r13.iterator()
        Lf1:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L115
            java.lang.Object r16 = r15.next()
            r18 = r16
            r19 = 0
            r27 = r0
            r0 = r18
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            r21 = 0
            com.lagradost.cloudstream3.SearchResponse r0 = r7.toSearchResult(r0)
            if (r0 == 0) goto L112
            r21 = 0
            r10.add(r0)
        L112:
            r0 = r27
            goto Lf1
        L115:
            r27 = r0
            r0 = r10
            java.util.List r0 = (java.util.List) r0
            r8 = r0
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r6.containsAll(r8)
            if (r8 != 0) goto L13c
            r8 = r0
            java.util.Collection r8 = (java.util.Collection) r8
            r6.addAll(r8)
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L13d
            int r5 = r5 + 1
            r21 = r7
            r3 = r17
            r0 = r27
            goto L60
        L13c:
        L13d:
            r0 = r27
            r21 = r7
            r3 = r17
            goto L14c
        L144:
            r23 = r0
            r17 = r3
            r24 = r5
            r22 = r6
        L14c:
            return r6
    }

    public void setLang(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            r0 = this;
            r0.lang = r1
            return
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
