package com.GayKinkyPorn;

/* JADX INFO: compiled from: Extractors.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump_unblinded/GayKinkyPorn/classes.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u0016H\u0096@\u00a2\u0006\u0002\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/GayKinkyPorn/FilemoonV2;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "url", "referer", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GayKinkyPorn"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nExtractors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extractors.kt\ncom/GayKinkyPorn/FilemoonV2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,283:1\n1915#2,2:284\n*S KotlinDebug\n*F\n+ 1 Extractors.kt\ncom/GayKinkyPorn/FilemoonV2\n*L\n229#1:284,2\n*E\n"})
public class FilemoonV2 extends com.lagradost.cloudstream3.utils.ExtractorApi {

    @org.jetbrains.annotations.NotNull
    private java.lang.String mainUrl;

    @org.jetbrains.annotations.NotNull
    private java.lang.String name;
    private final boolean requiresReferer;

    /* JADX INFO: renamed from: com.GayKinkyPorn.FilemoonV2$getUrl$1 */
    /* JADX INFO: compiled from: Extractors.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.GayKinkyPorn.FilemoonV2", f = "Extractors.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, l = {210, 224, 238, 250, 265, 272}, m = "getUrl$suspendImpl", n = {"$this", "url", "referer", "subtitleCallback", "callback", "defaultHeaders", "$this", "url", "referer", "subtitleCallback", "callback", "defaultHeaders", "initialResponse", "iframeSrcUrl", "fallbackScriptData", "unpackedScript", "videoUrl", "$this", "url", "referer", "subtitleCallback", "callback", "defaultHeaders", "initialResponse", "iframeSrcUrl", "iframeHeaders", "$this", "url", "referer", "subtitleCallback", "callback", "defaultHeaders", "initialResponse", "iframeSrcUrl", "iframeHeaders", "iframeResponse", "iframeScriptData", "unpackedScript", "videoUrl", "$this", "url", "referer", "subtitleCallback", "callback", "defaultHeaders", "initialResponse", "iframeSrcUrl", "iframeHeaders", "iframeResponse", "iframeScriptData", "unpackedScript", "videoUrl", "resolver", "$this", "url", "referer", "subtitleCallback", "callback", "defaultHeaders", "initialResponse", "iframeSrcUrl", "iframeHeaders", "iframeResponse", "iframeScriptData", "unpackedScript", "videoUrl", "resolver", "interceptedUrl"}, nl = {211, 229, 242, 282, 269, 282}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14"}, v = 2)
    static final class C00021 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$10;
        java.lang.Object L$11;
        java.lang.Object L$12;
        java.lang.Object L$13;
        java.lang.Object L$14;
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
        final /* synthetic */ com.GayKinkyPorn.FilemoonV2 this$0;

        C00021(com.GayKinkyPorn.FilemoonV2 r1, kotlin.coroutines.Continuation<? super com.GayKinkyPorn.FilemoonV2.C00021> r2) {
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
                com.GayKinkyPorn.FilemoonV2 r1 = r7.this$0
                r5 = 0
                r6 = r7
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r2 = 0
                r3 = 0
                r4 = 0
                java.lang.Object r0 = com.GayKinkyPorn.FilemoonV2.getUrl$suspendImpl(r1, r2, r3, r4, r5, r6)
                return r0
        }
    }

    public FilemoonV2() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Filemoon"
            r1.name = r0
            java.lang.String r0 = "https://filemoon.to"
            r1.mainUrl = r0
            r0 = 1
            r1.requiresReferer = r0
            return
    }

    static /* synthetic */ java.lang.Object getUrl$suspendImpl(com.GayKinkyPorn.FilemoonV2 r46, java.lang.String r47, java.lang.String r48, kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r49, kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r50, kotlin.coroutines.Continuation<? super kotlin.Unit> r51) {
            r0 = r46
            r1 = r51
            boolean r2 = r1 instanceof com.GayKinkyPorn.FilemoonV2.C00021
            if (r2 == 0) goto L18
            r2 = r1
            com.GayKinkyPorn.FilemoonV2$getUrl$1 r2 = (com.GayKinkyPorn.FilemoonV2.C00021) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.GayKinkyPorn.FilemoonV2$getUrl$1 r2 = new com.GayKinkyPorn.FilemoonV2$getUrl$1
            r2.<init>(r0, r1)
        L1d:
            r10 = r2
            java.lang.Object r2 = r10.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r10.label
            java.lang.String r5 = "sources:\\[\\{file:\"(.*?)\""
            java.lang.String r6 = "FilemoonV2"
            java.lang.String r20 = ""
            java.lang.String r7 = "script:containsData(function(p,a,c,k,e,d))"
            r9 = 3
            java.lang.String r11 = "iframe"
            r12 = 5
            r16 = r6
            switch(r4) {
                case 0: goto L1e7;
                case 1: goto L1ae;
                case 2: goto L176;
                case 3: goto L12c;
                case 4: goto Lf0;
                case 5: goto L8b;
                case 6: goto L3f;
                default: goto L37;
            }
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3f:
            java.lang.Object r3 = r10.L$14
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r10.L$13
            com.lagradost.cloudstream3.network.WebViewResolver r4 = (com.lagradost.cloudstream3.network.WebViewResolver) r4
            java.lang.Object r5 = r10.L$12
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.L$11
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r10.L$10
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r10.L$9
            com.lagradost.nicehttp.NiceResponse r8 = (com.lagradost.nicehttp.NiceResponse) r8
            java.lang.Object r9 = r10.L$8
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r11 = r10.L$7
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r10.L$6
            com.lagradost.nicehttp.NiceResponse r12 = (com.lagradost.nicehttp.NiceResponse) r12
            java.lang.Object r13 = r10.L$5
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r14 = r10.L$4
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            java.lang.Object r15 = r10.L$3
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15
            java.lang.Object r1 = r10.L$2
            java.lang.String r1 = (java.lang.String) r1
            r48 = r1
            java.lang.Object r1 = r10.L$1
            java.lang.String r1 = (java.lang.String) r1
            r47 = r1
            java.lang.Object r1 = r10.L$0
            r0 = r1
            com.GayKinkyPorn.FilemoonV2 r0 = (com.GayKinkyPorn.FilemoonV2) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r24 = r47
            r1 = r48
            r21 = r2
            goto L66e
        L8b:
            java.lang.Object r1 = r10.L$13
            com.lagradost.cloudstream3.network.WebViewResolver r1 = (com.lagradost.cloudstream3.network.WebViewResolver) r1
            java.lang.Object r4 = r10.L$12
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r10.L$11
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.L$10
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r10.L$9
            com.lagradost.nicehttp.NiceResponse r7 = (com.lagradost.nicehttp.NiceResponse) r7
            java.lang.Object r8 = r10.L$8
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r9 = r10.L$7
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r11 = r10.L$6
            com.lagradost.nicehttp.NiceResponse r11 = (com.lagradost.nicehttp.NiceResponse) r11
            java.lang.Object r12 = r10.L$5
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r13 = r10.L$4
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            r17 = 0
            java.lang.Object r14 = r10.L$3
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            r18 = 1
            java.lang.Object r15 = r10.L$2
            java.lang.String r15 = (java.lang.String) r15
            r19 = r1
            java.lang.Object r1 = r10.L$1
            java.lang.String r1 = (java.lang.String) r1
            r47 = r1
            java.lang.Object r1 = r10.L$0
            r0 = r1
            com.GayKinkyPorn.FilemoonV2 r0 = (com.GayKinkyPorn.FilemoonV2) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r24 = r47
            r29 = r0
            r21 = r2
            r0 = r3
            r23 = r4
            r20 = r5
            r28 = r7
            r22 = r8
            r26 = r11
            r8 = r12
            r1 = r15
            r34 = r16
            r30 = 0
            r33 = 1
            r3 = r21
            r2 = r6
            r15 = r14
            r14 = r13
            r13 = r9
            goto L5d2
        Lf0:
            java.lang.Object r1 = r10.L$12
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r10.L$11
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r10.L$10
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r10.L$9
            com.lagradost.nicehttp.NiceResponse r5 = (com.lagradost.nicehttp.NiceResponse) r5
            java.lang.Object r6 = r10.L$8
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r7 = r10.L$7
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r10.L$6
            com.lagradost.nicehttp.NiceResponse r8 = (com.lagradost.nicehttp.NiceResponse) r8
            java.lang.Object r9 = r10.L$5
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r11 = r10.L$4
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            java.lang.Object r12 = r10.L$3
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            java.lang.Object r13 = r10.L$2
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r10.L$1
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r10.L$0
            r0 = r15
            com.GayKinkyPorn.FilemoonV2 r0 = (com.GayKinkyPorn.FilemoonV2) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r21 = r2
            goto L517
        L12c:
            r17 = 0
            r18 = 1
            java.lang.Object r1 = r10.L$8
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r4 = r10.L$7
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r9 = r10.L$6
            com.lagradost.nicehttp.NiceResponse r9 = (com.lagradost.nicehttp.NiceResponse) r9
            java.lang.Object r11 = r10.L$5
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r14 = r10.L$4
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            java.lang.Object r15 = r10.L$3
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15
            java.lang.Object r6 = r10.L$2
            java.lang.String r6 = (java.lang.String) r6
            r21 = 4
            java.lang.Object r8 = r10.L$1
            java.lang.String r8 = (java.lang.String) r8
            r22 = 2
            java.lang.Object r13 = r10.L$0
            r0 = r13
            com.GayKinkyPorn.FilemoonV2 r0 = (com.GayKinkyPorn.FilemoonV2) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r13 = r0
            r22 = r1
            r21 = r2
            r0 = r3
            r1 = r5
            r31 = r6
            r24 = r8
            r26 = r9
            r8 = r11
            r27 = r14
            r25 = r15
            r34 = r16
            r3 = r21
            r2 = r7
            r14 = r4
            goto L431
        L176:
            java.lang.Object r1 = r10.L$10
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r10.L$9
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r10.L$8
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r10.L$7
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.L$6
            com.lagradost.nicehttp.NiceResponse r6 = (com.lagradost.nicehttp.NiceResponse) r6
            java.lang.Object r7 = r10.L$5
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r8 = r10.L$4
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r9 = r10.L$3
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r11 = r10.L$2
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r10.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r10.L$0
            r0 = r13
            com.GayKinkyPorn.FilemoonV2 r0 = (com.GayKinkyPorn.FilemoonV2) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r21 = r2
            r16 = r3
            r3 = r21
            goto L385
        L1ae:
            r17 = 0
            r18 = 1
            r21 = 4
            r22 = 2
            java.lang.Object r1 = r10.L$5
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r4 = r10.L$4
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r6 = r10.L$3
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            java.lang.Object r8 = r10.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r13 = r10.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r10.L$0
            r0 = r14
            com.GayKinkyPorn.FilemoonV2 r0 = (com.GayKinkyPorn.FilemoonV2) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r21 = r2
            r15 = r4
            r22 = r5
            r25 = r6
            r14 = r8
            r24 = r13
            r28 = r16
            r13 = r0
            r8 = r1
            r0 = r3
            r2 = r7
            r1 = r11
            r3 = r21
            goto L291
        L1e7:
            r17 = 0
            r18 = 1
            r21 = 4
            r22 = 2
            kotlin.ResultKt.throwOnFailure(r2)
            kotlin.Pair[] r1 = new kotlin.Pair[r12]
            java.lang.String r4 = "Referer"
            r6 = r47
            kotlin.Pair r4 = kotlin.TuplesKt.to(r4, r6)
            r1[r17] = r4
            java.lang.String r4 = "Sec-Fetch-Dest"
            kotlin.Pair r4 = kotlin.TuplesKt.to(r4, r11)
            r1[r18] = r4
            java.lang.String r4 = "Sec-Fetch-Mode"
            java.lang.String r8 = "navigate"
            kotlin.Pair r4 = kotlin.TuplesKt.to(r4, r8)
            r1[r22] = r4
            java.lang.String r4 = "Sec-Fetch-Site"
            java.lang.String r8 = "cross-site"
            kotlin.Pair r4 = kotlin.TuplesKt.to(r4, r8)
            r1[r9] = r4
            java.lang.String r4 = "User-Agent"
            java.lang.String r8 = "Mozilla/5.0 (X11; Linux x86_64; rv:137.0) Gecko/20100101 Firefox/137.0"
            kotlin.Pair r4 = kotlin.TuplesKt.to(r4, r8)
            r1[r21] = r4
            java.util.Map r1 = kotlin.collections.MapsKt.mapOf(r1)
            r4 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r10.L$0 = r0
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r10.L$1 = r8
            r8 = r48
            r10.L$2 = r8
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r49)
            r10.L$3 = r13
            r13 = r50
            r10.L$4 = r13
            r10.L$5 = r1
            r14 = 1
            r10.label = r14
            r6 = 0
            r15 = r7
            r7 = 0
            r8 = 0
            r18 = 3
            r9 = 0
            r17 = r10
            r23 = 0
            r10 = 0
            r24 = r11
            r11 = 0
            r25 = 5
            r12 = 0
            r26 = 1
            r14 = 0
            r27 = r15
            r15 = 0
            r28 = r16
            r16 = 0
            r29 = 3
            r18 = 4092(0xffc, float:5.734E-42)
            r30 = 0
            r19 = 0
            r21 = r2
            r0 = r4
            r22 = r5
            r2 = r27
            r4 = r47
            r5 = r1
            r1 = r24
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r10 = r17
            if (r3 != r0) goto L286
            return r0
        L286:
            r13 = r46
            r24 = r47
            r14 = r48
            r25 = r49
            r15 = r50
            r8 = r5
        L291:
            r26 = r3
            com.lagradost.nicehttp.NiceResponse r26 = (com.lagradost.nicehttp.NiceResponse) r26
            org.jsoup.nodes.Document r3 = r26.getDocument()
            org.jsoup.nodes.Element r1 = r3.selectFirst(r1)
            if (r1 == 0) goto L2a7
            java.lang.String r3 = "src"
            java.lang.String r6 = r1.attr(r3)
            r4 = r6
            goto L2a8
        L2a7:
            r4 = 0
        L2a8:
            r1 = r4
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L2b7
            int r3 = r3.length()
            if (r3 != 0) goto L2b5
            goto L2b7
        L2b5:
            r3 = 0
            goto L2b8
        L2b7:
            r3 = 1
        L2b8:
            if (r3 == 0) goto L3b8
        L2bb:
            org.jsoup.nodes.Document r3 = r26.getDocument()
            org.jsoup.nodes.Element r2 = r3.selectFirst(r2)
            if (r2 == 0) goto L2cb
        L2c6:
            java.lang.String r6 = r2.data()
            goto L2cc
        L2cb:
            r6 = 0
        L2cc:
            if (r6 != 0) goto L2cf
            goto L2d1
        L2cf:
            r20 = r6
        L2d1:
            r2 = r20
            com.lagradost.cloudstream3.utils.JsUnpacker r3 = new com.lagradost.cloudstream3.utils.JsUnpacker
            r3.<init>(r2)
            java.lang.String r16 = r3.unpack()
            if (r16 == 0) goto L307
            r3 = r16
            r4 = 0
            kotlin.text.Regex r5 = new kotlin.text.Regex
            r6 = r22
            r5.<init>(r6)
            r6 = r3
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7 = 2
            r9 = 0
            r11 = 0
            kotlin.text.MatchResult r5 = kotlin.text.Regex.find$default(r5, r6, r9, r7, r11)
            if (r5 == 0) goto L303
            java.util.List r5 = r5.getGroupValues()
            if (r5 == 0) goto L303
            r9 = 1
            java.lang.Object r5 = r5.get(r9)
            java.lang.String r5 = (java.lang.String) r5
            r6 = r5
            goto L305
        L303:
            r9 = 1
            r6 = 0
        L305:
            r5 = r6
            goto L30a
        L307:
            r7 = 2
            r9 = 1
            r5 = 0
        L30a:
            r3 = r5
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L319
            int r3 = r3.length()
            if (r3 != 0) goto L316
            goto L319
        L316:
            r23 = 0
            goto L31b
        L319:
            r23 = 1
        L31b:
            if (r23 != 0) goto L3aa
            com.lagradost.cloudstream3.utils.M3u8Helper$Companion r3 = com.lagradost.cloudstream3.utils.M3u8Helper.Companion
            java.lang.String r4 = r13.getName()
            java.lang.String r6 = r13.getMainUrl()
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r10.L$0 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r10.L$1 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r10.L$2 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)
            r10.L$3 = r9
            r10.L$4 = r15
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r10.L$5 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)
            r10.L$6 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r10.L$7 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r10.L$8 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r10.L$9 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r10.L$10 = r9
            r10.label = r7
            r7 = 0
            r9 = 0
            r11 = 40
            r12 = 0
            java.lang.Object r3 = com.lagradost.cloudstream3.utils.M3u8Helper.Companion.generateM3u8$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r4 = r8
            if (r3 != r0) goto L377
            return r0
        L377:
            r0 = r5
            r5 = r1
            r1 = r0
            r7 = r4
            r0 = r13
            r11 = r14
            r8 = r15
            r12 = r24
            r9 = r25
            r6 = r26
            r4 = r2
        L385:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r2 = 0
            java.util.Iterator r13 = r3.iterator()
        L38d:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L39b
            java.lang.Object r14 = r13.next()
            r8.invoke(r14)
            goto L38d
        L39b:
            r2 = r5
            r5 = r1
            r1 = r2
            r13 = r0
            r2 = r4
            r26 = r6
            r15 = r8
            r25 = r9
            r14 = r11
            r24 = r12
            r8 = r7
            goto L3b5
        L3aa:
            r4 = r8
            com.lagradost.api.Log r0 = com.lagradost.api.Log.INSTANCE
            java.lang.String r3 = "No iframe and no video URL found in script fallback."
            r8 = r28
            r0.d(r8, r3)
            r8 = r4
        L3b5:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L3b8:
            r4 = r8
            r6 = r22
            r8 = r28
            r7 = 2
            r9 = 1
            java.lang.String r3 = "Accept-Language"
            java.lang.String r5 = "en-US,en;q=0.5"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r5)
            java.util.Map r5 = kotlin.collections.MapsKt.plus(r4, r3)
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r10.L$0 = r13
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r10.L$1 = r11
            r10.L$2 = r14
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)
            r10.L$3 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r10.L$4 = r11
            r10.L$5 = r4
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)
            r10.L$6 = r11
            r10.L$7 = r1
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r10.L$8 = r11
            r11 = 3
            r10.label = r11
            r6 = 0
            r32 = 2
            r7 = 0
            r8 = 0
            r18 = 1
            r9 = 0
            r17 = r10
            r10 = 0
            r11 = 0
            r16 = r13
            r12 = 0
            r19 = r14
            r14 = 0
            r27 = r15
            r15 = 0
            r29 = r16
            r16 = 0
            r33 = 1
            r18 = 4092(0xffc, float:5.734E-42)
            r31 = r19
            r19 = 0
            r46 = r4
            r34 = r28
            r4 = r1
            r1 = r22
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r10 = r17
            if (r3 != r0) goto L42a
            return r0
        L42a:
            r8 = r46
            r22 = r5
            r13 = r29
            r14 = r4
        L431:
            r28 = r3
            com.lagradost.nicehttp.NiceResponse r28 = (com.lagradost.nicehttp.NiceResponse) r28
            org.jsoup.nodes.Document r3 = r28.getDocument()
            org.jsoup.nodes.Element r2 = r3.selectFirst(r2)
            if (r2 == 0) goto L446
        L441:
            java.lang.String r6 = r2.data()
            goto L447
        L446:
            r6 = 0
        L447:
            if (r6 != 0) goto L44a
            goto L44c
        L44a:
            r20 = r6
        L44c:
            r2 = r20
            com.lagradost.cloudstream3.utils.JsUnpacker r3 = new com.lagradost.cloudstream3.utils.JsUnpacker
            r3.<init>(r2)
            java.lang.String r20 = r3.unpack()
            if (r20 == 0) goto L47e
            r3 = r20
            r4 = 0
            kotlin.text.Regex r5 = new kotlin.text.Regex
            r5.<init>(r1)
            r1 = r3
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r6 = 0
            r7 = 2
            r11 = 0
            kotlin.text.MatchResult r1 = kotlin.text.Regex.find$default(r5, r1, r6, r7, r11)
            if (r1 == 0) goto L47c
            java.util.List r1 = r1.getGroupValues()
            if (r1 == 0) goto L47c
            r5 = 1
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            goto L481
        L47c:
            r5 = 1
            goto L481
        L47e:
            r5 = 1
            r6 = 0
            r11 = 0
        L481:
            r1 = r11
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L490
            int r1 = r1.length()
            if (r1 != 0) goto L48e
            goto L490
        L48e:
            r1 = 0
            goto L491
        L490:
            r1 = 1
        L491:
            if (r1 != 0) goto L51a
            com.lagradost.cloudstream3.utils.M3u8Helper$Companion r3 = com.lagradost.cloudstream3.utils.M3u8Helper.Companion
            java.lang.String r4 = r13.getName()
            java.lang.String r6 = r13.getMainUrl()
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r10.L$0 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r10.L$1 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r31)
            r10.L$2 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)
            r10.L$3 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r27)
            r10.L$4 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r10.L$5 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)
            r10.L$6 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r10.L$7 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r10.L$8 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r28)
            r10.L$9 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r10.L$10 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r20)
            r10.L$11 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r10.L$12 = r1
            r1 = 4
            r10.label = r1
            r7 = 0
            r9 = 0
            r5 = r11
            r11 = 40
            r12 = 0
            java.lang.Object r1 = com.lagradost.cloudstream3.utils.M3u8Helper.Companion.generateM3u8$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r23 = r5
            r3 = r8
            if (r1 != r0) goto L501
            return r0
        L501:
            r4 = r2
            r9 = r3
            r0 = r13
            r7 = r14
            r3 = r20
            r6 = r22
            r1 = r23
            r14 = r24
            r12 = r25
            r8 = r26
            r11 = r27
            r5 = r28
            r13 = r31
        L517:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L51a:
            r3 = r8
            r23 = r11
            com.lagradost.cloudstream3.network.WebViewResolver r35 = new com.lagradost.cloudstream3.network.WebViewResolver
            kotlin.text.Regex r1 = new kotlin.text.Regex
            java.lang.String r4 = "(m3u8|master\\.txt)"
            r1.<init>(r4)
            kotlin.text.Regex r7 = new kotlin.text.Regex
            r7.<init>(r4)
            java.util.List r37 = kotlin.collections.CollectionsKt.listOf(r7)
            r44 = 52
            r45 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 15000(0x3a98, double:7.411E-320)
            r36 = r1
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r44, r45)
            com.lagradost.nicehttp.Requests r1 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r4 = r14
            r14 = r35
            okhttp3.Interceptor r14 = (okhttp3.Interceptor) r14
            r10.L$0 = r13
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r10.L$1 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r31)
            r10.L$2 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)
            r10.L$3 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r27)
            r10.L$4 = r7
            r10.L$5 = r3
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)
            r10.L$6 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r10.L$7 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r10.L$8 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r28)
            r10.L$9 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r10.L$10 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r20)
            r10.L$11 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)
            r10.L$12 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r35)
            r10.L$13 = r7
            r7 = 5
            r10.label = r7
            r18 = 1
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r17 = r10
            r10 = 0
            r11 = 0
            r29 = r13
            r12 = 0
            r15 = 0
            r16 = 0
            r33 = 1
            r18 = 3578(0xdfa, float:5.014E-42)
            r19 = 0
            r6 = r3
            r3 = r1
            r1 = r6
            r6 = r31
            r30 = 0
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r10 = r17
            if (r3 != r0) goto L5c9
            return r0
        L5c9:
            r8 = r1
            r13 = r4
            r1 = r6
            r15 = r25
            r14 = r27
            r19 = r35
        L5d2:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            java.lang.String r5 = r3.getUrl()
            r3 = r5
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L5e4
            r30 = 1
        L5e4:
            if (r30 == 0) goto L671
            com.lagradost.cloudstream3.utils.M3u8Helper$Companion r3 = com.lagradost.cloudstream3.utils.M3u8Helper.Companion
            java.lang.String r4 = r29.getName()
            java.lang.String r6 = r29.getMainUrl()
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r29)
            r10.L$0 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r10.L$1 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r10.L$2 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r10.L$3 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r10.L$4 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r10.L$5 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)
            r10.L$6 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r10.L$7 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r10.L$8 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r28)
            r10.L$9 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r10.L$10 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r20)
            r10.L$11 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)
            r10.L$12 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)
            r10.L$13 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r10.L$14 = r7
            r7 = 6
            r10.label = r7
            r7 = 0
            r9 = 0
            r11 = 40
            r12 = 0
            java.lang.Object r3 = com.lagradost.cloudstream3.utils.M3u8Helper.Companion.generateM3u8$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r0) goto L65c
            return r0
        L65c:
            r7 = r2
            r3 = r5
            r11 = r13
            r4 = r19
            r6 = r20
            r9 = r22
            r5 = r23
            r12 = r26
            r0 = r29
            r13 = r8
            r8 = r28
        L66e:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L671:
            com.lagradost.api.Log r0 = com.lagradost.api.Log.INSTANCE
            java.lang.String r3 = "No video URL intercepted in WebView fallback."
            r4 = r34
            r0.d(r4, r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
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

    public boolean getRequiresReferer() {
            r1 = this;
            boolean r0 = r1.requiresReferer
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object getUrl(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            r1 = this;
            java.lang.Object r0 = getUrl$suspendImpl(r1, r2, r3, r4, r5, r6)
            return r0
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
