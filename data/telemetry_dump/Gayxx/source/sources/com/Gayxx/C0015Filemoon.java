package com.Gayxx;

import com.lagradost.cloudstream3.SubtitleFile;
import com.lagradost.cloudstream3.utils.ExtractorApi;
import com.lagradost.cloudstream3.utils.ExtractorApiKt;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jsoup.nodes.Element;

/* JADX INFO: renamed from: com.Gayxx.Filemoon, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Gayxx/classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0013H\u0096@¢\u0006\u0002\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/Gayxx/Filemoon;", "Lcom/lagradost/cloudstream3/utils/ExtractorApi;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "mainUrl", "getMainUrl", "requiresReferer", "", "getRequiresReferer", "()Z", "getUrl", "", "url", "referer", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unpackJs", "script", "Lorg/jsoup/nodes/Element;", "Gayxx"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extractor.kt\ncom/Gayxx/Filemoon\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,451:1\n1915#2,2:452\n1#3:454\n*S KotlinDebug\n*F\n+ 1 Extractor.kt\ncom/Gayxx/Filemoon\n*L\n343#1:452,2\n*E\n"})
public class C0015Filemoon extends ExtractorApi {

    @NotNull
    private final String name = "Filemoon";

    @NotNull
    private final String mainUrl = "https://filemoon.sx";
    private final boolean requiresReferer = true;

    /* JADX INFO: renamed from: com.Gayxx.Filemoon$getUrl$1 */
    /* JADX INFO: compiled from: Extractor.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gayxx.Filemoon", f = "Extractor.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {337, 339}, m = "getUrl$suspendImpl", n = {"$this", "url", "referer", "subtitleCallback", "callback", "$this", "url", "referer", "subtitleCallback", "callback", "doc", "link"}, nl = {338, 343}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"}, v = 2)
    static final class C00021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C00021(Continuation<? super C00021> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C0015Filemoon.getUrl$suspendImpl(C0015Filemoon.this, null, null, null, null, (Continuation) this);
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

    @NotNull
    public String getMainUrl() {
        return this.mainUrl;
    }

    public boolean getRequiresReferer() {
        return this.requiresReferer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [331=4] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015c A[LOOP:0: B:32:0x0156->B:34:0x015c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object getUrl$suspendImpl(com.Gayxx.C0015Filemoon r20, java.lang.String r21, java.lang.String r22, kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r23, kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r24, kotlin.coroutines.Continuation<? super kotlin.Unit> r25) {
        /*
            r0 = r20
            r1 = r25
            boolean r2 = r1 instanceof com.Gayxx.C0015Filemoon.C00021
            if (r2 == 0) goto L18
            r2 = r1
            com.Gayxx.Filemoon$getUrl$1 r2 = (com.Gayxx.C0015Filemoon.C00021) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Gayxx.Filemoon$getUrl$1 r2 = new com.Gayxx.Filemoon$getUrl$1
            r2.<init>(r1)
        L1d:
            r10 = r2
            java.lang.Object r2 = r10.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r10.label
            switch(r4) {
                case 0: goto L79;
                case 1: goto L58;
                case 2: goto L31;
                default: goto L29;
            }
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L31:
            java.lang.Object r3 = r10.L$6
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r10.L$5
            org.jsoup.nodes.Document r4 = (org.jsoup.nodes.Document) r4
            java.lang.Object r5 = r10.L$4
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            java.lang.Object r6 = r10.L$3
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            java.lang.Object r7 = r10.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r10.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r10.L$0
            r0 = r9
            com.Gayxx.Filemoon r0 = (com.Gayxx.C0015Filemoon) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r16 = r6
            r6 = r5
            r5 = r3
            r3 = r2
            goto L14e
        L58:
            java.lang.Object r4 = r10.L$4
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r5 = r10.L$3
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            java.lang.Object r6 = r10.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r10.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r10.L$0
            r0 = r8
            com.Gayxx.Filemoon r0 = (com.Gayxx.C0015Filemoon) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r13 = r0
            r0 = r3
            r3 = r4
            r16 = r5
            r15 = r6
            r14 = r7
            r4 = r2
            goto Lc6
        L79:
            kotlin.ResultKt.throwOnFailure(r2)
            r4 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r10.L$0 = r0
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r21)
            r10.L$1 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r10.L$2 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)
            r10.L$3 = r5
            r5 = r24
            r10.L$4 = r5
            r6 = 1
            r10.label = r6
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r17 = r10
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 4094(0xffe, float:5.737E-42)
            r19 = 0
            r0 = r4
            r4 = r21
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r10 = r17
            if (r3 != r0) goto Lbb
            return r0
        Lbb:
            r13 = r20
            r14 = r21
            r15 = r22
            r16 = r23
            r4 = r3
            r3 = r24
        Lc6:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r17 = r4.getDocument()
            r4 = r17
            org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
            java.lang.String r4 = r13.unpackJs(r4)
            r5 = 2
            r6 = 0
            if (r4 == 0) goto Le6
            java.lang.String r7 = "file:\""
            java.lang.String r4 = kotlin.text.StringsKt.substringAfter$default(r4, r7, r6, r5, r6)
            if (r4 == 0) goto Le6
            java.lang.String r7 = "\""
            java.lang.String r6 = kotlin.text.StringsKt.substringBefore$default(r4, r7, r6, r5, r6)
        Le6:
            com.lagradost.cloudstream3.utils.M3u8Helper$Companion r4 = com.lagradost.cloudstream3.utils.M3u8Helper.Companion
            r7 = r4
            java.lang.String r4 = r13.getName()
            if (r6 != 0) goto Lf2
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lf2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r13.getMainUrl()
            java.lang.StringBuilder r8 = r8.append(r9)
            r9 = 47
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r10.L$0 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r10.L$1 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r10.L$2 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r10.L$3 = r9
            r10.L$4 = r3
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r17)
            r10.L$5 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r10.L$6 = r9
            r10.label = r5
            r5 = r3
            r3 = r7
            r7 = 0
            r9 = r5
            r5 = r6
            r6 = r8
            r8 = 0
            r11 = r9
            r9 = 0
            r12 = r11
            r11 = 56
            r18 = r12
            r12 = 0
            java.lang.Object r3 = com.lagradost.cloudstream3.utils.M3u8Helper.Companion.generateM3u8$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r0) goto L147
            return r0
        L147:
            r0 = r13
            r8 = r14
            r7 = r15
            r4 = r17
            r6 = r18
        L14e:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r9 = 0
            java.util.Iterator r11 = r3.iterator()
        L156:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L164
            java.lang.Object r12 = r11.next()
            r6.invoke(r12)
            goto L156
        L164:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Gayxx.C0015Filemoon.getUrl$suspendImpl(com.Gayxx.Filemoon, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [347=5, 348=5] */
    private final String unpackJs(Element script) {
        Object next;
        String it;
        Iterator it2 = script.select("script").iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (StringsKt.contains$default(((Element) next).data(), "eval(function(p,a,c,k,e,d)", false, 2, (Object) null)) {
                break;
            }
        }
        Element element = (Element) next;
        if (element == null || (it = element.data()) == null) {
            return null;
        }
        return ExtractorApiKt.getAndUnpack(it);
    }
}
