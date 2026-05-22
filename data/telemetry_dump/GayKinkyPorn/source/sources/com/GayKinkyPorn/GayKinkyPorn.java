package com.GayKinkyPorn;

import com.lagradost.cloudstream3.MainAPI;
import com.lagradost.cloudstream3.MainAPIKt;
import com.lagradost.cloudstream3.MainPageData;
import com.lagradost.cloudstream3.MovieLoadResponse;
import com.lagradost.cloudstream3.MovieSearchResponse;
import com.lagradost.cloudstream3.SearchResponse;
import com.lagradost.cloudstream3.TvType;
import com.lagradost.cloudstream3.VPNStatus;
import com.lagradost.cloudstream3.utils.ExtractorLink;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jsoup.nodes.Element;

/* JADX INFO: compiled from: GayKinkyPorn.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/GayKinkyPorn/classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010&\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0096@¢\u0006\u0002\u0010-J\f\u0010.\u001a\u00020/*\u000200H\u0002J\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020/0$2\u0006\u00102\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u00103J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u00103JF\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u000e2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0;2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020=0;H\u0096@¢\u0006\u0002\u0010@R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006A"}, d2 = {"Lcom/GayKinkyPorn/GayKinkyPorn;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "lang", "getLang", "setLang", "hasQuickSearch", "getHasQuickSearch", "hasChromecastSupport", "getHasChromecastSupport", "hasDownloadSupport", "getHasDownloadSupport", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lorg/jsoup/nodes/Element;", "search", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GayKinkyPorn"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGayKinkyPorn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GayKinkyPorn.kt\ncom/GayKinkyPorn/GayKinkyPorn\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1642#2,10:164\n1915#2:174\n1916#2:176\n1652#2:177\n1642#2,10:178\n1915#2:188\n1916#2:190\n1652#2:191\n1642#2,10:192\n1915#2:202\n1916#2:205\n1652#2:206\n1642#2,10:207\n1915#2:217\n1916#2:220\n1652#2:221\n1#3:175\n1#3:189\n1#3:203\n1#3:204\n1#3:218\n1#3:219\n*S KotlinDebug\n*F\n+ 1 GayKinkyPorn.kt\ncom/GayKinkyPorn/GayKinkyPorn\n*L\n50#1:164,10\n50#1:174\n50#1:176\n50#1:177\n77#1:178,10\n77#1:188\n77#1:190\n77#1:191\n100#1:192,10\n100#1:202\n100#1:205\n100#1:206\n144#1:207,10\n144#1:217\n144#1:220\n144#1:221\n50#1:175\n77#1:189\n100#1:204\n144#1:219\n*E\n"})
public final class GayKinkyPorn extends MainAPI {

    @NotNull
    private String mainUrl = "https://gaykinkyporn.com";

    @NotNull
    private String name = "GayKinkyPorn";
    private final boolean hasMainPage = true;

    @NotNull
    private String lang = "en";
    private final boolean hasQuickSearch = true;
    private final boolean hasChromecastSupport = true;
    private final boolean hasDownloadSupport = true;

    @NotNull
    private final Set<TvType> supportedTypes = SetsKt.setOf(TvType.NSFW);

    @NotNull
    private final VPNStatus vpnStatus = VPNStatus.MightBeNeeded;

    @NotNull
    private final List<MainPageData> mainPage = MainAPIKt.mainPageOf(new Pair[]{TuplesKt.to("?filter=latest", "Mới cập nhật"), TuplesKt.to("?filter=random", "Lộn xộn"), TuplesKt.to("category/studios/face-down-ass-up", "Mặt xuống đít lên"), TuplesKt.to("category/studios/fraternity-x", "Fraternity X"), TuplesKt.to("category/studios/sketchy-sex", "Sketchy"), TuplesKt.to("?s=sketchy", "Sketchy 𓀓𓂸"), TuplesKt.to("category/studios/bel-ami-online", "Bel Ami"), TuplesKt.to("category/studios/cum-dump-sluts", "Cum Dump Sluts"), TuplesKt.to("category/studios/lucas-entertainment", "Lucas Entertainment"), TuplesKt.to("category/categories/orgy", "Orgy"), TuplesKt.to("tag/gangbang", "Gang Bang"), TuplesKt.to("tag/group", "Đụ tập thể"), TuplesKt.to("tag/bareback", "Đụ không bao"), TuplesKt.to("tag/interracial", "Interracial"), TuplesKt.to("tag/latino", "Latino"), TuplesKt.to("tag/threesome", "Chơi ba vui vẻ")});

    /* JADX INFO: renamed from: com.GayKinkyPorn.GayKinkyPorn$getMainPage$1 */
    /* JADX INFO: compiled from: GayKinkyPorn.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GayKinkyPorn.GayKinkyPorn", f = "GayKinkyPorn.kt", i = {0, 0, 0}, l = {49}, m = "getMainPage", n = {"request", "pageUrl", "page"}, nl = {50}, s = {"L$0", "L$1", "I$0"}, v = 2)
    static final class C00031 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C00031(Continuation<? super C00031> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GayKinkyPorn.this.getMainPage(0, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.GayKinkyPorn.GayKinkyPorn$load$1 */
    /* JADX INFO: compiled from: GayKinkyPorn.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GayKinkyPorn.GayKinkyPorn", f = "GayKinkyPorn.kt", i = {0, 1, 1, 1, 1, 1, 1}, l = {87, 125}, m = "load", n = {"url", "url", "document", "title", "poster", "description", "recommendations"}, nl = {89, -1}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
    static final class C00041 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C00041(Continuation<? super C00041> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GayKinkyPorn.this.load(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.GayKinkyPorn.GayKinkyPorn$loadLinks$1 */
    /* JADX INFO: compiled from: GayKinkyPorn.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GayKinkyPorn.GayKinkyPorn", f = "GayKinkyPorn.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {139, 153}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "isCasting", "data", "subtitleCallback", "callback", "document", "videoUrls", "downloadUrl", "url", "isCasting", "found"}, nl = {140, 158}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "Z$0", "I$0"}, v = 2)
    static final class C00061 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C00061(Continuation<? super C00061> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GayKinkyPorn.this.loadLinks(null, false, null, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.GayKinkyPorn.GayKinkyPorn$search$1 */
    /* JADX INFO: compiled from: GayKinkyPorn.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GayKinkyPorn.GayKinkyPorn", f = "GayKinkyPorn.kt", i = {0, 0, 0}, l = {76}, m = "search", n = {"query", "searchResponse", "i"}, nl = {77}, s = {"L$0", "L$1", "I$0"}, v = 2)
    static final class C00071 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C00071(Continuation<? super C00071> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GayKinkyPorn.this.search(null, (Continuation) this);
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

    @NotNull
    public String getLang() {
        return this.lang;
    }

    public void setLang(@NotNull String str) {
        this.lang = str;
    }

    public boolean getHasQuickSearch() {
        return this.hasQuickSearch;
    }

    public boolean getHasChromecastSupport() {
        return this.hasChromecastSupport;
    }

    public boolean getHasDownloadSupport() {
        return this.hasDownloadSupport;
    }

    @NotNull
    public Set<TvType> getSupportedTypes() {
        return this.supportedTypes;
    }

    @NotNull
    public VPNStatus getVpnStatus() {
        return this.vpnStatus;
    }

    @NotNull
    public List<MainPageData> getMainPage() {
        return this.mainPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [173=4] */
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
            boolean r3 = r2 instanceof com.GayKinkyPorn.GayKinkyPorn.C00031
            if (r3 == 0) goto L1a
            r3 = r2
            com.GayKinkyPorn.GayKinkyPorn$getMainPage$1 r3 = (com.GayKinkyPorn.GayKinkyPorn.C00031) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.GayKinkyPorn.GayKinkyPorn$getMainPage$1 r3 = new com.GayKinkyPorn.GayKinkyPorn$getMainPage$1
            r3.<init>(r2)
        L1f:
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r3.label
            r7 = 1
            switch(r6) {
                case 0: goto L46;
                case 1: goto L33;
                default: goto L2b;
            }
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            int r1 = r3.I$0
            java.lang.Object r5 = r3.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r3.L$0
            com.lagradost.cloudstream3.MainPageRequest r6 = (com.lagradost.cloudstream3.MainPageRequest) r6
            kotlin.ResultKt.throwOnFailure(r4)
            r18 = r3
            r3 = r4
            r2 = 1
            goto Le0
        L46:
            kotlin.ResultKt.throwOnFailure(r4)
            r6 = 47
            if (r1 != r7) goto L6b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r0.getMainUrl()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r8 = r25.getData()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            goto L92
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r0.getMainUrl()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r8 = r25.getData()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = "/page/"
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
        L92:
            r8 = r4
            com.lagradost.nicehttp.Requests r4 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r9 = r25
            r3.L$0 = r9
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r3.L$1 = r10
            r3.I$0 = r1
            r3.label = r7
            r10 = r5
            r5 = r6
            r6 = 0
            r11 = 1
            r7 = 0
            r12 = r8
            r8 = 0
            r9 = 0
            r13 = r10
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
            r19 = 4094(0xffe, float:5.737E-42)
            r22 = 1
            r20 = 0
            r1 = r18
            r18 = r3
            r3 = r1
            r1 = r21
            r2 = 1
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            if (r4 != r1) goto Ldc
            return r1
        Ldc:
            r1 = r24
            r6 = r25
        Le0:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r4 = r4.getDocument()
            java.lang.String r7 = "article.loop-video.thumb-block"
            org.jsoup.select.Elements r7 = r4.select(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r8 = 0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Collection r9 = (java.util.Collection) r9
            r10 = r7
            r11 = 0
            r12 = r10
            r13 = 0
            java.util.Iterator r14 = r12.iterator()
        Lfe:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L11f
            java.lang.Object r15 = r14.next()
            r16 = r15
            r17 = 0
            r2 = r16
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            r19 = 0
            com.lagradost.cloudstream3.SearchResponse r2 = r0.toSearchResult(r2)
            if (r2 == 0) goto L11d
            r19 = 0
            r9.add(r2)
        L11d:
            r2 = 1
            goto Lfe
        L11f:
            r2 = r9
            java.util.List r2 = (java.util.List) r2
            com.lagradost.cloudstream3.HomePageList r7 = new com.lagradost.cloudstream3.HomePageList
            java.lang.String r8 = r6.getName()
            r14 = 1
            r7.<init>(r8, r2, r14)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r14)
            com.lagradost.cloudstream3.HomePageResponse r7 = com.lagradost.cloudstream3.MainAPIKt.newHomePageResponse(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.GayKinkyPorn.GayKinkyPorn.getMainPage(int, com.lagradost.cloudstream3.MainPageRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final SearchResponse toSearchResult(Element $this$toSearchResult) {
        String title = $this$toSearchResult.select("header.entry-header span").text();
        String href = MainAPIKt.fixUrl(this, $this$toSearchResult.select("a").attr("href"));
        final String posterUrl = MainAPIKt.fixUrlNull(this, $this$toSearchResult.select("img.video-main-thumb").attr("src"));
        return MainAPIKt.newMovieSearchResponse$default(this, title, href, TvType.NSFW, false, new Function1() { // from class: com.GayKinkyPorn.GayKinkyPorn$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(Object obj) {
                return GayKinkyPorn.toSearchResult$lambda$0(posterUrl, (MovieSearchResponse) obj);
            }
        }, 8, (Object) null);
    }

    static final Unit toSearchResult$lambda$0(String $posterUrl, MovieSearchResponse $this$newMovieSearchResponse) {
        $this$newMovieSearchResponse.setPosterUrl($posterUrl);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [187=4] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00ca -> B:20:0x00d3). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object search(@org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.SearchResponse>> r28) {
        /*
            r26 = this;
            r0 = r28
            boolean r1 = r0 instanceof com.GayKinkyPorn.GayKinkyPorn.C00071
            if (r1 == 0) goto L18
            r1 = r0
            com.GayKinkyPorn.GayKinkyPorn$search$1 r1 = (com.GayKinkyPorn.GayKinkyPorn.C00071) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            r2 = r26
            goto L1f
        L18:
            com.GayKinkyPorn.GayKinkyPorn$search$1 r1 = new com.GayKinkyPorn.GayKinkyPorn$search$1
            r2 = r26
            r1.<init>(r0)
        L1f:
            java.lang.Object r3 = r1.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r1.label
            switch(r5) {
                case 0: goto L48;
                case 1: goto L32;
                default: goto L2a;
            }
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r3)
            throw r1
        L32:
            int r5 = r1.I$0
            java.lang.Object r6 = r1.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r1
            r20 = r3
            r1 = r0
            r0 = r7
            r7 = r2
            goto Ld3
        L48:
            kotlin.ResultKt.throwOnFailure(r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r5 = (java.util.List) r5
            r6 = 1
            r20 = r6
            r6 = r5
            r5 = r20
            r21 = r2
            r20 = r3
            r3 = r1
            r1 = r0
            r0 = r27
        L60:
            r7 = 6
            if (r5 >= r7) goto L13a
            com.lagradost.nicehttp.Requests r7 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r21.getMainUrl()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = "/page/"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r5)
            java.lang.String r9 = "/?s="
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            r3.L$0 = r0
            r3.L$1 = r6
            r3.I$0 = r5
            r9 = 1
            r3.label = r9
            r9 = r5
            r5 = 0
            r10 = r6
            r6 = 0
            r17 = r3
            r3 = r7
            r7 = 0
            r11 = r4
            r4 = r8
            r8 = 0
            r12 = r9
            r9 = 0
            r13 = r10
            r10 = 0
            r14 = r11
            r11 = 0
            r15 = r12
            r16 = r13
            r12 = 0
            r18 = r14
            r14 = 0
            r19 = r15
            r15 = 0
            r22 = r16
            r16 = 0
            r23 = r18
            r18 = 4094(0xffe, float:5.737E-42)
            r24 = r19
            r19 = 0
            r25 = r23
            r23 = r0
            r0 = r25
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r3 != r0) goto Lca
            return r0
        Lca:
            r4 = r0
            r7 = r21
            r6 = r22
            r0 = r23
            r5 = r24
        Ld3:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r3 = r3.getDocument()
            java.lang.String r8 = "article.loop-video"
            org.jsoup.select.Elements r8 = r3.select(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r9 = 0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Collection r10 = (java.util.Collection) r10
            r11 = r8
            r12 = 0
            r13 = r11
            r14 = 0
            java.util.Iterator r15 = r13.iterator()
        Lf1:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L115
            java.lang.Object r16 = r15.next()
            r18 = r16
            r19 = 0
            r27 = r0
            r0 = r18
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            r21 = 0
            com.lagradost.cloudstream3.SearchResponse r0 = r7.toSearchResult(r0)
            if (r0 == 0) goto L112
            r21 = 0
            r10.add(r0)
        L112:
            r0 = r27
            goto Lf1
        L115:
            r27 = r0
            r0 = r10
            java.util.List r0 = (java.util.List) r0
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L133
            r8 = r0
            java.util.Collection r8 = (java.util.Collection) r8
            r6.addAll(r8)
            int r5 = r5 + 1
            r21 = r7
            r3 = r17
            r0 = r27
            goto L60
        L133:
            r0 = r27
            r21 = r7
            r3 = r17
            goto L142
        L13a:
            r23 = r0
            r17 = r3
            r24 = r5
            r22 = r6
        L142:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.GayKinkyPorn.GayKinkyPorn.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [201=4, 203=6, 103=5, 112=4] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0273 A[Catch: Exception -> 0x02c3, TryCatch #3 {Exception -> 0x02c3, blocks: (B:105:0x0247, B:107:0x024f, B:111:0x0261, B:118:0x0273, B:120:0x0279, B:122:0x0281, B:125:0x0290, B:130:0x029f), top: B:154:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0327 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ed A[PHI: r2
      0x01ed: PHI (r2v25 'it' java.lang.String) = (r2v12 'it' java.lang.String), (r2v16 'it' java.lang.String), (r2v20 'it' java.lang.String) binds: [B:67:0x01a9, B:72:0x01c1, B:80:0x01dd] A[DONT_GENERATE, DONT_INLINE]] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(@org.jetbrains.annotations.NotNull java.lang.String r37, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.LoadResponse> r38) {
        /*
            r36 = this;
            r1 = r36
            r2 = r38
            java.lang.String r3 = "img"
            boolean r0 = r2 instanceof com.GayKinkyPorn.GayKinkyPorn.C00041
            if (r0 == 0) goto L1a
            r0 = r2
            com.GayKinkyPorn.GayKinkyPorn$load$1 r0 = (com.GayKinkyPorn.GayKinkyPorn.C00041) r0
            int r4 = r0.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r0.label
            int r4 = r4 - r5
            r0.label = r4
            goto L1f
        L1a:
            com.GayKinkyPorn.GayKinkyPorn$load$1 r0 = new com.GayKinkyPorn.GayKinkyPorn$load$1
            r0.<init>(r2)
        L1f:
            r10 = r0
            java.lang.Object r4 = r10.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r10.label
            r6 = 1
            switch(r0) {
                case 0: goto L63;
                case 1: goto L55;
                case 2: goto L34;
                default: goto L2c;
            }
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            java.lang.Object r0 = r10.L$5
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r10.L$4
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r10.L$3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r10.L$1
            org.jsoup.nodes.Document r7 = (org.jsoup.nodes.Document) r7
            java.lang.Object r8 = r10.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.throwOnFailure(r4)
            r22 = r4
            r18 = r10
            goto L32e
        L55:
            java.lang.Object r0 = r10.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r4)
            r6 = r0
            r22 = r4
            r1 = r5
            r21 = 1
            goto La5
        L63:
            kotlin.ResultKt.throwOnFailure(r4)
            r7 = r4
            com.lagradost.nicehttp.Requests r4 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r0 = r37
            r10.L$0 = r0
            r10.label = r6
            r8 = 1
            r6 = 0
            r9 = r7
            r7 = 0
            r11 = 1
            r8 = 0
            r12 = r9
            r9 = 0
            r18 = r10
            r10 = 0
            r13 = 1
            r11 = 0
            r14 = r12
            r12 = 0
            r15 = r14
            r16 = 1
            r13 = 0
            r17 = r15
            r15 = 0
            r19 = 1
            r16 = 0
            r20 = r17
            r17 = 0
            r21 = 1
            r19 = 4094(0xffe, float:5.737E-42)
            r22 = r20
            r20 = 0
            r1 = r5
            r5 = r0
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            r10 = r18
            if (r4 != r1) goto La3
            return r1
        La3:
            r6 = r37
        La5:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r11 = r4.getDocument()
            java.lang.String r0 = "h1.entry-title"
            org.jsoup.nodes.Element r0 = r11.selectFirst(r0)
            java.lang.String r4 = "content"
            if (r0 == 0) goto Lca
            java.lang.String r0 = r0.text()
            if (r0 == 0) goto Lca
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto Lc8
            goto Lca
        Lc8:
            r5 = r0
            goto Le8
        Lca:
            java.lang.String r0 = "meta[property=og:title]"
            org.jsoup.nodes.Element r0 = r11.selectFirst(r0)
            if (r0 == 0) goto Le4
            java.lang.String r0 = r0.attr(r4)
            if (r0 == 0) goto Le4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r0)
            java.lang.String r0 = r0.toString()
            r5 = r0
            goto Le8
        Le4:
            java.lang.String r0 = ""
            r5 = r0
        Le8:
            java.lang.String r0 = "meta[itemprop=thumbnailUrl]"
            org.jsoup.nodes.Element r0 = r11.selectFirst(r0)
            if (r0 == 0) goto L103
            java.lang.String r0 = r0.attr(r4)
            if (r0 == 0) goto L103
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L11d
        L103:
            java.lang.String r0 = "meta[property=og:image]"
            org.jsoup.nodes.Element r0 = r11.selectFirst(r0)
            if (r0 == 0) goto L11c
            java.lang.String r0 = r0.attr(r4)
            if (r0 == 0) goto L11c
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r0)
            java.lang.String r0 = r0.toString()
            goto L11d
        L11c:
            r0 = 0
        L11d:
            r12 = r0
            java.lang.String r0 = "meta[itemprop=description]"
            org.jsoup.nodes.Element r0 = r11.selectFirst(r0)
            if (r0 == 0) goto L138
            java.lang.String r0 = r0.attr(r4)
            if (r0 == 0) goto L138
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L152
        L138:
            java.lang.String r0 = "meta[property=og:description]"
            org.jsoup.nodes.Element r0 = r11.selectFirst(r0)
            if (r0 == 0) goto L151
            java.lang.String r0 = r0.attr(r4)
            if (r0 == 0) goto L151
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r0)
            java.lang.String r0 = r0.toString()
            goto L152
        L151:
            r0 = 0
        L152:
            r13 = r0
            java.lang.String r0 = ".under-video-block article.loop-video"
            org.jsoup.select.Elements r0 = r11.select(r0)
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r8 = 0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9 = r0
            java.util.Collection r9 = (java.util.Collection) r9
            r14 = r4
            r15 = 0
            r16 = r14
            r17 = 0
            java.util.Iterator r18 = r16.iterator()
        L16f:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L2de
            java.lang.Object r19 = r18.next()
            r20 = r19
            r23 = 0
            r7 = r20
            org.jsoup.nodes.Element r7 = (org.jsoup.nodes.Element) r7
            r24 = 0
            java.lang.String r0 = "a"
            org.jsoup.nodes.Element r0 = r7.selectFirst(r0)     // Catch: java.lang.Exception -> L2c9
            if (r0 != 0) goto L193
            r34 = r4
            r35 = r5
            r4 = 0
            goto L2d0
        L193:
            java.lang.String r2 = "title"
            java.lang.String r2 = r0.attr(r2)     // Catch: java.lang.Exception -> L2c9
            r25 = r2
            r26 = 0
            r27 = r25
            java.lang.CharSequence r27 = (java.lang.CharSequence) r27     // Catch: java.lang.Exception -> L2c9
            boolean r27 = kotlin.text.StringsKt.isBlank(r27)     // Catch: java.lang.Exception -> L2c9
            if (r27 != 0) goto L1a8
            goto L1a9
        L1a8:
            r2 = 0
        L1a9:
            if (r2 != 0) goto L1ed
            java.lang.String r2 = "data-title"
            java.lang.String r2 = r0.attr(r2)     // Catch: java.lang.Exception -> L1e6
            r25 = r2
            r26 = 0
            r27 = r25
            java.lang.CharSequence r27 = (java.lang.CharSequence) r27     // Catch: java.lang.Exception -> L1e6
            boolean r27 = kotlin.text.StringsKt.isBlank(r27)     // Catch: java.lang.Exception -> L1e6
            if (r27 != 0) goto L1c0
            goto L1c1
        L1c0:
            r2 = 0
        L1c1:
            if (r2 != 0) goto L1ed
            java.lang.String r2 = "header.entry-header span"
            org.jsoup.nodes.Element r2 = r0.selectFirst(r2)     // Catch: java.lang.Exception -> L1e6
            if (r2 == 0) goto L1dc
            java.lang.String r2 = r2.text()     // Catch: java.lang.Exception -> L1e6
            if (r2 == 0) goto L1dc
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch: java.lang.Exception -> L1e6
            java.lang.CharSequence r2 = kotlin.text.StringsKt.trim(r2)     // Catch: java.lang.Exception -> L1e6
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L1e6
            goto L1dd
        L1dc:
            r2 = 0
        L1dd:
            if (r2 != 0) goto L1ed
            r34 = r4
            r35 = r5
            r4 = 0
            goto L2d0
        L1e6:
            r0 = move-exception
            r34 = r4
            r35 = r5
            goto L2ce
        L1ed:
            r26 = r2
            java.lang.String r2 = "href"
            java.lang.String r2 = r0.attr(r2)     // Catch: java.lang.Exception -> L2c9
            r25 = r2
            r27 = 0
            r28 = r25
            java.lang.CharSequence r28 = (java.lang.CharSequence) r28     // Catch: java.lang.Exception -> L2c9
            boolean r28 = kotlin.text.StringsKt.isBlank(r28)     // Catch: java.lang.Exception -> L2c9
            if (r28 != 0) goto L204
            goto L205
        L204:
            r2 = 0
        L205:
            if (r2 != 0) goto L20e
            r34 = r4
            r35 = r5
            r4 = 0
            goto L2d0
        L20e:
            r33 = r0
            r0 = r36
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0     // Catch: java.lang.Exception -> L2c9
            r34 = r4
            java.lang.String r4 = "data-main-thumb"
            java.lang.String r4 = r7.attr(r4)     // Catch: java.lang.Exception -> L2c5
            r25 = r4
            r27 = 0
            r28 = r25
            java.lang.CharSequence r28 = (java.lang.CharSequence) r28     // Catch: java.lang.Exception -> L2c5
            boolean r28 = kotlin.text.StringsKt.isBlank(r28)     // Catch: java.lang.Exception -> L2c5
            r29 = 0
            if (r28 != 0) goto L22f
            r28 = 1
            goto L231
        L22f:
            r28 = 0
        L231:
            java.lang.Boolean r25 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r28)     // Catch: java.lang.Exception -> L2c5
            boolean r25 = r25.booleanValue()     // Catch: java.lang.Exception -> L2c5
            if (r25 == 0) goto L23c
            goto L23d
        L23c:
            r4 = 0
        L23d:
            if (r4 != 0) goto L29d
            org.jsoup.nodes.Element r4 = r7.selectFirst(r3)     // Catch: java.lang.Exception -> L2c5
            if (r4 == 0) goto L26e
            r35 = r5
            java.lang.String r5 = "src"
            java.lang.String r4 = r4.attr(r5)     // Catch: java.lang.Exception -> L2c3
            if (r4 == 0) goto L270
            r5 = r4
            r25 = 0
            r27 = r5
            java.lang.CharSequence r27 = (java.lang.CharSequence) r27     // Catch: java.lang.Exception -> L2c3
            boolean r27 = kotlin.text.StringsKt.isBlank(r27)     // Catch: java.lang.Exception -> L2c3
            if (r27 != 0) goto L25f
            r27 = 1
            goto L261
        L25f:
            r27 = 0
        L261:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r27)     // Catch: java.lang.Exception -> L2c3
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Exception -> L2c3
            if (r5 == 0) goto L26c
            goto L271
        L26c:
            r4 = 0
            goto L271
        L26e:
            r35 = r5
        L270:
            r4 = 0
        L271:
            if (r4 != 0) goto L29f
            org.jsoup.nodes.Element r4 = r7.selectFirst(r3)     // Catch: java.lang.Exception -> L2c3
            if (r4 == 0) goto L29b
            java.lang.String r5 = "data-src"
            java.lang.String r4 = r4.attr(r5)     // Catch: java.lang.Exception -> L2c3
            if (r4 == 0) goto L29b
            r5 = r4
            r25 = 0
            r27 = r5
            java.lang.CharSequence r27 = (java.lang.CharSequence) r27     // Catch: java.lang.Exception -> L2c3
            boolean r27 = kotlin.text.StringsKt.isBlank(r27)     // Catch: java.lang.Exception -> L2c3
            if (r27 != 0) goto L290
            r29 = 1
        L290:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r29)     // Catch: java.lang.Exception -> L2c3
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Exception -> L2c3
            if (r5 == 0) goto L29b
            goto L29f
        L29b:
            r4 = 0
            goto L29f
        L29d:
            r35 = r5
        L29f:
            java.lang.String r0 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r0, r4)     // Catch: java.lang.Exception -> L2c3
            r25 = r36
            com.lagradost.cloudstream3.MainAPI r25 = (com.lagradost.cloudstream3.MainAPI) r25     // Catch: java.lang.Exception -> L2c3
            r4 = r36
            com.lagradost.cloudstream3.MainAPI r4 = (com.lagradost.cloudstream3.MainAPI) r4     // Catch: java.lang.Exception -> L2c3
            java.lang.String r27 = com.lagradost.cloudstream3.MainAPIKt.fixUrl(r4, r2)     // Catch: java.lang.Exception -> L2c3
            com.lagradost.cloudstream3.TvType r28 = com.lagradost.cloudstream3.TvType.NSFW     // Catch: java.lang.Exception -> L2c3
            com.GayKinkyPorn.GayKinkyPorn$$ExternalSyntheticLambda0 r4 = new com.GayKinkyPorn.GayKinkyPorn$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> L2c3
            r4.<init>()     // Catch: java.lang.Exception -> L2c3
            r31 = 8
            r32 = 0
            r29 = 0
            r30 = r4
            com.lagradost.cloudstream3.MovieSearchResponse r4 = com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse$default(r25, r26, r27, r28, r29, r30, r31, r32)     // Catch: java.lang.Exception -> L2c3
            goto L2cf
        L2c3:
            r0 = move-exception
            goto L2ce
        L2c5:
            r0 = move-exception
            r35 = r5
            goto L2ce
        L2c9:
            r0 = move-exception
            r34 = r4
            r35 = r5
        L2ce:
            r4 = 0
        L2cf:
        L2d0:
            if (r4 == 0) goto L2d6
            r0 = 0
            r9.add(r4)
        L2d6:
            r2 = r38
            r4 = r34
            r5 = r35
            goto L16f
        L2de:
            r34 = r4
            r35 = r5
            r0 = r9
            java.util.List r0 = (java.util.List) r0
            r4 = r36
            com.lagradost.cloudstream3.MainAPI r4 = (com.lagradost.cloudstream3.MainAPI) r4
            com.lagradost.cloudstream3.TvType r7 = com.lagradost.cloudstream3.TvType.NSFW
            com.GayKinkyPorn.GayKinkyPorn$load$2 r2 = new com.GayKinkyPorn.GayKinkyPorn$load$2
            r3 = 0
            r2.<init>(r12, r13, r0, r3)
            r9 = r2
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r10.L$0 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r10.L$1 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r35)
            r10.L$2 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r10.L$3 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r10.L$4 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r10.L$5 = r2
            r2 = 2
            r10.label = r2
            r8 = r6
            java.lang.Object r4 = com.lagradost.cloudstream3.MainAPIKt.newMovieLoadResponse(r4, r5, r6, r7, r8, r9, r10)
            r18 = r10
            if (r4 != r1) goto L328
            return r1
        L328:
            r8 = r6
            r7 = r11
            r5 = r12
            r3 = r13
            r6 = r35
        L32e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.GayKinkyPorn.GayKinkyPorn.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit load$lambda$0$6(String $recPoster, MovieSearchResponse $this$newMovieSearchResponse) {
        $this$newMovieSearchResponse.setPosterUrl($recPoster);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.GayKinkyPorn.GayKinkyPorn$load$2 */
    /* JADX INFO: compiled from: GayKinkyPorn.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GayKinkyPorn.GayKinkyPorn$load$2", f = "GayKinkyPorn.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00052 extends SuspendLambda implements Function2<MovieLoadResponse, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $description;
        final /* synthetic */ String $poster;
        final /* synthetic */ List<MovieSearchResponse> $recommendations;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00052(String str, String str2, List<MovieSearchResponse> list, Continuation<? super C00052> continuation) {
            super(2, continuation);
            this.$poster = str;
            this.$description = str2;
            this.$recommendations = list;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00052 = new C00052(this.$poster, this.$description, this.$recommendations, continuation);
            c00052.L$0 = obj;
            return c00052;
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [216=4] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x01bf -> B:45:0x01c3). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadLinks(@org.jetbrains.annotations.NotNull java.lang.String r29, boolean r30, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r31, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r32, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r33) {
        /*
            r28 = this;
            r0 = r33
            boolean r1 = r0 instanceof com.GayKinkyPorn.GayKinkyPorn.C00061
            if (r1 == 0) goto L18
            r1 = r0
            com.GayKinkyPorn.GayKinkyPorn$loadLinks$1 r1 = (com.GayKinkyPorn.GayKinkyPorn.C00061) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            r2 = r28
            goto L1f
        L18:
            com.GayKinkyPorn.GayKinkyPorn$loadLinks$1 r1 = new com.GayKinkyPorn.GayKinkyPorn$loadLinks$1
            r2 = r28
            r1.<init>(r0)
        L1f:
            java.lang.Object r3 = r1.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r1.label
            r20 = 0
            r6 = 1
            switch(r5) {
                case 0: goto L79;
                case 1: goto L62;
                case 2: goto L37;
                default: goto L2d;
            }
        L2d:
            r17 = r1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            int r5 = r1.I$0
            boolean r7 = r1.Z$0
            java.lang.Object r8 = r1.L$7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r1.L$6
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r1.L$5
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r1.L$4
            java.util.Set r11 = (java.util.Set) r11
            java.lang.Object r12 = r1.L$3
            org.jsoup.nodes.Document r12 = (org.jsoup.nodes.Document) r12
            java.lang.Object r13 = r1.L$2
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            java.lang.Object r14 = r1.L$1
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            java.lang.Object r15 = r1.L$0
            java.lang.String r15 = (java.lang.String) r15
            kotlin.ResultKt.throwOnFailure(r3)
            r6 = r2
            r2 = r3
            goto L1c3
        L62:
            boolean r5 = r1.Z$0
            java.lang.Object r7 = r1.L$2
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r8 = r1.L$1
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r9 = r1.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r1
            r21 = r3
            r1 = r4
            goto Lc7
        L79:
            kotlin.ResultKt.throwOnFailure(r3)
            r5 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r7 = r29
            r1.L$0 = r7
            r8 = r31
            r1.L$1 = r8
            r9 = r32
            r1.L$2 = r9
            r10 = r30
            r1.Z$0 = r10
            r1.label = r6
            r11 = r5
            r5 = 0
            r12 = 1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = r11
            r11 = 0
            r14 = r13
            r15 = 1
            r12 = 0
            r16 = r14
            r14 = 0
            r17 = 1
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r18
            r18 = 4094(0xffe, float:5.737E-42)
            r21 = r19
            r19 = 0
            r17 = r1
            r1 = r4
            r4 = r29
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r3 != r1) goto Lbf
            return r1
        Lbf:
            r9 = r29
            r5 = r30
            r8 = r31
            r7 = r32
        Lc7:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r3 = r3.getDocument()
            r4 = 0
            java.lang.String r6 = "div.responsive-player iframe"
            org.jsoup.select.Elements r6 = r3.select(r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r10 = 0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Collection r11 = (java.util.Collection) r11
            r12 = r6
            r13 = 0
            r14 = r12
            r15 = 0
            java.util.Iterator r16 = r14.iterator()
        Le7:
            boolean r18 = r16.hasNext()
            r19 = 0
            if (r18 == 0) goto L13b
            java.lang.Object r18 = r16.next()
            r22 = r18
            r23 = 0
            r0 = r22
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            r24 = 0
            r25 = r1
            java.lang.String r1 = "src"
            java.lang.String r1 = r0.attr(r1)
            r29 = r1
            r26 = 0
            r27 = r29
            java.lang.CharSequence r27 = (java.lang.CharSequence) r27
            boolean r27 = kotlin.text.StringsKt.isBlank(r27)
            if (r27 != 0) goto L123
            r30 = r0
            java.lang.String r0 = "#"
            r31 = r1
            r1 = r29
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L129
            r0 = 1
            goto L12a
        L123:
            r30 = r0
            r31 = r1
            r1 = r29
        L129:
            r0 = 0
        L12a:
            if (r0 == 0) goto L12e
            r19 = r31
        L12e:
            if (r19 == 0) goto L136
            r0 = r19
            r1 = 0
            r11.add(r0)
        L136:
            r0 = r33
            r1 = r25
            goto Le7
        L13b:
            r25 = r1
            r0 = r11
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = kotlin.collections.CollectionsKt.toMutableSet(r0)
            java.lang.String r1 = "a#tracking-url"
            org.jsoup.nodes.Element r1 = r3.selectFirst(r1)
            if (r1 == 0) goto L157
            java.lang.String r6 = "href"
            java.lang.String r19 = r1.attr(r6)
        L157:
            if (r19 == 0) goto L163
            r1 = r19
            r6 = 0
            boolean r1 = r0.add(r1)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
        L163:
            java.util.Iterator r1 = r0.iterator()
            r11 = r0
            r6 = r2
            r12 = r3
            r13 = r7
            r14 = r8
            r15 = r9
            r10 = r19
            r3 = r21
            r0 = r33
            r9 = r1
            r7 = r5
            r1 = r17
            r5 = r4
            r4 = r25
        L17a:
            boolean r8 = r9.hasNext()
            if (r8 == 0) goto L1d4
            java.lang.Object r8 = r9.next()
            java.lang.String r8 = (java.lang.String) r8
            r29 = r0
            com.GayKinkyPorn.GayKinkyPorn$$ExternalSyntheticLambda2 r0 = new com.GayKinkyPorn.GayKinkyPorn$$ExternalSyntheticLambda2
            r0.<init>()
            r1.L$0 = r15
            r1.L$1 = r14
            r1.L$2 = r13
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r1.L$3 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r1.L$4 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r1.L$5 = r2
            r1.L$6 = r9
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r1.L$7 = r2
            r1.Z$0 = r7
            r1.I$0 = r5
            r2 = 2
            r1.label = r2
            java.lang.Object r0 = com.lagradost.cloudstream3.utils.ExtractorApiKt.loadExtractor(r8, r15, r14, r0, r1)
            if (r0 != r4) goto L1bf
            return r4
        L1bf:
            r2 = r3
            r3 = r0
            r0 = r29
        L1c3:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L1d0
            r5 = 1
            r3 = r2
            r2 = r28
            goto L17a
        L1d0:
            r3 = r2
            r2 = r28
            goto L17a
        L1d4:
            r29 = r0
            if (r5 == 0) goto L1da
            r20 = 1
        L1da:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.GayKinkyPorn.GayKinkyPorn.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static final Unit loadLinks$lambda$2(Function1 $callback, ExtractorLink link) {
        $callback.invoke(link);
        return Unit.INSTANCE;
    }
}
