package com.Gayxx;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Gayxx/classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0096@¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/Gayxx/VoeExtractor;", "Lcom/Gayxx/BaseVideoExtractor;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "domain", "getDomain", "mainUrl", "getMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "VideoSource", "dsio", "Gayxx"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extractor.kt\ncom/Gayxx/VoeExtractor\n+ 2 AppUtils.kt\ncom/lagradost/cloudstream3/utils/AppUtils\n+ 3 Extensions.kt\ncom/fasterxml/jackson/module/kotlin/ExtensionsKt\n*L\n1#1,451:1\n23#2,2:452\n15#2:454\n25#2,2:457\n50#3:455\n43#3:456\n*S KotlinDebug\n*F\n+ 1 Extractor.kt\ncom/Gayxx/VoeExtractor\n*L\n50#1:452,2\n50#1:454\n50#1:457,2\n50#1:455\n50#1:456\n*E\n"})
public final class VoeExtractor extends BaseVideoExtractor {
    private final boolean requiresReferer;

    @NotNull
    private final String name = "Voe";

    @NotNull
    private final String domain = "jilliandescribecompany.com";

    @NotNull
    private final String mainUrl = "https://" + getDomain() + "/e";

    /* JADX INFO: renamed from: com.Gayxx.VoeExtractor$getUrl$1 */
    /* JADX INFO: compiled from: Extractor.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gayxx.VoeExtractor", f = "Extractor.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {41, 53}, m = "getUrl", n = {"url", "referer", "url", "referer", "response", "jsonMatch", "source", "videoUrl", "$i$a$-let-VoeExtractor$getUrl$2", "$i$a$-let-VoeExtractor$getUrl$2$1"}, nl = {42, 52}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1"}, v = 2)
    static final class C00121 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C00121(Continuation<? super C00121> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoeExtractor.this.getUrl(null, null, (Continuation) this);
        }
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // com.Gayxx.BaseVideoExtractor
    @NotNull
    protected String getDomain() {
        return this.domain;
    }

    @Override // com.Gayxx.BaseVideoExtractor
    @NotNull
    public String getMainUrl() {
        return this.mainUrl;
    }

    public boolean getRequiresReferer() {
        return this.requiresReferer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: Extractor.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/Gayxx/VoeExtractor$VideoSource;", "", "url", "", "height", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getUrl", "()Ljava/lang/String;", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/Gayxx/VoeExtractor$VideoSource;", "equals", "", "other", "hashCode", "toString", "Gayxx"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final /* data */ class VideoSource {

        @JsonProperty("video_height")
        @Nullable
        private final Integer height;

        @JsonProperty("hls")
        @Nullable
        private final String url;

        public static /* synthetic */ VideoSource copy$default(VideoSource videoSource, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = videoSource.url;
            }
            if ((i & 2) != 0) {
                num = videoSource.height;
            }
            return videoSource.copy(str, num);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getHeight() {
            return this.height;
        }

        @NotNull
        public final VideoSource copy(@JsonProperty("hls") @Nullable String url, @JsonProperty("video_height") @Nullable Integer height) {
            return new VideoSource(url, height);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoSource)) {
                return false;
            }
            VideoSource videoSource = (VideoSource) other;
            return Intrinsics.areEqual(this.url, videoSource.url) && Intrinsics.areEqual(this.height, videoSource.height);
        }

        public int hashCode() {
            return ((this.url == null ? 0 : this.url.hashCode()) * 31) + (this.height != null ? this.height.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "VideoSource(url=" + this.url + ", height=" + this.height + ')';
        }

        public VideoSource(@JsonProperty("hls") @Nullable String url, @JsonProperty("video_height") @Nullable Integer height) {
            this.url = url;
            this.height = height;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        public final Integer getHeight() {
            return this.height;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [40=4, 44=7, 46=5, 47=4, 50=4] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getUrl(@org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.Nullable java.lang.String r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.utils.ExtractorLink>> r24) {
        /*
            r21 = this;
            r1 = r24
            boolean r0 = r1 instanceof com.Gayxx.VoeExtractor.C00121
            if (r0 == 0) goto L18
            r0 = r1
            com.Gayxx.VoeExtractor$getUrl$1 r0 = (com.Gayxx.VoeExtractor.C00121) r0
            int r2 = r0.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r0.label
            int r2 = r2 - r3
            r0.label = r2
            r2 = r21
            goto L1f
        L18:
            com.Gayxx.VoeExtractor$getUrl$1 r0 = new com.Gayxx.VoeExtractor$getUrl$1
            r2 = r21
            r0.<init>(r1)
        L1f:
            r8 = r0
            java.lang.Object r3 = r8.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r8.label
            r5 = 1
            switch(r0) {
                case 0: goto L6b;
                case 1: goto L59;
                case 2: goto L34;
                default: goto L2c;
            }
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            int r0 = r8.I$1
            int r4 = r8.I$0
            java.lang.Object r5 = r8.L$5
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r8.L$4
            com.Gayxx.VoeExtractor$VideoSource r6 = (com.Gayxx.VoeExtractor.VideoSource) r6
            java.lang.Object r7 = r8.L$3
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r8.L$2
            com.lagradost.nicehttp.NiceResponse r9 = (com.lagradost.nicehttp.NiceResponse) r9
            java.lang.Object r10 = r8.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r8.L$0
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r3)
            r20 = r3
            r17 = r8
            goto L18b
        L59:
            java.lang.Object r0 = r8.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r6 = r8.L$0
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r3)
            r12 = r0
            r20 = r3
            r1 = r4
            r11 = r6
            r0 = 1
            goto Lb4
        L6b:
            kotlin.ResultKt.throwOnFailure(r3)
            r6 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r8.L$0 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)
            r8.L$1 = r0
            r8.label = r5
            r0 = 1
            r5 = 0
            r7 = r6
            r6 = 0
            r9 = r7
            r7 = 0
            r17 = r8
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
            r18 = r16
            r16 = 0
            r19 = r18
            r18 = 4094(0xffe, float:5.737E-42)
            r20 = r19
            r19 = 0
            r1 = r4
            r4 = r22
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r8 = r17
            if (r3 != r1) goto Lb0
            return r1
        Lb0:
            r11 = r22
            r12 = r23
        Lb4:
            r13 = r3
            com.lagradost.nicehttp.NiceResponse r13 = (com.lagradost.nicehttp.NiceResponse) r13
            int r3 = r13.getCode()
            r4 = 404(0x194, float:5.66E-43)
            if (r3 != r4) goto Lc4
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        Lc4:
            kotlin.text.Regex r3 = new kotlin.text.Regex
            java.lang.String r4 = "const\\s+sources\\s*=\\s*(\\{.*?\\});"
            r3.<init>(r4)
            java.lang.String r4 = r13.getText()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = 0
            r6 = 2
            r7 = 0
            kotlin.text.MatchResult r3 = kotlin.text.Regex.find$default(r3, r4, r5, r6, r7)
            if (r3 == 0) goto L1b2
        Lde:
            java.util.List r3 = r3.getGroupValues()
            if (r3 == 0) goto L1b2
        Le5:
            java.lang.Object r0 = r3.get(r0)
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L1af
        Lef:
            r18 = 4
            r19 = 0
            java.lang.String r15 = "0,"
            java.lang.String r16 = "0"
            r17 = 0
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r14, r15, r16, r17, r18, r19)
            if (r0 == 0) goto L1ac
            r14 = r0
            com.lagradost.cloudstream3.utils.AppUtils r3 = com.lagradost.cloudstream3.utils.AppUtils.INSTANCE
            r4 = r14
            r5 = 0
            r0 = r4
            r9 = r3
            r10 = 0
            com.fasterxml.jackson.databind.json.JsonMapper r15 = com.lagradost.cloudstream3.MainAPIKt.getMapper()     // Catch: java.lang.Exception -> L125
            com.fasterxml.jackson.databind.ObjectMapper r15 = (com.fasterxml.jackson.databind.ObjectMapper) r15     // Catch: java.lang.Exception -> L125
            r22 = r0
            r16 = 0
            r17 = 0
            com.Gayxx.VoeExtractor$getUrl$$inlined$tryParseJson$1 r18 = new com.Gayxx.VoeExtractor$getUrl$$inlined$tryParseJson$1     // Catch: java.lang.Exception -> L125
            r18.<init>()     // Catch: java.lang.Exception -> L125
            r7 = r18
            com.fasterxml.jackson.core.type.TypeReference r7 = (com.fasterxml.jackson.core.type.TypeReference) r7     // Catch: java.lang.Exception -> L125
            r6 = r22
            java.lang.Object r7 = r15.readValue(r6, r7)     // Catch: java.lang.Exception -> L125
            goto L127
        L125:
            r0 = move-exception
            r7 = 0
        L127:
            com.Gayxx.VoeExtractor$VideoSource r7 = (com.Gayxx.VoeExtractor.VideoSource) r7
            if (r7 == 0) goto L1a5
            r0 = r7
            r15 = 0
            java.lang.String r5 = r0.getUrl()
            if (r5 == 0) goto L19c
            r3 = 0
            java.lang.String r4 = r2.getName()
            java.lang.String r6 = r2.getName()
            r7 = r6
            com.lagradost.cloudstream3.utils.ExtractorLinkType r6 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r8.L$0 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r8.L$1 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r8.L$2 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r8.L$3 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r8.L$4 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r8.L$5 = r9
            r8.I$0 = r15
            r8.I$1 = r3
            r9 = 2
            r8.label = r9
            r9 = r3
            r3 = r7
            r7 = 0
            r10 = r9
            r9 = 16
            r16 = r10
            r10 = 0
            java.lang.Object r3 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink$default(r3, r4, r5, r6, r7, r8, r9, r10)
            r17 = r8
            if (r3 != r1) goto L184
            return r1
        L184:
            r6 = r0
            r10 = r12
            r9 = r13
            r7 = r14
            r4 = r15
            r0 = r16
        L18b:
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r3)
            if (r1 != 0) goto L198
            r15 = r4
            r0 = r6
            r14 = r7
            r13 = r9
            r12 = r10
            goto L19e
        L198:
            r14 = r7
            r13 = r9
            r12 = r10
            goto L1a2
        L19c:
            r17 = r8
        L19e:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L1a2:
            if (r1 != 0) goto L1ab
            goto L1a7
        L1a5:
            r17 = r8
        L1a7:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L1ab:
            return r1
        L1ac:
            r17 = r8
            goto L1b4
        L1af:
            r17 = r8
            goto L1b4
        L1b2:
            r17 = r8
        L1b4:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Gayxx.VoeExtractor.getUrl(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: compiled from: Extractor.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0096@¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/Gayxx/VoeExtractor$dsio;", "Lcom/Gayxx/BaseVideoExtractor;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "domain", "getDomain", "mainUrl", "getMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Gayxx"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extractor.kt\ncom/Gayxx/VoeExtractor$dsio\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,451:1\n1586#2:452\n1661#2,3:453\n*S KotlinDebug\n*F\n+ 1 Extractor.kt\ncom/Gayxx/VoeExtractor$dsio\n*L\n81#1:452\n81#1:453,3\n*E\n"})
    public static final class dsio extends BaseVideoExtractor {

        @NotNull
        private final String name = "dsio";

        @NotNull
        private final String domain = "d-s.io";

        @NotNull
        private final String mainUrl = "https://" + getDomain();
        private final boolean requiresReferer = true;

        @NotNull
        public String getName() {
            return this.name;
        }

        @Override // com.Gayxx.BaseVideoExtractor
        @NotNull
        protected String getDomain() {
            return this.domain;
        }

        @Override // com.Gayxx.BaseVideoExtractor
        @NotNull
        public String getMainUrl() {
            return this.mainUrl;
        }

        public boolean getRequiresReferer() {
            return this.requiresReferer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [71=5, 87=4, 89=4] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x018a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x01c0 A[LOOP:0: B:29:0x01ba->B:31:0x01c0, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0298  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0308 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0309  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object getUrl(@org.jetbrains.annotations.NotNull java.lang.String r35, @org.jetbrains.annotations.Nullable java.lang.String r36, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.utils.ExtractorLink>> r37) {
            /*
                r34 = this;
                r0 = r34
                r1 = r37
                boolean r2 = r1 instanceof com.Gayxx.VoeExtractor$dsio$getUrl$1
                if (r2 == 0) goto L18
                r2 = r1
                com.Gayxx.VoeExtractor$dsio$getUrl$1 r2 = (com.Gayxx.VoeExtractor$dsio$getUrl$1) r2
                int r3 = r2.label
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r3 & r4
                if (r3 == 0) goto L18
                int r3 = r2.label
                int r3 = r3 - r4
                r2.label = r3
                goto L1d
            L18:
                com.Gayxx.VoeExtractor$dsio$getUrl$1 r2 = new com.Gayxx.VoeExtractor$dsio$getUrl$1
                r2.<init>(r0, r1)
            L1d:
                r8 = r2
                java.lang.Object r2 = r8.result
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r4 = r8.label
                r5 = 0
                r6 = 1
                r7 = 2
                r9 = 0
                switch(r4) {
                    case 0: goto Lac;
                    case 1: goto L96;
                    case 2: goto L71;
                    case 3: goto L38;
                    default: goto L2d;
                }
            L2d:
                r20 = r2
                r2 = r0
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L38:
                java.lang.Object r3 = r8.L$10
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r8.L$9
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r5 = r8.L$8
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r6 = r8.L$7
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r7 = r8.L$6
                com.lagradost.nicehttp.NiceResponse r7 = (com.lagradost.nicehttp.NiceResponse) r7
                java.lang.Object r9 = r8.L$5
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r10 = r8.L$4
                java.lang.String r10 = (java.lang.String) r10
                java.lang.Object r11 = r8.L$3
                java.lang.String r11 = (java.lang.String) r11
                java.lang.Object r12 = r8.L$2
                java.lang.String r12 = (java.lang.String) r12
                java.lang.Object r13 = r8.L$1
                java.lang.String r13 = (java.lang.String) r13
                java.lang.Object r14 = r8.L$0
                java.lang.String r14 = (java.lang.String) r14
                kotlin.ResultKt.throwOnFailure(r2)
                r20 = r2
                r17 = r8
                r2 = r0
                r0 = r3
                r3 = r20
                goto L30f
            L71:
                java.lang.Object r4 = r8.L$5
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r10 = r8.L$4
                java.lang.String r10 = (java.lang.String) r10
                java.lang.Object r11 = r8.L$3
                java.lang.String r11 = (java.lang.String) r11
                java.lang.Object r12 = r8.L$2
                java.lang.String r12 = (java.lang.String) r12
                java.lang.Object r13 = r8.L$1
                java.lang.String r13 = (java.lang.String) r13
                java.lang.Object r14 = r8.L$0
                java.lang.String r14 = (java.lang.String) r14
                kotlin.ResultKt.throwOnFailure(r2)
                r20 = r2
                r1 = r3
                r0 = 2
                r3 = r20
                r2 = 0
                r9 = r4
                goto L195
            L96:
                java.lang.Object r4 = r8.L$1
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r10 = r8.L$0
                java.lang.String r10 = (java.lang.String) r10
                kotlin.ResultKt.throwOnFailure(r2)
                r20 = r2
                r1 = r3
                r21 = r4
                r6 = r10
                r0 = 2
                r3 = r20
                r2 = 0
                goto Lfa
            Lac:
                kotlin.ResultKt.throwOnFailure(r2)
                r4 = r3
                com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
                r10 = r35
                r8.L$0 = r10
                java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r36)
                r8.L$1 = r11
                r8.label = r6
                r11 = 0
                r5 = 0
                r12 = 1
                r6 = 0
                r13 = 2
                r7 = 0
                r17 = r8
                r8 = 0
                r14 = r9
                r9 = 0
                r10 = 0
                r15 = 0
                r11 = 0
                r16 = 1
                r18 = 2
                r12 = 0
                r19 = r14
                r14 = 0
                r20 = 0
                r15 = 0
                r21 = 1
                r16 = 0
                r22 = 2
                r18 = 4094(0xffe, float:5.737E-42)
                r23 = r19
                r19 = 0
                r20 = r2
                r1 = r4
                r0 = 2
                r2 = 0
                r4 = r35
                java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
                r8 = r17
                if (r3 != r1) goto Lf6
                return r1
            Lf6:
                r6 = r35
                r21 = r36
            Lfa:
                com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
                java.lang.String r3 = r3.getText()
                kotlin.text.Regex r4 = new kotlin.text.Regex
                java.lang.String r5 = "/pass_md5/[^'\"]+"
                r4.<init>(r5)
                r5 = r3
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                r14 = 0
                kotlin.text.MatchResult r4 = kotlin.text.Regex.find$default(r4, r5, r2, r0, r14)
                if (r4 == 0) goto L314
                java.lang.String r4 = r4.getValue()
                if (r4 != 0) goto L11f
                r2 = r34
                r25 = r3
                r17 = r8
                goto L31a
            L11f:
                java.lang.String r5 = "/"
                java.lang.String r5 = kotlin.text.StringsKt.substringAfterLast$default(r4, r5, r14, r0, r14)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r9 = r34.getMainUrl()
                java.lang.StringBuilder r7 = r7.append(r9)
                java.lang.StringBuilder r7 = r7.append(r4)
                java.lang.String r7 = r7.toString()
                com.lagradost.nicehttp.Requests r9 = com.lagradost.cloudstream3.MainActivityKt.getApp()
                java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
                r8.L$0 = r10
                java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r21)
                r8.L$1 = r10
                r8.L$2 = r3
                java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
                r8.L$3 = r10
                r8.L$4 = r5
                java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
                r8.L$5 = r10
                r8.label = r0
                r10 = r5
                r5 = 0
                r11 = r4
                r4 = r7
                r7 = 0
                r17 = r8
                r8 = 0
                r12 = r3
                r3 = r9
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
                r24 = r18
                r18 = 4090(0xffa, float:5.731E-42)
                r25 = r19
                r19 = 0
                java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
                r8 = r17
                if (r3 != r1) goto L18b
                return r1
            L18b:
                r14 = r6
                r13 = r21
                r10 = r22
                r11 = r24
                r12 = r25
                r9 = r4
            L195:
                r15 = r3
                com.lagradost.nicehttp.NiceResponse r15 = (com.lagradost.nicehttp.NiceResponse) r15
                java.lang.String r3 = r15.getText()
                kotlin.ranges.IntRange r4 = new kotlin.ranges.IntRange
                r5 = 10
                r6 = 1
                r4.<init>(r6, r5)
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                r7 = 0
                java.util.ArrayList r6 = new java.util.ArrayList
                int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r5)
                r6.<init>(r5)
                r5 = r6
                java.util.Collection r5 = (java.util.Collection) r5
                r6 = r4
                r17 = 0
                java.util.Iterator r18 = r6.iterator()
            L1ba:
                boolean r19 = r18.hasNext()
                if (r19 == 0) goto L219
                r19 = r18
                kotlin.collections.IntIterator r19 = (kotlin.collections.IntIterator) r19
                int r19 = r19.nextInt()
                r21 = r19
                r22 = 0
                kotlin.ranges.CharRange r2 = new kotlin.ranges.CharRange
                r0 = 97
                r35 = r4
                r4 = 122(0x7a, float:1.71E-43)
                r2.<init>(r0, r4)
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                kotlin.ranges.CharRange r0 = new kotlin.ranges.CharRange
                r4 = 65
                r36 = r6
                r6 = 90
                r0.<init>(r4, r6)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r0 = kotlin.collections.CollectionsKt.plus(r2, r0)
                java.util.Collection r0 = (java.util.Collection) r0
                kotlin.ranges.CharRange r2 = new kotlin.ranges.CharRange
                r4 = 48
                r6 = 57
                r2.<init>(r4, r6)
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.List r0 = kotlin.collections.CollectionsKt.plus(r0, r2)
                java.util.Collection r0 = (java.util.Collection) r0
                kotlin.random.Random$Default r2 = kotlin.random.Random.Default
                kotlin.random.Random r2 = (kotlin.random.Random) r2
                java.lang.Object r0 = kotlin.collections.CollectionsKt.random(r0, r2)
                java.lang.Character r0 = (java.lang.Character) r0
                char r0 = r0.charValue()
                java.lang.Character r0 = kotlin.coroutines.jvm.internal.Boxing.boxChar(r0)
                r5.add(r0)
                r4 = r35
                r6 = r36
                r0 = 2
                r2 = 0
                goto L1ba
            L219:
                r35 = r4
                r36 = r6
                r0 = r5
                java.util.List r0 = (java.util.List) r0
                r25 = r0
                java.lang.Iterable r25 = (java.lang.Iterable) r25
                java.lang.String r0 = ""
                r26 = r0
                java.lang.CharSequence r26 = (java.lang.CharSequence) r26
                r32 = 62
                r33 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                java.lang.String r0 = kotlin.collections.CollectionsKt.joinToString$default(r25, r26, r27, r28, r29, r30, r31, r32, r33)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r0)
                java.lang.String r4 = "?token="
                java.lang.StringBuilder r2 = r2.append(r4)
                java.lang.StringBuilder r2 = r2.append(r10)
                java.lang.String r4 = "&expiry="
                java.lang.StringBuilder r2 = r2.append(r4)
                long r4 = java.lang.System.currentTimeMillis()
                java.lang.StringBuilder r2 = r2.append(r4)
                java.lang.String r5 = r2.toString()
                kotlin.text.Regex r2 = new kotlin.text.Regex
                java.lang.String r4 = "(\\d{3,4})[pP]"
                r2.<init>(r4)
                java.lang.String r4 = "<title>"
                r6 = 2
                r7 = 0
                java.lang.String r4 = kotlin.text.StringsKt.substringAfter$default(r12, r4, r7, r6, r7)
                r35 = r0
                java.lang.String r0 = "</title>"
                java.lang.String r0 = kotlin.text.StringsKt.substringBefore$default(r4, r0, r7, r6, r7)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r4 = 0
                kotlin.text.MatchResult r0 = kotlin.text.Regex.find$default(r2, r0, r4, r6, r7)
                if (r0 == 0) goto L298
            L289:
                java.util.List r0 = r0.getGroupValues()
                if (r0 == 0) goto L298
            L290:
                r6 = 1
                java.lang.Object r0 = r0.get(r6)
                java.lang.String r0 = (java.lang.String) r0
                goto L299
            L298:
                r0 = 0
            L299:
                r2 = r3
                java.lang.String r3 = r34.getName()
                java.lang.String r4 = r34.getName()
                com.lagradost.cloudstream3.utils.ExtractorLinkType r6 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()
                com.Gayxx.VoeExtractor$dsio$getUrl$2 r7 = new com.Gayxx.VoeExtractor$dsio$getUrl$2
                r36 = r2
                r16 = r3
                r3 = 0
                r2 = r34
                r7.<init>(r2, r0, r3)
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
                r8.L$0 = r3
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
                r8.L$1 = r3
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
                r8.L$2 = r3
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
                r8.L$3 = r3
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
                r8.L$4 = r3
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
                r8.L$5 = r3
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
                r8.L$6 = r3
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r36)
                r8.L$7 = r3
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r35)
                r8.L$8 = r3
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
                r8.L$9 = r3
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                r8.L$10 = r3
                r3 = 3
                r8.label = r3
                r3 = r16
                r16 = r36
                java.lang.Object r3 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r3, r4, r5, r6, r7, r8)
                r17 = r8
                if (r3 != r1) goto L309
                return r1
            L309:
                r4 = r5
                r7 = r15
                r6 = r16
                r5 = r35
            L30f:
                java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r3)
                return r1
            L314:
                r2 = r34
                r25 = r3
                r17 = r8
            L31a:
                r23 = 0
                return r23
            */
            throw new UnsupportedOperationException("Method not decompiled: com.Gayxx.VoeExtractor.dsio.getUrl(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }
}
