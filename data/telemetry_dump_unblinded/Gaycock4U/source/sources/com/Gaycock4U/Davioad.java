package com.Gaycock4U;

/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump_unblinded/Gaycock4U/classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJH\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0013H\u0096@\u00a2\u0006\u0002\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/Gaycock4U/Davioad;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "name", "", "mainUrl", "requiresReferer", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getMainUrl", "getRequiresReferer", "()Z", "getUrl", "", "url", "referer", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Gaycock4U"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extractor.kt\ncom/Gaycock4U/Davioad\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,131:1\n1#2:132\n32#3,2:133\n*S KotlinDebug\n*F\n+ 1 Extractor.kt\ncom/Gaycock4U/Davioad\n*L\n107#1:133,2\n*E\n"})
public final class Davioad extends com.lagradost.cloudstream3.utils.ExtractorApi {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String mainUrl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;
    private final boolean requiresReferer;

    /* JADX INFO: renamed from: com.Gaycock4U.Davioad$getUrl$1 */
    /* JADX INFO: compiled from: Extractor.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Gaycock4U.Davioad", f = "Extractor.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {92, 114}, m = "getUrl", n = {"url", "referer", "subtitleCallback", "callback", "url", "referer", "subtitleCallback", "callback", "response", "script", "unpackedScript", "rawLinks", "links", "obj", "$this$forEach$iv", "element$iv", "key", "finalUrl", "$i$f$forEach", "$i$a$-forEach-Davioad$getUrl$2"}, nl = {93, 113}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$12", "L$13", "L$14", "I$0", "I$1"}, v = 2)
    static final class C00001 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
        final /* synthetic */ com.Gaycock4U.Davioad this$0;

