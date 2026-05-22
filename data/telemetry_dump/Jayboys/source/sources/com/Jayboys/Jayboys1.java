package com.Jayboys;

import com.Jayboys.Jayboys1;
import com.lagradost.cloudstream3.MainAPI;
import com.lagradost.cloudstream3.MainAPIKt;
import com.lagradost.cloudstream3.MainPageData;
import com.lagradost.cloudstream3.MovieLoadResponse;
import com.lagradost.cloudstream3.MovieSearchResponse;
import com.lagradost.cloudstream3.SearchResponse;
import com.lagradost.cloudstream3.SubtitleFile;
import com.lagradost.cloudstream3.TvType;
import com.lagradost.cloudstream3.VPNStatus;
import com.lagradost.cloudstream3.network.CloudflareKiller;
import com.lagradost.cloudstream3.utils.ExtractorApiKt;
import com.lagradost.cloudstream3.utils.ExtractorLink;
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
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jsoup.nodes.Element;

/* JADX INFO: compiled from: Javboys1.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Jayboys/classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050$H\u0082@¢\u0006\u0002\u0010.J\u001e\u0010+\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0096@¢\u0006\u0002\u00104J\f\u00105\u001a\u000206*\u000207H\u0002J\u000e\u00108\u001a\u0004\u0018\u000106*\u000207H\u0002J\u001c\u00109\u001a\b\u0012\u0004\u0012\u0002060)2\u0006\u0010:\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010;J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010;JF\u0010?\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u000e2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0C2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020E0CH\u0096@¢\u0006\u0002\u0010HR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006I"}, d2 = {"Lcom/Jayboys/Jayboys1;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "lang", "getLang", "setLang", "hasDownloadSupport", "getHasDownloadSupport", "hasChromecastSupport", "getHasChromecastSupport", "hasQuickSearch", "getHasQuickSearch", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "formData", "", "cfKiller", "Lcom/lagradost/cloudstream3/network/CloudflareKiller;", "headers", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "getCookiesAfterAgeGate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lorg/jsoup/nodes/Element;", "toRecommendResult", "search", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Jayboys"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJavboys1.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Javboys1.kt\ncom/Jayboys/Jayboys1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,242:1\n1642#2,10:243\n1915#2:253\n1916#2:255\n1652#2:256\n1642#2,10:257\n1915#2:267\n1916#2:269\n1652#2:270\n1642#2,10:271\n1915#2:281\n1916#2:283\n1652#2:284\n1915#2:285\n1916#2:287\n1915#2,2:288\n1915#2,2:290\n1915#2,2:292\n1915#2,2:296\n1586#2:298\n1661#2,3:299\n777#2:302\n873#2,2:303\n1#3:254\n1#3:268\n1#3:282\n1#3:286\n1342#4,2:294\n*S KotlinDebug\n*F\n+ 1 Javboys1.kt\ncom/Jayboys/Jayboys1\n*L\n83#1:243,10\n83#1:253\n83#1:255\n83#1:256\n125#1:257,10\n125#1:267\n125#1:269\n125#1:270\n147#1:271,10\n147#1:281\n147#1:283\n147#1:284\n175#1:285\n175#1:287\n188#1:288,2\n193#1:290,2\n198#1:292,2\n209#1:296,2\n218#1:298\n218#1:299,3\n219#1:302\n219#1:303,2\n83#1:254\n125#1:268\n147#1:282\n204#1:294,2\n*E\n"})
public final class Jayboys1 extends MainAPI {

    @NotNull
    private String mainUrl = "https://www.javboys.tv";

    @NotNull
    private String name = "Javboys";
    private final boolean hasMainPage = true;

    @NotNull
    private String lang = "en";
    private final boolean hasDownloadSupport = true;
    private final boolean hasChromecastSupport = true;
    private final boolean hasQuickSearch = true;

    @NotNull
    private final Set<TvType> supportedTypes = SetsKt.setOf(TvType.NSFW);

    @NotNull
    private final VPNStatus vpnStatus = VPNStatus.MightBeNeeded;

    @NotNull
    private final Map<String, String> formData = MapsKt.mapOf(new Pair[]{TuplesKt.to("age_gate[age]", "9MRd26N84fSy3NwprhoXtg=="), TuplesKt.to("age_gate[lang]", "en"), TuplesKt.to("age_gate[confirm]", "1"), TuplesKt.to("age_gate[remember]", "1")});

    @NotNull
    private final CloudflareKiller cfKiller = new CloudflareKiller();

    @NotNull
    private final Map<String, String> headers = MapsKt.mapOf(new Pair[]{TuplesKt.to("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:139.0) Gecko/20100101 Firefox/139.0"), TuplesKt.to("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8"), TuplesKt.to("Accept-Language", "en-US,en;q=0.5"), TuplesKt.to("Connection", "keep-alive"), TuplesKt.to("Referer", "url")});

    @NotNull
    private final List<MainPageData> mainPage = MainAPIKt.mainPageOf(new Pair[]{TuplesKt.to("/2025/12/", "25Dec"), TuplesKt.to("/2025/11/", "25Nov"), TuplesKt.to("/2025/10/", "25Oct"), TuplesKt.to("/2025/09/", "25Sep"), TuplesKt.to("/2025/08/", "25Aug")});

    /* JADX INFO: renamed from: com.Jayboys.Jayboys1$getCookiesAfterAgeGate$1 */
    /* JADX INFO: compiled from: Javboys1.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Jayboys.Jayboys1", f = "Javboys1.kt", i = {0}, l = {56}, m = "getCookiesAfterAgeGate", n = {"ua"}, nl = {64}, s = {"L$0"}, v = 2)
    static final class C00021 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00021(Continuation<? super C00021> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Jayboys1.this.getCookiesAfterAgeGate((Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Jayboys.Jayboys1$getMainPage$1 */
    /* JADX INFO: compiled from: Javboys1.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Jayboys.Jayboys1", f = "Javboys1.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {79, 81}, m = "getMainPage", n = {"request", "url", "ua", "page", "request", "url", "ua", "cookies", "page"}, nl = {81, 83}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
    static final class C00031 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C00031(Continuation<? super C00031> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Jayboys1.this.getMainPage(0, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Jayboys.Jayboys1$load$1 */
    /* JADX INFO: compiled from: Javboys1.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Jayboys.Jayboys1", f = "Javboys1.kt", i = {0, 1, 1, 1, 1, 1, 1}, l = {141, 151}, m = "load", n = {"url", "url", "document", "title", "poster", "description", "recommendations"}, nl = {143, -1}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
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
            return Jayboys1.this.load(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Jayboys.Jayboys1$loadLinks$1 */
    /* JADX INFO: compiled from: Javboys1.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Jayboys.Jayboys1", f = "Javboys1.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {165, 223}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "isCasting", "data", "subtitleCallback", "callback", "response", "document", "pageText", "found", "videoUrls", "iframeSrc", "dataVideoRegex", "filteredUrls", "isCasting"}, nl = {166, 239}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "Z$0"}, v = 2)
    static final class C00061 extends ContinuationImpl {
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

        C00061(Continuation<? super C00061> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Jayboys1.this.loadLinks(null, false, null, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Jayboys.Jayboys1$search$1 */
    /* JADX INFO: compiled from: Javboys1.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Jayboys.Jayboys1", f = "Javboys1.kt", i = {0, 0, 0}, l = {123}, m = "search", n = {"query", "searchResponse", "i"}, nl = {125}, s = {"L$0", "L$1", "I$0"}, v = 2)
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
            return Jayboys1.this.search(null, (Continuation) this);
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

    public boolean getHasDownloadSupport() {
        return this.hasDownloadSupport;
    }

    public boolean getHasChromecastSupport() {
        return this.hasChromecastSupport;
    }

    public boolean getHasQuickSearch() {
        return this.hasQuickSearch;
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [56=6] */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCookiesAfterAgeGate(kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, java.lang.String>> r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            boolean r2 = r1 instanceof com.Jayboys.Jayboys1.C00021
            if (r2 == 0) goto L18
            r2 = r1
            com.Jayboys.Jayboys1$getCookiesAfterAgeGate$1 r2 = (com.Jayboys.Jayboys1.C00021) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Jayboys.Jayboys1$getCookiesAfterAgeGate$1 r2 = new com.Jayboys.Jayboys1$getCookiesAfterAgeGate$1
            r2.<init>(r1)
        L1d:
            java.lang.Object r3 = r2.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.label
            switch(r5) {
                case 0: goto L3e;
                case 1: goto L32;
                default: goto L28;
            }
        L28:
            r21 = r2
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L32:
            java.lang.Object r4 = r2.L$0
            java.util.Map r4 = (java.util.Map) r4
            kotlin.ResultKt.throwOnFailure(r3)
            r21 = r2
            r2 = r3
            goto La8
        L3e:
            kotlin.ResultKt.throwOnFailure(r3)
            java.lang.String r5 = "User-Agent"
            java.lang.String r6 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:139.0) Gecko/20100101 Firefox/139.0"
            kotlin.Pair r5 = kotlin.TuplesKt.to(r5, r6)
            java.util.Map r5 = kotlin.collections.MapsKt.mapOf(r5)
            r6 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r7 = r4
            java.lang.String r4 = r0.getMainUrl()
            java.util.Map<java.lang.String, java.lang.String> r9 = r0.formData
            com.lagradost.cloudstream3.network.CloudflareKiller r8 = r0.cfKiller
            r18 = r8
            okhttp3.Interceptor r18 = (okhttp3.Interceptor) r18
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r2.L$0 = r8
            r8 = 1
            r2.label = r8
            r8 = r6
            r6 = 0
            r10 = r7
            r7 = 0
            r11 = r8
            r8 = 0
            r12 = r10
            r10 = 0
            r13 = r11
            r11 = 0
            r14 = r12
            r12 = 0
            r15 = r13
            r13 = 0
            r16 = r14
            r14 = 0
            r17 = r15
            r15 = 0
            r20 = r16
            r19 = r17
            r16 = 0
            r21 = r19
            r19 = 0
            r22 = r20
            r20 = 0
            r23 = r22
            r22 = 57308(0xdfdc, float:8.0306E-41)
            r24 = r23
            r23 = 0
            r0 = r21
            r21 = r2
            r2 = r0
            r0 = r24
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.post$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23)
            if (r3 != r0) goto La7
            return r0
        La7:
            r4 = r5
        La8:
            r0 = r3
            com.lagradost.nicehttp.NiceResponse r0 = (com.lagradost.nicehttp.NiceResponse) r0
            java.util.Map r3 = r0.getCookies()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Jayboys.Jayboys1.getCookiesAfterAgeGate(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [67=4, 252=4] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getMainPage(int r27, @org.jetbrains.annotations.NotNull com.lagradost.cloudstream3.MainPageRequest r28, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.HomePageResponse> r29) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r29
            boolean r3 = r2 instanceof com.Jayboys.Jayboys1.C00031
            if (r3 == 0) goto L1a
            r3 = r2
            com.Jayboys.Jayboys1$getMainPage$1 r3 = (com.Jayboys.Jayboys1.C00031) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.Jayboys.Jayboys1$getMainPage$1 r3 = new com.Jayboys.Jayboys1$getMainPage$1
            r3.<init>(r2)
        L1f:
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r3.label
            r7 = 2
            r8 = 0
            r9 = 1
            switch(r6) {
                case 0: goto L72;
                case 1: goto L59;
                case 2: goto L39;
                default: goto L2d;
            }
        L2d:
            r18 = r3
            r23 = r4
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L39:
            int r1 = r3.I$0
            java.lang.Object r5 = r3.L$3
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r3.L$2
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r7 = r3.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r10 = r3.L$0
            com.lagradost.cloudstream3.MainPageRequest r10 = (com.lagradost.cloudstream3.MainPageRequest) r10
            kotlin.ResultKt.throwOnFailure(r4)
            r22 = r1
            r18 = r3
            r23 = r4
            r1 = 1
            r24 = 0
            goto L192
        L59:
            int r1 = r3.I$0
            java.lang.Object r6 = r3.L$2
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r10 = r3.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r3.L$0
            com.lagradost.cloudstream3.MainPageRequest r11 = (com.lagradost.cloudstream3.MainPageRequest) r11
            kotlin.ResultKt.throwOnFailure(r4)
            r12 = r11
            r11 = r5
            r5 = r10
            r10 = r6
            r6 = r12
            r12 = r4
            goto L138
        L72:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.String r6 = r28.getData()
            java.lang.String r10 = "/category/"
            r11 = 0
            boolean r6 = kotlin.text.StringsKt.startsWith$default(r6, r10, r8, r7, r11)
            java.lang.String r10 = "page/"
            r11 = 47
            if (r6 == 0) goto Laf
            if (r1 <= r9) goto Laf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = r0.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r12)
            java.lang.String r12 = r28.getData()
            java.lang.StringBuilder r6 = r6.append(r12)
            java.lang.StringBuilder r6 = r6.append(r10)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.StringBuilder r6 = r6.append(r11)
            java.lang.String r6 = r6.toString()
            goto Lf0
        Laf:
            if (r1 <= r9) goto Ld7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = r0.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r12)
            java.lang.String r12 = r28.getData()
            java.lang.StringBuilder r6 = r6.append(r12)
            java.lang.StringBuilder r6 = r6.append(r10)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.StringBuilder r6 = r6.append(r11)
            java.lang.String r6 = r6.toString()
            goto Lf0
        Ld7:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = r0.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r10)
            java.lang.String r10 = r28.getData()
            java.lang.StringBuilder r6 = r6.append(r10)
            java.lang.String r6 = r6.toString()
        Lf0:
            r10 = r6
            kotlin.Pair[] r6 = new kotlin.Pair[r7]
            java.lang.String r12 = "User-Agent"
            java.lang.String r13 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:139.0) Gecko/20100101 Firefox/139.0"
            kotlin.Pair r12 = kotlin.TuplesKt.to(r12, r13)
            r6[r8] = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r0.getMainUrl()
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.StringBuilder r11 = r12.append(r11)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "Referer"
            kotlin.Pair r11 = kotlin.TuplesKt.to(r12, r11)
            r6[r9] = r11
            java.util.Map r6 = kotlin.collections.MapsKt.mapOf(r6)
            r11 = r28
            r3.L$0 = r11
            r3.L$1 = r10
            r3.L$2 = r6
            r3.I$0 = r1
            r3.label = r9
            java.lang.Object r12 = r0.getCookiesAfterAgeGate(r3)
            if (r12 != r5) goto L131
            return r5
        L131:
            r25 = r11
            r11 = r5
            r5 = r10
            r10 = r6
            r6 = r25
        L138:
            java.util.Map r12 = (java.util.Map) r12
            r13 = r4
            com.lagradost.nicehttp.Requests r4 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            com.lagradost.cloudstream3.network.CloudflareKiller r14 = r0.cfKiller
            r15 = r14
            okhttp3.Interceptor r15 = (okhttp3.Interceptor) r15
            r3.L$0 = r6
            java.lang.Object r14 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r3.L$1 = r14
            java.lang.Object r14 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r3.L$2 = r14
            java.lang.Object r14 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r3.L$3 = r14
            r3.I$0 = r1
            r3.label = r7
            r7 = 0
            r14 = 0
            r8 = 0
            r16 = r6
            r6 = r10
            r10 = 0
            r17 = r11
            r11 = 0
            r9 = r12
            r18 = 1
            r12 = 0
            r19 = r13
            r20 = 0
            r13 = 0
            r21 = r16
            r16 = 0
            r22 = r17
            r17 = 0
            r23 = r19
            r19 = 3564(0xdec, float:4.994E-42)
            r24 = 0
            r20 = 0
            r18 = r3
            r3 = r22
            r22 = r1
            r1 = 1
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            if (r4 != r3) goto L18e
            return r3
        L18e:
            r7 = r5
            r5 = r9
            r10 = r21
        L192:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r3 = r4.getDocument()
            java.lang.String r4 = "div.list-item div.video.col-2"
            org.jsoup.select.Elements r4 = r3.select(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r8 = 0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Collection r9 = (java.util.Collection) r9
            r11 = r4
            r12 = 0
            r13 = r11
            r14 = 0
            java.util.Iterator r15 = r13.iterator()
        L1b0:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L1d1
            java.lang.Object r16 = r15.next()
            r17 = r16
            r19 = 0
            r1 = r17
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            r21 = 0
            com.lagradost.cloudstream3.SearchResponse r1 = r0.toSearchResult(r1)
            if (r1 == 0) goto L1cf
            r21 = 0
            r9.add(r1)
        L1cf:
            r1 = 1
            goto L1b0
        L1d1:
            r1 = r9
            java.util.List r1 = (java.util.List) r1
            java.lang.String r4 = "a.next.page-numbers"
            org.jsoup.nodes.Element r4 = r3.selectFirst(r4)
            if (r4 == 0) goto L1e2
            r8 = 1
            goto L1e3
        L1e2:
            r8 = 0
        L1e3:
            com.lagradost.cloudstream3.HomePageList r4 = new com.lagradost.cloudstream3.HomePageList
            java.lang.String r9 = r10.getName()
            r11 = 1
            r4.<init>(r9, r1, r11)
            if (r8 == 0) goto L1f3
            r24 = 1
        L1f3:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r24)
            com.lagradost.cloudstream3.HomePageResponse r4 = com.lagradost.cloudstream3.MainAPIKt.newHomePageResponse(r4, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Jayboys.Jayboys1.getMainPage(int, com.lagradost.cloudstream3.MainPageRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final SearchResponse toSearchResult(Element $this$toSearchResult) {
        String string;
        String strAttr;
        String string2;
        String strAttr2;
        String string3;
        String strText;
        Element elementSelectFirst = $this$toSearchResult.selectFirst("a.denomination span.title");
        final String posterUrl = "";
        if (elementSelectFirst == null || (strText = elementSelectFirst.text()) == null || (string = StringsKt.trim(strText).toString()) == null) {
            string = "";
        }
        String title = string;
        Element elementSelectFirst2 = $this$toSearchResult.selectFirst("a.thumb-video");
        String href = (elementSelectFirst2 == null || (strAttr2 = elementSelectFirst2.attr("href")) == null || (string3 = StringsKt.trim(strAttr2).toString()) == null) ? "" : string3;
        Element elementSelectFirst3 = $this$toSearchResult.selectFirst("a.thumb-video img");
        if (elementSelectFirst3 != null && (strAttr = elementSelectFirst3.attr("src")) != null && (string2 = StringsKt.trim(strAttr).toString()) != null) {
            posterUrl = string2;
        }
        return MainAPIKt.newMovieSearchResponse$default(this, title, href, TvType.NSFW, false, new Function1() { // from class: com.Jayboys.Jayboys1$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(Object obj) {
                return Jayboys1.toSearchResult$lambda$0(posterUrl, (MovieSearchResponse) obj);
            }
        }, 8, (Object) null);
    }

    static final Unit toSearchResult$lambda$0(String $posterUrl, MovieSearchResponse $this$newMovieSearchResponse) {
        $this$newMovieSearchResponse.setPosterUrl($posterUrl);
        return Unit.INSTANCE;
    }

    private final SearchResponse toRecommendResult(Element $this$toRecommendResult) {
        String string;
        String strAttr;
        String string2;
        String strAttr2;
        String string3;
        String strText;
        Element elementSelectFirst = $this$toRecommendResult.selectFirst("a.denomination span.title");
        final String posterUrl = "";
        if (elementSelectFirst == null || (strText = elementSelectFirst.text()) == null || (string = StringsKt.trim(strText).toString()) == null) {
            string = "";
        }
        String title = string;
        Element elementSelectFirst2 = $this$toRecommendResult.selectFirst("a.thumb-video");
        String href = (elementSelectFirst2 == null || (strAttr2 = elementSelectFirst2.attr("href")) == null || (string3 = StringsKt.trim(strAttr2).toString()) == null) ? "" : string3;
        Element elementSelectFirst3 = $this$toRecommendResult.selectFirst("a.thumb-video img");
        if (elementSelectFirst3 != null && (strAttr = elementSelectFirst3.attr("src")) != null && (string2 = StringsKt.trim(strAttr).toString()) != null) {
            posterUrl = string2;
        }
        return MainAPIKt.newMovieSearchResponse$default(this, title, href, TvType.NSFW, false, new Function1() { // from class: com.Jayboys.Jayboys1$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(Object obj) {
                return Jayboys1.toRecommendResult$lambda$0(posterUrl, (MovieSearchResponse) obj);
            }
        }, 8, (Object) null);
    }

    static final Unit toRecommendResult$lambda$0(String $posterUrl, MovieSearchResponse $this$newMovieSearchResponse) {
        $this$newMovieSearchResponse.setPosterUrl($posterUrl);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [266=4] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0144  */
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
            boolean r1 = r0 instanceof com.Jayboys.Jayboys1.C00071
            if (r1 == 0) goto L18
            r1 = r0
            com.Jayboys.Jayboys1$search$1 r1 = (com.Jayboys.Jayboys1.C00071) r1
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
            com.Jayboys.Jayboys1$search$1 r1 = new com.Jayboys.Jayboys1$search$1
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
            if (r5 >= r7) goto L144
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
            java.lang.String r8 = "div.list-item div.video.col-2"
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
            r8 = r0
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r6.containsAll(r8)
            if (r8 != 0) goto L13c
            r8 = r0
            java.util.Collection r8 = (java.util.Collection) r8
            r6.addAll(r8)
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L13d
            int r5 = r5 + 1
            r21 = r7
            r3 = r17
            r0 = r27
            goto L60
        L13c:
        L13d:
            r0 = r27
            r21 = r7
            r3 = r17
            goto L14c
        L144:
            r23 = r0
            r17 = r3
            r24 = r5
            r22 = r6
        L14c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Jayboys.Jayboys1.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [280=4] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(@org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.LoadResponse> r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof com.Jayboys.Jayboys1.C00041
            if (r2 == 0) goto L18
            r2 = r1
            com.Jayboys.Jayboys1$load$1 r2 = (com.Jayboys.Jayboys1.C00041) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Jayboys.Jayboys1$load$1 r2 = new com.Jayboys.Jayboys1$load$1
            r2.<init>(r1)
        L1d:
            r9 = r2
            java.lang.Object r2 = r9.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r9.label
            switch(r4) {
                case 0: goto L5c;
                case 1: goto L51;
                case 2: goto L31;
                default: goto L29;
            }
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L31:
            java.lang.Object r3 = r9.L$5
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r9.L$4
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r9.L$3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r9.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.L$1
            org.jsoup.nodes.Document r7 = (org.jsoup.nodes.Document) r7
            java.lang.Object r8 = r9.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r2
            r17 = r9
            goto L16f
        L51:
            java.lang.Object r4 = r9.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r3
            r5 = r4
            r3 = r2
            goto L91
        L5c:
            kotlin.ResultKt.throwOnFailure(r2)
            r4 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.util.Map<java.lang.String, java.lang.String> r5 = r0.headers
            com.lagradost.cloudstream3.network.CloudflareKiller r6 = r0.cfKiller
            r14 = r6
            okhttp3.Interceptor r14 = (okhttp3.Interceptor) r14
            r6 = r23
            r9.L$0 = r6
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
            r15 = 0
            r16 = 0
            r18 = 3580(0xdfc, float:5.017E-42)
            r19 = 0
            r1 = r4
            r4 = r23
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r9 = r17
            if (r3 != r1) goto L8f
            return r1
        L8f:
            r5 = r23
        L91:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r10 = r3.getDocument()
            java.lang.String r3 = "meta[property=og:title]"
            org.jsoup.nodes.Element r3 = r10.selectFirst(r3)
            java.lang.String r4 = "content"
            if (r3 == 0) goto Lb2
            java.lang.String r3 = r3.attr(r4)
            if (r3 == 0) goto Lb2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r3 = kotlin.text.StringsKt.trim(r3)
            java.lang.String r3 = r3.toString()
            goto Lb3
        Lb2:
            r3 = 0
        Lb3:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r7 = r0
            com.lagradost.cloudstream3.MainAPI r7 = (com.lagradost.cloudstream3.MainAPI) r7
            java.lang.String r8 = "[property='og:image']"
            org.jsoup.nodes.Element r8 = r10.selectFirst(r8)
            if (r8 == 0) goto Lc7
            java.lang.String r8 = r8.attr(r4)
            goto Lc8
        Lc7:
            r8 = 0
        Lc8:
            java.lang.String r11 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r7, r8)
            java.lang.String r7 = "meta[property=og:description]"
            org.jsoup.nodes.Element r7 = r10.selectFirst(r7)
            if (r7 == 0) goto Le5
            java.lang.String r4 = r7.attr(r4)
            if (r4 == 0) goto Le5
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim(r4)
            java.lang.String r4 = r4.toString()
            goto Le6
        Le5:
            r4 = 0
        Le6:
            r12 = r4
            java.lang.String r4 = "div.list-item div.video.col-2"
            org.jsoup.select.Elements r4 = r10.select(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r7 = 0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r8 = (java.util.Collection) r8
            r13 = r4
            r14 = 0
            r15 = r13
            r16 = 0
            java.util.Iterator r17 = r15.iterator()
        L100:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L121
            java.lang.Object r18 = r17.next()
            r19 = r18
            r20 = 0
            r6 = r19
            org.jsoup.nodes.Element r6 = (org.jsoup.nodes.Element) r6
            r21 = 0
            com.lagradost.cloudstream3.SearchResponse r6 = r0.toRecommendResult(r6)
            if (r6 == 0) goto L11f
            r21 = 0
            r8.add(r6)
        L11f:
            goto L100
        L121:
            r6 = r8
            java.util.List r6 = (java.util.List) r6
            r13 = r6
            r4 = r3
            r3 = r0
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            com.lagradost.cloudstream3.TvType r6 = com.lagradost.cloudstream3.TvType.NSFW
            com.Jayboys.Jayboys1$load$2 r7 = new com.Jayboys.Jayboys1$load$2
            r8 = 0
            r7.<init>(r11, r12, r13, r8)
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r9.L$0 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r9.L$1 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r9.L$2 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r9.L$3 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r9.L$4 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r9.L$5 = r7
            r7 = 2
            r9.label = r7
            r7 = r5
            java.lang.Object r3 = com.lagradost.cloudstream3.MainAPIKt.newMovieLoadResponse(r3, r4, r5, r6, r7, r8, r9)
            r17 = r9
            if (r3 != r1) goto L168
            return r1
        L168:
            r1 = r3
            r6 = r4
            r8 = r5
            r7 = r10
            r5 = r11
            r4 = r12
            r3 = r13
        L16f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Jayboys.Jayboys1.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.Jayboys.Jayboys1$load$2 */
    /* JADX INFO: compiled from: Javboys1.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Jayboys.Jayboys1$load$2", f = "Javboys1.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00052 extends SuspendLambda implements Function2<MovieLoadResponse, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $description;
        final /* synthetic */ String $poster;
        final /* synthetic */ List<SearchResponse> $recommendations;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00052(String str, String str2, List<? extends SearchResponse> list, Continuation<? super C00052> continuation) {
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [158=4, 286=12] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadLinks(@org.jetbrains.annotations.NotNull java.lang.String r26, boolean r27, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r28, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r29, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r30) {
        /*
            r25 = this;
            r0 = r25
            r1 = r30
            boolean r2 = r1 instanceof com.Jayboys.Jayboys1.C00061
            if (r2 == 0) goto L18
            r2 = r1
            com.Jayboys.Jayboys1$loadLinks$1 r2 = (com.Jayboys.Jayboys1.C00061) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Jayboys.Jayboys1$loadLinks$1 r2 = new com.Jayboys.Jayboys1$loadLinks$1
            r2.<init>(r1)
        L1d:
            java.lang.Object r3 = r2.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.label
            r6 = 1
            switch(r5) {
                case 0: goto L85;
                case 1: goto L68;
                case 2: goto L31;
                default: goto L29;
            }
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L31:
            boolean r4 = r2.Z$0
            java.lang.Object r5 = r2.L$10
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r2.L$9
            kotlin.text.Regex r6 = (kotlin.text.Regex) r6
            java.lang.Object r7 = r2.L$8
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r2.L$7
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Object r9 = r2.L$6
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref.BooleanRef) r9
            java.lang.Object r10 = r2.L$5
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r2.L$4
            org.jsoup.nodes.Document r11 = (org.jsoup.nodes.Document) r11
            java.lang.Object r12 = r2.L$3
            com.lagradost.nicehttp.NiceResponse r12 = (com.lagradost.nicehttp.NiceResponse) r12
            java.lang.Object r13 = r2.L$2
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            java.lang.Object r14 = r2.L$1
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            java.lang.Object r15 = r2.L$0
            java.lang.String r15 = (java.lang.String) r15
            kotlin.ResultKt.throwOnFailure(r3)
            r20 = r3
            r3 = r4
            r4 = r2
            goto L423
        L68:
            boolean r5 = r2.Z$0
            java.lang.Object r7 = r2.L$2
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r8 = r2.L$1
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r9 = r2.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r3)
            r6 = r4
            r4 = r2
            r2 = r6
            r20 = r3
            r6 = r9
            r3 = r5
            r9 = r7
            r7 = r8
            r5 = r20
            goto Ldc
        L85:
            kotlin.ResultKt.throwOnFailure(r3)
            r5 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r7 = r5
            java.util.Map<java.lang.String, java.lang.String> r5 = r0.headers
            com.lagradost.cloudstream3.network.CloudflareKiller r8 = r0.cfKiller
            r14 = r8
            okhttp3.Interceptor r14 = (okhttp3.Interceptor) r14
            r8 = r26
            r2.L$0 = r8
            r9 = r28
            r2.L$1 = r9
            r10 = r29
            r2.L$2 = r10
            r11 = r27
            r2.Z$0 = r11
            r2.label = r6
            r12 = 1
            r6 = 0
            r13 = r7
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r15 = r13
            r16 = 1
            r12 = 0
            r17 = r15
            r15 = 0
            r18 = 1
            r16 = 0
            r19 = 1
            r18 = 3580(0xdfc, float:5.017E-42)
            r20 = 1
            r19 = 0
            r20 = r17
            r17 = r2
            r2 = r4
            r4 = r26
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r4 = r17
            if (r3 != r2) goto Ld3
            return r2
        Ld3:
            r6 = r26
            r7 = r28
            r9 = r29
            r5 = r3
            r3 = r27
        Ldc:
            r12 = r5
            com.lagradost.nicehttp.NiceResponse r12 = (com.lagradost.nicehttp.NiceResponse) r12
            org.jsoup.nodes.Document r11 = r12.getDocument()
            java.lang.String r13 = r12.getText()
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
            r8.<init>()
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            r14 = r5
            java.util.Set r14 = (java.util.Set) r14
            java.lang.String r5 = "div#player, div.video-player"
            org.jsoup.select.Elements r5 = r11.select(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r10 = 0
            java.util.Iterator r15 = r5.iterator()
        L101:
            boolean r16 = r15.hasNext()
            java.lang.String r0 = "data-src"
            java.lang.String r1 = "#"
            r26 = r5
            if (r16 == 0) goto L159
            java.lang.Object r16 = r15.next()
            r5 = r16
            org.jsoup.nodes.Element r5 = (org.jsoup.nodes.Element) r5
            r17 = 0
            java.lang.String r0 = r5.attr(r0)
            r29 = r0
            r18 = 0
            r19 = r29
            java.lang.CharSequence r19 = (java.lang.CharSequence) r19
            if (r19 == 0) goto L12f
            boolean r19 = kotlin.text.StringsKt.isBlank(r19)
            if (r19 == 0) goto L12c
            goto L12f
        L12c:
            r19 = 0
            goto L131
        L12f:
            r19 = 1
        L131:
            if (r19 != 0) goto L13f
            r19 = r0
            r0 = r29
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r1 != 0) goto L143
            r0 = 1
            goto L144
        L13f:
            r19 = r0
            r0 = r29
        L143:
            r0 = 0
        L144:
            if (r0 == 0) goto L147
            goto L149
        L147:
            r19 = 0
        L149:
            if (r19 == 0) goto L151
            r0 = r19
            r1 = 0
            r14.add(r0)
        L151:
            r0 = r25
            r5 = r26
            r1 = r30
            goto L101
        L159:
            java.lang.String r5 = "iframe[src]"
            org.jsoup.nodes.Element r5 = r11.selectFirst(r5)
            java.lang.String r10 = "src"
            if (r5 == 0) goto L169
            java.lang.String r5 = r5.attr(r10)
            goto L16a
        L169:
            r5 = 0
        L16a:
            r15 = r5
            if (r15 == 0) goto L177
            r5 = r15
            r16 = 0
            boolean r5 = r14.add(r5)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
        L177:
            java.lang.String r5 = "div.download-button-wrapper a[href]"
            org.jsoup.nodes.Element r5 = r11.selectFirst(r5)
            if (r5 == 0) goto L192
            r26 = r6
            java.lang.String r6 = "href"
            java.lang.String r5 = r5.attr(r6)
            if (r5 == 0) goto L194
            r6 = 0
            boolean r5 = r14.add(r5)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            goto L194
        L192:
            r26 = r6
        L194:
            java.lang.String r5 = "[data-src]"
            org.jsoup.select.Elements r5 = r11.select(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r6 = 0
            java.util.Iterator r16 = r5.iterator()
        L1a1:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L1f4
            java.lang.Object r17 = r16.next()
            r29 = r5
            r5 = r17
            org.jsoup.nodes.Element r5 = (org.jsoup.nodes.Element) r5
            r18 = 0
            java.lang.String r19 = r5.attr(r0)
            r21 = r19
            r22 = 0
            r23 = r21
            java.lang.CharSequence r23 = (java.lang.CharSequence) r23
            if (r23 == 0) goto L1cb
            boolean r23 = kotlin.text.StringsKt.isBlank(r23)
            if (r23 == 0) goto L1c8
            goto L1cb
        L1c8:
            r23 = 0
            goto L1cd
        L1cb:
            r23 = 1
        L1cd:
            if (r23 != 0) goto L1db
            r23 = r0
            r0 = r21
            boolean r21 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r21 != 0) goto L1df
            r0 = 1
            goto L1e0
        L1db:
            r23 = r0
            r0 = r21
        L1df:
            r0 = 0
        L1e0:
            if (r0 == 0) goto L1e3
            goto L1e5
        L1e3:
            r19 = 0
        L1e5:
            if (r19 == 0) goto L1ee
            r0 = r19
            r19 = 0
            r14.add(r0)
        L1ee:
            r5 = r29
            r0 = r23
            goto L1a1
        L1f4:
            r29 = r5
            java.lang.String r0 = "[src]"
            org.jsoup.select.Elements r0 = r11.select(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r5 = 0
            java.util.Iterator r6 = r0.iterator()
        L203:
            boolean r16 = r6.hasNext()
            if (r16 == 0) goto L24e
            java.lang.Object r16 = r6.next()
            r29 = r0
            r0 = r16
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            r17 = 0
            java.lang.String r18 = r0.attr(r10)
            r19 = r18
            r21 = 0
            r22 = r19
            java.lang.CharSequence r22 = (java.lang.CharSequence) r22
            if (r22 == 0) goto L22d
            boolean r22 = kotlin.text.StringsKt.isBlank(r22)
            if (r22 == 0) goto L22a
            goto L22d
        L22a:
            r22 = 0
            goto L22f
        L22d:
            r22 = 1
        L22f:
            if (r22 != 0) goto L232
            goto L234
        L232:
            r18 = 0
        L234:
            if (r18 == 0) goto L248
            r19 = r18
            r18 = 0
            r21 = r0
            r0 = r19
            boolean r19 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r19 != 0) goto L24a
            r14.add(r0)
            goto L24a
        L248:
            r21 = r0
        L24a:
            r0 = r29
            goto L203
        L24e:
            r29 = r0
            java.lang.String r0 = "video source[src], source[src]"
            org.jsoup.select.Elements r0 = r11.select(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r5 = r0.iterator()
        L25d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L2a1
            java.lang.Object r6 = r5.next()
            r29 = r0
            r0 = r6
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            r16 = 0
            java.lang.String r17 = r0.attr(r10)
            r18 = r17
            r19 = 0
            r21 = r18
            java.lang.CharSequence r21 = (java.lang.CharSequence) r21
            if (r21 == 0) goto L286
            boolean r21 = kotlin.text.StringsKt.isBlank(r21)
            if (r21 == 0) goto L283
            goto L286
        L283:
            r21 = 0
            goto L288
        L286:
            r21 = 1
        L288:
            if (r21 != 0) goto L28b
            goto L28d
        L28b:
            r17 = 0
        L28d:
            if (r17 == 0) goto L29b
            r18 = r17
            r17 = 0
            r19 = r0
            r0 = r18
            r14.add(r0)
            goto L29d
        L29b:
            r19 = r0
        L29d:
            r0 = r29
            goto L25d
        L2a1:
            r29 = r0
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "data:video\\/[A-Za-z0-9.+-]+;base64,[A-Za-z0-9+/=]+"
            r0.<init>(r1)
            r1 = r13
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r5 = 2
            r27 = r7
            r6 = 0
            r7 = 0
            kotlin.sequences.Sequence r1 = kotlin.text.Regex.findAll$default(r0, r1, r7, r5, r6)
            r16 = 0
            java.util.Iterator r17 = r1.iterator()
        L2bc:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L2d6
            java.lang.Object r18 = r17.next()
            r19 = r18
            kotlin.text.MatchResult r19 = (kotlin.text.MatchResult) r19
            r21 = 0
            java.lang.String r5 = r19.getValue()
            r14.add(r5)
            r5 = 2
            goto L2bc
        L2d6:
            java.lang.String r1 = "video[src^=data:], source[src^=data:], div[src^=data:], iframe[src^=data:]"
            org.jsoup.select.Elements r1 = r11.select(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r5 = 0
            java.util.Iterator r16 = r1.iterator()
        L2e4:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L322
            java.lang.Object r17 = r16.next()
            r6 = r17
            org.jsoup.nodes.Element r6 = (org.jsoup.nodes.Element) r6
            r19 = 0
            java.lang.String r21 = r6.attr(r10)
            r22 = r21
            r23 = 0
            r24 = r22
            java.lang.CharSequence r24 = (java.lang.CharSequence) r24
            if (r24 == 0) goto L30c
            boolean r24 = kotlin.text.StringsKt.isBlank(r24)
            if (r24 == 0) goto L309
            goto L30c
        L309:
            r24 = 0
            goto L30e
        L30c:
            r24 = 1
        L30e:
            if (r24 != 0) goto L311
            goto L313
        L311:
            r21 = 0
        L313:
            if (r21 == 0) goto L31e
            r29 = r21
            r21 = 0
            r7 = r29
            r14.add(r7)
        L31e:
            r6 = 0
            r7 = 0
            goto L2e4
        L322:
            r1 = r14
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r7)
            r6.<init>(r7)
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = r1
            r10 = 0
            java.util.Iterator r16 = r7.iterator()
        L33b:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L35f
            java.lang.Object r17 = r16.next()
            r18 = r17
            java.lang.String r18 = (java.lang.String) r18
            r19 = 0
            r21 = r18
            java.lang.CharSequence r21 = (java.lang.CharSequence) r21
            java.lang.CharSequence r21 = kotlin.text.StringsKt.trim(r21)
            r29 = r0
            java.lang.String r0 = r21.toString()
            r6.add(r0)
            r0 = r29
            goto L33b
        L35f:
            r29 = r0
            r0 = r6
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = r0
            r7 = 0
            java.util.Iterator r10 = r6.iterator()
        L376:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L3b0
            r16 = r0
            java.lang.Object r0 = r10.next()
            r17 = r1
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            r18 = 0
            r19 = r6
            java.lang.String r6 = "data:"
            r21 = r7
            r7 = 1
            boolean r6 = kotlin.text.StringsKt.startsWith(r1, r6, r7)
            if (r6 == 0) goto L3a1
            java.lang.String r6 = "data:video/"
            boolean r6 = kotlin.text.StringsKt.startsWith(r1, r6, r7)
            if (r6 == 0) goto L39f
            goto L3a1
        L39f:
            r6 = 0
            goto L3a2
        L3a1:
            r6 = 1
        L3a2:
            if (r6 == 0) goto L3a7
            r5.add(r0)
        L3a7:
            r0 = r16
            r1 = r17
            r6 = r19
            r7 = r21
            goto L376
        L3b0:
            r16 = r0
            r17 = r1
            r19 = r6
            r21 = r7
            r0 = r5
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
            com.Jayboys.Jayboys1$loadLinks$10 r5 = new com.Jayboys.Jayboys1$loadLinks$10
            r10 = 0
            r6 = r26
            r7 = r27
            r1 = 2
            r5.<init>(r6, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r4.L$0 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r4.L$1 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r4.L$2 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r4.L$3 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r4.L$4 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r4.L$5 = r10
            r4.L$6 = r8
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r4.L$7 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r4.L$8 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r29)
            r4.L$9 = r10
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r4.L$10 = r10
            r4.Z$0 = r3
            r4.label = r1
            java.lang.Object r1 = com.lagradost.cloudstream3.ParCollectionsKt.amap(r0, r5, r4)
            if (r1 != r2) goto L419
            return r2
        L419:
            r5 = r0
            r10 = r13
            r13 = r9
            r9 = r8
            r8 = r14
            r14 = r7
            r7 = r15
            r15 = r6
            r6 = r29
        L423:
            boolean r0 = r9.element
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Jayboys.Jayboys1.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.Jayboys.Jayboys1$loadLinks$10, reason: invalid class name */
    /* JADX INFO: compiled from: Javboys1.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "url", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Jayboys.Jayboys1$loadLinks$10", f = "Javboys1.kt", i = {0}, l = {225}, m = "invokeSuspend", n = {"url"}, nl = {232}, s = {"L$0"}, v = 2)
    static final class AnonymousClass10 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<ExtractorLink, Unit> $callback;
        final /* synthetic */ String $data;
        final /* synthetic */ Ref.BooleanRef $found;
        final /* synthetic */ Function1<SubtitleFile, Unit> $subtitleCallback;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10(String str, Function1<? super SubtitleFile, Unit> function1, Ref.BooleanRef booleanRef, Function1<? super ExtractorLink, Unit> function12, Continuation<? super AnonymousClass10> continuation) {
            super(2, continuation);
            this.$data = str;
            this.$subtitleCallback = function1;
            this.$found = booleanRef;
            this.$callback = function12;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> anonymousClass10 = new AnonymousClass10(this.$data, this.$subtitleCallback, this.$found, this.$callback, continuation);
            anonymousClass10.L$0 = obj;
            return anonymousClass10;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return create(str, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object $result) {
            Object objLoadExtractor;
            String url = (String) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        String str = this.$data;
                        Function1<SubtitleFile, Unit> function1 = this.$subtitleCallback;
                        final Function1<ExtractorLink, Unit> function12 = this.$callback;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(url);
                        this.label = 1;
                        objLoadExtractor = ExtractorApiKt.loadExtractor(url, str, function1, new Function1() { // from class: com.Jayboys.Jayboys1$loadLinks$10$$ExternalSyntheticLambda0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final Object invoke(Object obj) {
                                return Jayboys1.AnonymousClass10.invokeSuspend$lambda$0(function12, (ExtractorLink) obj);
                            }
                        }, (Continuation) this);
                        if (objLoadExtractor == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        objLoadExtractor = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean ok = ((Boolean) objLoadExtractor).booleanValue();
                if (ok) {
                    this.$found.element = true;
                }
            } catch (Exception e) {
            }
            return Unit.INSTANCE;
        }

        static final Unit invokeSuspend$lambda$0(Function1 $callback, ExtractorLink link) {
            $callback.invoke(link);
            return Unit.INSTANCE;
        }
    }
}
