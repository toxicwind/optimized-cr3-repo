package com.Gayxx;

import com.lagradost.cloudstream3.utils.ExtractorApi;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Gayxx/classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0096@¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/Gayxx/AbyssExtractor;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "mainUrl", "getMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Gayxx"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extractor.kt\ncom/Gayxx/AbyssExtractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,451:1\n1915#2,2:452\n*S KotlinDebug\n*F\n+ 1 Extractor.kt\ncom/Gayxx/AbyssExtractor\n*L\n405#1:452,2\n*E\n"})
public class AbyssExtractor extends ExtractorApi {

    @NotNull
    private final String name = "Abyss";

    @NotNull
    private final String mainUrl = "https://abyss.to";
    private final boolean requiresReferer = true;

    /* JADX INFO: renamed from: com.Gayxx.AbyssExtractor$getUrl$1 */
    /* JADX INFO: compiled from: Extractor.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gayxx.AbyssExtractor", f = "Extractor.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, l = {390, 397, 412, 425}, m = "getUrl$suspendImpl", n = {"$this", "url", "referer", "$this", "url", "referer", "response", "document", "m3u8", "$i$a$-let-AbyssExtractor$getUrl$2", "$this", "url", "referer", "response", "document", "$this$forEach$iv", "element$iv", "script", "data", "unpacked", "m3u8", "$i$f$forEach", "$i$a$-forEach-AbyssExtractor$getUrl$3", "$i$a$-let-AbyssExtractor$getUrl$3$1", "$i$a$-let-AbyssExtractor$getUrl$3$1$1", "$this", "url", "referer", "response", "document", "file", "$i$a$-let-AbyssExtractor$getUrl$4"}, nl = {391, 396, 411, 424}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"}, v = 2)
    static final class C00001 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
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
            return AbyssExtractor.getUrl$suspendImpl(AbyssExtractor.this, null, null, (Continuation) this);
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [389=6, 395=4, 409=4, 410=6] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object getUrl$suspendImpl(com.Gayxx.AbyssExtractor r22, java.lang.String r23, java.lang.String r24, kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.utils.ExtractorLink>> r25) {
        /*
            r0 = r22
            r1 = r25
            boolean r2 = r1 instanceof com.Gayxx.AbyssExtractor.C00001
            if (r2 == 0) goto L18
            r2 = r1
            com.Gayxx.AbyssExtractor$getUrl$1 r2 = (com.Gayxx.AbyssExtractor.C00001) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Gayxx.AbyssExtractor$getUrl$1 r2 = new com.Gayxx.AbyssExtractor$getUrl$1
            r2.<init>(r1)
        L1d:
            r8 = r2
            java.lang.Object r2 = r8.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r8.label
            r5 = 1
            switch(r4) {
                case 0: goto Ld2;
                case 1: goto Lbb;
                case 2: goto L98;
                case 3: goto L54;
                case 4: goto L32;
                default: goto L2a;
            }
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L32:
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
            com.Gayxx.AbyssExtractor r0 = (com.Gayxx.AbyssExtractor) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r20 = r2
            goto L30c
        L54:
            int r3 = r8.I$3
            int r4 = r8.I$2
            int r5 = r8.I$1
            int r6 = r8.I$0
            java.lang.Object r7 = r8.L$10
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r8.L$9
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r8.L$8
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r8.L$7
            org.jsoup.nodes.Element r11 = (org.jsoup.nodes.Element) r11
            java.lang.Object r12 = r8.L$6
            java.lang.Object r13 = r8.L$5
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r14 = r8.L$4
            org.jsoup.nodes.Document r14 = (org.jsoup.nodes.Document) r14
            java.lang.Object r15 = r8.L$3
            com.lagradost.nicehttp.NiceResponse r15 = (com.lagradost.nicehttp.NiceResponse) r15
            java.lang.Object r1 = r8.L$2
            java.lang.String r1 = (java.lang.String) r1
            r24 = r1
            java.lang.Object r1 = r8.L$1
            java.lang.String r1 = (java.lang.String) r1
            r23 = r1
            java.lang.Object r1 = r8.L$0
            r0 = r1
            com.Gayxx.AbyssExtractor r0 = (com.Gayxx.AbyssExtractor) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r24
            r20 = r2
            r19 = r10
            r10 = r23
            goto L284
        L98:
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
            com.Gayxx.AbyssExtractor r0 = (com.Gayxx.AbyssExtractor) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r12 = r5
            r5 = r3
            r3 = r2
            goto L18a
        Lbb:
            java.lang.Object r1 = r8.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r8.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r8.L$0
            r0 = r6
            com.Gayxx.AbyssExtractor r0 = (com.Gayxx.AbyssExtractor) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r9 = r0
            r11 = r1
            r1 = r3
            r10 = r4
            r0 = 1
            r3 = r2
            goto L119
        Ld2:
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            if (r24 != 0) goto Le2
            java.lang.String r4 = r0.getMainUrl()
            r6 = r4
            goto Le4
        Le2:
            r6 = r24
        Le4:
            r8.L$0 = r0
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)
            r8.L$1 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r8.L$2 = r4
            r8.label = r5
            r4 = 1
            r5 = 0
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
            r18 = 4090(0xffa, float:5.731E-42)
            r19 = 0
            r4 = r23
            r0 = 1
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r8 = r17
            if (r3 != r1) goto L113
            return r1
        L113:
            r9 = r22
            r10 = r23
            r11 = r24
        L119:
            r12 = r3
            com.lagradost.nicehttp.NiceResponse r12 = (com.lagradost.nicehttp.NiceResponse) r12
            org.jsoup.nodes.Document r13 = r12.getDocument()
            kotlin.text.Regex r3 = new kotlin.text.Regex
            java.lang.String r4 = "(https?://[^\\s'\"]+\\.m3u8[^\\s'\"]*)"
            r3.<init>(r4)
            java.lang.String r4 = r12.getText()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = 0
            r6 = 2
            r7 = 0
            kotlin.text.MatchResult r3 = kotlin.text.Regex.find$default(r3, r4, r5, r6, r7)
            if (r3 == 0) goto L18f
        L138:
            java.lang.String r3 = r3.getValue()
            if (r3 == 0) goto L18f
        L13f:
            r5 = r3
            r0 = 0
            java.lang.String r3 = r9.getName()
            java.lang.String r4 = r9.getName()
            com.lagradost.cloudstream3.utils.ExtractorLinkType r14 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()
            com.Gayxx.AbyssExtractor$getUrl$2$1 r15 = new com.Gayxx.AbyssExtractor$getUrl$2$1
            r15.<init>(r9, r7)
            r7 = r15
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r8.L$0 = r15
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r8.L$1 = r15
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r8.L$2 = r15
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r8.L$3 = r15
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r8.L$4 = r15
            java.lang.Object r15 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r8.L$5 = r15
            r8.I$0 = r0
            r8.label = r6
            r6 = r14
            java.lang.Object r3 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r3, r4, r5, r6, r7, r8)
            if (r3 != r1) goto L185
            return r1
        L185:
            r1 = r0
            r0 = r9
            r7 = r10
            r6 = r11
            r4 = r13
        L18a:
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            return r3
        L18f:
            java.lang.String r3 = "script"
            org.jsoup.select.Elements r3 = r13.select(r3)
            r14 = r3
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = 0
            java.util.Iterator r3 = r14.iterator()
        L19d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2ae
            java.lang.Object r16 = r3.next()
            r17 = r16
            org.jsoup.nodes.Element r17 = (org.jsoup.nodes.Element) r17
            r4 = 0
            java.lang.String r0 = r17.data()
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r19 = "sources"
            r20 = r2
            r2 = r19
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r23 = r3
            r3 = 0
            boolean r2 = kotlin.text.StringsKt.contains$default(r5, r2, r3, r6, r7)
            if (r2 == 0) goto L29d
            com.lagradost.cloudstream3.utils.JsUnpacker r2 = new com.lagradost.cloudstream3.utils.JsUnpacker
            r2.<init>(r0)
            java.lang.String r2 = r2.unpack()
            if (r2 == 0) goto L295
            r3 = 0
            kotlin.text.Regex r5 = new kotlin.text.Regex
            java.lang.String r6 = "file\\s*:\\s*\"([^\"]+\\.m3u8[^\"]*)\""
            r5.<init>(r6)
            r6 = r2
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r19 = r0
            r22 = r2
            r0 = 0
            r2 = 2
            kotlin.text.MatchResult r5 = kotlin.text.Regex.find$default(r5, r6, r0, r2, r7)
            if (r5 == 0) goto L28e
        L1e8:
            java.util.List r5 = r5.getGroupValues()
            if (r5 == 0) goto L28e
        L1ef:
            r6 = 1
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L289
        L1fa:
            r0 = 0
            java.lang.String r2 = r9.getName()
            java.lang.String r6 = r9.getName()
            r18 = r6
            com.lagradost.cloudstream3.utils.ExtractorLinkType r6 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()
            r23 = r2
            com.Gayxx.AbyssExtractor$getUrl$3$1$1$1 r2 = new com.Gayxx.AbyssExtractor$getUrl$3$1$1$1
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
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r8.L$5 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r8.L$6 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r17)
            r8.L$7 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)
            r8.L$8 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r8.L$9 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r8.L$10 = r2
            r8.I$0 = r15
            r8.I$1 = r4
            r8.I$2 = r3
            r8.I$3 = r0
            r2 = 3
            r8.label = r2
            r21 = r18
            r18 = r4
            r4 = r21
            r21 = r3
            r3 = r23
            java.lang.Object r2 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r3, r4, r5, r6, r7, r8)
            if (r2 != r1) goto L271
            return r1
        L271:
            r1 = r14
            r14 = r13
            r13 = r1
            r3 = r0
            r7 = r5
            r0 = r9
            r1 = r11
            r6 = r15
            r11 = r17
            r5 = r18
            r4 = r21
            r9 = r22
            r15 = r12
            r12 = r16
        L284:
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            return r2
        L289:
            r21 = r3
            r18 = r4
            goto L293
        L28e:
            r21 = r3
            r18 = r4
            r6 = 1
        L293:
            goto L29c
        L295:
            r19 = r0
            r18 = r4
            r0 = 0
            r2 = 2
            r6 = 1
        L29c:
            goto L2a4
        L29d:
            r19 = r0
            r18 = r4
            r0 = 0
            r2 = 2
            r6 = 1
        L2a4:
            r3 = r23
            r2 = r20
            r0 = 1
            r5 = 0
            r6 = 2
            goto L19d
        L2ae:
            r20 = r2
            java.lang.String r0 = "source[src]"
            org.jsoup.nodes.Element r0 = r13.selectFirst(r0)
            if (r0 == 0) goto L311
            java.lang.String r2 = "src"
            java.lang.String r5 = r0.attr(r2)
            if (r5 == 0) goto L311
            r0 = 0
            java.lang.String r3 = r9.getName()
            java.lang.String r4 = r9.getName()
            com.lagradost.cloudstream3.utils.ExtractorLinkType r6 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()
            com.Gayxx.AbyssExtractor$getUrl$4$1 r2 = new com.Gayxx.AbyssExtractor$getUrl$4$1
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
            if (r2 != r1) goto L305
            return r1
        L305:
            r3 = r0
            r4 = r5
            r0 = r9
            r9 = r10
            r7 = r11
            r6 = r12
            r5 = r13
        L30c:
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r2)
            return r1
        L311:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Gayxx.AbyssExtractor.getUrl$suspendImpl(com.Gayxx.AbyssExtractor, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
