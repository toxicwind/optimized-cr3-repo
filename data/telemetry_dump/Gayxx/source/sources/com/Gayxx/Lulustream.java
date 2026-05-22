package com.Gayxx;

import com.lagradost.cloudstream3.utils.ExtractorApi;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Gayxx/classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0096@¢\u0006\u0002\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/Gayxx/Lulustream;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "url", "referer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Gayxx"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class Lulustream extends ExtractorApi {

    @NotNull
    private String name = "Lulustream";

    @NotNull
    private String mainUrl = "https://lulustream.com";
    private final boolean requiresReferer = true;

    /* JADX INFO: renamed from: com.Gayxx.Lulustream$getUrl$1 */
    /* JADX INFO: compiled from: Extractor.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gayxx.Lulustream", f = "Extractor.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {363, 368}, m = "getUrl$suspendImpl", n = {"$this", "url", "referer", "$this", "url", "referer", "response", "extractedpack", "unPacked", "link", "$i$a$-let-Lulustream$getUrl$2", "$i$a$-let-Lulustream$getUrl$2$1"}, nl = {364, 367}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"}, v = 2)
    static final class C00111 extends ContinuationImpl {
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

        C00111(Continuation<? super C00111> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Lulustream.getUrl$suspendImpl(Lulustream.this, null, null, (Continuation) this);
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object getUrl$suspendImpl(com.Gayxx.Lulustream r21, java.lang.String r22, java.lang.String r23, kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.utils.ExtractorLink>> r24) {
        /*
            r0 = r21
            r1 = r24
            boolean r2 = r1 instanceof com.Gayxx.Lulustream.C00111
            if (r2 == 0) goto L18
            r2 = r1
            com.Gayxx.Lulustream$getUrl$1 r2 = (com.Gayxx.Lulustream.C00111) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Gayxx.Lulustream$getUrl$1 r2 = new com.Gayxx.Lulustream$getUrl$1
            r2.<init>(r1)
        L1d:
            r8 = r2
            java.lang.Object r2 = r8.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r8.label
            r5 = 1
            switch(r4) {
                case 0: goto L73;
                case 1: goto L5c;
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
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r8.L$4
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r8.L$3
            org.jsoup.nodes.Document r9 = (org.jsoup.nodes.Document) r9
            java.lang.Object r10 = r8.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r8.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r8.L$0
            r0 = r12
            com.Gayxx.Lulustream r0 = (com.Gayxx.Lulustream) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r3
            r17 = r8
            r3 = r2
            goto L163
        L5c:
            java.lang.Object r4 = r8.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r8.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r8.L$0
            r0 = r7
            com.Gayxx.Lulustream r0 = (com.Gayxx.Lulustream) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r9 = r0
            r0 = r3
            r11 = r4
            r10 = r6
            r1 = 1
            r3 = r2
            goto Lc0
        L73:
            kotlin.ResultKt.throwOnFailure(r2)
            r4 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.String r6 = r0.getMainUrl()
            r8.L$0 = r0
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r8.L$1 = r7
            r7 = r23
            r8.L$2 = r7
            r8.label = r5
            r9 = 1
            r5 = 0
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
            r18 = 4090(0xffa, float:5.731E-42)
            r20 = 1
            r19 = 0
            r0 = r4
            r1 = 1
            r4 = r22
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r8 = r17
            if (r3 != r0) goto Lba
            return r0
        Lba:
            r9 = r21
            r10 = r22
            r11 = r23
        Lc0:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r12 = r3.getDocument()
            java.lang.String r3 = "script:containsData(function(p,a,c,k,e,d))"
            org.jsoup.nodes.Element r3 = r12.selectFirst(r3)
            r4 = 0
            if (r3 == 0) goto Ld4
            java.lang.String r3 = r3.data()
            goto Ld5
        Ld4:
            r3 = r4
        Ld5:
            java.lang.String r13 = java.lang.String.valueOf(r3)
            com.lagradost.cloudstream3.utils.JsUnpacker r3 = new com.lagradost.cloudstream3.utils.JsUnpacker
            r3.<init>(r13)
            java.lang.String r3 = r3.unpack()
            if (r3 == 0) goto L16c
            r14 = r3
            r15 = 0
            kotlin.text.Regex r3 = new kotlin.text.Regex
            java.lang.String r5 = "sources:\\[\\{file:\"(.*?)\""
            r3.<init>(r5)
            r5 = r14
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6 = 0
            r7 = 2
            kotlin.text.MatchResult r3 = kotlin.text.Regex.find$default(r3, r5, r6, r7, r4)
            if (r3 == 0) goto L168
            java.util.List r3 = r3.getGroupValues()
            if (r3 == 0) goto L168
            java.lang.Object r1 = r3.get(r1)
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L168
            r1 = 0
            java.lang.String r3 = r9.getName()
            java.lang.String r6 = r9.getName()
            r16 = r6
            com.lagradost.cloudstream3.utils.ExtractorLinkType r6 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()
            com.Gayxx.Lulustream$getUrl$2$1$1 r7 = new com.Gayxx.Lulustream$getUrl$2$1$1
            r7.<init>(r11, r4)
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r8.L$0 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r8.L$1 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r8.L$2 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r8.L$3 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r8.L$4 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r8.L$5 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r8.L$6 = r4
            r8.I$0 = r15
            r8.I$1 = r1
            r4 = 2
            r8.label = r4
            r4 = r16
            java.lang.Object r3 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r3, r4, r5, r6, r7, r8)
            r17 = r8
            if (r3 != r0) goto L15b
            return r0
        L15b:
            r0 = r11
            r11 = r10
            r10 = r0
            r0 = r9
            r9 = r12
            r7 = r13
            r6 = r14
            r4 = r15
        L163:
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            return r3
        L168:
            r17 = r8
            goto L16e
        L16c:
            r17 = r8
        L16e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Gayxx.Lulustream.getUrl$suspendImpl(com.Gayxx.Lulustream, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
