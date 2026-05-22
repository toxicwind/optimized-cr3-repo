package Xhamster;

/* JADX INFO: compiled from: Xhamster.kt */
/* JADX INFO: loaded from: /tmp/tmp.X4wNI9Fn9T/classes.dex */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J \u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0096@\u00a2\u0006\u0002\u0010&J\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010(2\u0006\u0010)\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010*J\u0018\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010*JF\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u000e2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000204022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020402H\u0096@\u00a2\u0006\u0002\u00107R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u00068"}, d2 = {"LXhamster/Xhamster;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "lang", "getLang", "setLang", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "getInitialsJson", "LXhamster/InitialsJson;", "html", "parseVideoItem", "Lcom/lagradost/cloudstream3/SearchResponse;", "element", "Lorg/jsoup/nodes/Element;", "getMainPage", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Xhamster"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nXhamster.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Xhamster.kt\nXhamster/Xhamster\n+ 2 AppUtils.kt\ncom/lagradost/cloudstream3/utils/AppUtils\n+ 3 Extensions.kt\ncom/fasterxml/jackson/module/kotlin/ExtensionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,382:1\n15#2:383\n50#3:384\n43#3:385\n1#4:386\n1#4:398\n1#4:412\n1#4:426\n1#4:440\n1#4:454\n1#4:468\n1#4:482\n1#4:496\n1642#5,10:387\n1915#5:397\n1916#5:399\n1652#5:400\n1642#5,10:401\n1915#5:411\n1916#5:413\n1652#5:414\n1642#5,10:415\n1915#5:425\n1916#5:427\n1652#5:428\n1642#5,10:429\n1915#5:439\n1916#5:441\n1652#5:442\n1642#5,10:443\n1915#5:453\n1916#5:455\n1652#5:456\n1642#5,10:457\n1915#5:467\n1916#5:469\n1652#5:470\n1642#5,10:471\n1915#5:481\n1916#5:483\n1652#5:484\n1642#5,10:485\n1915#5:495\n1916#5:497\n1652#5:498\n777#5:499\n873#5,2:500\n1915#5,2:502\n1915#5,2:504\n1915#5,2:506\n*S KotlinDebug\n*F\n+ 1 Xhamster.kt\nXhamster/Xhamster\n*L\n132#1:383\n132#1:384\n132#1:385\n173#1:398\n191#1:412\n234#1:426\n250#1:440\n287#1:454\n288#1:468\n296#1:482\n306#1:496\n173#1:387,10\n173#1:397\n173#1:399\n173#1:400\n191#1:401,10\n191#1:411\n191#1:413\n191#1:414\n234#1:415,10\n234#1:425\n234#1:427\n234#1:428\n250#1:429,10\n250#1:439\n250#1:441\n250#1:442\n287#1:443,10\n287#1:453\n287#1:455\n287#1:456\n288#1:457,10\n288#1:467\n288#1:469\n288#1:470\n296#1:471,10\n296#1:481\n296#1:483\n296#1:484\n306#1:485,10\n306#1:495\n306#1:497\n306#1:498\n307#1:499\n307#1:500,2\n349#1:502,2\n356#1:504,2\n367#1:506,2\n*E\n"})
public final class Xhamster extends com.lagradost.cloudstream3.MainAPI {
    private final boolean hasMainPage;

    @org.jetbrains.annotations.NotNull
    private java.lang.String lang;

    @org.jetbrains.annotations.NotNull
    private java.lang.String mainUrl;

    @org.jetbrains.annotations.NotNull
    private java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final java.util.Set<com.lagradost.cloudstream3.TvType> supportedTypes;

