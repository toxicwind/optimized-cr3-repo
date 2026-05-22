package com.topHDgayporn;

import com.lagradost.cloudstream3.LoadResponse;
import com.lagradost.cloudstream3.MainAPI;
import com.lagradost.cloudstream3.MainAPIKt;
import com.lagradost.cloudstream3.MainPageData;
import com.lagradost.cloudstream3.MovieLoadResponse;
import com.lagradost.cloudstream3.MovieSearchResponse;
import com.lagradost.cloudstream3.SearchResponse;
import com.lagradost.cloudstream3.TvType;
import com.lagradost.cloudstream3.VPNStatus;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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

/* JADX INFO: compiled from: topHDgayporn.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/topHDgayporn/classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u001f\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0096@¢\u0006\u0002\u0010(J\u000e\u0010)\u001a\u0004\u0018\u00010**\u00020+H\u0002J\u000e\u0010,\u001a\u0004\u0018\u00010**\u00020+H\u0002J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\u001d2\u0006\u0010.\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010/J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010/JF\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u000e2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u000209072\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020907H\u0096@¢\u0006\u0002\u0010<R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/topHDgayporn/topHDgayporn;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "hasDownloadSupport", "getHasDownloadSupport", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "cookies", "", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lorg/jsoup/nodes/Element;", "toRecommendResult", "search", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "topHDgayporn"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\ntopHDgayporn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 topHDgayporn.kt\ncom/topHDgayporn/topHDgayporn\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,190:1\n1642#2,10:191\n1915#2:201\n1916#2:203\n1652#2:204\n1642#2,10:205\n1915#2:215\n1916#2:217\n1652#2:218\n777#2:219\n873#2,2:220\n1642#2,10:222\n1915#2:232\n1916#2:234\n1652#2:235\n1915#2:236\n1916#2:239\n1915#2:240\n1916#2:242\n1642#2,10:243\n1915#2:253\n1916#2:255\n1652#2:256\n1915#2:257\n1915#2,2:260\n1916#2:262\n1586#2:265\n1661#2,3:266\n777#2:269\n873#2,2:270\n1924#2,3:272\n1#3:202\n1#3:216\n1#3:233\n1#3:241\n1#3:254\n1342#4,2:237\n1342#4,2:258\n1342#4,2:263\n*S KotlinDebug\n*F\n+ 1 topHDgayporn.kt\ncom/topHDgayporn/topHDgayporn\n*L\n50#1:191,10\n50#1:201\n50#1:203\n50#1:204\n88#1:205,10\n88#1:215\n88#1:217\n88#1:218\n101#1:219\n101#1:220,2\n103#1:222,10\n103#1:232\n103#1:234\n103#1:235\n129#1:236\n129#1:239\n134#1:240\n134#1:242\n140#1:243,10\n140#1:253\n140#1:255\n140#1:256\n140#1:257\n144#1:260,2\n140#1:262\n157#1:265\n157#1:266,3\n158#1:269\n158#1:270,2\n167#1:272,3\n50#1:202\n88#1:216\n103#1:233\n140#1:254\n130#1:237,2\n143#1:258,2\n154#1:263,2\n*E\n"})
public final class topHDgayporn extends MainAPI {

    @NotNull
    private String mainUrl = "https://tophdgayporn.com";

    @NotNull
    private String name = "topHDgayporn";
    private final boolean hasMainPage = true;
    private final boolean hasDownloadSupport = true;

    @NotNull
    private final VPNStatus vpnStatus = VPNStatus.MightBeNeeded;

    @NotNull
    private final Set<TvType> supportedTypes = SetsKt.setOf(TvType.NSFW);

    @NotNull
    private final List<MainPageData> mainPage = MainAPIKt.mainPageOf(new Pair[]{TuplesKt.to(getMainUrl() + '/', "Latest"), TuplesKt.to(getMainUrl() + "/video-tag/big-black-dick/", "Big Black Dick"), TuplesKt.to(getMainUrl() + "/video-tag/bareback-gay-porn/", "Bareback"), TuplesKt.to(getMainUrl() + "/video-tag/onlyfans/", "Onlyfans"), TuplesKt.to(getMainUrl() + "/video-tag/latino/", "Latino"), TuplesKt.to(getMainUrl() + "/video-tag/voyr/", "Voyr"), TuplesKt.to(getMainUrl() + "/video-tag/chaos-men/", "Chaos Men"), TuplesKt.to(getMainUrl() + "/video-tag/nakedsword/", "Naked Sword"), TuplesKt.to(getMainUrl() + "/video-tag/latin-leche/", "Latin Leche"), TuplesKt.to(getMainUrl() + "/video-tag/helix-studios/", "Helix Studio"), TuplesKt.to(getMainUrl() + "/video-tag/bro-network/", "Bro Network"), TuplesKt.to(getMainUrl() + "/video-tag/falcon-studios/", "Falcon Studios")});

    @NotNull
    private final Map<String, String> cookies = MapsKt.mapOf(new Pair[]{new Pair("hasVisited", "1"), new Pair("accessAgeDisclaimerPH", "1")});

    /* JADX INFO: renamed from: com.topHDgayporn.topHDgayporn$getMainPage$1 */
    /* JADX INFO: compiled from: topHDgayporn.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.topHDgayporn.topHDgayporn", f = "topHDgayporn.kt", i = {0, 0, 0, 0}, l = {49}, m = "getMainPage", n = {"request", "url", "ua", "page"}, nl = {50}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 2)
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
            return topHDgayporn.this.getMainPage(0, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.topHDgayporn.topHDgayporn$load$1 */
    /* JADX INFO: compiled from: topHDgayporn.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.topHDgayporn.topHDgayporn", f = "topHDgayporn.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {93, 107}, m = "load", n = {"url", "ua", "url", "ua", "doc", "title", "poster", "description", "actors", "recommendations"}, nl = {95, -1}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, v = 2)
    static final class C00011 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        C00011(Continuation<? super C00011> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return topHDgayporn.this.load(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.topHDgayporn.topHDgayporn$loadLinks$1 */
    /* JADX INFO: compiled from: topHDgayporn.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.topHDgayporn.topHDgayporn", f = "topHDgayporn.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {122, 142, 174}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "headers", "isCasting", "data", "subtitleCallback", "callback", "headers", "res", "doc", "urlRegex", "found", "$this$forEach$iv", "element$iv", "iframeUrl", "isCasting", "$i$f$forEach", "$i$a$-forEach-topHDgayporn$loadLinks$5", "data", "subtitleCallback", "callback", "headers", "res", "doc", "urlRegex", "found", "candidates", "$this$forEachIndexed$iv", "item$iv", "url", "friendlyName", "isCasting", "$i$f$forEachIndexed", "index$iv", "i", "$i$a$-forEachIndexed-topHDgayporn$loadLinks$7"}, nl = {123, 143, 173}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "L$11", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$11", "L$12", "L$13", "Z$0", "I$0", "I$1", "I$2", "I$3"}, v = 2)
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
            return topHDgayporn.this.loadLinks(null, false, null, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.topHDgayporn.topHDgayporn$search$1 */
    /* JADX INFO: compiled from: topHDgayporn.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.topHDgayporn.topHDgayporn", f = "topHDgayporn.kt", i = {0, 0}, l = {86}, m = "search", n = {"query", "searchUrl"}, nl = {87}, s = {"L$0", "L$1"}, v = 2)
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
            return topHDgayporn.this.search(null, (Continuation) this);
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [200=4] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getMainPage(int r24, @org.jetbrains.annotations.NotNull com.lagradost.cloudstream3.MainPageRequest r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.HomePageResponse> r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r26
            boolean r3 = r2 instanceof com.topHDgayporn.topHDgayporn.C00001
            if (r3 == 0) goto L1a
            r3 = r2
            com.topHDgayporn.topHDgayporn$getMainPage$1 r3 = (com.topHDgayporn.topHDgayporn.C00001) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.topHDgayporn.topHDgayporn$getMainPage$1 r3 = new com.topHDgayporn.topHDgayporn$getMainPage$1
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
            goto Ld8
        L4e:
            kotlin.ResultKt.throwOnFailure(r4)
            if (r1 <= r7) goto L75
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r25.getData()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = "page/"
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r1)
            r8 = 47
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            goto L79
        L75:
            java.lang.String r6 = r25.getData()
        L79:
            java.lang.String r8 = "User-Agent"
            java.lang.String r9 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:139.0) Gecko/20100101 Firefox/139.0"
            kotlin.Pair r8 = kotlin.TuplesKt.to(r8, r9)
            java.util.Map r8 = kotlin.collections.MapsKt.mapOf(r8)
            r9 = r4
            com.lagradost.nicehttp.Requests r4 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r10 = r25
            r3.L$0 = r10
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r3.L$1 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r3.L$2 = r11
            r3.I$0 = r1
            r3.label = r7
            r11 = 1
            r7 = 0
            r12 = r5
            r5 = r6
            r6 = r8
            r8 = 0
            r13 = r9
            r9 = 0
            r10 = 0
            r14 = 1
            r11 = 0
            r15 = r12
            r12 = 0
            r16 = r13
            r17 = 1
            r13 = 0
            r18 = r15
            r15 = 0
            r19 = r16
            r16 = 0
            r20 = 1
            r17 = 0
            r21 = r19
            r19 = 4092(0xffc, float:5.734E-42)
            r22 = 1
            r20 = 0
            r1 = r18
            r18 = r3
            r3 = r1
            r1 = 1
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            if (r4 != r3) goto Ld1
            return r3
        Ld1:
            r3 = r6
            r6 = r5
            r5 = r3
            r3 = r24
            r8 = r25
        Ld8:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r4 = r4.getDocument()
            java.lang.String r7 = "div.aiovg-item-video"
            org.jsoup.select.Elements r7 = r4.select(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r9 = 0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Collection r10 = (java.util.Collection) r10
            r11 = r7
            r12 = 0
            r13 = r11
            r14 = 0
            java.util.Iterator r15 = r13.iterator()
        Lf6:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L117
            java.lang.Object r16 = r15.next()
            r17 = r16
            r19 = 0
            r1 = r17
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            r22 = 0
            com.lagradost.cloudstream3.SearchResponse r1 = r0.toSearchResult(r1)
            if (r1 == 0) goto L115
            r22 = 0
            r10.add(r1)
        L115:
            r1 = 1
            goto Lf6
        L117:
            r1 = r10
            java.util.List r1 = (java.util.List) r1
            com.lagradost.cloudstream3.HomePageList r7 = new com.lagradost.cloudstream3.HomePageList
            java.lang.String r9 = r8.getName()
            r14 = 1
            r7.<init>(r9, r1, r14)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r14)
            com.lagradost.cloudstream3.HomePageResponse r7 = com.lagradost.cloudstream3.MainAPIKt.newHomePageResponse(r7, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topHDgayporn.topHDgayporn.getMainPage(int, com.lagradost.cloudstream3.MainPageRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final SearchResponse toSearchResult(Element $this$toSearchResult) {
        String string;
        String strText;
        Element aTag = $this$toSearchResult.selectFirst("a");
        if (aTag == null) {
            return null;
        }
        String href = aTag.attr("href");
        final String posterUrl = $this$toSearchResult.select("img").attr("src");
        Element elementSelectFirst = $this$toSearchResult.selectFirst(".aiovg-link-title");
        if (elementSelectFirst == null || (strText = elementSelectFirst.text()) == null || (string = StringsKt.trim(strText).toString()) == null) {
            string = "No Title";
        }
        String title = string;
        return MainAPIKt.newMovieSearchResponse$default(this, title, href, TvType.NSFW, false, new Function1() { // from class: com.topHDgayporn.topHDgayporn$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(Object obj) {
                return topHDgayporn.toSearchResult$lambda$0(this.f$0, posterUrl, (MovieSearchResponse) obj);
            }
        }, 8, (Object) null);
    }

    static final Unit toSearchResult$lambda$0(topHDgayporn this$0, String $posterUrl, MovieSearchResponse $this$newMovieSearchResponse) {
        $this$newMovieSearchResponse.setPosterUrl(MainAPIKt.fixUrlNull(this$0, $posterUrl));
        return Unit.INSTANCE;
    }

    private final SearchResponse toRecommendResult(Element $this$toRecommendResult) {
        String string;
        String strText;
        Element aTag = $this$toRecommendResult.selectFirst("a");
        if (aTag == null) {
            return null;
        }
        String href = aTag.attr("href");
        final String posterUrl = $this$toRecommendResult.select("img").attr("src");
        Element elementSelectFirst = $this$toRecommendResult.selectFirst(".aiovg-link-title");
        if (elementSelectFirst == null || (strText = elementSelectFirst.text()) == null || (string = StringsKt.trim(strText).toString()) == null) {
            string = "No Title";
        }
        String title = string;
        return MainAPIKt.newMovieSearchResponse$default(this, title, href, TvType.NSFW, false, new Function1() { // from class: com.topHDgayporn.topHDgayporn$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(Object obj) {
                return topHDgayporn.toRecommendResult$lambda$0(this.f$0, posterUrl, (MovieSearchResponse) obj);
            }
        }, 8, (Object) null);
    }

    static final Unit toRecommendResult$lambda$0(topHDgayporn this$0, String $posterUrl, MovieSearchResponse $this$newMovieSearchResponse) {
        $this$newMovieSearchResponse.setPosterUrl(MainAPIKt.fixUrlNull(this$0, $posterUrl));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [214=4] */
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
            boolean r2 = r1 instanceof com.topHDgayporn.topHDgayporn.C00041
            if (r2 == 0) goto L18
            r2 = r1
            com.topHDgayporn.topHDgayporn$search$1 r2 = (com.topHDgayporn.topHDgayporn.C00041) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.topHDgayporn.topHDgayporn$search$1 r2 = new com.topHDgayporn.topHDgayporn$search$1
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
            java.lang.String r3 = "div.aiovg-item-video"
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
        throw new UnsupportedOperationException("Method not decompiled: com.topHDgayporn.topHDgayporn.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [231=4] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(@org.jetbrains.annotations.NotNull java.lang.String r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.LoadResponse> r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            boolean r2 = r1 instanceof com.topHDgayporn.topHDgayporn.C00011
            if (r2 == 0) goto L18
            r2 = r1
            com.topHDgayporn.topHDgayporn$load$1 r2 = (com.topHDgayporn.topHDgayporn.C00011) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.topHDgayporn.topHDgayporn$load$1 r2 = new com.topHDgayporn.topHDgayporn$load$1
            r2.<init>(r1)
        L1d:
            r9 = r2
            java.lang.Object r2 = r9.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r9.label
            switch(r4) {
                case 0: goto L6b;
                case 1: goto L5c;
                case 2: goto L33;
                default: goto L29;
            }
        L29:
            r18 = r2
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            java.lang.Object r3 = r9.L$7
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r9.L$6
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r9.L$5
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r9.L$4
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.L$3
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r9.L$2
            org.jsoup.nodes.Document r8 = (org.jsoup.nodes.Document) r8
            java.lang.Object r10 = r9.L$1
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r11 = r9.L$0
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r2)
            r18 = r2
            r17 = r9
            goto L1f2
        L5c:
            java.lang.Object r4 = r9.L$1
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r9.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r3
            r10 = r4
            r3 = r2
            goto Lad
        L6b:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.String r4 = "User-Agent"
            java.lang.String r5 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:139.0) Gecko/20100101 Firefox/139.0"
            kotlin.Pair r4 = kotlin.TuplesKt.to(r4, r5)
            java.util.Map r5 = kotlin.collections.MapsKt.mapOf(r4)
            r4 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r6 = r25
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
            r4 = r25
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r9 = r17
            if (r3 != r1) goto Laa
            return r1
        Laa:
            r10 = r5
            r5 = r25
        Lad:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r11 = r3.getDocument()
            java.lang.String r3 = "meta[property='og:title']"
            org.jsoup.nodes.Element r3 = r11.selectFirst(r3)
            java.lang.String r4 = "content"
            if (r3 == 0) goto Lc3
            java.lang.String r3 = r3.attr(r4)
            if (r3 != 0) goto Lc7
        Lc3:
            java.lang.String r3 = r11.title()
        Lc7:
            java.lang.String r6 = "meta[property='og:image']"
            org.jsoup.nodes.Element r6 = r11.selectFirst(r6)
            java.lang.String r7 = ""
            if (r6 == 0) goto Ld7
            java.lang.String r6 = r6.attr(r4)
            if (r6 != 0) goto Ld8
        Ld7:
            r6 = r7
        Ld8:
            r13 = r6
            java.lang.String r6 = "meta[property='og:description']"
            org.jsoup.nodes.Element r6 = r11.selectFirst(r6)
            if (r6 == 0) goto Lea
            java.lang.String r4 = r6.attr(r4)
            if (r4 != 0) goto Le8
            goto Lea
        Le8:
            r14 = r4
            goto Leb
        Lea:
            r14 = r7
        Leb:
            java.lang.String r4 = "Flynn Fenix"
            java.lang.String r6 = "Nicholas Ryder"
            java.lang.String[] r4 = new java.lang.String[]{r4, r6}
            java.util.List r4 = kotlin.collections.CollectionsKt.listOf(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r6 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r7 = (java.util.Collection) r7
            r8 = r4
            r12 = 0
            java.util.Iterator r15 = r8.iterator()
        L107:
            boolean r16 = r15.hasNext()
            r18 = r2
            if (r16 == 0) goto L144
            java.lang.Object r2 = r15.next()
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            r17 = 0
            r19 = r3
            r3 = r19
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r20 = r4
            r4 = r16
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r21 = r5
            r5 = 0
            r22 = r6
            r6 = 0
            r23 = r8
            r8 = 2
            boolean r3 = kotlin.text.StringsKt.contains$default(r3, r4, r5, r8, r6)
            if (r3 == 0) goto L137
            r7.add(r2)
        L137:
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r8 = r23
            goto L107
        L144:
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r8
            r15 = r7
            java.util.List r15 = (java.util.List) r15
            java.lang.String r2 = "div.aiovg-item-tag"
            org.jsoup.select.Elements r2 = r11.select(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            r7 = r5
            r8 = 0
            java.util.Iterator r12 = r7.iterator()
        L16b:
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L18f
            java.lang.Object r16 = r12.next()
            r17 = r16
            r20 = 0
            r22 = r2
            r2 = r17
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            r23 = 0
            com.lagradost.cloudstream3.SearchResponse r2 = r0.toRecommendResult(r2)
            if (r2 == 0) goto L18c
            r23 = 0
            r4.add(r2)
        L18c:
            r2 = r22
            goto L16b
        L18f:
            r22 = r2
            r16 = r4
            java.util.List r16 = (java.util.List) r16
            r3 = r0
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            com.lagradost.cloudstream3.TvType r6 = com.lagradost.cloudstream3.TvType.NSFW
            com.topHDgayporn.topHDgayporn$load$2 r12 = new com.topHDgayporn.topHDgayporn$load$2
            r17 = 0
            r12.<init>(r13, r14, r15, r16, r17)
            r8 = r12
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r21)
            r9.L$0 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r9.L$1 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r9.L$2 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)
            r9.L$3 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r9.L$4 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r9.L$5 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r9.L$6 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r9.L$7 = r2
            r2 = 2
            r9.label = r2
            r7 = r21
            r4 = r19
            r5 = r21
            java.lang.Object r2 = com.lagradost.cloudstream3.MainAPIKt.newMovieLoadResponse(r3, r4, r5, r6, r7, r8, r9)
            r17 = r9
            if (r2 != r1) goto L1e9
            return r1
        L1e9:
            r8 = r11
            r6 = r13
            r4 = r15
            r3 = r16
            r7 = r19
            r11 = r5
            r5 = r14
        L1f2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topHDgayporn.topHDgayporn.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.topHDgayporn.topHDgayporn$load$2 */
    /* JADX INFO: compiled from: topHDgayporn.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.topHDgayporn.topHDgayporn$load$2", f = "topHDgayporn.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00022 extends SuspendLambda implements Function2<MovieLoadResponse, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $actors;
        final /* synthetic */ String $description;
        final /* synthetic */ String $poster;
        final /* synthetic */ List<SearchResponse> $recommendations;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00022(String str, String str2, List<String> list, List<? extends SearchResponse> list2, Continuation<? super C00022> continuation) {
            super(2, continuation);
            this.$poster = str;
            this.$description = str2;
            this.$actors = list;
            this.$recommendations = list2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00022 = new C00022(this.$poster, this.$description, this.$actors, this.$recommendations, continuation);
            c00022.L$0 = obj;
            return c00022;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        public final Object invoke(MovieLoadResponse movieLoadResponse, Continuation<? super Unit> continuation) {
            return create(movieLoadResponse, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object $result) {
            LoadResponse loadResponse = (MovieLoadResponse) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    loadResponse.setPosterUrl(this.$poster);
                    loadResponse.setPlot(this.$description);
                    if (!this.$actors.isEmpty()) {
                        LoadResponse.Companion.addActorNames(loadResponse, this.$actors);
                    }
                    loadResponse.setRecommendations(this.$recommendations);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [140=4, 115=6, 252=4] */
    /* JADX WARN: Can't wrap try/catch for region: R(10:58|(1:141)|59|60|147|61|62|139|63|(1:65)(15:66|149|67|68|143|69|(2:72|70)|151|73|(7:76|(1:78)(1:79)|(1:81)|82|(2:84|154)(2:86|153)|87|74)|152|88|100|56|(11:101|(2:104|102)|155|105|(2:108|106)|156|109|(4:112|(3:157|114|161)(1:160)|159|110)|158|115|(2:117|118)(3:119|120|(6:122|(1:124)|125|(2:128|(1:130)(1:131))(1:127)|132|(1:134)(4:135|136|120|(2:137|138)(0)))(0)))(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(10:58|141|59|60|147|61|62|139|63|(1:65)(15:66|149|67|68|143|69|(2:72|70)|151|73|(7:76|(1:78)(1:79)|(1:81)|82|(2:84|154)(2:86|153)|87|74)|152|88|100|56|(11:101|(2:104|102)|155|105|(2:108|106)|156|109|(4:112|(3:157|114|161)(1:160)|159|110)|158|115|(2:117|118)(3:119|120|(6:122|(1:124)|125|(2:128|(1:130)(1:131))(1:127)|132|(1:134)(4:135|136|120|(2:137|138)(0)))(0)))(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:66|(1:149)|67|68|143|69|(2:72|70)|151|73|(7:76|(1:78)(1:79)|(1:81)|82|(2:84|154)(2:86|153)|87|74)|152|88|100|56|(11:101|(2:104|102)|155|105|(2:108|106)|156|109|(4:112|(3:157|114|161)(1:160)|159|110)|158|115|(2:117|118)(3:119|120|(6:122|(1:124)|125|(2:128|(1:130)(1:131))(1:127)|132|(1:134)(4:135|136|120|(2:137|138)(0)))(0)))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0417, code lost:
    
        r1 = r53;
        r2 = r54;
        r21 = r10;
        r5 = r22;
        r22 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x042f, code lost:
    
        r1 = r53;
        r18 = r7;
        r21 = r10;
        r25 = r15;
        r5 = r22;
        r24 = r33;
        r22 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0443, code lost:
    
        r45 = r5;
        r1 = r53;
        r18 = r7;
        r21 = r10;
        r25 = r15;
        r5 = r22;
        r24 = r9;
        r22 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0396 A[Catch: Exception -> 0x0416, LOOP:0: B:70:0x0390->B:72:0x0396, LOOP_END, TryCatch #2 {Exception -> 0x0416, blocks: (B:69:0x0387, B:70:0x0390, B:72:0x0396, B:73:0x03ac, B:74:0x03bb, B:76:0x03c1, B:81:0x03e4, B:82:0x03ec, B:84:0x03fa), top: B:143:0x0387 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03c1 A[Catch: Exception -> 0x0416, TryCatch #2 {Exception -> 0x0416, blocks: (B:69:0x0387, B:70:0x0390, B:72:0x0396, B:73:0x03ac, B:74:0x03bb, B:76:0x03c1, B:81:0x03e4, B:82:0x03ec, B:84:0x03fa), top: B:143:0x0387 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x065f -> B:136:0x067d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0368 -> B:149:0x0374). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0473 -> B:100:0x047d). Please report as a decompilation issue!!! */
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
            boolean r0 = r1 instanceof com.topHDgayporn.topHDgayporn.C00031
            if (r0 == 0) goto L1a
            r0 = r1
            com.topHDgayporn.topHDgayporn$loadLinks$1 r0 = (com.topHDgayporn.topHDgayporn.C00031) r0
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
            com.topHDgayporn.topHDgayporn$loadLinks$1 r0 = new com.topHDgayporn.topHDgayporn$loadLinks$1
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
                case 0: goto L143;
                case 1: goto L120;
                case 2: goto Lb6;
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
            r30 = 1
            r19 = r56
            r4 = r0
            r12 = r10
            r0 = r18
            r10 = r6
            r18 = r15
            r6 = r2
            r15 = r14
            r14 = r11
            r11 = r22
            r22 = r5
            r2 = r54
            goto L67d
        Lb6:
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
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Exception -> L114
            r45 = r4
            r32 = r14
            r10 = r21
            r11 = r22
            r4 = r3
            r22 = r5
            r3 = r7
            r14 = r8
            r8 = r20
            goto L374
        L114:
            r0 = move-exception
            r45 = r4
            r32 = r14
            r4 = r3
            r3 = r7
            r14 = r8
            r8 = r20
            goto L473
        L120:
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
            goto L1b5
        L143:
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
            if (r5 != r1) goto L1ac
            return r1
        L1ac:
            r3 = r53
            r0 = r54
            r13 = r55
            r12 = r56
            r9 = r4
        L1b5:
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
        L1d9:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L228
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
        L204:
            boolean r19 = r18.hasNext()
            if (r19 == 0) goto L21d
            java.lang.Object r19 = r18.next()
            r20 = r19
            kotlin.text.MatchResult r20 = (kotlin.text.MatchResult) r20
            r21 = 0
            java.lang.String r1 = r20.getValue()
            r6.add(r1)
            r1 = 0
            goto L204
        L21d:
            r0 = r53
            r2 = r54
            r3 = r55
            r1 = r23
            goto L1d9
        L228:
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
        L23f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L282
            java.lang.Object r8 = r7.next()
            r10 = r8
            org.jsoup.nodes.Element r10 = (org.jsoup.nodes.Element) r10
            r11 = 0
            r14 = r29
            java.lang.String r15 = r10.attr(r14)
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            int r17 = r15.length()
            if (r17 != 0) goto L25e
            r17 = 1
            goto L260
        L25e:
            r17 = 0
        L260:
            if (r17 == 0) goto L26a
            r15 = 0
            r3 = r28
            java.lang.String r15 = r10.attr(r3)
            goto L26c
        L26a:
            r3 = r28
        L26c:
            java.lang.String r15 = (java.lang.String) r15
            r17 = r15
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17
            boolean r17 = kotlin.text.StringsKt.isBlank(r17)
            if (r17 != 0) goto L27b
            r6.add(r15)
        L27b:
            r28 = r3
            r29 = r14
            r3 = 0
            goto L23f
        L282:
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
        L29e:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L2d2
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
            if (r28 != 0) goto L2c5
            goto L2c7
        L2c5:
            r25 = 0
        L2c7:
            if (r25 == 0) goto L2d0
            r2 = r25
            r24 = 0
            r7.add(r2)
        L2d0:
            r2 = 2
            goto L29e
        L2d2:
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
        L2f8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L484
            java.lang.Object r16 = r7.next()
            r32 = r16
            java.lang.String r32 = (java.lang.String) r32
            r53 = r1
            r1 = 0
            com.lagradost.nicehttp.Requests r31 = com.lagradost.cloudstream3.MainActivityKt.getApp()     // Catch: java.lang.Exception -> L45a
            r5.L$0 = r4     // Catch: java.lang.Exception -> L45a
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)     // Catch: java.lang.Exception -> L45a
            r5.L$1 = r0     // Catch: java.lang.Exception -> L45a
            r5.L$2 = r15     // Catch: java.lang.Exception -> L45a
            r5.L$3 = r9     // Catch: java.lang.Exception -> L45a
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)     // Catch: java.lang.Exception -> L45a
            r5.L$4 = r0     // Catch: java.lang.Exception -> L45a
            r5.L$5 = r11     // Catch: java.lang.Exception -> L45a
            r5.L$6 = r10     // Catch: java.lang.Exception -> L45a
            r5.L$7 = r8     // Catch: java.lang.Exception -> L45a
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)     // Catch: java.lang.Exception -> L45a
            r5.L$8 = r0     // Catch: java.lang.Exception -> L45a
            r5.L$9 = r7     // Catch: java.lang.Exception -> L45a
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)     // Catch: java.lang.Exception -> L45a
            r5.L$10 = r0     // Catch: java.lang.Exception -> L45a
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r32)     // Catch: java.lang.Exception -> L45a
            r5.L$11 = r0     // Catch: java.lang.Exception -> L45a
            r5.Z$0 = r13     // Catch: java.lang.Exception -> L45a
            r5.I$0 = r12     // Catch: java.lang.Exception -> L45a
            r5.I$1 = r1     // Catch: java.lang.Exception -> L45a
            r54 = r1
            r1 = 2
            r5.label = r1     // Catch: java.lang.Exception -> L442
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r46 = 4092(0xffc, float:5.734E-42)
            r47 = 0
            r45 = r5
            r33 = r9
            java.lang.Object r5 = com.lagradost.nicehttp.Requests.get$default(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r43, r44, r45, r46, r47)     // Catch: java.lang.Exception -> L42e
            if (r5 != r6) goto L368
            return r6
        L368:
            r1 = r53
            r9 = r54
            r18 = r7
            r25 = r15
            r15 = r16
            r24 = r33
        L374:
            com.lagradost.nicehttp.NiceResponse r5 = (com.lagradost.nicehttp.NiceResponse) r5     // Catch: java.lang.Exception -> L422
            org.jsoup.nodes.Document r0 = r5.getDocument()     // Catch: java.lang.Exception -> L422
            java.lang.String r5 = r0.html()     // Catch: java.lang.Exception -> L422
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Exception -> L422
            r53 = r1
            r54 = r2
            r1 = 2
            r2 = 0
            r7 = 0
            kotlin.sequences.Sequence r5 = kotlin.text.Regex.findAll$default(r10, r5, r2, r1, r7)     // Catch: java.lang.Exception -> L416
            r1 = 0
            java.util.Iterator r2 = r5.iterator()     // Catch: java.lang.Exception -> L416
        L390:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Exception -> L416
            if (r7 == 0) goto L3ac
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Exception -> L416
            r16 = r7
            kotlin.text.MatchResult r16 = (kotlin.text.MatchResult) r16     // Catch: java.lang.Exception -> L416
            r17 = 0
            r55 = r1
            java.lang.String r1 = r16.getValue()     // Catch: java.lang.Exception -> L416
            r8.add(r1)     // Catch: java.lang.Exception -> L416
            r1 = r55
            goto L390
        L3ac:
            r55 = r1
            java.lang.String r1 = "video[src], source[src]"
            org.jsoup.select.Elements r1 = r0.select(r1)     // Catch: java.lang.Exception -> L416
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Exception -> L416
            r2 = 0
            java.util.Iterator r5 = r1.iterator()     // Catch: java.lang.Exception -> L416
        L3bb:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Exception -> L416
            if (r7 == 0) goto L40a
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Exception -> L416
            r16 = r7
            org.jsoup.nodes.Element r16 = (org.jsoup.nodes.Element) r16     // Catch: java.lang.Exception -> L416
            r55 = r16
            r16 = 0
            r56 = r0
            r0 = r55
            java.lang.String r17 = r0.attr(r14)     // Catch: java.lang.Exception -> L416
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17     // Catch: java.lang.Exception -> L416
            int r21 = r17.length()     // Catch: java.lang.Exception -> L416
            if (r21 != 0) goto L3e0
            r21 = 1
            goto L3e2
        L3e0:
            r21 = 0
        L3e2:
            if (r21 == 0) goto L3ec
            r17 = 0
            java.lang.String r21 = r0.attr(r3)     // Catch: java.lang.Exception -> L416
            r17 = r21
        L3ec:
            java.lang.String r17 = (java.lang.String) r17     // Catch: java.lang.Exception -> L416
            r55 = r17
            r17 = r55
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17     // Catch: java.lang.Exception -> L416
            boolean r17 = kotlin.text.StringsKt.isBlank(r17)     // Catch: java.lang.Exception -> L416
            if (r17 != 0) goto L402
            r17 = r0
            r0 = r55
            r8.add(r0)     // Catch: java.lang.Exception -> L416
            goto L406
        L402:
            r17 = r0
            r0 = r55
        L406:
            r0 = r56
            goto L3bb
        L40a:
            r56 = r0
            r1 = r53
            r2 = r54
            r7 = r18
            r5 = r45
            goto L47d
        L416:
            r0 = move-exception
            r1 = r53
            r2 = r54
            r21 = r10
            r5 = r22
            r22 = r11
            goto L473
        L422:
            r0 = move-exception
            r53 = r1
            r54 = r2
            r21 = r10
            r5 = r22
            r22 = r11
            goto L473
        L42e:
            r0 = move-exception
            r1 = r53
            r9 = r54
            r18 = r7
            r21 = r10
            r25 = r15
            r15 = r16
            r5 = r22
            r24 = r33
            r22 = r11
            goto L473
        L442:
            r0 = move-exception
            r45 = r5
            r33 = r9
            r1 = r53
            r9 = r54
            r18 = r7
            r21 = r10
            r25 = r15
            r15 = r16
            r5 = r22
            r24 = r33
            r22 = r11
            goto L473
        L45a:
            r0 = move-exception
            r54 = r1
            r45 = r5
            r33 = r9
            r1 = r53
            r9 = r54
            r18 = r7
            r21 = r10
            r25 = r15
            r15 = r16
            r5 = r22
            r24 = r33
            r22 = r11
        L473:
            r10 = r21
            r11 = r22
            r22 = r5
            r7 = r18
            r5 = r45
        L47d:
            r9 = r24
            r15 = r25
            goto L2f8
        L484:
            r53 = r1
            r45 = r5
            r33 = r9
            java.lang.String r0 = r11.html()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            r3 = 2
            r5 = 0
            kotlin.sequences.Sequence r0 = kotlin.text.Regex.findAll$default(r10, r0, r5, r3, r1)
            r1 = 0
            java.util.Iterator r3 = r0.iterator()
        L49c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L4b2
            java.lang.Object r5 = r3.next()
            r7 = r5
            kotlin.text.MatchResult r7 = (kotlin.text.MatchResult) r7
            r9 = 0
            java.lang.String r12 = r7.getValue()
            r8.add(r12)
            goto L49c
        L4b2:
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
        L4ca:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L505
            java.lang.Object r12 = r9.next()
            r14 = r12
            java.lang.String r14 = (java.lang.String) r14
            r16 = 0
            r17 = r14
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17
            java.lang.CharSequence r17 = kotlin.text.StringsKt.trim(r17)
            java.lang.String r34 = r17.toString()
            r38 = 4
            r39 = 0
            java.lang.String r35 = "&amp;"
            java.lang.String r36 = "&"
            r37 = 0
            java.lang.String r46 = kotlin.text.StringsKt.replace$default(r34, r35, r36, r37, r38, r39)
            r50 = 4
            r51 = 0
            java.lang.String r47 = " "
            java.lang.String r48 = "%20"
            r49 = 0
            java.lang.String r14 = kotlin.text.StringsKt.replace$default(r46, r47, r48, r49, r50, r51)
            r3.add(r14)
            goto L4ca
        L505:
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            r5 = r3
            r7 = 0
            java.util.Iterator r9 = r5.iterator()
        L51a:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L537
            java.lang.Object r12 = r9.next()
            r14 = r12
            java.lang.String r14 = (java.lang.String) r14
            r16 = 0
            r17 = r14
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17
            boolean r17 = kotlin.text.StringsKt.isBlank(r17)
            if (r17 != 0) goto L51a
            r1.add(r12)
            goto L51a
        L537:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r0 = kotlin.collections.CollectionsKt.distinct(r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L567
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
        L567:
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r3 = 0
            r5 = 0
            java.util.Iterator r7 = r1.iterator()
            r12 = r3
            r9 = r6
            r14 = r7
            r7 = r45
            r3 = r0
            r6 = r5
            r0 = r53
            r5 = r2
            r2 = r33
        L57c:
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L695
            java.lang.Object r20 = r14.next()
            r53 = r0
            int r0 = r6 + 1
            if (r6 >= 0) goto L58f
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L58f:
            r54 = r1
            r1 = r20
            java.lang.String r1 = (java.lang.String) r1
            r55 = r3
            r3 = 0
            r56 = r5
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r16 = "aucdn.net"
            r57 = r8
            r8 = r16
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r21 = r10
            r10 = 1
            boolean r5 = kotlin.text.StringsKt.contains(r5, r8, r10)
            if (r5 == 0) goto L5b2
            java.lang.String r5 = "CDN"
            goto L5c4
        L5b2:
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r8 = "besthdgayporn.com"
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r5 = kotlin.text.StringsKt.contains(r5, r8, r10)
            if (r5 == 0) goto L5c2
            java.lang.String r5 = "Origin"
            goto L5c4
        L5c2:
            java.lang.String r5 = "Direct"
        L5c4:
            java.lang.String r8 = r56.getName()
            r30 = 1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r10 = r10.append(r5)
            r24 = r5
            r5 = 32
            java.lang.StringBuilder r5 = r10.append(r5)
            int r10 = r6 + 1
            java.lang.StringBuilder r5 = r5.append(r10)
            java.lang.String r5 = r5.toString()
            com.topHDgayporn.topHDgayporn$loadLinks$7$1 r10 = new com.topHDgayporn.topHDgayporn$loadLinks$7$1
            r16 = r5
            r5 = 0
            r10.<init>(r4, r1, r2, r5)
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r7.L$0 = r4
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)
            r7.L$1 = r5
            r7.L$2 = r15
            r7.L$3 = r2
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)
            r7.L$4 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r7.L$5 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r21)
            r7.L$6 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r57)
            r7.L$7 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r55)
            r7.L$8 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r54)
            r7.L$9 = r5
            r7.L$10 = r14
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r20)
            r7.L$11 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r7.L$12 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r7.L$13 = r5
            r7.L$14 = r15
            r7.Z$0 = r13
            r7.I$0 = r12
            r7.I$1 = r0
            r7.I$2 = r6
            r7.I$3 = r3
            r5 = 3
            r7.label = r5
            r5 = r15
            r15 = 0
            r18 = 8
            r19 = 0
            r17 = r7
            r7 = r14
            r14 = r1
            r1 = r12
            r12 = r8
            r8 = r5
            r5 = r13
            r13 = r16
            r16 = r10
            java.lang.Object r10 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink$default(r12, r13, r14, r15, r16, r17, r18, r19)
            if (r10 != r9) goto L65f
            return r9
        L65f:
            r12 = r1
            r16 = r7
            r13 = r8
            r19 = r13
            r18 = r14
            r15 = r24
            r1 = r53
            r8 = r0
            r24 = r2
            r0 = r3
            r14 = r5
            r7 = r6
            r5 = r10
            r3 = r55
            r6 = r56
            r10 = r9
            r9 = r20
            r20 = r57
            r2 = r54
        L67d:
            r13.invoke(r5)
            r0 = r1
            r1 = r2
            r5 = r6
            r6 = r8
            r9 = r10
            r13 = r14
            r14 = r16
            r7 = r17
            r15 = r19
            r8 = r20
            r10 = r21
            r2 = r24
            goto L57c
        L695:
            r53 = r0
            r30 = 1
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r30)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topHDgayporn.topHDgayporn.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
