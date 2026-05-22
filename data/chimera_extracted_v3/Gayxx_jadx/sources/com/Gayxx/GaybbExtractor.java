package com.Gayxx;

/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /tmp/tmp.FInTvDqO98/classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/Gayxx/GaybbExtractor;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "mainUrl", "getMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "abyssExtractor", "Lcom/Gayxx/AbyssExtractor;", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Gayxx"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GaybbExtractor extends com.lagradost.cloudstream3.utils.ExtractorApi {

    @org.jetbrains.annotations.NotNull
    private final com.Gayxx.AbyssExtractor abyssExtractor;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String mainUrl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;
    private final boolean requiresReferer;

    /* JADX INFO: renamed from: com.Gayxx.GaybbExtractor$getUrl$1 */
    /* JADX INFO: compiled from: Extractor.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Gayxx.GaybbExtractor", f = "Extractor.kt", i = {0, 0, 1, 1, 1, 1}, l = {444, 448}, m = "getUrl", n = {"url", "referer", "url", "referer", "response", "iframeUrl"}, nl = {445, -1}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3"}, v = 2)
    static final class C00041 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.Gayxx.GaybbExtractor this$0;

        C00041(com.Gayxx.GaybbExtractor r1, kotlin.coroutines.Continuation<? super com.Gayxx.GaybbExtractor.C00041> r2) {
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
                com.Gayxx.GaybbExtractor r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.getUrl(r1, r1, r2)
                return r0
        }
    }

    public GaybbExtractor() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Gaybb"
            r1.name = r0
            java.lang.String r0 = "https://gaybb.net"
            r1.mainUrl = r0
            r0 = 1
            r1.requiresReferer = r0
            com.Gayxx.AbyssExtractor r0 = new com.Gayxx.AbyssExtractor
            r0.<init>()
            r1.abyssExtractor = r0
            return
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

    public boolean getRequiresReferer() {
            r1 = this;
            boolean r0 = r1.requiresReferer
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object getUrl(@org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.Nullable java.lang.String r22, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.utils.ExtractorLink>> r23) {
            r20 = this;
            r0 = r20
            r1 = r23
            boolean r2 = r1 instanceof com.Gayxx.GaybbExtractor.C00041
            if (r2 == 0) goto L18
            r2 = r1
            com.Gayxx.GaybbExtractor$getUrl$1 r2 = (com.Gayxx.GaybbExtractor.C00041) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Gayxx.GaybbExtractor$getUrl$1 r2 = new com.Gayxx.GaybbExtractor$getUrl$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r3 = r2.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.label
            switch(r5) {
                case 0: goto L59;
                case 1: goto L4a;
                case 2: goto L31;
                default: goto L28;
            }
        L28:
            r4 = r2
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L31:
            java.lang.Object r4 = r2.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.L$2
            com.lagradost.nicehttp.NiceResponse r5 = (com.lagradost.nicehttp.NiceResponse) r5
            java.lang.Object r6 = r2.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r3)
            r1 = r7
            r7 = r4
            r4 = r2
            r2 = r3
            goto Le8
        L4a:
            java.lang.Object r5 = r2.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.L$0
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r3)
            r1 = r4
            r4 = r2
            r2 = r3
            goto La5
        L59:
            kotlin.ResultKt.throwOnFailure(r3)
            r5 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.String r6 = r0.getMainUrl()
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r21)
            r2.L$0 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r2.L$1 = r7
            r7 = 1
            r2.label = r7
            r7 = r5
            r5 = 0
            r8 = r7
            r7 = 0
            r9 = r8
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
            r16 = r15
            r15 = 0
            r17 = r16
            r16 = 0
            r18 = 4090(0xffa, float:5.731E-42)
            r19 = 0
            r1 = r17
            r17 = r2
            r2 = r1
            r1 = r4
            r4 = r21
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r4 = r17
            if (r3 != r1) goto La1
            return r1
        La1:
            r6 = r21
            r5 = r22
        La5:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r7 = r3.getDocument()
            java.lang.String r8 = "iframe[src]"
            org.jsoup.nodes.Element r7 = r7.selectFirst(r8)
            if (r7 == 0) goto Le9
            java.lang.String r8 = "src"
            java.lang.String r7 = r7.attr(r8)
            if (r7 != 0) goto Lbc
            goto Le9
        Lbc:
            com.Gayxx.AbyssExtractor r8 = r0.abyssExtractor
            java.lang.String r9 = r0.getMainUrl()
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r4.L$0 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r4.L$1 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)
            r4.L$2 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r4.L$3 = r10
            r10 = 2
            r4.label = r10
            java.lang.Object r8 = r8.getUrl(r7, r9, r4)
            if (r8 != r1) goto Le4
            return r1
        Le4:
            r1 = r6
            r6 = r5
            r5 = r3
            r3 = r8
        Le8:
            return r3
        Le9:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            return r1
    }
}
