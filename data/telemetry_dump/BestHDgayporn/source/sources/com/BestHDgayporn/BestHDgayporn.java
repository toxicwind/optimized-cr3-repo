package com.BestHDgayporn;

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

/* JADX INFO: compiled from: BestHDgayporn.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/BestHDgayporn/classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010!\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0096@¢\u0006\u0002\u0010*J\u000e\u0010+\u001a\u0004\u0018\u00010,*\u00020-H\u0002J\u000e\u0010.\u001a\u0004\u0018\u00010,*\u00020-H\u0002J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\u001f2\u0006\u00100\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u00101J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u00101JF\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u000e2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;092\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020;09H\u0096@¢\u0006\u0002\u0010>R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/BestHDgayporn/BestHDgayporn;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "hasDownloadSupport", "getHasDownloadSupport", "hasQuickSearch", "getHasQuickSearch", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "cookies", "", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lorg/jsoup/nodes/Element;", "toRecommendResult", "search", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "BestHDgayporn"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBestHDgayporn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BestHDgayporn.kt\ncom/BestHDgayporn/BestHDgayporn\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,211:1\n1642#2,10:212\n1915#2:222\n1916#2:224\n1652#2:225\n1642#2,10:226\n1915#2:236\n1916#2:238\n1652#2:239\n1586#2:240\n1661#2,3:241\n777#2:244\n873#2,2:245\n1642#2,10:247\n1915#2:257\n1642#2,10:259\n1915#2:269\n1916#2:271\n1652#2:272\n1916#2:274\n1652#2:275\n1915#2:276\n1916#2:279\n1915#2:280\n1916#2:282\n1642#2,10:283\n1915#2:293\n1916#2:295\n1652#2:296\n1915#2:297\n1915#2,2:300\n1916#2:302\n1586#2:305\n1661#2,3:306\n777#2:309\n873#2,2:310\n1924#2,3:312\n1#3:223\n1#3:237\n1#3:258\n1#3:270\n1#3:273\n1#3:281\n1#3:294\n1342#4,2:277\n1342#4,2:298\n1342#4,2:303\n*S KotlinDebug\n*F\n+ 1 BestHDgayporn.kt\ncom/BestHDgayporn/BestHDgayporn\n*L\n54#1:212,10\n54#1:222\n54#1:224\n54#1:225\n92#1:226,10\n92#1:236\n92#1:238\n92#1:239\n105#1:240\n105#1:241,3\n106#1:244\n106#1:245,2\n110#1:247,10\n110#1:257\n119#1:259,10\n119#1:269\n119#1:271\n119#1:272\n110#1:274\n110#1:275\n150#1:276\n150#1:279\n155#1:280\n155#1:282\n161#1:283,10\n161#1:293\n161#1:295\n161#1:296\n161#1:297\n165#1:300,2\n161#1:302\n178#1:305\n178#1:306,3\n179#1:309\n179#1:310,2\n188#1:312,3\n54#1:223\n92#1:237\n119#1:270\n110#1:273\n161#1:294\n151#1:277,2\n164#1:298,2\n175#1:303,2\n*E\n"})
public final class BestHDgayporn extends MainAPI {

    @NotNull
    private String mainUrl = "https://besthdgayporn.com";

    @NotNull
    private String name = "BestHDgayporn";
    private final boolean hasMainPage = true;
    private final boolean hasDownloadSupport = true;
    private final boolean hasQuickSearch = true;

    @NotNull
    private final VPNStatus vpnStatus = VPNStatus.MightBeNeeded;

    @NotNull
    private final Set<TvType> supportedTypes = SetsKt.setOf(TvType.NSFW);

    @NotNull
    private final List<MainPageData> mainPage = MainAPIKt.mainPageOf(new Pair[]{TuplesKt.to(getMainUrl() + '/', "Latest"), TuplesKt.to(getMainUrl() + "/video-tag/asian/", "Asian"), TuplesKt.to(getMainUrl() + "/video-tag/men-com/", "MEN.com"), TuplesKt.to(getMainUrl() + "/video-tag/bareback-gay-porn/", "Bareback"), TuplesKt.to(getMainUrl() + "/video-tag/bro-network/", "Bro Network"), TuplesKt.to(getMainUrl() + "/video-tag/chaos-men/", "Chaos Men"), TuplesKt.to(getMainUrl() + "/video-tag/cockyboys/", "CockyBoys"), TuplesKt.to(getMainUrl() + "/video-tag/colby-knox/", "Colby Knox"), TuplesKt.to(getMainUrl() + "/video-tag/corbin-fisher/", "Corbin Fisher"), TuplesKt.to(getMainUrl() + "/video-tag/falcon-studios/", "Falcon Studios"), TuplesKt.to(getMainUrl() + "/video-tag/next-door-studios/", "Next Door Raw"), TuplesKt.to(getMainUrl() + "/video-tag/nakedsword/", "Naked Sword"), TuplesKt.to(getMainUrl() + "/video-tag/onlyfans/", "Onlyfans"), TuplesKt.to(getMainUrl() + "/video-tag/pride-studios/", "Pride Studios"), TuplesKt.to(getMainUrl() + "/video-tag/latino/", "Latino"), TuplesKt.to(getMainUrl() + "/video-tag/raging-stallion/", "Raging Stallion"), TuplesKt.to(getMainUrl() + "/video-tag/raw-fuck-club/", "RFC"), TuplesKt.to(getMainUrl() + "/video-tag/voyr/", "Voyr"), TuplesKt.to(getMainUrl() + "/video-tag/kristen-bjorn/", "Kristen Bjorn"), TuplesKt.to(getMainUrl() + "/video-tag/sean-cody/", "Sean Cody"), TuplesKt.to(getMainUrl() + "/video-category-2/bait-bus/", "Bait Bus"), TuplesKt.to(getMainUrl() + "/video-category-2/bilatinmen/", "Bi Latin Men")});

    @NotNull
    private final Map<String, String> cookies = MapsKt.mapOf(new Pair[]{new Pair("hasVisited", "1"), new Pair("accessAgeDisclaimerPH", "1")});

    /* JADX INFO: renamed from: com.BestHDgayporn.BestHDgayporn$getMainPage$1 */
    /* JADX INFO: compiled from: BestHDgayporn.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.BestHDgayporn.BestHDgayporn", f = "BestHDgayporn.kt", i = {0, 0, 0, 0}, l = {53}, m = "getMainPage", n = {"request", "url", "ua", "page"}, nl = {54}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 2)
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
            return BestHDgayporn.this.getMainPage(0, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.BestHDgayporn.BestHDgayporn$load$1 */
    /* JADX INFO: compiled from: BestHDgayporn.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.BestHDgayporn.BestHDgayporn", f = "BestHDgayporn.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {97, 116, 127}, m = "load", n = {"url", "ua", "url", "ua", "doc", "title", "poster", "description", "actors", "$this$mapNotNull$iv", "$this$mapNotNullTo$iv$iv", "destination$iv$iv", "$this$forEach$iv$iv$iv", "element$iv$iv$iv", "element$iv$iv", "tagEl", "tagHref", "$i$f$mapNotNull", "$i$f$mapNotNullTo", "$i$f$forEach", "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv", "$i$a$-mapNotNull-BestHDgayporn$load$recommendations$1", "url", "ua", "doc", "title", "poster", "description", "actors", "recommendations"}, nl = {99, 118, -1}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$12", "L$13", "L$14", "L$15", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, v = 2)
    static final class C00011 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
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

        C00011(Continuation<? super C00011> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BestHDgayporn.this.load(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.BestHDgayporn.BestHDgayporn$loadLinks$1 */
    /* JADX INFO: compiled from: BestHDgayporn.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.BestHDgayporn.BestHDgayporn", f = "BestHDgayporn.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {143, 163, 195}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "headers", "isCasting", "data", "subtitleCallback", "callback", "headers", "res", "doc", "urlRegex", "found", "$this$forEach$iv", "element$iv", "iframeUrl", "isCasting", "$i$f$forEach", "$i$a$-forEach-BestHDgayporn$loadLinks$5", "data", "subtitleCallback", "callback", "headers", "res", "doc", "urlRegex", "found", "candidates", "$this$forEachIndexed$iv", "item$iv", "url", "friendlyName", "isCasting", "$i$f$forEachIndexed", "index$iv", "i", "$i$a$-forEachIndexed-BestHDgayporn$loadLinks$7"}, nl = {144, 164, 194}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "L$11", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$11", "L$12", "L$13", "Z$0", "I$0", "I$1", "I$2", "I$3"}, v = 2)
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
            return BestHDgayporn.this.loadLinks(null, false, null, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.BestHDgayporn.BestHDgayporn$search$1 */
    /* JADX INFO: compiled from: BestHDgayporn.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.BestHDgayporn.BestHDgayporn", f = "BestHDgayporn.kt", i = {0, 0}, l = {90}, m = "search", n = {"query", "searchUrl"}, nl = {91}, s = {"L$0", "L$1"}, v = 2)
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
            return BestHDgayporn.this.search(null, (Continuation) this);
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

    public boolean getHasQuickSearch() {
        return this.hasQuickSearch;
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [221=4] */
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
            boolean r3 = r2 instanceof com.BestHDgayporn.BestHDgayporn.C00001
            if (r3 == 0) goto L1a
            r3 = r2
            com.BestHDgayporn.BestHDgayporn$getMainPage$1 r3 = (com.BestHDgayporn.BestHDgayporn.C00001) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.BestHDgayporn.BestHDgayporn$getMainPage$1 r3 = new com.BestHDgayporn.BestHDgayporn$getMainPage$1
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
            goto Ld6
        L4e:
            kotlin.ResultKt.throwOnFailure(r4)
            if (r1 <= r7) goto L6f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r25.getData()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = "page/"
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            goto L77
        L6f:
            java.lang.String r6 = r25.getData()
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L77:
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
            if (r4 != r3) goto Lcf
            return r3
        Lcf:
            r3 = r6
            r6 = r5
            r5 = r3
            r3 = r24
            r8 = r25
        Ld6:
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
        Lf4:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L115
            java.lang.Object r16 = r15.next()
            r17 = r16
            r19 = 0
            r1 = r17
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            r22 = 0
            com.lagradost.cloudstream3.SearchResponse r1 = r0.toSearchResult(r1)
            if (r1 == 0) goto L113
            r22 = 0
            r10.add(r1)
        L113:
            r1 = 1
            goto Lf4
        L115:
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
        throw new UnsupportedOperationException("Method not decompiled: com.BestHDgayporn.BestHDgayporn.getMainPage(int, com.lagradost.cloudstream3.MainPageRequest, kotlin.coroutines.Continuation):java.lang.Object");
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
        return MainAPIKt.newMovieSearchResponse$default(this, title, href, TvType.NSFW, false, new Function1() { // from class: com.BestHDgayporn.BestHDgayporn$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(Object obj) {
                return BestHDgayporn.toSearchResult$lambda$0(this.f$0, posterUrl, (MovieSearchResponse) obj);
            }
        }, 8, (Object) null);
    }

    static final Unit toSearchResult$lambda$0(BestHDgayporn this$0, String $posterUrl, MovieSearchResponse $this$newMovieSearchResponse) {
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
        return MainAPIKt.newMovieSearchResponse$default(this, title, href, TvType.NSFW, false, new Function1() { // from class: com.BestHDgayporn.BestHDgayporn$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(Object obj) {
                return BestHDgayporn.toRecommendResult$lambda$0(this.f$0, posterUrl, (MovieSearchResponse) obj);
            }
        }, 8, (Object) null);
    }

    static final Unit toRecommendResult$lambda$0(BestHDgayporn this$0, String $posterUrl, MovieSearchResponse $this$newMovieSearchResponse) {
        $this$newMovieSearchResponse.setPosterUrl(MainAPIKt.fixUrlNull(this$0, $posterUrl));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [235=4] */
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
            boolean r2 = r1 instanceof com.BestHDgayporn.BestHDgayporn.C00041
            if (r2 == 0) goto L18
            r2 = r1
            com.BestHDgayporn.BestHDgayporn$search$1 r2 = (com.BestHDgayporn.BestHDgayporn.C00041) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.BestHDgayporn.BestHDgayporn$search$1 r2 = new com.BestHDgayporn.BestHDgayporn$search$1
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
            java.lang.String r6 = "/search-videos/?vi="
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
        throw new UnsupportedOperationException("Method not decompiled: com.BestHDgayporn.BestHDgayporn.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [256=4, 268=4, 95=5] */
    /* JADX WARN: Can't wrap try/catch for region: R(7:103|65|66|109|67|68|(1:70)(12:71|107|72|(4:75|(4:77|105|78|113)(2:79|112)|80|73)|111|81|82|92|(0)|95|53|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03cf, code lost:
    
        r5 = r45;
        r3 = r16;
        r2 = r19;
        r18 = r24;
        r7 = r28;
        r15 = r28;
        r12 = r30;
        r17 = r31;
        r19 = r32;
        r24 = r34;
        r11 = r36;
        r29 = r38;
        r9 = 0;
        r10 = r40;
        r1 = r46;
        r28 = r4;
        r4 = r22;
        r22 = r26;
        r26 = r37;
     */
    /* JADX WARN: Path cross not found for [B:25:0x0155, B:27:0x015b], limit reached: 119 */
    /* JADX WARN: Path cross not found for [B:30:0x0169, B:32:0x016f], limit reached: 119 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a3 A[LOOP:1: B:40:0x019d->B:42:0x01a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x035d A[Catch: all -> 0x03bc, TRY_LEAVE, TryCatch #3 {all -> 0x03bc, blocks: (B:72:0x0332, B:73:0x0357, B:75:0x035d), top: B:107:0x0332 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x047c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0271 -> B:93:0x0472). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x030c -> B:107:0x0332). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x03cf -> B:91:0x0445). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x03fc -> B:91:0x0445). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(@org.jetbrains.annotations.NotNull java.lang.String r45, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.LoadResponse> r46) {
        /*
            r44 = this;
            r1 = r46
            boolean r0 = r1 instanceof com.BestHDgayporn.BestHDgayporn.C00011
            if (r0 == 0) goto L18
            r0 = r1
            com.BestHDgayporn.BestHDgayporn$load$1 r0 = (com.BestHDgayporn.BestHDgayporn.C00011) r0
            int r2 = r0.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r0.label
            int r2 = r2 - r3
            r0.label = r2
            r2 = r44
            goto L1f
        L18:
            com.BestHDgayporn.BestHDgayporn$load$1 r0 = new com.BestHDgayporn.BestHDgayporn$load$1
            r2 = r44
            r0.<init>(r1)
        L1f:
            r3 = r0
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            r20 = 0
            r6 = 1
            switch(r0) {
                case 0: goto Lf6;
                case 1: goto Le2;
                case 2: goto L5e;
                case 3: goto L36;
                default: goto L2e;
            }
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            java.lang.Object r0 = r3.L$7
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r5 = r3.L$6
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r3.L$5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r3.L$4
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r3.L$3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r3.L$2
            org.jsoup.nodes.Document r9 = (org.jsoup.nodes.Document) r9
            java.lang.Object r10 = r3.L$1
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r11 = r3.L$0
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r4)
            r27 = r2
            r2 = r4
            goto L520
        L5e:
            int r8 = r3.I$4
            int r9 = r3.I$3
            int r10 = r3.I$2
            int r11 = r3.I$1
            int r12 = r3.I$0
            java.lang.Object r0 = r3.L$15
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r0 = r3.L$14
            r14 = r0
            org.jsoup.nodes.Element r14 = (org.jsoup.nodes.Element) r14
            java.lang.Object r15 = r3.L$13
            java.lang.Object r7 = r3.L$12
            java.lang.Object r0 = r3.L$11
            r17 = r0
            java.util.Iterator r17 = (java.util.Iterator) r17
            java.lang.Object r0 = r3.L$10
            r18 = r0
            java.lang.Iterable r18 = (java.lang.Iterable) r18
            java.lang.Object r0 = r3.L$9
            r19 = r0
            java.util.Collection r19 = (java.util.Collection) r19
            java.lang.Object r0 = r3.L$8
            r21 = r0
            java.lang.Iterable r21 = (java.lang.Iterable) r21
            java.lang.Object r0 = r3.L$7
            r22 = r0
            java.lang.Iterable r22 = (java.lang.Iterable) r22
            java.lang.Object r0 = r3.L$6
            r23 = r0
            java.util.List r23 = (java.util.List) r23
            java.lang.Object r0 = r3.L$5
            r24 = r0
            java.lang.String r24 = (java.lang.String) r24
            java.lang.Object r0 = r3.L$4
            r25 = r0
            java.lang.String r25 = (java.lang.String) r25
            java.lang.Object r0 = r3.L$3
            r26 = r0
            java.lang.String r26 = (java.lang.String) r26
            java.lang.Object r0 = r3.L$2
            r27 = r0
            org.jsoup.nodes.Document r27 = (org.jsoup.nodes.Document) r27
            java.lang.Object r0 = r3.L$1
            r28 = r0
            java.util.Map r28 = (java.util.Map) r28
            java.lang.Object r0 = r3.L$0
            r29 = r0
            java.lang.String r29 = (java.lang.String) r29
            kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Throwable -> Ld1
            r33 = r23
            r35 = r25
            r37 = r26
            r25 = r21
            r26 = r22
            r21 = 1
            r22 = r4
            goto L332
        Ld1:
            r0 = move-exception
            r33 = r27
            r27 = r2
            r2 = r33
            r33 = r23
            r35 = r25
            r25 = r21
            r21 = 1
            goto L445
        Le2:
            java.lang.Object r0 = r3.L$1
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r7 = r3.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r4)
            r17 = r3
            r22 = r4
            r1 = r5
            r2 = 0
            r21 = 1
            goto L145
        Lf6:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.String r0 = "User-Agent"
            java.lang.String r7 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:139.0) Gecko/20100101 Firefox/139.0"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r7)
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            com.lagradost.nicehttp.Requests r7 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r8 = r45
            r3.L$0 = r8
            r3.L$1 = r0
            r3.label = r6
            r9 = 1
            r6 = 0
            r17 = r3
            r3 = r7
            r7 = 0
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
            r18 = 1
            r15 = 0
            r19 = 0
            r16 = 0
            r21 = 1
            r18 = 4092(0xffc, float:5.734E-42)
            r22 = r19
            r19 = 0
            r1 = r5
            r2 = r22
            r5 = r0
            r22 = r4
            r4 = r45
            java.lang.Object r0 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r0 != r1) goto L141
            return r1
        L141:
            r7 = r45
            r4 = r0
            r0 = r5
        L145:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r3 = r4.getDocument()
            java.lang.String r4 = "meta[property='og:title']"
            org.jsoup.nodes.Element r4 = r3.selectFirst(r4)
            java.lang.String r5 = "content"
            if (r4 == 0) goto L15b
            java.lang.String r4 = r4.attr(r5)
            if (r4 != 0) goto L15f
        L15b:
            java.lang.String r4 = r3.title()
        L15f:
            java.lang.String r6 = "meta[property='og:image']"
            org.jsoup.nodes.Element r6 = r3.selectFirst(r6)
            java.lang.String r8 = ""
            if (r6 == 0) goto L16f
            java.lang.String r6 = r6.attr(r5)
            if (r6 != 0) goto L170
        L16f:
            r6 = r8
        L170:
            java.lang.String r9 = "meta[property='og:description']"
            org.jsoup.nodes.Element r9 = r3.selectFirst(r9)
            if (r9 == 0) goto L180
            java.lang.String r5 = r9.attr(r5)
            if (r5 != 0) goto L17f
            goto L180
        L17f:
            r8 = r5
        L180:
            java.lang.String r5 = "div.aiovg-item-tag a.aiovg-link-tag"
            org.jsoup.select.Elements r9 = r3.select(r5)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r10 = 0
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r9, r12)
            r11.<init>(r12)
            java.util.Collection r11 = (java.util.Collection) r11
            r12 = r9
            r13 = 0
            java.util.Iterator r14 = r12.iterator()
        L19d:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L1c0
            java.lang.Object r15 = r14.next()
            r16 = r15
            org.jsoup.nodes.Element r16 = (org.jsoup.nodes.Element) r16
            r18 = 0
            java.lang.String r19 = r16.text()
            java.lang.CharSequence r19 = (java.lang.CharSequence) r19
            java.lang.CharSequence r19 = kotlin.text.StringsKt.trim(r19)
            java.lang.String r2 = r19.toString()
            r11.add(r2)
            r2 = 0
            goto L19d
        L1c0:
            r2 = r11
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r9 = 0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Collection r10 = (java.util.Collection) r10
            r11 = r2
            r12 = 0
            java.util.Iterator r13 = r11.iterator()
        L1d6:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L1fa
            java.lang.Object r14 = r13.next()
            r15 = r14
            java.lang.String r15 = (java.lang.String) r15
            r16 = 0
            r18 = r15
            java.lang.CharSequence r18 = (java.lang.CharSequence) r18
            int r18 = r18.length()
            if (r18 <= 0) goto L1f2
            r18 = 1
            goto L1f4
        L1f2:
            r18 = 0
        L1f4:
            if (r18 == 0) goto L1d6
            r10.add(r14)
            goto L1d6
        L1fa:
            java.util.List r10 = (java.util.List) r10
            org.jsoup.select.Elements r2 = r3.select(r5)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r5 = 0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Collection r9 = (java.util.Collection) r9
            r11 = r2
            r12 = 0
            r13 = r11
            r14 = 0
            java.util.Iterator r15 = r13.iterator()
            r19 = r10
            r10 = r8
            r8 = r9
            r9 = r19
            r27 = r44
            r26 = r2
            r19 = r3
            r25 = r11
            r3 = r12
            r24 = r13
            r2 = r14
            r11 = r17
            r13 = r4
            r12 = r6
            r14 = r7
            r7 = r15
            r4 = r0
            r6 = r5
            r5 = r1
            r1 = r46
        L234:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L47c
            java.lang.Object r28 = r7.next()
            r29 = r28
            r15 = 0
            r45 = r5
            r5 = r29
            org.jsoup.nodes.Element r5 = (org.jsoup.nodes.Element) r5
            r46 = r1
            r1 = 0
            java.lang.String r0 = "href"
            java.lang.String r16 = r5.absUrl(r0)
            java.lang.CharSequence r16 = (java.lang.CharSequence) r16
            int r17 = r16.length()
            if (r17 != 0) goto L25b
            r17 = 1
            goto L25d
        L25b:
            r17 = 0
        L25d:
            if (r17 == 0) goto L265
            r16 = 0
            java.lang.String r16 = r5.attr(r0)
        L265:
            java.lang.String r16 = (java.lang.String) r16
            r0 = r16
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L27a
            r5 = r45
            r1 = r46
            r17 = r7
            r7 = 0
            goto L472
        L27a:
            com.lagradost.nicehttp.Requests r0 = com.lagradost.cloudstream3.MainActivityKt.getApp()     // Catch: java.lang.Throwable -> L3fb
            r11.L$0 = r14     // Catch: java.lang.Throwable -> L3fb
            r11.L$1 = r4     // Catch: java.lang.Throwable -> L3fb
            r17 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)     // Catch: java.lang.Throwable -> L3fb
            r11.L$2 = r0     // Catch: java.lang.Throwable -> L3fb
            r11.L$3 = r13     // Catch: java.lang.Throwable -> L3fb
            r11.L$4 = r12     // Catch: java.lang.Throwable -> L3fb
            r11.L$5 = r10     // Catch: java.lang.Throwable -> L3fb
            r11.L$6 = r9     // Catch: java.lang.Throwable -> L3fb
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)     // Catch: java.lang.Throwable -> L3fb
            r11.L$7 = r0     // Catch: java.lang.Throwable -> L3fb
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)     // Catch: java.lang.Throwable -> L3fb
            r11.L$8 = r0     // Catch: java.lang.Throwable -> L3fb
            r11.L$9 = r8     // Catch: java.lang.Throwable -> L3fb
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)     // Catch: java.lang.Throwable -> L3fb
            r11.L$10 = r0     // Catch: java.lang.Throwable -> L3fb
            r11.L$11 = r7     // Catch: java.lang.Throwable -> L3fb
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r28)     // Catch: java.lang.Throwable -> L3fb
            r11.L$12 = r0     // Catch: java.lang.Throwable -> L3fb
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r29)     // Catch: java.lang.Throwable -> L3fb
            r11.L$13 = r0     // Catch: java.lang.Throwable -> L3fb
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)     // Catch: java.lang.Throwable -> L3fb
            r11.L$14 = r0     // Catch: java.lang.Throwable -> L3fb
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)     // Catch: java.lang.Throwable -> L3fb
            r11.L$15 = r0     // Catch: java.lang.Throwable -> L3fb
            r11.I$0 = r6     // Catch: java.lang.Throwable -> L3fb
            r11.I$1 = r3     // Catch: java.lang.Throwable -> L3fb
            r11.I$2 = r2     // Catch: java.lang.Throwable -> L3fb
            r11.I$3 = r15     // Catch: java.lang.Throwable -> L3fb
            r11.I$4 = r1     // Catch: java.lang.Throwable -> L3fb
            r0 = 2
            r11.label = r0     // Catch: java.lang.Throwable -> L3fb
            r18 = r5
            r5 = 0
            r30 = r6
            r6 = 0
            r31 = r7
            r7 = 0
            r32 = r8
            r8 = 0
            r33 = r9
            r9 = 0
            r34 = r10
            r10 = 0
            r36 = r3
            r35 = r12
            r3 = r16
            r16 = r11
            r11 = 0
            r37 = r13
            r13 = 0
            r38 = r14
            r14 = 0
            r39 = r15
            r15 = 0
            r40 = r2
            r2 = r17
            r17 = 4092(0xffc, float:5.734E-42)
            r41 = r18
            r18 = 0
            r43 = r1
            r1 = r45
            r45 = r43
            java.lang.Object r0 = com.lagradost.nicehttp.Requests.get$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L3ce
            r11 = r16
            if (r0 != r1) goto L30c
            return r1
        L30c:
            r8 = r45
            r5 = r1
            r13 = r3
            r3 = r11
            r18 = r24
            r2 = r27
            r7 = r28
            r15 = r29
            r12 = r30
            r17 = r31
            r24 = r34
            r11 = r36
            r29 = r38
            r9 = r39
            r10 = r40
            r14 = r41
            r1 = r46
            r28 = r4
            r27 = r19
            r19 = r32
            r4 = r0
        L332:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4     // Catch: java.lang.Throwable -> L3bc
            org.jsoup.nodes.Document r0 = r4.getDocument()     // Catch: java.lang.Throwable -> L3bc
            java.lang.String r4 = "div.video-item, article.post, .aiovg-video"
            org.jsoup.select.Elements r4 = r0.select(r4)     // Catch: java.lang.Throwable -> L3bc
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L3bc
            r6 = 0
            java.util.ArrayList r16 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3bc
            r16.<init>()     // Catch: java.lang.Throwable -> L3bc
            java.util.Collection r16 = (java.util.Collection) r16     // Catch: java.lang.Throwable -> L3bc
            r45 = r16
            r16 = r4
            r30 = 0
            r31 = r16
            r32 = 0
            java.util.Iterator r34 = r31.iterator()     // Catch: java.lang.Throwable -> L3bc
        L357:
            boolean r36 = r34.hasNext()     // Catch: java.lang.Throwable -> L3bc
            if (r36 == 0) goto L38e
            java.lang.Object r36 = r34.next()     // Catch: java.lang.Throwable -> L3bc
            r38 = r36
            r39 = 0
            r40 = r38
            org.jsoup.nodes.Element r40 = (org.jsoup.nodes.Element) r40     // Catch: java.lang.Throwable -> L3bc
            r46 = r40
            r40 = 0
            r41 = r0
            r0 = r46
            com.lagradost.cloudstream3.SearchResponse r42 = r2.toRecommendResult(r0)     // Catch: java.lang.Throwable -> L3bc
            if (r42 == 0) goto L383
            r0 = r42
            r40 = 0
            r46 = r1
            r1 = r45
            r1.add(r0)     // Catch: java.lang.Throwable -> L3ac
            goto L387
        L383:
            r46 = r1
            r1 = r45
        L387:
            r45 = r1
            r0 = r41
            r1 = r46
            goto L357
        L38e:
            r41 = r0
            r46 = r1
            r1 = r45
            r0 = r1
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L3ac
            r1 = r46
            r4 = r7
            r7 = r0
            r0 = r2
            r6 = r12
            r16 = r15
            r12 = r35
            r15 = r9
            r2 = r10
            r10 = r24
            r9 = r33
            r24 = r18
            goto L45e
        L3ac:
            r0 = move-exception
            r1 = r27
            r27 = r2
            r2 = r1
            r1 = r46
            r4 = r22
            r22 = r26
            r26 = r37
            goto L445
        L3bc:
            r0 = move-exception
            r46 = r1
            r1 = r27
            r27 = r2
            r2 = r1
            r1 = r46
            r4 = r22
            r22 = r26
            r26 = r37
            goto L445
        L3ce:
            r0 = move-exception
            r11 = r16
            r8 = r45
            r5 = r1
            r13 = r3
            r3 = r11
            r2 = r19
            r18 = r24
            r7 = r28
            r15 = r29
            r12 = r30
            r17 = r31
            r19 = r32
            r24 = r34
            r11 = r36
            r29 = r38
            r9 = r39
            r10 = r40
            r14 = r41
            r1 = r46
            r28 = r4
            r4 = r22
            r22 = r26
            r26 = r37
            goto L445
        L3fb:
            r0 = move-exception
            r30 = r1
            r1 = r45
            r45 = r30
            r40 = r2
            r36 = r3
            r41 = r5
            r30 = r6
            r31 = r7
            r32 = r8
            r33 = r9
            r34 = r10
            r35 = r12
            r37 = r13
            r38 = r14
            r39 = r15
            r3 = r16
            r8 = r45
            r5 = r1
            r13 = r3
            r3 = r11
            r2 = r19
            r18 = r24
            r7 = r28
            r15 = r29
            r12 = r30
            r17 = r31
            r19 = r32
            r24 = r34
            r11 = r36
            r29 = r38
            r9 = r39
            r10 = r40
            r14 = r41
            r1 = r46
            r28 = r4
            r4 = r22
            r22 = r26
            r26 = r37
        L445:
            r37 = r26
            r0 = r27
            r27 = r2
            r26 = r22
            r22 = r4
            r4 = r7
            r7 = 0
            r6 = r12
            r16 = r15
            r12 = r35
            r15 = r9
            r2 = r10
            r10 = r24
            r9 = r33
            r24 = r18
        L45e:
            r8 = r11
            r11 = r3
            r3 = r8
            r8 = r28
            r28 = r4
            r4 = r8
            r8 = r19
            r19 = r27
            r14 = r29
            r13 = r37
            r27 = r0
            r29 = r16
        L472:
            if (r7 == 0) goto L478
            r0 = 0
            r8.add(r7)
        L478:
            r7 = r17
            goto L234
        L47c:
            r46 = r1
            r40 = r2
            r36 = r3
            r1 = r5
            r30 = r6
            r32 = r8
            r33 = r9
            r34 = r10
            r35 = r12
            r37 = r13
            r38 = r14
            r0 = r32
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.filterNotNull(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r16 = kotlin.collections.CollectionsKt.flatten(r0)
            r5 = r27
            com.lagradost.cloudstream3.MainAPI r5 = (com.lagradost.cloudstream3.MainAPI) r5
            com.lagradost.cloudstream3.TvType r8 = com.lagradost.cloudstream3.TvType.NSFW
            com.BestHDgayporn.BestHDgayporn$load$2 r12 = new com.BestHDgayporn.BestHDgayporn$load$2
            r17 = 0
            r15 = r33
            r14 = r34
            r13 = r35
            r12.<init>(r13, r14, r15, r16, r17)
            r10 = r12
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r38)
            r11.L$0 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r11.L$1 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)
            r11.L$2 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r37)
            r11.L$3 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r35)
            r11.L$4 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r34)
            r11.L$5 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r33)
            r11.L$6 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r11.L$7 = r0
            r2 = 0
            r11.L$8 = r2
            r11.L$9 = r2
            r11.L$10 = r2
            r11.L$11 = r2
            r11.L$12 = r2
            r11.L$13 = r2
            r11.L$14 = r2
            r11.L$15 = r2
            r0 = 3
            r11.label = r0
            r9 = r38
            r6 = r37
            r7 = r38
            java.lang.Object r0 = com.lagradost.cloudstream3.MainAPIKt.newMovieLoadResponse(r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r1) goto L50b
            return r1
        L50b:
            r1 = r46
            r2 = r0
            r10 = r4
            r3 = r11
            r0 = r16
            r9 = r19
            r4 = r22
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r37
            r11 = r38
        L520:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.BestHDgayporn.BestHDgayporn.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.BestHDgayporn.BestHDgayporn$load$2 */
    /* JADX INFO: compiled from: BestHDgayporn.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.BestHDgayporn.BestHDgayporn$load$2", f = "BestHDgayporn.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [136=6, 161=4, 292=4] */
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
            boolean r0 = r1 instanceof com.BestHDgayporn.BestHDgayporn.C00031
            if (r0 == 0) goto L1a
            r0 = r1
            com.BestHDgayporn.BestHDgayporn$loadLinks$1 r0 = (com.BestHDgayporn.BestHDgayporn.C00031) r0
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
            com.BestHDgayporn.BestHDgayporn$loadLinks$1 r0 = new com.BestHDgayporn.BestHDgayporn$loadLinks$1
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
            com.BestHDgayporn.BestHDgayporn$loadLinks$7$1 r8 = new com.BestHDgayporn.BestHDgayporn$loadLinks$7$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.BestHDgayporn.BestHDgayporn.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