        C00001(com.Gaycock4U.Davioad r1, kotlin.coroutines.Continuation<? super com.Gaycock4U.Davioad.C00001> r2) {
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
                com.Gaycock4U.Davioad r1 = r7.this$0
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

    public Davioad() {
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

    public Davioad(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.mainUrl = r2
            r0.requiresReferer = r3
            return
    }

    public /* synthetic */ Davioad(java.lang.String r1, java.lang.String r2, boolean r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = "Davioad"
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = "https://davioad.com"
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            r3 = 0
        L11:
            r0.<init>(r1, r2, r3)
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
    public java.lang.Object getUrl(@org.jetbrains.annotations.NotNull java.lang.String r29, @org.jetbrains.annotations.Nullable java.lang.String r30, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r31, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r32, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r33) {
            r28 = this;
            r1 = r33
            java.lang.String r0 = ""
            boolean r2 = r1 instanceof com.Gaycock4U.Davioad.C00001
            if (r2 == 0) goto L1a
            r2 = r1
            com.Gaycock4U.Davioad$getUrl$1 r2 = (com.Gaycock4U.Davioad.C00001) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            r3 = r28
            goto L21
        L1a:
            com.Gaycock4U.Davioad$getUrl$1 r2 = new com.Gaycock4U.Davioad$getUrl$1
            r3 = r28
            r2.<init>(r3, r1)
        L21:
            java.lang.Object r4 = r2.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r2.label
            r7 = 1
            switch(r6) {
                case 0: goto Ldc;
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
            int r0 = r2.I$1
            int r6 = r2.I$0
            java.lang.Object r7 = r2.L$15
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r11 = r2.L$14
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r2.L$13
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.L$12
            java.lang.Object r14 = r2.L$11
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r15 = r2.L$10
            java.util.Iterator r15 = (java.util.Iterator) r15
            java.lang.Object r8 = r2.L$9
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            java.lang.Object r9 = r2.L$8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.L$7
            java.lang.String r10 = (java.lang.String) r10
            r19 = r0
            java.lang.Object r0 = r2.L$6
            java.lang.String r0 = (java.lang.String) r0
            r20 = r0
            java.lang.Object r0 = r2.L$5
            java.lang.String r0 = (java.lang.String) r0
            r21 = r0
            java.lang.Object r0 = r2.L$4
            org.jsoup.nodes.Document r0 = (org.jsoup.nodes.Document) r0
            r22 = r0
            java.lang.Object r0 = r2.L$3
            r23 = r0
            kotlin.jvm.functions.Function1 r23 = (kotlin.jvm.functions.Function1) r23
            java.lang.Object r0 = r2.L$2
            r24 = r0
            kotlin.jvm.functions.Function1 r24 = (kotlin.jvm.functions.Function1) r24
            java.lang.Object r0 = r2.L$1
            r25 = r0
            java.lang.String r25 = (java.lang.String) r25
            java.lang.Object r0 = r2.L$0
            r26 = r0
            java.lang.String r26 = (java.lang.String) r26
            kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Exception -> La9
            r16 = r2
            r17 = r10
            r18 = r15
            r0 = r19
            r10 = r26
            r2 = 2
            r15 = r8
            r19 = r9
            r8 = r24
            r9 = r25
            r24 = r4
            r25 = r14
            r14 = r6
            r6 = r23
            r23 = r3
            r3 = r5
            r5 = 0
            goto L2ba
        La9:
            r0 = move-exception
            r22 = r3
            r6 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            goto L33d
        Lb6:
            java.lang.Object r6 = r2.L$3
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            java.lang.Object r8 = r2.L$2
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r9 = r2.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.L$0
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Exception -> Ld7
            r21 = r0
            r18 = r2
            r24 = r4
            r2 = r5
            r0 = 0
            r1 = 0
            r3 = 2
            r23 = 1
            goto L13c
        Ld7:
            r0 = move-exception
            r22 = r3
            goto L33d
        Ldc:
            kotlin.ResultKt.throwOnFailure(r4)
            r6 = r4
            com.lagradost.nicehttp.Requests r4 = com.lagradost.cloudstream3.MainActivityKt.getApp()     // Catch: java.lang.Exception -> L32a
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r29)     // Catch: java.lang.Exception -> L32a
            r2.L$0 = r8     // Catch: java.lang.Exception -> L32a
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r30)     // Catch: java.lang.Exception -> L32a
            r2.L$1 = r8     // Catch: java.lang.Exception -> L32a
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r31)     // Catch: java.lang.Exception -> L32a
            r2.L$2 = r8     // Catch: java.lang.Exception -> L32a
            r8 = r32
            r2.L$3 = r8     // Catch: java.lang.Exception -> L32a
            r2.label = r7     // Catch: java.lang.Exception -> L32a
            r9 = r6
            r6 = 0
            r10 = 1
            r7 = 0
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
            r19 = 1
            r13 = 0
            r20 = r15
            r15 = 0
            r21 = 0
            r16 = 0
            r22 = 2
            r17 = 0
            r23 = 1
            r19 = 4094(0xffe, float:5.737E-42)
            r24 = r20
            r20 = 0
            r18 = r2
            r2 = r5
            r1 = r21
            r3 = 2
            r5 = r29
            r21 = r0
            r0 = 0
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Exception -> L318
            if (r4 != r2) goto L134
            return r2
        L134:
            r10 = r29
            r9 = r30
            r8 = r31
            r6 = r32
        L13c:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4     // Catch: java.lang.Exception -> L30e
            org.jsoup.nodes.Document r4 = r4.getDocument()     // Catch: java.lang.Exception -> L30e
            java.lang.String r5 = "script"
            org.jsoup.select.Elements r5 = r4.select(r5)     // Catch: java.lang.Exception -> L30e
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Exception -> L30e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L30e
        L14e:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Exception -> L30e
            if (r7 == 0) goto L178
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Exception -> L16d
            r11 = r7
            org.jsoup.nodes.Element r11 = (org.jsoup.nodes.Element) r11     // Catch: java.lang.Exception -> L16d
            r12 = 0
            java.lang.String r13 = r11.data()     // Catch: java.lang.Exception -> L16d
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13     // Catch: java.lang.Exception -> L16d
            java.lang.String r14 = "eval"
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14     // Catch: java.lang.Exception -> L16d
            boolean r13 = kotlin.text.StringsKt.contains$default(r13, r14, r0, r3, r1)     // Catch: java.lang.Exception -> L16d
            if (r13 == 0) goto L14e
            goto L179
        L16d:
            r0 = move-exception
            r22 = r28
            r1 = r33
            r2 = r18
            r4 = r24
            goto L33d
        L178:
            r7 = r1
        L179:
            org.jsoup.nodes.Element r7 = (org.jsoup.nodes.Element) r7     // Catch: java.lang.Exception -> L30e
            if (r7 == 0) goto L30b
        L17e:
            java.lang.String r5 = r7.data()     // Catch: java.lang.Exception -> L30e
            if (r5 == 0) goto L30b
            java.lang.String r7 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getAndUnpack(r5)     // Catch: java.lang.Exception -> L30e
            java.lang.String r11 = "var links={"
            r12 = r21
            java.lang.String r11 = kotlin.text.StringsKt.substringAfter(r7, r11, r12)     // Catch: java.lang.Exception -> L30e
            java.lang.String r13 = "};"
            java.lang.String r11 = kotlin.text.StringsKt.substringBefore(r11, r13, r12)     // Catch: java.lang.Exception -> L30e
            r12 = r11
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch: java.lang.Exception -> L30e
            int r12 = r12.length()     // Catch: java.lang.Exception -> L30e
            if (r12 != 0) goto L1a1
            goto L1a3
        L1a1:
            r23 = 0
        L1a3:
            if (r23 == 0) goto L1a8
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L16d
            return r0
        L1a8:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30e
            r12.<init>()     // Catch: java.lang.Exception -> L30e
            r13 = 123(0x7b, float:1.72E-43)
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch: java.lang.Exception -> L30e
            java.lang.StringBuilder r12 = r12.append(r11)     // Catch: java.lang.Exception -> L30e
            r13 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch: java.lang.Exception -> L30e
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Exception -> L30e
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: java.lang.Exception -> L30e
            r13.<init>(r12)     // Catch: java.lang.Exception -> L30e
            java.util.Iterator r14 = r13.keys()     // Catch: java.lang.Exception -> L30e
            r15 = 0
            r22 = r28
            r20 = r11
            r19 = r12
            r21 = r14
            r11 = r18
            r12 = r2
            r14 = r13
            r13 = r15
            r2 = r33
            r15 = r21
        L1dc:
            boolean r16 = r15.hasNext()     // Catch: java.lang.Exception -> L2ff
            if (r16 == 0) goto L2f3
            java.lang.Object r16 = r15.next()     // Catch: java.lang.Exception -> L2ff
            r23 = r16
            r16 = r23
            java.lang.String r16 = (java.lang.String) r16     // Catch: java.lang.Exception -> L2ff
            r29 = r16
            r0 = 0
            r1 = r29
            java.lang.String r16 = r14.getString(r1)     // Catch: java.lang.Exception -> L2ff
            r29 = r16
            java.lang.String r3 = "http"
            r30 = r1
            r31 = r4
            r32 = r5
            r4 = 2
            r5 = 0
            r1 = r29
            r29 = r2
            r2 = 0
            boolean r3 = kotlin.text.StringsKt.startsWith$default(r1, r3, r5, r4, r2)     // Catch: java.lang.Exception -> L2e9
            if (r3 != 0) goto L21e
            r3 = r22
            com.lagradost.cloudstream3.utils.ExtractorApi r3 = (com.lagradost.cloudstream3.utils.ExtractorApi) r3     // Catch: java.lang.Exception -> L216
            java.lang.String r3 = com.lagradost.cloudstream3.utils.ExtractorApiKt.fixUrl(r3, r1)     // Catch: java.lang.Exception -> L216
            r1 = r3
            goto L21e
        L216:
            r0 = move-exception
            r1 = r29
            r2 = r11
            r4 = r24
            goto L33d
        L21e:
            java.lang.String r3 = r22.getName()     // Catch: java.lang.Exception -> L2e9
            r4 = r12
            java.lang.String r12 = r22.getName()     // Catch: java.lang.Exception -> L2e9
            com.lagradost.cloudstream3.utils.ExtractorLinkType r16 = com.lagradost.cloudstream3.utils.ExtractorLinkType.M3U8     // Catch: java.lang.Exception -> L2e9
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> L2e9
            r11.L$0 = r2     // Catch: java.lang.Exception -> L2e9
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)     // Catch: java.lang.Exception -> L2e9
            r11.L$1 = r2     // Catch: java.lang.Exception -> L2e9
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)     // Catch: java.lang.Exception -> L2e9
            r11.L$2 = r2     // Catch: java.lang.Exception -> L2e9
            r11.L$3 = r6     // Catch: java.lang.Exception -> L2e9
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r31)     // Catch: java.lang.Exception -> L2e9
            r11.L$4 = r2     // Catch: java.lang.Exception -> L2e9
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r32)     // Catch: java.lang.Exception -> L2e9
            r11.L$5 = r2     // Catch: java.lang.Exception -> L2e9
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)     // Catch: java.lang.Exception -> L2e9
            r11.L$6 = r2     // Catch: java.lang.Exception -> L2e9
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r20)     // Catch: java.lang.Exception -> L2e9
            r11.L$7 = r2     // Catch: java.lang.Exception -> L2e9
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)     // Catch: java.lang.Exception -> L2e9
            r11.L$8 = r2     // Catch: java.lang.Exception -> L2e9
            r11.L$9 = r14     // Catch: java.lang.Exception -> L2e9
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r21)     // Catch: java.lang.Exception -> L2e9
            r11.L$10 = r2     // Catch: java.lang.Exception -> L2e9
            r11.L$11 = r15     // Catch: java.lang.Exception -> L2e9
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)     // Catch: java.lang.Exception -> L2e9
            r11.L$12 = r2     // Catch: java.lang.Exception -> L2e9
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r30)     // Catch: java.lang.Exception -> L2e9
            r11.L$13 = r2     // Catch: java.lang.Exception -> L2e9
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)     // Catch: java.lang.Exception -> L2e9
            r11.L$14 = r2     // Catch: java.lang.Exception -> L2e9
            r11.L$15 = r6     // Catch: java.lang.Exception -> L2e9
            r11.I$0 = r13     // Catch: java.lang.Exception -> L2e9
            r11.I$1 = r0     // Catch: java.lang.Exception -> L2e9
            r2 = 2
            r11.label = r2     // Catch: java.lang.Exception -> L2e9
            r17 = r15
            r15 = 0
            r18 = r17
            r17 = 16
            r25 = r18
            r18 = 0
            r27 = r13
            r13 = r1
            r1 = r27
            r27 = r11
            r11 = r3
            r3 = r14
            r14 = r16
            r16 = r27
            java.lang.Object r11 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink$default(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Exception -> L2e0
            if (r11 != r4) goto L2a2
            return r4
        L2a2:
            r12 = r30
            r14 = r1
            r15 = r3
            r3 = r4
            r4 = r11
            r11 = r13
            r17 = r20
            r18 = r21
            r13 = r23
            r1 = r29
            r21 = r32
            r20 = r7
            r23 = r22
            r22 = r31
            r7 = r6
        L2ba:
            r7.invoke(r4)     // Catch: java.lang.Exception -> L2d7
            r2 = r1
            r12 = r3
            r13 = r14
            r14 = r15
            r11 = r16
            r7 = r20
            r5 = r21
            r4 = r22
            r22 = r23
            r15 = r25
            r0 = 0
            r1 = 0
            r3 = 2
            r20 = r17
            r21 = r18
            goto L1dc
        L2d7:
            r0 = move-exception
            r2 = r16
            r22 = r23
            r4 = r24
            goto L33d
        L2e0:
            r0 = move-exception
            r1 = r29
            r2 = r16
            r4 = r24
            goto L33d
        L2e9:
            r0 = move-exception
            r16 = r11
            r1 = r29
            r2 = r16
            r4 = r24
            goto L33d
        L2f3:
            r29 = r2
            r31 = r4
            r32 = r5
            r16 = r11
            r1 = r13
            r3 = r14
            goto L35d
        L2ff:
            r0 = move-exception
            r29 = r2
            r16 = r11
            r1 = r29
            r2 = r16
            r4 = r24
            goto L33d
        L30b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L30e
            return r0
        L30e:
            r0 = move-exception
            r22 = r28
            r1 = r33
            r2 = r18
            r4 = r24
            goto L33d
        L318:
            r0 = move-exception
            r22 = r28
            r10 = r29
            r9 = r30
            r8 = r31
            r6 = r32
            r1 = r33
            r2 = r18
            r4 = r24
            goto L33d
        L32a:
            r0 = move-exception
            r18 = r2
            r24 = r6
            r22 = r28
            r10 = r29
            r9 = r30
            r8 = r31
            r6 = r32
            r1 = r33
            r4 = r24
        L33d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "\u274c L\u1ed7i khi parse Davioad: "
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r5 = r0.getMessage()
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.io.PrintStream r5 = java.lang.System.out
            r5.println(r3)
            r11 = r2
            r24 = r4
            r2 = r1
        L35d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
