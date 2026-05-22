package com.Gaypornvidsxxx;

import com.lagradost.cloudstream3.utils.ExtractorApi;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import java.net.URLDecoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchGroup;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extractors.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Gaypornvidsxxx/classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0096@¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/Gaypornvidsxxx/Base64Extractor;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "mainUrl", "getMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "customBase64Decoder", "encodedString", "getEncodedString", "json", "Gaypornvidsxxx"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class Base64Extractor extends ExtractorApi {
    private final boolean requiresReferer;

    @NotNull
    private final String name = "Base64";

    @NotNull
    private final String mainUrl = "base64";

    /* JADX INFO: renamed from: com.Gaypornvidsxxx.Base64Extractor$getUrl$1 */
    /* JADX INFO: compiled from: Extractors.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gaypornvidsxxx.Base64Extractor", f = "Extractors.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {184, 228}, m = "getUrl$suspendImpl", n = {"$this", "url", "referer", "$this", "url", "referer", "document", "script", "pattern", "matchResult", "jsonArray", "encodedString", "decodedString", "videos", "externalLinkList", "video", "quality", "format", "videoUrl", "isVHQ", "i", "isM3u8"}, nl = {189, 227}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "I$0", "I$1", "I$3"}, v = 2)
    static final class C00001 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$16;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        C00001(Continuation<? super C00001> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Base64Extractor.getUrl$suspendImpl(Base64Extractor.this, null, null, (Continuation) this);
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

    /* JADX WARN: Path cross not found for [B:33:0x0174, B:38:0x0186], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0309 -> B:63:0x0324). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object getUrl$suspendImpl(com.Gaypornvidsxxx.Base64Extractor r33, java.lang.String r34, java.lang.String r35, kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.utils.ExtractorLink>> r36) throws org.json.JSONException {
        /*
            r0 = r33
            r1 = r36
            boolean r2 = r1 instanceof com.Gaypornvidsxxx.Base64Extractor.C00001
            if (r2 == 0) goto L18
            r2 = r1
            com.Gaypornvidsxxx.Base64Extractor$getUrl$1 r2 = (com.Gaypornvidsxxx.Base64Extractor.C00001) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Gaypornvidsxxx.Base64Extractor$getUrl$1 r2 = new com.Gaypornvidsxxx.Base64Extractor$getUrl$1
            r2.<init>(r1)
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
            com.Gaypornvidsxxx.Base64Extractor r0 = (com.Gaypornvidsxxx.Base64Extractor) r0
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
            com.Gaypornvidsxxx.Base64Extractor r0 = (com.Gaypornvidsxxx.Base64Extractor) r0
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
            com.Gaypornvidsxxx.Base64Extractor$getUrl$2 r4 = new com.Gaypornvidsxxx.Base64Extractor$getUrl$2
            r10 = 0
            r4.<init>(r8, r10)
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
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Gaypornvidsxxx.Base64Extractor.getUrl$suspendImpl(com.Gaypornvidsxxx.Base64Extractor, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.Gaypornvidsxxx.Base64Extractor$getUrl$2 */
    /* JADX INFO: compiled from: Extractors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gaypornvidsxxx.Base64Extractor$getUrl$2", f = "Extractors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00012 extends SuspendLambda implements Function2<ExtractorLink, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.IntRef $quality;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00012(Ref.IntRef intRef, Continuation<? super C00012> continuation) {
            super(2, continuation);
            this.$quality = intRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00012 = Base64Extractor.this.new C00012(this.$quality, continuation);
            c00012.L$0 = obj;
            return c00012;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        public final Object invoke(ExtractorLink extractorLink, Continuation<? super Unit> continuation) {
            return create(extractorLink, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object $result) {
            ExtractorLink $this$newExtractorLink = (ExtractorLink) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    $this$newExtractorLink.setReferer(Base64Extractor.this.getMainUrl());
                    $this$newExtractorLink.setQuality(this.$quality.element);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final String customBase64Decoder(String encodedString) {
        String decodedString = "";
        int firstCharIndex = 0;
        String sanitizedString = new Regex("[^АВСЕМA-Za-z0-9.,~]").replace(encodedString, "");
        while (firstCharIndex + 3 < sanitizedString.length()) {
            int currentIndex = firstCharIndex + 1;
            int firstCharIndex2 = StringsKt.indexOf$default("АВСDЕFGHIJKLМNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.,~", sanitizedString.charAt(firstCharIndex), 0, false, 6, (Object) null);
            int currentIndex2 = currentIndex + 1;
            int secondCharIndex = StringsKt.indexOf$default("АВСDЕFGHIJKLМNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.,~", sanitizedString.charAt(currentIndex), 0, false, 6, (Object) null);
            int currentIndex3 = currentIndex2 + 1;
            int thirdCharIndex = StringsKt.indexOf$default("АВСDЕFGHIJKLМNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.,~", sanitizedString.charAt(currentIndex2), 0, false, 6, (Object) null);
            int currentIndex4 = currentIndex3 + 1;
            int fourthCharIndex = StringsKt.indexOf$default("АВСDЕFGHIJKLМNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.,~", sanitizedString.charAt(currentIndex3), 0, false, 6, (Object) null);
            int reconstructedFirstChar = (firstCharIndex2 << 2) | (secondCharIndex >> 4);
            int reconstructedSecondChar = ((secondCharIndex & 15) << 4) | (thirdCharIndex >> 2);
            int lastPart = ((thirdCharIndex & 3) << 6) | fourthCharIndex;
            decodedString = decodedString + ((char) reconstructedFirstChar);
            if (thirdCharIndex != 64) {
                decodedString = decodedString + ((char) reconstructedSecondChar);
            }
            if (fourthCharIndex == 64) {
                firstCharIndex = currentIndex4;
            } else {
                decodedString = decodedString + ((char) lastPart);
                firstCharIndex = currentIndex4;
            }
        }
        return URLDecoder.decode(decodedString, "UTF-8");
    }

    private final String getEncodedString(String json) {
        MatchGroupCollection groups;
        MatchGroup matchGroup;
        Regex stringPattern = new Regex("'([^']+)',");
        MatchResult matchResultFind$default = Regex.find$default(stringPattern, json == null ? "" : json, 0, 2, (Object) null);
        if (matchResultFind$default == null || (groups = matchResultFind$default.getGroups()) == null || (matchGroup = groups.get(1)) == null) {
            return null;
        }
        return matchGroup.getValue();
    }
}
