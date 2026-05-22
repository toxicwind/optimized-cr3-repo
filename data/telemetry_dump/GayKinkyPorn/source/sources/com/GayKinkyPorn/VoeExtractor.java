package com.GayKinkyPorn;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lagradost.cloudstream3.utils.ExtractorApi;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extractors.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/GayKinkyPorn/classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0096@¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/GayKinkyPorn/VoeExtractor;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "mainUrl", "getMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "VideoSource", "GayKinkyPorn"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtractors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extractors.kt\ncom/GayKinkyPorn/VoeExtractor\n+ 2 AppUtils.kt\ncom/lagradost/cloudstream3/utils/AppUtils\n+ 3 Extensions.kt\ncom/fasterxml/jackson/module/kotlin/ExtensionsKt\n*L\n1#1,283:1\n23#2,2:284\n15#2:286\n25#2,2:289\n50#3:287\n43#3:288\n*S KotlinDebug\n*F\n+ 1 Extractors.kt\ncom/GayKinkyPorn/VoeExtractor\n*L\n42#1:284,2\n42#1:286\n42#1:289,2\n42#1:287\n42#1:288\n*E\n"})
public class VoeExtractor extends ExtractorApi {
    private final boolean requiresReferer;

    @NotNull
    private final String name = "Voe";

    @NotNull
    private final String mainUrl = "https://jilliandescribecompany.com";

    /* JADX INFO: renamed from: com.GayKinkyPorn.VoeExtractor$getUrl$1 */
    /* JADX INFO: compiled from: Extractors.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GayKinkyPorn.VoeExtractor", f = "Extractors.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {33, 45}, m = "getUrl$suspendImpl", n = {"$this", "url", "referer", "$this", "url", "referer", "response", "jsonMatch", "source", "videoUrl", "$i$a$-let-VoeExtractor$getUrl$2", "$i$a$-let-VoeExtractor$getUrl$2$1"}, nl = {34, 44}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"}, v = 2)
    static final class C00081 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C00081(Continuation<? super C00081> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoeExtractor.getUrl$suspendImpl(VoeExtractor.this, null, null, (Continuation) this);
        }
    }

    @Nullable
    public Object getUrl(@NotNull String str, @Nullable String str2, @NotNull Continuation<? super List<? extends ExtractorLink>> continuation) {
        return getUrl$suspendImpl(this, str, str2, continuation);
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public String getMainUrl() {
        return this.mainUrl;
    }

    public boolean getRequiresReferer() {
        return this.requiresReferer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: Extractors.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/GayKinkyPorn/VoeExtractor$VideoSource;", "", "url", "", "height", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getUrl", "()Ljava/lang/String;", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/GayKinkyPorn/VoeExtractor$VideoSource;", "equals", "", "other", "hashCode", "toString", "GayKinkyPorn"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [32=4, 36=6, 38=4, 42=4] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object getUrl$suspendImpl(com.GayKinkyPorn.VoeExtractor r21, java.lang.String r22, java.lang.String r23, kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.utils.ExtractorLink>> r24) {
        /*
            r0 = r21
            r1 = r24
            boolean r2 = r1 instanceof com.GayKinkyPorn.VoeExtractor.C00081
            if (r2 == 0) goto L18
            r2 = r1
            com.GayKinkyPorn.VoeExtractor$getUrl$1 r2 = (com.GayKinkyPorn.VoeExtractor.C00081) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.GayKinkyPorn.VoeExtractor$getUrl$1 r2 = new com.GayKinkyPorn.VoeExtractor$getUrl$1
            r2.<init>(r1)
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
            com.GayKinkyPorn.VoeExtractor$VideoSource r6 = (com.GayKinkyPorn.VoeExtractor.VideoSource) r6
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
            com.GayKinkyPorn.VoeExtractor r0 = (com.GayKinkyPorn.VoeExtractor) r0
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
            com.GayKinkyPorn.VoeExtractor r0 = (com.GayKinkyPorn.VoeExtractor) r0
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
            com.GayKinkyPorn.VoeExtractor$getUrl$suspendImpl$$inlined$tryParseJson$1 r18 = new com.GayKinkyPorn.VoeExtractor$getUrl$suspendImpl$$inlined$tryParseJson$1     // Catch: java.lang.Exception -> L137
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
            com.GayKinkyPorn.VoeExtractor$VideoSource r7 = (com.GayKinkyPorn.VoeExtractor.VideoSource) r7
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
        */
        throw new UnsupportedOperationException("Method not decompiled: com.GayKinkyPorn.VoeExtractor.getUrl$suspendImpl(com.GayKinkyPorn.VoeExtractor, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
