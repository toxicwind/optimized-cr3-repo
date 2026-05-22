package com.Jayboys;

/* JADX INFO: compiled from: Extractors.kt */
/* JADX INFO: loaded from: /tmp/tmp.3pMnvANAev/classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/Jayboys/VoeExtractor;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "mainUrl", "getMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "VideoSource", "Jayboys"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nExtractors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extractors.kt\ncom/Jayboys/VoeExtractor\n+ 2 AppUtils.kt\ncom/lagradost/cloudstream3/utils/AppUtils\n+ 3 Extensions.kt\ncom/fasterxml/jackson/module/kotlin/ExtensionsKt\n*L\n1#1,306:1\n23#2,2:307\n15#2:309\n25#2,2:312\n50#3:310\n43#3:311\n*S KotlinDebug\n*F\n+ 1 Extractors.kt\ncom/Jayboys/VoeExtractor\n*L\n94#1:307,2\n94#1:309\n94#1:312,2\n94#1:310\n94#1:311\n*E\n"})
public class VoeExtractor extends com.lagradost.cloudstream3.utils.ExtractorApi {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String mainUrl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;
    private final boolean requiresReferer;

    /* JADX INFO: compiled from: Extractors.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/Jayboys/VoeExtractor$VideoSource;", "", "url", "", "height", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getUrl", "()Ljava/lang/String;", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/Jayboys/VoeExtractor$VideoSource;", "equals", "", "other", "hashCode", "toString", "Jayboys"}, k = 1, mv = {2, 3, 0}, xi = 48)
    private static final class VideoSource {

        @com.fasterxml.jackson.annotation.JsonProperty("video_height")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer height;

        @com.fasterxml.jackson.annotation.JsonProperty("hls")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String url;

        public VideoSource(@com.fasterxml.jackson.annotation.JsonProperty("hls") @org.jetbrains.annotations.Nullable java.lang.String r1, @com.fasterxml.jackson.annotation.JsonProperty("video_height") @org.jetbrains.annotations.Nullable java.lang.Integer r2) {
                r0 = this;
                r0.<init>()
                r0.url = r1
                r0.height = r2
                return
        }

        public static /* synthetic */ com.Jayboys.VoeExtractor.VideoSource copy$default(com.Jayboys.VoeExtractor.VideoSource r0, java.lang.String r1, java.lang.Integer r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.url
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.Integer r2 = r0.height
            Lc:
                com.Jayboys.VoeExtractor$VideoSource r0 = r0.copy(r1, r2)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.url
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component2() {
                r1 = this;
                java.lang.Integer r0 = r1.height
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.Jayboys.VoeExtractor.VideoSource copy(@com.fasterxml.jackson.annotation.JsonProperty("hls") @org.jetbrains.annotations.Nullable java.lang.String r2, @com.fasterxml.jackson.annotation.JsonProperty("video_height") @org.jetbrains.annotations.Nullable java.lang.Integer r3) {
                r1 = this;
                com.Jayboys.VoeExtractor$VideoSource r0 = new com.Jayboys.VoeExtractor$VideoSource
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof com.Jayboys.VoeExtractor.VideoSource
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                r1 = r6
                com.Jayboys.VoeExtractor$VideoSource r1 = (com.Jayboys.VoeExtractor.VideoSource) r1
                java.lang.String r3 = r5.url
                java.lang.String r4 = r1.url
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
                if (r3 != 0) goto L18
                return r2
            L18:
                java.lang.Integer r3 = r5.height
                java.lang.Integer r1 = r1.height
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
                if (r1 != 0) goto L23
                return r2
            L23:
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getHeight() {
                r1 = this;
                java.lang.Integer r0 = r1.height
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getUrl() {
                r1 = this;
                java.lang.String r0 = r1.url
                return r0
        }

        public int hashCode() {
                r4 = this;
                java.lang.String r0 = r4.url
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Ld
            L7:
                java.lang.String r0 = r4.url
                int r0 = r0.hashCode()
            Ld:
                int r2 = r0 * 31
                java.lang.Integer r3 = r4.height
                if (r3 != 0) goto L14
                goto L1a
            L14:
                java.lang.Integer r1 = r4.height
                int r1 = r1.hashCode()
            L1a:
                int r2 = r2 + r1
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "VideoSource(url="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r2.url
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", height="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Integer r1 = r2.height
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 41
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: com.Jayboys.VoeExtractor$getUrl$1 */
    /* JADX INFO: compiled from: Extractors.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Jayboys.VoeExtractor", f = "Extractors.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {85, 97}, m = "getUrl$suspendImpl", n = {"$this", "url", "referer", "$this", "url", "referer", "response", "jsonMatch", "source", "videoUrl", "$i$a$-let-VoeExtractor$getUrl$2", "$i$a$-let-VoeExtractor$getUrl$2$1"}, nl = {86, 96}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"}, v = 2)
    static final class C00141 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        java.lang.Object L$6;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ com.Jayboys.VoeExtractor this$0;

        C00141(com.Jayboys.VoeExtractor r1, kotlin.coroutines.Continuation<? super com.Jayboys.VoeExtractor.C00141> r2) {
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
                com.Jayboys.VoeExtractor r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = com.Jayboys.VoeExtractor.getUrl$suspendImpl(r0, r1, r1, r2)
                return r0
        }
    }

    public VoeExtractor() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Voe"
            r1.name = r0
            java.lang.String r0 = "https://jilliandescribecompany.com"
            r1.mainUrl = r0
            return
    }

    static /* synthetic */ java.lang.Object getUrl$suspendImpl(com.Jayboys.VoeExtractor r21, java.lang.String r22, java.lang.String r23, kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.utils.ExtractorLink>> r24) {
            r0 = r21
            r1 = r24
            boolean r2 = r1 instanceof com.Jayboys.VoeExtractor.C00141
            if (r2 == 0) goto L18
            r2 = r1
            com.Jayboys.VoeExtractor$getUrl$1 r2 = (com.Jayboys.VoeExtractor.C00141) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Jayboys.VoeExtractor$getUrl$1 r2 = new com.Jayboys.VoeExtractor$getUrl$1
            r2.<init>(r0, r1)
        L1d:
            r8 = r2
            java.lang.Object r2 = r8.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r8.label
            r5 = 1
            switch(r4) {
                case 0: goto L72;
                case 1: goto L5b;
                case 2: goto L32;
                default: goto L2a;
            }
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L32:
            int r3 = r8.I$1
            int r4 = r8.I$0
            java.lang.Object r5 = r8.L$6
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r8.L$5
            com.Jayboys.VoeExtractor$VideoSource r6 = (com.Jayboys.VoeExtractor.VideoSource) r6
            java.lang.Object r7 = r8.L$4
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r8.L$3
            com.lagradost.nicehttp.NiceResponse r9 = (com.lagradost.nicehttp.NiceResponse) r9
            java.lang.Object r10 = r8.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r8.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r8.L$0
            r0 = r12
            com.Jayboys.VoeExtractor r0 = (com.Jayboys.VoeExtractor) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r16 = r3
            r3 = r2
            goto L1a4
        L5b:
            java.lang.Object r4 = r8.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r8.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r8.L$0
            r0 = r7
            com.Jayboys.VoeExtractor r0 = (com.Jayboys.VoeExtractor) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r11 = r0
            r1 = r3
            r13 = r4
            r12 = r6
            r0 = 1
            r3 = r2
            goto Lc0
        L72:
            kotlin.ResultKt.throwOnFailure(r2)
            r4 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r8.L$0 = r0
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r8.L$1 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)
            r8.L$2 = r6
            r8.label = r5
            r6 = 1
            r5 = 0
            r7 = 1
            r6 = 0
            r9 = 1
            r7 = 0
            r17 = r8
            r8 = 0
            r10 = 1
            r9 = 0
            r11 = 1
            r10 = 0
            r12 = 1
            r11 = 0
            r14 = 1
            r12 = 0
            r15 = 1
            r14 = 0
            r16 = 1
            r15 = 0
            r18 = 1
            r16 = 0
            r19 = 1
            r18 = 4094(0xffe, float:5.737E-42)
            r20 = 1
            r19 = 0
            r1 = r4
            r0 = 1
            r4 = r22
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r8 = r17
            if (r3 != r1) goto Lba
            return r1
        Lba:
            r11 = r21
            r12 = r22
            r13 = r23
        Lc0:
            r14 = r3
            com.lagradost.nicehttp.NiceResponse r14 = (com.lagradost.nicehttp.NiceResponse) r14
            int r3 = r14.getCode()
            r4 = 404(0x194, float:5.66E-43)
            if (r3 != r4) goto Ld0
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        Ld0:
            kotlin.text.Regex r3 = new kotlin.text.Regex
            java.lang.String r4 = "const\\s+sources\\s*=\\s*(\\{.*?\\});"
            r3.<init>(r4)
            java.lang.String r4 = r14.getText()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = 0
            r6 = 2
            r7 = 0
            kotlin.text.MatchResult r3 = kotlin.text.Regex.find$default(r3, r4, r5, r6, r7)
            if (r3 == 0) goto L1c6
        Lea:
            java.util.List r3 = r3.getGroupValues()
            if (r3 == 0) goto L1c6
        Lf1:
            java.lang.Object r0 = r3.get(r0)
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto L1c6
        Lfb:
            r19 = 4
            r20 = 0
            java.lang.String r16 = "0,"
            java.lang.String r17 = "0"
            r18 = 0
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L1c6
            r15 = r0
            com.lagradost.cloudstream3.utils.AppUtils r3 = com.lagradost.cloudstream3.utils.AppUtils.INSTANCE
            r4 = r15
            r5 = 0
            r0 = r4
            r9 = r3
            r10 = 0
            com.fasterxml.jackson.databind.json.JsonMapper r16 = com.lagradost.cloudstream3.MainAPIKt.getMapper()     // Catch: java.lang.Exception -> L137
            com.fasterxml.jackson.databind.ObjectMapper r16 = (com.fasterxml.jackson.databind.ObjectMapper) r16     // Catch: java.lang.Exception -> L137
            r21 = r0
            r22 = r16
            r16 = 0
            r17 = 0
            com.Jayboys.VoeExtractor$getUrl$suspendImpl$$inlined$tryParseJson$1 r18 = new com.Jayboys.VoeExtractor$getUrl$suspendImpl$$inlined$tryParseJson$1     // Catch: java.lang.Exception -> L137
            r18.<init>()     // Catch: java.lang.Exception -> L137
            r7 = r18
            com.fasterxml.jackson.core.type.TypeReference r7 = (com.fasterxml.jackson.core.type.TypeReference) r7     // Catch: java.lang.Exception -> L137
            r6 = r21
            r21 = r0
            r0 = r22
            java.lang.Object r7 = r0.readValue(r6, r7)     // Catch: java.lang.Exception -> L137
            goto L139
        L137:
            r0 = move-exception
            r7 = 0
        L139:
            com.Jayboys.VoeExtractor$VideoSource r7 = (com.Jayboys.VoeExtractor.VideoSource) r7
            if (r7 == 0) goto L1c1
            r0 = r7
            r3 = 0
            java.lang.String r5 = r0.getUrl()
            if (r5 == 0) goto L1b9
            r4 = 0
            java.lang.String r6 = r11.getName()
            java.lang.String r7 = r11.getName()
            r9 = r6
            com.lagradost.cloudstream3.utils.ExtractorLinkType r6 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r8.L$0 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r8.L$1 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r8.L$2 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r8.L$3 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r8.L$4 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r8.L$5 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r8.L$6 = r10
            r8.I$0 = r3
            r8.I$1 = r4
            r10 = 2
            r8.label = r10
            r10 = r3
            r3 = r7
            r7 = 0
            r16 = r4
            r4 = r9
            r9 = 16
            r17 = r10
            r10 = 0
            java.lang.Object r3 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink$default(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r3 != r1) goto L19c
            return r1
        L19c:
            r6 = r0
            r0 = r11
            r11 = r12
            r10 = r13
            r9 = r14
            r7 = r15
            r4 = r17
        L1a4:
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r3)
            if (r1 != 0) goto L1b3
            r3 = r4
            r15 = r7
            r14 = r9
            r13 = r10
            r12 = r11
            r11 = r0
            r0 = r6
            goto L1bb
        L1b3:
            r15 = r7
            r14 = r9
            r13 = r10
            r12 = r11
            r11 = r0
            goto L1bf
        L1b9:
            r17 = r3
        L1bb:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L1bf:
            if (r1 != 0) goto L1c5
        L1c1:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L1c5:
            return r1
        L1c6:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
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
    public java.lang.Object getUrl(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.utils.ExtractorLink>> r4) {
            r1 = this;
            java.lang.Object r0 = getUrl$suspendImpl(r1, r2, r3, r4)
            return r0
    }
}
