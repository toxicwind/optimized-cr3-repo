package com.Jayboys;

/* JADX INFO: compiled from: Extractors.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump_unblinded/Jayboys/classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/Jayboys/Base64Extractor;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "mainUrl", "getMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "customBase64Decoder", "encodedString", "getEncodedString", "json", "Jayboys"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class Base64Extractor extends com.lagradost.cloudstream3.utils.ExtractorApi {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String mainUrl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;
    private final boolean requiresReferer;

    /* JADX INFO: renamed from: com.Jayboys.Base64Extractor$getUrl$1 */
    /* JADX INFO: compiled from: Extractors.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Jayboys.Base64Extractor", f = "Extractors.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {192, 236}, m = "getUrl$suspendImpl", n = {"$this", "url", "referer", "$this", "url", "referer", "document", "script", "pattern", "matchResult", "jsonArray", "encodedString", "decodedString", "videos", "externalLinkList", "video", "quality", "format", "videoUrl", "isVHQ", "i", "isM3u8"}, nl = {197, 235}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "I$0", "I$1", "I$3"}, v = 2)
    static final class C00001 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$10;
        java.lang.Object L$11;
        java.lang.Object L$12;
        java.lang.Object L$13;
        java.lang.Object L$14;
        java.lang.Object L$15;
        java.lang.Object L$16;
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
        final /* synthetic */ com.Jayboys.Base64Extractor this$0;

        C00001(com.Jayboys.Base64Extractor r1, kotlin.coroutines.Continuation<? super com.Jayboys.Base64Extractor.C00001> r2) {
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
                com.Jayboys.Base64Extractor r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = com.Jayboys.Base64Extractor.getUrl$suspendImpl(r0, r1, r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: com.Jayboys.Base64Extractor$getUrl$2 */
    /* JADX INFO: compiled from: Extractors.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Jayboys.Base64Extractor$getUrl$2", f = "Extractors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00012 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.internal.Ref.IntRef $quality;
        private /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ com.Jayboys.Base64Extractor this$0;

        C00012(com.Jayboys.Base64Extractor r2, kotlin.jvm.internal.Ref.IntRef r3, kotlin.coroutines.Continuation<? super com.Jayboys.Base64Extractor.C00012> r4) {
                r1 = this;
                r1.this$0 = r2
                r1.$quality = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                com.Jayboys.Base64Extractor$getUrl$2 r0 = new com.Jayboys.Base64Extractor$getUrl$2
                com.Jayboys.Base64Extractor r1 = r3.this$0
                kotlin.jvm.internal.Ref$IntRef r2 = r3.$quality
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        public final java.lang.Object invoke(com.lagradost.cloudstream3.utils.ExtractorLink r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                com.Jayboys.Base64Extractor$getUrl$2 r0 = (com.Jayboys.Base64Extractor.C00012) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
                r1 = this;
                com.lagradost.cloudstream3.utils.ExtractorLink r2 = (com.lagradost.cloudstream3.utils.ExtractorLink) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = r3.L$0
                com.lagradost.cloudstream3.utils.ExtractorLink r0 = (com.lagradost.cloudstream3.utils.ExtractorLink) r0
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
                com.Jayboys.Base64Extractor r1 = r3.this$0
                java.lang.String r1 = r1.getMainUrl()
                r0.setReferer(r1)
                kotlin.jvm.internal.Ref$IntRef r1 = r3.$quality
                int r1 = r1.element
                r0.setQuality(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    public Base64Extractor() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Base64"
            r1.name = r0
            java.lang.String r0 = "base64"
            r1.mainUrl = r0
            return
    }

    private final java.lang.String customBase64Decoder(java.lang.String r15) {
            r14 = this;
            java.lang.String r0 = "\u0410\u0412\u0421D\u0415FGHIJKL\u041cNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.,~"
            java.lang.String r1 = ""
            r2 = 0
            r3 = r15
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            kotlin.text.Regex r4 = new kotlin.text.Regex
            java.lang.String r5 = "[^\u0410\u0412\u0421\u0415\u041cA-Za-z0-9.,~]"
            r4.<init>(r5)
            java.lang.String r5 = ""
            java.lang.String r3 = r4.replace(r3, r5)
        L15:
            int r4 = r2 + 3
            int r5 = r3.length()
            if (r4 >= r5) goto Lae
            r6 = r0
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r4 = r2 + 1
            char r7 = r3.charAt(r2)
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            int r2 = kotlin.text.StringsKt.indexOf$default(r6, r7, r8, r9, r10, r11)
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r11 = r4 + 1
            char r6 = r3.charAt(r4)
            r9 = 6
            r10 = 0
            r7 = 0
            int r4 = kotlin.text.StringsKt.indexOf$default(r5, r6, r7, r8, r9, r10)
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r12 = r11 + 1
            char r6 = r3.charAt(r11)
            int r5 = kotlin.text.StringsKt.indexOf$default(r5, r6, r7, r8, r9, r10)
            r6 = r0
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r13 = r12 + 1
            char r7 = r3.charAt(r12)
            r10 = 6
            r11 = 0
            r9 = 0
            int r6 = kotlin.text.StringsKt.indexOf$default(r6, r7, r8, r9, r10, r11)
            int r7 = r2 << 2
            int r8 = r4 >> 4
            r7 = r7 | r8
            r8 = r4 & 15
            int r8 = r8 << 4
            int r9 = r5 >> 2
            r8 = r8 | r9
            r9 = r5 & 3
            int r9 = r9 << 6
            r9 = r9 | r6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r10 = r10.append(r1)
            char r11 = (char) r7
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r1 = r10.toString()
            r10 = 64
            if (r5 == r10) goto L94
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r11 = r11.append(r1)
            char r12 = (char) r8
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r1 = r11.toString()
        L94:
            if (r6 == r10) goto Lab
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r10 = r10.append(r1)
            char r11 = (char) r9
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r1 = r10.toString()
            r2 = r13
            goto L15
        Lab:
            r2 = r13
            goto L15
        Lae:
            java.lang.String r4 = "UTF-8"
            java.lang.String r4 = java.net.URLDecoder.decode(r1, r4)
            return r4
    }

    private final java.lang.String getEncodedString(java.lang.String r6) {
            r5 = this;
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "'([^']+)',"
            r0.<init>(r1)
            if (r6 != 0) goto Lc
            java.lang.String r1 = ""
            goto Ld
        Lc:
            r1 = r6
        Ld:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            r3 = 2
            r4 = 0
            kotlin.text.MatchResult r1 = kotlin.text.Regex.find$default(r0, r1, r2, r3, r4)
            if (r1 == 0) goto L29
            kotlin.text.MatchGroupCollection r1 = r1.getGroups()
            if (r1 == 0) goto L29
            r2 = 1
            kotlin.text.MatchGroup r1 = r1.get(r2)
            if (r1 == 0) goto L29
            java.lang.String r4 = r1.getValue()
        L29:
            return r4
    }

    static /* synthetic */ java.lang.Object getUrl$suspendImpl(com.Jayboys.Base64Extractor r33, java.lang.String r34, java.lang.String r35, kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.utils.ExtractorLink>> r36) {
            r0 = r33
            r1 = r36
            boolean r2 = r1 instanceof com.Jayboys.Base64Extractor.C00001
            if (r2 == 0) goto L18
            r2 = r1
            com.Jayboys.Base64Extractor$getUrl$1 r2 = (com.Jayboys.Base64Extractor.C00001) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Jayboys.Base64Extractor$getUrl$1 r2 = new com.Jayboys.Base64Extractor$getUrl$1
            r2.<init>(r0, r1)
        L1d:
            java.lang.Object r3 = r2.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.label
            java.lang.String r6 = ""
            switch(r5) {
                case 0: goto Lde;
                case 1: goto Lc0;
                case 2: goto L32;
                default: goto L2a;
            }
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L32:
            int r5 = r2.I$3
            int r10 = r2.I$2
            int r11 = r2.I$1
            int r12 = r2.I$0
            java.lang.Object r13 = r2.L$16
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r2.L$15
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r2.L$14
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r7 = r2.L$13
            kotlin.jvm.internal.Ref$IntRef r7 = (kotlin.jvm.internal.Ref.IntRef) r7
            java.lang.Object r9 = r2.L$12
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            java.lang.Object r8 = r2.L$11
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r1 = r2.L$10
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            r19 = r1
            java.lang.Object r1 = r2.L$9
            java.lang.String r1 = (java.lang.String) r1
            r20 = r1
            java.lang.Object r1 = r2.L$8
            java.lang.String r1 = (java.lang.String) r1
            r21 = r1
            java.lang.Object r1 = r2.L$7
            java.lang.String r1 = (java.lang.String) r1
            r22 = r1
            java.lang.Object r1 = r2.L$6
            kotlin.text.MatchResult r1 = (kotlin.text.MatchResult) r1
            r23 = r1
            java.lang.Object r1 = r2.L$5
            kotlin.text.Regex r1 = (kotlin.text.Regex) r1
            r24 = r1
            java.lang.Object r1 = r2.L$4
            java.lang.String r1 = (java.lang.String) r1
            r25 = r1
            java.lang.Object r1 = r2.L$3
            org.jsoup.nodes.Document r1 = (org.jsoup.nodes.Document) r1
            r26 = r1
            java.lang.Object r1 = r2.L$2
            java.lang.String r1 = (java.lang.String) r1
            r35 = r1
            java.lang.Object r1 = r2.L$1
            java.lang.String r1 = (java.lang.String) r1
            r34 = r1
            java.lang.Object r1 = r2.L$0
            r0 = r1
            com.Jayboys.Base64Extractor r0 = (com.Jayboys.Base64Extractor) r0
            kotlin.ResultKt.throwOnFailure(r3)
            r28 = r2
            r30 = r6
            r18 = r14
            r2 = r19
            r16 = r21
            r32 = r22
            r17 = r23
            r31 = r24
            r29 = r25
            r19 = r26
            r24 = r3
            r23 = r10
            r14 = r11
            r22 = r15
            r10 = 0
            r11 = r4
            r15 = r13
            r4 = 2
            r13 = r9
            r9 = r5
            r5 = r0
            r0 = r36
            r1 = r34
            r6 = r35
            goto L324
        Lc0:
            java.lang.Object r1 = r2.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r2.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r7 = r2.L$0
            r0 = r7
            com.Jayboys.Base64Extractor r0 = (com.Jayboys.Base64Extractor) r0
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r2
            r20 = r3
            r2 = r4
            r22 = r6
            r3 = r0
            r4 = r1
            r6 = r20
            r0 = 2
            r1 = 0
            goto L131
        Lde:
            kotlin.ResultKt.throwOnFailure(r3)
            r1 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r2.L$0 = r0
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r34)
            r2.L$1 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r35)
            r2.L$2 = r5
            r5 = 1
            r2.label = r5
            r18 = 1
            r5 = 0
            r7 = r6
            r6 = 0
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
            r19 = r15
            r15 = 0
            r20 = 2
            r16 = 0
            r21 = 1
            r18 = 4094(0xffe, float:5.737E-42)
            r22 = r19
            r19 = 0
            r20 = r1
            r17 = r2
            r2 = r4
            r0 = 2
            r1 = 0
            r4 = r34
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r3 != r2) goto L12a
            return r2
        L12a:
            r5 = r34
            r4 = r35
            r6 = r3
            r3 = r33
        L131:
            com.lagradost.nicehttp.NiceResponse r6 = (com.lagradost.nicehttp.NiceResponse) r6
            org.jsoup.nodes.Document r6 = r6.getDocument()
            java.lang.String r7 = "//script[contains(text(),'let vpage_data')]"
            org.jsoup.select.Elements r7 = r6.selectXpath(r7)
            org.jsoup.nodes.Element r7 = r7.first()
            if (r7 == 0) goto L14b
        L146:
            java.lang.String r9 = r7.html()
            goto L14c
        L14b:
            r9 = r1
        L14c:
            r7 = 0
            r8 = 0
            if (r9 == 0) goto L15f
            r10 = r9
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.String r11 = "VHQ"
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r10 = kotlin.text.StringsKt.contains$default(r10, r11, r8, r0, r1)
            if (r10 == 0) goto L15f
            r7 = 1
        L15f:
            kotlin.text.Regex r10 = new kotlin.text.Regex
            java.lang.String r11 = "window\\.initPlayer\\((.*])\\);"
            r10.<init>(r11)
            if (r9 != 0) goto L16b
            r11 = r22
            goto L16c
        L16b:
            r11 = r9
        L16c:
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            kotlin.text.MatchResult r8 = kotlin.text.Regex.find$default(r10, r11, r8, r0, r1)
            if (r8 == 0) goto L186
            kotlin.text.MatchGroupCollection r11 = r8.getGroups()
            if (r11 == 0) goto L186
            r12 = 1
            kotlin.text.MatchGroup r11 = r11.get(r12)
            if (r11 == 0) goto L187
            java.lang.String r11 = r11.getValue()
            goto L188
        L186:
            r12 = 1
        L187:
            r11 = r1
        L188:
            java.lang.String r13 = r3.getEncodedString(r11)
            if (r13 != 0) goto L18f
            return r1
        L18f:
            java.lang.String r14 = r3.customBase64Decoder(r13)
            org.json.JSONObject r15 = new org.json.JSONObject
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{ videos:"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r14)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            java.lang.String r0 = "videos"
            org.json.JSONArray r0 = r15.getJSONArray(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            r15 = 0
            int r19 = r0.length()
            r33 = r2
            r2 = r0
            r0 = r7
            r7 = r33
            r33 = r36
            r34 = r5
            r12 = r15
            r5 = r17
            r15 = r19
        L1d2:
            if (r12 >= r15) goto L361
            r35 = r4
            org.json.JSONObject r4 = r2.getJSONObject(r12)
            kotlin.jvm.internal.Ref$IntRef r17 = new kotlin.jvm.internal.Ref$IntRef
            r17.<init>()
            r36 = r17
            com.lagradost.cloudstream3.utils.Qualities r17 = com.lagradost.cloudstream3.utils.Qualities.Unknown
            r19 = r6
            int r6 = r17.getValue()
            r17 = r8
            r8 = r36
            r8.element = r6
            r6 = 0
            r36 = r6
            java.lang.String r6 = "format"
            r29 = r9
            r9 = r22
            java.lang.String r6 = r4.optString(r6, r9)
            r22 = r6
            r6 = r22
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r23 = "lq"
            r30 = r9
            r9 = r23
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r31 = r10
            r10 = 1
            boolean r6 = kotlin.text.StringsKt.contains(r6, r9, r10)
            if (r6 == 0) goto L21c
            com.lagradost.cloudstream3.utils.Qualities r6 = com.lagradost.cloudstream3.utils.Qualities.P480
            int r6 = r6.getValue()
            r8.element = r6
            goto L232
        L21c:
            r6 = r22
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r9 = "hq"
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r6 = kotlin.text.StringsKt.contains(r6, r9, r10)
            if (r6 == 0) goto L232
            com.lagradost.cloudstream3.utils.Qualities r6 = com.lagradost.cloudstream3.utils.Qualities.P720
            int r6 = r6.getValue()
            r8.element = r6
        L232:
            java.lang.String r6 = "video_url"
            java.lang.String r6 = r4.getString(r6)
            java.lang.String r6 = r3.customBase64Decoder(r6)
            if (r0 == 0) goto L25b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r9 = r9.append(r6)
            java.lang.String r10 = "&f=video.m3u8"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r6 = r9.toString()
            r9 = 1
            com.lagradost.cloudstream3.utils.Qualities r10 = com.lagradost.cloudstream3.utils.Qualities.Unknown
            int r10 = r10.getValue()
            r8.element = r10
            goto L25d
        L25b:
            r9 = r36
        L25d:
            com.lagradost.api.Log r10 = com.lagradost.api.Log.INSTANCE
            r36 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r32 = r11
            java.lang.String r11 = "Decoded video URL = "
            java.lang.StringBuilder r4 = r4.append(r11)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r11 = "Base64Extractor"
            r10.d(r11, r4)
            java.lang.String r23 = r3.getName()
            java.lang.String r24 = r3.getName()
            r4 = r3
            com.lagradost.cloudstream3.utils.ExtractorApi r4 = (com.lagradost.cloudstream3.utils.ExtractorApi) r4
            java.lang.String r25 = com.lagradost.cloudstream3.utils.ExtractorApiKt.fixUrl(r4, r6)
            if (r9 == 0) goto L291
            com.lagradost.cloudstream3.utils.ExtractorLinkType r4 = com.lagradost.cloudstream3.utils.ExtractorLinkType.M3U8
            goto L293
        L291:
            com.lagradost.cloudstream3.utils.ExtractorLinkType r4 = com.lagradost.cloudstream3.utils.ExtractorLinkType.VIDEO
        L293:
            r26 = r4
            com.Jayboys.Base64Extractor$getUrl$2 r4 = new com.Jayboys.Base64Extractor$getUrl$2
            r10 = 0
            r4.<init>(r3, r8, r10)
            r27 = r4
            kotlin.jvm.functions.Function2 r27 = (kotlin.jvm.functions.Function2) r27
            r5.L$0 = r3
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r34)
            r5.L$1 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r35)
            r5.L$2 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)
            r5.L$3 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r29)
            r5.L$4 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r31)
            r5.L$5 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r17)
            r5.L$6 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r32)
            r5.L$7 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r5.L$8 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r5.L$9 = r4
            r5.L$10 = r2
            r5.L$11 = r1
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r36)
            r5.L$12 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r5.L$13 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r5.L$14 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r5.L$15 = r4
            r5.L$16 = r1
            r5.I$0 = r0
            r5.I$1 = r12
            r5.I$2 = r15
            r5.I$3 = r9
            r4 = 2
            r5.label = r4
            r28 = r5
            java.lang.Object r5 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r23, r24, r25, r26, r27, r28)
            if (r5 != r7) goto L309
            return r7
        L309:
            r11 = r5
            r5 = r3
            r3 = r11
            r18 = r6
            r11 = r7
            r7 = r8
            r16 = r13
            r23 = r15
            r24 = r20
            r13 = r36
            r8 = r1
            r15 = r8
            r20 = r14
            r14 = r12
            r12 = r0
            r0 = r33
            r6 = r35
            r1 = r34
        L324:
            r15.add(r3)
            if (r12 != 0) goto L34d
            int r3 = r14 + 1
            r33 = r0
            r34 = r1
            r4 = r6
            r1 = r8
            r7 = r11
            r0 = r12
            r13 = r16
            r8 = r17
            r6 = r19
            r14 = r20
            r15 = r23
            r20 = r24
            r9 = r29
            r22 = r30
            r10 = r31
            r11 = r32
            r12 = r3
            r3 = r5
            r5 = r28
            goto L1d2
        L34d:
            r3 = r2
            r4 = r6
            r13 = r16
            r14 = r20
            r20 = r24
            r2 = r1
            r1 = r0
            r0 = r12
            r6 = r19
            r9 = r29
            r10 = r31
            r11 = r32
            goto L376
        L361:
            r35 = r4
            r28 = r5
            r19 = r6
            r17 = r8
            r29 = r9
            r31 = r10
            r32 = r11
            r8 = r1
            r5 = r3
            r1 = r33
            r3 = r2
            r2 = r34
        L376:
            return r8
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
    public java.lang.Object getUrl(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.utils.ExtractorLink>> r4) {
            r1 = this;
            java.lang.Object r0 = getUrl$suspendImpl(r1, r2, r3, r4)
            return r0
    }
}
