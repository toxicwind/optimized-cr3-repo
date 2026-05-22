package com.Nurgay;

import com.lagradost.cloudstream3.utils.ExtractorApi;
import com.lagradost.cloudstream3.utils.ExtractorApiKt;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0013H\u0096@¢\u0006\u0002\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/Nurgay/VidNest;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "mainUrl", "getMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "url", "referer", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Nurgay"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VidNest extends ExtractorApi {
    private final boolean requiresReferer;

    @NotNull
    private final String name = "VidNest";

    @NotNull
    private final String mainUrl = "https://vidnest.io";

    /* JADX INFO: renamed from: com.Nurgay.VidNest$getUrl$1 */
    /* JADX INFO: compiled from: Extractors.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Nurgay.VidNest", f = "Extractors.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {353, 363}, m = "getUrl", n = {"url", "referer", "subtitleCallback", "callback", "docHeaders", "url", "referer", "subtitleCallback", "callback", "docHeaders", "text", "videoRegex", "labelRegex", "videoUrl", "label"}, nl = {355, 362}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9"}, v = 2)
    static final class C00111 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$10;
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

        C00111(Continuation<? super C00111> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VidNest.this.getUrl(null, null, null, null, (Continuation) this);
        }
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getUrl(@org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.Nullable java.lang.String r25, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r26, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r27, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r28) {
        /*
            r23 = this;
            r0 = r28
            boolean r1 = r0 instanceof com.Nurgay.VidNest.C00111
            if (r1 == 0) goto L18
            r1 = r0
            com.Nurgay.VidNest$getUrl$1 r1 = (com.Nurgay.VidNest.C00111) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            r2 = r23
            goto L1f
        L18:
            com.Nurgay.VidNest$getUrl$1 r1 = new com.Nurgay.VidNest$getUrl$1
            r2 = r23
            r1.<init>(r0)
        L1f:
            r8 = r1
            java.lang.Object r1 = r8.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r8.label
            r5 = 0
            r6 = 1
            r7 = 2
            switch(r4) {
                case 0: goto L8f;
                case 1: goto L6e;
                case 2: goto L38;
                default: goto L2e;
            }
        L2e:
            r20 = r1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            java.lang.Object r3 = r8.L$10
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r4 = r8.L$9
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r8.L$8
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r8.L$7
            kotlin.text.Regex r6 = (kotlin.text.Regex) r6
            java.lang.Object r7 = r8.L$6
            kotlin.text.Regex r7 = (kotlin.text.Regex) r7
            java.lang.Object r9 = r8.L$5
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r8.L$4
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r11 = r8.L$3
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            java.lang.Object r12 = r8.L$2
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            java.lang.Object r13 = r8.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r8.L$0
            java.lang.String r14 = (java.lang.String) r14
            kotlin.ResultKt.throwOnFailure(r1)
            r2 = r1
            r20 = r2
            r17 = r8
            goto L1c7
        L6e:
            java.lang.Object r4 = r8.L$4
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r9 = r8.L$3
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r8.L$2
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r11 = r8.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r8.L$0
            java.lang.String r12 = (java.lang.String) r12
            kotlin.ResultKt.throwOnFailure(r1)
            r20 = r1
            r0 = r3
            r13 = r4
            r2 = 2
            r3 = r20
            r1 = 0
            goto L10e
        L8f:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.Pair[] r4 = new kotlin.Pair[r7]
            java.lang.String r9 = "Referer"
            java.lang.String r10 = "https://vidnest.io/"
            kotlin.Pair r9 = kotlin.TuplesKt.to(r9, r10)
            r4[r5] = r9
            java.lang.String r9 = "User-Agent"
            java.lang.String r10 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
            kotlin.Pair r9 = kotlin.TuplesKt.to(r9, r10)
            r4[r6] = r9
            java.util.Map r4 = kotlin.collections.MapsKt.mapOf(r4)
            r9 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r8.L$0 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)
            r8.L$1 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)
            r8.L$2 = r10
            r10 = r27
            r8.L$3 = r10
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r8.L$4 = r11
            r8.label = r6
            r11 = 1
            r6 = 0
            r12 = 2
            r7 = 0
            r17 = r8
            r8 = 0
            r13 = r9
            r9 = 0
            r10 = 0
            r14 = 1
            r11 = 0
            r15 = r13
            r16 = 2
            r12 = 0
            r18 = 1
            r14 = 0
            r19 = r15
            r15 = 0
            r20 = 2
            r16 = 0
            r21 = 1
            r18 = 4092(0xffc, float:5.734E-42)
            r22 = r19
            r19 = 0
            r20 = r1
            r5 = r4
            r0 = r22
            r1 = 0
            r2 = 2
            r4 = r24
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r8 = r17
            if (r3 != r0) goto L105
            return r0
        L105:
            r12 = r24
            r11 = r25
            r10 = r26
            r9 = r27
            r13 = r5
        L10e:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            java.lang.String r14 = r3.getText()
            kotlin.text.Regex r3 = new kotlin.text.Regex
            java.lang.String r4 = "file\\s*:\\s*[\"']([^\"']+\\.mp4[^\"']*)[\"']"
            r3.<init>(r4)
            r15 = r3
            kotlin.text.Regex r3 = new kotlin.text.Regex
            java.lang.String r4 = "label\\s*:\\s*[\"']([^\"']+)[\"']"
            r3.<init>(r4)
            r4 = r14
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = 0
            kotlin.text.MatchResult r4 = kotlin.text.Regex.find$default(r15, r4, r1, r2, r5)
            if (r4 == 0) goto L13b
            java.util.List r4 = r4.getGroupValues()
            if (r4 == 0) goto L13b
            r6 = 1
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            goto L13d
        L13b:
            r6 = 1
            r4 = r5
        L13d:
            r7 = r14
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            kotlin.text.MatchResult r1 = kotlin.text.Regex.find$default(r3, r7, r1, r2, r5)
            if (r1 == 0) goto L154
            java.util.List r1 = r1.getGroupValues()
            if (r1 == 0) goto L154
            java.lang.Object r1 = r1.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L156
        L154:
            java.lang.String r1 = "VidNest"
        L156:
            if (r4 == 0) goto L1d6
        L15a:
            r6 = r3
            java.lang.String r3 = r23.getName()
            r7 = r4
            java.lang.String r4 = r23.getName()
            r16 = r6
            com.lagradost.cloudstream3.utils.ExtractorLinkType r6 = com.lagradost.cloudstream3.utils.ExtractorLinkType.VIDEO
            com.Nurgay.VidNest$getUrl$2 r2 = new com.Nurgay.VidNest$getUrl$2
            r2.<init>(r1, r5)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r8.L$0 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r8.L$1 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r8.L$2 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r8.L$3 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r8.L$4 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r8.L$5 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r8.L$6 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r8.L$7 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r8.L$8 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r8.L$9 = r5
            r8.L$10 = r9
            r5 = 2
            r8.label = r5
            r5 = r7
            r7 = r2
            java.lang.Object r2 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r3, r4, r5, r6, r7, r8)
            r17 = r8
            if (r2 != r0) goto L1bc
            return r0
        L1bc:
            r4 = r1
            r3 = r9
            r7 = r15
            r6 = r16
            r9 = r14
            r14 = r12
            r12 = r10
            r10 = r13
            r13 = r11
            r11 = r3
        L1c7:
            r3.invoke(r2)
            r1 = r14
            r14 = r9
            r9 = r11
            r11 = r13
            r13 = r10
            r10 = r12
            r12 = r1
            r1 = r4
            r3 = r6
            r15 = r7
            r4 = r5
            goto L1db
        L1d6:
            r16 = r3
            r5 = r4
            r17 = r8
        L1db:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nurgay.VidNest.getUrl(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.Nurgay.VidNest$getUrl$2 */
    /* JADX INFO: compiled from: Extractors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Nurgay.VidNest$getUrl$2", f = "Extractors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00122 extends SuspendLambda implements Function2<ExtractorLink, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $label;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00122(String str, Continuation<? super C00122> continuation) {
            super(2, continuation);
            this.$label = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00122 = new C00122(this.$label, continuation);
            c00122.L$0 = obj;
            return c00122;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        public final Object invoke(ExtractorLink extractorLink, Continuation<? super Unit> continuation) {
            return create(extractorLink, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [373=9] */
        public final Object invokeSuspend(Object $result) {
            ExtractorLink $this$newExtractorLink = (ExtractorLink) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    $this$newExtractorLink.setReferer("https://vidnest.io/");
                    $this$newExtractorLink.setQuality(ExtractorApiKt.getQualityFromName(this.$label));
                    $this$newExtractorLink.setHeaders(MapsKt.mapOf(new Pair[]{TuplesKt.to("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:143.0) Gecko/20100101 Firefox/143.0"), TuplesKt.to("Referer", "https://vidnest.io/"), TuplesKt.to("Accept", "*/*"), TuplesKt.to("Origin", "https://vidnest.io"), TuplesKt.to("Connection", "keep-alive"), TuplesKt.to("Sec-Fetch-Dest", "video"), TuplesKt.to("Sec-Fetch-Mode", "no-cors"), TuplesKt.to("Sec-Fetch-Site", "same-site"), TuplesKt.to("Priority", "u=4")}));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
