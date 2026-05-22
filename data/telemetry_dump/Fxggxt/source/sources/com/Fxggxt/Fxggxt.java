package com.Fxggxt;

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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jsoup.nodes.Element;

/* JADX INFO: compiled from: Fxggxt.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Fxggxt/classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010#\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0096@¢\u0006\u0002\u0010*J\u000e\u0010+\u001a\u0004\u0018\u00010,*\u00020-H\u0002J\u000e\u0010.\u001a\u0004\u0018\u00010,*\u00020-H\u0002J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020,0!2\u0006\u00100\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u00101J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u00101JF\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u000e2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;092\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020;09H\u0096@¢\u0006\u0002\u0010>R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006?"}, d2 = {"Lcom/Fxggxt/Fxggxt;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "hasDownloadSupport", "getHasDownloadSupport", "hasChromecastSupport", "getHasChromecastSupport", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "headers", "", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lorg/jsoup/nodes/Element;", "toRecommendResult", "search", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Fxggxt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFxggxt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Fxggxt.kt\ncom/Fxggxt/Fxggxt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1642#2,10:220\n1915#2:230\n1916#2:232\n1652#2:233\n1642#2,10:234\n1915#2:244\n1916#2:246\n1652#2:247\n1642#2,10:248\n1915#2:258\n1916#2:261\n1652#2:262\n1642#2,10:263\n1915#2:273\n1916#2:275\n1652#2:276\n1915#2:277\n1916#2:279\n1915#2,2:280\n1#3:231\n1#3:245\n1#3:259\n1#3:260\n1#3:274\n1#3:278\n*S KotlinDebug\n*F\n+ 1 Fxggxt.kt\ncom/Fxggxt/Fxggxt\n*L\n83#1:220,10\n83#1:230\n83#1:232\n83#1:233\n131#1:234,10\n131#1:244\n131#1:246\n131#1:247\n166#1:248,10\n166#1:258\n166#1:261\n166#1:262\n171#1:263,10\n171#1:273\n171#1:275\n171#1:276\n197#1:277\n197#1:279\n206#1:280,2\n83#1:231\n131#1:245\n166#1:260\n171#1:274\n*E\n"})
public final class Fxggxt extends MainAPI {

    @NotNull
    private String mainUrl = "https://fxggxt.com";

    @NotNull
    private String name = "Fxggxt";
    private final boolean hasMainPage = true;
    private final boolean hasDownloadSupport = true;
    private final boolean hasChromecastSupport = true;

    @NotNull
    private final VPNStatus vpnStatus = VPNStatus.MightBeNeeded;

    @NotNull
    private final Set<TvType> supportedTypes = SetsKt.setOf(TvType.NSFW);

    @NotNull
    private final Map<String, String> headers = MapsKt.mapOf(new Pair[]{TuplesKt.to("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.0.0 Safari/537.36"), TuplesKt.to("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"), TuplesKt.to("Accept-Language", "en-US,en;q=0.5"), TuplesKt.to("Connection", "keep-alive"), TuplesKt.to("Upgrade-Insecure-Requests", "1")});

    @NotNull
    private final List<MainPageData> mainPage = MainAPIKt.mainPageOf(new Pair[]{TuplesKt.to(getMainUrl() + "/?filter=latest/", "Latest"), TuplesKt.to(getMainUrl() + "/tag/amateur-gay-porn/", "Amateur"), TuplesKt.to(getMainUrl() + "/tag/bareback-gay-porn/", "Bareback"), TuplesKt.to(getMainUrl() + "/tag/big-dick-gay-porn/", "Big Dick"), TuplesKt.to(getMainUrl() + "/tag/bisexual-porn/", "Bisexual"), TuplesKt.to(getMainUrl() + "/tag/group-gay-porn/", "Group"), TuplesKt.to(getMainUrl() + "/tag/hunk-gay-porn-videos/", "Hunk"), TuplesKt.to(getMainUrl() + "/tag/interracial-gay-porn/", "Interracial"), TuplesKt.to(getMainUrl() + "/tag/muscle-gay-porn/", "Muscle"), TuplesKt.to(getMainUrl() + "/tag/straight-guys-gay-porn/", "Straight"), TuplesKt.to(getMainUrl() + "/tag/twink-gay-porn/", "Twink"), TuplesKt.to(getMainUrl() + "/category/adulttime/", "Adulttime"), TuplesKt.to(getMainUrl() + "/category/asgmax/", "ASGmax"), TuplesKt.to(getMainUrl() + "/category/?s=bareback%2B", "Bareback+"), TuplesKt.to(getMainUrl() + "/category/bel-ami/", "Bel Ami"), TuplesKt.to(getMainUrl() + "/category/bi-latin-men/", "Bi Latin Men"), TuplesKt.to(getMainUrl() + "/category/breederbros/", "Breeder Bros"), TuplesKt.to(getMainUrl() + "/category/clubbangboys/", "Club Bang Boys"), TuplesKt.to(getMainUrl() + "/category/cocksuremen/", "Cock Sure Men"), TuplesKt.to(getMainUrl() + "/category/cocky-boys/", "Cocky Boys"), TuplesKt.to(getMainUrl() + "/category/corbin-fisher/", "Corbin Fisher"), TuplesKt.to(getMainUrl() + "/category/creamybros/", "Creamy Bros"), TuplesKt.to(getMainUrl() + "/category/cumdumpsluts/", "Cumdumpsluts"), TuplesKt.to(getMainUrl() + "/category/ericvideos/", "Eric videos"), TuplesKt.to(getMainUrl() + "/category/facedownassup/", "Face down ass up"), TuplesKt.to(getMainUrl() + "/category/fraternity-x/", "Fraternity X"), TuplesKt.to(getMainUrl() + "/category/just-for-fans/", "Just For Fans"), TuplesKt.to(getMainUrl() + "/category/kristenbjorn/", "Kristen Bjorn"), TuplesKt.to(getMainUrl() + "/category/bi-guys-fuck/", "Bi Guys Fuck"), TuplesKt.to(getMainUrl() + "/category/falcon-studios/", "Falcon Studios"), TuplesKt.to(getMainUrl() + "/category/gay-only-fans/", "Onlyfans"), TuplesKt.to(getMainUrl() + "/category/treasure-island-media/", "Treasure Island Media"), TuplesKt.to(getMainUrl() + "/category/slamrush/", "Slam Rush"), TuplesKt.to(getMainUrl() + "/category/seehimfuck/", "See Him Fuck"), TuplesKt.to(getMainUrl() + "/category/voyr/", "VOYR")});

    /* JADX INFO: renamed from: com.Fxggxt.Fxggxt$getMainPage$1 */
    /* JADX INFO: compiled from: Fxggxt.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Fxggxt.Fxggxt", f = "Fxggxt.kt", i = {0, 0, 0}, l = {82}, m = "getMainPage", n = {"request", "url", "page"}, nl = {83}, s = {"L$0", "L$1", "I$0"}, v = 2)
    static final class C00001 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C00001(Continuation<? super C00001> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Fxggxt.this.getMainPage(0, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Fxggxt.Fxggxt$load$1 */
    /* JADX INFO: compiled from: Fxggxt.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Fxggxt.Fxggxt", f = "Fxggxt.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {145, 177}, m = "load", n = {"url", "url", "doc", "videoElement", "title", "poster", "description", "actors", "recommendations"}, nl = {148, -1}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, v = 2)
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
            return Fxggxt.this.load(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Fxggxt.Fxggxt$loadLinks$1 */
    /* JADX INFO: compiled from: Fxggxt.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Fxggxt.Fxggxt", f = "Fxggxt.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {193, 201, 210}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "isCasting", "data", "subtitleCallback", "callback", "document", "found", "$this$forEach$iv", "element$iv", "player", "url", "videoUrl", "isCasting", "$i$f$forEach", "$i$a$-forEach-Fxggxt$loadLinks$2", "$i$a$-let-Fxggxt$loadLinks$2$1", "data", "subtitleCallback", "callback", "document", "found", "$this$forEach$iv", "element$iv", "down", "url", "videoLink", "isCasting", "$i$f$forEach", "$i$a$-forEach-Fxggxt$loadLinks$3", "$i$a$-let-Fxggxt$loadLinks$3$1"}, nl = {194, 202, 211}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "L$10", "Z$0", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "L$10", "Z$0", "I$0", "I$1", "I$2"}, v = 2)
    static final class C00031 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
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
            return Fxggxt.this.loadLinks(null, false, null, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Fxggxt.Fxggxt$search$1 */
    /* JADX INFO: compiled from: Fxggxt.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Fxggxt.Fxggxt", f = "Fxggxt.kt", i = {0, 0, 0, 0}, l = {130}, m = "search", n = {"query", "searchResponse", "url", "i"}, nl = {131}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 2)
    static final class C00041 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C00041(Continuation<? super C00041> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Fxggxt.this.search(null, (Continuation) this);
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

    public boolean getHasChromecastSupport() {
        return this.hasChromecastSupport;
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [229=4] */
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
            boolean r3 = r2 instanceof com.Fxggxt.Fxggxt.C00001
            if (r3 == 0) goto L1a
            r3 = r2
            com.Fxggxt.Fxggxt$getMainPage$1 r3 = (com.Fxggxt.Fxggxt.C00001) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.Fxggxt.Fxggxt$getMainPage$1 r3 = new com.Fxggxt.Fxggxt$getMainPage$1
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
            goto Lbf
        L46:
            kotlin.ResultKt.throwOnFailure(r4)
            if (r1 <= r7) goto L6d
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
            goto L71
        L6d:
            java.lang.String r6 = r25.getData()
        L71:
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
            if (r4 != r1) goto Lbb
            return r1
        Lbb:
            r1 = r24
            r6 = r25
        Lbf:
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
        Ldd:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto Lfe
            java.lang.Object r15 = r14.next()
            r16 = r15
            r17 = 0
            r2 = r16
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            r19 = 0
            com.lagradost.cloudstream3.SearchResponse r2 = r0.toSearchResult(r2)
            if (r2 == 0) goto Lfc
            r19 = 0
            r9.add(r2)
        Lfc:
            r2 = 1
            goto Ldd
        Lfe:
            r2 = r9
            java.util.List r2 = (java.util.List) r2
            com.lagradost.cloudstream3.HomePageList r7 = new com.lagradost.cloudstream3.HomePageList
            java.lang.String r8 = r6.getName()
            r14 = 1
            r7.<init>(r8, r2, r14)
            r8 = r2
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r14
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
            com.lagradost.cloudstream3.HomePageResponse r7 = com.lagradost.cloudstream3.MainAPIKt.newHomePageResponse(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Fxggxt.Fxggxt.getMainPage(int, com.lagradost.cloudstream3.MainPageRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final SearchResponse toSearchResult(Element $this$toSearchResult) {
        String strText;
        Element aTag = $this$toSearchResult.selectFirst("a");
        if (aTag == null) {
            return null;
        }
        String href = aTag.attr("href");
        Element elementSelectFirst = aTag.selectFirst("header.entry-header span");
        if (elementSelectFirst == null || (strText = elementSelectFirst.text()) == null) {
            strText = "No Title";
        }
        String title = strText;
        final Ref.ObjectRef posterUrl = new Ref.ObjectRef();
        Element elementSelectFirst2 = aTag.selectFirst(".post-thumbnail-container img");
        posterUrl.element = elementSelectFirst2 != null ? elementSelectFirst2.attr("data-src") : null;
        CharSequence charSequence = (CharSequence) posterUrl.element;
        if (charSequence == null || charSequence.length() == 0) {
            Element elementSelectFirst3 = aTag.selectFirst(".post-thumbnail-container img");
            posterUrl.element = elementSelectFirst3 != null ? elementSelectFirst3.attr("src") : null;
        }
        return MainAPIKt.newMovieSearchResponse$default(this, title, href, TvType.Movie, false, new Function1() { // from class: com.Fxggxt.Fxggxt$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(Object obj) {
                return Fxggxt.toSearchResult$lambda$0(posterUrl, (MovieSearchResponse) obj);
            }
        }, 8, (Object) null);
    }

    static final Unit toSearchResult$lambda$0(Ref.ObjectRef $posterUrl, MovieSearchResponse $this$newMovieSearchResponse) {
        $this$newMovieSearchResponse.setPosterUrl((String) $posterUrl.element);
        return Unit.INSTANCE;
    }

    private final SearchResponse toRecommendResult(Element $this$toRecommendResult) {
        String strText;
        Element aTag = $this$toRecommendResult.selectFirst("a");
        if (aTag == null) {
            return null;
        }
        String href = aTag.attr("href");
        Element elementSelectFirst = aTag.selectFirst("header.entry-header span");
        if (elementSelectFirst == null || (strText = elementSelectFirst.text()) == null) {
            strText = "No Title";
        }
        String title = strText;
        final Ref.ObjectRef posterUrl = new Ref.ObjectRef();
        Element elementSelectFirst2 = aTag.selectFirst(".post-thumbnail-container img");
        posterUrl.element = elementSelectFirst2 != null ? elementSelectFirst2.attr("data-src") : null;
        CharSequence charSequence = (CharSequence) posterUrl.element;
        if (charSequence == null || charSequence.length() == 0) {
            Element elementSelectFirst3 = aTag.selectFirst(".post-thumbnail-container img");
            posterUrl.element = elementSelectFirst3 != null ? elementSelectFirst3.attr("src") : null;
        }
        return MainAPIKt.newMovieSearchResponse$default(this, title, href, TvType.Movie, false, new Function1() { // from class: com.Fxggxt.Fxggxt$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(Object obj) {
                return Fxggxt.toRecommendResult$lambda$0(posterUrl, (MovieSearchResponse) obj);
            }
        }, 8, (Object) null);
    }

    static final Unit toRecommendResult$lambda$0(Ref.ObjectRef $posterUrl, MovieSearchResponse $this$newMovieSearchResponse) {
        $this$newMovieSearchResponse.setPosterUrl((String) $posterUrl.element);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [243=4] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f6 -> B:24:0x0100). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object search(@org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.SearchResponse>> r28) {
        /*
            r26 = this;
            r0 = r28
            boolean r1 = r0 instanceof com.Fxggxt.Fxggxt.C00041
            if (r1 == 0) goto L18
            r1 = r0
            com.Fxggxt.Fxggxt$search$1 r1 = (com.Fxggxt.Fxggxt.C00041) r1
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
            com.Fxggxt.Fxggxt$search$1 r1 = new com.Fxggxt.Fxggxt$search$1
            r2 = r26
            r1.<init>(r0)
        L1f:
            java.lang.Object r3 = r1.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r1.label
            switch(r5) {
                case 0: goto L51;
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
            java.lang.Object r6 = r1.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r1.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r1.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r7
            r7 = r6
            r6 = r17
            r17 = r1
            r20 = r3
            r1 = r0
            r0 = r8
            r8 = r2
            goto L100
        L51:
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
        L69:
            r7 = 6
            if (r5 >= r7) goto L172
            java.lang.String r7 = "/?s="
            r8 = 1
            if (r5 <= r8) goto L95
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r21.getMainUrl()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = "/page/"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r5)
            java.lang.StringBuilder r7 = r9.append(r7)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            goto Lae
        L95:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r21.getMainUrl()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r7 = r9.append(r7)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
        Lae:
            com.lagradost.nicehttp.Requests r9 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r3.L$0 = r0
            r3.L$1 = r6
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r3.L$2 = r10
            r3.I$0 = r5
            r3.label = r8
            r8 = r5
            r5 = 0
            r10 = r6
            r6 = 0
            r11 = r4
            r4 = r7
            r7 = 0
            r12 = r8
            r8 = 0
            r17 = r3
            r3 = r9
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
            if (r3 != r0) goto Lf6
            return r0
        Lf6:
            r7 = r4
            r8 = r21
            r6 = r22
            r5 = r24
            r4 = r0
            r0 = r23
        L100:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r3 = r3.getDocument()
            java.lang.String r9 = "article.loop-video.thumb-block"
            org.jsoup.select.Elements r9 = r3.select(r9)
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
        L11e:
            boolean r18 = r16.hasNext()
            if (r18 == 0) goto L142
            java.lang.Object r18 = r16.next()
            r19 = r18
            r21 = 0
            r27 = r0
            r0 = r19
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            r22 = 0
            com.lagradost.cloudstream3.SearchResponse r0 = r8.toSearchResult(r0)
            if (r0 == 0) goto L13f
            r22 = 0
            r11.add(r0)
        L13f:
            r0 = r27
            goto L11e
        L142:
            r27 = r0
            r0 = r11
            java.util.List r0 = (java.util.List) r0
            boolean r9 = r0.isEmpty()
            if (r9 != 0) goto L16b
            r9 = r0
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r6.containsAll(r9)
            if (r9 != 0) goto L16a
            r9 = r0
            java.util.Collection r9 = (java.util.Collection) r9
            r6.addAll(r9)
            int r5 = r5 + 1
            r21 = r8
            r3 = r17
            r0 = r27
            goto L69
        L16a:
        L16b:
            r0 = r27
            r21 = r8
            r3 = r17
            goto L17a
        L172:
            r23 = r0
            r17 = r3
            r24 = r5
            r22 = r6
        L17a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Fxggxt.Fxggxt.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [257=4, 272=4, 152=4] */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.lagradost.cloudstream3.ErrorLoadingException */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118 A[PHI: r0
      0x0118: PHI (r0v67 java.lang.String) = (r0v36 java.lang.String), (r0v68 java.lang.String) binds: [B:55:0x0128, B:48:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0249  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(@org.jetbrains.annotations.NotNull java.lang.String r29, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.LoadResponse> r30) throws com.lagradost.cloudstream3.ErrorLoadingException {
        /*
            r28 = this;
            r1 = r28
            r2 = r30
            boolean r0 = r2 instanceof com.Fxggxt.Fxggxt.C00011
            if (r0 == 0) goto L18
            r0 = r2
            com.Fxggxt.Fxggxt$load$1 r0 = (com.Fxggxt.Fxggxt.C00011) r0
            int r3 = r0.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r0.label
            int r3 = r3 - r4
            r0.label = r3
            goto L1d
        L18:
            com.Fxggxt.Fxggxt$load$1 r0 = new com.Fxggxt.Fxggxt$load$1
            r0.<init>(r2)
        L1d:
            r9 = r0
            java.lang.Object r3 = r9.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r9.label
            switch(r0) {
                case 0: goto L66;
                case 1: goto L5a;
                case 2: goto L31;
                default: goto L29;
            }
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L31:
            java.lang.Object r0 = r9.L$7
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r4 = r9.L$6
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r9.L$5
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r9.L$4
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.L$3
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r9.L$2
            org.jsoup.nodes.Element r8 = (org.jsoup.nodes.Element) r8
            java.lang.Object r10 = r9.L$1
            org.jsoup.nodes.Document r10 = (org.jsoup.nodes.Document) r10
            java.lang.Object r11 = r9.L$0
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r3)
            r20 = r3
            r17 = r9
            goto L248
        L5a:
            java.lang.Object r0 = r9.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r3)
            r5 = r0
            r20 = r3
            r1 = r4
            goto La5
        L66:
            kotlin.ResultKt.throwOnFailure(r3)
            r5 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r0 = r29
            r9.L$0 = r0
            r6 = 1
            r9.label = r6
            r6 = r5
            r5 = 0
            r7 = r6
            r6 = 0
            r8 = r7
            r7 = 0
            r10 = r8
            r8 = 0
            r17 = r9
            r9 = 0
            r11 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r14 = r12
            r12 = 0
            r15 = r14
            r14 = 0
            r16 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r18
            r18 = 4094(0xffe, float:5.737E-42)
            r20 = r19
            r19 = 0
            r1 = r4
            r4 = r0
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r9 = r17
            if (r3 != r1) goto La3
            return r1
        La3:
            r5 = r29
        La5:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r10 = r3.getDocument()
            java.lang.String r0 = "article[itemprop='video'], article[itemtype*='VideoObject']"
            org.jsoup.nodes.Element r0 = r10.selectFirst(r0)
            if (r0 == 0) goto L249
            r11 = r0
            java.lang.String r0 = "meta[itemprop='name']"
            org.jsoup.nodes.Element r0 = r11.selectFirst(r0)
            java.lang.String r3 = "content"
            if (r0 == 0) goto Lc4
            java.lang.String r0 = r0.attr(r3)
            if (r0 != 0) goto Le6
        Lc4:
            java.lang.String r0 = "h1.entry-title"
            org.jsoup.nodes.Element r0 = r10.selectFirst(r0)
            if (r0 == 0) goto Ld1
            java.lang.String r0 = r0.text()
            goto Ld2
        Ld1:
            r0 = 0
        Ld2:
            if (r0 != 0) goto Le6
            java.lang.String r0 = "title"
            org.jsoup.nodes.Element r0 = r10.selectFirst(r0)
            if (r0 == 0) goto Le1
            java.lang.String r0 = r0.text()
            goto Le2
        Le1:
            r0 = 0
        Le2:
            if (r0 != 0) goto Le6
            java.lang.String r0 = "No Title"
        Le6:
            r6 = r0
            java.lang.String r0 = "meta[itemprop='thumbnailUrl']"
            org.jsoup.nodes.Element r0 = r11.selectFirst(r0)
            java.lang.String r7 = ""
            if (r0 == 0) goto Lf7
            java.lang.String r0 = r0.attr(r3)
            if (r0 != 0) goto L108
        Lf7:
            java.lang.String r0 = "meta[property='og:image']"
            org.jsoup.nodes.Element r0 = r10.selectFirst(r0)
            if (r0 == 0) goto L104
            java.lang.String r0 = r0.attr(r3)
            goto L105
        L104:
            r0 = 0
        L105:
            if (r0 != 0) goto L108
            r0 = r7
        L108:
            r13 = r0
            java.lang.String r0 = "meta[itemprop='description']"
            org.jsoup.nodes.Element r0 = r11.selectFirst(r0)
            if (r0 == 0) goto L11a
            java.lang.String r0 = r0.attr(r3)
            if (r0 != 0) goto L118
            goto L11a
        L118:
            r14 = r0
            goto L12b
        L11a:
            java.lang.String r0 = "meta[property='og:description']"
            org.jsoup.nodes.Element r0 = r10.selectFirst(r0)
            if (r0 == 0) goto L127
            java.lang.String r0 = r0.attr(r3)
            goto L128
        L127:
            r0 = 0
        L128:
            if (r0 != 0) goto L118
            r14 = r7
        L12b:
            java.lang.String r0 = "#video-actors a, .video-actors a"
            org.jsoup.select.Elements r0 = r10.select(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r3 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r7 = (java.util.Collection) r7
            r8 = r0
            r12 = 0
            r15 = r8
            r16 = 0
            java.util.Iterator r17 = r15.iterator()
        L145:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L185
            java.lang.Object r18 = r17.next()
            r19 = r18
            r21 = 0
            r22 = r19
            org.jsoup.nodes.Element r22 = (org.jsoup.nodes.Element) r22
            r23 = 0
            java.lang.String r24 = r22.text()
            java.lang.CharSequence r24 = (java.lang.CharSequence) r24
            java.lang.CharSequence r24 = kotlin.text.StringsKt.trim(r24)
            java.lang.String r24 = r24.toString()
            r25 = r24
            r26 = 0
            r27 = r25
            java.lang.CharSequence r27 = (java.lang.CharSequence) r27
            boolean r27 = kotlin.text.StringsKt.isBlank(r27)
            if (r27 != 0) goto L176
            goto L178
        L176:
            r24 = 0
        L178:
            if (r24 == 0) goto L183
            r29 = r24
            r22 = 0
            r4 = r29
            r7.add(r4)
        L183:
            goto L145
        L185:
            r15 = r7
            java.util.List r15 = (java.util.List) r15
            java.lang.String r0 = "article.loop-video, article.thumb-block, .under-video-block article"
            org.jsoup.select.Elements r0 = r10.select(r0)
            r3 = r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            r7 = r3
            r8 = r0
            r12 = 0
            r16 = r7
            r17 = 0
            java.util.Iterator r18 = r16.iterator()
        L1a8:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L1ea
            java.lang.Object r19 = r18.next()
            r21 = r19
            r22 = 0
            r2 = r21
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            r24 = 0
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1cd
            r0 = r28
            com.Fxggxt.Fxggxt r0 = (com.Fxggxt.Fxggxt) r0     // Catch: java.lang.Throwable -> L1cd
            r25 = 0
            com.lagradost.cloudstream3.SearchResponse r26 = r0.toRecommendResult(r2)     // Catch: java.lang.Throwable -> L1cd
            java.lang.Object r0 = kotlin.Result.constructor-impl(r26)     // Catch: java.lang.Throwable -> L1cd
            goto L1d8
        L1cd:
            r0 = move-exception
            kotlin.Result$Companion r25 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)
        L1d8:
            boolean r25 = kotlin.Result.isFailure-impl(r0)
            if (r25 == 0) goto L1df
            r0 = 0
        L1df:
            com.lagradost.cloudstream3.SearchResponse r0 = (com.lagradost.cloudstream3.SearchResponse) r0
            if (r0 == 0) goto L1e7
            r2 = 0
            r8.add(r0)
        L1e7:
            r2 = r30
            goto L1a8
        L1ea:
            r16 = r8
            java.util.List r16 = (java.util.List) r16
            r3 = r28
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            r4 = r6
            com.lagradost.cloudstream3.TvType r6 = com.lagradost.cloudstream3.TvType.NSFW
            com.Fxggxt.Fxggxt$load$2 r12 = new com.Fxggxt.Fxggxt$load$2
            r17 = 0
            r12.<init>(r13, r14, r15, r16, r17)
            r8 = r12
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r9.L$0 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r9.L$1 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r9.L$2 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r9.L$3 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r9.L$4 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r9.L$5 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r9.L$6 = r0
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r9.L$7 = r0
            r0 = 2
            r9.label = r0
            r7 = r5
            java.lang.Object r3 = com.lagradost.cloudstream3.MainAPIKt.newMovieLoadResponse(r3, r4, r5, r6, r7, r8, r9)
            r17 = r9
            if (r3 != r1) goto L240
            return r1
        L240:
            r7 = r4
            r8 = r11
            r6 = r13
            r4 = r15
            r0 = r16
            r11 = r5
            r5 = r14
        L248:
            return r3
        L249:
            com.lagradost.cloudstream3.ErrorLoadingException r0 = new com.lagradost.cloudstream3.ErrorLoadingException
            java.lang.String r1 = "Không tìm thấy thẻ video"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Fxggxt.Fxggxt.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.Fxggxt.Fxggxt$load$2 */
    /* JADX INFO: compiled from: Fxggxt.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Fxggxt.Fxggxt$load$2", f = "Fxggxt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [186=4] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x01e3 -> B:31:0x01fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0209 -> B:33:0x021f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x02c7 -> B:46:0x02e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x02eb -> B:48:0x0302). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadLinks(@org.jetbrains.annotations.NotNull java.lang.String r23, boolean r24, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r25, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r26, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r27) {
        /*
            r22 = this;
            r0 = r22
            r1 = r27
            boolean r2 = r1 instanceof com.Fxggxt.Fxggxt.C00031
            if (r2 == 0) goto L18
            r2 = r1
            com.Fxggxt.Fxggxt$loadLinks$1 r2 = (com.Fxggxt.Fxggxt.C00031) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Fxggxt.Fxggxt$loadLinks$1 r2 = new com.Fxggxt.Fxggxt$loadLinks$1
            r2.<init>(r1)
        L1d:
            java.lang.Object r3 = r2.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.label
            r20 = 0
            switch(r5) {
                case 0: goto Lfc;
                case 1: goto Le3;
                case 2: goto L8a;
                case 3: goto L32;
                default: goto L2a;
            }
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L32:
            int r5 = r2.I$2
            int r7 = r2.I$1
            int r8 = r2.I$0
            boolean r9 = r2.Z$0
            java.lang.Object r10 = r2.L$10
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r2.L$9
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r2.L$8
            org.jsoup.nodes.Element r12 = (org.jsoup.nodes.Element) r12
            java.lang.Object r13 = r2.L$7
            java.lang.Object r14 = r2.L$6
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r15 = r2.L$5
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.lang.Object r6 = r2.L$4
            kotlin.jvm.internal.Ref$BooleanRef r6 = (kotlin.jvm.internal.Ref.BooleanRef) r6
            java.lang.Object r1 = r2.L$3
            org.jsoup.nodes.Document r1 = (org.jsoup.nodes.Document) r1
            r24 = r1
            java.lang.Object r1 = r2.L$2
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r26 = r1
            java.lang.Object r1 = r2.L$1
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r25 = r1
            java.lang.Object r1 = r2.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r12
            r18 = r13
            r19 = r14
            r21 = r15
            r14 = r6
            r12 = r9
            r13 = r10
            r15 = r11
            r6 = r25
            r11 = r0
            r9 = r7
            r10 = r8
            r0 = r27
            r7 = r4
            r8 = r5
            r5 = r26
            r4 = r3
            r3 = r2
            r2 = r24
            goto L2e1
        L8a:
            int r1 = r2.I$2
            int r5 = r2.I$1
            int r6 = r2.I$0
            boolean r7 = r2.Z$0
            java.lang.Object r8 = r2.L$10
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.L$9
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.L$8
            org.jsoup.nodes.Element r10 = (org.jsoup.nodes.Element) r10
            java.lang.Object r11 = r2.L$7
            java.lang.Object r12 = r2.L$6
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r13 = r2.L$5
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r14 = r2.L$4
            kotlin.jvm.internal.Ref$BooleanRef r14 = (kotlin.jvm.internal.Ref.BooleanRef) r14
            java.lang.Object r15 = r2.L$3
            org.jsoup.nodes.Document r15 = (org.jsoup.nodes.Document) r15
            r17 = r1
            java.lang.Object r1 = r2.L$2
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r24 = r1
            java.lang.Object r1 = r2.L$1
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r25 = r1
            java.lang.Object r1 = r2.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.throwOnFailure(r3)
            r18 = r7
            r7 = r1
            r1 = r17
            r17 = r12
            r12 = r9
            r9 = r18
            r18 = r13
            r19 = r14
            r21 = r15
            r13 = r0
            r14 = r10
            r15 = r11
            r0 = r27
            r10 = r6
            r11 = r8
            r6 = r25
            r8 = r5
            r5 = r24
            goto L1fa
        Le3:
            boolean r1 = r2.Z$0
            java.lang.Object r5 = r2.L$2
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            java.lang.Object r6 = r2.L$1
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            java.lang.Object r7 = r2.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r2
            r2 = r4
            r0 = 1
            r4 = r3
            r3 = r1
            r1 = r4
            goto L145
        Lfc:
            kotlin.ResultKt.throwOnFailure(r3)
            r1 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.util.Map<java.lang.String, java.lang.String> r5 = r0.headers
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)
            r2.L$0 = r6
            r6 = r25
            r2.L$1 = r6
            r7 = r26
            r2.L$2 = r7
            r8 = r24
            r2.Z$0 = r8
            r9 = 1
            r2.label = r9
            r6 = 0
            r7 = 0
            r8 = 0
            r16 = 1
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 1
            r16 = 0
            r18 = 4092(0xffc, float:5.734E-42)
            r19 = 0
            r17 = r2
            r2 = r4
            r0 = 1
            r4 = r23
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r3 != r2) goto L13c
            return r2
        L13c:
            r7 = r23
            r6 = r25
            r5 = r26
            r4 = r3
            r3 = r24
        L145:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r4 = r4.getDocument()
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
            r8.<init>()
            java.lang.String r9 = "div.responsive-player iframe[src]"
            org.jsoup.select.Elements r9 = r4.select(r9)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r10 = 0
            java.util.Iterator r11 = r9.iterator()
            r15 = r4
            r14 = r8
            r13 = r9
            r12 = r11
            r9 = r22
            r4 = r2
            r8 = r3
            r2 = r17
            r3 = r1
            r1 = r27
        L16a:
            boolean r11 = r12.hasNext()
            if (r11 == 0) goto L230
            java.lang.Object r11 = r12.next()
            r0 = r11
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            r23 = r1
            r1 = 0
            r24 = r3
            java.lang.String r3 = "src"
            java.lang.String r3 = r0.attr(r3)
            r17 = r3
            r18 = 0
            r19 = r17
            java.lang.CharSequence r19 = (java.lang.CharSequence) r19
            boolean r19 = kotlin.text.StringsKt.isBlank(r19)
            if (r19 != 0) goto L191
            goto L193
        L191:
            r3 = r20
        L193:
            if (r3 == 0) goto L209
            r25 = r3
            r26 = r0
            r0 = 0
            r27 = r3
            r3 = 1
            r14.element = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r2.L$0 = r3
            r2.L$1 = r6
            r2.L$2 = r5
            r2.L$3 = r15
            r2.L$4 = r14
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r2.L$5 = r3
            r2.L$6 = r12
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r2.L$7 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)
            r2.L$8 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)
            r2.L$9 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r27)
            r2.L$10 = r3
            r2.Z$0 = r8
            r2.I$0 = r10
            r2.I$1 = r1
            r2.I$2 = r0
            r3 = 2
            r2.label = r3
            r3 = r25
            r25 = r0
            java.lang.Object r0 = com.lagradost.cloudstream3.utils.ExtractorApiKt.loadExtractor(r3, r6, r5, r2)
            if (r0 != r4) goto L1e3
            return r4
        L1e3:
            r0 = r23
            r17 = r12
            r18 = r13
            r19 = r14
            r21 = r15
            r14 = r26
            r12 = r3
            r13 = r9
            r15 = r11
            r3 = r24
            r11 = r27
            r9 = r8
            r8 = r1
            r1 = r25
        L1fa:
            r1 = r8
            r12 = r17
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r14
            r14 = r19
            goto L21f
        L209:
            r26 = r0
            r27 = r3
            r3 = r2
            r18 = r13
            r21 = r15
            r2 = r23
            r13 = r9
            r15 = r11
            r11 = r27
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r24
        L21f:
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r13
            r13 = r18
            r15 = r21
            r0 = 1
            goto L16a
        L230:
            r23 = r1
            r24 = r3
            java.lang.String r0 = "a#tracking-url[href]"
            org.jsoup.select.Elements r0 = r15.select(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r3 = r0.iterator()
            r11 = r3
            r10 = r8
            r3 = r24
            r8 = r1
            r1 = r15
            r15 = r0
            r0 = r23
        L24a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L30d
            java.lang.Object r13 = r11.next()
            r12 = r13
            org.jsoup.nodes.Element r12 = (org.jsoup.nodes.Element) r12
            r23 = r0
            r0 = 0
            r24 = r1
            java.lang.String r1 = "href"
            java.lang.String r1 = r12.attr(r1)
            r17 = r1
            r18 = 0
            r19 = r17
            java.lang.CharSequence r19 = (java.lang.CharSequence) r19
            boolean r19 = kotlin.text.StringsKt.isBlank(r19)
            if (r19 != 0) goto L271
            goto L273
        L271:
            r1 = r20
        L273:
            if (r1 == 0) goto L2eb
            r25 = r1
            r26 = r1
            r1 = 0
            r27 = r3
            r3 = 1
            r14.element = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r2.L$0 = r3
            r2.L$1 = r6
            r2.L$2 = r5
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r2.L$3 = r3
            r2.L$4 = r14
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r2.L$5 = r3
            r2.L$6 = r11
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r2.L$7 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r2.L$8 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)
            r2.L$9 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)
            r2.L$10 = r3
            r2.Z$0 = r10
            r2.I$0 = r8
            r2.I$1 = r0
            r2.I$2 = r1
            r3 = 3
            r2.label = r3
            r3 = r25
            r25 = r0
            java.lang.Object r0 = com.lagradost.cloudstream3.utils.ExtractorApiKt.loadExtractor(r3, r6, r5, r2)
            if (r0 != r4) goto L2c7
            return r4
        L2c7:
            r0 = r23
            r19 = r11
            r17 = r12
            r18 = r13
            r21 = r15
            r13 = r26
            r15 = r3
            r11 = r9
            r12 = r10
            r9 = r25
            r10 = r8
            r8 = r1
            r1 = r7
            r7 = r4
            r4 = r27
            r3 = r2
            r2 = r24
        L2e1:
            r8 = r1
            r15 = r21
            r1 = r0
            r0 = r9
            r9 = r11
            r11 = r19
            goto L302
        L2eb:
            r25 = r0
            r26 = r1
            r27 = r3
            r1 = r23
            r3 = r2
            r17 = r12
            r18 = r13
            r2 = r24
            r13 = r26
            r12 = r10
            r10 = r8
            r8 = r7
            r7 = r4
            r4 = r27
        L302:
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r7
            r7 = r8
            r8 = r10
            r10 = r12
            goto L24a
        L30d:
            r23 = r0
            boolean r0 = r14.element
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Fxggxt.Fxggxt.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
