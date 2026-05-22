package com.GXtapes;

import com.lagradost.cloudstream3.utils.ExtractorApi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/GXtapes/classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJH\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0013H\u0096@¢\u0006\u0002\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/GXtapes/GXtapes74k;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "name", "", "mainUrl", "requiresReferer", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getMainUrl", "getRequiresReferer", "()Z", "getUrl", "", "url", "referer", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GXtapes"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extractor.kt\ncom/GXtapes/GXtapes74k\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,138:1\n1#2:139\n32#3,2:140\n*S KotlinDebug\n*F\n+ 1 Extractor.kt\ncom/GXtapes/GXtapes74k\n*L\n59#1:140,2\n*E\n"})
public final class GXtapes74k extends ExtractorApi {

    @NotNull
    private final String mainUrl;

    @NotNull
    private final String name;
    private final boolean requiresReferer;

    /* JADX INFO: renamed from: com.GXtapes.GXtapes74k$getUrl$1 */
    /* JADX INFO: compiled from: Extractor.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GXtapes.GXtapes74k", f = "Extractor.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {54, 63}, m = "getUrl", n = {"url", "referer", "subtitleCallback", "callback", "url", "referer", "subtitleCallback", "callback", "response", "script", "unpackedScript", "links", "obj", "$this$forEach$iv", "element$iv", "it", "finalUrl", "$i$f$forEach", "$i$a$-forEach-GXtapes74k$getUrl$2"}, nl = {55, 62}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$11", "L$12", "L$13", "I$0", "I$1"}, v = 2)
    static final class C00061 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
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

        C00061(Continuation<? super C00061> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GXtapes74k.this.getUrl(null, null, null, null, (Continuation) this);
        }
    }

    public GXtapes74k() {
        this(null, null, false, 7, null);
    }

    public GXtapes74k(@NotNull String name, @NotNull String mainUrl, boolean requiresReferer) {
        this.name = name;
        this.mainUrl = mainUrl;
        this.requiresReferer = requiresReferer;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
      (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED] (LINE:43)) != (0 int)) ? ("GXtapes74k") : (r1v0 java.lang.String))
      (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED] (LINE:43)) != (0 int)) ? ("https://74k.io/e/") : (r2v0 java.lang.String))
      (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED] (LINE:43)) != (0 int)) ? false : (r3v0 boolean))
     A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:43) call: com.GXtapes.GXtapes74k.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [43=4] */
    public /* synthetic */ GXtapes74k(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "GXtapes74k" : str, (i & 2) != 0 ? "https://74k.io/e/" : str2, (i & 4) != 0 ? false : z);
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0244 -> B:40:0x0255). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getUrl(@org.jetbrains.annotations.NotNull java.lang.String r28, @org.jetbrains.annotations.Nullable java.lang.String r29, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r30, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r31, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r32) throws org.json.JSONException {
        /*
            r27 = this;
            r0 = r32
            boolean r1 = r0 instanceof com.GXtapes.GXtapes74k.C00061
            if (r1 == 0) goto L18
            r1 = r0
            com.GXtapes.GXtapes74k$getUrl$1 r1 = (com.GXtapes.GXtapes74k.C00061) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            r2 = r27
            goto L1f
        L18:
            com.GXtapes.GXtapes74k$getUrl$1 r1 = new com.GXtapes.GXtapes74k$getUrl$1
            r2 = r27
            r1.<init>(r0)
        L1f:
            java.lang.Object r3 = r1.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r1.label
            switch(r5) {
                case 0: goto Lc1;
                case 1: goto La3;
                case 2: goto L34;
                default: goto L2a;
            }
        L2a:
            r17 = r1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            int r5 = r1.I$1
            int r9 = r1.I$0
            java.lang.Object r10 = r1.L$14
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r11 = r1.L$13
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r1.L$12
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r1.L$11
            java.lang.Object r14 = r1.L$10
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r15 = r1.L$9
            java.util.Iterator r15 = (java.util.Iterator) r15
            java.lang.Object r6 = r1.L$8
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.lang.Object r7 = r1.L$7
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r1.L$6
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r1.L$5
            java.lang.String r0 = (java.lang.String) r0
            r19 = r0
            java.lang.Object r0 = r1.L$4
            org.jsoup.nodes.Document r0 = (org.jsoup.nodes.Document) r0
            r20 = r0
            java.lang.Object r0 = r1.L$3
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r31 = r0
            java.lang.Object r0 = r1.L$2
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r30 = r0
            java.lang.Object r0 = r1.L$1
            java.lang.String r0 = (java.lang.String) r0
            r29 = r0
            java.lang.Object r0 = r1.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r3)
            r25 = r31
            r21 = r2
            r17 = r7
            r18 = r8
            r22 = r13
            r23 = r14
            r8 = r19
            r26 = 0
            r2 = r30
            r7 = r0
            r13 = r9
            r14 = r12
            r19 = r15
            r0 = r32
            r15 = r1
            r1 = r3
            r9 = r4
            r12 = r11
            r4 = r20
            r11 = r6
            r6 = r29
            goto L255
        La3:
            java.lang.Object r0 = r1.L$3
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r5 = r1.L$2
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            java.lang.Object r6 = r1.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r1.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r1
            r21 = r3
            r1 = 0
            r2 = 2
            r3 = r0
            r0 = r4
            r4 = r21
            goto L112
        Lc1:
            kotlin.ResultKt.throwOnFailure(r3)
            r0 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r28)
            r1.L$0 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r29)
            r1.L$1 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r30)
            r1.L$2 = r5
            r5 = r31
            r1.L$3 = r5
            r6 = 1
            r1.label = r6
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r19 = 0
            r16 = 0
            r20 = 0
            r18 = 4094(0xffe, float:5.737E-42)
            r21 = 0
            r19 = 0
            r21 = r0
            r17 = r1
            r0 = r4
            r1 = 0
            r2 = 2
            r4 = r28
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r3 != r0) goto L109
            return r0
        L109:
            r7 = r28
            r6 = r29
            r5 = r30
            r4 = r3
            r3 = r31
        L112:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r4 = r4.getDocument()
            java.lang.String r8 = "script"
            org.jsoup.select.Elements r8 = r4.select(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L124:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L145
            java.lang.Object r9 = r8.next()
            r10 = r9
            org.jsoup.nodes.Element r10 = (org.jsoup.nodes.Element) r10
            r11 = 0
            java.lang.String r12 = r10.data()
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.String r13 = "eval"
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r14 = 0
            boolean r10 = kotlin.text.StringsKt.contains$default(r12, r13, r1, r2, r14)
            if (r10 == 0) goto L124
            r8 = r9
            goto L146
        L145:
            r8 = 0
        L146:
            org.jsoup.nodes.Element r8 = (org.jsoup.nodes.Element) r8
            if (r8 == 0) goto L26b
            java.lang.String r8 = r8.data()
            if (r8 != 0) goto L152
            goto L26b
        L152:
            java.lang.String r9 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getAndUnpack(r8)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = 123(0x7b, float:1.72E-43)
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = "var links={"
            r14 = 0
            java.lang.String r11 = kotlin.text.StringsKt.substringAfter$default(r9, r11, r14, r2, r14)
            java.lang.String r12 = "};"
            java.lang.String r11 = kotlin.text.StringsKt.substringBefore$default(r11, r12, r14, r2, r14)
            java.lang.StringBuilder r10 = r10.append(r11)
            r11 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r10 = r10.toString()
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>(r10)
            java.util.Iterator r12 = r11.keys()
            r13 = 0
            r18 = r9
            r19 = r12
            r14 = r17
            r9 = r0
            r12 = r3
            r17 = r10
            r10 = r11
            r11 = r13
            r3 = r21
            r21 = r27
            r0 = r32
            r13 = r19
        L19a:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L266
            java.lang.Object r22 = r13.next()
            r15 = r22
            java.lang.String r15 = (java.lang.String) r15
            r1 = 0
            java.lang.String r2 = r10.getString(r15)
            r28 = r0
            java.lang.String r0 = "http"
            r30 = r3
            r31 = r4
            r29 = r15
            r3 = 2
            r4 = 0
            r15 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r2, r0, r15, r3, r4)
            if (r0 != 0) goto L1c8
            r0 = r21
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            java.lang.String r2 = com.lagradost.cloudstream3.utils.ExtractorApiKt.fixUrl(r0, r2)
        L1c8:
            r0 = r9
            java.lang.String r9 = r21.getName()
            java.lang.String r3 = r21.getName()
            com.lagradost.cloudstream3.utils.ExtractorLinkType r16 = com.lagradost.cloudstream3.utils.ExtractorLinkType.M3U8
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r14.L$0 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r14.L$1 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r14.L$2 = r4
            r14.L$3 = r12
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r31)
            r14.L$4 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r14.L$5 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r18)
            r14.L$6 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r17)
            r14.L$7 = r4
            r14.L$8 = r10
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)
            r14.L$9 = r4
            r14.L$10 = r13
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r14.L$11 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r29)
            r14.L$12 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r14.L$13 = r4
            r14.L$14 = r12
            r14.I$0 = r11
            r14.I$1 = r1
            r4 = 2
            r14.label = r4
            r23 = r13
            r13 = 0
            r24 = 0
            r15 = 16
            r25 = r12
            r12 = r16
            r16 = 0
            r4 = r0
            r0 = r11
            r26 = 0
            r11 = r2
            r2 = r10
            r10 = r3
            r3 = r29
            java.lang.Object r9 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink$default(r9, r10, r11, r12, r13, r14, r15, r16)
            if (r9 != r4) goto L244
            return r4
        L244:
            r13 = r0
            r12 = r11
            r15 = r14
            r10 = r25
            r0 = r28
            r11 = r2
            r14 = r3
            r2 = r5
            r3 = r9
            r5 = r1
            r9 = r4
            r1 = r30
            r4 = r31
        L255:
            r10.invoke(r3)
            r3 = r1
            r5 = r2
            r10 = r11
            r11 = r13
            r14 = r15
            r13 = r23
            r12 = r25
            r1 = 0
            r2 = 2
            goto L19a
        L266:
            r28 = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L26b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.GXtapes.GXtapes74k.getUrl(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