    /* JADX INFO: renamed from: Xhamster.Xhamster$getMainPage$1 */
    /* JADX INFO: compiled from: Xhamster.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "Xhamster.Xhamster", f = "Xhamster.kt", i = {0, 0}, l = {165}, m = "getMainPage", n = {"request", "page"}, nl = {166}, s = {"L$0", "I$0"}, v = 2)
    static final class C00001 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ Xhamster.Xhamster this$0;

        C00001(Xhamster.Xhamster r1, kotlin.coroutines.Continuation<? super Xhamster.Xhamster.C00001> r2) {
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
                Xhamster.Xhamster r0 = r4.this$0
                r1 = 0
                r2 = r4
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r3 = 0
                java.lang.Object r0 = r0.getMainPage(r3, r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: Xhamster.Xhamster$load$1 */
    /* JADX INFO: compiled from: Xhamster.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "Xhamster.Xhamster", f = "Xhamster.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {269, 321}, m = "load", n = {"url", "url", "document", "htmlContent", "initialData", "title", "plot", "poster", "fixedPoster", "tags", "recommendations"}, nl = {270, -1}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9"}, v = 2)
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
        java.lang.Object L$9;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ Xhamster.Xhamster this$0;

        C00011(Xhamster.Xhamster r1, kotlin.coroutines.Continuation<? super Xhamster.Xhamster.C00011> r2) {
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
                Xhamster.Xhamster r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.load(r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: Xhamster.Xhamster$load$7 */
    /* JADX INFO: compiled from: Xhamster.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "Xhamster.Xhamster$load$7", f = "Xhamster.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00027 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.lagradost.cloudstream3.MovieLoadResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String $fixedPoster;
        final /* synthetic */ java.lang.String $plot;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.lagradost.cloudstream3.SearchResponse>> $recommendations;
        final /* synthetic */ java.util.List<java.lang.String> $tags;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        C00027(java.lang.String r2, java.lang.String r3, java.util.List<java.lang.String> r4, kotlin.jvm.internal.Ref.ObjectRef<java.util.List<com.lagradost.cloudstream3.SearchResponse>> r5, kotlin.coroutines.Continuation<? super Xhamster.Xhamster.C00027> r6) {
                r1 = this;
                r1.$plot = r2
                r1.$fixedPoster = r3
                r1.$tags = r4
                r1.$recommendations = r5
                r0 = 2
                r1.<init>(r0, r6)
                return
        }

        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r7, kotlin.coroutines.Continuation<?> r8) {
                r6 = this;
                Xhamster.Xhamster$load$7 r0 = new Xhamster.Xhamster$load$7
                java.lang.String r1 = r6.$plot
                java.lang.String r2 = r6.$fixedPoster
                java.util.List<java.lang.String> r3 = r6.$tags
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.lagradost.cloudstream3.SearchResponse>> r4 = r6.$recommendations
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                r0.L$0 = r7
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        public final java.lang.Object invoke(com.lagradost.cloudstream3.MovieLoadResponse r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                Xhamster.Xhamster$load$7 r0 = (Xhamster.Xhamster.C00027) r0
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
                java.lang.String r1 = r3.$plot
                r0.setPlot(r1)
                java.lang.String r1 = r3.$fixedPoster
                r0.setPosterUrl(r1)
                java.util.List<java.lang.String> r1 = r3.$tags
                r0.setTags(r1)
                kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.lagradost.cloudstream3.SearchResponse>> r1 = r3.$recommendations
                java.lang.Object r1 = r1.element
                java.util.List r1 = (java.util.List) r1
                r0.setRecommendations(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    /* JADX INFO: renamed from: Xhamster.Xhamster$loadLinks$1 */
    /* JADX INFO: compiled from: Xhamster.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "Xhamster.Xhamster", f = "Xhamster.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {338, 349, 352, 363}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "isCasting", "data", "subtitleCallback", "callback", "document", "initialData", "foundLinks", "sources", "sourceName", "m3u8Url", "fixedM3u8Url", "isCasting", "$i$a$-let-Xhamster$loadLinks$2", "data", "subtitleCallback", "callback", "document", "initialData", "foundLinks", "sources", "sourceName", "m3u8Url", "fixedM3u8Url", "e", "isCasting", "$i$a$-let-Xhamster$loadLinks$2", "data", "subtitleCallback", "callback", "document", "initialData", "foundLinks", "sources", "sourceName", "$this$forEach$iv", "element$iv", "qualitySource", "qualityLabel", "videoUrl", "fixedVideoUrl", "isCasting", "$i$f$forEach", "$i$a$-forEach-Xhamster$loadLinks$3", "quality"}, nl = {339, 384, 354, 364}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "L$11", "L$12", "L$13", "L$14", "Z$0", "I$0", "I$1", "I$2"}, v = 2)
    static final class C00031 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
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
        final /* synthetic */ Xhamster.Xhamster this$0;

        C00031(Xhamster.Xhamster r1, kotlin.coroutines.Continuation<? super Xhamster.Xhamster.C00031> r2) {
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
                Xhamster.Xhamster r1 = r7.this$0
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

    /* JADX INFO: renamed from: Xhamster.Xhamster$search$1 */
    /* JADX INFO: compiled from: Xhamster.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "Xhamster.Xhamster", f = "Xhamster.kt", i = {0, 0}, l = {220}, m = "search", n = {"query", "searchUrl"}, nl = {221}, s = {"L$0", "L$1"}, v = 2)
    static final class C00041 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ Xhamster.Xhamster this$0;

        C00041(Xhamster.Xhamster r1, kotlin.coroutines.Continuation<? super Xhamster.Xhamster.C00041> r2) {
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
                Xhamster.Xhamster r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.search(r1, r2)
                return r0
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MC4cmcWAUKpS7qWDmfdtntMpsTk(java.lang.String r0, com.lagradost.cloudstream3.MovieSearchResponse r1) {
            kotlin.Unit r0 = search$lambda$0$0(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$y89NVWtsYgNdF1YatngICLrlPIw(java.lang.String r0, com.lagradost.cloudstream3.MovieSearchResponse r1) {
            kotlin.Unit r0 = getMainPage$lambda$0$0(r0, r1)
            return r0
    }

    public Xhamster() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "https://vi.xhspot.com/gay"
            r1.mainUrl = r0
            java.lang.String r0 = "Xhamster"
            r1.name = r0
            r0 = 1
            r1.hasMainPage = r0
            java.lang.String r0 = "vi"
            r1.lang = r0
            com.lagradost.cloudstream3.TvType r0 = com.lagradost.cloudstream3.TvType.NSFW
            java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)
            r1.supportedTypes = r0
            return
    }

    private final Xhamster.InitialsJson getInitialsJson(java.lang.String r12) {
            r11 = this;
            r0 = 0
            org.jsoup.nodes.Document r1 = org.jsoup.Jsoup.parse(r12)     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = "script#initials-script"
            org.jsoup.nodes.Element r1 = r1.selectFirst(r2)     // Catch: java.lang.Exception -> L43
            if (r1 == 0) goto L42
            java.lang.String r1 = r1.html()     // Catch: java.lang.Exception -> L43
            if (r1 != 0) goto L15
            goto L42
        L15:
            java.lang.String r2 = "window.initials="
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = kotlin.text.StringsKt.removePrefix(r1, r2)     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = ";"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = kotlin.text.StringsKt.removeSuffix(r2, r3)     // Catch: java.lang.Exception -> L43
            com.lagradost.cloudstream3.utils.AppUtils r3 = com.lagradost.cloudstream3.utils.AppUtils.INSTANCE     // Catch: java.lang.Exception -> L43
            r4 = r2
            r5 = 0
            com.fasterxml.jackson.databind.json.JsonMapper r6 = com.lagradost.cloudstream3.MainAPIKt.getMapper()     // Catch: java.lang.Exception -> L43
            com.fasterxml.jackson.databind.ObjectMapper r6 = (com.fasterxml.jackson.databind.ObjectMapper) r6     // Catch: java.lang.Exception -> L43
            r7 = r4
            r8 = 0
            r9 = 0
            Xhamster.Xhamster$getInitialsJson$$inlined$parseJson$1 r10 = new Xhamster.Xhamster$getInitialsJson$$inlined$parseJson$1     // Catch: java.lang.Exception -> L43
            r10.<init>()     // Catch: java.lang.Exception -> L43
            com.fasterxml.jackson.core.type.TypeReference r10 = (com.fasterxml.jackson.core.type.TypeReference) r10     // Catch: java.lang.Exception -> L43
            java.lang.Object r9 = r6.readValue(r7, r10)     // Catch: java.lang.Exception -> L43
            Xhamster.InitialsJson r9 = (Xhamster.InitialsJson) r9     // Catch: java.lang.Exception -> L43
            r0 = r9
            goto L66
        L42:
            return r0
        L43:
            r1 = move-exception
            java.lang.String r2 = r11.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getInitialsJson failed: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r1.getMessage()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r2, r3)
            r1.printStackTrace()
        L66:
            return r0
    }

    private static final kotlin.Unit getMainPage$lambda$0$0(java.lang.String r1, com.lagradost.cloudstream3.MovieSearchResponse r2) {
            r2.setPosterUrl(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private final com.lagradost.cloudstream3.SearchResponse parseVideoItem(org.jsoup.nodes.Element r14) {
            r13 = this;
            java.lang.String r0 = "a.mobile-video-thumb__name"
            org.jsoup.nodes.Element r0 = r14.selectFirst(r0)
            java.lang.String r1 = "a.thumb-image-container img"
            org.jsoup.nodes.Element r1 = r14.selectFirst(r1)
            r2 = 0
            if (r0 == 0) goto L15
            java.lang.String r3 = r0.text()
            if (r3 != 0) goto L22
        L15:
            if (r1 == 0) goto L1e
            java.lang.String r3 = "alt"
            java.lang.String r3 = r1.attr(r3)
            goto L1f
        L1e:
            r3 = r2
        L1f:
            if (r3 != 0) goto L22
            return r2
        L22:
            r5 = r3
            java.lang.String r3 = "href"
            if (r0 == 0) goto L2d
            java.lang.String r4 = r0.attr(r3)
            if (r4 != 0) goto L3f
        L2d:
            java.lang.String r4 = "a.thumb-image-container"
            org.jsoup.nodes.Element r4 = r14.selectFirst(r4)
            if (r4 == 0) goto L3b
            java.lang.String r3 = r4.attr(r3)
            r4 = r3
            goto L3c
        L3b:
            r4 = r2
        L3c:
            if (r4 != 0) goto L3f
            return r2
        L3f:
            r3 = r4
            r4 = r13
            com.lagradost.cloudstream3.MainAPI r4 = (com.lagradost.cloudstream3.MainAPI) r4
            java.lang.String r6 = com.lagradost.cloudstream3.MainAPIKt.fixUrl(r4, r3)
            if (r1 == 0) goto L50
            java.lang.String r4 = "srcset"
            java.lang.String r4 = r1.attr(r4)
            goto L51
        L50:
            r4 = r2
        L51:
            r7 = r4
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L5f
            boolean r7 = kotlin.text.StringsKt.isBlank(r7)
            if (r7 == 0) goto L5d
            goto L5f
        L5d:
            r7 = 0
            goto L60
        L5f:
            r7 = 1
        L60:
            if (r7 == 0) goto L6f
            if (r1 == 0) goto L6b
            java.lang.String r7 = "src"
            java.lang.String r7 = r1.attr(r7)
            goto L6c
        L6b:
            r7 = r2
        L6c:
            r4 = r7
            r12 = r4
            goto L70
        L6f:
            r12 = r4
        L70:
            if (r12 == 0) goto L87
            r4 = r12
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim(r4)
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L87
            r2 = 0
            r7 = r13
            com.lagradost.cloudstream3.MainAPI r7 = (com.lagradost.cloudstream3.MainAPI) r7
            java.lang.String r2 = com.lagradost.cloudstream3.MainAPIKt.fixUrl(r7, r4)
        L87:
            r4 = r13
            com.lagradost.cloudstream3.MainAPI r4 = (com.lagradost.cloudstream3.MainAPI) r4
            com.lagradost.cloudstream3.TvType r7 = com.lagradost.cloudstream3.TvType.NSFW
            Xhamster.Xhamster$$ExternalSyntheticLambda1 r9 = new Xhamster.Xhamster$$ExternalSyntheticLambda1
            r9.<init>(r2)
            r10 = 8
            r11 = 0
            r8 = 0
            com.lagradost.cloudstream3.MovieSearchResponse r4 = com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse$default(r4, r5, r6, r7, r8, r9, r10, r11)
            com.lagradost.cloudstream3.SearchResponse r4 = (com.lagradost.cloudstream3.SearchResponse) r4
            return r4
    }

    static final kotlin.Unit parseVideoItem$lambda$1(java.lang.String r1, com.lagradost.cloudstream3.MovieSearchResponse r2) {
            r2.setPosterUrl(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private static final kotlin.Unit search$lambda$0$0(java.lang.String r1, com.lagradost.cloudstream3.MovieSearchResponse r2) {
            r2.setPosterUrl(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
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
    public java.lang.Object getMainPage(int r37, @org.jetbrains.annotations.NotNull com.lagradost.cloudstream3.MainPageRequest r38, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.HomePageResponse> r39) {
            r36 = this;
            r1 = r36
            r2 = r37
            r3 = r39
            boolean r0 = r3 instanceof Xhamster.Xhamster.C00001
            if (r0 == 0) goto L1a
            r0 = r3
            Xhamster.Xhamster$getMainPage$1 r0 = (Xhamster.Xhamster.C00001) r0
            int r4 = r0.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r0.label
            int r4 = r4 - r5
            r0.label = r4
            goto L1f
        L1a:
            Xhamster.Xhamster$getMainPage$1 r0 = new Xhamster.Xhamster$getMainPage$1
            r0.<init>(r1, r3)
        L1f:
            r4 = r0
            java.lang.Object r5 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.label
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L51;
                case 1: goto L35;
                default: goto L2d;
            }
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L35:
            int r2 = r4.I$0
            java.lang.Object r0 = r4.L$0
            r6 = r0
            com.lagradost.cloudstream3.MainPageRequest r6 = (com.lagradost.cloudstream3.MainPageRequest) r6
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Exception -> L49
            r18 = r4
            r22 = r5
            r23 = 1
            r4 = r2
            r2 = r8
            goto Lcd
        L49:
            r0 = move-exception
            r18 = r4
            r22 = r5
            r4 = r2
            goto L2be
        L51:
            kotlin.ResultKt.throwOnFailure(r5)
            if (r2 <= r7) goto L57
            return r8
        L57:
            java.lang.String r6 = r1.getName()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "getMainPage started for page "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r6, r9)
            com.lagradost.nicehttp.Requests r6 = com.lagradost.cloudstream3.MainActivityKt.getApp()     // Catch: java.lang.Exception -> L2b5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b5
            r9.<init>()     // Catch: java.lang.Exception -> L2b5
            java.lang.String r10 = r1.getMainUrl()     // Catch: java.lang.Exception -> L2b5
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Exception -> L2b5
            r10 = 47
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Exception -> L2b5
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L2b5
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r38)     // Catch: java.lang.Exception -> L2b5
            r4.L$0 = r10     // Catch: java.lang.Exception -> L2b5
            r4.I$0 = r2     // Catch: java.lang.Exception -> L2b5
            r4.label = r7     // Catch: java.lang.Exception -> L2b5
            r18 = r4
            r4 = r6
            r6 = 0
            r10 = 1
            r7 = 0
            r11 = r8
            r8 = 0
            r12 = r5
            r5 = r9
            r9 = 0
            r13 = 1
            r10 = 0
            r14 = r11
            r11 = 0
            r15 = r12
            r12 = 0
            r17 = r14
            r16 = 1
            r13 = 0
            r19 = r15
            r15 = 0
            r20 = 1
            r16 = 0
            r21 = r17
            r17 = 0
            r22 = r19
            r19 = 4094(0xffe, float:5.737E-42)
            r23 = 1
            r20 = 0
            r2 = r21
            java.lang.Object r5 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Exception -> L2af
            if (r5 != r0) goto Lc9
            return r0
        Lc9:
            r4 = r37
            r6 = r38
        Lcd:
            com.lagradost.nicehttp.NiceResponse r5 = (com.lagradost.nicehttp.NiceResponse) r5     // Catch: java.lang.Exception -> L2ad
            org.jsoup.nodes.Document r0 = r5.getDocument()     // Catch: java.lang.Exception -> L2ad
            java.lang.String r5 = r0.html()
            Xhamster.InitialsJson r5 = r1.getInitialsJson(r5)
            r7 = 0
            java.lang.String r8 = "Video Trang Ch\u1ee7"
            java.lang.String r9 = "getMainPage: Mapped "
            if (r5 == 0) goto L1b8
            java.lang.String r11 = r1.getName()
            java.lang.String r12 = "getMainPage: Parsed initialData JSON."
            android.util.Log.d(r11, r12)
            Xhamster.LayoutPage r11 = r5.getLayoutPage()
            if (r11 == 0) goto L16f
            Xhamster.VideoListProps r11 = r11.getVideoListProps()
            if (r11 == 0) goto L16f
            java.util.List r11 = r11.getVideoThumbProps()
            if (r11 == 0) goto L16f
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            r12 = 0
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Collection r13 = (java.util.Collection) r13
            r14 = r11
            r15 = 0
            r16 = r14
            r17 = 0
            java.util.Iterator r19 = r16.iterator()
        L111:
            boolean r20 = r19.hasNext()
            if (r20 == 0) goto L168
            java.lang.Object r20 = r19.next()
            r21 = r20
            r24 = 0
            r25 = r21
            Xhamster.VideoThumbProps r25 = (Xhamster.VideoThumbProps) r25
            r26 = 0
            java.lang.String r27 = r25.getTitle()
            if (r27 != 0) goto L12c
            goto L160
        L12c:
            r29 = r27
            r10 = r1
            com.lagradost.cloudstream3.MainAPI r10 = (com.lagradost.cloudstream3.MainAPI) r10
            java.lang.String r2 = r25.getPageURL()
            java.lang.String r30 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r10, r2)
            if (r30 != 0) goto L13d
            r2 = 0
            goto L160
        L13d:
            r2 = r1
            com.lagradost.cloudstream3.MainAPI r2 = (com.lagradost.cloudstream3.MainAPI) r2
            java.lang.String r10 = r25.getThumbUrl()
            java.lang.String r2 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r2, r10)
            r28 = r1
            com.lagradost.cloudstream3.MainAPI r28 = (com.lagradost.cloudstream3.MainAPI) r28
            com.lagradost.cloudstream3.TvType r31 = com.lagradost.cloudstream3.TvType.NSFW
            Xhamster.Xhamster$$ExternalSyntheticLambda2 r10 = new Xhamster.Xhamster$$ExternalSyntheticLambda2
            r10.<init>(r2)
            r34 = 8
            r35 = 0
            r32 = 0
            r33 = r10
            com.lagradost.cloudstream3.MovieSearchResponse r10 = com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse$default(r28, r29, r30, r31, r32, r33, r34, r35)
            r2 = r10
        L160:
            if (r2 == 0) goto L166
            r10 = 0
            r13.add(r2)
        L166:
            r2 = 0
            goto L111
        L168:
            r2 = r13
            java.util.List r2 = (java.util.List) r2
            goto L170
        L16f:
            r2 = 0
        L170:
            r7 = r2
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L17f
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L17d
            goto L17f
        L17d:
            r2 = 0
            goto L180
        L17f:
            r2 = 1
        L180:
            if (r2 != 0) goto L1ab
            java.lang.String r8 = "Video Trang Ch\u1ee7"
            java.lang.String r2 = r1.getName()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r10 = r10.append(r9)
            int r11 = r7.size()
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = " items from JSON."
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r10 = r10.toString()
            int r2 = android.util.Log.d(r2, r10)
            kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
            goto L1c5
        L1ab:
            java.lang.String r2 = r1.getName()
            java.lang.String r10 = "getMainPage: JSON items list is null or empty after mapping."
            android.util.Log.w(r2, r10)
            r7 = 0
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            goto L1c5
        L1b8:
            java.lang.String r2 = r1.getName()
            java.lang.String r10 = "getMainPage: Failed to parse initialData JSON."
            int r2 = android.util.Log.w(r2, r10)
            kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
        L1c5:
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L1d3
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1d1
            goto L1d3
        L1d1:
            r2 = 0
            goto L1d4
        L1d3:
            r2 = 1
        L1d4:
            if (r2 == 0) goto L25b
            java.lang.String r2 = r1.getName()
            java.lang.String r10 = "getMainPage: Falling back to HTML parsing."
            android.util.Log.w(r2, r10)
            java.lang.String r2 = "div.mobile-video-thumb"
            org.jsoup.select.Elements r2 = r0.select(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r10 = 0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Collection r11 = (java.util.Collection) r11
            r12 = r2
            r13 = 0
            r14 = r12
            r15 = 0
            java.util.Iterator r16 = r14.iterator()
        L1f7:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L21b
            java.lang.Object r17 = r16.next()
            r19 = r17
            r20 = 0
            r38 = r0
            r0 = r19
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            r21 = 0
            com.lagradost.cloudstream3.SearchResponse r0 = r1.parseVideoItem(r0)
            if (r0 == 0) goto L218
            r21 = 0
            r11.add(r0)
        L218:
            r0 = r38
            goto L1f7
        L21b:
            r38 = r0
            r0 = r11
            java.util.List r0 = (java.util.List) r0
            r7 = r0
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L251
            java.lang.String r8 = "Video Trang Ch\u1ee7"
            java.lang.String r0 = r1.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r9)
            int r9 = r7.size()
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.String r9 = " items from HTML fallback."
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r0, r2)
            goto L25a
        L251:
            java.lang.String r0 = r1.getName()
            java.lang.String r2 = "getMainPage: HTML fallback also yielded no items."
            android.util.Log.w(r0, r2)
        L25a:
            goto L25d
        L25b:
            r38 = r0
        L25d:
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L26b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L269
            goto L26b
        L269:
            r23 = 0
        L26b:
            if (r23 != 0) goto L2a2
            java.lang.String r0 = r1.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "getMainPage: Successfully loaded "
            java.lang.StringBuilder r2 = r2.append(r9)
            int r9 = r7.size()
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.String r9 = " items using "
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r9 = " logic."
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r0, r2)
            r0 = 4
            r14 = 0
            com.lagradost.cloudstream3.HomePageResponse r0 = com.lagradost.cloudstream3.MainAPIKt.newHomePageResponse$default(r8, r7, r14, r0, r14)
            goto L2ac
        L2a2:
            java.lang.String r0 = r1.getName()
            java.lang.String r2 = "getMainPage: No items found from JSON or HTML."
            android.util.Log.e(r0, r2)
            r0 = 0
        L2ac:
            return r0
        L2ad:
            r0 = move-exception
            goto L2be
        L2af:
            r0 = move-exception
            r4 = r37
            r6 = r38
            goto L2be
        L2b5:
            r0 = move-exception
            r18 = r4
            r22 = r5
            r4 = r37
            r6 = r38
        L2be:
            java.lang.String r2 = r1.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Failed to fetch main page: "
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r7 = r0.getMessage()
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            r14 = 0
            return r14
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

    @org.jetbrains.annotations.Nullable
    public java.lang.Object load(@org.jetbrains.annotations.NotNull java.lang.String r34, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.LoadResponse> r35) {
            r33 = this;
            r1 = r33
            r3 = r34
            r2 = r35
            java.lang.String r0 = "Found "
            boolean r4 = r2 instanceof Xhamster.Xhamster.C00011
            if (r4 == 0) goto L1c
            r4 = r2
            Xhamster.Xhamster$load$1 r4 = (Xhamster.Xhamster.C00011) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 & r6
            if (r5 == 0) goto L1c
            int r5 = r4.label
            int r5 = r5 - r6
            r4.label = r5
            goto L21
        L1c:
            Xhamster.Xhamster$load$1 r4 = new Xhamster.Xhamster$load$1
            r4.<init>(r1, r2)
        L21:
            r11 = r4
            java.lang.Object r4 = r11.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r11.label
            r7 = 0
            switch(r6) {
                case 0: goto L7e;
                case 1: goto L68;
                case 2: goto L36;
                default: goto L2e;
            }
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            java.lang.Object r0 = r11.L$9
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            java.lang.Object r5 = r11.L$8
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r11.L$7
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r11.L$6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r11.L$5
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r11.L$4
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r11.L$3
            Xhamster.InitialsJson r10 = (Xhamster.InitialsJson) r10
            java.lang.Object r12 = r11.L$2
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r11.L$1
            org.jsoup.nodes.Document r13 = (org.jsoup.nodes.Document) r13
            java.lang.Object r14 = r11.L$0
            r3 = r14
            java.lang.String r3 = (java.lang.String) r3
            kotlin.ResultKt.throwOnFailure(r4)
            r20 = r4
            r16 = r11
            goto L473
        L68:
            java.lang.Object r6 = r11.L$0
            r3 = r6
            java.lang.String r3 = (java.lang.String) r3
            kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Exception -> L76
            r7 = r3
            r20 = r4
            r1 = r5
            goto Ld5
        L76:
            r0 = move-exception
            r7 = r3
            r20 = r4
            r16 = r11
            goto L483
        L7e:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.String r6 = r1.getName()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Loading URL: "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r3)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r6, r8)
            com.lagradost.nicehttp.Requests r2 = com.lagradost.cloudstream3.MainActivityKt.getApp()     // Catch: java.lang.Exception -> L47c
            r11.L$0 = r3     // Catch: java.lang.Exception -> L47c
            r6 = 1
            r11.label = r6     // Catch: java.lang.Exception -> L47c
            r6 = r4
            r4 = 0
            r8 = r5
            r5 = 0
            r9 = r6
            r6 = 0
            r10 = r7
            r7 = 0
            r12 = r8
            r8 = 0
            r13 = r9
            r9 = 0
            r14 = r10
            r10 = 0
            r16 = r11
            r15 = r12
            r11 = 0
            r17 = r13
            r13 = 0
            r18 = r14
            r14 = 0
            r19 = r15
            r15 = 0
            r20 = r17
            r17 = 4094(0xffe, float:5.737E-42)
            r21 = r18
            r18 = 0
            r1 = r19
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Exception -> L478
            r11 = r16
            if (r4 != r1) goto Ld3
            return r1
        Ld3:
            r7 = r34
        Ld5:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4     // Catch: java.lang.Exception -> L474
            org.jsoup.nodes.Document r2 = r4.getDocument()     // Catch: java.lang.Exception -> L474
            r13 = r2
            java.lang.String r12 = r13.html()
            r2 = r33
            Xhamster.InitialsJson r3 = r2.getInitialsJson(r12)
            r4 = 2
            java.lang.String r5 = "content"
            if (r3 == 0) goto Lfa
            Xhamster.VideoEntity r6 = r3.getVideoEntity()
            if (r6 == 0) goto Lfa
            java.lang.String r6 = r6.getTitle()
            if (r6 != 0) goto Lf8
            goto Lfa
        Lf8:
            r14 = 0
            goto L150
        Lfa:
            java.lang.String r6 = "meta[property=og:title]"
            org.jsoup.nodes.Element r6 = r13.selectFirst(r6)
            if (r6 == 0) goto L107
            java.lang.String r6 = r6.attr(r5)
            goto L108
        L107:
            r6 = 0
        L108:
            if (r6 != 0) goto L14f
            java.lang.String r6 = "title"
            org.jsoup.nodes.Element r6 = r13.selectFirst(r6)
            if (r6 == 0) goto L12c
            java.lang.String r6 = r6.text()
            if (r6 == 0) goto L12c
            java.lang.String r8 = "|"
            r14 = 0
            java.lang.String r6 = kotlin.text.StringsKt.substringBefore$default(r6, r8, r14, r4, r14)
            if (r6 == 0) goto L12d
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.CharSequence r6 = kotlin.text.StringsKt.trim(r6)
            java.lang.String r6 = r6.toString()
            goto L12e
        L12c:
            r14 = 0
        L12d:
            r6 = r14
        L12e:
            if (r6 != 0) goto L150
            r0 = r2
            Xhamster.Xhamster r0 = (Xhamster.Xhamster) r0
            r1 = 0
            java.lang.String r4 = r0.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Could not find title for "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r4, r5)
            return r14
        L14f:
            r14 = 0
        L150:
            if (r3 == 0) goto L15e
            Xhamster.VideoEntity r8 = r3.getVideoEntity()
            if (r8 == 0) goto L15e
            java.lang.String r8 = r8.getDescription()
            if (r8 != 0) goto L178
        L15e:
            java.lang.String r8 = "div.video-description p[itemprop=description]"
            org.jsoup.nodes.Element r8 = r13.selectFirst(r8)
            if (r8 == 0) goto L177
            java.lang.String r8 = r8.text()
            if (r8 == 0) goto L177
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.CharSequence r8 = kotlin.text.StringsKt.trim(r8)
            java.lang.String r8 = r8.toString()
            goto L178
        L177:
            r8 = r14
        L178:
            r22 = r8
            if (r3 == 0) goto L18e
            Xhamster.XPlayerSettings r8 = r3.getXplayerSettings()
            if (r8 == 0) goto L18e
            Xhamster.Poster r8 = r8.getPoster()
            if (r8 == 0) goto L18e
            java.lang.String r8 = r8.getUrl()
            if (r8 != 0) goto L1ad
        L18e:
            if (r3 == 0) goto L19b
            Xhamster.VideoEntity r8 = r3.getVideoEntity()
            if (r8 == 0) goto L19b
            java.lang.String r8 = r8.getThumbBig()
            goto L19c
        L19b:
            r8 = r14
        L19c:
            if (r8 != 0) goto L1ad
            java.lang.String r8 = "meta[property=og:image]"
            org.jsoup.nodes.Element r8 = r13.selectFirst(r8)
            if (r8 == 0) goto L1ac
            java.lang.String r5 = r8.attr(r5)
            r8 = r5
            goto L1ad
        L1ac:
            r8 = r14
        L1ad:
            r15 = r8
            r5 = r2
            com.lagradost.cloudstream3.MainAPI r5 = (com.lagradost.cloudstream3.MainAPI) r5
            java.lang.String r23 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r5, r15)
            if (r3 == 0) goto L206
            Xhamster.VideoTagsComponent r5 = r3.getVideoTagsComponent()
            if (r5 == 0) goto L206
            java.util.List r5 = r5.getTags()
            if (r5 == 0) goto L206
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r8 = 0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Collection r9 = (java.util.Collection) r9
            r10 = r5
            r16 = 0
            r17 = r10
            r18 = 0
            java.util.Iterator r19 = r17.iterator()
        L1d8:
            boolean r21 = r19.hasNext()
            if (r21 == 0) goto L1fd
            java.lang.Object r21 = r19.next()
            r24 = r21
            r25 = 0
            r26 = r24
            Xhamster.Tag r26 = (Xhamster.Tag) r26
            r27 = 0
            java.lang.String r26 = r26.getName()
            if (r26 == 0) goto L1fb
            r34 = r26
            r26 = 0
            r4 = r34
            r9.add(r4)
        L1fb:
            r4 = 2
            goto L1d8
        L1fd:
            r4 = r9
            java.util.List r4 = (java.util.List) r4
            r24 = r4
            goto L259
        L206:
            java.lang.String r4 = "section[data-role=video-tags] a.item"
            org.jsoup.select.Elements r4 = r13.select(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = 0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r8 = (java.util.Collection) r8
            r9 = r4
            r10 = 0
            r16 = r9
            r17 = 0
            java.util.Iterator r18 = r16.iterator()
        L220:
            boolean r19 = r18.hasNext()
            if (r19 == 0) goto L245
            java.lang.Object r19 = r18.next()
            r21 = r19
            r24 = 0
            r25 = r21
            org.jsoup.nodes.Element r25 = (org.jsoup.nodes.Element) r25
            r26 = 0
            java.lang.String r25 = r25.text()
            if (r25 == 0) goto L243
            r34 = r25
            r25 = 0
            r14 = r34
            r8.add(r14)
        L243:
            r14 = 0
            goto L220
        L245:
            java.util.List r8 = (java.util.List) r8
            r4 = r8
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L255
            r4 = 0
            r4 = 0
        L255:
            java.util.List r4 = (java.util.List) r4
            r24 = r4
        L259:
            kotlin.jvm.internal.Ref$ObjectRef r25 = new kotlin.jvm.internal.Ref$ObjectRef
            r25.<init>()
            r4 = r25
            java.lang.String r5 = "div[data-role=video-related] div.mobile-video-thumb"
            org.jsoup.select.Elements r8 = r13.select(r5)     // Catch: java.lang.Exception -> L3b9
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Exception -> L3b9
            r9 = 0
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3b9
            r10.<init>()     // Catch: java.lang.Exception -> L3b9
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.lang.Exception -> L3b9
            r14 = r8
            r16 = 0
            r17 = r14
            r18 = 0
            java.util.Iterator r19 = r17.iterator()     // Catch: java.lang.Exception -> L3b9
        L27d:
            boolean r21 = r19.hasNext()     // Catch: java.lang.Exception -> L3b9
            if (r21 == 0) goto L2a7
            java.lang.Object r21 = r19.next()     // Catch: java.lang.Exception -> L3b9
            r25 = r21
            r28 = 0
            r29 = r25
            org.jsoup.nodes.Element r29 = (org.jsoup.nodes.Element) r29     // Catch: java.lang.Exception -> L3b9
            r34 = r29
            r29 = 0
            r30 = r3
            r3 = r34
            com.lagradost.cloudstream3.SearchResponse r31 = r2.parseVideoItem(r3)     // Catch: java.lang.Exception -> L3b7
            if (r31 == 0) goto L2a4
            r3 = r31
            r29 = 0
            r10.add(r3)     // Catch: java.lang.Exception -> L3b7
        L2a4:
            r3 = r30
            goto L27d
        L2a7:
            r30 = r3
            r3 = r10
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Exception -> L3b7
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Exception -> L3b7
            boolean r8 = r3.isEmpty()     // Catch: java.lang.Exception -> L3b7
            if (r8 == 0) goto L2b8
            r3 = 0
            r3 = 0
        L2b8:
            r4.element = r3     // Catch: java.lang.Exception -> L3b7
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Exception -> L3b7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3b7
            r8.<init>()     // Catch: java.lang.Exception -> L3b7
            java.lang.StringBuilder r8 = r8.append(r0)     // Catch: java.lang.Exception -> L3b7
            java.lang.Object r9 = r4.element     // Catch: java.lang.Exception -> L3b7
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L3b7
            if (r9 == 0) goto L2d2
            int r9 = r9.size()     // Catch: java.lang.Exception -> L3b7
            goto L2d3
        L2d2:
            r9 = 0
        L2d3:
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Exception -> L3b7
            java.lang.String r9 = " recommendations using HTML selector '"
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Exception -> L3b7
            java.lang.StringBuilder r8 = r8.append(r5)     // Catch: java.lang.Exception -> L3b7
            java.lang.String r9 = "'."
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Exception -> L3b7
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L3b7
            android.util.Log.d(r3, r8)     // Catch: java.lang.Exception -> L3b7
            java.lang.Object r3 = r4.element     // Catch: java.lang.Exception -> L3b7
            if (r3 != 0) goto L3e0
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Exception -> L3b7
            java.lang.String r8 = "Primary HTML selector for recommendations failed, trying broader selector."
            android.util.Log.w(r3, r8)     // Catch: java.lang.Exception -> L3b7
            java.lang.String r3 = "ul.thumb-list div.mobile-video-thumb"
            org.jsoup.select.Elements r3 = r13.select(r3)     // Catch: java.lang.Exception -> L3b7
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Exception -> L3b7
            r8 = 0
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3b7
            r9.<init>()     // Catch: java.lang.Exception -> L3b7
            java.util.Collection r9 = (java.util.Collection) r9     // Catch: java.lang.Exception -> L3b7
            r14 = r3
            r16 = 0
            r17 = r14
            r18 = 0
            java.util.Iterator r19 = r17.iterator()     // Catch: java.lang.Exception -> L3b7
        L317:
            boolean r21 = r19.hasNext()     // Catch: java.lang.Exception -> L3b7
            if (r21 == 0) goto L33e
            java.lang.Object r21 = r19.next()     // Catch: java.lang.Exception -> L3b7
            r25 = r21
            r28 = 0
            r29 = r25
            org.jsoup.nodes.Element r29 = (org.jsoup.nodes.Element) r29     // Catch: java.lang.Exception -> L3b7
            r34 = r29
            r29 = 0
            r10 = r34
            com.lagradost.cloudstream3.SearchResponse r32 = r2.parseVideoItem(r10)     // Catch: java.lang.Exception -> L3b7
            if (r32 == 0) goto L33c
            r10 = r32
            r29 = 0
            r9.add(r10)     // Catch: java.lang.Exception -> L3b7
        L33c:
            goto L317
        L33e:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L3b7
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Exception -> L3b7
            r3 = 0
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3b7
            r8.<init>()     // Catch: java.lang.Exception -> L3b7
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Exception -> L3b7
            r10 = r9
            r14 = 0
            java.util.Iterator r16 = r10.iterator()     // Catch: java.lang.Exception -> L3b7
        L354:
            boolean r17 = r16.hasNext()     // Catch: java.lang.Exception -> L3b7
            if (r17 == 0) goto L37b
            java.lang.Object r17 = r16.next()     // Catch: java.lang.Exception -> L3b7
            r34 = r17
            r17 = r34
            com.lagradost.cloudstream3.SearchResponse r17 = (com.lagradost.cloudstream3.SearchResponse) r17     // Catch: java.lang.Exception -> L3b7
            r18 = 0
            java.lang.String r2 = r17.getUrl()     // Catch: java.lang.Exception -> L3b7
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r7)     // Catch: java.lang.Exception -> L3b7
            if (r2 != 0) goto L376
            r2 = r34
            r8.add(r2)     // Catch: java.lang.Exception -> L3b7
            goto L378
        L376:
            r2 = r34
        L378:
            r2 = r33
            goto L354
        L37b:
            r2 = r8
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> L3b7
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Exception -> L3b7
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Exception -> L3b7
            if (r3 == 0) goto L38a
            r2 = 0
            r2 = 0
        L38a:
            r4.element = r2     // Catch: java.lang.Exception -> L3b7
            java.lang.String r2 = r33.getName()     // Catch: java.lang.Exception -> L3b7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3b7
            r3.<init>()     // Catch: java.lang.Exception -> L3b7
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Exception -> L3b7
            java.lang.Object r3 = r4.element     // Catch: java.lang.Exception -> L3b7
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Exception -> L3b7
            if (r3 == 0) goto L3a4
            int r10 = r3.size()     // Catch: java.lang.Exception -> L3b7
            goto L3a5
        L3a4:
            r10 = 0
        L3a5:
            java.lang.StringBuilder r0 = r0.append(r10)     // Catch: java.lang.Exception -> L3b7
            java.lang.String r3 = " recommendations using broader HTML selector."
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Exception -> L3b7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L3b7
            android.util.Log.d(r2, r0)     // Catch: java.lang.Exception -> L3b7
            goto L3e0
        L3b7:
            r0 = move-exception
            goto L3bc
        L3b9:
            r0 = move-exception
            r30 = r3
        L3bc:
            java.lang.String r2 = r33.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Error parsing recommendations from HTML: "
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r5 = r0.getMessage()
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r2, r3)
            r0.printStackTrace()
            r14 = 0
            r4.element = r14
        L3e0:
            java.lang.String r0 = r33.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Final recommendations count being added to LoadResponse: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Object r3 = r4.element
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L3fe
            int r3 = r3.size()
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)
            goto L3ff
        L3fe:
            r3 = 0
        L3ff:
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r0, r2)
            r5 = r33
            com.lagradost.cloudstream3.MainAPI r5 = (com.lagradost.cloudstream3.MainAPI) r5
            com.lagradost.cloudstream3.TvType r8 = com.lagradost.cloudstream3.TvType.NSFW
            Xhamster.Xhamster$load$7 r21 = new Xhamster.Xhamster$load$7
            r26 = 0
            r25 = r4
            r21.<init>(r22, r23, r24, r25, r26)
            r10 = r21
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r11.L$0 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r11.L$1 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r11.L$2 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r30)
            r11.L$3 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r11.L$4 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r11.L$5 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r11.L$6 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)
            r11.L$7 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r11.L$8 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)
            r11.L$9 = r0
            r2 = 2
            r11.label = r2
            r9 = r7
            java.lang.Object r4 = com.lagradost.cloudstream3.MainAPIKt.newMovieLoadResponse(r5, r6, r7, r8, r9, r10, r11)
            r16 = r11
            if (r4 != r1) goto L466
            return r1
        L466:
            r9 = r6
            r3 = r7
            r7 = r15
            r8 = r22
            r6 = r23
            r5 = r24
            r0 = r25
            r10 = r30
        L473:
            return r4
        L474:
            r0 = move-exception
            r16 = r11
            goto L483
        L478:
            r0 = move-exception
            r7 = r34
            goto L483
        L47c:
            r0 = move-exception
            r20 = r4
            r16 = r11
            r7 = r34
        L483:
            java.lang.String r1 = r33.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to load URL "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r1, r2)
            r14 = 0
            return r14
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object loadLinks(@org.jetbrains.annotations.NotNull java.lang.String r33, boolean r34, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r35, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r36, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r37) {
            r32 = this;
            r1 = r32
            r3 = r33
            r2 = r37
            boolean r0 = r2 instanceof Xhamster.Xhamster.C00031
            if (r0 == 0) goto L1a
            r0 = r2
            Xhamster.Xhamster$loadLinks$1 r0 = (Xhamster.Xhamster.C00031) r0
            int r4 = r0.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r0.label
            int r4 = r4 - r5
            r0.label = r4
            goto L1f
        L1a:
            Xhamster.Xhamster$loadLinks$1 r0 = new Xhamster.Xhamster$loadLinks$1
            r0.<init>(r1, r2)
        L1f:
            r7 = r0
            java.lang.Object r4 = r7.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.label
            r19 = 0
            switch(r0) {
                case 0: goto L182;
                case 1: goto L15c;
                case 2: goto L104;
                case 3: goto Lb0;
                case 4: goto L35;
                default: goto L2d;
            }
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            int r0 = r7.I$2
            int r9 = r7.I$1
            int r10 = r7.I$0
            boolean r11 = r7.Z$0
            java.lang.Object r12 = r7.L$15
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            java.lang.Object r13 = r7.L$14
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r7.L$13
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r7.L$12
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r6 = r7.L$11
            Xhamster.StandardSourceQuality r6 = (Xhamster.StandardSourceQuality) r6
            java.lang.Object r8 = r7.L$10
            r18 = r0
            java.lang.Object r0 = r7.L$9
            java.util.Iterator r0 = (java.util.Iterator) r0
            r34 = r0
            java.lang.Object r0 = r7.L$8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r19 = r0
            java.lang.Object r0 = r7.L$7
            java.lang.String r0 = (java.lang.String) r0
            r20 = r0
            java.lang.Object r0 = r7.L$6
            Xhamster.VideoSources r0 = (Xhamster.VideoSources) r0
            r21 = r0
            java.lang.Object r0 = r7.L$5
            kotlin.jvm.internal.Ref$BooleanRef r0 = (kotlin.jvm.internal.Ref.BooleanRef) r0
            r22 = r0
            java.lang.Object r0 = r7.L$4
            Xhamster.InitialsJson r0 = (Xhamster.InitialsJson) r0
            r23 = r0
            java.lang.Object r0 = r7.L$3
            org.jsoup.nodes.Document r0 = (org.jsoup.nodes.Document) r0
            r24 = r0
            java.lang.Object r0 = r7.L$2
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r36 = r0
            java.lang.Object r0 = r7.L$1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r35 = r0
            java.lang.Object r0 = r7.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r4)
            r29 = r7
            r16 = r8
            r26 = r13
            r25 = r15
            r3 = r23
            r13 = r35
            r7 = r5
            r8 = r6
            r15 = r12
            r5 = r0
            r6 = r4
            r12 = r10
            r0 = r22
            r10 = r36
            r22 = r14
            r14 = r11
            r11 = r9
            r9 = r34
            goto L535
        Lb0:
            int r0 = r7.I$0
            boolean r6 = r7.Z$0
            java.lang.Object r8 = r7.L$11
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r9 = r7.L$10
            java.lang.Exception r9 = (java.lang.Exception) r9
            java.lang.Object r10 = r7.L$9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r7.L$8
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r7.L$7
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r7.L$6
            Xhamster.VideoSources r13 = (Xhamster.VideoSources) r13
            java.lang.Object r14 = r7.L$5
            kotlin.jvm.internal.Ref$BooleanRef r14 = (kotlin.jvm.internal.Ref.BooleanRef) r14
            java.lang.Object r15 = r7.L$4
            Xhamster.InitialsJson r15 = (Xhamster.InitialsJson) r15
            r18 = r0
            java.lang.Object r0 = r7.L$3
            org.jsoup.nodes.Document r0 = (org.jsoup.nodes.Document) r0
            r34 = r0
            java.lang.Object r0 = r7.L$2
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r36 = r0
            java.lang.Object r0 = r7.L$1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r35 = r0
            java.lang.Object r0 = r7.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r4)
            r2 = r0
            r20 = r4
            r1 = r5
            r3 = r10
            r16 = r13
            r5 = r14
            r17 = r15
            r0 = r18
            r10 = 1
            r15 = r34
            r13 = r35
            r14 = r36
            goto L3c9
        L104:
            int r6 = r7.I$0
            boolean r8 = r7.Z$0
            java.lang.Object r0 = r7.L$9
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r7.L$8
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r0 = r7.L$7
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r0 = r7.L$6
            r12 = r0
            Xhamster.VideoSources r12 = (Xhamster.VideoSources) r12
            java.lang.Object r0 = r7.L$5
            r13 = r0
            kotlin.jvm.internal.Ref$BooleanRef r13 = (kotlin.jvm.internal.Ref.BooleanRef) r13
            java.lang.Object r0 = r7.L$4
            r14 = r0
            Xhamster.InitialsJson r14 = (Xhamster.InitialsJson) r14
            java.lang.Object r0 = r7.L$3
            r15 = r0
            org.jsoup.nodes.Document r15 = (org.jsoup.nodes.Document) r15
            java.lang.Object r0 = r7.L$2
            r18 = r0
            kotlin.jvm.functions.Function1 r18 = (kotlin.jvm.functions.Function1) r18
            java.lang.Object r0 = r7.L$1
            r19 = r0
            kotlin.jvm.functions.Function1 r19 = (kotlin.jvm.functions.Function1) r19
            java.lang.Object r0 = r7.L$0
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Exception -> L146
            r20 = r4
            r1 = r5
            r2 = r18
            goto L2bb
        L146:
            r0 = move-exception
            r1 = r10
            r10 = r3
            r3 = r12
            r12 = r8
            r8 = r14
            r14 = r18
            r18 = r1
            r20 = r4
            r1 = r5
            r4 = r9
            r2 = r11
            r5 = 1
            r11 = r6
            r6 = r13
            r13 = r19
            goto L33c
        L15c:
            boolean r6 = r7.Z$0
            java.lang.Object r0 = r7.L$2
            r8 = r0
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r0 = r7.L$1
            r9 = r0
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r0 = r7.L$0
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Exception -> L179
            r20 = r4
            r1 = r5
            r12 = r6
            r14 = r8
            r13 = r9
            r5 = r3
            goto L1ea
        L179:
            r0 = move-exception
            r2 = r3
            r20 = r4
            r12 = r6
            r14 = r8
            r13 = r9
            goto L6e6
        L182:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.String r0 = r1.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "LoadLinks started for: "
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r0, r6)
            com.lagradost.nicehttp.Requests r2 = com.lagradost.cloudstream3.MainActivityKt.getApp()     // Catch: java.lang.Exception -> L6db
            r7.L$0 = r3     // Catch: java.lang.Exception -> L6db
            r6 = r35
            r7.L$1 = r6     // Catch: java.lang.Exception -> L6db
            r8 = r36
            r7.L$2 = r8     // Catch: java.lang.Exception -> L6db
            r9 = r34
            r7.Z$0 = r9     // Catch: java.lang.Exception -> L6db
            r10 = 1
            r7.label = r10     // Catch: java.lang.Exception -> L6db
            r11 = r4
            r4 = 0
            r12 = r5
            r5 = 0
            r6 = 0
            r16 = r7
            r13 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r17 = 1
            r10 = 0
            r14 = r11
            r15 = r12
            r11 = 0
            r18 = r13
            r13 = 0
            r20 = r14
            r14 = 0
            r21 = r15
            r15 = 0
            r22 = 1
            r17 = 4094(0xffe, float:5.737E-42)
            r23 = r18
            r18 = 0
            r1 = r21
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Exception -> L6cf
            r7 = r16
            if (r4 != r1) goto L1e2
            return r1
        L1e2:
            r5 = r33
            r12 = r34
            r13 = r35
            r14 = r36
        L1ea:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4     // Catch: java.lang.Exception -> L6cc
            org.jsoup.nodes.Document r0 = r4.getDocument()     // Catch: java.lang.Exception -> L6cc
            r15 = r0
            java.lang.String r0 = r15.html()
            r2 = r32
            Xhamster.InitialsJson r0 = r2.getInitialsJson(r0)
            if (r0 != 0) goto L20f
            r0 = r2
            Xhamster.Xhamster r0 = (Xhamster.Xhamster) r0
            r1 = 0
            java.lang.String r3 = r0.getName()
            java.lang.String r4 = "Failed to parse JSON for loadLinks."
            android.util.Log.e(r3, r4)
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r19)
            return r3
        L20f:
            r3 = r0
            kotlin.jvm.internal.Ref$BooleanRef r0 = new kotlin.jvm.internal.Ref$BooleanRef
            r0.<init>()
            r4 = r0
            Xhamster.XPlayerSettings r0 = r3.getXplayerSettings()
            if (r0 == 0) goto L221
            Xhamster.VideoSources r6 = r0.getSources()
            goto L222
        L221:
            r6 = 0
        L222:
            java.lang.String r8 = r2.getName()
            if (r6 == 0) goto L3dd
            Xhamster.HlsSources r0 = r6.getHls()
            if (r0 == 0) goto L3dd
            Xhamster.HlsSource r0 = r0.getH264()
            if (r0 == 0) goto L3dd
            java.lang.String r0 = r0.getUrl()
            if (r0 == 0) goto L3dd
            r9 = r0
            r10 = 0
            r0 = r2
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            java.lang.String r11 = com.lagradost.cloudstream3.MainAPIKt.fixUrl(r0, r9)
            java.lang.String r0 = r2.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r33 = r9
            java.lang.String r9 = "Found HLS url: "
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r0, r2)
            com.lagradost.cloudstream3.utils.M3u8Helper$Companion r2 = com.lagradost.cloudstream3.utils.M3u8Helper.Companion     // Catch: java.lang.Exception -> L323
            r7.L$0 = r5     // Catch: java.lang.Exception -> L323
            r7.L$1 = r13     // Catch: java.lang.Exception -> L323
            r7.L$2 = r14     // Catch: java.lang.Exception -> L323
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)     // Catch: java.lang.Exception -> L323
            r7.L$3 = r0     // Catch: java.lang.Exception -> L323
            r7.L$4 = r3     // Catch: java.lang.Exception -> L323
            r7.L$5 = r4     // Catch: java.lang.Exception -> L323
            r7.L$6 = r6     // Catch: java.lang.Exception -> L323
            r7.L$7 = r8     // Catch: java.lang.Exception -> L323
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r33)     // Catch: java.lang.Exception -> L323
            r7.L$8 = r0     // Catch: java.lang.Exception -> L323
            r7.L$9 = r11     // Catch: java.lang.Exception -> L323
            r7.Z$0 = r12     // Catch: java.lang.Exception -> L323
            r7.I$0 = r10     // Catch: java.lang.Exception -> L323
            r0 = 2
            r7.label = r0     // Catch: java.lang.Exception -> L323
            r9 = r6
            r6 = 0
            r16 = r7
            r7 = 0
            r17 = r3
            r3 = r8
            r8 = 0
            r18 = r10
            r10 = 56
            r19 = r4
            r4 = r11
            r11 = 0
            r21 = r16
            r16 = r9
            r9 = r21
            r21 = r18
            r18 = r33
            java.lang.Object r0 = com.lagradost.cloudstream3.utils.M3u8Helper.Companion.generateM3u8$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L314
            r7 = r9
            if (r0 != r1) goto L2a8
            return r1
        L2a8:
            r2 = r19
            r19 = r13
            r13 = r2
            r11 = r3
            r9 = r4
            r3 = r5
            r8 = r12
            r2 = r14
            r12 = r16
            r14 = r17
            r10 = r18
            r6 = r21
            r4 = r0
        L2bb:
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Exception -> L304
            r0 = 0
            java.util.Iterator r5 = r4.iterator()     // Catch: java.lang.Exception -> L304
        L2c2:
            boolean r16 = r5.hasNext()     // Catch: java.lang.Exception -> L304
            if (r16 == 0) goto L2f5
            java.lang.Object r16 = r5.next()     // Catch: java.lang.Exception -> L304
            r17 = r16
            com.lagradost.cloudstream3.utils.ExtractorLink r17 = (com.lagradost.cloudstream3.utils.ExtractorLink) r17     // Catch: java.lang.Exception -> L304
            r33 = r17
            r17 = 0
            r34 = r0
            r0 = r33
            r2.invoke(r0)     // Catch: java.lang.Exception -> L304
            r33 = r5
            r5 = 1
            r13.element = r5     // Catch: java.lang.Exception -> L2e5
            r5 = r33
            r0 = r34
            goto L2c2
        L2e5:
            r0 = move-exception
            r4 = r9
            r18 = r10
            r10 = r3
            r3 = r12
            r12 = r8
            r8 = r14
            r14 = r2
            r2 = r11
            r11 = r6
            r6 = r13
            r13 = r19
            goto L33c
        L2f5:
            r34 = r0
            r5 = 1
            r5 = r3
            r0 = r8
            r8 = r11
            r4 = r13
            r3 = r14
            r13 = r19
            r14 = r2
            r11 = r10
            r10 = 1
            goto L3d9
        L304:
            r0 = move-exception
            r5 = 1
            r4 = r9
            r18 = r10
            r10 = r3
            r3 = r12
            r12 = r8
            r8 = r14
            r14 = r2
            r2 = r11
            r11 = r6
            r6 = r13
            r13 = r19
            goto L33c
        L314:
            r0 = move-exception
            r2 = r5
            r7 = r9
            r5 = 1
            r10 = r2
            r2 = r3
            r3 = r16
            r8 = r17
            r6 = r19
            r11 = r21
            goto L33c
        L323:
            r0 = move-exception
            r18 = r33
            r17 = r3
            r19 = r4
            r2 = r5
            r16 = r6
            r3 = r8
            r21 = r10
            r4 = r11
            r5 = 1
            r10 = r2
            r2 = r3
            r3 = r16
            r8 = r17
            r6 = r19
            r11 = r21
        L33c:
            java.lang.String r9 = r32.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r33 = r0
            java.lang.String r0 = "M3u8Helper failed: "
            java.lang.StringBuilder r0 = r5.append(r0)
            java.lang.String r5 = r33.getMessage()
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r5 = " HLS"
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            Xhamster.Xhamster$loadLinks$2$2 r5 = new Xhamster.Xhamster$loadLinks$2$2
            r9 = 0
            r5.<init>(r10, r9)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r7.L$0 = r10
            r7.L$1 = r13
            r7.L$2 = r14
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r7.L$3 = r9
            r7.L$4 = r8
            r7.L$5 = r6
            r7.L$6 = r3
            r7.L$7 = r2
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r18)
            r7.L$8 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r7.L$9 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r33)
            r7.L$10 = r9
            r7.L$11 = r14
            r7.Z$0 = r12
            r7.I$0 = r11
            r9 = 3
            r7.label = r9
            r19 = r6
            r6 = r5
            r5 = 0
            r17 = r8
            r8 = 8
            r9 = 0
            r16 = r3
            r3 = r0
            r0 = r10
            r10 = 1
            java.lang.Object r3 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink$default(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r1) goto L3bb
            return r1
        L3bb:
            r5 = r4
            r4 = r3
            r3 = r5
            r9 = r33
            r6 = r12
            r8 = r14
            r5 = r19
            r12 = r2
            r2 = r0
            r0 = r11
            r11 = r18
        L3c9:
            r8.invoke(r4)
            r5.element = r10
            r4 = r6
            r6 = r0
            r0 = r4
            r9 = r3
            r4 = r5
            r8 = r12
            r12 = r16
            r3 = r17
            r5 = r2
        L3d9:
            r6 = r12
            r12 = r0
            goto L3fb
        L3dd:
            r17 = r3
            r19 = r4
            r2 = r5
            r16 = r6
            r3 = r8
            r10 = 1
            java.lang.String r0 = r32.getName()
            java.lang.String r4 = "No HLS source found in JSON."
            int r0 = android.util.Log.w(r0, r4)
            kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            r5 = r2
            r8 = r3
            r6 = r16
            r3 = r17
            r4 = r19
        L3fb:
            if (r6 == 0) goto L5b8
            Xhamster.StandardSources r0 = r6.getStandard()
            if (r0 == 0) goto L5b8
            java.util.List r0 = r0.getH264()
            if (r0 == 0) goto L5b8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = 0
            java.util.Iterator r9 = r0.iterator()
            r11 = r8
            r10 = r14
            r8 = r7
            r14 = r12
            r7 = r1
            r12 = r2
            r2 = r32
            r1 = r0
            r0 = r37
        L41b:
            boolean r16 = r9.hasNext()
            if (r16 == 0) goto L59f
            java.lang.Object r16 = r9.next()
            r33 = r0
            r0 = r16
            Xhamster.StandardSourceQuality r0 = (Xhamster.StandardSourceQuality) r0
            r34 = r1
            r1 = 0
            java.lang.String r24 = r0.getQuality()
            r35 = r2
            java.lang.String r2 = r0.getUrl()
            if (r24 == 0) goto L54c
            if (r2 == 0) goto L54c
            r36 = r6
            r6 = r35
            com.lagradost.cloudstream3.MainAPI r6 = (com.lagradost.cloudstream3.MainAPI) r6
            java.lang.String r6 = com.lagradost.cloudstream3.MainAPIKt.fixUrl(r6, r2)
            r28 = 4
            r29 = 0
            java.lang.String r25 = "p"
            java.lang.String r26 = ""
            r27 = 0
            java.lang.String r18 = kotlin.text.StringsKt.replace$default(r24, r25, r26, r27, r28, r29)
            r37 = r2
            r2 = r24
            java.lang.Integer r18 = kotlin.text.StringsKt.toIntOrNull(r18)
            if (r18 == 0) goto L463
            int r18 = r18.intValue()
            goto L469
        L463:
            com.lagradost.cloudstream3.utils.Qualities r18 = com.lagradost.cloudstream3.utils.Qualities.Unknown
            int r18 = r18.getValue()
        L469:
            r19 = r18
            r18 = r15
            java.lang.String r15 = r35.getName()
            r21 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r22 = r7
            java.lang.String r7 = "Found MP4 link: "
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r7 = " - "
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r15, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.String r7 = " MP4 "
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r25 = r0.toString()
            Xhamster.Xhamster$loadLinks$3$1 r0 = new Xhamster.Xhamster$loadLinks$3$1
            r7 = r19
            r15 = 0
            r0.<init>(r5, r7, r15)
            r28 = r0
            kotlin.jvm.functions.Function2 r28 = (kotlin.jvm.functions.Function2) r28
            r8.L$0 = r5
            r8.L$1 = r13
            r8.L$2 = r10
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r18)
            r8.L$3 = r0
            r8.L$4 = r3
            r8.L$5 = r4
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r36)
            r8.L$6 = r0
            r8.L$7 = r11
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r34)
            r8.L$8 = r0
            r8.L$9 = r9
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r8.L$10 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r21)
            r8.L$11 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r8.L$12 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r37)
            r8.L$13 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r8.L$14 = r0
            r8.L$15 = r10
            r8.Z$0 = r14
            r8.I$0 = r12
            r8.I$1 = r1
            r8.I$2 = r7
            r0 = 4
            r8.label = r0
            r27 = 0
            r30 = 8
            r31 = 0
            r26 = r6
            r29 = r8
            r24 = r11
            java.lang.Object r0 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink$default(r24, r25, r26, r27, r28, r29, r30, r31)
            r6 = r22
            if (r0 != r6) goto L518
            return r6
        L518:
            r8 = r4
            r4 = r0
            r0 = r8
            r8 = r7
            r7 = r6
            r6 = r20
            r20 = r24
            r24 = r18
            r18 = r8
            r19 = r34
            r22 = r37
            r11 = r1
            r25 = r2
            r15 = r10
            r8 = r21
            r2 = r33
            r1 = r35
            r21 = r36
        L535:
            r15.invoke(r4)
            r15 = 1
            r0.element = r15
            r4 = r3
            r18 = r24
            r24 = r25
            r3 = r1
            r1 = r11
            r11 = r20
            r20 = r6
            r6 = r5
            r5 = r0
            r0 = r8
            r8 = r29
            goto L591
        L54c:
            r21 = r0
            r37 = r2
            r36 = r6
            r6 = r7
            r29 = r8
            r18 = r15
            r2 = r24
            r15 = 1
            r24 = r11
            java.lang.String r0 = r35.getName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "MP4 source item missing quality or url: "
            java.lang.StringBuilder r7 = r7.append(r8)
            r8 = r21
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r0 = android.util.Log.w(r0, r7)
            kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            r19 = r34
            r21 = r36
            r22 = r37
            r7 = r6
            r11 = r24
            r24 = r2
            r6 = r5
            r2 = r33
            r5 = r4
            r4 = r3
            r3 = r35
            r0 = r8
            r8 = r29
        L591:
            r0 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r15 = r18
            r1 = r19
            r6 = r21
            goto L41b
        L59f:
            r33 = r0
            r34 = r1
            r35 = r2
            r36 = r6
            r29 = r8
            r24 = r11
            r18 = r15
            r1 = r33
            r12 = r14
            r8 = r24
            r7 = r29
            r23 = 0
            r14 = r10
            goto L5cb
        L5b8:
            r23 = 0
            java.lang.String r0 = r32.getName()
            java.lang.String r1 = "No Standard H264 sources found in JSON."
            int r0 = android.util.Log.w(r0, r1)
            kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            r2 = r32
            r1 = r37
        L5cb:
            Xhamster.XPlayerSettings r0 = r3.getXplayerSettings()
            if (r0 == 0) goto L6a1
            Xhamster.Subtitles r0 = r0.getSubtitles()
            if (r0 == 0) goto L6a1
            java.util.List r0 = r0.getTracks()
            if (r0 == 0) goto L6a1
            r9 = r0
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r10 = 0
            java.util.Iterator r11 = r9.iterator()
        L5e5:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L696
            java.lang.Object r16 = r11.next()
            r33 = r1
            r1 = r16
            Xhamster.SubtitleTrack r1 = (Xhamster.SubtitleTrack) r1
            r17 = 0
            Xhamster.SubtitleUrls r0 = r1.getUrls()
            if (r0 == 0) goto L602
            java.lang.String r0 = r0.getVtt()
            goto L604
        L602:
            r0 = r23
        L604:
            r34 = r0
            java.lang.String r0 = r1.getLang()
            if (r0 != 0) goto L614
            java.lang.String r0 = r1.getLabel()
            if (r0 != 0) goto L614
            java.lang.String r0 = "Unknown"
        L614:
            r35 = r0
            if (r34 == 0) goto L65f
            r0 = r2
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            r36 = r2
            r2 = r34
            r34 = r3
            java.lang.String r3 = com.lagradost.cloudstream3.MainAPIKt.fixUrl(r0, r2)
            java.lang.String r0 = r36.getName()
            r18 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r37 = r5
            java.lang.String r5 = "Found subtitle: Lang="
            java.lang.StringBuilder r2 = r2.append(r5)
            r5 = r35
            java.lang.StringBuilder r2 = r2.append(r5)
            r35 = r6
            java.lang.String r6 = ", URL="
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r0, r2)
            com.lagradost.cloudstream3.SubtitleFile r0 = new com.lagradost.cloudstream3.SubtitleFile     // Catch: java.lang.Exception -> L65a
            r0.<init>(r5, r3)     // Catch: java.lang.Exception -> L65a
            r13.invoke(r0)     // Catch: java.lang.Exception -> L65a
            goto L689
        L65a:
            r0 = move-exception
            r0.printStackTrace()
            goto L689
        L65f:
            r18 = r34
            r36 = r2
            r34 = r3
            r37 = r5
            r5 = r35
            r35 = r6
            java.lang.String r0 = r36.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Subtitle track missing VTT url: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            int r0 = android.util.Log.w(r0, r2)
            kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
        L689:
            r1 = r33
            r3 = r34
            r6 = r35
            r2 = r36
            r5 = r37
            goto L5e5
        L696:
            r33 = r1
            r36 = r2
            r34 = r3
            r37 = r5
            r35 = r6
            goto L6b8
        L6a1:
            r33 = r1
            r36 = r2
            r34 = r3
            r37 = r5
            r35 = r6
            java.lang.String r0 = r36.getName()
            java.lang.String r1 = "No subtitle tracks found in JSON."
            int r0 = android.util.Log.w(r0, r1)
            kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
        L6b8:
            boolean r0 = r4.element
            if (r0 != 0) goto L6c5
            java.lang.String r0 = r36.getName()
            java.lang.String r1 = "No video links (M3U8 or MP4) were found."
            android.util.Log.w(r0, r1)
        L6c5:
            boolean r0 = r4.element
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        L6cc:
            r0 = move-exception
            r2 = r5
            goto L6e6
        L6cf:
            r0 = move-exception
            r7 = r16
            r2 = r33
            r12 = r34
            r13 = r35
            r14 = r36
            goto L6e6
        L6db:
            r0 = move-exception
            r20 = r4
            r2 = r33
            r12 = r34
            r13 = r35
            r14 = r36
        L6e6:
            java.lang.String r1 = r32.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to get document for loadLinks: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r0.getMessage()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r1, r3)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r19)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object search(@org.jetbrains.annotations.NotNull java.lang.String r36, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.SearchResponse>> r37) {
            r35 = this;
            r1 = r35
            r2 = r36
            r3 = r37
            boolean r0 = r3 instanceof Xhamster.Xhamster.C00041
            if (r0 == 0) goto L1a
            r0 = r3
            Xhamster.Xhamster$search$1 r0 = (Xhamster.Xhamster.C00041) r0
            int r4 = r0.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r0.label
            int r4 = r4 - r5
            r0.label = r4
            goto L1f
        L1a:
            Xhamster.Xhamster$search$1 r0 = new Xhamster.Xhamster$search$1
            r0.<init>(r1, r3)
        L1f:
            r4 = r0
            java.lang.Object r5 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.label
            r7 = 1
            r21 = 0
            switch(r6) {
                case 0: goto L52;
                case 1: goto L36;
                default: goto L2e;
            }
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r3)
            throw r0
        L36:
            java.lang.Object r0 = r4.L$1
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r4.L$0
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Exception -> L4b
            r18 = r4
            r23 = r5
            r22 = 1
            goto Ld5
        L4b:
            r0 = move-exception
            r18 = r4
            r23 = r5
            goto L295
        L52:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r1.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = "/search/"
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = r1.getName()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Search started for query '"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.String r10 = "' at URL: "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r6)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r8, r9)
            com.lagradost.nicehttp.Requests r8 = com.lagradost.cloudstream3.MainActivityKt.getApp()     // Catch: java.lang.Exception -> L28f
            r4.L$0 = r2     // Catch: java.lang.Exception -> L28f
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)     // Catch: java.lang.Exception -> L28f
            r4.L$1 = r9     // Catch: java.lang.Exception -> L28f
            r4.label = r7     // Catch: java.lang.Exception -> L28f
            r9 = r5
            r5 = r6
            r6 = 0
            r10 = 1
            r7 = 0
            r18 = r4
            r4 = r8
            r8 = 0
            r11 = r9
            r9 = 0
            r12 = 1
            r10 = 0
            r13 = r11
            r11 = 0
            r14 = 1
            r12 = 0
            r15 = r13
            r16 = 1
            r13 = 0
            r17 = r15
            r15 = 0
            r19 = 1
            r16 = 0
            r20 = r17
            r17 = 0
            r22 = 1
            r19 = 4094(0xffe, float:5.737E-42)
            r23 = r20
            r20 = 0
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Exception -> L28c
            if (r4 != r0) goto Ld3
            return r0
        Ld3:
            r6 = r5
            r5 = r4
        Ld5:
            com.lagradost.nicehttp.NiceResponse r5 = (com.lagradost.nicehttp.NiceResponse) r5     // Catch: java.lang.Exception -> L28a
            org.jsoup.nodes.Document r0 = r5.getDocument()     // Catch: java.lang.Exception -> L28a
            java.lang.String r4 = r0.html()
            Xhamster.InitialsJson r4 = r1.getInitialsJson(r4)
            r5 = 0
            java.lang.String r7 = "Search: Mapped "
            if (r4 == 0) goto L19c
            java.lang.String r9 = r1.getName()
            java.lang.String r10 = "Search: Parsed initialData JSON."
            android.util.Log.d(r9, r10)
            Xhamster.SearchResult r9 = r4.getSearchResult()
            if (r9 == 0) goto L172
            java.util.List r9 = r9.getVideoThumbProps()
            if (r9 == 0) goto L172
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r10 = 0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Collection r11 = (java.util.Collection) r11
            r12 = r9
            r13 = 0
            r14 = r12
            r15 = 0
            java.util.Iterator r16 = r14.iterator()
        L110:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L16b
            java.lang.Object r17 = r16.next()
            r19 = r17
            r20 = 0
            r24 = r19
            Xhamster.VideoThumbProps r24 = (Xhamster.VideoThumbProps) r24
            r25 = 0
            java.lang.String r26 = r24.getTitle()
            if (r26 != 0) goto L12d
            r8 = r21
            goto L162
        L12d:
            r28 = r26
            r8 = r1
            com.lagradost.cloudstream3.MainAPI r8 = (com.lagradost.cloudstream3.MainAPI) r8
            java.lang.String r3 = r24.getPageURL()
            java.lang.String r29 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r8, r3)
            if (r29 != 0) goto L13f
            r8 = r21
            goto L162
        L13f:
            r3 = r1
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            java.lang.String r8 = r24.getThumbUrl()
            java.lang.String r3 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r3, r8)
            r27 = r1
            com.lagradost.cloudstream3.MainAPI r27 = (com.lagradost.cloudstream3.MainAPI) r27
            com.lagradost.cloudstream3.TvType r30 = com.lagradost.cloudstream3.TvType.NSFW
            Xhamster.Xhamster$$ExternalSyntheticLambda0 r8 = new Xhamster.Xhamster$$ExternalSyntheticLambda0
            r8.<init>(r3)
            r33 = 8
            r34 = 0
            r31 = 0
            r32 = r8
            com.lagradost.cloudstream3.MovieSearchResponse r8 = com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse$default(r27, r28, r29, r30, r31, r32, r33, r34)
        L162:
            if (r8 == 0) goto L168
            r3 = 0
            r11.add(r8)
        L168:
            r3 = r37
            goto L110
        L16b:
            r3 = r11
            java.util.List r3 = (java.util.List) r3
            goto L174
        L172:
            r3 = r21
        L174:
            r5 = r3
            java.lang.String r3 = r1.getName()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r7)
            if (r5 == 0) goto L189
            int r9 = r5.size()
            goto L18a
        L189:
            r9 = 0
        L18a:
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = " items from JSON."
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r3, r8)
            goto L1a5
        L19c:
            java.lang.String r3 = r1.getName()
            java.lang.String r8 = "Search: Failed to parse initialData JSON."
            android.util.Log.w(r3, r8)
        L1a5:
            r3 = r5
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L1b3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L1b1
            goto L1b3
        L1b1:
            r3 = 0
            goto L1b4
        L1b3:
            r3 = 1
        L1b4:
            if (r3 == 0) goto L226
            java.lang.String r3 = r1.getName()
            java.lang.String r8 = "Search: JSON results list is null or empty. Falling back to HTML parsing."
            android.util.Log.w(r3, r8)
            java.lang.String r3 = "div.mobile-video-thumb"
            org.jsoup.select.Elements r3 = r0.select(r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r8 = 0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Collection r9 = (java.util.Collection) r9
            r10 = r3
            r11 = 0
            r12 = r10
            r13 = 0
            java.util.Iterator r14 = r12.iterator()
        L1d7:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L1fb
            java.lang.Object r15 = r14.next()
            r16 = r15
            r17 = 0
            r19 = r0
            r0 = r16
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            r20 = 0
            com.lagradost.cloudstream3.SearchResponse r0 = r1.parseVideoItem(r0)
            if (r0 == 0) goto L1f8
            r20 = 0
            r9.add(r0)
        L1f8:
            r0 = r19
            goto L1d7
        L1fb:
            r19 = r0
            r0 = r9
            java.util.List r0 = (java.util.List) r0
            r5 = r0
            java.lang.String r0 = r1.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r7)
            int r7 = r5.size()
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r7 = " items from HTML fallback."
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r0, r3)
            goto L228
        L226:
            r19 = r0
        L228:
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L236
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L234
            goto L236
        L234:
            r7 = 0
            goto L237
        L236:
            r7 = 1
        L237:
            java.lang.String r0 = "'."
            if (r7 != 0) goto L26a
            java.lang.String r3 = r1.getName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Search: Found "
            java.lang.StringBuilder r7 = r7.append(r8)
            int r8 = r5.size()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = " results for query '"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.StringBuilder r0 = r7.append(r0)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r3, r0)
            r21 = r5
            goto L289
        L26a:
            java.lang.String r3 = r1.getName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Search: No results found for query '"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.StringBuilder r0 = r7.append(r0)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r3, r0)
        L289:
            return r21
        L28a:
            r0 = move-exception
            goto L295
        L28c:
            r0 = move-exception
            r6 = r5
            goto L295
        L28f:
            r0 = move-exception
            r18 = r4
            r23 = r5
            r5 = r6
        L295:
            java.lang.String r3 = r1.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to fetch search page: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r0.getMessage()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r3, r4)
            r0.printStackTrace()
            return r21
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
