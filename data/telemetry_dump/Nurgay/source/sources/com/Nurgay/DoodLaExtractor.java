package com.Nurgay;

import com.lagradost.cloudstream3.utils.ExtractorApi;
import com.lagradost.cloudstream3.utils.ExtractorApiKt;
import com.lagradost.cloudstream3.utils.ExtractorLink;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extractors.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Nurgay/classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J(\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0096@¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/Nurgay/DoodLaExtractor;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getExtractorUrl", "id", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Nurgay"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class DoodLaExtractor extends ExtractorApi {
    private final boolean requiresReferer;

    @NotNull
    private String name = "DoodStream";

    @NotNull
    private String mainUrl = "https://dood.la";

    /* JADX INFO: renamed from: com.Nurgay.DoodLaExtractor$getUrl$1 */
    /* JADX INFO: compiled from: Extractors.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Nurgay.DoodLaExtractor", f = "Extractors.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {227, 237, 253}, m = "getUrl$suspendImpl", n = {"$this", "url", "referer", "$this", "url", "referer", "response0", "host", "passPath", "md5Url", "$this", "url", "referer", "response0", "host", "passPath", "md5Url", "videoBase", "token", "randomStr", "trueUrl", "quality"}, nl = {230, 240, 252}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11"}, v = 2)
    static final class C00021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
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

        C00021(Continuation<? super C00021> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DoodLaExtractor.getUrl$suspendImpl(DoodLaExtractor.this, null, null, (Continuation) this);
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

    public void setName(@NotNull String str) {
        this.name = str;
    }

    @NotNull
    public String getMainUrl() {
        return this.mainUrl;
    }

    public void setMainUrl(@NotNull String str) {
        this.mainUrl = str;
    }

    public boolean getRequiresReferer() {
        return this.requiresReferer;
    }

    @NotNull
    public String getExtractorUrl(@NotNull String id) {
        return getMainUrl() + "/d/" + id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [226=4, 248=4, 250=4] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0298 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object getUrl$suspendImpl(com.Nurgay.DoodLaExtractor r27, java.lang.String r28, java.lang.String r29, kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.utils.ExtractorLink>> r30) {
        /*
            r0 = r27
            r1 = r30
            boolean r2 = r1 instanceof com.Nurgay.DoodLaExtractor.C00021
            if (r2 == 0) goto L18
            r2 = r1
            com.Nurgay.DoodLaExtractor$getUrl$1 r2 = (com.Nurgay.DoodLaExtractor.C00021) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Nurgay.DoodLaExtractor$getUrl$1 r2 = new com.Nurgay.DoodLaExtractor$getUrl$1
            r2.<init>(r1)
        L1d:
            r8 = r2
            java.lang.Object r2 = r8.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r8.label
            r5 = 1
            r6 = 0
            r7 = 2
            r9 = 0
            switch(r4) {
                case 0: goto Lbf;
                case 1: goto La2;
                case 2: goto L70;
                case 3: goto L35;
                default: goto L2d;
            }
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            java.lang.Object r3 = r8.L$11
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r8.L$10
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r8.L$9
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r8.L$8
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r8.L$7
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r8.L$6
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r8.L$5
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r8.L$4
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r8.L$3
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r8.L$2
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r8.L$1
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r8.L$0
            r0 = r15
            com.Nurgay.DoodLaExtractor r0 = (com.Nurgay.DoodLaExtractor) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r21 = r2
            r1 = r3
            r3 = r21
            goto L2a8
        L70:
            java.lang.Object r4 = r8.L$6
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r8.L$5
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r10 = r8.L$4
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r8.L$3
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r8.L$2
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r8.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r8.L$0
            r0 = r14
            com.Nurgay.DoodLaExtractor r0 = (com.Nurgay.DoodLaExtractor) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r26 = r0
            r21 = r2
            r0 = r3
            r14 = r11
            r22 = r12
            r15 = r13
            r1 = 0
            r3 = r21
            r12 = r5
            r13 = r10
            r2 = 2
            r11 = r4
            goto L1ce
        La2:
            java.lang.Object r4 = r8.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r10 = r8.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r8.L$0
            r0 = r11
            com.Nurgay.DoodLaExtractor r0 = (com.Nurgay.DoodLaExtractor) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r3
            r3 = r0
            r0 = r1
            r21 = r2
            r22 = r4
            r6 = r10
            r1 = 0
            r4 = r21
            r2 = 2
            goto L112
        Lbf:
            kotlin.ResultKt.throwOnFailure(r2)
            r4 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r8.L$0 = r0
            r10 = r28
            r8.L$1 = r10
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r29)
            r8.L$2 = r11
            r8.label = r5
            r11 = 1
            r5 = 0
            r12 = 0
            r6 = 0
            r13 = 2
            r7 = 0
            r17 = r8
            r8 = 0
            r14 = r9
            r9 = 0
            r10 = 0
            r15 = 1
            r11 = 0
            r16 = 0
            r18 = 2
            r12 = 0
            r19 = r14
            r14 = 0
            r20 = 1
            r15 = 0
            r21 = 0
            r16 = 0
            r22 = 2
            r18 = 4094(0xffe, float:5.737E-42)
            r23 = r19
            r19 = 0
            r21 = r2
            r0 = r4
            r1 = 0
            r2 = 2
            r4 = r28
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r8 = r17
            if (r3 != r0) goto L10b
            return r0
        L10b:
            r6 = r28
            r22 = r29
            r4 = r3
            r3 = r27
        L112:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            java.lang.String r4 = r4.getText()
            kotlin.text.Regex r5 = new kotlin.text.Regex
            java.lang.String r7 = "https?://([^/]+)"
            r5.<init>(r7)
            r7 = r6
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r14 = 0
            kotlin.text.MatchResult r5 = kotlin.text.Regex.find$default(r5, r7, r1, r2, r14)
            if (r5 == 0) goto L2b6
            java.util.List r5 = r5.getGroupValues()
            if (r5 == 0) goto L2b6
            r15 = 1
            java.lang.Object r5 = r5.get(r15)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L140
            r26 = r3
            r24 = r4
            r23 = 0
            goto L2bc
        L140:
            kotlin.text.Regex r7 = new kotlin.text.Regex
            java.lang.String r9 = "/pass_md5/[^'\"]+"
            r7.<init>(r9)
            r9 = r4
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r14 = 0
            kotlin.text.MatchResult r7 = kotlin.text.Regex.find$default(r7, r9, r1, r2, r14)
            if (r7 == 0) goto L2ad
            java.lang.String r7 = r7.getValue()
            if (r7 != 0) goto L15f
            r26 = r3
            r24 = r4
            r20 = r5
            goto L2b3
        L15f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "https://"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r5)
            java.lang.StringBuilder r9 = r9.append(r7)
            java.lang.String r9 = r9.toString()
            com.lagradost.nicehttp.Requests r10 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r8.L$0 = r3
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r8.L$1 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r8.L$2 = r11
            r8.L$3 = r4
            r8.L$4 = r5
            r8.L$5 = r7
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r8.L$6 = r11
            r8.label = r2
            r11 = r5
            r5 = 0
            r12 = r7
            r7 = 0
            r17 = r8
            r8 = 0
            r13 = r4
            r4 = r9
            r9 = 0
            r14 = r3
            r3 = r10
            r10 = 0
            r15 = r11
            r11 = 0
            r18 = r12
            r16 = r13
            r12 = 0
            r19 = r14
            r14 = 0
            r20 = r15
            r15 = 0
            r24 = r16
            r16 = 0
            r25 = r18
            r18 = 4090(0xffa, float:5.731E-42)
            r26 = r19
            r19 = 0
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r8 = r17
            if (r3 != r0) goto L1c6
            return r0
        L1c6:
            r15 = r6
            r13 = r20
            r14 = r24
            r12 = r25
            r11 = r4
        L1ce:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            java.lang.String r3 = r3.getText()
            java.lang.String r4 = "/"
            r5 = 0
            java.lang.String r4 = kotlin.text.StringsKt.substringAfterLast$default(r12, r4, r5, r2, r5)
            java.lang.String r5 = "zUEJeL3mUN"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r7 = "?token="
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.String r6 = r6.toString()
            kotlin.text.Regex r7 = new kotlin.text.Regex
            java.lang.String r9 = "\\d{3,4}p"
            r7.<init>(r9)
            java.lang.String r9 = "<title>"
            r10 = 0
            java.lang.String r9 = kotlin.text.StringsKt.substringAfter$default(r14, r9, r10, r2, r10)
            java.lang.String r1 = "</title>"
            java.lang.String r1 = kotlin.text.StringsKt.substringBefore$default(r9, r1, r10, r2, r10)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r9 = 0
            kotlin.text.MatchResult r1 = kotlin.text.Regex.find$default(r7, r1, r9, r2, r10)
            if (r1 == 0) goto L226
        L217:
            java.util.List r1 = r1.getGroupValues()
            if (r1 == 0) goto L226
        L21e:
            java.lang.Object r1 = r1.get(r9)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            goto L227
        L226:
            r9 = 0
        L227:
            r1 = r9
            r2 = r3
            java.lang.String r3 = r26.getName()
            r7 = r4
            java.lang.String r4 = r26.getName()
            com.Nurgay.DoodLaExtractor$getUrl$2 r9 = new com.Nurgay.DoodLaExtractor$getUrl$2
            r10 = 0
            r9.<init>(r13, r1, r10)
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)
            r8.L$0 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r8.L$1 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r8.L$2 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r8.L$3 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r8.L$4 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r8.L$5 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r8.L$6 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r8.L$7 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r8.L$8 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r8.L$9 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r8.L$10 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r8.L$11 = r10
            r10 = 3
            r8.label = r10
            r10 = r5
            r5 = r6
            r6 = 0
            r16 = r7
            r7 = r9
            r9 = 8
            r17 = r10
            r10 = 0
            java.lang.Object r3 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink$default(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r3 != r0) goto L299
            return r0
        L299:
            r7 = r2
            r4 = r5
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            r14 = r15
            r6 = r16
            r5 = r17
            r13 = r22
            r0 = r26
        L2a8:
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r3)
            return r2
        L2ad:
            r26 = r3
            r24 = r4
            r20 = r5
        L2b3:
            r23 = 0
            return r23
        L2b6:
            r26 = r3
            r24 = r4
            r23 = 0
        L2bc:
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nurgay.DoodLaExtractor.getUrl$suspendImpl(com.Nurgay.DoodLaExtractor, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.Nurgay.DoodLaExtractor$getUrl$2 */
    /* JADX INFO: compiled from: Extractors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Nurgay.DoodLaExtractor$getUrl$2", f = "Extractors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00032 extends SuspendLambda implements Function2<ExtractorLink, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $host;
        final /* synthetic */ String $quality;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00032(String str, String str2, Continuation<? super C00032> continuation) {
            super(2, continuation);
            this.$host = str;
            this.$quality = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00032 = new C00032(this.$host, this.$quality, continuation);
            c00032.L$0 = obj;
            return c00032;
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
                    $this$newExtractorLink.setReferer("https://" + this.$host);
                    $this$newExtractorLink.setQuality(ExtractorApiKt.getQualityFromName(this.$quality));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
