package com.Fullboys;

/* JADX INFO: compiled from: Fullboys.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump_unblinded/Fullboys/classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u001e\u0010-\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0096@\u00a2\u0006\u0002\u00104J\u000e\u00105\u001a\u0004\u0018\u000106*\u000207H\u0002J\u001c\u00108\u001a\b\u0012\u0004\u0012\u0002060+2\u0006\u00109\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010:J\u0018\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010:JF\u0010>\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u00162\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00050B2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00050BH\u0096@\u00a2\u0006\u0002\u0010FR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u0016X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u0016X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0014\u0010 \u001a\u00020\u0016X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0#X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.\u00a8\u0006G"}, d2 = {"Lcom/Fullboys/Fullboys;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "logError", "", "t", "", "logDebug", "msg", "", "globalTvType", "Lcom/lagradost/cloudstream3/TvType;", "mainUrl", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "lang", "getLang", "setLang", "hasQuickSearch", "getHasQuickSearch", "hasChromecastSupport", "getHasChromecastSupport", "hasDownloadSupport", "getHasDownloadSupport", "supportedTypes", "", "getSupportedTypes", "()Ljava/util/Set;", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lorg/jsoup/nodes/Element;", "search", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Fullboys"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFullboys.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fullboys.kt\ncom/Fullboys/Fullboys\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1642#2,10:259\n1915#2:269\n1916#2:271\n1652#2:272\n1642#2,10:273\n1915#2:283\n1916#2:285\n1652#2:286\n1642#2,10:288\n1915#2:298\n1916#2:300\n1652#2:301\n1915#2,2:302\n1915#2,2:304\n1915#2,2:306\n1915#2,2:308\n1#3:270\n1#3:284\n1#3:287\n1#3:299\n*S KotlinDebug\n*F\n+ 1 Fullboys.kt\ncom/Fullboys/Fullboys\n*L\n68#1:259,10\n68#1:269\n68#1:271\n68#1:272\n93#1:273,10\n93#1:283\n93#1:285\n93#1:286\n107#1:288,10\n107#1:298\n107#1:300\n107#1:301\n151#1:302,2\n176#1:304,2\n198#1:306,2\n232#1:308,2\n68#1:270\n93#1:284\n107#1:299\n*E\n"})
public final class Fullboys extends com.lagradost.cloudstream3.MainAPI {

    @org.jetbrains.annotations.NotNull
    private final com.lagradost.cloudstream3.TvType globalTvType;
    private final boolean hasChromecastSupport;
    private final boolean hasDownloadSupport;
    private final boolean hasMainPage;
    private final boolean hasQuickSearch;

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
    private final com.lagradost.cloudstream3.VPNStatus vpnStatus;

    /* JADX INFO: renamed from: com.Fullboys.Fullboys$getMainPage$1 */
    /* JADX INFO: compiled from: Fullboys.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Fullboys.Fullboys", f = "Fullboys.kt", i = {0, 0, 0}, l = {67}, m = "getMainPage", n = {"request", "pageUrl", "page"}, nl = {68}, s = {"L$0", "L$1", "I$0"}, v = 2)
    static final class C00001 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.Fullboys.Fullboys this$0;

        C00001(com.Fullboys.Fullboys r1, kotlin.coroutines.Continuation<? super com.Fullboys.Fullboys.C00001> r2) {
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
                com.Fullboys.Fullboys r0 = r4.this$0
                r1 = 0
                r2 = r4
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r3 = 0
                java.lang.Object r0 = r0.getMainPage(r3, r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: com.Fullboys.Fullboys$load$1 */
    /* JADX INFO: compiled from: Fullboys.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Fullboys.Fullboys", f = "Fullboys.kt", i = {0, 1, 1, 1, 1, 1, 1, 1}, l = {97, 131}, m = "load", n = {"url", "url", "doc", "name", "iframeSrc", "poster", "description", "recommendations"}, nl = {98, -1}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"}, v = 2)
    static final class C00011 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        java.lang.Object L$6;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.Fullboys.Fullboys this$0;

        C00011(com.Fullboys.Fullboys r1, kotlin.coroutines.Continuation<? super com.Fullboys.Fullboys.C00011> r2) {
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
                com.Fullboys.Fullboys r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.load(r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: com.Fullboys.Fullboys$load$2 */
    /* JADX INFO: compiled from: Fullboys.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Fullboys.Fullboys$load$2", f = "Fullboys.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00022 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.lagradost.cloudstream3.MovieLoadResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String $description;
        final /* synthetic */ java.lang.String $poster;
        final /* synthetic */ java.util.List<com.lagradost.cloudstream3.MovieSearchResponse> $recommendations;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        C00022(java.lang.String r2, java.lang.String r3, java.util.List<com.lagradost.cloudstream3.MovieSearchResponse> r4, kotlin.coroutines.Continuation<? super com.Fullboys.Fullboys.C00022> r5) {
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
                com.Fullboys.Fullboys$load$2 r0 = new com.Fullboys.Fullboys$load$2
                java.lang.String r1 = r4.$poster
                java.lang.String r2 = r4.$description
                java.util.List<com.lagradost.cloudstream3.MovieSearchResponse> r3 = r4.$recommendations
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        public final java.lang.Object invoke(com.lagradost.cloudstream3.MovieLoadResponse r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                com.Fullboys.Fullboys$load$2 r0 = (com.Fullboys.Fullboys.C00022) r0
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
                java.util.List<com.lagradost.cloudstream3.MovieSearchResponse> r1 = r3.$recommendations
                r0.setRecommendations(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    /* JADX INFO: renamed from: com.Fullboys.Fullboys$loadLinks$1 */
    /* JADX INFO: compiled from: Fullboys.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Fullboys.Fullboys", f = "Fullboys.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, l = {145, 160, 182, 205, 214, 243}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "isCasting", "data", "subtitleCallback", "callback", "doc", "links", "$this$forEach$iv", "element$iv", "img", "poster", "videoUrl", "isCasting", "$i$f$forEach", "$i$a$-forEach-Fullboys$loadLinks$2", "data", "subtitleCallback", "callback", "doc", "links", "$this$forEach$iv", "element$iv", "btn", "url", "isCasting", "$i$f$forEach", "$i$a$-forEach-Fullboys$loadLinks$3", "data", "subtitleCallback", "callback", "doc", "links", "$this$forEach$iv", "element$iv", "btn", "playerUrl", "fullUrl", "isCasting", "$i$f$forEach", "$i$a$-forEach-Fullboys$loadLinks$4", "data", "subtitleCallback", "callback", "doc", "links", "$this$forEach$iv", "element$iv", "btn", "playerUrl", "fullUrl", "res", "videoUrl", "isCasting", "$i$f$forEach", "$i$a$-forEach-Fullboys$loadLinks$4", "data", "subtitleCallback", "callback", "doc", "links", "$this$forEach$iv", "element$iv", "btn", "onclick", "url", "isCasting", "$i$f$forEach", "$i$a$-forEach-Fullboys$loadLinks$5"}, nl = {146, 159, 181, 209, 213, 242}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "L$10", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "L$10", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "L$10", "Z$0", "I$0", "I$1"}, v = 2)
    static final class C00031 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$10;
        java.lang.Object L$11;
        java.lang.Object L$12;
        java.lang.Object L$13;
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
        final /* synthetic */ com.Fullboys.Fullboys this$0;

        C00031(com.Fullboys.Fullboys r1, kotlin.coroutines.Continuation<? super com.Fullboys.Fullboys.C00031> r2) {
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
                com.Fullboys.Fullboys r1 = r7.this$0
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

    /* JADX INFO: renamed from: com.Fullboys.Fullboys$search$1 */
    /* JADX INFO: compiled from: Fullboys.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Fullboys.Fullboys", f = "Fullboys.kt", i = {0, 0}, l = {92}, m = "search", n = {"query", "url"}, nl = {93}, s = {"L$0", "L$1"}, v = 2)
    static final class C00041 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.Fullboys.Fullboys this$0;

        C00041(com.Fullboys.Fullboys r1, kotlin.coroutines.Continuation<? super com.Fullboys.Fullboys.C00041> r2) {
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
                com.Fullboys.Fullboys r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.search(r1, r2)
                return r0
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v75r1LwRQDeHheqDlhL4zDgz7ow(java.lang.String r0, com.lagradost.cloudstream3.MovieSearchResponse r1) {
            kotlin.Unit r0 = load$lambda$2$6(r0, r1)
            return r0
    }

    public Fullboys() {
            r7 = this;
            r7.<init>()
            com.lagradost.cloudstream3.TvType r0 = com.lagradost.cloudstream3.TvType.NSFW
            r7.globalTvType = r0
            java.lang.String r0 = "https://fullboys.com"
            r7.mainUrl = r0
            java.lang.String r0 = "Fullboys \u1f308"
            r7.name = r0
            r0 = 1
            r7.hasMainPage = r0
            java.lang.String r1 = "vi"
            r7.lang = r1
            r7.hasQuickSearch = r0
            r7.hasChromecastSupport = r0
            r7.hasDownloadSupport = r0
            r1 = 3
            com.lagradost.cloudstream3.TvType[] r2 = new com.lagradost.cloudstream3.TvType[r1]
            com.lagradost.cloudstream3.TvType r3 = com.lagradost.cloudstream3.TvType.NSFW
            r4 = 0
            r2[r4] = r3
            com.lagradost.cloudstream3.TvType r3 = com.lagradost.cloudstream3.TvType.TvSeries
            r2[r0] = r3
            com.lagradost.cloudstream3.TvType r3 = com.lagradost.cloudstream3.TvType.Movie
            r5 = 2
            r2[r5] = r3
            java.util.Set r2 = kotlin.collections.SetsKt.setOf(r2)
            r7.supportedTypes = r2
            com.lagradost.cloudstream3.VPNStatus r2 = com.lagradost.cloudstream3.VPNStatus.MightBeNeeded
            r7.vpnStatus = r2
            r2 = 16
            kotlin.Pair[] r2 = new kotlin.Pair[r2]
            java.lang.String r3 = "/"
            java.lang.String r6 = "M\u1edbi nh\u1ea5t"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r6)
            r2[r4] = r3
            java.lang.String r3 = "/topic/video/asian"
            java.lang.String r4 = "Asian"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r2[r0] = r3
            java.lang.String r0 = "/topic/video/china"
            java.lang.String r3 = "Chinese"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r3)
            r2[r5] = r0
            java.lang.String r0 = "/topic/video/korean"
            java.lang.String r3 = "Korean"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r3)
            r2[r1] = r0
            java.lang.String r0 = "/topic/video/japanese"
            java.lang.String r1 = "Japanese"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 4
            r2[r1] = r0
            java.lang.String r0 = "/topic/video/taiwanese"
            java.lang.String r1 = "Taiwanese"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 5
            r2[r1] = r0
            java.lang.String r0 = "/topic/video/viet-nam"
            java.lang.String r1 = "Vietnamese"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 6
            r2[r1] = r0
            java.lang.String r0 = "/topic/video/philippines"
            java.lang.String r1 = "Philippines"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 7
            r2[r1] = r0
            java.lang.String r0 = "/topic/video/singapore"
            java.lang.String r1 = "Singapore"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 8
            r2[r1] = r0
            java.lang.String r0 = "/topic/video/thailand"
            java.lang.String r1 = "Th\u00e1i Lan"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 9
            r2[r1] = r0
            java.lang.String r0 = "/topic/video/fucking"
            java.lang.String r1 = "Fucking"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 10
            r2[r1] = r0
            java.lang.String r0 = "/topic/video/threesome"
            java.lang.String r1 = "Ch\u01a1i ba"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 11
            r2[r1] = r0
            java.lang.String r0 = "/topic/video/group"
            java.lang.String r1 = "T\u1eadp th\u1ec3"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 12
            r2[r1] = r0
            java.lang.String r0 = "/?filter=vip"
            java.lang.String r1 = "VIP"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 13
            r2[r1] = r0
            java.lang.String r0 = "/topic/video/muscle"
            java.lang.String r1 = "C\u01a1 b\u1eafp"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 14
            r2[r1] = r0
            java.lang.String r0 = "/topic/video/straight-boy"
            java.lang.String r1 = "Trai th\u1eb3ng"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 15
            r2[r1] = r0
            java.util.List r0 = com.lagradost.cloudstream3.MainAPIKt.mainPageOf(r2)
            r7.mainPage = r0
            return
    }

    private static final kotlin.Unit load$lambda$2$6(java.lang.String r1, com.lagradost.cloudstream3.MovieSearchResponse r2) {
            r2.setPosterUrl(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private final void logDebug(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "Fullboys"
            android.util.Log.d(r0, r4)     // Catch: java.lang.Throwable -> L7
            goto L20
        L7:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fullboys: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r1)
        L20:
            return
    }

    private final void logError(java.lang.Throwable r5) {
            r4 = this;
            java.lang.String r0 = "Fullboys"
            java.lang.String r1 = r5.getMessage()     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto Lb
            java.lang.String r1 = "error"
        Lb:
            android.util.Log.e(r0, r1, r5)     // Catch: java.lang.Throwable -> Lf
            goto L2f
        Lf:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fullboys ERROR: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r5.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
            r5.printStackTrace()
        L2f:
            return
    }

    private final com.lagradost.cloudstream3.SearchResponse toSearchResult(org.jsoup.nodes.Element r11) {
            r10 = this;
            java.lang.String r0 = "h2.title"
            org.jsoup.nodes.Element r0 = r11.selectFirst(r0)
            r1 = 0
            if (r0 == 0) goto L55
            java.lang.String r0 = r0.text()
            if (r0 != 0) goto L10
            goto L55
        L10:
            r3 = r0
            r0 = r10
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            java.lang.String r2 = "a"
            org.jsoup.nodes.Element r2 = r11.selectFirst(r2)
            if (r2 == 0) goto L23
            java.lang.String r4 = "href"
            java.lang.String r2 = r2.attr(r4)
            goto L24
        L23:
            r2 = r1
        L24:
            java.lang.String r4 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r0, r2)
            if (r4 != 0) goto L2b
            return r1
        L2b:
            r0 = r10
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            java.lang.String r2 = "img.fix-w"
            org.jsoup.nodes.Element r2 = r11.selectFirst(r2)
            if (r2 == 0) goto L3c
            java.lang.String r1 = "src"
            java.lang.String r1 = r2.attr(r1)
        L3c:
            java.lang.String r0 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r0, r1)
            r2 = r10
            com.lagradost.cloudstream3.MainAPI r2 = (com.lagradost.cloudstream3.MainAPI) r2
            com.lagradost.cloudstream3.TvType r5 = com.lagradost.cloudstream3.TvType.Movie
            com.Fullboys.Fullboys$$ExternalSyntheticLambda1 r7 = new com.Fullboys.Fullboys$$ExternalSyntheticLambda1
            r7.<init>(r0)
            r8 = 8
            r9 = 0
            r6 = 0
            com.lagradost.cloudstream3.MovieSearchResponse r1 = com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse$default(r2, r3, r4, r5, r6, r7, r8, r9)
            com.lagradost.cloudstream3.SearchResponse r1 = (com.lagradost.cloudstream3.SearchResponse) r1
            return r1
        L55:
            return r1
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

    public boolean getHasQuickSearch() {
            r1 = this;
            boolean r0 = r1.hasQuickSearch
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getLang() {
            r1 = this;
            java.lang.String r0 = r1.lang
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object getMainPage(int r24, @org.jetbrains.annotations.NotNull com.lagradost.cloudstream3.MainPageRequest r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.HomePageResponse> r26) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r26
            boolean r3 = r2 instanceof com.Fullboys.Fullboys.C00001
            if (r3 == 0) goto L1a
            r3 = r2
            com.Fullboys.Fullboys$getMainPage$1 r3 = (com.Fullboys.Fullboys.C00001) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.Fullboys.Fullboys$getMainPage$1 r3 = new com.Fullboys.Fullboys$getMainPage$1
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
            java.lang.String r8 = "?page="
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
            java.lang.String r7 = "article.movie-item"
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
    public java.lang.Object load(@org.jetbrains.annotations.NotNull java.lang.String r39, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.LoadResponse> r40) {
            r38 = this;
            r1 = r38
            r2 = r40
            java.lang.String r3 = "img"
            boolean r0 = r2 instanceof com.Fullboys.Fullboys.C00011
            if (r0 == 0) goto L1a
            r0 = r2
            com.Fullboys.Fullboys$load$1 r0 = (com.Fullboys.Fullboys.C00011) r0
            int r4 = r0.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r0.label
            int r4 = r4 - r5
            r0.label = r4
            goto L1f
        L1a:
            com.Fullboys.Fullboys$load$1 r0 = new com.Fullboys.Fullboys$load$1
            r0.<init>(r1, r2)
        L1f:
            r10 = r0
            java.lang.Object r4 = r10.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r10.label
            r6 = 1
            switch(r0) {
                case 0: goto L65;
                case 1: goto L59;
                case 2: goto L34;
                default: goto L2c;
            }
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            java.lang.Object r0 = r10.L$6
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r10.L$5
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r10.L$4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.L$3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r10.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r10.L$1
            org.jsoup.nodes.Document r8 = (org.jsoup.nodes.Document) r8
            java.lang.Object r9 = r10.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r4)
            r22 = r4
            r18 = r10
            goto L31f
        L59:
            java.lang.Object r0 = r10.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r4)
            r6 = r0
            r22 = r4
            r1 = r5
            goto La7
        L65:
            kotlin.ResultKt.throwOnFailure(r4)
            r7 = r4
            com.lagradost.nicehttp.Requests r4 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r0 = r39
            r10.L$0 = r0
            r10.label = r6
            r8 = 1
            r6 = 0
            r9 = r7
            r7 = 0
            r11 = 1
            r8 = 0
            r12 = r9
            r9 = 0
            r18 = r10
            r10 = 0
            r13 = 1
            r11 = 0
            r14 = r12
            r12 = 0
            r15 = r14
            r16 = 1
            r13 = 0
            r17 = r15
            r15 = 0
            r19 = 1
            r16 = 0
            r20 = r17
            r17 = 0
            r21 = 1
            r19 = 4094(0xffe, float:5.737E-42)
            r22 = r20
            r20 = 0
            r1 = r5
            r5 = r0
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            r10 = r18
            if (r4 != r1) goto La5
            return r1
        La5:
            r6 = r39
        La7:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r11 = r4.getDocument()
            java.lang.String r0 = "h1.title-detail"
            org.jsoup.nodes.Element r0 = r11.selectFirst(r0)
            if (r0 == 0) goto L320
            java.lang.String r0 = r0.text()
            if (r0 == 0) goto L320
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r0)
            java.lang.String r5 = r0.toString()
            if (r5 != 0) goto Lcb
            r18 = r10
            goto L322
        Lcb:
            java.lang.String r0 = "iframe#ifvideo"
            org.jsoup.nodes.Element r0 = r11.selectFirst(r0)
            java.lang.String r7 = "src"
            if (r0 == 0) goto Lda
            java.lang.String r0 = r0.attr(r7)
            goto Ldb
        Lda:
            r0 = 0
        Ldb:
            r12 = r0
            java.lang.String r0 = "meta[property=og:image]"
            org.jsoup.nodes.Element r0 = r11.selectFirst(r0)
            r8 = 2
            java.lang.String r9 = "content"
            r13 = 0
            if (r0 == 0) goto Lf1
            java.lang.String r0 = r0.attr(r9)
            if (r0 != 0) goto Lef
            goto Lf1
        Lef:
            r4 = 1
            goto L127
        Lf1:
            if (r12 == 0) goto L125
            r0 = r12
            r14 = 0
            kotlin.text.Regex r15 = new kotlin.text.Regex
            java.lang.String r4 = "[?&]poster=([^&]+)"
            r15.<init>(r4)
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2 = 0
            kotlin.text.MatchResult r4 = kotlin.text.Regex.find$default(r15, r4, r13, r8, r2)
            if (r4 == 0) goto L116
            java.util.List r2 = r4.getGroupValues()
            if (r2 == 0) goto L116
            r4 = 1
            java.lang.Object r2 = kotlin.collections.CollectionsKt.getOrNull(r2, r4)
            java.lang.String r2 = (java.lang.String) r2
            goto L118
        L116:
            r4 = 1
            r2 = 0
        L118:
            if (r2 == 0) goto L126
        L11d:
            r0 = 0
            java.lang.String r14 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r2, r14)
            goto L127
        L125:
            r4 = 1
        L126:
            r0 = 0
        L127:
            r2 = r0
            java.lang.String r0 = "meta[name=description]"
            org.jsoup.nodes.Element r0 = r11.selectFirst(r0)
            if (r0 == 0) goto L135
            java.lang.String r0 = r0.attr(r9)
            goto L136
        L135:
            r0 = 0
        L136:
            if (r0 != 0) goto L13a
            java.lang.String r0 = ""
        L13a:
            r14 = r0
            java.lang.String r0 = "article.movie-item"
            org.jsoup.select.Elements r0 = r11.select(r0)
            r9 = r0
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r15 = 0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            r17 = r9
            r18 = 0
            r19 = r17
            r20 = 0
            java.util.Iterator r21 = r19.iterator()
        L159:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L2c9
            java.lang.Object r23 = r21.next()
            r24 = r23
            r25 = 0
            r13 = r24
            org.jsoup.nodes.Element r13 = (org.jsoup.nodes.Element) r13
            r26 = 0
            java.lang.String r0 = "a"
            org.jsoup.nodes.Element r0 = r13.selectFirst(r0)     // Catch: java.lang.Exception -> L2b4
            if (r0 != 0) goto L17d
            r37 = r3
            r36 = r5
            r3 = 0
            goto L2bb
        L17d:
            java.lang.String r8 = "title"
            java.lang.String r8 = r0.attr(r8)     // Catch: java.lang.Exception -> L2b4
            r27 = r8
            r28 = 0
            r29 = r27
            java.lang.CharSequence r29 = (java.lang.CharSequence) r29     // Catch: java.lang.Exception -> L2b4
            boolean r29 = kotlin.text.StringsKt.isBlank(r29)     // Catch: java.lang.Exception -> L2b4
            if (r29 != 0) goto L192
            goto L193
        L192:
            r8 = 0
        L193:
            if (r8 != 0) goto L1d7
            java.lang.String r8 = "data-title"
            java.lang.String r8 = r0.attr(r8)     // Catch: java.lang.Exception -> L1d0
            r27 = r8
            r28 = 0
            r29 = r27
            java.lang.CharSequence r29 = (java.lang.CharSequence) r29     // Catch: java.lang.Exception -> L1d0
            boolean r29 = kotlin.text.StringsKt.isBlank(r29)     // Catch: java.lang.Exception -> L1d0
            if (r29 != 0) goto L1aa
            goto L1ab
        L1aa:
            r8 = 0
        L1ab:
            if (r8 != 0) goto L1d7
            java.lang.String r8 = "header.entry-header span"
            org.jsoup.nodes.Element r8 = r0.selectFirst(r8)     // Catch: java.lang.Exception -> L1d0
            if (r8 == 0) goto L1c6
            java.lang.String r8 = r8.text()     // Catch: java.lang.Exception -> L1d0
            if (r8 == 0) goto L1c6
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch: java.lang.Exception -> L1d0
            java.lang.CharSequence r8 = kotlin.text.StringsKt.trim(r8)     // Catch: java.lang.Exception -> L1d0
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L1d0
            goto L1c7
        L1c6:
            r8 = 0
        L1c7:
            if (r8 != 0) goto L1d7
            r37 = r3
            r36 = r5
            r3 = 0
            goto L2bb
        L1d0:
            r0 = move-exception
            r37 = r3
            r36 = r5
            goto L2b9
        L1d7:
            r28 = r8
            java.lang.String r8 = "href"
            java.lang.String r8 = r0.attr(r8)     // Catch: java.lang.Exception -> L2b4
            r27 = r8
            r29 = 0
            r30 = r27
            java.lang.CharSequence r30 = (java.lang.CharSequence) r30     // Catch: java.lang.Exception -> L2b4
            boolean r30 = kotlin.text.StringsKt.isBlank(r30)     // Catch: java.lang.Exception -> L2b4
            if (r30 != 0) goto L1ee
            goto L1ef
        L1ee:
            r8 = 0
        L1ef:
            if (r8 != 0) goto L1f8
            r37 = r3
            r36 = r5
            r3 = 0
            goto L2bb
        L1f8:
            r35 = r0
            r0 = r38
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0     // Catch: java.lang.Exception -> L2b4
            r36 = r5
            java.lang.String r5 = "data-main-thumb"
            java.lang.String r5 = r13.attr(r5)     // Catch: java.lang.Exception -> L2b0
            r27 = r5
            r29 = 0
            r30 = r27
            java.lang.CharSequence r30 = (java.lang.CharSequence) r30     // Catch: java.lang.Exception -> L2b0
            boolean r30 = kotlin.text.StringsKt.isBlank(r30)     // Catch: java.lang.Exception -> L2b0
            if (r30 != 0) goto L217
            r30 = 1
            goto L219
        L217:
            r30 = 0
        L219:
            java.lang.Boolean r27 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r30)     // Catch: java.lang.Exception -> L2b0
            boolean r27 = r27.booleanValue()     // Catch: java.lang.Exception -> L2b0
            if (r27 == 0) goto L224
            goto L225
        L224:
            r5 = 0
        L225:
            if (r5 != 0) goto L288
            org.jsoup.nodes.Element r5 = r13.selectFirst(r3)     // Catch: java.lang.Exception -> L2b0
            if (r5 == 0) goto L253
            java.lang.String r5 = r5.attr(r7)     // Catch: java.lang.Exception -> L2b0
            if (r5 == 0) goto L253
            r27 = r5
            r29 = 0
            r30 = r27
            java.lang.CharSequence r30 = (java.lang.CharSequence) r30     // Catch: java.lang.Exception -> L2b0
            boolean r30 = kotlin.text.StringsKt.isBlank(r30)     // Catch: java.lang.Exception -> L2b0
            if (r30 != 0) goto L244
            r30 = 1
            goto L246
        L244:
            r30 = 0
        L246:
            java.lang.Boolean r27 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r30)     // Catch: java.lang.Exception -> L2b0
            boolean r27 = r27.booleanValue()     // Catch: java.lang.Exception -> L2b0
            if (r27 == 0) goto L251
            goto L254
        L251:
            r5 = 0
            goto L254
        L253:
            r5 = 0
        L254:
            if (r5 != 0) goto L288
            org.jsoup.nodes.Element r5 = r13.selectFirst(r3)     // Catch: java.lang.Exception -> L2b0
            if (r5 == 0) goto L284
            r37 = r3
            java.lang.String r3 = "data-src"
            java.lang.String r3 = r5.attr(r3)     // Catch: java.lang.Exception -> L2ae
            if (r3 == 0) goto L286
            r5 = r3
            r27 = 0
            r29 = r5
            java.lang.CharSequence r29 = (java.lang.CharSequence) r29     // Catch: java.lang.Exception -> L2ae
            boolean r29 = kotlin.text.StringsKt.isBlank(r29)     // Catch: java.lang.Exception -> L2ae
            if (r29 != 0) goto L276
            r29 = 1
            goto L278
        L276:
            r29 = 0
        L278:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r29)     // Catch: java.lang.Exception -> L2ae
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Exception -> L2ae
            if (r5 == 0) goto L286
            r5 = r3
            goto L28a
        L284:
            r37 = r3
        L286:
            r5 = 0
            goto L28a
        L288:
            r37 = r3
        L28a:
            java.lang.String r0 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r0, r5)     // Catch: java.lang.Exception -> L2ae
            r27 = r38
            com.lagradost.cloudstream3.MainAPI r27 = (com.lagradost.cloudstream3.MainAPI) r27     // Catch: java.lang.Exception -> L2ae
            r3 = r38
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3     // Catch: java.lang.Exception -> L2ae
            java.lang.String r29 = com.lagradost.cloudstream3.MainAPIKt.fixUrl(r3, r8)     // Catch: java.lang.Exception -> L2ae
            com.lagradost.cloudstream3.TvType r30 = com.lagradost.cloudstream3.TvType.Movie     // Catch: java.lang.Exception -> L2ae
            com.Fullboys.Fullboys$$ExternalSyntheticLambda0 r3 = new com.Fullboys.Fullboys$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> L2ae
            r3.<init>(r0)     // Catch: java.lang.Exception -> L2ae
            r33 = 8
            r34 = 0
            r31 = 0
            r32 = r3
            com.lagradost.cloudstream3.MovieSearchResponse r3 = com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse$default(r27, r28, r29, r30, r31, r32, r33, r34)     // Catch: java.lang.Exception -> L2ae
            goto L2ba
        L2ae:
            r0 = move-exception
            goto L2b9
        L2b0:
            r0 = move-exception
            r37 = r3
            goto L2b9
        L2b4:
            r0 = move-exception
            r37 = r3
            r36 = r5
        L2b9:
            r3 = 0
        L2ba:
        L2bb:
            if (r3 == 0) goto L2c1
            r0 = 0
            r4.add(r3)
        L2c1:
            r5 = r36
            r3 = r37
            r8 = 2
            r13 = 0
            goto L159
        L2c9:
            r36 = r5
            r0 = r4
            java.util.List r0 = (java.util.List) r0
            r4 = r38
            com.lagradost.cloudstream3.MainAPI r4 = (com.lagradost.cloudstream3.MainAPI) r4
            com.lagradost.cloudstream3.TvType r7 = com.lagradost.cloudstream3.TvType.NSFW
            com.Fullboys.Fullboys$load$2 r3 = new com.Fullboys.Fullboys$load$2
            r5 = 0
            r3.<init>(r2, r14, r0, r5)
            r9 = r3
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r10.L$0 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r10.L$1 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r36)
            r10.L$2 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r10.L$3 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r10.L$4 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r10.L$5 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r10.L$6 = r3
            r3 = 2
            r10.label = r3
            r8 = r6
            r5 = r36
            java.lang.Object r4 = com.lagradost.cloudstream3.MainAPIKt.newMovieLoadResponse(r4, r5, r6, r7, r8, r9, r10)
            r18 = r10
            if (r4 != r1) goto L319
            return r1
        L319:
            r7 = r5
            r9 = r6
            r8 = r11
            r6 = r12
            r3 = r14
            r5 = r2
        L31f:
            return r4
        L320:
            r18 = r10
        L322:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object loadLinks(@org.jetbrains.annotations.NotNull java.lang.String r46, boolean r47, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r48, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r49, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r50) {
            r45 = this;
            r1 = r50
            boolean r0 = r1 instanceof com.Fullboys.Fullboys.C00031
            if (r0 == 0) goto L18
            r0 = r1
            com.Fullboys.Fullboys$loadLinks$1 r0 = (com.Fullboys.Fullboys.C00031) r0
            int r2 = r0.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r0.label
            int r2 = r2 - r3
            r0.label = r2
            r2 = r45
            goto L1f
        L18:
            com.Fullboys.Fullboys$loadLinks$1 r0 = new com.Fullboys.Fullboys$loadLinks$1
            r2 = r45
            r0.<init>(r2, r1)
        L1f:
            r3 = r0
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            switch(r0) {
                case 0: goto L205;
                case 1: goto L1ed;
                case 2: goto L192;
                case 3: goto L143;
                case 4: goto Le2;
                case 5: goto L85;
                case 6: goto L33;
                default: goto L2b;
            }
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            int r0 = r3.I$1
            int r10 = r3.I$0
            boolean r11 = r3.Z$0
            java.lang.Object r12 = r3.L$11
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            java.lang.Object r13 = r3.L$10
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r3.L$9
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r3.L$8
            org.jsoup.nodes.Element r15 = (org.jsoup.nodes.Element) r15
            java.lang.Object r6 = r3.L$7
            java.lang.Object r7 = r3.L$6
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r9 = r3.L$5
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r8 = r3.L$4
            java.util.Set r8 = (java.util.Set) r8
            r20 = r0
            java.lang.Object r0 = r3.L$3
            org.jsoup.nodes.Document r0 = (org.jsoup.nodes.Document) r0
            r47 = r0
            java.lang.Object r0 = r3.L$2
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r49 = r0
            java.lang.Object r0 = r3.L$1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r48 = r0
            java.lang.Object r0 = r3.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r4)
            r24 = r48
            r25 = r0
            r0 = r1
            r17 = r6
            r16 = r15
            r1 = r47
            r15 = r3
            r6 = r5
            r3 = r2
            r5 = r4
            r2 = r49
            goto L82e
        L85:
            int r6 = r3.I$1
            int r7 = r3.I$0
            boolean r8 = r3.Z$0
            java.lang.Object r0 = r3.L$13
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r9 = r3.L$12
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r3.L$11
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r3.L$10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r3.L$9
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r3.L$8
            org.jsoup.nodes.Element r13 = (org.jsoup.nodes.Element) r13
            java.lang.Object r14 = r3.L$7
            java.lang.Object r15 = r3.L$6
            java.util.Iterator r15 = (java.util.Iterator) r15
            r47 = r0
            java.lang.Object r0 = r3.L$5
            r20 = r0
            java.lang.Iterable r20 = (java.lang.Iterable) r20
            java.lang.Object r0 = r3.L$4
            r21 = r0
            java.util.Set r21 = (java.util.Set) r21
            java.lang.Object r0 = r3.L$3
            r22 = r0
            org.jsoup.nodes.Document r22 = (org.jsoup.nodes.Document) r22
            java.lang.Object r0 = r3.L$2
            r23 = r0
            kotlin.jvm.functions.Function1 r23 = (kotlin.jvm.functions.Function1) r23
            java.lang.Object r0 = r3.L$1
            r24 = r0
            kotlin.jvm.functions.Function1 r24 = (kotlin.jvm.functions.Function1) r24
            java.lang.Object r0 = r3.L$0
            r25 = r0
            java.lang.String r25 = (java.lang.String) r25
            kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Exception -> L13b
            r0 = r47
            r19 = r14
            r17 = r22
            r26 = r25
            r14 = r2
            r2 = r4
            r25 = r24
            r24 = r23
            goto L664
        Le2:
            int r6 = r3.I$1
            int r7 = r3.I$0
            boolean r8 = r3.Z$0
            java.lang.Object r0 = r3.L$10
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r9 = r3.L$9
            r12 = r9
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r9 = r3.L$8
            r13 = r9
            org.jsoup.nodes.Element r13 = (org.jsoup.nodes.Element) r13
            java.lang.Object r14 = r3.L$7
            java.lang.Object r9 = r3.L$6
            r15 = r9
            java.util.Iterator r15 = (java.util.Iterator) r15
            java.lang.Object r9 = r3.L$5
            r20 = r9
            java.lang.Iterable r20 = (java.lang.Iterable) r20
            java.lang.Object r9 = r3.L$4
            r21 = r9
            java.util.Set r21 = (java.util.Set) r21
            java.lang.Object r9 = r3.L$3
            r22 = r9
            org.jsoup.nodes.Document r22 = (org.jsoup.nodes.Document) r22
            java.lang.Object r9 = r3.L$2
            r23 = r9
            kotlin.jvm.functions.Function1 r23 = (kotlin.jvm.functions.Function1) r23
            java.lang.Object r9 = r3.L$1
            r24 = r9
            kotlin.jvm.functions.Function1 r24 = (kotlin.jvm.functions.Function1) r24
            java.lang.Object r9 = r3.L$0
            r25 = r9
            java.lang.String r25 = (java.lang.String) r25
            kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Exception -> L13b
            r28 = r0
            r9 = r3
            r10 = r5
            r11 = r6
            r19 = r14
            r5 = r15
            r6 = r21
            r3 = r23
            r14 = r2
            r2 = r4
            r15 = r12
            r12 = r7
            r7 = r22
            r17 = r13
            r13 = r8
            goto L549
        L13b:
            r0 = move-exception
            r0 = r1
            r11 = r2
            r2 = r22
            r1 = 1
            goto L718
        L143:
            int r0 = r3.I$1
            int r6 = r3.I$0
            boolean r7 = r3.Z$0
            java.lang.Object r8 = r3.L$10
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r9 = r3.L$9
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r3.L$8
            org.jsoup.nodes.Element r10 = (org.jsoup.nodes.Element) r10
            java.lang.Object r11 = r3.L$7
            java.lang.Object r12 = r3.L$6
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r13 = r3.L$5
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r14 = r3.L$4
            java.util.Set r14 = (java.util.Set) r14
            java.lang.Object r15 = r3.L$3
            org.jsoup.nodes.Document r15 = (org.jsoup.nodes.Document) r15
            r20 = r0
            java.lang.Object r0 = r3.L$2
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r47 = r0
            java.lang.Object r0 = r3.L$1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r48 = r0
            java.lang.Object r0 = r3.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r4)
            r29 = r9
            r17 = r14
            r19 = r15
            r9 = r7
            r14 = r12
            r15 = r13
            r12 = r2
            r7 = r6
            r13 = r11
            r6 = r5
            r11 = r10
            r5 = r4
            r10 = r8
            r8 = r47
            r2 = r48
            goto L462
        L192:
            int r0 = r3.I$1
            int r6 = r3.I$0
            boolean r7 = r3.Z$0
            java.lang.Object r8 = r3.L$11
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r9 = r3.L$10
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r3.L$9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r3.L$8
            org.jsoup.nodes.Element r11 = (org.jsoup.nodes.Element) r11
            java.lang.Object r12 = r3.L$7
            java.lang.Object r13 = r3.L$6
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r14 = r3.L$5
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.Object r15 = r3.L$4
            java.util.Set r15 = (java.util.Set) r15
            r20 = r0
            java.lang.Object r0 = r3.L$3
            org.jsoup.nodes.Document r0 = (org.jsoup.nodes.Document) r0
            r47 = r0
            java.lang.Object r0 = r3.L$2
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r49 = r0
            java.lang.Object r0 = r3.L$1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r48 = r0
            java.lang.Object r0 = r3.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r4)
            r16 = r2
            r17 = r12
            r19 = r13
            r21 = r14
            r23 = r15
            r15 = r49
            r2 = r0
            r14 = r3
            r12 = r10
            r13 = r11
            r0 = r47
            r3 = r48
            r10 = r5
            r11 = r9
            r5 = r4
            r9 = r8
            r8 = r7
            r7 = 2
            goto L351
        L1ed:
            boolean r0 = r3.Z$0
            java.lang.Object r6 = r3.L$2
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            java.lang.Object r7 = r3.L$1
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r8 = r3.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.throwOnFailure(r4)
            r17 = r3
            r20 = r4
            r1 = r5
            r2 = 0
            goto L25e
        L205:
            kotlin.ResultKt.throwOnFailure(r4)
            com.lagradost.nicehttp.Requests r0 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r46)
            r3.L$0 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r48)
            r3.L$1 = r6
            r6 = r49
            r3.L$2 = r6
            r7 = r47
            r3.Z$0 = r7
            r8 = 1
            r3.label = r8
            r9 = r5
            r5 = 0
            r6 = 0
            r7 = 0
            r19 = 1
            r8 = 0
            r10 = r9
            r9 = 0
            r11 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r14 = r12
            r12 = 0
            r15 = r14
            r14 = 0
            r20 = r15
            r15 = 0
            r21 = 2
            r16 = 0
            r22 = 0
            r18 = 4094(0xffe, float:5.737E-42)
            r23 = 1
            r19 = 0
            r17 = r3
            r1 = r20
            r2 = 0
            r3 = r0
            r20 = r4
            r4 = r46
            java.lang.Object r0 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r0 != r1) goto L255
            return r1
        L255:
            r8 = r46
            r7 = r48
            r6 = r49
            r4 = r0
            r0 = r47
        L25e:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r3 = r4.getDocument()
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.Set r4 = (java.util.Set) r4
            java.lang.String r5 = ".slider-container img[src]"
            org.jsoup.select.Elements r5 = r3.select(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r9 = 0
            java.util.Iterator r10 = r5.iterator()
            r11 = r45
            r16 = r5
            r15 = r6
            r6 = r9
            r9 = r10
            r14 = r17
            r5 = r1
            r10 = r4
            r4 = r20
            r1 = r0
            r0 = r50
        L288:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L38b
            java.lang.Object r17 = r9.next()
            r12 = r17
            org.jsoup.nodes.Element r12 = (org.jsoup.nodes.Element) r12
            r13 = 0
            java.lang.String r2 = "src"
            java.lang.String r2 = r12.attr(r2)
            r46 = r0
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r47 = r2
            kotlin.text.Regex r2 = new kotlin.text.Regex
            r48 = r4
            java.lang.String r4 = "poster\\d+\\.jpg"
            r2.<init>(r4)
            java.lang.String r4 = "video.mp4"
            java.lang.String r0 = r2.replace(r0, r4)
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r4 = "/video.mp4"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r19 = r5
            r49 = r7
            r50 = r8
            r5 = 0
            r7 = 2
            r8 = 0
            boolean r2 = kotlin.text.StringsKt.contains$default(r2, r4, r8, r7, r5)
            if (r2 == 0) goto L363
            boolean r2 = r10.add(r0)
            if (r2 == 0) goto L363
        L2d2:
            java.lang.String r2 = r11.getName()
            r4 = r12
            com.lagradost.cloudstream3.utils.ExtractorLinkType r12 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()
            com.Fullboys.Fullboys$loadLinks$2$1 r8 = new com.Fullboys.Fullboys$loadLinks$2$1
            r8.<init>(r11, r5)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r50)
            r14.L$0 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r49)
            r14.L$1 = r5
            r14.L$2 = r15
            r14.L$3 = r3
            r14.L$4 = r10
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r14.L$5 = r5
            r14.L$6 = r9
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r17)
            r14.L$7 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r14.L$8 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r47)
            r14.L$9 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r14.L$10 = r5
            r14.L$11 = r15
            r14.Z$0 = r1
            r14.I$0 = r6
            r14.I$1 = r13
            r14.label = r7
            r5 = r10
            java.lang.String r10 = "Preview"
            r44 = r11
            r11 = r0
            r0 = r9
            r9 = r2
            r2 = r44
            r44 = r13
            r13 = r8
            r8 = r44
            java.lang.Object r9 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r9, r10, r11, r12, r13, r14)
            r10 = r19
            if (r9 != r10) goto L338
            return r10
        L338:
            r12 = r47
            r19 = r0
            r0 = r3
            r13 = r4
            r23 = r5
            r20 = r8
            r4 = r9
            r9 = r15
            r21 = r16
            r5 = r48
            r3 = r49
            r8 = r1
            r16 = r2
            r1 = r46
            r2 = r50
        L351:
            r9.invoke(r4)
            r9 = r3
            r4 = r5
            r5 = r10
            r3 = r0
            r10 = r2
            r0 = r11
            r2 = r12
            r12 = r13
            r11 = r16
            r13 = r20
            r16 = r21
            goto L37f
        L363:
            r5 = r10
            r2 = r11
            r4 = r12
            r8 = r13
            r10 = r19
            r11 = r0
            r0 = r9
            r9 = r49
            r19 = r0
            r12 = r4
            r23 = r5
            r13 = r8
            r5 = r10
            r0 = r11
            r4 = r48
            r10 = r50
            r8 = r1
            r11 = r2
            r1 = r46
            r2 = r47
        L37f:
            r0 = r1
            r1 = r8
            r7 = r9
            r8 = r10
            r9 = r19
            r10 = r23
            r2 = 0
            goto L288
        L38b:
            r46 = r10
            r10 = r5
            r5 = r46
            r46 = r0
            r48 = r4
            r49 = r7
            r50 = r8
            r2 = r11
            r7 = 2
            java.lang.String r0 = "#btnDownload[data-link]"
            org.jsoup.select.Elements r0 = r3.select(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r4 = 0
            java.util.Iterator r6 = r0.iterator()
            r13 = r0
            r12 = r6
            r9 = r14
            r8 = r15
            r0 = r46
            r2 = r49
            r15 = r3
            r6 = r4
            r14 = r5
            r5 = r10
            r4 = r48
            r3 = r1
            r1 = r50
        L3b8:
            boolean r10 = r12.hasNext()
            if (r10 == 0) goto L48f
            java.lang.Object r10 = r12.next()
            r7 = r10
            org.jsoup.nodes.Element r7 = (org.jsoup.nodes.Element) r7
            r46 = r0
            r0 = 0
            r47 = r1
            java.lang.String r1 = "data-link"
            java.lang.String r1 = r7.attr(r1)
            r17 = r1
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17
            if (r17 == 0) goto L3e0
            boolean r17 = kotlin.text.StringsKt.isBlank(r17)
            if (r17 == 0) goto L3dd
            goto L3e0
        L3dd:
            r17 = 0
            goto L3e2
        L3e0:
            r17 = 1
        L3e2:
            if (r17 != 0) goto L478
            boolean r17 = r14.add(r1)
            if (r17 == 0) goto L478
        L3ec:
            java.lang.String r27 = r11.getName()
            com.lagradost.cloudstream3.utils.ExtractorLinkType r30 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()
            r29 = r1
            com.Fullboys.Fullboys$loadLinks$3$1 r1 = new com.Fullboys.Fullboys$loadLinks$3$1
            r48 = r2
            r2 = 0
            r1.<init>(r11, r2)
            r31 = r1
            kotlin.jvm.functions.Function2 r31 = (kotlin.jvm.functions.Function2) r31
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r47)
            r9.L$0 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r48)
            r9.L$1 = r1
            r9.L$2 = r8
            r9.L$3 = r15
            r9.L$4 = r14
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r9.L$5 = r1
            r9.L$6 = r12
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r9.L$7 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r9.L$8 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r29)
            r9.L$9 = r1
            r9.L$10 = r8
            r2 = 0
            r9.L$11 = r2
            r9.Z$0 = r3
            r9.I$0 = r6
            r9.I$1 = r0
            r1 = 3
            r9.label = r1
            java.lang.String r28 = "Download"
            r32 = r9
            java.lang.Object r1 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r27, r28, r29, r30, r31, r32)
            if (r1 != r5) goto L449
            return r5
        L449:
            r20 = r0
            r9 = r3
            r17 = r14
            r19 = r15
            r3 = r32
            r0 = r47
            r14 = r12
            r15 = r13
            r13 = r10
            r12 = r11
            r11 = r7
            r10 = r8
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r46
            r2 = r48
        L462:
            r10.invoke(r4)
            r32 = r3
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            r11 = r12
            r10 = r13
            r12 = r14
            r13 = r15
            r14 = r17
            r15 = r19
            r3 = r2
            r2 = r0
            r0 = r20
            goto L485
        L478:
            r29 = r1
            r48 = r2
            r32 = r9
            r1 = r46
            r2 = r47
            r9 = r3
            r3 = r48
        L485:
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r9
            r9 = r32
            r7 = 2
            goto L3b8
        L48f:
            r46 = r0
            r47 = r1
            r48 = r2
            r32 = r9
            java.lang.String r0 = "button[data-player-url]"
            org.jsoup.select.Elements r0 = r15.select(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
            r7 = r15
            r15 = r2
            r2 = r7
            r7 = r8
            r8 = r3
            r3 = r7
            r25 = r47
            r24 = r48
            r20 = r0
            r7 = r1
            r1 = r46
        L4b3:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L72b
            java.lang.Object r6 = r15.next()
            r13 = r6
            org.jsoup.nodes.Element r13 = (org.jsoup.nodes.Element) r13
            r10 = 0
            java.lang.String r0 = "data-player-url"
            java.lang.String r12 = r13.attr(r0)
            r0 = r11
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0     // Catch: java.lang.Exception -> L708
            java.lang.String r28 = com.lagradost.cloudstream3.MainAPIKt.fixUrl(r0, r12)     // Catch: java.lang.Exception -> L708
            com.lagradost.nicehttp.Requests r27 = com.lagradost.cloudstream3.MainActivityKt.getApp()     // Catch: java.lang.Exception -> L708
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)     // Catch: java.lang.Exception -> L708
            r9.L$0 = r0     // Catch: java.lang.Exception -> L708
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)     // Catch: java.lang.Exception -> L708
            r9.L$1 = r0     // Catch: java.lang.Exception -> L708
            r9.L$2 = r3     // Catch: java.lang.Exception -> L708
            r9.L$3 = r2     // Catch: java.lang.Exception -> L708
            r9.L$4 = r14     // Catch: java.lang.Exception -> L708
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r20)     // Catch: java.lang.Exception -> L708
            r9.L$5 = r0     // Catch: java.lang.Exception -> L708
            r9.L$6 = r15     // Catch: java.lang.Exception -> L708
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)     // Catch: java.lang.Exception -> L708
            r9.L$7 = r0     // Catch: java.lang.Exception -> L708
            r9.L$8 = r13     // Catch: java.lang.Exception -> L708
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)     // Catch: java.lang.Exception -> L708
            r9.L$9 = r0     // Catch: java.lang.Exception -> L708
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r28)     // Catch: java.lang.Exception -> L708
            r9.L$10 = r0     // Catch: java.lang.Exception -> L708
            r46 = r1
            r1 = 0
            r9.L$11 = r1     // Catch: java.lang.Exception -> L6f9
            r9.L$12 = r1     // Catch: java.lang.Exception -> L6f9
            r9.L$13 = r1     // Catch: java.lang.Exception -> L6f9
            r9.Z$0 = r8     // Catch: java.lang.Exception -> L6f9
            r9.I$0 = r7     // Catch: java.lang.Exception -> L6f9
            r9.I$1 = r10     // Catch: java.lang.Exception -> L6f9
            r0 = 4
            r9.label = r0     // Catch: java.lang.Exception -> L6f9
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r42 = 4094(0xffe, float:5.737E-42)
            r43 = 0
            r41 = r9
            java.lang.Object r0 = com.lagradost.nicehttp.Requests.get$default(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r39, r40, r41, r42, r43)     // Catch: java.lang.Exception -> L6ec
            if (r0 != r5) goto L536
            return r5
        L536:
            r1 = r46
            r19 = r6
            r6 = r14
            r9 = r41
            r14 = r11
            r11 = r10
            r10 = r5
            r5 = r15
            r15 = r12
            r12 = r7
            r7 = r2
            r2 = r4
            r4 = r0
            r17 = r13
            r13 = r8
        L549:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4     // Catch: java.lang.Exception -> L6cd
            java.lang.String r0 = r4.getText()     // Catch: java.lang.Exception -> L6cd
            kotlin.text.Regex r4 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L6cd
            java.lang.String r8 = "file[\"']?\\s*:\\s*[\"'](https?://[^\"']+)"
            r4.<init>(r8)     // Catch: java.lang.Exception -> L6cd
            r8 = r0
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch: java.lang.Exception -> L6cd
            r46 = r1
            r47 = r2
            r48 = r15
            r1 = 2
            r2 = 0
            r15 = 0
            kotlin.text.MatchResult r4 = kotlin.text.Regex.find$default(r4, r8, r2, r1, r15)     // Catch: java.lang.Exception -> L6b3
            if (r4 == 0) goto L5b1
        L56b:
            java.util.List r1 = r4.getGroupValues()     // Catch: java.lang.Exception -> L596
            if (r1 == 0) goto L594
        L572:
            r2 = 1
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L57a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L57a
            goto L5b3
        L57a:
            r0 = move-exception
            r0 = r46
            r4 = r47
            r23 = r3
            r15 = r5
            r21 = r6
            r2 = r7
            r3 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r11 = r14
            r13 = r17
            r14 = r19
            r1 = 1
            r12 = r48
            goto L718
        L594:
            r2 = 1
            goto L5b2
        L596:
            r0 = move-exception
            r2 = 1
            r0 = r46
            r4 = r47
            r23 = r3
            r15 = r5
            r21 = r6
            r2 = r7
            r3 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r11 = r14
            r13 = r17
            r14 = r19
            r1 = 1
            r12 = r48
            goto L718
        L5b1:
            r2 = 1
        L5b2:
            r1 = 0
        L5b3:
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Exception -> L6b3
            if (r4 == 0) goto L5c2
            boolean r4 = kotlin.text.StringsKt.isBlank(r4)     // Catch: java.lang.Exception -> L57a
            if (r4 == 0) goto L5c0
            goto L5c2
        L5c0:
            r4 = 0
            goto L5c3
        L5c2:
            r4 = 1
        L5c3:
            if (r4 != 0) goto L6a1
            boolean r4 = r6.add(r1)     // Catch: java.lang.Exception -> L6b3
            if (r4 == 0) goto L6a1
        L5cd:
            java.lang.String r4 = r14.getName()     // Catch: java.lang.Exception -> L6b3
            java.lang.String r8 = r17.text()     // Catch: java.lang.Exception -> L6b3
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch: java.lang.Exception -> L6b3
            java.lang.CharSequence r8 = kotlin.text.StringsKt.trim(r8)     // Catch: java.lang.Exception -> L6b3
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L6b3
            com.lagradost.cloudstream3.utils.ExtractorLinkType r15 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()     // Catch: java.lang.Exception -> L6b3
            com.Fullboys.Fullboys$loadLinks$4$1 r2 = new com.Fullboys.Fullboys$loadLinks$4$1     // Catch: java.lang.Exception -> L6b3
            r49 = r1
            r1 = 0
            r2.<init>(r14, r1)     // Catch: java.lang.Exception -> L6b3
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2     // Catch: java.lang.Exception -> L6b3
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)     // Catch: java.lang.Exception -> L6b3
            r9.L$0 = r1     // Catch: java.lang.Exception -> L6b3
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)     // Catch: java.lang.Exception -> L6b3
            r9.L$1 = r1     // Catch: java.lang.Exception -> L6b3
            r9.L$2 = r3     // Catch: java.lang.Exception -> L6b3
            r9.L$3 = r7     // Catch: java.lang.Exception -> L6b3
            r9.L$4 = r6     // Catch: java.lang.Exception -> L6b3
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r20)     // Catch: java.lang.Exception -> L6b3
            r9.L$5 = r1     // Catch: java.lang.Exception -> L6b3
            r9.L$6 = r5     // Catch: java.lang.Exception -> L6b3
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)     // Catch: java.lang.Exception -> L6b3
            r9.L$7 = r1     // Catch: java.lang.Exception -> L6b3
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r17)     // Catch: java.lang.Exception -> L6b3
            r9.L$8 = r1     // Catch: java.lang.Exception -> L6b3
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r48)     // Catch: java.lang.Exception -> L6b3
            r9.L$9 = r1     // Catch: java.lang.Exception -> L6b3
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r28)     // Catch: java.lang.Exception -> L6b3
            r9.L$10 = r1     // Catch: java.lang.Exception -> L6b3
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)     // Catch: java.lang.Exception -> L6b3
            r9.L$11 = r1     // Catch: java.lang.Exception -> L6b3
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r49)     // Catch: java.lang.Exception -> L6b3
            r9.L$12 = r1     // Catch: java.lang.Exception -> L6b3
            r9.L$13 = r3     // Catch: java.lang.Exception -> L6b3
            r9.Z$0 = r13     // Catch: java.lang.Exception -> L6b3
            r9.I$0 = r12     // Catch: java.lang.Exception -> L6b3
            r9.I$1 = r11     // Catch: java.lang.Exception -> L6b3
            r1 = 5
            r9.label = r1     // Catch: java.lang.Exception -> L6b3
            r21 = r8
            r8 = r2
            r2 = r7
            r7 = r15
            r15 = r5
            r5 = r21
            r21 = r6
            r6 = r49
            java.lang.Object r4 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L68b
            if (r4 != r10) goto L64a
            return r10
        L64a:
            r1 = r46
            r5 = r10
            r7 = r12
            r8 = r13
            r13 = r17
            r26 = r25
            r12 = r48
            r10 = r0
            r17 = r2
            r0 = r3
            r25 = r24
            r2 = r47
            r24 = r0
            r3 = r9
            r9 = r6
            r6 = r11
            r11 = r28
        L664:
            r0.invoke(r4)     // Catch: java.lang.Exception -> L67a
            r0 = r1
            r4 = r2
            r9 = r3
            r11 = r6
            r6 = r15
            r2 = r17
            r3 = r24
            r24 = r25
            r25 = r26
            r1 = 1
            r15 = r12
            r17 = r13
            goto L723
        L67a:
            r0 = move-exception
            r0 = r1
            r4 = r2
            r11 = r14
            r2 = r17
            r14 = r19
            r23 = r24
            r24 = r25
            r25 = r26
            r1 = 1
            goto L718
        L68b:
            r0 = move-exception
            r0 = r46
            r4 = r47
            r23 = r3
            r3 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r11 = r14
            r13 = r17
            r14 = r19
            r1 = 1
            r12 = r48
            goto L718
        L6a1:
            r15 = r5
            r21 = r6
            r2 = r7
            r6 = r1
            r0 = r46
            r4 = r47
            r5 = r10
            r7 = r12
            r8 = r13
            r6 = r15
            r1 = 1
            r15 = r48
            goto L723
        L6b3:
            r0 = move-exception
            r15 = r5
            r21 = r6
            r2 = r7
            r0 = r46
            r4 = r47
            r23 = r3
            r3 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r11 = r14
            r13 = r17
            r14 = r19
            r1 = 1
            r12 = r48
            goto L718
        L6cd:
            r0 = move-exception
            r46 = r1
            r47 = r2
            r21 = r6
            r2 = r7
            r48 = r15
            r15 = r5
            r0 = r46
            r4 = r47
            r23 = r3
            r3 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r11 = r14
            r13 = r17
            r14 = r19
            r1 = 1
            r12 = r48
            goto L718
        L6ec:
            r0 = move-exception
            r1 = 1
            r0 = r46
            r23 = r3
            r21 = r14
            r3 = r41
            r14 = r6
            r6 = r10
            goto L718
        L6f9:
            r0 = move-exception
            r41 = r9
            r1 = 1
            r0 = r46
            r23 = r3
            r21 = r14
            r3 = r41
            r14 = r6
            r6 = r10
            goto L718
        L708:
            r0 = move-exception
            r46 = r1
            r41 = r9
            r1 = 1
            r0 = r46
            r23 = r3
            r21 = r14
            r3 = r41
            r14 = r6
            r6 = r10
        L718:
            r9 = r3
            r17 = r13
            r19 = r14
            r3 = r23
            r14 = r11
            r11 = r6
            r6 = r15
            r15 = r12
        L723:
            r1 = r0
            r15 = r6
            r11 = r14
            r14 = r21
            goto L4b3
        L72b:
            r46 = r1
            r41 = r9
            r1 = 1
            java.lang.String r0 = ".box-server button"
            org.jsoup.select.Elements r0 = r2.select(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r6 = 0
            java.util.Iterator r7 = r0.iterator()
            r9 = r11
            r11 = r3
            r3 = r9
            r9 = r0
            r10 = r8
            r8 = r14
            r15 = r41
            r0 = r46
        L747:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L855
            java.lang.Object r17 = r7.next()
            r12 = r17
            org.jsoup.nodes.Element r12 = (org.jsoup.nodes.Element) r12
            r13 = 0
            java.lang.String r14 = "onclick"
            java.lang.String r19 = r12.attr(r14)
            kotlin.text.Regex r14 = new kotlin.text.Regex
            java.lang.String r1 = "'(https?://[^']+)'"
            r14.<init>(r1)
            r1 = r19
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r46 = r2
            r47 = r4
            r48 = r9
            r2 = 2
            r4 = 0
            r9 = 0
            kotlin.text.MatchResult r1 = kotlin.text.Regex.find$default(r14, r1, r4, r2, r9)
            if (r1 == 0) goto L789
        L779:
            java.util.List r1 = r1.getGroupValues()
            if (r1 == 0) goto L789
        L780:
            r9 = 1
            java.lang.Object r1 = kotlin.collections.CollectionsKt.getOrNull(r1, r9)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            goto L78a
        L789:
            r9 = 0
        L78a:
            r1 = r9
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L799
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            if (r1 == 0) goto L797
            goto L799
        L797:
            r1 = 0
            goto L79a
        L799:
            r1 = 1
        L79a:
            if (r1 != 0) goto L840
            boolean r1 = r8.add(r9)
            if (r1 == 0) goto L840
        L7a4:
            java.lang.String r1 = r3.getName()
            java.lang.String r14 = r12.text()
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.CharSequence r14 = kotlin.text.StringsKt.trim(r14)
            java.lang.String r14 = r14.toString()
            com.lagradost.cloudstream3.utils.ExtractorLinkType r16 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()
            com.Fullboys.Fullboys$loadLinks$5$1 r2 = new com.Fullboys.Fullboys$loadLinks$5$1
            r4 = 0
            r2.<init>(r3, r4)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)
            r15.L$0 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r15.L$1 = r4
            r15.L$2 = r11
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r46)
            r15.L$3 = r4
            r15.L$4 = r8
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r48)
            r15.L$5 = r4
            r15.L$6 = r7
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r17)
            r15.L$7 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r15.L$8 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)
            r15.L$9 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r15.L$10 = r4
            r15.L$11 = r11
            r4 = 0
            r15.L$12 = r4
            r15.L$13 = r4
            r15.Z$0 = r10
            r15.I$0 = r6
            r15.I$1 = r13
            r4 = 6
            r15.label = r4
            r4 = r10
            r10 = r1
            r1 = r4
            r4 = r14
            r14 = r2
            r2 = r11
            r11 = r4
            r4 = r12
            r12 = r9
            r9 = r13
            r13 = r16
            java.lang.Object r10 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r10, r11, r12, r13, r14, r15)
            if (r10 != r5) goto L81c
            return r5
        L81c:
            r11 = r1
            r16 = r4
            r20 = r9
            r4 = r10
            r13 = r12
            r14 = r19
            r1 = r46
            r9 = r48
            r12 = r2
            r10 = r6
            r6 = r5
            r5 = r47
        L82e:
            r12.invoke(r4)
            r4 = r5
            r5 = r6
            r6 = r10
            r10 = r11
            r19 = r14
            r12 = r16
            r11 = r2
            r2 = r1
            r1 = r9
            r9 = r13
            r13 = r20
            goto L850
        L840:
            r1 = r10
            r2 = r11
            r4 = r12
            r12 = r9
            r9 = r13
            r10 = r1
            r11 = r2
            r13 = r9
            r9 = r12
            r2 = r46
            r1 = r48
            r12 = r4
            r4 = r47
        L850:
            r9 = r1
            r1 = 1
            goto L747
        L855:
            r46 = r2
            r47 = r4
            r48 = r9
            r1 = r10
            r2 = r11
            r4 = r8
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r23 = 1
            r4 = r4 ^ 1
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object search(@org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.SearchResponse>> r24) {
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof com.Fullboys.Fullboys.C00041
            if (r2 == 0) goto L18
            r2 = r1
            com.Fullboys.Fullboys$search$1 r2 = (com.Fullboys.Fullboys.C00041) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Fullboys.Fullboys$search$1 r2 = new com.Fullboys.Fullboys$search$1
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
            java.lang.String r6 = "/home?search="
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
            java.lang.String r3 = "article.movie-item"
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
