package com.Gayxx;

/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /tmp/tmp.FInTvDqO98/classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/Gayxx/Bingezove;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "mainUrl", "getMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fixJson", "json", "VideoSource", "Gayxx"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extractor.kt\ncom/Gayxx/Bingezove\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 AppUtils.kt\ncom/lagradost/cloudstream3/utils/AppUtils\n+ 4 Extensions.kt\ncom/fasterxml/jackson/module/kotlin/ExtensionsKt\n*L\n1#1,451:1\n1915#2:452\n1916#2:460\n23#3,2:453\n15#3:455\n25#3,2:458\n50#4:456\n43#4:457\n*S KotlinDebug\n*F\n+ 1 Extractor.kt\ncom/Gayxx/Bingezove\n*L\n186#1:452\n186#1:460\n196#1:453,2\n196#1:455\n196#1:458,2\n196#1:456\n196#1:457\n*E\n"})
public class Bingezove extends com.lagradost.cloudstream3.utils.ExtractorApi {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String mainUrl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;
    private final boolean requiresReferer;

    /* JADX INFO: compiled from: Extractor.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u0004\u0018\u00010\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u00d6\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/Gayxx/Bingezove$VideoSource;", "", "file", "", "hls", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getHls", "getUrl", "getVideoUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Gayxx"}, k = 1, mv = {2, 3, 0}, xi = 48)
    private static final class VideoSource {

        @com.fasterxml.jackson.annotation.JsonProperty("file")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String file;

        @com.fasterxml.jackson.annotation.JsonProperty("hls")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String hls;

        @com.fasterxml.jackson.annotation.JsonProperty("url")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String url;

        public VideoSource(@com.fasterxml.jackson.annotation.JsonProperty("file") @org.jetbrains.annotations.Nullable java.lang.String r1, @com.fasterxml.jackson.annotation.JsonProperty("hls") @org.jetbrains.annotations.Nullable java.lang.String r2, @com.fasterxml.jackson.annotation.JsonProperty("url") @org.jetbrains.annotations.Nullable java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.file = r1
                r0.hls = r2
                r0.url = r3
                return
        }

        public static /* synthetic */ com.Gayxx.Bingezove.VideoSource copy$default(com.Gayxx.Bingezove.VideoSource r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
                r5 = r4 & 1
                if (r5 == 0) goto L6
                java.lang.String r1 = r0.file
            L6:
                r5 = r4 & 2
                if (r5 == 0) goto Lc
                java.lang.String r2 = r0.hls
            Lc:
                r4 = r4 & 4
                if (r4 == 0) goto L12
                java.lang.String r3 = r0.url
            L12:
                com.Gayxx.Bingezove$VideoSource r0 = r0.copy(r1, r2, r3)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.file
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
                r1 = this;
                java.lang.String r0 = r1.hls
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
                r1 = this;
                java.lang.String r0 = r1.url
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final com.Gayxx.Bingezove.VideoSource copy(@com.fasterxml.jackson.annotation.JsonProperty("file") @org.jetbrains.annotations.Nullable java.lang.String r2, @com.fasterxml.jackson.annotation.JsonProperty("hls") @org.jetbrains.annotations.Nullable java.lang.String r3, @com.fasterxml.jackson.annotation.JsonProperty("url") @org.jetbrains.annotations.Nullable java.lang.String r4) {
                r1 = this;
                com.Gayxx.Bingezove$VideoSource r0 = new com.Gayxx.Bingezove$VideoSource
                r0.<init>(r2, r3, r4)
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof com.Gayxx.Bingezove.VideoSource
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                r1 = r6
                com.Gayxx.Bingezove$VideoSource r1 = (com.Gayxx.Bingezove.VideoSource) r1
                java.lang.String r3 = r5.file
                java.lang.String r4 = r1.file
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
                if (r3 != 0) goto L18
                return r2
            L18:
                java.lang.String r3 = r5.hls
                java.lang.String r4 = r1.hls
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
                if (r3 != 0) goto L23
                return r2
            L23:
                java.lang.String r3 = r5.url
                java.lang.String r1 = r1.url
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
                if (r1 != 0) goto L2e
                return r2
            L2e:
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getFile() {
                r1 = this;
                java.lang.String r0 = r1.file
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getHls() {
                r1 = this;
                java.lang.String r0 = r1.hls
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getUrl() {
                r1 = this;
                java.lang.String r0 = r1.url
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String getVideoUrl() {
                r1 = this;
                java.lang.String r0 = r1.hls
                if (r0 != 0) goto La
                java.lang.String r0 = r1.file
                if (r0 != 0) goto La
                java.lang.String r0 = r1.url
            La:
                return r0
        }

        public int hashCode() {
                r4 = this;
                java.lang.String r0 = r4.file
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Ld
            L7:
                java.lang.String r0 = r4.file
                int r0 = r0.hashCode()
            Ld:
                int r2 = r0 * 31
                java.lang.String r3 = r4.hls
                if (r3 != 0) goto L15
                r3 = 0
                goto L1b
            L15:
                java.lang.String r3 = r4.hls
                int r3 = r3.hashCode()
            L1b:
                int r2 = r2 + r3
                int r0 = r2 * 31
                java.lang.String r3 = r4.url
                if (r3 != 0) goto L23
                goto L29
            L23:
                java.lang.String r1 = r4.url
                int r1 = r1.hashCode()
            L29:
                int r0 = r0 + r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "VideoSource(file="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r2.file
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", hls="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r2.hls
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", url="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r2.url
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 41
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: com.Gayxx.Bingezove$getUrl$1 */
    /* JADX INFO: compiled from: Extractor.kt */
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Gayxx.Bingezove", f = "Extractor.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, l = {172, 179, 198, 211}, m = "getUrl$suspendImpl", n = {"$this", "url", "referer", "$this", "url", "referer", "response", "document", "m3u8", "$i$a$-let-Bingezove$getUrl$2", "$this", "url", "referer", "response", "document", "$this$forEach$iv", "element$iv", "script", "data", "patterns", "pattern", "match", "file", "$i$f$forEach", "$i$a$-forEach-Bingezove$getUrl$3", "$i$a$-let-Bingezove$getUrl$3$1", "$this", "url", "referer", "response", "document", "file", "$i$a$-let-Bingezove$getUrl$4"}, nl = {173, 178, 197, 210}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"}, v = 2)
    static final class C00011 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
        final /* synthetic */ com.Gayxx.Bingezove this$0;

        C00011(com.Gayxx.Bingezove r1, kotlin.coroutines.Continuation<? super com.Gayxx.Bingezove.C00011> r2) {
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
                com.Gayxx.Bingezove r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = com.Gayxx.Bingezove.getUrl$suspendImpl(r0, r1, r1, r2)
                return r0
        }
    }

    public Bingezove() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Bingezove"
            r1.name = r0
            java.lang.String r0 = "https://bingezove.com"
            r1.mainUrl = r0
            r0 = 1
            r1.requiresReferer = r0
            return
    }

    private final java.lang.String fixJson(java.lang.String r4) {
            r3 = this;
            r0 = r4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            kotlin.text.Regex r1 = new kotlin.text.Regex
            java.lang.String r2 = ",\\s*\\}"
            r1.<init>(r2)
            java.lang.String r2 = "}"
            java.lang.String r0 = r1.replace(r0, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            kotlin.text.Regex r1 = new kotlin.text.Regex
            java.lang.String r2 = ",\\s*\\]"
            r1.<init>(r2)
            java.lang.String r2 = "]"
            java.lang.String r0 = r1.replace(r0, r2)
            return r0
    }

    static /* synthetic */ java.lang.Object getUrl$suspendImpl(com.Gayxx.Bingezove r30, java.lang.String r31, java.lang.String r32, kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.utils.ExtractorLink>> r33) {
            r0 = r30
            r1 = r33
            boolean r2 = r1 instanceof com.Gayxx.Bingezove.C00011
            if (r2 == 0) goto L18
            r2 = r1
            com.Gayxx.Bingezove$getUrl$1 r2 = (com.Gayxx.Bingezove.C00011) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Gayxx.Bingezove$getUrl$1 r2 = new com.Gayxx.Bingezove$getUrl$1
            r2.<init>(r0, r1)
        L1d:
            r8 = r2
            java.lang.Object r2 = r8.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r8.label
            r5 = 1
            switch(r4) {
                case 0: goto Le5;
                case 1: goto Lcd;
                case 2: goto Laa;
                case 3: goto L56;
                case 4: goto L34;
                default: goto L2a;
            }
        L2a:
            r21 = r2
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            int r3 = r8.I$0
            java.lang.Object r4 = r8.L$5
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r8.L$4
            org.jsoup.nodes.Document r5 = (org.jsoup.nodes.Document) r5
            java.lang.Object r6 = r8.L$3
            com.lagradost.nicehttp.NiceResponse r6 = (com.lagradost.nicehttp.NiceResponse) r6
            java.lang.Object r7 = r8.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r8.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r8.L$0
            r0 = r10
            com.Gayxx.Bingezove r0 = (com.Gayxx.Bingezove) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r21 = r2
            goto L3a4
        L56:
            int r3 = r8.I$2
            int r4 = r8.I$1
            int r5 = r8.I$0
            java.lang.Object r6 = r8.L$12
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r8.L$11
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r8.L$10
            kotlin.text.Regex r9 = (kotlin.text.Regex) r9
            java.lang.Object r10 = r8.L$9
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r8.L$8
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r8.L$7
            org.jsoup.nodes.Element r12 = (org.jsoup.nodes.Element) r12
            java.lang.Object r13 = r8.L$6
            java.lang.Object r14 = r8.L$5
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.Object r15 = r8.L$4
            org.jsoup.nodes.Document r15 = (org.jsoup.nodes.Document) r15
            java.lang.Object r1 = r8.L$3
            com.lagradost.nicehttp.NiceResponse r1 = (com.lagradost.nicehttp.NiceResponse) r1
            r16 = r1
            java.lang.Object r1 = r8.L$2
            java.lang.String r1 = (java.lang.String) r1
            r32 = r1
            java.lang.Object r1 = r8.L$1
            java.lang.String r1 = (java.lang.String) r1
            r31 = r1
            java.lang.Object r1 = r8.L$0
            r0 = r1
            com.Gayxx.Bingezove r0 = (com.Gayxx.Bingezove) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r32
            r21 = r2
            r18 = r11
            r17 = r12
            r12 = r16
            r2 = r3
            r11 = r10
            r10 = r31
            r3 = r21
            goto L30a
        Laa:
            int r1 = r8.I$0
            java.lang.Object r3 = r8.L$5
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r8.L$4
            org.jsoup.nodes.Document r4 = (org.jsoup.nodes.Document) r4
            java.lang.Object r5 = r8.L$3
            com.lagradost.nicehttp.NiceResponse r5 = (com.lagradost.nicehttp.NiceResponse) r5
            java.lang.Object r6 = r8.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r8.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r8.L$0
            r0 = r9
            com.Gayxx.Bingezove r0 = (com.Gayxx.Bingezove) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r12 = r5
            r5 = r3
            r3 = r2
            goto L195
        Lcd:
            java.lang.Object r1 = r8.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r8.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r8.L$0
            r0 = r6
            com.Gayxx.Bingezove r0 = (com.Gayxx.Bingezove) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r11 = r1
            r1 = r3
            r10 = r4
            r20 = 1
            r3 = r2
            r9 = r0
            goto L123
        Le5:
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r8.L$0 = r0
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r31)
            r8.L$1 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r32)
            r8.L$2 = r4
            r8.label = r5
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            r17 = r8
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 4094(0xffe, float:5.737E-42)
            r19 = 0
            r4 = r31
            r20 = 1
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r8 = r17
            if (r3 != r1) goto L11e
            return r1
        L11e:
            r10 = r31
            r11 = r32
            r9 = r0
        L123:
            r12 = r3
            com.lagradost.nicehttp.NiceResponse r12 = (com.lagradost.nicehttp.NiceResponse) r12
            org.jsoup.nodes.Document r13 = r12.getDocument()
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r3 = "(https?://[^\\s'\"]+\\.m3u8[^\\s'\"]*)"
            r0.<init>(r3)
            java.lang.String r3 = r12.getText()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r5 = 0
            r4 = 2
            r6 = 0
            kotlin.text.MatchResult r0 = kotlin.text.Regex.find$default(r0, r3, r5, r4, r6)
            if (r0 == 0) goto L19a
        L142:
            java.lang.String r0 = r0.getValue()
            if (r0 == 0) goto L19a
        L149:
            r5 = r0
            r0 = 0
            java.lang.String r3 = r9.getName()
            java.lang.String r7 = r9.getName()
            com.lagradost.cloudstream3.utils.ExtractorLinkType r14 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()
            com.Gayxx.Bingezove$getUrl$2$1 r15 = new com.Gayxx.Bingezove$getUrl$2$1
            r15.<init>(r9, r6)
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r8.L$0 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r8.L$1 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r8.L$2 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r8.L$3 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r8.L$4 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r8.L$5 = r6
            r8.I$0 = r0
            r8.label = r4
            r4 = r7
            r6 = r14
            r7 = r15
            java.lang.Object r3 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r3, r4, r5, r6, r7, r8)
            if (r3 != r1) goto L190
            return r1
        L190:
            r1 = r0
            r0 = r9
            r7 = r10
            r6 = r11
            r4 = r13
        L195:
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            return r3
        L19a:
            java.lang.String r0 = "script"
            org.jsoup.select.Elements r0 = r13.select(r0)
            r14 = r0
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = 0
            java.util.Iterator r3 = r14.iterator()
        L1a8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L345
            java.lang.Object r16 = r3.next()
            r17 = r16
            org.jsoup.nodes.Element r17 = (org.jsoup.nodes.Element) r17
            r7 = 0
            java.lang.String r18 = r17.data()
            r0 = r18
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r19 = "sources"
            r21 = r2
            r2 = r19
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = kotlin.text.StringsKt.contains$default(r0, r2, r5, r4, r6)
            if (r0 == 0) goto L336
            kotlin.text.Regex[] r0 = new kotlin.text.Regex[r4]
            kotlin.text.Regex r2 = new kotlin.text.Regex
            java.lang.String r4 = "sources\\s*:\\s*\\[\\s*(\\{.*?\\})\\s*\\]"
            r31 = 0
            kotlin.text.RegexOption r5 = kotlin.text.RegexOption.DOT_MATCHES_ALL
            r2.<init>(r4, r5)
            r0[r31] = r2
            kotlin.text.Regex r2 = new kotlin.text.Regex
            java.lang.String r4 = "sources\\s*:\\s*(\\{.*?\\})"
            kotlin.text.RegexOption r5 = kotlin.text.RegexOption.DOT_MATCHES_ALL
            r2.<init>(r4, r5)
            r0[r20] = r2
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r0)
            java.util.Iterator r4 = r2.iterator()
        L1f0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L330
            java.lang.Object r0 = r4.next()
            r5 = r0
            kotlin.text.Regex r5 = (kotlin.text.Regex) r5
            r0 = r18
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r32 = r2
            r30 = r3
            r2 = 2
            r3 = 0
            kotlin.text.MatchResult r0 = kotlin.text.Regex.find$default(r5, r0, r3, r2, r6)
            if (r0 == 0) goto L21b
            java.util.List r0 = r0.getGroupValues()
            if (r0 == 0) goto L21b
            r2 = 1
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            goto L21d
        L21b:
            r2 = 1
            r0 = r6
        L21d:
            r31 = r0
            r0 = r31
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L22e
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L22c
            goto L22e
        L22c:
            r0 = 0
            goto L22f
        L22e:
            r0 = 1
        L22f:
            if (r0 != 0) goto L320
            com.lagradost.cloudstream3.utils.AppUtils r20 = com.lagradost.cloudstream3.utils.AppUtils.INSTANCE
            r2 = r31
            java.lang.String r0 = r9.fixJson(r2)
            r22 = r0
            r23 = 0
            if (r22 != 0) goto L242
            r3 = r6
            goto L26e
        L242:
            r0 = r22
            r24 = r20
            r25 = 0
            com.fasterxml.jackson.databind.json.JsonMapper r26 = com.lagradost.cloudstream3.MainAPIKt.getMapper()     // Catch: java.lang.Exception -> L26b
            com.fasterxml.jackson.databind.ObjectMapper r26 = (com.fasterxml.jackson.databind.ObjectMapper) r26     // Catch: java.lang.Exception -> L26b
            r31 = r0
            r27 = r26
            r26 = 0
            r28 = 0
            com.Gayxx.Bingezove$getUrl$lambda$1$$inlined$tryParseJson$1 r29 = new com.Gayxx.Bingezove$getUrl$lambda$1$$inlined$tryParseJson$1     // Catch: java.lang.Exception -> L26b
            r29.<init>()     // Catch: java.lang.Exception -> L26b
            r3 = r29
            com.fasterxml.jackson.core.type.TypeReference r3 = (com.fasterxml.jackson.core.type.TypeReference) r3     // Catch: java.lang.Exception -> L26b
            r6 = r31
            r31 = r0
            r0 = r27
            java.lang.Object r3 = r0.readValue(r6, r3)     // Catch: java.lang.Exception -> L26b
            goto L26d
        L26b:
            r0 = move-exception
            r3 = 0
        L26d:
        L26e:
            com.Gayxx.Bingezove$VideoSource r3 = (com.Gayxx.Bingezove.VideoSource) r3
            if (r3 == 0) goto L30f
            java.lang.String r0 = r3.getVideoUrl()
            if (r0 == 0) goto L30f
            r3 = 0
            java.lang.String r4 = r9.getName()
            r6 = r4
            java.lang.String r4 = r9.getName()
            r19 = r6
            com.lagradost.cloudstream3.utils.ExtractorLinkType r6 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()
            r30 = r0
            com.Gayxx.Bingezove$getUrl$3$1$1 r0 = new com.Gayxx.Bingezove$getUrl$3$1$1
            r20 = r2
            r2 = 0
            r0.<init>(r9, r2)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r8.L$0 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r8.L$1 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r8.L$2 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r8.L$3 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r8.L$4 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r8.L$5 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r8.L$6 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r17)
            r8.L$7 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r18)
            r8.L$8 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r32)
            r8.L$9 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r8.L$10 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r20)
            r8.L$11 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r30)
            r8.L$12 = r2
            r8.I$0 = r15
            r8.I$1 = r7
            r8.I$2 = r3
            r2 = 3
            r8.label = r2
            r22 = r5
            r2 = r7
            r5 = r30
            r7 = r0
            r0 = r3
            r3 = r19
            java.lang.Object r3 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r3, r4, r5, r6, r7, r8)
            if (r3 != r1) goto L2fb
            return r1
        L2fb:
            r4 = r2
            r6 = r5
            r1 = r11
            r5 = r15
            r7 = r20
            r11 = r32
            r2 = r0
            r0 = r9
            r15 = r13
            r13 = r16
            r9 = r22
        L30a:
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            return r3
        L30f:
            r20 = r2
            r22 = r5
            r2 = r7
            r3 = r30
            r7 = r2
            r31 = 0
            r6 = 0
            r20 = 1
            r2 = r32
            goto L1f0
        L320:
            r20 = r31
            r22 = r5
            r2 = r7
            r3 = r30
            r31 = 0
            r6 = 0
            r20 = 1
            r2 = r32
            goto L1f0
        L330:
            r32 = r2
            r30 = r3
            r2 = r7
            goto L339
        L336:
            r30 = r3
            r2 = r7
        L339:
            r3 = r30
            r2 = r21
            r4 = 2
            r5 = 0
            r6 = 0
            r20 = 1
            goto L1a8
        L345:
            r21 = r2
            java.lang.String r0 = "source[src]"
            org.jsoup.nodes.Element r0 = r13.selectFirst(r0)
            if (r0 == 0) goto L3a9
            java.lang.String r2 = "src"
            java.lang.String r5 = r0.attr(r2)
            if (r5 == 0) goto L3a9
            r0 = 0
            java.lang.String r3 = r9.getName()
            java.lang.String r4 = r9.getName()
            com.lagradost.cloudstream3.utils.ExtractorLinkType r6 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()
            com.Gayxx.Bingezove$getUrl$4$1 r2 = new com.Gayxx.Bingezove$getUrl$4$1
            r7 = 0
            r2.<init>(r9, r7)
            r7 = r2
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r8.L$0 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r8.L$1 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r8.L$2 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r8.L$3 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r8.L$4 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r8.L$5 = r2
            r8.I$0 = r0
            r2 = 4
            r8.label = r2
            java.lang.Object r2 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r3, r4, r5, r6, r7, r8)
            if (r2 != r1) goto L39d
            return r1
        L39d:
            r3 = r0
            r4 = r5
            r0 = r9
            r9 = r10
            r7 = r11
            r6 = r12
            r5 = r13
        L3a4:
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r2)
            return r1
        L3a9:
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
