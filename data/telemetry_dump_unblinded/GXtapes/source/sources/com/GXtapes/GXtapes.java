package com.GXtapes;

/* JADX INFO: compiled from: GXtapes.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump_unblinded/GXtapes/classes.dex */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010&\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0096@\u00a2\u0006\u0002\u0010-J\f\u0010.\u001a\u00020/*\u000200H\u0002J\f\u00101\u001a\u00020/*\u000200H\u0002J\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020/0$2\u0006\u00103\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u00104J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u00104JF\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u000e2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020>0<H\u0096@\u00a2\u0006\u0002\u0010AR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010'\u00a8\u0006B"}, d2 = {"Lcom/GXtapes/GXtapes;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "lang", "getLang", "setLang", "hasQuickSearch", "getHasQuickSearch", "hasChromecastSupport", "getHasChromecastSupport", "hasDownloadSupport", "getHasDownloadSupport", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lorg/jsoup/nodes/Element;", "toRecommendResult", "search", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GXtapes"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nGXtapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GXtapes.kt\ncom/GXtapes/GXtapes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1642#2,10:170\n1915#2:180\n1916#2:182\n1652#2:183\n1642#2,10:184\n1915#2:194\n1916#2:196\n1652#2:197\n1642#2,10:198\n1915#2:208\n1916#2:210\n1652#2:211\n1642#2,10:212\n1915#2:222\n1916#2:225\n1652#2:226\n1#3:181\n1#3:195\n1#3:209\n1#3:223\n1#3:224\n*S KotlinDebug\n*F\n+ 1 GXtapes.kt\ncom/GXtapes/GXtapes\n*L\n65#1:170,10\n65#1:180\n65#1:182\n65#1:183\n104#1:184,10\n104#1:194\n104#1:196\n104#1:197\n126#1:198,10\n126#1:208\n126#1:210\n126#1:211\n148#1:212,10\n148#1:222\n148#1:225\n148#1:226\n65#1:181\n104#1:195\n126#1:209\n148#1:224\n*E\n"})
public final class GXtapes extends com.lagradost.cloudstream3.MainAPI {
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

    /* JADX INFO: renamed from: com.GXtapes.GXtapes$getMainPage$1 */
    /* JADX INFO: compiled from: GXtapes.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.GXtapes.GXtapes", f = "GXtapes.kt", i = {0, 0, 0}, l = {64}, m = "getMainPage", n = {"request", "url", "page"}, nl = {65}, s = {"L$0", "L$1", "I$0"}, v = 2)
    static final class C00001 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.GXtapes.GXtapes this$0;

        C00001(com.GXtapes.GXtapes r1, kotlin.coroutines.Continuation<? super com.GXtapes.GXtapes.C00001> r2) {
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
                com.GXtapes.GXtapes r0 = r4.this$0
                r1 = 0
                r2 = r4
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r3 = 0
                java.lang.Object r0 = r0.getMainPage(r3, r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: com.GXtapes.GXtapes$load$1 */
    /* JADX INFO: compiled from: GXtapes.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.GXtapes.GXtapes", f = "GXtapes.kt", i = {0, 1, 1, 1, 1, 1, 1}, l = {120, 130}, m = "load", n = {"url", "url", "document", "title", "poster", "description", "recommendations"}, nl = {122, -1}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
    static final class C00011 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.GXtapes.GXtapes this$0;

        C00011(com.GXtapes.GXtapes r1, kotlin.coroutines.Continuation<? super com.GXtapes.GXtapes.C00011> r2) {
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
                com.GXtapes.GXtapes r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.load(r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: com.GXtapes.GXtapes$load$2 */
    /* JADX INFO: compiled from: GXtapes.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.GXtapes.GXtapes$load$2", f = "GXtapes.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00022 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.lagradost.cloudstream3.MovieLoadResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String $description;
        final /* synthetic */ java.lang.String $poster;
        final /* synthetic */ java.util.List<com.lagradost.cloudstream3.SearchResponse> $recommendations;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        C00022(java.lang.String r2, java.lang.String r3, java.util.List<? extends com.lagradost.cloudstream3.SearchResponse> r4, kotlin.coroutines.Continuation<? super com.GXtapes.GXtapes.C00022> r5) {
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
                com.GXtapes.GXtapes$load$2 r0 = new com.GXtapes.GXtapes$load$2
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
                com.GXtapes.GXtapes$load$2 r0 = (com.GXtapes.GXtapes.C00022) r0
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

    /* JADX INFO: renamed from: com.GXtapes.GXtapes$loadLinks$1 */
    /* JADX INFO: compiled from: GXtapes.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.GXtapes.GXtapes", f = "GXtapes.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {143, 158}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "isCasting", "data", "subtitleCallback", "callback", "document", "found", "videoUrls", "isCasting"}, nl = {144, 167}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0"}, v = 2)
    static final class C00031 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.GXtapes.GXtapes this$0;

        C00031(com.GXtapes.GXtapes r1, kotlin.coroutines.Continuation<? super com.GXtapes.GXtapes.C00031> r2) {
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
                com.GXtapes.GXtapes r1 = r7.this$0
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

    /* JADX INFO: renamed from: com.GXtapes.GXtapes$loadLinks$3 */
    /* JADX INFO: compiled from: GXtapes.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "url", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.GXtapes.GXtapes$loadLinks$3", f = "GXtapes.kt", i = {0}, l = {159}, m = "invokeSuspend", n = {"url"}, nl = {164}, s = {"L$0"}, v = 2)
    static final class C00043 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1<com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> $callback;
        final /* synthetic */ java.lang.String $data;
        final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef $found;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> $subtitleCallback;
        /* synthetic */ java.lang.Object L$0;
        int label;

        C00043(java.lang.String r2, kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r3, kotlin.jvm.internal.Ref.BooleanRef r4, kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r5, kotlin.coroutines.Continuation<? super com.GXtapes.GXtapes.C00043> r6) {
                r1 = this;
                r1.$data = r2
                r1.$subtitleCallback = r3
                r1.$found = r4
                r1.$callback = r5
                r0 = 2
                r1.<init>(r0, r6)
                return
        }

        static final kotlin.Unit invokeSuspend$lambda$0(kotlin.jvm.functions.Function1 r1, com.lagradost.cloudstream3.utils.ExtractorLink r2) {
                r1.invoke(r2)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }

        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r7, kotlin.coroutines.Continuation<?> r8) {
                r6 = this;
                com.GXtapes.GXtapes$loadLinks$3 r0 = new com.GXtapes.GXtapes$loadLinks$3
                java.lang.String r1 = r6.$data
                kotlin.jvm.functions.Function1<com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r2 = r6.$subtitleCallback
                kotlin.jvm.internal.Ref$BooleanRef r3 = r6.$found
                kotlin.jvm.functions.Function1<com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r4 = r6.$callback
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                r0.L$0 = r7
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
                r1 = this;
                java.lang.String r2 = (java.lang.String) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(java.lang.String r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                com.GXtapes.GXtapes$loadLinks$3 r0 = (com.GXtapes.GXtapes.C00043) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                r8 = this;
                java.lang.Object r0 = r8.L$0
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r8.label
                r3 = 1
                switch(r2) {
                    case 0: goto L1b;
                    case 1: goto L16;
                    default: goto Le;
                }
            Le:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L16:
                kotlin.ResultKt.throwOnFailure(r9)
                r2 = r9
                goto L3d
            L1b:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.String r2 = r8.$data
                kotlin.jvm.functions.Function1<com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r4 = r8.$subtitleCallback
                kotlin.jvm.functions.Function1<com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r5 = r8.$callback
                com.GXtapes.GXtapes$loadLinks$3$$ExternalSyntheticLambda0 r6 = new com.GXtapes.GXtapes$loadLinks$3$$ExternalSyntheticLambda0
                r6.<init>(r5)
                r5 = r8
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                r8.L$0 = r7
                r8.label = r3
                java.lang.Object r2 = com.lagradost.cloudstream3.utils.ExtractorApiKt.loadExtractor(r0, r2, r4, r6, r5)
                if (r2 != r1) goto L3d
                return r1
            L3d:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r1 = r2.booleanValue()
                if (r1 == 0) goto L49
                kotlin.jvm.internal.Ref$BooleanRef r2 = r8.$found
                r2.element = r3
            L49:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
        }
    }

    /* JADX INFO: renamed from: com.GXtapes.GXtapes$search$1 */
    /* JADX INFO: compiled from: GXtapes.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.GXtapes.GXtapes", f = "GXtapes.kt", i = {0, 0, 0}, l = {102}, m = "search", n = {"query", "searchResponse", "i"}, nl = {104}, s = {"L$0", "L$1", "I$0"}, v = 2)
    static final class C00051 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.GXtapes.GXtapes this$0;

        C00051(com.GXtapes.GXtapes r1, kotlin.coroutines.Continuation<? super com.GXtapes.GXtapes.C00051> r2) {
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
                com.GXtapes.GXtapes r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.search(r1, r2)
                return r0
        }
    }

    public GXtapes() {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "https://gay.xtapes.tw"
            r4.mainUrl = r0
            java.lang.String r0 = "G_Xtapes"
            r4.name = r0
            r0 = 1
            r4.hasMainPage = r0
            java.lang.String r1 = "en"
            r4.lang = r1
            r4.hasQuickSearch = r0
            r4.hasChromecastSupport = r0
            r4.hasDownloadSupport = r0
            com.lagradost.cloudstream3.TvType r1 = com.lagradost.cloudstream3.TvType.NSFW
            java.util.Set r1 = kotlin.collections.SetsKt.setOf(r1)
            r4.supportedTypes = r1
            com.lagradost.cloudstream3.VPNStatus r1 = com.lagradost.cloudstream3.VPNStatus.MightBeNeeded
            r4.vpnStatus = r1
            r1 = 31
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            java.lang.String r2 = "/?filtre=date&cat=0"
            java.lang.String r3 = "Latest"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "/category/porn-movies-214660"
            java.lang.String r3 = "Full Movies"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            r1[r0] = r2
            java.lang.String r0 = "/category/groupsex-gangbang-porn-129457"
            java.lang.String r2 = "Gang bang & Group"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 2
            r1[r2] = r0
            java.lang.String r0 = "/category/243741"
            java.lang.String r2 = "Active Duty"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 3
            r1[r2] = r0
            java.lang.String r0 = "/category/685019"
            java.lang.String r2 = "Bel Ami"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 4
            r1[r2] = r0
            java.lang.String r0 = "/category/651385"
            java.lang.String r2 = "Bi Latin Men"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 5
            r1[r2] = r0
            java.lang.String r0 = "/category/629527"
            java.lang.String r2 = "Broke Straight Boys"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 6
            r1[r2] = r0
            java.lang.String r0 = "/category/854356"
            java.lang.String r2 = "BroMo"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 7
            r1[r2] = r0
            java.lang.String r0 = "/category/745361"
            java.lang.String r2 = "Chaos Men"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 8
            r1[r2] = r0
            java.lang.String r0 = "/category/267515"
            java.lang.String r2 = "CockyBoys"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 9
            r1[r2] = r0
            java.lang.String r0 = "/category/861573"
            java.lang.String r2 = "Corbin Fisher"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 10
            r1[r2] = r0
            java.lang.String r0 = "/category/518197"
            java.lang.String r2 = "Disruptive Films"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 11
            r1[r2] = r0
            java.lang.String r0 = "/category/624384"
            java.lang.String r2 = "Fraternity X"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 12
            r1[r2] = r0
            java.lang.String r0 = "/category/418613"
            java.lang.String r2 = "Falcon Studio"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 13
            r1[r2] = r0
            java.lang.String r0 = "/category/37433"
            java.lang.String r2 = "Gay Hoopla"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 14
            r1[r2] = r0
            java.lang.String r0 = "/category/37840"
            java.lang.String r2 = "Gay Room"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 15
            r1[r2] = r0
            java.lang.String r0 = "/category/4793"
            java.lang.String r2 = "Gay Wire"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 16
            r1[r2] = r0
            java.lang.String r0 = "/category/452643"
            java.lang.String r2 = "GuysInSweatpants"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 17
            r1[r2] = r0
            java.lang.String r0 = "/category/298563"
            java.lang.String r2 = "Helix Studios"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 18
            r1[r2] = r0
            java.lang.String r0 = "/category/345682"
            java.lang.String r2 = "Onlyfans"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 19
            r1[r2] = r0
            java.lang.String r0 = "/category/256935"
            java.lang.String r2 = "Latin"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 20
            r1[r2] = r0
            java.lang.String r0 = "/category/432724"
            java.lang.String r2 = "Kristen Bjorn"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 21
            r1[r2] = r0
            java.lang.String r0 = "/category/571476"
            java.lang.String r2 = "[L]ucas[E]ntertain[m]ent"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 22
            r1[r2] = r0
            java.lang.String r0 = "/category/352421"
            java.lang.String r2 = "MEN"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 23
            r1[r2] = r0
            java.lang.String r0 = "/category/792756"
            java.lang.String r2 = "Next Door Studios"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 24
            r1[r2] = r0
            java.lang.String r0 = "/category/porn-parody"
            java.lang.String r2 = "Parody"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 25
            r1[r2] = r0
            java.lang.String r0 = "/category/84750"
            java.lang.String r2 = "PeterFever"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 26
            r1[r2] = r0
            java.lang.String r0 = "/category/461264"
            java.lang.String r2 = "Raging Stallion"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 27
            r1[r2] = r0
            java.lang.String r0 = "/category/349693"
            java.lang.String r2 = "Sean Cody"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 28
            r1[r2] = r0
            java.lang.String r0 = "/category/182658"
            java.lang.String r2 = "Timtales"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 29
            r1[r2] = r0
            java.lang.String r0 = "/category/36567"
            java.lang.String r2 = "William Higgins"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 30
            r1[r2] = r0
            java.util.List r0 = com.lagradost.cloudstream3.MainAPIKt.mainPageOf(r1)
            r4.mainPage = r0
            return
    }

    private final com.lagradost.cloudstream3.SearchResponse toRecommendResult(org.jsoup.nodes.Element r12) {
            r11 = this;
            java.lang.String r0 = "img"
            org.jsoup.select.Elements r1 = r12.select(r0)
            java.lang.String r2 = "title"
            java.lang.String r4 = r1.attr(r2)
            r1 = r11
            com.lagradost.cloudstream3.MainAPI r1 = (com.lagradost.cloudstream3.MainAPI) r1
            java.lang.String r2 = "a"
            org.jsoup.select.Elements r2 = r12.select(r2)
            java.lang.String r3 = "href"
            java.lang.String r2 = r2.attr(r3)
            java.lang.String r5 = com.lagradost.cloudstream3.MainAPIKt.fixUrl(r1, r2)
            r1 = r11
            com.lagradost.cloudstream3.MainAPI r1 = (com.lagradost.cloudstream3.MainAPI) r1
            org.jsoup.select.Elements r0 = r12.select(r0)
            java.lang.String r2 = "src"
            java.lang.String r0 = r0.attr(r2)
            java.lang.String r0 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r1, r0)
            r3 = r11
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            com.lagradost.cloudstream3.TvType r6 = com.lagradost.cloudstream3.TvType.NSFW
            com.GXtapes.GXtapes$$ExternalSyntheticLambda0 r8 = new com.GXtapes.GXtapes$$ExternalSyntheticLambda0
            r8.<init>(r0)
            r9 = 8
            r10 = 0
            r7 = 0
            com.lagradost.cloudstream3.MovieSearchResponse r1 = com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse$default(r3, r4, r5, r6, r7, r8, r9, r10)
            com.lagradost.cloudstream3.SearchResponse r1 = (com.lagradost.cloudstream3.SearchResponse) r1
            return r1
    }

    static final kotlin.Unit toRecommendResult$lambda$0(java.lang.String r1, com.lagradost.cloudstream3.MovieSearchResponse r2) {
            r2.setPosterUrl(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private final com.lagradost.cloudstream3.SearchResponse toSearchResult(org.jsoup.nodes.Element r12) {
            r11 = this;
            java.lang.String r0 = "img"
            org.jsoup.select.Elements r1 = r12.select(r0)
            java.lang.String r2 = "title"
            java.lang.String r4 = r1.attr(r2)
            r1 = r11
            com.lagradost.cloudstream3.MainAPI r1 = (com.lagradost.cloudstream3.MainAPI) r1
            java.lang.String r2 = "a"
            org.jsoup.select.Elements r2 = r12.select(r2)
            java.lang.String r3 = "href"
            java.lang.String r2 = r2.attr(r3)
            java.lang.String r5 = com.lagradost.cloudstream3.MainAPIKt.fixUrl(r1, r2)
            r1 = r11
            com.lagradost.cloudstream3.MainAPI r1 = (com.lagradost.cloudstream3.MainAPI) r1
            org.jsoup.select.Elements r0 = r12.select(r0)
            java.lang.String r2 = "src"
            java.lang.String r0 = r0.attr(r2)
            java.lang.String r0 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r1, r0)
            r3 = r11
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            com.lagradost.cloudstream3.TvType r6 = com.lagradost.cloudstream3.TvType.NSFW
            com.GXtapes.GXtapes$$ExternalSyntheticLambda1 r8 = new com.GXtapes.GXtapes$$ExternalSyntheticLambda1
            r8.<init>(r0)
            r9 = 8
            r10 = 0
            r7 = 0
            com.lagradost.cloudstream3.MovieSearchResponse r1 = com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse$default(r3, r4, r5, r6, r7, r8, r9, r10)
            com.lagradost.cloudstream3.SearchResponse r1 = (com.lagradost.cloudstream3.SearchResponse) r1
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
            boolean r3 = r2 instanceof com.GXtapes.GXtapes.C00001
            if (r3 == 0) goto L1a
            r3 = r2
            com.GXtapes.GXtapes$getMainPage$1 r3 = (com.GXtapes.GXtapes.C00001) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.GXtapes.GXtapes$getMainPage$1 r3 = new com.GXtapes.GXtapes$getMainPage$1
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
            goto Ldc
        L46:
            kotlin.ResultKt.throwOnFailure(r4)
            if (r1 <= r7) goto L6f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r0.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = r25.getData()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = "/page/"
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            goto L8e
        L6f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r0.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r8)
            r8 = 47
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = r25.getData()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
        L8e:
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
            if (r4 != r1) goto Ld8
            return r1
        Ld8:
            r1 = r24
            r6 = r25
        Ldc:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r4 = r4.getDocument()
            java.lang.String r7 = "ul.listing-tube li"
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
        Lfa:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L11b
            java.lang.Object r15 = r14.next()
            r16 = r15
            r17 = 0
            r2 = r16
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            r19 = 0
            com.lagradost.cloudstream3.SearchResponse r2 = r0.toSearchResult(r2)
            if (r2 == 0) goto L119
            r19 = 0
            r9.add(r2)
        L119:
            r2 = 1
            goto Lfa
        L11b:
            r2 = r9
            java.util.List r2 = (java.util.List) r2
            com.lagradost.cloudstream3.HomePageList r7 = new com.lagradost.cloudstream3.HomePageList
            java.lang.String r8 = r6.getName()
            r14 = 1
            r7.<init>(r8, r2, r14)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r14)
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
    public java.lang.Object load(@org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.LoadResponse> r24) {
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof com.GXtapes.GXtapes.C00011
            if (r2 == 0) goto L18
            r2 = r1
            com.GXtapes.GXtapes$load$1 r2 = (com.GXtapes.GXtapes.C00011) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.GXtapes.GXtapes$load$1 r2 = new com.GXtapes.GXtapes$load$1
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
            goto L16e
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
            if (r3 == 0) goto Lae
            java.lang.String r3 = r3.attr(r4)
            if (r3 == 0) goto Lae
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r3 = kotlin.text.StringsKt.trim(r3)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto Lb0
        Lae:
            java.lang.String r3 = ""
        Lb0:
            java.lang.String r6 = "meta[property=og:image]"
            org.jsoup.nodes.Element r6 = r10.selectFirst(r6)
            if (r6 == 0) goto Lc9
            java.lang.String r6 = r6.attr(r4)
            if (r6 == 0) goto Lc9
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.CharSequence r6 = kotlin.text.StringsKt.trim(r6)
            java.lang.String r6 = r6.toString()
            goto Lca
        Lc9:
            r6 = 0
        Lca:
            r11 = r6
            java.lang.String r6 = "meta[property=og:description]"
            org.jsoup.nodes.Element r6 = r10.selectFirst(r6)
            if (r6 == 0) goto Le4
            java.lang.String r4 = r6.attr(r4)
            if (r4 == 0) goto Le4
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim(r4)
            java.lang.String r4 = r4.toString()
            goto Le5
        Le4:
            r4 = 0
        Le5:
            r12 = r4
            java.lang.String r4 = "ul.listing-tube li"
            org.jsoup.select.Elements r4 = r10.select(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r6 = 0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r8 = (java.util.Collection) r8
            r13 = r4
            r14 = 0
            r15 = r13
            r16 = 0
            java.util.Iterator r17 = r15.iterator()
        Lff:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L120
            java.lang.Object r18 = r17.next()
            r19 = r18
            r20 = 0
            r7 = r19
            org.jsoup.nodes.Element r7 = (org.jsoup.nodes.Element) r7
            r21 = 0
            com.lagradost.cloudstream3.SearchResponse r7 = r0.toRecommendResult(r7)
            if (r7 == 0) goto L11e
            r21 = 0
            r8.add(r7)
        L11e:
            goto Lff
        L120:
            r7 = r8
            java.util.List r7 = (java.util.List) r7
            r13 = r7
            r4 = r3
            r3 = r0
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            com.lagradost.cloudstream3.TvType r6 = com.lagradost.cloudstream3.TvType.NSFW
            com.GXtapes.GXtapes$load$2 r7 = new com.GXtapes.GXtapes$load$2
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
            if (r3 != r1) goto L167
            return r1
        L167:
            r1 = r3
            r6 = r4
            r8 = r5
            r7 = r10
            r5 = r11
            r4 = r12
            r3 = r13
        L16e:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object loadLinks(@org.jetbrains.annotations.NotNull java.lang.String r27, boolean r28, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r29, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r30, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r31) {
            r26 = this;
            r0 = r31
            boolean r1 = r0 instanceof com.GXtapes.GXtapes.C00031
            if (r1 == 0) goto L18
            r1 = r0
            com.GXtapes.GXtapes$loadLinks$1 r1 = (com.GXtapes.GXtapes.C00031) r1
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
            com.GXtapes.GXtapes$loadLinks$1 r1 = new com.GXtapes.GXtapes$loadLinks$1
            r2 = r26
            r1.<init>(r2, r0)
        L1f:
            java.lang.Object r3 = r1.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r1.label
            r6 = 1
            switch(r5) {
                case 0: goto L74;
                case 1: goto L57;
                case 2: goto L34;
                default: goto L2b;
            }
        L2b:
            r4 = r1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            boolean r4 = r1.Z$0
            java.lang.Object r5 = r1.L$5
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r1.L$4
            kotlin.jvm.internal.Ref$BooleanRef r6 = (kotlin.jvm.internal.Ref.BooleanRef) r6
            java.lang.Object r7 = r1.L$3
            org.jsoup.nodes.Document r7 = (org.jsoup.nodes.Document) r7
            java.lang.Object r8 = r1.L$2
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r9 = r1.L$1
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r1.L$0
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r3)
            r20 = r3
            r3 = r4
            r4 = r1
            goto L1a8
        L57:
            boolean r5 = r1.Z$0
            java.lang.Object r7 = r1.L$2
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r8 = r1.L$1
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r9 = r1.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r3)
            r6 = r4
            r4 = r1
            r1 = r6
            r20 = r3
            r6 = r9
            r3 = r5
            r9 = r7
            r7 = r8
            r5 = r20
            goto Lc5
        L74:
            kotlin.ResultKt.throwOnFailure(r3)
            r5 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r7 = r27
            r1.L$0 = r7
            r8 = r29
            r1.L$1 = r8
            r9 = r30
            r1.L$2 = r9
            r10 = r28
            r1.Z$0 = r10
            r1.label = r6
            r11 = r5
            r5 = 0
            r12 = 1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = r11
            r11 = 0
            r14 = r13
            r15 = 1
            r12 = 0
            r16 = r14
            r14 = 0
            r17 = 1
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r18
            r18 = 4094(0xffe, float:5.737E-42)
            r20 = r19
            r19 = 0
            r17 = r1
            r1 = r4
            r4 = r27
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r4 = r17
            if (r3 != r1) goto Lbc
            return r1
        Lbc:
            r6 = r27
            r7 = r29
            r9 = r30
            r5 = r3
            r3 = r28
        Lc5:
            com.lagradost.nicehttp.NiceResponse r5 = (com.lagradost.nicehttp.NiceResponse) r5
            org.jsoup.nodes.Document r11 = r5.getDocument()
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
            r8.<init>()
            java.lang.String r5 = "#video-code iframe, iframe[src]"
            org.jsoup.select.Elements r5 = r11.select(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r10 = 0
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Collection r12 = (java.util.Collection) r12
            r13 = r5
            r14 = 0
            r15 = r13
            r16 = 0
            java.util.Iterator r17 = r15.iterator()
        Lea:
            boolean r18 = r17.hasNext()
            r19 = 0
            java.lang.String r0 = "src"
            if (r18 == 0) goto L13c
            java.lang.Object r18 = r17.next()
            r21 = r18
            r22 = 0
            r2 = r21
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            r23 = 0
            java.lang.String r0 = r2.attr(r0)
            r27 = r0
            r24 = 0
            r25 = r27
            java.lang.CharSequence r25 = (java.lang.CharSequence) r25
            boolean r25 = kotlin.text.StringsKt.isBlank(r25)
            if (r25 != 0) goto L124
            r28 = r0
            java.lang.String r0 = "#"
            r29 = r2
            r2 = r27
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 != 0) goto L12a
            r0 = 1
            goto L12b
        L124:
            r28 = r0
            r29 = r2
            r2 = r27
        L12a:
            r0 = 0
        L12b:
            if (r0 == 0) goto L12f
            r19 = r28
        L12f:
            if (r19 == 0) goto L137
            r0 = r19
            r2 = 0
            r12.add(r0)
        L137:
            r2 = r26
            r0 = r31
            goto Lea
        L13c:
            r2 = r12
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r2 = kotlin.collections.CollectionsKt.toMutableSet(r2)
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L167
            java.lang.String r5 = "iframe#ifr"
            org.jsoup.nodes.Element r5 = r11.selectFirst(r5)
            if (r5 == 0) goto L15b
            java.lang.String r19 = r5.attr(r0)
        L15b:
            if (r19 == 0) goto L167
            r0 = r19
            r5 = 0
            boolean r0 = r2.add(r0)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
        L167:
            r0 = r2
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
            com.GXtapes.GXtapes$loadLinks$3 r5 = new com.GXtapes.GXtapes$loadLinks$3
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r4.L$0 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r4.L$1 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r4.L$2 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r4.L$3 = r10
            r4.L$4 = r8
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r4.L$5 = r10
            r4.Z$0 = r3
            r10 = 2
            r4.label = r10
            java.lang.Object r0 = com.lagradost.cloudstream3.ParCollectionsKt.amap(r0, r5, r4)
            if (r0 != r1) goto L1a2
            return r1
        L1a2:
            r5 = r2
            r10 = r6
            r6 = r8
            r8 = r9
            r9 = r7
            r7 = r11
        L1a8:
            boolean r0 = r6.element
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object search(@org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.SearchResponse>> r28) {
            r26 = this;
            r0 = r28
            boolean r1 = r0 instanceof com.GXtapes.GXtapes.C00051
            if (r1 == 0) goto L18
            r1 = r0
            com.GXtapes.GXtapes$search$1 r1 = (com.GXtapes.GXtapes.C00051) r1
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
            com.GXtapes.GXtapes$search$1 r1 = new com.GXtapes.GXtapes$search$1
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
            java.lang.String r8 = "ul.listing-tube li"
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
