package com.Justthegays;

import com.lagradost.cloudstream3.MainAPI;
import com.lagradost.cloudstream3.MainAPIKt;
import com.lagradost.cloudstream3.MainPageData;
import com.lagradost.cloudstream3.MovieLoadResponse;
import com.lagradost.cloudstream3.MovieSearchResponse;
import com.lagradost.cloudstream3.SearchResponse;
import com.lagradost.cloudstream3.TvType;
import com.lagradost.cloudstream3.VPNStatus;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jsoup.nodes.Element;

/* JADX INFO: compiled from: Justthegays.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Justthegays/classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u001f\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0096@¢\u0006\u0002\u0010&J\u000e\u0010'\u001a\u0004\u0018\u00010(*\u00020)H\u0002J\u000e\u0010*\u001a\u0004\u0018\u00010(*\u00020)H\u0002J\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u001d2\u0006\u0010,\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010-JF\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000e2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207052\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020705H\u0096@¢\u0006\u0002\u0010:R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006;"}, d2 = {"Lcom/Justthegays/Justthegays;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "hasDownloadSupport", "getHasDownloadSupport", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lorg/jsoup/nodes/Element;", "toRecommendResult", "search", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Justthegays"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJustthegays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Justthegays.kt\ncom/Justthegays/Justthegays\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,189:1\n1642#2,10:190\n1915#2:200\n1916#2:202\n1652#2:203\n1642#2,10:204\n1915#2:214\n1916#2:216\n1652#2:217\n1642#2,10:218\n1915#2:228\n1916#2:230\n1652#2:231\n1915#2:232\n1916#2:235\n1915#2:236\n1916#2:238\n1642#2,10:239\n1915#2:249\n1916#2:251\n1652#2:252\n1915#2:253\n1915#2,2:256\n1916#2:258\n1586#2:261\n1661#2,3:262\n777#2:265\n873#2,2:266\n1924#2,3:268\n1#3:201\n1#3:215\n1#3:229\n1#3:237\n1#3:250\n1342#4,2:233\n1342#4,2:254\n1342#4,2:259\n*S KotlinDebug\n*F\n+ 1 Justthegays.kt\ncom/Justthegays/Justthegays\n*L\n57#1:190,10\n57#1:200\n57#1:202\n57#1:203\n93#1:204,10\n93#1:214\n93#1:216\n93#1:217\n106#1:218,10\n106#1:228\n106#1:230\n106#1:231\n129#1:232\n129#1:235\n134#1:236\n134#1:238\n140#1:239,10\n140#1:249\n140#1:251\n140#1:252\n140#1:253\n144#1:256,2\n140#1:258\n157#1:261\n157#1:262,3\n158#1:265\n158#1:266,2\n167#1:268,3\n57#1:201\n93#1:215\n106#1:229\n140#1:250\n130#1:233,2\n143#1:254,2\n154#1:259,2\n*E\n"})
public final class Justthegays extends MainAPI {

    @NotNull
    private String mainUrl = "https://justthegays.com";

    @NotNull
    private String name = "Justthegays";
    private final boolean hasMainPage = true;
    private final boolean hasDownloadSupport = true;

    @NotNull
    private final VPNStatus vpnStatus = VPNStatus.MightBeNeeded;

    @NotNull
    private final Set<TvType> supportedTypes = SetsKt.setOf(TvType.NSFW);

    @NotNull
    private final List<MainPageData> mainPage = MainAPIKt.mainPageOf(new Pair[]{TuplesKt.to(String.valueOf(getMainUrl()), "Latest"), TuplesKt.to(getMainUrl() + "/random/", "Random"), TuplesKt.to(getMainUrl() + "/popular/", "Popular"), TuplesKt.to(getMainUrl() + "/trending/", "Trending"), TuplesKt.to(getMainUrl() + "/categories/young-twink/", "Young/Twinks"), TuplesKt.to(getMainUrl() + "/categories/asian/", "Asian"), TuplesKt.to(getMainUrl() + "/categories/double-penetration/", "Double Penetration"), TuplesKt.to(getMainUrl() + "/categories/feet/", "Feet"), TuplesKt.to(getMainUrl() + "/categories/fisting/", "Fisting"), TuplesKt.to(getMainUrl() + "/categories/anal/", "Fucking"), TuplesKt.to(getMainUrl() + "/categories/group/", "Group"), TuplesKt.to(getMainUrl() + "/categories/jerk-off/", "Jerk Off"), TuplesKt.to(getMainUrl() + "/categories/latin/", "Latin"), TuplesKt.to(getMainUrl() + "/categories/massage/", "Massage"), TuplesKt.to(getMainUrl() + "/categories/oral/", "Oral"), TuplesKt.to(getMainUrl() + "/categories/public/", "Public"), TuplesKt.to(getMainUrl() + "/categories/worship/", "Worship")});

    /* JADX INFO: renamed from: com.Justthegays.Justthegays$getMainPage$1 */
    /* JADX INFO: compiled from: Justthegays.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Justthegays.Justthegays", f = "Justthegays.kt", i = {0, 0, 0, 0}, l = {52}, m = "getMainPage", n = {"request", "url", "ua", "page"}, nl = {55}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 2)
    static final class C00001 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C00001(Continuation<? super C00001> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Justthegays.this.getMainPage(0, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Justthegays.Justthegays$load$1 */
    /* JADX INFO: compiled from: Justthegays.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Justthegays.Justthegays", f = "Justthegays.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {98, 108}, m = "load", n = {"url", "ua", "url", "ua", "doc", "title", "poster", "description", "recommendations"}, nl = {100, -1}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"}, v = 2)
    static final class C00011 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C00011(Continuation<? super C00011> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Justthegays.this.load(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Justthegays.Justthegays$loadLinks$1 */
    /* JADX INFO: compiled from: Justthegays.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Justthegays.Justthegays", f = "Justthegays.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {122, 142, 174}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "headers", "isCasting", "data", "subtitleCallback", "callback", "headers", "res", "doc", "urlRegex", "found", "$this$forEach$iv", "element$iv", "iframeUrl", "isCasting", "$i$f$forEach", "$i$a$-forEach-Justthegays$loadLinks$5", "data", "subtitleCallback", "callback", "headers", "res", "doc", "urlRegex", "found", "candidates", "$this$forEachIndexed$iv", "item$iv", "url", "friendlyName", "isCasting", "$i$f$forEachIndexed", "index$iv", "i", "$i$a$-forEachIndexed-Justthegays$loadLinks$7"}, nl = {123, 143, 173}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "L$11", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$11", "L$12", "L$13", "Z$0", "I$0", "I$1", "I$2", "I$3"}, v = 2)
    static final class C00031 extends ContinuationImpl {
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
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C00031(Continuation<? super C00031> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Justthegays.this.loadLinks(null, false, null, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Justthegays.Justthegays$search$1 */
    /* JADX INFO: compiled from: Justthegays.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Justthegays.Justthegays", f = "Justthegays.kt", i = {0, 0}, l = {88}, m = "search", n = {"query", "searchUrl"}, nl = {91}, s = {"L$0", "L$1"}, v = 2)
    static final class C00041 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C00041(Continuation<? super C00041> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Justthegays.this.search(null, (Continuation) this);
        }
    }

    @NotNull
    public String getMainUrl() {
        return this.mainUrl;
    }

    public void setMainUrl(@NotNull String str) {
        this.mainUrl = str;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    public void setName(@NotNull String str) {
        this.name = str;
    }

    public boolean getHasMainPage() {
        return this.hasMainPage;
    }

    public boolean getHasDownloadSupport() {
        return this.hasDownloadSupport;
    }

    @NotNull
    public VPNStatus getVpnStatus() {
        return this.vpnStatus;
    }

    @NotNull
    public Set<TvType> getSupportedTypes() {
        return this.supportedTypes;
    }

    @NotNull
    public List<MainPageData> getMainPage() {
        return this.mainPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [199=4] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getMainPage(int r25, @org.jetbrains.annotations.NotNull com.lagradost.cloudstream3.MainPageRequest r26, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.HomePageResponse> r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r27
            boolean r3 = r2 instanceof com.Justthegays.Justthegays.C00001
            if (r3 == 0) goto L1a
            r3 = r2
            com.Justthegays.Justthegays$getMainPage$1 r3 = (com.Justthegays.Justthegays.C00001) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.Justthegays.Justthegays$getMainPage$1 r3 = new com.Justthegays.Justthegays$getMainPage$1
            r3.<init>(r2)
        L1f:
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r3.label
            r7 = 1
            switch(r6) {
                case 0: goto L4e;
                case 1: goto L35;
                default: goto L2b;
            }
        L2b:
            r18 = r3
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r3)
            throw r1
        L35:
            int r1 = r3.I$0
            java.lang.Object r5 = r3.L$2
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r3.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r3.L$0
            com.lagradost.cloudstream3.MainPageRequest r8 = (com.lagradost.cloudstream3.MainPageRequest) r8
            kotlin.ResultKt.throwOnFailure(r4)
            r18 = r3
            r21 = r4
            r3 = r1
            r1 = 1
            goto Lfd
        L4e:
            kotlin.ResultKt.throwOnFailure(r4)
            r6 = 47
            if (r1 <= r7) goto L75
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r26.getData()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = "page/"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.StringBuilder r8 = r8.append(r6)
            java.lang.String r8 = r8.toString()
            goto L79
        L75:
            java.lang.String r8 = r26.getData()
        L79:
            r9 = 2
            kotlin.Pair[] r9 = new kotlin.Pair[r9]
            java.lang.String r10 = "User-Agent"
            java.lang.String r11 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.0.0 Safari/537.36"
            kotlin.Pair r10 = kotlin.TuplesKt.to(r10, r11)
            r11 = 0
            r9[r11] = r10
            java.lang.String r10 = "Accept"
        */
        //  java.lang.String r11 = "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8"
        /*
            kotlin.Pair r10 = kotlin.TuplesKt.to(r10, r11)
            r9[r7] = r10
            java.util.Map r9 = kotlin.collections.MapsKt.mapOf(r9)
            r10 = r4
            com.lagradost.nicehttp.Requests r4 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r0.getMainUrl()
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r6 = r11.append(r6)
            java.lang.String r6 = r6.toString()
            r11 = r26
            r3.L$0 = r11
            java.lang.Object r12 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r3.L$1 = r12
            java.lang.Object r12 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r3.L$2 = r12
            r3.I$0 = r1
            r3.label = r7
            r12 = r5
            r5 = r8
            r8 = 0
            r7 = r6
            r6 = r9
            r13 = 1
            r9 = 0
            r14 = r10
            r10 = 0
            r11 = 0
            r15 = r12
            r12 = 0
            r16 = r14
            r17 = 1
            r13 = 0
            r18 = r15
            r15 = 0
            r19 = r16
            r16 = 0
            r20 = 1
            r17 = 0
            r21 = r19
            r19 = 4088(0xff8, float:5.729E-42)
            r22 = 1
            r20 = 0
            r1 = r18
            r18 = r3
            r3 = r1
            r1 = 1
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            if (r4 != r3) goto Lf6
            return r3
        Lf6:
            r3 = r6
            r6 = r5
            r5 = r3
            r3 = r25
            r8 = r26
        Lfd:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r4 = r4.getDocument()
            java.lang.String r7 = "div.col-xl-4"
            org.jsoup.select.Elements r7 = r4.select(r7)
            r9 = r7
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r10 = 0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Collection r11 = (java.util.Collection) r11
            r12 = r9
            r13 = 0
            r14 = r12
            r15 = 0
            java.util.Iterator r16 = r14.iterator()
        L11c:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L13d
            java.lang.Object r17 = r16.next()
            r19 = r17
            r20 = 0
            r1 = r19
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            r23 = 0
            com.lagradost.cloudstream3.SearchResponse r1 = r0.toSearchResult(r1)
            if (r1 == 0) goto L13b
            r23 = 0
            r11.add(r1)
        L13b:
            r1 = 1
            goto L11c
        L13d:
            r1 = r11
            java.util.List r1 = (java.util.List) r1
            com.lagradost.cloudstream3.HomePageList r9 = new com.lagradost.cloudstream3.HomePageList
            java.lang.String r10 = r8.getName()
            r13 = 1
            r9.<init>(r10, r1, r13)
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r13)
            com.lagradost.cloudstream3.HomePageResponse r9 = com.lagradost.cloudstream3.MainAPIKt.newHomePageResponse(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Justthegays.Justthegays.getMainPage(int, com.lagradost.cloudstream3.MainPageRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final SearchResponse toSearchResult(Element $this$toSearchResult) {
        String string;
        String strText;
        Element aTag = $this$toSearchResult.selectFirst("div.item-img a");
        if (aTag == null) {
            return null;
        }
        String href = aTag.attr("href");
        Element imgElement = $this$toSearchResult.selectFirst("div.item-img img");
        final String posterUrl = imgElement != null ? imgElement.attr("src") : null;
        Element titleElement = $this$toSearchResult.selectFirst("h3.post-title a");
        if (titleElement == null || (strText = titleElement.text()) == null || (string = StringsKt.trim(strText).toString()) == null) {
            string = "No Title";
        }
        String title = string;
        return MainAPIKt.newMovieSearchResponse$default(this, title, MainAPIKt.fixUrl(this, href), TvType.NSFW, false, new Function1() { // from class: com.Justthegays.Justthegays$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(Object obj) {
                return Justthegays.toSearchResult$lambda$0(this.f$0, posterUrl, (MovieSearchResponse) obj);
            }
        }, 8, (Object) null);
    }

    static final Unit toSearchResult$lambda$0(Justthegays this$0, String $posterUrl, MovieSearchResponse $this$newMovieSearchResponse) {
        $this$newMovieSearchResponse.setPosterUrl(MainAPIKt.fixUrlNull(this$0, $posterUrl));
        return Unit.INSTANCE;
    }

    private final SearchResponse toRecommendResult(Element $this$toRecommendResult) {
        return toSearchResult($this$toRecommendResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [213=4] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object search(@org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.SearchResponse>> r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof com.Justthegays.Justthegays.C00041
            if (r2 == 0) goto L18
            r2 = r1
            com.Justthegays.Justthegays$search$1 r2 = (com.Justthegays.Justthegays.C00041) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Justthegays.Justthegays$search$1 r2 = new com.Justthegays.Justthegays$search$1
            r2.<init>(r1)
        L1d:
            java.lang.Object r3 = r2.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.label
            switch(r5) {
                case 0: goto L43;
                case 1: goto L32;
                default: goto L28;
            }
        L28:
            r17 = r2
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L32:
            java.lang.Object r4 = r2.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r2
            r20 = r3
            goto Laa
        L43:
            kotlin.ResultKt.throwOnFailure(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r0.getMainUrl()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "/?s="
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = r23
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r7 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r2.L$0 = r8
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r2.L$1 = r8
            r8 = 1
            r2.label = r8
            r8 = r4
            r4 = r5
            r5 = 0
            r6 = 0
            r9 = r7
            r7 = 0
            r10 = r8
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
            r17 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r18
            r18 = 4094(0xffe, float:5.737E-42)
            r20 = r19
            r19 = 0
            r21 = r17
            r17 = r2
            r2 = r21
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r3 != r2) goto La8
            return r2
        La8:
            r5 = r23
        Laa:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r2 = r3.getDocument()
            java.lang.String r3 = "div.col-xl-4"
            org.jsoup.select.Elements r3 = r2.select(r3)
            r6 = r3
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r7 = 0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r8 = (java.util.Collection) r8
            r9 = r6
            r10 = 0
            r11 = r9
            r12 = 0
            java.util.Iterator r13 = r11.iterator()
        Lc9:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Le9
            java.lang.Object r14 = r13.next()
            r15 = r14
            r16 = 0
            r1 = r15
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            r18 = 0
            com.lagradost.cloudstream3.SearchResponse r1 = r0.toSearchResult(r1)
            if (r1 == 0) goto Le6
            r18 = 0
            r8.add(r1)
        Le6:
            r1 = r24
            goto Lc9
        Le9:
            r1 = r8
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Justthegays.Justthegays.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [227=4] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(@org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.LoadResponse> r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            boolean r2 = r1 instanceof com.Justthegays.Justthegays.C00011
            if (r2 == 0) goto L18
            r2 = r1
            com.Justthegays.Justthegays$load$1 r2 = (com.Justthegays.Justthegays.C00011) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Justthegays.Justthegays$load$1 r2 = new com.Justthegays.Justthegays$load$1
            r2.<init>(r1)
        L1d:
            r9 = r2
            java.lang.Object r2 = r9.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r9.label
            switch(r4) {
                case 0: goto L67;
                case 1: goto L58;
                case 2: goto L33;
                default: goto L29;
            }
        L29:
            r21 = r2
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            java.lang.Object r3 = r9.L$6
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r9.L$5
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r9.L$4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r9.L$3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.L$2
            org.jsoup.nodes.Document r7 = (org.jsoup.nodes.Document) r7
            java.lang.Object r8 = r9.L$1
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r10 = r9.L$0
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r2)
            r21 = r2
            r17 = r9
            goto L17a
        L58:
            java.lang.Object r4 = r9.L$1
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r9.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r3
            r10 = r4
            r3 = r2
            goto La9
        L67:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.String r4 = "User-Agent"
            java.lang.String r5 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:139.0) Gecko/20100101 Firefox/139.0"
            kotlin.Pair r4 = kotlin.TuplesKt.to(r4, r5)
            java.util.Map r5 = kotlin.collections.MapsKt.mapOf(r4)
            r4 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r6 = r24
            r9.L$0 = r6
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r9.L$1 = r7
            r7 = 1
            r9.label = r7
            r6 = 0
            r7 = 0
            r8 = 0
            r17 = r9
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 4092(0xffc, float:5.734E-42)
            r19 = 0
            r1 = r4
            r4 = r24
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r9 = r17
            if (r3 != r1) goto La6
            return r1
        La6:
            r10 = r5
            r5 = r24
        La9:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r11 = r3.getDocument()
            java.lang.String r3 = "meta[property='og:title']"
            org.jsoup.nodes.Element r3 = r11.selectFirst(r3)
            java.lang.String r4 = "content"
            if (r3 == 0) goto Lbf
            java.lang.String r3 = r3.attr(r4)
            if (r3 != 0) goto Lc3
        Lbf:
            java.lang.String r3 = r11.title()
        Lc3:
            java.lang.String r6 = "meta[property='og:image']"
            org.jsoup.nodes.Element r6 = r11.selectFirst(r6)
            java.lang.String r7 = ""
            if (r6 == 0) goto Ld3
            java.lang.String r6 = r6.attr(r4)
            if (r6 != 0) goto Ld4
        Ld3:
            r6 = r7
        Ld4:
            r12 = r6
            java.lang.String r6 = "meta[property='og:description']"
            org.jsoup.nodes.Element r6 = r11.selectFirst(r6)
            if (r6 == 0) goto Le5
            java.lang.String r4 = r6.attr(r4)
            if (r4 != 0) goto Le4
            goto Le5
        Le4:
            r7 = r4
        Le5:
            r13 = r7
            java.lang.String r4 = "div.col-xl-4.col-lg-4.col-md-6.col-6.item.responsive-height.post"
            org.jsoup.select.Elements r4 = r11.select(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r6 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r7 = (java.util.Collection) r7
            r8 = r4
            r14 = 0
            r15 = r8
            r16 = 0
            java.util.Iterator r17 = r15.iterator()
        Lff:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L123
            java.lang.Object r18 = r17.next()
            r19 = r18
            r20 = 0
            r21 = r2
            r2 = r19
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            r22 = 0
            com.lagradost.cloudstream3.SearchResponse r2 = r0.toRecommendResult(r2)
            if (r2 == 0) goto L120
            r22 = 0
            r7.add(r2)
        L120:
            r2 = r21
            goto Lff
        L123:
            r21 = r2
            r2 = r7
            java.util.List r2 = (java.util.List) r2
            r4 = r3
            r3 = r0
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            com.lagradost.cloudstream3.TvType r6 = com.lagradost.cloudstream3.TvType.NSFW
            com.Justthegays.Justthegays$load$2 r7 = new com.Justthegays.Justthegays$load$2
            r8 = 0
            r7.<init>(r12, r13, r2, r8)
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r9.L$0 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r9.L$1 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r9.L$2 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r9.L$3 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r9.L$4 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r9.L$5 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r9.L$6 = r7
            r7 = 2
            r9.label = r7
            r7 = r5
            java.lang.Object r3 = com.lagradost.cloudstream3.MainAPIKt.newMovieLoadResponse(r3, r4, r5, r6, r7, r8, r9)
            r17 = r9
            if (r3 != r1) goto L171
            return r1
        L171:
            r6 = r3
            r3 = r2
            r2 = r6
            r6 = r4
            r8 = r10
            r7 = r11
            r4 = r13
            r10 = r5
            r5 = r12
        L17a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Justthegays.Justthegays.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.Justthegays.Justthegays$load$2 */
    /* JADX INFO: compiled from: Justthegays.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Justthegays.Justthegays$load$2", f = "Justthegays.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00022 extends SuspendLambda implements Function2<MovieLoadResponse, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $description;
        final /* synthetic */ String $poster;
        final /* synthetic */ List<SearchResponse> $recommendations;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00022(String str, String str2, List<? extends SearchResponse> list, Continuation<? super C00022> continuation) {
            super(2, continuation);
            this.$poster = str;
            this.$description = str2;
            this.$recommendations = list;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00022 = new C00022(this.$poster, this.$description, this.$recommendations, continuation);
            c00022.L$0 = obj;
            return c00022;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        public final Object invoke(MovieLoadResponse movieLoadResponse, Continuation<? super Unit> continuation) {
            return create(movieLoadResponse, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object $result) {
            MovieLoadResponse $this$newMovieLoadResponse = (MovieLoadResponse) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    $this$newMovieLoadResponse.setPosterUrl(this.$poster);
                    $this$newMovieLoadResponse.setPlot(this.$description);
                    $this$newMovieLoadResponse.setRecommendations(this.$recommendations);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [140=4, 115=6, 248=4] */
    /* JADX WARN: Can't wrap try/catch for region: R(10:58|(1:141)|59|60|147|61|62|139|63|(1:65)(15:66|149|67|68|143|69|(2:72|70)|151|73|(7:76|(1:78)(1:79)|(1:81)|82|(2:84|154)(2:86|153)|87|74)|152|88|100|56|(11:101|(2:104|102)|155|105|(2:108|106)|156|109|(4:112|(3:157|114|161)(1:160)|159|110)|158|115|(2:117|118)(3:119|120|(6:122|(1:124)|125|(2:128|(1:130)(1:131))(1:127)|132|(1:134)(4:135|136|120|(2:137|138)(0)))(0)))(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(10:58|141|59|60|147|61|62|139|63|(1:65)(15:66|149|67|68|143|69|(2:72|70)|151|73|(7:76|(1:78)(1:79)|(1:81)|82|(2:84|154)(2:86|153)|87|74)|152|88|100|56|(11:101|(2:104|102)|155|105|(2:108|106)|156|109|(4:112|(3:157|114|161)(1:160)|159|110)|158|115|(2:117|118)(3:119|120|(6:122|(1:124)|125|(2:128|(1:130)(1:131))(1:127)|132|(1:134)(4:135|136|120|(2:137|138)(0)))(0)))(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:66|(1:149)|67|68|143|69|(2:72|70)|151|73|(7:76|(1:78)(1:79)|(1:81)|82|(2:84|154)(2:86|153)|87|74)|152|88|100|56|(11:101|(2:104|102)|155|105|(2:108|106)|156|109|(4:112|(3:157|114|161)(1:160)|159|110)|158|115|(2:117|118)(3:119|120|(6:122|(1:124)|125|(2:128|(1:130)(1:131))(1:127)|132|(1:134)(4:135|136|120|(2:137|138)(0)))(0)))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0419, code lost:
    
        r1 = r53;
        r2 = r54;
        r21 = r10;
        r5 = r22;
        r22 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0431, code lost:
    
        r1 = r53;
        r18 = r7;
        r21 = r10;
        r25 = r15;
        r5 = r22;
        r24 = r32;
        r22 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0445, code lost:
    
        r44 = r5;
        r1 = r53;
        r18 = r7;
        r21 = r10;
        r25 = r15;
        r5 = r22;
        r24 = r9;
        r22 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0398 A[Catch: Exception -> 0x0418, LOOP:0: B:70:0x0392->B:72:0x0398, LOOP_END, TryCatch #2 {Exception -> 0x0418, blocks: (B:69:0x0389, B:70:0x0392, B:72:0x0398, B:73:0x03ae, B:74:0x03bd, B:76:0x03c3, B:81:0x03e6, B:82:0x03ee, B:84:0x03fc), top: B:143:0x0389 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03c3 A[Catch: Exception -> 0x0418, TryCatch #2 {Exception -> 0x0418, blocks: (B:69:0x0389, B:70:0x0392, B:72:0x0398, B:73:0x03ae, B:74:0x03bd, B:76:0x03c3, B:81:0x03e6, B:82:0x03ee, B:84:0x03fc), top: B:143:0x0389 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x0664 -> B:136:0x0689). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x036a -> B:149:0x0376). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0475 -> B:100:0x047f). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadLinks(@org.jetbrains.annotations.NotNull java.lang.String r53, boolean r54, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r55, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r56, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r57) {
        /*
            r52 = this;
            r3 = r53
            r1 = r57
            boolean r0 = r1 instanceof com.Justthegays.Justthegays.C00031
            if (r0 == 0) goto L1a
            r0 = r1
            com.Justthegays.Justthegays$loadLinks$1 r0 = (com.Justthegays.Justthegays.C00031) r0
            int r2 = r0.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r4
            if (r2 == 0) goto L1a
            int r2 = r0.label
            int r2 = r2 - r4
            r0.label = r2
            r2 = r52
            goto L21
        L1a:
            com.Justthegays.Justthegays$loadLinks$1 r0 = new com.Justthegays.Justthegays$loadLinks$1
            r2 = r52
            r0.<init>(r1)
        L21:
            r4 = r0
            java.lang.Object r5 = r4.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            java.lang.String r7 = "abs:data-src"
            java.lang.String r8 = "abs:src"
            r10 = 2
            r11 = 0
            switch(r0) {
                case 0: goto L145;
                case 1: goto L122;
                case 2: goto Lb8;
                case 3: goto L3b;
                default: goto L33;
            }
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            int r0 = r4.I$3
            int r7 = r4.I$2
            int r8 = r4.I$1
            int r10 = r4.I$0
            boolean r11 = r4.Z$0
            java.lang.Object r13 = r4.L$14
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            java.lang.Object r14 = r4.L$13
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r4.L$12
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r9 = r4.L$11
            r17 = 1
            java.lang.Object r12 = r4.L$10
            java.util.Iterator r12 = (java.util.Iterator) r12
            r18 = r0
            java.lang.Object r0 = r4.L$9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r54 = r0
            java.lang.Object r0 = r4.L$8
            java.util.List r0 = (java.util.List) r0
            r19 = r0
            java.lang.Object r0 = r4.L$7
            java.util.List r0 = (java.util.List) r0
            r20 = r0
            java.lang.Object r0 = r4.L$6
            kotlin.text.Regex r0 = (kotlin.text.Regex) r0
            r21 = r0
            java.lang.Object r0 = r4.L$5
            org.jsoup.nodes.Document r0 = (org.jsoup.nodes.Document) r0
            r22 = r0
            java.lang.Object r0 = r4.L$4
            com.lagradost.nicehttp.NiceResponse r0 = (com.lagradost.nicehttp.NiceResponse) r0
            r23 = r0
            java.lang.Object r0 = r4.L$3
            java.util.Map r0 = (java.util.Map) r0
            r24 = r0
            java.lang.Object r0 = r4.L$2
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r56 = r0
            java.lang.Object r0 = r4.L$1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r55 = r0
            java.lang.Object r0 = r4.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r5)
            r26 = r55
            r17 = r4
            r16 = r12
            r3 = r19
            r25 = r23
            r19 = r56
            r4 = r0
            r23 = r5
            r12 = r10
            r0 = r18
            r10 = r6
            r18 = r15
            r6 = r2
            r15 = r14
            r14 = r11
            r11 = r21
            r21 = 1
            r2 = r54
            goto L689
        Lb8:
            r17 = 1
            int r9 = r4.I$1
            int r12 = r4.I$0
            boolean r13 = r4.Z$0
            java.lang.Object r0 = r4.L$11
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r4.L$10
            java.lang.Object r0 = r4.L$9
            r18 = r0
            java.util.Iterator r18 = (java.util.Iterator) r18
            java.lang.Object r0 = r4.L$8
            r19 = r0
            java.lang.Iterable r19 = (java.lang.Iterable) r19
            java.lang.Object r0 = r4.L$7
            r20 = r0
            java.util.List r20 = (java.util.List) r20
            java.lang.Object r0 = r4.L$6
            r21 = r0
            kotlin.text.Regex r21 = (kotlin.text.Regex) r21
            java.lang.Object r0 = r4.L$5
            r22 = r0
            org.jsoup.nodes.Document r22 = (org.jsoup.nodes.Document) r22
            java.lang.Object r0 = r4.L$4
            r23 = r0
            com.lagradost.nicehttp.NiceResponse r23 = (com.lagradost.nicehttp.NiceResponse) r23
            java.lang.Object r0 = r4.L$3
            r24 = r0
            java.util.Map r24 = (java.util.Map) r24
            java.lang.Object r0 = r4.L$2
            r25 = r0
            kotlin.jvm.functions.Function1 r25 = (kotlin.jvm.functions.Function1) r25
            java.lang.Object r0 = r4.L$1
            r26 = r0
            kotlin.jvm.functions.Function1 r26 = (kotlin.jvm.functions.Function1) r26
            java.lang.Object r0 = r4.L$0
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Exception -> L116
            r44 = r4
            r31 = r14
            r10 = r21
            r11 = r22
            r4 = r3
            r22 = r5
            r3 = r7
            r14 = r8
            r8 = r20
            goto L376
        L116:
            r0 = move-exception
            r44 = r4
            r31 = r14
            r4 = r3
            r3 = r7
            r14 = r8
            r8 = r20
            goto L475
        L122:
            r17 = 1
            boolean r0 = r4.Z$0
            java.lang.Object r9 = r4.L$3
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r12 = r4.L$2
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            java.lang.Object r13 = r4.L$1
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            java.lang.Object r14 = r4.L$0
            r3 = r14
            java.lang.String r3 = (java.lang.String) r3
            kotlin.ResultKt.throwOnFailure(r5)
            r16 = r4
            r22 = r5
            r1 = r6
            r28 = r7
            r29 = r8
            goto L1b7
        L145:
            r17 = 1
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.Pair[] r0 = new kotlin.Pair[r10]
            java.lang.String r9 = "User-Agent"
            java.lang.String r12 = "Mozilla/5.0"
            kotlin.Pair r9 = kotlin.TuplesKt.to(r9, r12)
            r0[r11] = r9
            java.lang.String r9 = "Referer"
            kotlin.Pair r9 = kotlin.TuplesKt.to(r9, r3)
            r0[r17] = r9
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            com.lagradost.nicehttp.Requests r2 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r4.L$0 = r3
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r55)
            r4.L$1 = r9
            r9 = r56
            r4.L$2 = r9
            r4.L$3 = r0
            r12 = r54
            r4.Z$0 = r12
            r13 = 1
            r4.label = r13
            r14 = r5
            r5 = 0
            r15 = r6
            r6 = 0
            r17 = r7
            r7 = 0
            r18 = r8
            r8 = 0
            r9 = 0
            r19 = 2
            r10 = 0
            r20 = 0
            r11 = 0
            r21 = 1
            r13 = 0
            r22 = r14
            r14 = 0
            r23 = r15
            r15 = 0
            r24 = r17
            r17 = 4092(0xffc, float:5.734E-42)
            r25 = r18
            r18 = 0
            r16 = r4
            r1 = r23
            r28 = r24
            r29 = r25
            r4 = r0
            java.lang.Object r5 = com.lagradost.nicehttp.Requests.get$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18)
            if (r5 != r1) goto L1ae
            return r1
        L1ae:
            r3 = r53
            r0 = r54
            r13 = r55
            r12 = r56
            r9 = r4
        L1b7:
            r2 = r5
            com.lagradost.nicehttp.NiceResponse r2 = (com.lagradost.nicehttp.NiceResponse) r2
            org.jsoup.nodes.Document r4 = r2.getDocument()
            kotlin.text.Regex r5 = new kotlin.text.Regex
            java.lang.String r6 = "https?://[^\\s'\"]+?\\.(?:mp4|m3u8|webm)(\\?[^'\"\\s<>]*)?"
            kotlin.text.RegexOption r7 = kotlin.text.RegexOption.IGNORE_CASE
            r5.<init>(r6, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
            java.lang.String r7 = "script[type=application/ld+json]"
            org.jsoup.select.Elements r7 = r4.select(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r8 = 0
            java.util.Iterator r10 = r7.iterator()
        L1db:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L22a
            java.lang.Object r11 = r10.next()
            r14 = r11
            org.jsoup.nodes.Element r14 = (org.jsoup.nodes.Element) r14
            r15 = 0
            java.lang.String r17 = r14.data()
            r53 = r0
            r0 = r17
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r23 = r1
            r54 = r2
            r55 = r3
            r1 = 0
            r2 = 2
            r3 = 0
            kotlin.sequences.Sequence r0 = kotlin.text.Regex.findAll$default(r5, r0, r3, r2, r1)
            r17 = 0
            java.util.Iterator r18 = r0.iterator()
        L206:
            boolean r19 = r18.hasNext()
            if (r19 == 0) goto L21f
            java.lang.Object r19 = r18.next()
            r20 = r19
            kotlin.text.MatchResult r20 = (kotlin.text.MatchResult) r20
            r21 = 0
            java.lang.String r1 = r20.getValue()
            r6.add(r1)
            r1 = 0
            goto L206
        L21f:
            r0 = r53
            r2 = r54
            r3 = r55
            r1 = r23
            goto L1db
        L22a:
            r53 = r0
            r23 = r1
            r54 = r2
            r55 = r3
            r2 = 2
            r3 = 0
            java.lang.String r0 = "video[src], video > source[src], source[src], video[data-src], source[data-src]"
            org.jsoup.select.Elements r0 = r4.select(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r7 = r0.iterator()
        L241:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L284
            java.lang.Object r8 = r7.next()
            r10 = r8
            org.jsoup.nodes.Element r10 = (org.jsoup.nodes.Element) r10
            r11 = 0
            r14 = r29
            java.lang.String r15 = r10.attr(r14)
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            int r17 = r15.length()
            if (r17 != 0) goto L260
            r17 = 1
            goto L262
        L260:
            r17 = 0
        L262:
            if (r17 == 0) goto L26c
            r15 = 0
            r3 = r28
            java.lang.String r15 = r10.attr(r3)
            goto L26e
        L26c:
            r3 = r28
        L26e:
            java.lang.String r15 = (java.lang.String) r15
            r17 = r15
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17
            boolean r17 = kotlin.text.StringsKt.isBlank(r17)
            if (r17 != 0) goto L27d
            r6.add(r15)
        L27d:
            r28 = r3
            r29 = r14
            r3 = 0
            goto L241
        L284:
            r3 = r28
            r14 = r29
            java.lang.String r0 = "iframe[src]"
            org.jsoup.select.Elements r0 = r4.select(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r7 = (java.util.Collection) r7
            r8 = r0
            r10 = 0
            r11 = r8
            r15 = 0
            java.util.Iterator r17 = r11.iterator()
        L2a0:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L2d4
            java.lang.Object r18 = r17.next()
            r19 = r18
            r21 = 0
            r2 = r19
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            r24 = 0
            java.lang.String r25 = r2.attr(r14)
            r26 = r25
            r27 = 0
            r28 = r26
            java.lang.CharSequence r28 = (java.lang.CharSequence) r28
            boolean r28 = kotlin.text.StringsKt.isBlank(r28)
            if (r28 != 0) goto L2c7
            goto L2c9
        L2c7:
            r25 = 0
        L2c9:
            if (r25 == 0) goto L2d2
            r2 = r25
            r24 = 0
            r7.add(r2)
        L2d2:
            r2 = 2
            goto L2a0
        L2d4:
            r2 = r7
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r0 = 0
            java.util.Iterator r1 = r2.iterator()
            r7 = r1
            r19 = r2
            r11 = r4
            r10 = r5
            r8 = r6
            r15 = r12
            r26 = r13
            r5 = r16
            r6 = r23
            r2 = r52
            r13 = r53
            r23 = r54
            r4 = r55
            r1 = r57
            r12 = r0
        L2fa:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L486
            java.lang.Object r16 = r7.next()
            r31 = r16
            java.lang.String r31 = (java.lang.String) r31
            r53 = r1
            r1 = 0
            com.lagradost.nicehttp.Requests r30 = com.lagradost.cloudstream3.MainActivityKt.getApp()     // Catch: java.lang.Exception -> L45c
            r5.L$0 = r4     // Catch: java.lang.Exception -> L45c
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)     // Catch: java.lang.Exception -> L45c
            r5.L$1 = r0     // Catch: java.lang.Exception -> L45c
            r5.L$2 = r15     // Catch: java.lang.Exception -> L45c
            r5.L$3 = r9     // Catch: java.lang.Exception -> L45c
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)     // Catch: java.lang.Exception -> L45c
            r5.L$4 = r0     // Catch: java.lang.Exception -> L45c
            r5.L$5 = r11     // Catch: java.lang.Exception -> L45c
            r5.L$6 = r10     // Catch: java.lang.Exception -> L45c
            r5.L$7 = r8     // Catch: java.lang.Exception -> L45c
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)     // Catch: java.lang.Exception -> L45c
            r5.L$8 = r0     // Catch: java.lang.Exception -> L45c
            r5.L$9 = r7     // Catch: java.lang.Exception -> L45c
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)     // Catch: java.lang.Exception -> L45c
            r5.L$10 = r0     // Catch: java.lang.Exception -> L45c
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r31)     // Catch: java.lang.Exception -> L45c
            r5.L$11 = r0     // Catch: java.lang.Exception -> L45c
            r5.Z$0 = r13     // Catch: java.lang.Exception -> L45c
            r5.I$0 = r12     // Catch: java.lang.Exception -> L45c
            r5.I$1 = r1     // Catch: java.lang.Exception -> L45c
            r54 = r1
            r1 = 2
            r5.label = r1     // Catch: java.lang.Exception -> L444
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r45 = 4092(0xffc, float:5.734E-42)
            r46 = 0
            r44 = r5
            r32 = r9
            java.lang.Object r5 = com.lagradost.nicehttp.Requests.get$default(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r42, r43, r44, r45, r46)     // Catch: java.lang.Exception -> L430
            if (r5 != r6) goto L36a
            return r6
        L36a:
            r1 = r53
            r9 = r54
            r18 = r7
            r25 = r15
            r15 = r16
            r24 = r32
        L376:
            com.lagradost.nicehttp.NiceResponse r5 = (com.lagradost.nicehttp.NiceResponse) r5     // Catch: java.lang.Exception -> L424
            org.jsoup.nodes.Document r0 = r5.getDocument()     // Catch: java.lang.Exception -> L424
            java.lang.String r5 = r0.html()     // Catch: java.lang.Exception -> L424
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Exception -> L424
            r53 = r1
            r54 = r2
            r1 = 2
            r2 = 0
            r7 = 0
            kotlin.sequences.Sequence r5 = kotlin.text.Regex.findAll$default(r10, r5, r2, r1, r7)     // Catch: java.lang.Exception -> L418
            r1 = 0
            java.util.Iterator r2 = r5.iterator()     // Catch: java.lang.Exception -> L418
        L392:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Exception -> L418
            if (r7 == 0) goto L3ae
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Exception -> L418
            r16 = r7
            kotlin.text.MatchResult r16 = (kotlin.text.MatchResult) r16     // Catch: java.lang.Exception -> L418
            r17 = 0
            r55 = r1
            java.lang.String r1 = r16.getValue()     // Catch: java.lang.Exception -> L418
            r8.add(r1)     // Catch: java.lang.Exception -> L418
            r1 = r55
            goto L392
        L3ae:
            r55 = r1
            java.lang.String r1 = "video[src], source[src]"
            org.jsoup.select.Elements r1 = r0.select(r1)     // Catch: java.lang.Exception -> L418
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Exception -> L418
            r2 = 0
            java.util.Iterator r5 = r1.iterator()     // Catch: java.lang.Exception -> L418
        L3bd:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Exception -> L418
            if (r7 == 0) goto L40c
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Exception -> L418
            r16 = r7
            org.jsoup.nodes.Element r16 = (org.jsoup.nodes.Element) r16     // Catch: java.lang.Exception -> L418
            r55 = r16
            r16 = 0
            r56 = r0
            r0 = r55
            java.lang.String r17 = r0.attr(r14)     // Catch: java.lang.Exception -> L418
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17     // Catch: java.lang.Exception -> L418
            int r21 = r17.length()     // Catch: java.lang.Exception -> L418
            if (r21 != 0) goto L3e2
            r21 = 1
            goto L3e4
        L3e2:
            r21 = 0
        L3e4:
            if (r21 == 0) goto L3ee
            r17 = 0
            java.lang.String r21 = r0.attr(r3)     // Catch: java.lang.Exception -> L418
            r17 = r21
        L3ee:
            java.lang.String r17 = (java.lang.String) r17     // Catch: java.lang.Exception -> L418
            r55 = r17
            r17 = r55
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17     // Catch: java.lang.Exception -> L418
            boolean r17 = kotlin.text.StringsKt.isBlank(r17)     // Catch: java.lang.Exception -> L418
            if (r17 != 0) goto L404
            r17 = r0
            r0 = r55
            r8.add(r0)     // Catch: java.lang.Exception -> L418
            goto L408
        L404:
            r17 = r0
            r0 = r55
        L408:
            r0 = r56
            goto L3bd
        L40c:
            r56 = r0
            r1 = r53
            r2 = r54
            r7 = r18
            r5 = r44
            goto L47f
        L418:
            r0 = move-exception
            r1 = r53
            r2 = r54
            r21 = r10
            r5 = r22
            r22 = r11
            goto L475
        L424:
            r0 = move-exception
            r53 = r1
            r54 = r2
            r21 = r10
            r5 = r22
            r22 = r11
            goto L475
        L430:
            r0 = move-exception
            r1 = r53
            r9 = r54
            r18 = r7
            r21 = r10
            r25 = r15
            r15 = r16
            r5 = r22
            r24 = r32
            r22 = r11
            goto L475
        L444:
            r0 = move-exception
            r44 = r5
            r32 = r9
            r1 = r53
            r9 = r54
            r18 = r7
            r21 = r10
            r25 = r15
            r15 = r16
            r5 = r22
            r24 = r32
            r22 = r11
            goto L475
        L45c:
            r0 = move-exception
            r54 = r1
            r44 = r5
            r32 = r9
            r1 = r53
            r9 = r54
            r18 = r7
            r21 = r10
            r25 = r15
            r15 = r16
            r5 = r22
            r24 = r32
            r22 = r11
        L475:
            r10 = r21
            r11 = r22
            r22 = r5
            r7 = r18
            r5 = r44
        L47f:
            r9 = r24
            r15 = r25
            goto L2fa
        L486:
            r53 = r1
            r44 = r5
            r32 = r9
            java.lang.String r0 = r11.html()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            r3 = 2
            r5 = 0
            kotlin.sequences.Sequence r0 = kotlin.text.Regex.findAll$default(r10, r0, r5, r3, r1)
            r1 = 0
            java.util.Iterator r3 = r0.iterator()
        L49e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L4b4
            java.lang.Object r5 = r3.next()
            r7 = r5
            kotlin.text.MatchResult r7 = (kotlin.text.MatchResult) r7
            r9 = 0
            java.lang.String r12 = r7.getValue()
            r8.add(r12)
            goto L49e
        L4b4:
            r0 = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r5)
            r3.<init>(r5)
            java.util.Collection r3 = (java.util.Collection) r3
            r5 = r0
            r7 = 0
            java.util.Iterator r9 = r5.iterator()
        L4cc:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L507
            java.lang.Object r12 = r9.next()
            r14 = r12
            java.lang.String r14 = (java.lang.String) r14
            r16 = 0
            r17 = r14
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17
            java.lang.CharSequence r17 = kotlin.text.StringsKt.trim(r17)
            java.lang.String r33 = r17.toString()
            r37 = 4
            r38 = 0
            java.lang.String r34 = "&amp;"
            java.lang.String r35 = "&"
            r36 = 0
            java.lang.String r45 = kotlin.text.StringsKt.replace$default(r33, r34, r35, r36, r37, r38)
            r49 = 4
            r50 = 0
            java.lang.String r46 = " "
            java.lang.String r47 = "%20"
            r48 = 0
            java.lang.String r14 = kotlin.text.StringsKt.replace$default(r45, r46, r47, r48, r49, r50)
            r3.add(r14)
            goto L4cc
        L507:
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            r5 = r3
            r7 = 0
            java.util.Iterator r9 = r5.iterator()
        L51c:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L539
            java.lang.Object r12 = r9.next()
            r14 = r12
            java.lang.String r14 = (java.lang.String) r14
            r16 = 0
            r17 = r14
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17
            boolean r17 = kotlin.text.StringsKt.isBlank(r17)
            if (r17 != 0) goto L51c
            r1.add(r12)
            goto L51c
        L539:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r0 = kotlin.collections.CollectionsKt.distinct(r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L569
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "DEBUG: No video links found for "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r1)
            r20 = 0
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r20)
            return r1
        L569:
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r3 = 0
            r5 = 0
            java.util.Iterator r7 = r1.iterator()
            r12 = r3
            r9 = r6
            r14 = r7
            r7 = r44
            r3 = r0
            r6 = r5
            r0 = r53
            r5 = r2
            r2 = r32
        L57e:
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L6a6
            java.lang.Object r20 = r14.next()
            r53 = r0
            int r0 = r6 + 1
            if (r6 >= 0) goto L591
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L591:
            r16 = r20
            java.lang.String r16 = (java.lang.String) r16
            r54 = r1
            r1 = 0
            r55 = r3
            r3 = r16
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r17 = "aucdn.net"
            r56 = r5
            r5 = r17
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r57 = r8
            r8 = 1
            boolean r3 = kotlin.text.StringsKt.contains(r3, r5, r8)
            if (r3 == 0) goto L5b3
            java.lang.String r3 = "CDN"
            goto L5c6
        L5b3:
            r3 = r16
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r5 = "besthdgayporn.com"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r3 = kotlin.text.StringsKt.contains(r3, r5, r8)
            if (r3 == 0) goto L5c4
            java.lang.String r3 = "Origin"
            goto L5c6
        L5c4:
            java.lang.String r3 = "Direct"
        L5c6:
            java.lang.String r5 = r56.getName()
            r21 = 1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r3)
            r24 = r3
            r3 = 32
            java.lang.StringBuilder r3 = r8.append(r3)
            int r8 = r6 + 1
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.Justthegays.Justthegays$loadLinks$7$1 r8 = new com.Justthegays.Justthegays$loadLinks$7$1
            r17 = r3
            r3 = 0
            r8.<init>(r4, r2, r3)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r7.L$0 = r4
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)
            r7.L$1 = r3
            r7.L$2 = r15
            r7.L$3 = r2
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)
            r7.L$4 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r7.L$5 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r7.L$6 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r57)
            r7.L$7 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r55)
            r7.L$8 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r54)
            r7.L$9 = r3
            r7.L$10 = r14
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r20)
            r7.L$11 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r7.L$12 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r7.L$13 = r3
            r7.L$14 = r15
            r7.Z$0 = r13
            r7.I$0 = r12
            r7.I$1 = r0
            r7.I$2 = r6
            r7.I$3 = r1
            r3 = 3
            r7.label = r3
            r3 = r15
            r15 = 0
            r18 = 8
            r19 = 0
            r51 = r8
            r8 = r3
            r3 = r12
            r12 = r5
            r5 = r13
            r13 = r17
            r17 = r7
            r7 = r14
            r14 = r16
            r16 = r51
            java.lang.Object r12 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink$default(r12, r13, r14, r15, r16, r17, r18, r19)
            if (r12 != r9) goto L664
            return r9
        L664:
            r16 = r7
            r13 = r8
            r19 = r13
            r18 = r14
            r25 = r23
            r15 = r24
            r8 = r0
            r0 = r1
            r24 = r2
            r14 = r5
            r7 = r6
            r5 = r12
            r23 = r22
            r1 = r53
            r6 = r56
            r12 = r3
            r22 = r11
            r3 = r55
            r11 = r10
            r10 = r9
            r9 = r20
            r20 = r57
            r2 = r54
        L689:
            r13.invoke(r5)
            r0 = r1
            r1 = r2
            r5 = r6
            r6 = r8
            r9 = r10
            r10 = r11
            r13 = r14
            r14 = r16
            r7 = r17
            r15 = r19
            r8 = r20
            r11 = r22
            r22 = r23
            r2 = r24
            r23 = r25
            goto L57e
        L6a6:
            r53 = r0
            r21 = 1
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Justthegays.Justthegays.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
