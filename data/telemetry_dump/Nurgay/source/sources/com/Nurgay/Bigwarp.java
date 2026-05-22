package com.Nurgay;

import com.lagradost.cloudstream3.SubtitleFile;
import com.lagradost.cloudstream3.utils.ExtractorApi;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import com.lagradost.cloudstream3.utils.Qualities;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extractors.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Nurgay/classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u0016H\u0096@¢\u0006\u0002\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/Nurgay/Bigwarp;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "url", "referer", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Nurgay"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class Bigwarp extends ExtractorApi {

    @NotNull
    private String name = "Bigwarp";

    @NotNull
    private String mainUrl = "https://bigwarp.io";
    private final boolean requiresReferer = true;

    /* JADX INFO: renamed from: com.Nurgay.Bigwarp$getUrl$1 */
    /* JADX INFO: compiled from: Extractors.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Nurgay.Bigwarp", f = "Extractors.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {291, 292, 299}, m = "getUrl$suspendImpl", n = {"$this", "url", "referer", "subtitleCallback", "callback", "$this", "url", "referer", "subtitleCallback", "callback", "link", "$this", "url", "referer", "subtitleCallback", "callback", "link", "source", "regex", "matchResult", "match"}, nl = {292, 293, 298}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9"}, v = 2)
    static final class C00001 extends ContinuationImpl {
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

        C00001(Continuation<? super C00001> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Bigwarp.getUrl$suspendImpl(Bigwarp.this, null, null, null, null, (Continuation) this);
        }
    }

    @Nullable
    public Object getUrl(@NotNull String str, @Nullable String str2, @NotNull Function1<? super SubtitleFile, Unit> function1, @NotNull Function1<? super ExtractorLink, Unit> function12, @NotNull Continuation<? super Unit> continuation) {
        return getUrl$suspendImpl(this, str, str2, function1, function12, continuation);
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [285=4] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0172 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object getUrl$suspendImpl(com.Nurgay.Bigwarp r25, java.lang.String r26, java.lang.String r27, kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r28, kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r29, kotlin.coroutines.Continuation<? super kotlin.Unit> r30) {
        /*
            r0 = r25
            r1 = r30
            boolean r2 = r1 instanceof com.Nurgay.Bigwarp.C00001
            if (r2 == 0) goto L18
            r2 = r1
            com.Nurgay.Bigwarp$getUrl$1 r2 = (com.Nurgay.Bigwarp.C00001) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Nurgay.Bigwarp$getUrl$1 r2 = new com.Nurgay.Bigwarp$getUrl$1
            r2.<init>(r1)
        L1d:
            r8 = r2
            java.lang.Object r2 = r8.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r8.label
            r5 = 2
            r6 = 1
            switch(r4) {
                case 0: goto Lb6;
                case 1: goto L92;
                case 2: goto L68;
                case 3: goto L33;
                default: goto L2b;
            }
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            java.lang.Object r3 = r8.L$10
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r4 = r8.L$9
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r8.L$8
            kotlin.text.MatchResult r5 = (kotlin.text.MatchResult) r5
            java.lang.Object r6 = r8.L$7
            kotlin.text.Regex r6 = (kotlin.text.Regex) r6
            java.lang.Object r7 = r8.L$6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r8.L$5
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r8.L$4
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r11 = r8.L$3
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            java.lang.Object r12 = r8.L$2
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r8.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r8.L$0
            r0 = r14
            com.Nurgay.Bigwarp r0 = (com.Nurgay.Bigwarp) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r2
            r17 = r8
            goto L21d
        L68:
            java.lang.Object r4 = r8.L$5
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r8.L$4
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r9 = r8.L$3
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r8.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r8.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r8.L$0
            r0 = r12
            com.Nurgay.Bigwarp r0 = (com.Nurgay.Bigwarp) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r24 = r0
            r0 = r3
            r22 = r9
            r21 = r10
            r13 = r11
            r1 = 2
            r3 = r2
            r11 = r7
            r12 = r4
            goto L178
        L92:
            java.lang.Object r4 = r8.L$4
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r7 = r8.L$3
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r9 = r8.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r8.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r8.L$0
            r0 = r11
            com.Nurgay.Bigwarp r0 = (com.Nurgay.Bigwarp) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r3
            r3 = r0
            r0 = r1
            r5 = r2
            r22 = r7
            r21 = r9
            r20 = r10
            r1 = 2
            goto L111
        Lb6:
            kotlin.ResultKt.throwOnFailure(r2)
            r4 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r8.L$0 = r0
            r7 = r26
            r8.L$1 = r7
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r27)
            r8.L$2 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r28)
            r8.L$3 = r9
            r9 = r29
            r8.L$4 = r9
            r8.label = r6
            r10 = 2
            r5 = 0
            r11 = 1
            r6 = 0
            r7 = 0
            r17 = r8
            r8 = 0
            r9 = 0
            r12 = 2
            r10 = 0
            r13 = 1
            r11 = 0
            r14 = 2
            r15 = 1
            r12 = 0
            r16 = 2
            r14 = 0
            r18 = 1
            r15 = 0
            r19 = 2
            r16 = 0
            r20 = 1
            r18 = 4062(0xfde, float:5.692E-42)
            r21 = 2
            r19 = 0
            r0 = r4
            r1 = 2
            r4 = r26
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r8 = r17
            if (r3 != r0) goto L106
            return r0
        L106:
            r20 = r26
            r21 = r27
            r22 = r28
            r4 = r29
            r5 = r3
            r3 = r25
        L111:
            com.lagradost.nicehttp.NiceResponse r5 = (com.lagradost.nicehttp.NiceResponse) r5
            okhttp3.Headers r5 = r5.getHeaders()
            java.lang.String r6 = "location"
            java.lang.String r5 = r5.get(r6)
            if (r5 != 0) goto L121
            r5 = r20
        L121:
            com.lagradost.nicehttp.Requests r6 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r8.L$0 = r3
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r20)
            r8.L$1 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r21)
            r8.L$2 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r8.L$3 = r7
            r8.L$4 = r4
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r8.L$5 = r7
            r8.label = r1
            r7 = r4
            r4 = r5
            r5 = 0
            r9 = r3
            r3 = r6
            r6 = 0
            r10 = r7
            r7 = 0
            r17 = r8
            r8 = 0
            r11 = r9
            r9 = 0
            r12 = r10
            r10 = 0
            r13 = r11
            r11 = 0
            r15 = r12
            r14 = r13
            r12 = 0
            r16 = r14
            r14 = 0
            r18 = r15
            r15 = 0
            r19 = r16
            r16 = 0
            r23 = r18
            r18 = 4094(0xffe, float:5.737E-42)
            r24 = r19
            r19 = 0
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r8 = r17
            if (r3 != r0) goto L173
            return r0
        L173:
            r13 = r20
            r11 = r23
            r12 = r4
        L178:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r3 = r3.getDocument()
            java.lang.String r4 = "body > script"
            org.jsoup.nodes.Element r3 = r3.selectFirst(r4)
            java.lang.String r14 = java.lang.String.valueOf(r3)
            kotlin.text.Regex r3 = new kotlin.text.Regex
            java.lang.String r4 = "file:\\s*\\\"((?:https?://|//)[^\\\"]+)"
            r3.<init>(r4)
            r15 = r3
            r3 = r14
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 0
            r5 = 0
            kotlin.text.MatchResult r1 = kotlin.text.Regex.find$default(r15, r3, r4, r1, r5)
            if (r1 == 0) goto L1a9
            java.util.List r3 = r1.getGroupValues()
            if (r3 == 0) goto L1a9
            r4 = 1
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            goto L1aa
        L1a9:
            r3 = r5
        L1aa:
            if (r3 == 0) goto L22d
        L1ae:
            r4 = r3
            java.lang.String r3 = r24.getName()
            r6 = r4
            java.lang.String r4 = r24.getName()
            com.Nurgay.Bigwarp$getUrl$2 r7 = new com.Nurgay.Bigwarp$getUrl$2
            r7.<init>(r5)
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r8.L$0 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r8.L$1 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r21)
            r8.L$2 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r8.L$3 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r8.L$4 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r8.L$5 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r8.L$6 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r8.L$7 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r8.L$8 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r8.L$9 = r5
            r8.L$10 = r11
            r5 = 3
            r8.label = r5
            r5 = r6
            r6 = 0
            r9 = 8
            r10 = 0
            java.lang.Object r3 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink$default(r3, r4, r5, r6, r7, r8, r9, r10)
            r17 = r8
            if (r3 != r0) goto L20f
            return r0
        L20f:
            r4 = r5
            r10 = r11
            r9 = r12
            r7 = r14
            r6 = r15
            r12 = r21
            r0 = r24
            r5 = r1
            r1 = r3
            r3 = r10
            r11 = r22
        L21d:
            r3.invoke(r1)
            r24 = r0
            r3 = r4
            r1 = r5
            r15 = r6
            r14 = r7
            r22 = r11
            r21 = r12
            r12 = r9
            r11 = r10
            goto L230
        L22d:
            r5 = r3
            r17 = r8
        L230:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nurgay.Bigwarp.getUrl$suspendImpl(com.Nurgay.Bigwarp, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.Nurgay.Bigwarp$getUrl$2 */
    /* JADX INFO: compiled from: Extractors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Nurgay.Bigwarp$getUrl$2", f = "Extractors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00012 extends SuspendLambda implements Function2<ExtractorLink, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C00012(Continuation<? super C00012> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00012 = new C00012(continuation);
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
                    $this$newExtractorLink.setReferer("");
                    $this$newExtractorLink.setQuality(Qualities.Unknown.getValue());
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
