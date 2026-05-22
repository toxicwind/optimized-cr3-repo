package com.GXtapes;

/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump_unblinded/GXtapes/classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJH\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0013H\u0096@\u00a2\u0006\u0002\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/GXtapes/GXtapes88z;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "name", "", "mainUrl", "requiresReferer", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getMainUrl", "getRequiresReferer", "()Z", "getUrl", "", "url", "referer", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GXtapes"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extractor.kt\ncom/GXtapes/GXtapes88z\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n1915#2,2:139\n*S KotlinDebug\n*F\n+ 1 Extractor.kt\ncom/GXtapes/GXtapes88z\n*L\n114#1:139,2\n*E\n"})
public final class GXtapes88z extends com.lagradost.cloudstream3.utils.ExtractorApi {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String mainUrl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;
    private final boolean requiresReferer;

    /* JADX INFO: renamed from: com.GXtapes.GXtapes88z$getUrl$1 */
    /* JADX INFO: compiled from: Extractor.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.GXtapes.GXtapes88z", f = "Extractor.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {96, 118}, m = "getUrl", n = {"url", "referer", "subtitleCallback", "callback", "id", "apiUrl", "url", "referer", "subtitleCallback", "callback", "id", "apiUrl", "apiRes", "decodedBytes", "decodedText", "m3u8Regex", "matches", "$this$forEach$iv", "element$iv", "link", "$i$f$forEach", "$i$a$-forEach-GXtapes88z$getUrl$2"}, nl = {99, 117}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$13", "L$14", "I$0", "I$1"}, v = 2)
    static final class C00071 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
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
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.GXtapes.GXtapes88z this$0;

        C00071(com.GXtapes.GXtapes88z r1, kotlin.coroutines.Continuation<? super com.GXtapes.GXtapes88z.C00071> r2) {
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
                com.GXtapes.GXtapes88z r1 = r7.this$0
                r5 = 0
                r6 = r7
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r2 = 0
                r3 = 0
                r4 = 0
                java.lang.Object r0 = r1.getUrl(r2, r3, r4, r5, r6)
                return r0
        }
    }

    public GXtapes88z() {
            r6 = this;
            r4 = 7
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public GXtapes88z(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.mainUrl = r2
            r0.requiresReferer = r3
            return
    }

    public /* synthetic */ GXtapes88z(java.lang.String r1, java.lang.String r2, boolean r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = "GXtapes8z"
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = "https://88z.io"
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            r3 = 0
        L11:
            r0.<init>(r1, r2, r3)
            return
    }

