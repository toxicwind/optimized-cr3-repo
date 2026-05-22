package com.GayStream;

/* JADX INFO: compiled from: GayStream.kt */
/* JADX INFO: loaded from: /tmp/tmp.mVtwsAxdAD/classes.dex */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010&\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0096@\u00a2\u0006\u0002\u0010-J\f\u0010.\u001a\u00020/*\u000200H\u0002J\f\u00101\u001a\u00020/*\u000200H\u0002J\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020/0$2\u0006\u00103\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u00104J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u00104JF\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u000e2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020>0<H\u0096@\u00a2\u0006\u0002\u0010AR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010'\u00a8\u0006B"}, d2 = {"Lcom/GayStream/GayStream;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "lang", "getLang", "setLang", "hasQuickSearch", "getHasQuickSearch", "hasChromecastSupport", "getHasChromecastSupport", "hasDownloadSupport", "getHasDownloadSupport", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lorg/jsoup/nodes/Element;", "toRecommendResult", "search", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GayStream"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nGayStream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GayStream.kt\ncom/GayStream/GayStream\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1642#2,10:174\n1915#2:184\n1916#2:186\n1652#2:187\n1642#2,10:188\n1915#2:198\n1916#2:200\n1652#2:201\n1642#2,10:202\n1915#2:212\n1916#2:214\n1652#2:215\n1642#2,10:216\n1915#2:226\n1916#2:229\n1652#2:230\n1642#2,10:231\n1915#2:241\n1916#2:243\n1652#2:244\n1#3:185\n1#3:199\n1#3:213\n1#3:227\n1#3:228\n1#3:242\n*S KotlinDebug\n*F\n+ 1 GayStream.kt\ncom/GayStream/GayStream\n*L\n63#1:174,10\n63#1:184\n63#1:186\n63#1:187\n105#1:188,10\n105#1:198\n105#1:200\n105#1:201\n121#1:202,10\n121#1:212\n121#1:214\n121#1:215\n142#1:216,10\n142#1:226\n142#1:229\n142#1:230\n143#1:231,10\n143#1:241\n143#1:243\n143#1:244\n63#1:185\n105#1:199\n121#1:213\n142#1:228\n143#1:242\n*E\n"})
public final class GayStream extends com.lagradost.cloudstream3.MainAPI {
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

    /* JADX INFO: renamed from: com.GayStream.GayStream$getMainPage$1 */
    /* JADX INFO: compiled from: GayStream.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.GayStream.GayStream", f = "GayStream.kt", i = {0, 0, 0}, l = {60}, m = "getMainPage", n = {"request", "pageUrl", "page"}, nl = {63}, s = {"L$0", "L$1", "I$0"}, v = 2)
    static final class C00031 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.GayStream.GayStream this$0;

        C00031(com.GayStream.GayStream r1, kotlin.coroutines.Continuation<? super com.GayStream.GayStream.C00031> r2) {
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
                com.GayStream.GayStream r0 = r4.this$0
                r1 = 0
                r2 = r4
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r3 = 0
                java.lang.Object r0 = r0.getMainPage(r3, r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: com.GayStream.GayStream$load$1 */
    /* JADX INFO: compiled from: GayStream.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.GayStream.GayStream", f = "GayStream.kt", i = {0, 1, 1, 1, 1, 1, 1}, l = {116, 123}, m = "load", n = {"url", "url", "document", "title", "poster", "description", "recommendations"}, nl = {118, -1}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
    static final class C00041 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.GayStream.GayStream this$0;

        C00041(com.GayStream.GayStream r1, kotlin.coroutines.Continuation<? super com.GayStream.GayStream.C00041> r2) {
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
                com.GayStream.GayStream r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.load(r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: com.GayStream.GayStream$load$2 */
    /* JADX INFO: compiled from: GayStream.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.GayStream.GayStream$load$2", f = "GayStream.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00052 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.lagradost.cloudstream3.MovieLoadResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String $description;
        final /* synthetic */ java.lang.String $poster;
        final /* synthetic */ java.util.List<com.lagradost.cloudstream3.SearchResponse> $recommendations;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        C00052(java.lang.String r2, java.lang.String r3, java.util.List<? extends com.lagradost.cloudstream3.SearchResponse> r4, kotlin.coroutines.Continuation<? super com.GayStream.GayStream.C00052> r5) {
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
                com.GayStream.GayStream$load$2 r0 = new com.GayStream.GayStream$load$2
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
                com.GayStream.GayStream$load$2 r0 = (com.GayStream.GayStream.C00052) r0
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

    /* JADX INFO: renamed from: com.GayStream.GayStream$loadLinks$1 */
    /* JADX INFO: compiled from: GayStream.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.GayStream.GayStream", f = "GayStream.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {137, 160}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "isCasting", "data", "subtitleCallback", "callback", "document", "found", "videoUrls", "button", "isCasting"}, nl = {138, 169}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0"}, v = 2)
    static final class C00061 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        java.lang.Object L$6;
        boolean Z$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.GayStream.GayStream this$0;

        C00061(com.GayStream.GayStream r1, kotlin.coroutines.Continuation<? super com.GayStream.GayStream.C00061> r2) {
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
                com.GayStream.GayStream r1 = r7.this$0
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

    /* JADX INFO: renamed from: com.GayStream.GayStream$loadLinks$4 */
    /* JADX INFO: compiled from: GayStream.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "url", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.GayStream.GayStream$loadLinks$4", f = "GayStream.kt", i = {0}, l = {161}, m = "invokeSuspend", n = {"url"}, nl = {166}, s = {"L$0"}, v = 2)
    static final class C00074 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1<com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> $callback;
        final /* synthetic */ java.lang.String $data;
        final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef $found;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> $subtitleCallback;
        /* synthetic */ java.lang.Object L$0;
        int label;

        C00074(java.lang.String r2, kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r3, kotlin.jvm.internal.Ref.BooleanRef r4, kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r5, kotlin.coroutines.Continuation<? super com.GayStream.GayStream.C00074> r6) {
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
                com.GayStream.GayStream$loadLinks$4 r0 = new com.GayStream.GayStream$loadLinks$4
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
                com.GayStream.GayStream$loadLinks$4 r0 = (com.GayStream.GayStream.C00074) r0
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
                com.GayStream.GayStream$loadLinks$4$$ExternalSyntheticLambda0 r6 = new com.GayStream.GayStream$loadLinks$4$$ExternalSyntheticLambda0
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

    /* JADX INFO: renamed from: com.GayStream.GayStream$search$1 */
    /* JADX INFO: compiled from: GayStream.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.GayStream.GayStream", f = "GayStream.kt", i = {0, 0, 0}, l = {104}, m = "search", n = {"query", "searchResponse", "i"}, nl = {105}, s = {"L$0", "L$1", "I$0"}, v = 2)
    static final class C00081 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.GayStream.GayStream this$0;

        C00081(com.GayStream.GayStream r1, kotlin.coroutines.Continuation<? super com.GayStream.GayStream.C00081> r2) {
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
                com.GayStream.GayStream r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.search(r1, r2)
                return r0
        }
    }

    public GayStream() {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "https://gaystream.pw"
            r4.mainUrl = r0
            java.lang.String r0 = "GayStream"
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
            r1 = 27
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            java.lang.String r2 = ""
            java.lang.String r3 = "Newest"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "/?orderby=updated"
            java.lang.String r3 = "Updated"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            r1[r0] = r2
            java.lang.String r0 = "/video/category/4k"
            java.lang.String r2 = "4K"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 2
            r1[r2] = r0
            java.lang.String r0 = "/?orderby=likes"
            java.lang.String r2 = "Like"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 3
            r1[r2] = r0
            java.lang.String r0 = "/?orderby=latest"
            java.lang.String r2 = "Latest"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 4
            r1[r2] = r0
            java.lang.String r0 = "/?orderby=views"
            java.lang.String r2 = "Views"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 5
            r1[r2] = r0
            java.lang.String r0 = "/video/channel/onlyfans"
            java.lang.String r2 = "Onlyfans"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 6
            r1[r2] = r0
            java.lang.String r0 = "/performer/ashton-summers"
            java.lang.String r2 = "Ashton Summers"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 7
            r1[r2] = r0
            java.lang.String r0 = "/performer/bruno-galvez"
            java.lang.String r2 = "Bruno Galvez"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 8
            r1[r2] = r0
            java.lang.String r0 = "/performer/julio-pisco"
            java.lang.String r2 = "Julio Pisco"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 9
            r1[r2] = r0
            java.lang.String r0 = "/performer/damian-night"
            java.lang.String r2 = "Daminan Night"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 10
            r1[r2] = r0
            java.lang.String r0 = "/video/category/anal"
            java.lang.String r2 = "Anal"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 11
            r1[r2] = r0
            java.lang.String r0 = "/video/category/asian"
            java.lang.String r2 = "Asian"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 12
            r1[r2] = r0
            java.lang.String r0 = "/video/category/dp"
            java.lang.String r2 = "DP"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 13
            r1[r2] = r0
            java.lang.String r0 = "/video/category/group"
            java.lang.String r2 = "Group"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 14
            r1[r2] = r0
            java.lang.String r0 = "/video/category/homemade"
            java.lang.String r2 = "Homemade"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 15
            r1[r2] = r0
            java.lang.String r0 = "/video/category/hunk"
            java.lang.String r2 = "Hunk"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 16
            r1[r2] = r0
            java.lang.String r0 = "/video/category/interracial"
            java.lang.String r2 = "Interracial"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 17
            r1[r2] = r0
            java.lang.String r0 = "/video/category/latino"
            java.lang.String r2 = "Latino"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 18
            r1[r2] = r0
            java.lang.String r0 = "/video/category/mature"
            java.lang.String r2 = "Mature"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 19
            r1[r2] = r0
            java.lang.String r0 = "/video/category/muscle"
            java.lang.String r2 = "Muscle"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 20
            r1[r2] = r0
            java.lang.String r0 = "/video/category/promotion"
            java.lang.String r2 = "Promotion"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 21
            r1[r2] = r0
            java.lang.String r0 = "/video/category/threesome"
            java.lang.String r2 = "Threesome"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 22
            r1[r2] = r0
            java.lang.String r0 = "/video/category/uniforms"
            java.lang.String r2 = "Uniforms"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 23
            r1[r2] = r0
            java.lang.String r0 = "/video/channel/alphastudiogroup"
            java.lang.String r2 = "Alpha Studio Group"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 24
            r1[r2] = r0
            java.lang.String r0 = "/video/channel/betabetapi"
            java.lang.String r2 = "Beta Beta Pi"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 25
            r1[r2] = r0
            java.lang.String r0 = "/video/channel/caninolatino"
            java.lang.String r2 = "Canino Latino"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r2)
            r2 = 26
            r1[r2] = r0
            java.util.List r0 = com.lagradost.cloudstream3.MainAPIKt.mainPageOf(r1)
            r4.mainPage = r0
            return
    }

    private final com.lagradost.cloudstream3.SearchResponse toRecommendResult(org.jsoup.nodes.Element r10) {
            r9 = this;
            java.lang.String r0 = "h3.item-title"
            org.jsoup.select.Elements r0 = r10.select(r0)
            java.lang.String r2 = r0.text()
            r0 = r9
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            java.lang.String r1 = "a.item-wrap"
            org.jsoup.select.Elements r1 = r10.select(r1)
            java.lang.String r3 = "href"
            java.lang.String r1 = r1.attr(r3)
            java.lang.String r3 = com.lagradost.cloudstream3.MainAPIKt.fixUrl(r0, r1)
            r0 = r9
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            java.lang.String r1 = "img.item-img"
            org.jsoup.select.Elements r1 = r10.select(r1)
            java.lang.String r4 = "src"
            java.lang.String r1 = r1.attr(r4)
            java.lang.String r0 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r0, r1)
            r1 = r9
            com.lagradost.cloudstream3.MainAPI r1 = (com.lagradost.cloudstream3.MainAPI) r1
            com.lagradost.cloudstream3.TvType r4 = com.lagradost.cloudstream3.TvType.NSFW
            com.GayStream.GayStream$$ExternalSyntheticLambda0 r6 = new com.GayStream.GayStream$$ExternalSyntheticLambda0
            r6.<init>(r0)
            r7 = 8
            r8 = 0
            r5 = 0
            com.lagradost.cloudstream3.MovieSearchResponse r1 = com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse$default(r1, r2, r3, r4, r5, r6, r7, r8)
            com.lagradost.cloudstream3.SearchResponse r1 = (com.lagradost.cloudstream3.SearchResponse) r1
            return r1
    }

    static final kotlin.Unit toRecommendResult$lambda$0(java.lang.String r1, com.lagradost.cloudstream3.MovieSearchResponse r2) {
            r2.setPosterUrl(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private final com.lagradost.cloudstream3.SearchResponse toSearchResult(org.jsoup.nodes.Element r10) {
            r9 = this;
            java.lang.String r0 = "h3.item-title"
            org.jsoup.select.Elements r0 = r10.select(r0)
            java.lang.String r2 = r0.text()
            r0 = r9
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            java.lang.String r1 = "a.item-wrap"
            org.jsoup.select.Elements r1 = r10.select(r1)
            java.lang.String r3 = "href"
            java.lang.String r1 = r1.attr(r3)
            java.lang.String r3 = com.lagradost.cloudstream3.MainAPIKt.fixUrl(r0, r1)
            r0 = r9
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            java.lang.String r1 = "img.item-img"
            org.jsoup.select.Elements r1 = r10.select(r1)
            java.lang.String r4 = "src"
            java.lang.String r1 = r1.attr(r4)
            java.lang.String r0 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r0, r1)
            r1 = r9
            com.lagradost.cloudstream3.MainAPI r1 = (com.lagradost.cloudstream3.MainAPI) r1
            com.lagradost.cloudstream3.TvType r4 = com.lagradost.cloudstream3.TvType.NSFW
            com.GayStream.GayStream$$ExternalSyntheticLambda1 r6 = new com.GayStream.GayStream$$ExternalSyntheticLambda1
            r6.<init>(r0)
            r7 = 8
            r8 = 0
            r5 = 0
            com.lagradost.cloudstream3.MovieSearchResponse r1 = com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse$default(r1, r2, r3, r4, r5, r6, r7, r8)
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
    public java.lang.Object getMainPage(int r25, @org.jetbrains.annotations.NotNull com.lagradost.cloudstream3.MainPageRequest r26, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.HomePageResponse> r27) {
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r27
            boolean r3 = r2 instanceof com.GayStream.GayStream.C00031
            if (r3 == 0) goto L1a
            r3 = r2
            com.GayStream.GayStream$getMainPage$1 r3 = (com.GayStream.GayStream.C00031) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.GayStream.GayStream$getMainPage$1 r3 = new com.GayStream.GayStream$getMainPage$1
            r3.<init>(r0, r2)
        L1f:
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r3.label
            r7 = 1
            switch(r6) {
                case 0: goto L48;
                case 1: goto L35;
                default: goto L2b;
            }
        L2b:
            r18 = r3
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L35:
            int r1 = r3.I$0
            java.lang.Object r5 = r3.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r3.L$0
            com.lagradost.cloudstream3.MainPageRequest r6 = (com.lagradost.cloudstream3.MainPageRequest) r6
            kotlin.ResultKt.throwOnFailure(r4)
            r18 = r3
            r21 = r4
            goto Ld6
        L48:
            kotlin.ResultKt.throwOnFailure(r4)
            if (r1 != r7) goto L67
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r0.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = r26.getData()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            goto L8a
        L67:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r0.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = r26.getData()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = "/page/"
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
        L8a:
            r8 = r4
            com.lagradost.nicehttp.Requests r4 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r9 = r26
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
            r23 = r18
            r18 = r3
            r3 = r21
            r21 = r23
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            if (r4 != r3) goto Ld4
            return r3
        Ld4:
            r6 = r26
        Ld6:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r3 = r4.getDocument()
            java.lang.String r4 = "div.grid-wrap"
            org.jsoup.select.Elements r4 = r3.select(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r7 = 0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r8 = (java.util.Collection) r8
            r9 = r4
            r10 = 0
            r11 = r9
            r12 = 0
            java.util.Iterator r13 = r11.iterator()
        Lf4:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L121
            java.lang.Object r14 = r13.next()
            r15 = r14
            r16 = 0
            r25 = r1
            r1 = r15
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            r17 = 0
            java.lang.String r2 = "div.grid-item"
            org.jsoup.nodes.Element r2 = r1.selectFirst(r2)
            if (r2 == 0) goto L115
            com.lagradost.cloudstream3.SearchResponse r2 = r0.toSearchResult(r2)
            goto L116
        L115:
            r2 = 0
        L116:
            if (r2 == 0) goto L11c
            r1 = 0
            r8.add(r2)
        L11c:
            r1 = r25
            r2 = r27
            goto Lf4
        L121:
            r25 = r1
            r1 = r8
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "a.next.page-numbers"
            org.jsoup.nodes.Element r2 = r3.selectFirst(r2)
            r7 = 0
            if (r2 == 0) goto L134
            r2 = 1
            goto L135
        L134:
            r2 = 0
        L135:
            com.lagradost.cloudstream3.HomePageList r4 = new com.lagradost.cloudstream3.HomePageList
            java.lang.String r8 = r6.getName()
            r14 = 1
            r4.<init>(r8, r1, r14)
            if (r2 == 0) goto L144
            r7 = 1
        L144:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            com.lagradost.cloudstream3.HomePageResponse r4 = com.lagradost.cloudstream3.MainAPIKt.newHomePageResponse(r4, r7)
            return r4
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
            boolean r2 = r1 instanceof com.GayStream.GayStream.C00041
            if (r2 == 0) goto L18
            r2 = r1
            com.GayStream.GayStream$load$1 r2 = (com.GayStream.GayStream.C00041) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.GayStream.GayStream$load$1 r2 = new com.GayStream.GayStream$load$1
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
            java.lang.String r4 = "div.grid-item"
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
            com.GayStream.GayStream$load$2 r7 = new com.GayStream.GayStream$load$2
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
    public java.lang.Object loadLinks(@org.jetbrains.annotations.NotNull java.lang.String r26, boolean r27, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r28, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r29, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r30) {
            r25 = this;
            r0 = r30
            boolean r1 = r0 instanceof com.GayStream.GayStream.C00061
            if (r1 == 0) goto L18
            r1 = r0
            com.GayStream.GayStream$loadLinks$1 r1 = (com.GayStream.GayStream.C00061) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            r2 = r25
            goto L1f
        L18:
            com.GayStream.GayStream$loadLinks$1 r1 = new com.GayStream.GayStream$loadLinks$1
            r2 = r25
            r1.<init>(r2, r0)
        L1f:
            java.lang.Object r3 = r1.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r1.label
            r6 = 1
            switch(r5) {
                case 0: goto L78;
                case 1: goto L5b;
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
            java.lang.Object r5 = r1.L$6
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.L$5
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r7 = r1.L$4
            kotlin.jvm.internal.Ref$BooleanRef r7 = (kotlin.jvm.internal.Ref.BooleanRef) r7
            java.lang.Object r8 = r1.L$3
            org.jsoup.nodes.Document r8 = (org.jsoup.nodes.Document) r8
            java.lang.Object r9 = r1.L$2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r1.L$1
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r11 = r1.L$0
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r3)
            r20 = r3
            r3 = r4
            r4 = r1
            goto L247
        L5b:
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
            goto Lc9
        L78:
            kotlin.ResultKt.throwOnFailure(r3)
            r5 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r7 = r26
            r1.L$0 = r7
            r8 = r28
            r1.L$1 = r8
            r9 = r29
            r1.L$2 = r9
            r10 = r27
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
            r4 = r26
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r4 = r17
            if (r3 != r1) goto Lc0
            return r1
        Lc0:
            r6 = r26
            r7 = r28
            r9 = r29
            r5 = r3
            r3 = r27
        Lc9:
            com.lagradost.nicehttp.NiceResponse r5 = (com.lagradost.nicehttp.NiceResponse) r5
            org.jsoup.nodes.Document r11 = r5.getDocument()
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
            r8.<init>()
            java.lang.String r5 = "div.tabs-wrap button[onclick]"
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
        Lee:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L13e
            java.lang.Object r18 = r17.next()
            r19 = r18
            r21 = 0
            r0 = r19
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            r22 = 0
            java.lang.String r2 = "onclick"
            java.lang.String r2 = r0.attr(r2)
            r28 = r2
            r23 = 0
            r24 = r28
            java.lang.CharSequence r24 = (java.lang.CharSequence) r24
            boolean r24 = kotlin.text.StringsKt.isBlank(r24)
            if (r24 != 0) goto L126
            r29 = r0
            java.lang.String r0 = "#"
            r24 = r2
            r2 = r28
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 != 0) goto L12c
            r0 = 1
            goto L12d
        L126:
            r29 = r0
            r24 = r2
            r2 = r28
        L12c:
            r0 = 0
        L12d:
            if (r0 == 0) goto L132
            r0 = r24
            goto L133
        L132:
            r0 = 0
        L133:
            if (r0 == 0) goto L139
            r2 = 0
            r12.add(r0)
        L139:
            r2 = r25
            r0 = r30
            goto Lee
        L13e:
            r0 = r12
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            r10 = r0
            r12 = 0
            r13 = r10
            r14 = 0
            java.util.Iterator r15 = r13.iterator()
        L157:
            boolean r16 = r15.hasNext()
            r28 = r10
            if (r16 == 0) goto L1aa
            java.lang.Object r16 = r15.next()
            r17 = r16
            r18 = 0
            r19 = r17
            java.lang.String r19 = (java.lang.String) r19
            r21 = 0
            kotlin.text.Regex r10 = new kotlin.text.Regex
            r22 = r0
            java.lang.String r0 = "src=(?:&quot;|\"|')(.*?)(?:&quot;|\"|')"
            r10.<init>(r0)
            r0 = r19
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r23 = r2
            r26 = r6
            r27 = r7
            r2 = 2
            r6 = 0
            r7 = 0
            kotlin.text.MatchResult r0 = kotlin.text.Regex.find$default(r10, r0, r6, r2, r7)
            if (r0 == 0) goto L197
            java.util.List r0 = r0.getGroupValues()
            if (r0 == 0) goto L197
            r10 = 1
            java.lang.Object r0 = r0.get(r10)
            java.lang.String r0 = (java.lang.String) r0
            goto L199
        L197:
            r10 = 1
            r0 = r7
        L199:
            if (r0 == 0) goto L19f
            r2 = 0
            r5.add(r0)
        L19f:
            r6 = r26
            r7 = r27
            r10 = r28
            r0 = r22
            r2 = r23
            goto L157
        L1aa:
            r22 = r0
            r23 = r2
            r26 = r6
            r27 = r7
            r2 = 2
            r7 = 0
            r0 = r5
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = kotlin.collections.CollectionsKt.toMutableSet(r0)
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L1e1
            java.lang.String r5 = "iframe#ifr"
            org.jsoup.nodes.Element r5 = r11.selectFirst(r5)
            if (r5 == 0) goto L1d5
            java.lang.String r6 = "src"
            java.lang.String r5 = r5.attr(r6)
            goto L1d6
        L1d5:
            r5 = r7
        L1d6:
            if (r5 == 0) goto L1e1
            r6 = r5
            r10 = 0
            boolean r6 = r0.add(r6)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
        L1e1:
            java.lang.String r5 = "a.video-download[href]"
            org.jsoup.nodes.Element r5 = r11.selectFirst(r5)
            if (r5 == 0) goto L1f0
            java.lang.String r6 = "href"
            java.lang.String r5 = r5.attr(r6)
            goto L1f1
        L1f0:
            r5 = r7
        L1f1:
            r12 = r5
            if (r12 == 0) goto L1fd
            r5 = r12
            r6 = 0
            boolean r5 = r0.add(r5)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
        L1fd:
            r5 = r0
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r13 = kotlin.collections.CollectionsKt.toList(r5)
            com.GayStream.GayStream$loadLinks$4 r5 = new com.GayStream.GayStream$loadLinks$4
            r10 = 0
            r6 = r26
            r7 = r27
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
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r4.L$5 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r4.L$6 = r10
            r4.Z$0 = r3
            r4.label = r2
            java.lang.Object r2 = com.lagradost.cloudstream3.ParCollectionsKt.amap(r13, r5, r4)
            if (r2 != r1) goto L241
            return r1
        L241:
            r10 = r7
            r7 = r8
            r8 = r11
            r5 = r12
            r11 = r6
            r6 = r0
        L247:
            boolean r0 = r7.element
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object search(@org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.SearchResponse>> r28) {
            r26 = this;
            r0 = r28
            boolean r1 = r0 instanceof com.GayStream.GayStream.C00081
            if (r1 == 0) goto L18
            r1 = r0
            com.GayStream.GayStream$search$1 r1 = (com.GayStream.GayStream.C00081) r1
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
            com.GayStream.GayStream$search$1 r1 = new com.GayStream.GayStream$search$1
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
            goto Ld9
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
            if (r5 >= r7) goto L140
            com.lagradost.nicehttp.Requests r7 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r21.getMainUrl()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = "/page/"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r5)
            java.lang.String r9 = "?s="
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r9 = "&search="
            java.lang.StringBuilder r8 = r8.append(r9)
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
            if (r3 != r0) goto Ld0
            return r0
        Ld0:
            r4 = r0
            r7 = r21
            r6 = r22
            r0 = r23
            r5 = r24
        Ld9:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r3 = r3.getDocument()
            java.lang.String r8 = "div.grid-item"
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
        Lf7:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L11b
            java.lang.Object r16 = r15.next()
            r18 = r16
            r19 = 0
            r27 = r0
            r0 = r18
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            r21 = 0
            com.lagradost.cloudstream3.SearchResponse r0 = r7.toSearchResult(r0)
            if (r0 == 0) goto L118
            r21 = 0
            r10.add(r0)
        L118:
            r0 = r27
            goto Lf7
        L11b:
            r27 = r0
            r0 = r10
            java.util.List r0 = (java.util.List) r0
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L139
            r8 = r0
            java.util.Collection r8 = (java.util.Collection) r8
            r6.addAll(r8)
            int r5 = r5 + 1
            r21 = r7
            r3 = r17
            r0 = r27
            goto L60
        L139:
            r0 = r27
            r21 = r7
            r3 = r17
            goto L148
        L140:
            r23 = r0
            r17 = r3
            r24 = r5
            r22 = r6
        L148:
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
