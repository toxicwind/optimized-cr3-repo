package com.iGay69;

/* JADX INFO: compiled from: Extractors.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump_unblinded/iGay69/classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/iGay69/WaawExtractor;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "mainUrl", "getMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "iGay69"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nExtractors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extractors.kt\ncom/iGay69/WaawExtractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,404:1\n1915#2:405\n1916#2:407\n1915#2:408\n1915#2,2:409\n1916#2:411\n1915#2:412\n1916#2:425\n1586#2:430\n1661#2,3:431\n1#3:406\n1342#4,2:413\n1342#4,2:415\n1342#4:417\n1342#4,2:418\n1343#4:420\n1342#4,2:421\n1342#4,2:423\n1342#4,2:426\n1342#4,2:428\n*S KotlinDebug\n*F\n+ 1 Extractors.kt\ncom/iGay69/WaawExtractor\n*L\n352#1:405\n352#1:407\n357#1:408\n358#1:409,2\n357#1:411\n365#1:412\n365#1:425\n391#1:430\n391#1:431,3\n370#1:413,2\n371#1:415,2\n373#1:417\n376#1:418,2\n373#1:420\n381#1:421,2\n382#1:423,2\n386#1:426,2\n387#1:428,2\n*E\n"})
public final class WaawExtractor extends com.lagradost.cloudstream3.utils.ExtractorApi {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String mainUrl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;
    private final boolean requiresReferer;

    /* JADX INFO: renamed from: com.iGay69.WaawExtractor$getUrl$1 */
    /* JADX INFO: compiled from: Extractors.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.iGay69.WaawExtractor", f = "Extractors.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {343, 392}, m = "getUrl", n = {"url", "referer", "url", "referer", "res", "text", "doc", "found", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "link", "$i$f$map", "$i$f$mapTo", "$i$a$-map-WaawExtractor$getUrl$7"}, nl = {344, 400}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "L$11", "I$0", "I$1", "I$2"}, v = 2)
    static final class C00051 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$10;
        java.lang.Object L$11;
        java.lang.Object L$12;
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
        final /* synthetic */ com.iGay69.WaawExtractor this$0;

        C00051(com.iGay69.WaawExtractor r1, kotlin.coroutines.Continuation<? super com.iGay69.WaawExtractor.C00051> r2) {
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
                com.iGay69.WaawExtractor r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = r0.getUrl(r1, r1, r2)
                return r0
        }
    }

    public WaawExtractor() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Waaw"
            r1.name = r0
            java.lang.String r0 = "https://waaw.to"
            r1.mainUrl = r0
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
    public java.lang.Object getUrl(@org.jetbrains.annotations.NotNull java.lang.String r36, @org.jetbrains.annotations.Nullable java.lang.String r37, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.utils.ExtractorLink>> r38) {
            r35 = this;
            r1 = r38
            boolean r0 = r1 instanceof com.iGay69.WaawExtractor.C00051
            if (r0 == 0) goto L18
            r0 = r1
            com.iGay69.WaawExtractor$getUrl$1 r0 = (com.iGay69.WaawExtractor.C00051) r0
            int r2 = r0.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r0.label
            int r2 = r2 - r3
            r0.label = r2
            r2 = r35
            goto L1f
        L18:
            com.iGay69.WaawExtractor$getUrl$1 r0 = new com.iGay69.WaawExtractor$getUrl$1
            r2 = r35
            r0.<init>(r2, r1)
        L1f:
            r3 = r0
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            r6 = 1
            switch(r0) {
                case 0: goto La9;
                case 1: goto L96;
                case 2: goto L34;
                default: goto L2c;
            }
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            int r0 = r3.I$2
            int r6 = r3.I$1
            int r9 = r3.I$0
            java.lang.Object r10 = r3.L$12
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r11 = r3.L$11
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r3.L$10
            java.lang.Object r13 = r3.L$9
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r14 = r3.L$8
            java.util.Collection r14 = (java.util.Collection) r14
            java.lang.Object r15 = r3.L$7
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.lang.Object r7 = r3.L$6
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r8 = r3.L$5
            java.util.LinkedHashSet r8 = (java.util.LinkedHashSet) r8
            r18 = r0
            java.lang.Object r0 = r3.L$4
            org.jsoup.nodes.Document r0 = (org.jsoup.nodes.Document) r0
            r19 = r0
            java.lang.Object r0 = r3.L$3
            java.lang.String r0 = (java.lang.String) r0
            r20 = r0
            java.lang.Object r0 = r3.L$2
            com.lagradost.nicehttp.NiceResponse r0 = (com.lagradost.nicehttp.NiceResponse) r0
            r21 = r0
            java.lang.Object r0 = r3.L$1
            java.lang.String r0 = (java.lang.String) r0
            r37 = r0
            java.lang.Object r0 = r3.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r4)
            r24 = r37
            r16 = r14
            r17 = r15
            r32 = r19
            r19 = r4
            r14 = r8
            r15 = r9
            r4 = r0
            r9 = r3
            r8 = r7
            r0 = r18
            r3 = r21
            r18 = r2
            r7 = r6
            r2 = r1
            r6 = r5
            r1 = 2
            r5 = r19
            goto L526
        L96:
            java.lang.Object r0 = r3.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r7 = r3.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r4)
            r17 = r3
            r20 = r4
            r1 = r5
            r2 = 2
            r3 = r0
            goto Lf5
        La9:
            kotlin.ResultKt.throwOnFailure(r4)
            com.lagradost.nicehttp.Requests r0 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r7 = r36
            r3.L$0 = r7
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r37)
            r3.L$1 = r8
            r3.label = r6
            r8 = r5
            r5 = 0
            r9 = 1
            r6 = 0
            r7 = 0
            r10 = r8
            r8 = 0
            r11 = 1
            r9 = 0
            r12 = r10
            r10 = 0
            r13 = 1
            r11 = 0
            r14 = r12
            r15 = 1
            r12 = 0
            r18 = r14
            r14 = 0
            r19 = 1
            r15 = 0
            r20 = 2
            r16 = 0
            r21 = r18
            r18 = 4094(0xffe, float:5.737E-42)
            r22 = 1
            r19 = 0
            r17 = r3
            r20 = r4
            r1 = r21
            r2 = 2
            r4 = r36
            r3 = r0
            java.lang.Object r0 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r0 != r1) goto Lf0
            return r1
        Lf0:
            r7 = r36
            r3 = r37
            r4 = r0
        Lf5:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            int r0 = r4.getCode()
            r5 = 404(0x194, float:5.66E-43)
            if (r0 != r5) goto L104
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        L104:
            java.lang.String r5 = r4.getText()
            org.jsoup.nodes.Document r8 = r4.getDocument()     // Catch: java.lang.Exception -> L10d
            goto L10f
        L10d:
            r0 = move-exception
            r8 = 0
        L10f:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r6 = r0
            java.lang.String r0 = "abs:src"
            if (r8 == 0) goto L156
            java.lang.String r9 = "iframe[src]"
            org.jsoup.select.Elements r9 = r8.select(r9)
            if (r9 == 0) goto L156
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r10 = 0
            java.util.Iterator r11 = r9.iterator()
        L128:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L155
            java.lang.Object r12 = r11.next()
            r13 = r12
            org.jsoup.nodes.Element r13 = (org.jsoup.nodes.Element) r13
            r14 = 0
            java.lang.String r15 = r13.attr(r0)
            if (r15 == 0) goto L153
            r16 = r15
            r18 = 0
            r19 = r16
            java.lang.CharSequence r19 = (java.lang.CharSequence) r19
            boolean r19 = kotlin.text.StringsKt.isBlank(r19)
            if (r19 != 0) goto L14b
            goto L14c
        L14b:
            r15 = 0
        L14c:
            if (r15 == 0) goto L153
            r16 = 0
            r6.add(r15)
        L153:
            goto L128
        L155:
        L156:
            if (r8 == 0) goto L204
            java.lang.String r9 = "[data-src],[data-video],[data-url]"
            org.jsoup.select.Elements r9 = r8.select(r9)
            if (r9 == 0) goto L204
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r10 = 0
            java.util.Iterator r11 = r9.iterator()
        L167:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L1ff
            java.lang.Object r12 = r11.next()
            r13 = r12
            org.jsoup.nodes.Element r13 = (org.jsoup.nodes.Element) r13
            r14 = 0
            java.lang.String r15 = "data-video"
            java.lang.String r2 = "data-url"
            r18 = r1
            java.lang.String r1 = "data-src"
            java.lang.String[] r1 = new java.lang.String[]{r1, r15, r2}
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.Iterator r15 = r1.iterator()
        L18c:
            boolean r19 = r15.hasNext()
            if (r19 == 0) goto L1d8
            java.lang.Object r19 = r15.next()
            r36 = r1
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r23 = 0
            r37 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r24 = r3
            java.lang.String r3 = "abs:"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r13.attr(r2)
            if (r2 == 0) goto L1d0
            r3 = r2
            r25 = 0
            r26 = r3
            java.lang.CharSequence r26 = (java.lang.CharSequence) r26
            boolean r26 = kotlin.text.StringsKt.isBlank(r26)
            if (r26 != 0) goto L1c9
            goto L1ca
        L1c9:
            r2 = 0
        L1ca:
            if (r2 == 0) goto L1d0
            r3 = 0
            r6.add(r2)
        L1d0:
            r1 = r36
            r2 = r37
            r3 = r24
            goto L18c
        L1d8:
            r36 = r1
            r37 = r2
            r24 = r3
            java.lang.String r1 = r13.attr(r0)
            if (r1 == 0) goto L1f7
            r2 = r1
            r3 = 0
            r15 = r2
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            boolean r15 = kotlin.text.StringsKt.isBlank(r15)
            if (r15 != 0) goto L1f0
            goto L1f1
        L1f0:
            r1 = 0
        L1f1:
            if (r1 == 0) goto L1f7
            r2 = 0
            r6.add(r1)
        L1f7:
            r1 = r18
            r3 = r24
            r2 = 2
            goto L167
        L1ff:
            r18 = r1
            r24 = r3
            goto L208
        L204:
            r18 = r1
            r24 = r3
        L208:
            java.lang.String r1 = "https?://[^\\s'\"]+\\.mp4[^\\s'\"]*"
            java.lang.String r2 = "https?://[^\\s'\"]+\\.m3u8[^\\s'\"]*"
            r3 = 0
            if (r8 == 0) goto L3f0
            java.lang.String r0 = "script"
            org.jsoup.select.Elements r0 = r8.select(r0)
            if (r0 == 0) goto L3f0
            r9 = r0
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r10 = 0
            java.util.Iterator r11 = r9.iterator()
        L21f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L3e7
            java.lang.Object r12 = r11.next()
            r13 = r12
            org.jsoup.nodes.Element r13 = (org.jsoup.nodes.Element) r13
            r14 = 0
            java.lang.String r15 = r13.data()
            r0 = r15
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L23f
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L23d
            goto L23f
        L23d:
            r0 = 0
            goto L240
        L23f:
            r0 = 1
        L240:
            if (r0 != 0) goto L3d4
            com.lagradost.cloudstream3.utils.JsUnpacker r0 = new com.lagradost.cloudstream3.utils.JsUnpacker
            r0.<init>(r15)
            java.lang.String r0 = r0.unpack()
            if (r0 == 0) goto L36a
            r19 = r0
            r23 = 0
            kotlin.text.Regex r0 = new kotlin.text.Regex
            r0.<init>(r2)
            r36 = r4
            r4 = r19
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r37 = r5
            r25 = r7
            r5 = 2
            r7 = 0
            kotlin.sequences.Sequence r0 = kotlin.text.Regex.findAll$default(r0, r4, r3, r5, r7)
            r4 = 0
            java.util.Iterator r5 = r0.iterator()
        L26b:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L284
            java.lang.Object r7 = r5.next()
            r26 = r7
            kotlin.text.MatchResult r26 = (kotlin.text.MatchResult) r26
            r27 = 0
            java.lang.String r3 = r26.getValue()
            r6.add(r3)
            r3 = 0
            goto L26b
        L284:
            kotlin.text.Regex r0 = new kotlin.text.Regex
            r0.<init>(r1)
            r3 = r19
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 0
            r5 = 2
            r7 = 0
            kotlin.sequences.Sequence r0 = kotlin.text.Regex.findAll$default(r0, r3, r4, r5, r7)
            r3 = 0
            java.util.Iterator r4 = r0.iterator()
        L29a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2b5
            java.lang.Object r5 = r4.next()
            r7 = r5
            kotlin.text.MatchResult r7 = (kotlin.text.MatchResult) r7
            r26 = 0
            r27 = r0
            java.lang.String r0 = r7.getValue()
            r6.add(r0)
            r0 = r27
            goto L29a
        L2b5:
            r27 = r0
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r3 = "[\"']([A-Za-z0-9+/=]{40,})[\"']"
            r0.<init>(r3)
            r3 = r19
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 0
            r5 = 2
            r7 = 0
            kotlin.sequences.Sequence r3 = kotlin.text.Regex.findAll$default(r0, r3, r4, r5, r7)
            r4 = 0
            java.util.Iterator r5 = r3.iterator()
        L2ce:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L362
            java.lang.Object r7 = r5.next()
            r26 = r7
            kotlin.text.MatchResult r26 = (kotlin.text.MatchResult) r26
            r27 = 0
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L34c
            r28 = r3
            java.util.Base64$Decoder r3 = java.util.Base64.getDecoder()     // Catch: java.lang.Exception -> L342
            r29 = r4
            java.util.List r4 = r26.getGroupValues()     // Catch: java.lang.Exception -> L33a
            r30 = r5
            r5 = 1
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Exception -> L338
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L338
            byte[] r3 = r3.decode(r4)     // Catch: java.lang.Exception -> L338
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Exception -> L338
            r0.<init>(r3, r4)     // Catch: java.lang.Exception -> L338
            kotlin.text.Regex r3 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L338
            java.lang.String r4 = "https?://[^\\s'\"]+"
            r3.<init>(r4)     // Catch: java.lang.Exception -> L338
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Exception -> L338
            r31 = r7
            r32 = r8
            r5 = 0
            r7 = 2
            r8 = 0
            kotlin.sequences.Sequence r3 = kotlin.text.Regex.findAll$default(r3, r4, r5, r7, r8)     // Catch: java.lang.Exception -> L336
            r4 = 0
            java.util.Iterator r5 = r3.iterator()     // Catch: java.lang.Exception -> L336
        L318:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Exception -> L336
            if (r7 == 0) goto L333
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Exception -> L336
            r8 = r7
            kotlin.text.MatchResult r8 = (kotlin.text.MatchResult) r8     // Catch: java.lang.Exception -> L336
            r33 = 0
            r34 = r0
            java.lang.String r0 = r8.getValue()     // Catch: java.lang.Exception -> L336
            r6.add(r0)     // Catch: java.lang.Exception -> L336
            r0 = r34
            goto L318
        L333:
            r34 = r0
            goto L357
        L336:
            r0 = move-exception
            goto L357
        L338:
            r0 = move-exception
            goto L33d
        L33a:
            r0 = move-exception
            r30 = r5
        L33d:
            r31 = r7
            r32 = r8
            goto L357
        L342:
            r0 = move-exception
            r29 = r4
            r30 = r5
            r31 = r7
            r32 = r8
            goto L357
        L34c:
            r0 = move-exception
            r28 = r3
            r29 = r4
            r30 = r5
            r31 = r7
            r32 = r8
        L357:
            r3 = r28
            r4 = r29
            r5 = r30
            r8 = r32
            goto L2ce
        L362:
            r28 = r3
            r29 = r4
            r32 = r8
            goto L372
        L36a:
            r36 = r4
            r37 = r5
            r25 = r7
            r32 = r8
        L372:
            kotlin.text.Regex r0 = new kotlin.text.Regex
            r0.<init>(r2)
            r3 = r15
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 0
            r5 = 2
            r7 = 0
            kotlin.sequences.Sequence r0 = kotlin.text.Regex.findAll$default(r0, r3, r4, r5, r7)
            r3 = 0
            java.util.Iterator r4 = r0.iterator()
        L387:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3a1
            java.lang.Object r5 = r4.next()
            r7 = r5
            kotlin.text.MatchResult r7 = (kotlin.text.MatchResult) r7
            r8 = 0
            r19 = r0
            java.lang.String r0 = r7.getValue()
            r6.add(r0)
            r0 = r19
            goto L387
        L3a1:
            r19 = r0
            kotlin.text.Regex r0 = new kotlin.text.Regex
            r0.<init>(r1)
            r3 = r15
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 0
            r5 = 2
            r7 = 0
            kotlin.sequences.Sequence r0 = kotlin.text.Regex.findAll$default(r0, r3, r4, r5, r7)
            r3 = 0
            java.util.Iterator r4 = r0.iterator()
        L3b7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3d1
            java.lang.Object r5 = r4.next()
            r7 = r5
            kotlin.text.MatchResult r7 = (kotlin.text.MatchResult) r7
            r8 = 0
            r19 = r0
            java.lang.String r0 = r7.getValue()
            r6.add(r0)
            r0 = r19
            goto L3b7
        L3d1:
            r19 = r0
            goto L3dc
        L3d4:
            r36 = r4
            r37 = r5
            r25 = r7
            r32 = r8
        L3dc:
            r4 = r36
            r5 = r37
            r7 = r25
            r8 = r32
            r3 = 0
            goto L21f
        L3e7:
            r36 = r4
            r37 = r5
            r25 = r7
            r32 = r8
            goto L3f8
        L3f0:
            r36 = r4
            r37 = r5
            r25 = r7
            r32 = r8
        L3f8:
            kotlin.text.Regex r0 = new kotlin.text.Regex
            r0.<init>(r2)
            r2 = r37
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r4 = 0
            r5 = 2
            r7 = 0
            kotlin.sequences.Sequence r0 = kotlin.text.Regex.findAll$default(r0, r2, r4, r5, r7)
            r2 = 0
            java.util.Iterator r3 = r0.iterator()
        L40d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L423
            java.lang.Object r4 = r3.next()
            r5 = r4
            kotlin.text.MatchResult r5 = (kotlin.text.MatchResult) r5
            r7 = 0
            java.lang.String r8 = r5.getValue()
            r6.add(r8)
            goto L40d
        L423:
            kotlin.text.Regex r0 = new kotlin.text.Regex
            r0.<init>(r1)
            r1 = r37
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4 = 0
            r5 = 2
            r7 = 0
            kotlin.sequences.Sequence r0 = kotlin.text.Regex.findAll$default(r0, r1, r4, r5, r7)
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        L439:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L44f
            java.lang.Object r3 = r2.next()
            r4 = r3
            kotlin.text.MatchResult r4 = (kotlin.text.MatchResult) r4
            r5 = 0
            java.lang.String r7 = r4.getValue()
            r6.add(r7)
            goto L439
        L44f:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L45b
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        L45b:
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r3)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r0
            r4 = 0
            java.util.Iterator r5 = r3.iterator()
            r12 = r0
            r14 = r1
            r15 = r2
            r11 = r4
            r4 = r5
            r13 = r6
            r9 = r17
            r10 = r18
            r2 = r25
            r18 = r35
            r1 = r36
            r0 = r38
            r17 = r3
            r3 = r37
        L488:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53c
            java.lang.Object r19 = r4.next()
            r6 = r19
            java.lang.String r6 = (java.lang.String) r6
            r5 = 0
            java.lang.String r7 = r18.getName()
            java.lang.String r8 = r18.getName()
            r22 = r7
            com.lagradost.cloudstream3.utils.ExtractorLinkType r7 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()
            r36 = r0
            com.iGay69.WaawExtractor$getUrl$7$1 r0 = new com.iGay69.WaawExtractor$getUrl$7$1
            r37 = r1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r9.L$0 = r2
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r9.L$1 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r37)
            r9.L$2 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)
            r9.L$3 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r32)
            r9.L$4 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r9.L$5 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r9.L$6 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r17)
            r9.L$7 = r1
            r9.L$8 = r15
            r9.L$9 = r4
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)
            r9.L$10 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r9.L$11 = r1
            r9.L$12 = r15
            r9.I$0 = r14
            r9.I$1 = r11
            r9.I$2 = r5
            r1 = 2
            r9.label = r1
            r16 = r8
            r8 = r0
            r0 = r4
            r4 = r16
            r16 = r5
            r5 = r22
            java.lang.Object r4 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r4, r5, r6, r7, r8, r9)
            if (r4 != r10) goto L50e
            return r10
        L50e:
            r5 = r4
            r7 = r11
            r8 = r12
            r12 = r19
            r19 = r20
            r4 = r2
            r20 = r3
            r11 = r6
            r6 = r10
            r10 = r15
            r2 = r36
            r3 = r37
            r15 = r14
            r14 = r13
            r13 = r0
            r0 = r16
            r16 = r10
        L526:
            com.lagradost.cloudstream3.utils.ExtractorLink r5 = (com.lagradost.cloudstream3.utils.ExtractorLink) r5
            r10.add(r5)
            r0 = r2
            r1 = r3
            r2 = r4
            r10 = r6
            r11 = r7
            r12 = r8
            r4 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r3 = r20
            r20 = r19
            goto L488
        L53c:
            r36 = r0
            r0 = r15
            java.util.List r0 = (java.util.List) r0
            return r0
    }
}