    static final java.lang.String getUrl$lambda$0(kotlin.text.MatchResult r1) {
            java.lang.String r0 = r1.getValue()
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
    public java.lang.Object getUrl(@org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.Nullable java.lang.String r28, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r29, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r30, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r31) {
            r26 = this;
            r1 = r27
            r2 = r31
            boolean r0 = r2 instanceof com.GXtapes.GXtapes88z.C00071
            if (r0 == 0) goto L1a
            r0 = r2
            com.GXtapes.GXtapes88z$getUrl$1 r0 = (com.GXtapes.GXtapes88z.C00071) r0
            int r3 = r0.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            int r3 = r0.label
            int r3 = r3 - r4
            r0.label = r3
            r3 = r26
            goto L21
        L1a:
            com.GXtapes.GXtapes88z$getUrl$1 r0 = new com.GXtapes.GXtapes88z$getUrl$1
            r3 = r26
            r0.<init>(r3, r2)
        L21:
            r4 = r0
            java.lang.Object r5 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.label
            switch(r6) {
                case 0: goto Le9;
                case 1: goto Lb6;
                case 2: goto L35;
                default: goto L2d;
            }
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            int r6 = r4.I$1
            int r9 = r4.I$0
            java.lang.Object r10 = r4.L$15
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r11 = r4.L$14
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r4.L$13
            java.lang.Object r13 = r4.L$12
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r14 = r4.L$11
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.Object r15 = r4.L$10
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r7 = r4.L$9
            kotlin.text.Regex r7 = (kotlin.text.Regex) r7
            java.lang.Object r8 = r4.L$8
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r4.L$7
            byte[] r2 = (byte[]) r2
            r18 = r2
            java.lang.Object r2 = r4.L$6
            java.lang.String r2 = (java.lang.String) r2
            r19 = r2
            java.lang.Object r2 = r4.L$5
            java.lang.String r2 = (java.lang.String) r2
            r20 = r2
            java.lang.Object r2 = r4.L$4
            java.lang.String r2 = (java.lang.String) r2
            r21 = r2
            java.lang.Object r2 = r4.L$3
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r30 = r2
            java.lang.Object r2 = r4.L$2
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r29 = r2
            java.lang.Object r2 = r4.L$1
            java.lang.String r2 = (java.lang.String) r2
            r28 = r2
            java.lang.Object r2 = r4.L$0
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Exception -> La7
            r17 = r4
            r24 = r5
            r16 = r7
            r22 = r14
            r25 = r15
            r23 = r21
            r2 = 2
            r7 = r30
            r4 = r1
            r15 = r3
            r21 = r8
            r14 = r13
            r3 = 0
            r8 = r29
            r1 = r31
            r13 = r9
            r9 = r28
            goto L328
        La7:
            r0 = move-exception
            r9 = r28
            r8 = r29
            r7 = r30
            r15 = r3
            r17 = r4
            r4 = r1
            r1 = r31
            goto L3ba
        Lb6:
            java.lang.Object r2 = r4.L$5
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r4.L$4
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r4.L$3
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r8 = r4.L$2
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r9 = r4.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r4.L$0
            r1 = r10
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Exception -> Le0
            r18 = r4
            r22 = r5
            r21 = r6
            r4 = r1
            r5 = r2
            r6 = r22
            r1 = 2
            r2 = 0
            goto L1b5
        Le0:
            r0 = move-exception
            r15 = r3
            r17 = r4
            r4 = r1
            r1 = r31
            goto L3ba
        Le9:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.String r2 = "#"
            java.lang.String r6 = ""
            java.lang.String r2 = kotlin.text.StringsKt.substringAfter(r1, r2, r6)     // Catch: java.lang.Exception -> L3a7
            java.lang.String r6 = "?"
            r7 = 2
            r8 = 0
            java.lang.String r2 = kotlin.text.StringsKt.substringBefore$default(r2, r6, r8, r7, r8)     // Catch: java.lang.Exception -> L3a7
            r6 = r2
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: java.lang.Exception -> L3a7
            boolean r6 = kotlin.text.StringsKt.isBlank(r6)     // Catch: java.lang.Exception -> L3a7
            if (r6 == 0) goto L134
            com.lagradost.api.Log r0 = com.lagradost.api.Log.INSTANCE     // Catch: java.lang.Exception -> L125
            java.lang.String r6 = r3.getName()     // Catch: java.lang.Exception -> L125
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L125
            r7.<init>()     // Catch: java.lang.Exception -> L125
            java.lang.String r8 = "No id found in url: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> L125
            java.lang.StringBuilder r7 = r7.append(r1)     // Catch: java.lang.Exception -> L125
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L125
            r0.e(r6, r7)     // Catch: java.lang.Exception -> L125
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L125
            return r0
        L125:
            r0 = move-exception
            r9 = r28
            r8 = r29
            r7 = r30
            r15 = r3
            r17 = r4
            r4 = r1
            r1 = r31
            goto L3ba
        L134:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a7
            r6.<init>()     // Catch: java.lang.Exception -> L3a7
            java.lang.String r9 = r3.getMainUrl()     // Catch: java.lang.Exception -> L3a7
            java.lang.StringBuilder r6 = r6.append(r9)     // Catch: java.lang.Exception -> L3a7
            java.lang.String r9 = "/api/v1/info?id="
            java.lang.StringBuilder r6 = r6.append(r9)     // Catch: java.lang.Exception -> L3a7
            java.lang.StringBuilder r6 = r6.append(r2)     // Catch: java.lang.Exception -> L3a7
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L3a7
            com.lagradost.nicehttp.Requests r9 = com.lagradost.cloudstream3.MainActivityKt.getApp()     // Catch: java.lang.Exception -> L3a7
            r16 = 2
            java.lang.String r7 = r3.getMainUrl()     // Catch: java.lang.Exception -> L3a7
            r4.L$0 = r1     // Catch: java.lang.Exception -> L3a7
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r28)     // Catch: java.lang.Exception -> L3a7
            r4.L$1 = r10     // Catch: java.lang.Exception -> L3a7
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r29)     // Catch: java.lang.Exception -> L3a7
            r4.L$2 = r10     // Catch: java.lang.Exception -> L3a7
            r10 = r30
            r4.L$3 = r10     // Catch: java.lang.Exception -> L3a7
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)     // Catch: java.lang.Exception -> L3a7
            r4.L$4 = r11     // Catch: java.lang.Exception -> L3a7
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)     // Catch: java.lang.Exception -> L3a7
            r4.L$5 = r11     // Catch: java.lang.Exception -> L3a7
            r11 = 1
            r4.label = r11     // Catch: java.lang.Exception -> L3a7
            r11 = r5
            r5 = r6
            r6 = 0
            r17 = r8
            r8 = 0
            r18 = r4
            r4 = r9
            r9 = 0
            r10 = 0
            r12 = r11
            r11 = 0
            r13 = r12
            r12 = 0
            r15 = r13
            r13 = 0
            r19 = r15
            r15 = 0
            r20 = 2
            r16 = 0
            r21 = r17
            r17 = 0
            r22 = r19
            r19 = 4090(0xffa, float:5.731E-42)
            r23 = 2
            r20 = 0
            r1 = r21
            r21 = r2
            r2 = r1
            r1 = 2
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Exception -> L395
            if (r4 != r0) goto L1ac
            return r0
        L1ac:
            r9 = r28
            r8 = r29
            r7 = r30
            r6 = r4
            r4 = r27
        L1b5:
            com.lagradost.nicehttp.NiceResponse r6 = (com.lagradost.nicehttp.NiceResponse) r6     // Catch: java.lang.Exception -> L38b
            java.lang.String r6 = r6.getText()     // Catch: java.lang.Exception -> L38b
            java.util.Base64$Decoder r10 = java.util.Base64.getDecoder()     // Catch: java.lang.Exception -> L38b
            byte[] r10 = r10.decode(r6)     // Catch: java.lang.Exception -> L38b
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Exception -> L38b
            java.nio.charset.Charset r12 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Exception -> L38b
            r11.<init>(r10, r12)     // Catch: java.lang.Exception -> L38b
            kotlin.text.Regex r12 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L38b
            java.lang.String r13 = "https?://[^\\s\"'<>]+\\.m3u8[^\\s\"'<>]*"
            r12.<init>(r13)     // Catch: java.lang.Exception -> L38b
            r13 = r11
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13     // Catch: java.lang.Exception -> L38b
            r14 = 0
            kotlin.sequences.Sequence r13 = kotlin.text.Regex.findAll$default(r12, r13, r14, r1, r2)     // Catch: java.lang.Exception -> L38b
            com.GXtapes.GXtapes88z$$ExternalSyntheticLambda0 r14 = new com.GXtapes.GXtapes88z$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> L38b
            r14.<init>()     // Catch: java.lang.Exception -> L38b
            kotlin.sequences.Sequence r13 = kotlin.sequences.SequencesKt.map(r13, r14)     // Catch: java.lang.Exception -> L38b
            java.util.List r13 = kotlin.sequences.SequencesKt.toList(r13)     // Catch: java.lang.Exception -> L38b
            boolean r14 = r13.isEmpty()     // Catch: java.lang.Exception -> L38b
            if (r14 == 0) goto L215
            com.lagradost.api.Log r0 = com.lagradost.api.Log.INSTANCE     // Catch: java.lang.Exception -> L20b
            java.lang.String r1 = r3.getName()     // Catch: java.lang.Exception -> L20b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L20b
            r2.<init>()     // Catch: java.lang.Exception -> L20b
            java.lang.String r14 = "No m3u8 link found in decoded payload for "
            java.lang.StringBuilder r2 = r2.append(r14)     // Catch: java.lang.Exception -> L20b
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Exception -> L20b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L20b
            r0.e(r1, r2)     // Catch: java.lang.Exception -> L20b
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L20b
            return r0
        L20b:
            r0 = move-exception
            r1 = r31
            r15 = r3
            r17 = r18
            r5 = r22
            goto L3ba
        L215:
            r14 = r13
            java.lang.Iterable r14 = (java.lang.Iterable) r14     // Catch: java.lang.Exception -> L38b
            r15 = 0
            java.util.Iterator r16 = r14.iterator()     // Catch: java.lang.Exception -> L38b
            r19 = r18
            r18 = r12
            r12 = r19
            r19 = r11
            r23 = r13
            r20 = r14
            r13 = r15
            r14 = r16
            r15 = r3
            r11 = r5
            r5 = r31
        L230:
            boolean r16 = r14.hasNext()     // Catch: java.lang.Exception -> L37c
            if (r16 == 0) goto L36f
            java.lang.Object r16 = r14.next()     // Catch: java.lang.Exception -> L37c
            r24 = r16
            r16 = r24
            java.lang.String r16 = (java.lang.String) r16     // Catch: java.lang.Exception -> L37c
            r27 = r16
            r1 = 0
            com.lagradost.api.Log r2 = com.lagradost.api.Log.INSTANCE     // Catch: java.lang.Exception -> L37c
            java.lang.String r3 = r15.getName()     // Catch: java.lang.Exception -> L37c
            r28 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L362
            r4.<init>()     // Catch: java.lang.Exception -> L362
            r29 = r5
            java.lang.String r5 = "Found m3u8: "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Exception -> L356
            r5 = r27
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Exception -> L356
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L356
            r2.i(r3, r4)     // Catch: java.lang.Exception -> L356
            java.lang.String r2 = r15.getName()     // Catch: java.lang.Exception -> L356
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L356
            r3.<init>()     // Catch: java.lang.Exception -> L356
            java.lang.String r4 = r15.getName()     // Catch: java.lang.Exception -> L356
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Exception -> L356
            java.lang.String r4 = " - HLS"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Exception -> L356
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L356
            com.lagradost.cloudstream3.utils.ExtractorLinkType r4 = com.lagradost.cloudstream3.utils.ExtractorLinkType.M3U8     // Catch: java.lang.Exception -> L356
            r27 = r2
            com.GXtapes.GXtapes88z$getUrl$2$1 r2 = new com.GXtapes.GXtapes88z$getUrl$2$1     // Catch: java.lang.Exception -> L356
            r30 = r3
            r3 = 0
            r2.<init>(r15, r3)     // Catch: java.lang.Exception -> L356
            r16 = r2
            kotlin.jvm.functions.Function2 r16 = (kotlin.jvm.functions.Function2) r16     // Catch: java.lang.Exception -> L356
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r28)     // Catch: java.lang.Exception -> L356
            r12.L$0 = r2     // Catch: java.lang.Exception -> L356
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)     // Catch: java.lang.Exception -> L356
            r12.L$1 = r2     // Catch: java.lang.Exception -> L356
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)     // Catch: java.lang.Exception -> L356
            r12.L$2 = r2     // Catch: java.lang.Exception -> L356
            r12.L$3 = r7     // Catch: java.lang.Exception -> L356
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r21)     // Catch: java.lang.Exception -> L356
            r12.L$4 = r2     // Catch: java.lang.Exception -> L356
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)     // Catch: java.lang.Exception -> L356
            r12.L$5 = r2     // Catch: java.lang.Exception -> L356
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)     // Catch: java.lang.Exception -> L356
            r12.L$6 = r2     // Catch: java.lang.Exception -> L356
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> L356
            r12.L$7 = r2     // Catch: java.lang.Exception -> L356
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)     // Catch: java.lang.Exception -> L356
            r12.L$8 = r2     // Catch: java.lang.Exception -> L356
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r18)     // Catch: java.lang.Exception -> L356
            r12.L$9 = r2     // Catch: java.lang.Exception -> L356
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)     // Catch: java.lang.Exception -> L356
            r12.L$10 = r2     // Catch: java.lang.Exception -> L356
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r20)     // Catch: java.lang.Exception -> L356
            r12.L$11 = r2     // Catch: java.lang.Exception -> L356
            r12.L$12 = r14     // Catch: java.lang.Exception -> L356
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)     // Catch: java.lang.Exception -> L356
            r12.L$13 = r2     // Catch: java.lang.Exception -> L356
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)     // Catch: java.lang.Exception -> L356
            r12.L$14 = r2     // Catch: java.lang.Exception -> L356
            r12.L$15 = r7     // Catch: java.lang.Exception -> L356
            r12.I$0 = r13     // Catch: java.lang.Exception -> L356
            r12.I$1 = r1     // Catch: java.lang.Exception -> L356
            r2 = 2
            r12.label = r2     // Catch: java.lang.Exception -> L356
            r17 = r15
            r15 = r4
            r4 = r17
            r17 = r14
            r14 = r5
            r5 = r17
            r17 = r12
            r25 = r13
            r12 = r27
            r13 = r30
            java.lang.Object r12 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L34c
            if (r12 != r0) goto L307
            return r0
        L307:
            r13 = r14
            r14 = r5
            r5 = r12
            r12 = r24
            r24 = r22
            r22 = r20
            r20 = r11
            r11 = r13
            r15 = r4
            r16 = r18
            r13 = r25
            r4 = r28
            r18 = r10
            r25 = r23
            r10 = r7
            r23 = r21
            r21 = r19
            r19 = r6
            r6 = r1
            r1 = r29
        L328:
            r10.invoke(r5)     // Catch: java.lang.Exception -> L347
            r5 = r1
            r2 = r3
            r12 = r17
            r10 = r18
            r6 = r19
            r11 = r20
            r19 = r21
            r20 = r22
            r21 = r23
            r22 = r24
            r23 = r25
            r1 = 2
            r3 = r26
            r18 = r16
            goto L230
        L347:
            r0 = move-exception
            r5 = r24
            goto L3ba
        L34c:
            r0 = move-exception
            r1 = r29
            r15 = r4
            r5 = r22
            r4 = r28
            goto L3ba
        L356:
            r0 = move-exception
            r17 = r12
            r4 = r15
            r1 = r29
            r5 = r22
            r4 = r28
            goto L3ba
        L362:
            r0 = move-exception
            r29 = r5
            r17 = r12
            r4 = r15
            r1 = r29
            r5 = r22
            r4 = r28
            goto L3ba
        L36f:
            r28 = r4
            r29 = r5
            r17 = r12
            r25 = r13
            r4 = r15
            r4 = r28
            goto L3df
        L37c:
            r0 = move-exception
            r28 = r4
            r29 = r5
            r17 = r12
            r4 = r15
            r1 = r29
            r5 = r22
            r4 = r28
            goto L3ba
        L38b:
            r0 = move-exception
            r15 = r26
            r1 = r31
            r17 = r18
            r5 = r22
            goto L3ba
        L395:
            r0 = move-exception
            r15 = r26
            r4 = r27
            r9 = r28
            r8 = r29
            r7 = r30
            r1 = r31
            r17 = r18
            r5 = r22
            goto L3ba
        L3a7:
            r0 = move-exception
            r18 = r4
            r22 = r5
            r15 = r26
            r4 = r27
            r9 = r28
            r8 = r29
            r7 = r30
            r1 = r31
            r17 = r18
        L3ba:
            com.lagradost.api.Log r2 = com.lagradost.api.Log.INSTANCE
            java.lang.String r3 = r15.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "Error in GXtapes88z: "
            java.lang.StringBuilder r6 = r6.append(r10)
            java.lang.String r10 = r0.getMessage()
            java.lang.StringBuilder r6 = r6.append(r10)
            java.lang.String r6 = r6.toString()
            r2.e(r3, r6)
            r22 = r5
            r5 = r1
            r12 = r17
        L3df:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
