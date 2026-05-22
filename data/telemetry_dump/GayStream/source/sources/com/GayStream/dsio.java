package com.GayStream;

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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extractors.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/GayStream/classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0096@¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/GayStream/dsio;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "mainUrl", "getMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GayStream"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtractors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extractors.kt\ncom/GayStream/dsio\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,301:1\n1586#2:302\n1661#2,3:303\n*S KotlinDebug\n*F\n+ 1 Extractors.kt\ncom/GayStream/dsio\n*L\n110#1:302\n110#1:303,3\n*E\n"})
public class dsio extends ExtractorApi {

    @NotNull
    private final String name = "dsio";

    @NotNull
    private final String mainUrl = "d-s.io";
    private final boolean requiresReferer = true;

    /* JADX INFO: renamed from: com.GayStream.dsio$getUrl$1 */
    /* JADX INFO: compiled from: Extractors.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GayStream.dsio", f = "Extractors.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {101, 107, 121}, m = "getUrl$suspendImpl", n = {"$this", "url", "referer", "$this", "url", "referer", "response0", "passMd5Path", "token", "md5Url", "$this", "url", "referer", "response0", "passMd5Path", "token", "md5Url", "res", "videoData", "randomStr", "link", "quality"}, nl = {103, 108, 120}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11"}, v = 2)
    static final class C00111 extends ContinuationImpl {
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

        C00111(Continuation<? super C00111> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return dsio.getUrl$suspendImpl(dsio.this, null, null, (Continuation) this);
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [100=5, 116=4, 118=4] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d9 A[LOOP:0: B:29:0x01d3->B:31:0x01d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0321 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object getUrl$suspendImpl(com.GayStream.dsio r37, java.lang.String r38, java.lang.String r39, kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.utils.ExtractorLink>> r40) {
        /*
            r0 = r37
            r1 = r40
            boolean r2 = r1 instanceof com.GayStream.dsio.C00111
            if (r2 == 0) goto L18
            r2 = r1
            com.GayStream.dsio$getUrl$1 r2 = (com.GayStream.dsio.C00111) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.GayStream.dsio$getUrl$1 r2 = new com.GayStream.dsio$getUrl$1
            r2.<init>(r1)
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
                case 0: goto Lbd;
                case 1: goto La0;
                case 2: goto L72;
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
            com.lagradost.nicehttp.NiceResponse r7 = (com.lagradost.nicehttp.NiceResponse) r7
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
            com.GayStream.dsio r0 = (com.GayStream.dsio) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r20 = r2
            r1 = r3
            r17 = r8
            r3 = r20
            goto L32c
        L72:
            java.lang.Object r4 = r8.L$6
            java.lang.String r4 = (java.lang.String) r4
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
            com.GayStream.dsio r0 = (com.GayStream.dsio) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r9 = r0
            r20 = r2
            r0 = r3
            r22 = r11
            r1 = 0
            r3 = r20
            r11 = r10
            r2 = 2
            r10 = r4
            goto L1ae
        La0:
            java.lang.Object r4 = r8.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r10 = r8.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r8.L$0
            r0 = r11
            com.GayStream.dsio r0 = (com.GayStream.dsio) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r3
            r3 = r0
            r0 = r1
            r20 = r2
            r21 = r4
            r6 = r10
            r1 = 0
            r4 = r20
            r2 = 2
            goto L110
        Lbd:
            kotlin.ResultKt.throwOnFailure(r2)
            r4 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r8.L$0 = r0
            r10 = r38
            r8.L$1 = r10
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r39)
            r8.L$2 = r11
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
            r0 = r4
            r1 = 0
            r2 = 2
            r4 = r38
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r8 = r17
            if (r3 != r0) goto L109
            return r0
        L109:
            r6 = r38
            r21 = r39
            r4 = r3
            r3 = r37
        L110:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            java.lang.String r4 = r4.getText()
            kotlin.text.Regex r5 = new kotlin.text.Regex
            java.lang.String r7 = "/pass_md5/[^'\"]+"
            r5.<init>(r7)
            r7 = r4
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r14 = 0
            kotlin.text.MatchResult r5 = kotlin.text.Regex.find$default(r5, r7, r1, r2, r14)
            if (r5 == 0) goto L331
            java.lang.String r5 = r5.getValue()
            if (r5 != 0) goto L135
            r27 = r3
            r25 = r4
            r17 = r8
            goto L337
        L135:
            java.lang.String r7 = "/"
            java.lang.String r7 = kotlin.text.StringsKt.substringAfterLast$default(r5, r7, r14, r2, r14)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r3.getMainUrl()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r5)
            java.lang.String r9 = r9.toString()
            com.lagradost.nicehttp.Requests r10 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r8.L$0 = r3
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r8.L$1 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r21)
            r8.L$2 = r11
            r8.L$3 = r4
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r8.L$4 = r11
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
            r22 = r15
            r15 = 0
            r25 = r16
            r16 = 0
            r26 = r18
            r18 = 4090(0xffa, float:5.731E-42)
            r27 = r19
            r19 = 0
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r8 = r17
            if (r3 != r0) goto L1a4
            return r0
        L1a4:
            r14 = r6
            r13 = r21
            r12 = r25
            r11 = r26
            r9 = r27
            r10 = r4
        L1ae:
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
        L1d3:
            boolean r19 = r18.hasNext()
            if (r19 == 0) goto L232
            r19 = r18
            kotlin.collections.IntIterator r19 = (kotlin.collections.IntIterator) r19
            int r19 = r19.nextInt()
            r21 = r19
            r24 = 0
            kotlin.ranges.CharRange r1 = new kotlin.ranges.CharRange
            r2 = 97
            r37 = r4
            r4 = 122(0x7a, float:1.71E-43)
            r1.<init>(r2, r4)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.ranges.CharRange r2 = new kotlin.ranges.CharRange
            r4 = 65
            r38 = r6
            r6 = 90
            r2.<init>(r4, r6)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r1 = kotlin.collections.CollectionsKt.plus(r1, r2)
            java.util.Collection r1 = (java.util.Collection) r1
            kotlin.ranges.CharRange r2 = new kotlin.ranges.CharRange
            r4 = 48
            r6 = 57
            r2.<init>(r4, r6)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r1 = kotlin.collections.CollectionsKt.plus(r1, r2)
            java.util.Collection r1 = (java.util.Collection) r1
            kotlin.random.Random$Default r2 = kotlin.random.Random.Default
            kotlin.random.Random r2 = (kotlin.random.Random) r2
            java.lang.Object r1 = kotlin.collections.CollectionsKt.random(r1, r2)
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            java.lang.Character r1 = kotlin.coroutines.jvm.internal.Boxing.boxChar(r1)
            r5.add(r1)
            r4 = r37
            r6 = r38
            r1 = 0
            r2 = 2
            goto L1d3
        L232:
            r37 = r4
            r38 = r6
            r1 = r5
            java.util.List r1 = (java.util.List) r1
            r28 = r1
            java.lang.Iterable r28 = (java.lang.Iterable) r28
            java.lang.String r1 = ""
            r29 = r1
            java.lang.CharSequence r29 = (java.lang.CharSequence) r29
            r35 = 62
            r36 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            java.lang.String r1 = kotlin.collections.CollectionsKt.joinToString$default(r28, r29, r30, r31, r32, r33, r34, r35, r36)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r4 = "?token="
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r11)
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
            r37 = r1
            java.lang.String r1 = "</title>"
            java.lang.String r1 = kotlin.text.StringsKt.substringBefore$default(r4, r1, r7, r6, r7)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4 = 0
            kotlin.text.MatchResult r1 = kotlin.text.Regex.find$default(r2, r1, r4, r6, r7)
            if (r1 == 0) goto L2b1
        L2a2:
            java.util.List r1 = r1.getGroupValues()
            if (r1 == 0) goto L2b1
        L2a9:
            r6 = 1
            java.lang.Object r1 = r1.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            goto L2b2
        L2b1:
            r1 = 0
        L2b2:
            r2 = r3
            java.lang.String r3 = r9.getName()
            java.lang.String r4 = r9.getName()
            com.lagradost.cloudstream3.utils.ExtractorLinkType r6 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()
            com.GayStream.dsio$getUrl$2 r7 = new com.GayStream.dsio$getUrl$2
            r38 = r2
            r2 = 0
            r7.<init>(r1, r2)
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r8.L$0 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r8.L$1 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r8.L$2 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r8.L$3 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r8.L$4 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r8.L$5 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r8.L$6 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r8.L$7 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r38)
            r8.L$8 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r37)
            r8.L$9 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r8.L$10 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r8.L$11 = r2
            r2 = 3
            r8.label = r2
            r2 = r38
            java.lang.Object r3 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r3, r4, r5, r6, r7, r8)
            r17 = r8
            if (r3 != r0) goto L322
            return r0
        L322:
            r6 = r2
            r4 = r5
            r0 = r9
            r9 = r10
            r10 = r11
            r7 = r15
            r11 = r22
            r5 = r37
        L32c:
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r3)
            return r2
        L331:
            r27 = r3
            r25 = r4
            r17 = r8
        L337:
            r23 = 0
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.GayStream.dsio.getUrl$suspendImpl(com.GayStream.dsio, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.GayStream.dsio$getUrl$2 */
    /* JADX INFO: compiled from: Extractors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GayStream.dsio$getUrl$2", f = "Extractors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00122 extends SuspendLambda implements Function2<ExtractorLink, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $quality;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00122(String str, Continuation<? super C00122> continuation) {
            super(2, continuation);
            this.$quality = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00122 = dsio.this.new C00122(this.$quality, continuation);
            c00122.L$0 = obj;
            return c00122;
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
                    $this$newExtractorLink.setReferer(dsio.this.getMainUrl());
                    $this$newExtractorLink.setQuality(ExtractorApiKt.getQualityFromName(this.$quality));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
