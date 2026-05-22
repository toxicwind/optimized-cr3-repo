package com.Nurgay;

import com.lagradost.cloudstream3.utils.ExtractorApi;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extractors.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Nurgay/classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0096@¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/Nurgay/ListMirror;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "mainUrl", "getMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Nurgay"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtractors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extractors.kt\ncom/Nurgay/ListMirror\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,409:1\n1642#2,10:410\n1915#2:420\n1916#2:422\n1652#2:423\n296#2,2:424\n1#3:421\n*S KotlinDebug\n*F\n+ 1 Extractors.kt\ncom/Nurgay/ListMirror\n*L\n31#1:410,10\n31#1:420\n31#1:422\n31#1:423\n32#1:424,2\n31#1:421\n*E\n"})
public final class ListMirror extends ExtractorApi {
    private final boolean requiresReferer;

    @NotNull
    private final String name = "ListMirror";

    @NotNull
    private final String mainUrl = "https://listmirror.com";

    /* JADX INFO: renamed from: com.Nurgay.ListMirror$getUrl$1 */
    /* JADX INFO: compiled from: Extractors.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Nurgay.ListMirror", f = "Extractors.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {28, 45}, m = "getUrl", n = {"url", "referer", "links", "url", "referer", "links", "doc", "script", "regex", "match", "json", "arr", "obj", "mirrorUrl", "i"}, nl = {31, 41}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0"}, v = 2)
    static final class C00041 extends ContinuationImpl {
        int I$0;
        int I$1;
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

        C00041(Continuation<? super C00041> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ListMirror.this.getUrl(null, null, (Continuation) this);
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [419=4] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x020f -> B:49:0x0221). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x022e -> B:51:0x0237). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getUrl(@org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.Nullable java.lang.String r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.utils.ExtractorLink>> r26) throws org.json.JSONException {
        /*
            r23 = this;
            r0 = r26
            boolean r1 = r0 instanceof com.Nurgay.ListMirror.C00041
            if (r1 == 0) goto L18
            r1 = r0
            com.Nurgay.ListMirror$getUrl$1 r1 = (com.Nurgay.ListMirror.C00041) r1
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
            com.Nurgay.ListMirror$getUrl$1 r1 = new com.Nurgay.ListMirror$getUrl$1
            r2 = r23
            r1.<init>(r0)
        L1f:
            java.lang.Object r3 = r1.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r1.label
            switch(r5) {
                case 0: goto L99;
                case 1: goto L81;
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
            int r8 = r1.I$0
            java.lang.Object r9 = r1.L$10
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r1.L$9
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            java.lang.Object r11 = r1.L$8
            org.json.JSONArray r11 = (org.json.JSONArray) r11
            java.lang.Object r12 = r1.L$7
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r1.L$6
            kotlin.text.MatchResult r13 = (kotlin.text.MatchResult) r13
            java.lang.Object r14 = r1.L$5
            kotlin.text.Regex r14 = (kotlin.text.Regex) r14
            java.lang.Object r15 = r1.L$4
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r6 = r1.L$3
            org.jsoup.nodes.Document r6 = (org.jsoup.nodes.Document) r6
            java.lang.Object r7 = r1.L$2
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r0 = r1.L$1
            java.lang.String r0 = (java.lang.String) r0
            r25 = r0
            java.lang.Object r0 = r1.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r3)
            r18 = r2
            r16 = r14
            r17 = r15
            r22 = 1
            r2 = r1
            r14 = r12
            r15 = r13
            r1 = r0
            r12 = r5
            r13 = r11
            r5 = r25
            r0 = r26
            r11 = r8
            r8 = r7
            r7 = r6
            r6 = 2
            goto L221
        L81:
            java.lang.Object r0 = r1.L$2
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r5 = r1.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.L$0
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r3)
            r21 = r0
            r17 = r1
            r20 = r3
            r1 = r4
            r0 = 2
            goto Lec
        L99:
            kotlin.ResultKt.throwOnFailure(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r5 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r1.L$0 = r6
            r6 = r25
            r1.L$1 = r6
            r1.L$2 = r0
            r7 = 1
            r1.label = r7
            r8 = r5
            r5 = 0
            r6 = 0
            r17 = 1
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
            r18 = r15
            r15 = 0
            r19 = 2
            r16 = 0
            r20 = r18
            r18 = 4094(0xffe, float:5.737E-42)
            r21 = 2
            r19 = 0
            r21 = r0
            r17 = r1
            r1 = r4
            r0 = 2
            r4 = r24
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r3 != r1) goto Le8
            return r1
        Le8:
            r6 = r24
            r5 = r25
        Lec:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r3 = r3.getDocument()
            java.lang.String r4 = "script"
            org.jsoup.select.Elements r4 = r3.select(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r7 = 0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r8 = (java.util.Collection) r8
            r9 = r4
            r10 = 0
            r11 = r9
            r12 = 0
            java.util.Iterator r13 = r11.iterator()
        L10a:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L12e
            java.lang.Object r14 = r13.next()
            r15 = r14
            r16 = 0
            r18 = r15
            org.jsoup.nodes.Element r18 = (org.jsoup.nodes.Element) r18
            r19 = 0
            java.lang.String r18 = r18.data()
            if (r18 == 0) goto L12c
            r24 = r18
            r18 = 0
            r0 = r24
            r8.add(r0)
        L12c:
            r0 = 2
            goto L10a
        L12e:
            r0 = r8
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r4 = 0
            java.util.Iterator r7 = r0.iterator()
        L13c:
            boolean r8 = r7.hasNext()
            r9 = 0
            r10 = 0
            if (r8 == 0) goto L15b
            java.lang.Object r8 = r7.next()
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            r12 = 0
            r13 = r11
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            java.lang.String r14 = "sources"
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r15 = 2
            boolean r11 = kotlin.text.StringsKt.contains$default(r13, r14, r9, r15, r10)
            if (r11 == 0) goto L13c
            goto L15c
        L15b:
            r8 = r10
        L15c:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L24d
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r4 = "sources\\s*=\\s*(\\[.*?]);"
            kotlin.text.RegexOption r7 = kotlin.text.RegexOption.DOT_MATCHES_ALL
            r0.<init>(r4, r7)
            r4 = r8
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r15 = 2
            kotlin.text.MatchResult r4 = kotlin.text.Regex.find$default(r0, r4, r9, r15, r10)
            if (r4 == 0) goto L183
            java.util.List r7 = r4.getGroupValues()
            if (r7 == 0) goto L183
            r9 = 1
            java.lang.Object r7 = r7.get(r9)
            r10 = r7
            java.lang.String r10 = (java.lang.String) r10
            goto L184
        L183:
            r9 = 1
        L184:
            if (r10 == 0) goto L24d
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>(r10)
            r11 = 0
            int r12 = r7.length()
            r15 = r0
            r14 = r4
            r16 = r8
            r13 = r10
            r8 = r21
            r0 = r26
            r4 = r1
            r10 = r7
            r1 = r17
            r17 = r2
            r7 = r3
            r3 = r20
        L1a2:
            if (r11 >= r12) goto L23f
            r22 = 1
            org.json.JSONObject r9 = r10.getJSONObject(r11)
            r24 = r0
            java.lang.String r0 = "url"
            java.lang.String r0 = r9.optString(r0)
            r18 = r0
            java.lang.CharSequence r18 = (java.lang.CharSequence) r18
            boolean r18 = kotlin.text.StringsKt.isBlank(r18)
            if (r18 != 0) goto L22e
        L1bd:
            com.Nurgay.ListMirror$$ExternalSyntheticLambda0 r2 = new com.Nurgay.ListMirror$$ExternalSyntheticLambda0
            r2.<init>()
            r25 = r3
            com.Nurgay.ListMirror$$ExternalSyntheticLambda1 r3 = new com.Nurgay.ListMirror$$ExternalSyntheticLambda1
            r3.<init>()
            r26 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)
            r1.L$0 = r6
            r1.L$1 = r5
            r1.L$2 = r8
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r1.L$3 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r1.L$4 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r1.L$5 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r1.L$6 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r1.L$7 = r6
            r1.L$8 = r10
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r1.L$9 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r1.L$10 = r6
            r1.I$0 = r11
            r1.I$1 = r12
            r6 = 2
            r1.label = r6
            java.lang.Object r2 = com.lagradost.cloudstream3.utils.ExtractorApiKt.loadExtractor(r0, r5, r2, r3, r1)
            if (r2 != r4) goto L20f
            return r4
        L20f:
            r3 = r25
            r2 = r1
            r18 = r17
            r1 = r26
            r17 = r16
            r16 = r15
            r15 = r14
            r14 = r13
            r13 = r10
            r10 = r9
            r9 = r0
            r0 = r24
        L221:
            r10 = r2
            r2 = r1
            r1 = r10
            r10 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            goto L237
        L22e:
            r25 = r3
            r26 = r6
            r6 = 2
            r0 = r24
            r2 = r26
        L237:
            int r11 = r11 + 1
            r6 = r2
            r9 = 1
            r2 = r23
            goto L1a2
        L23f:
            r24 = r0
            r25 = r3
            r26 = r6
            r20 = r25
            r3 = r7
            r21 = r8
            r8 = r16
            goto L253
        L24d:
            r0 = r26
            r1 = r17
            r17 = r23
        L253:
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nurgay.ListMirror.getUrl(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static final Unit getUrl$lambda$3(List $links, ExtractorLink link) {
        $links.add(link);
        return Unit.INSTANCE;
    }
}
