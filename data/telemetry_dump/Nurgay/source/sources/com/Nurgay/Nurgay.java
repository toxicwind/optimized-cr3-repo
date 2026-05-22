package com.Nurgay;

import com.Nurgay.Nurgay;
import com.lagradost.api.Log;
import com.lagradost.cloudstream3.MainAPI;
import com.lagradost.cloudstream3.MainAPIKt;
import com.lagradost.cloudstream3.MainPageData;
import com.lagradost.cloudstream3.MovieLoadResponse;
import com.lagradost.cloudstream3.MovieSearchResponse;
import com.lagradost.cloudstream3.SearchResponse;
import com.lagradost.cloudstream3.SubtitleFile;
import com.lagradost.cloudstream3.TvType;
import com.lagradost.cloudstream3.VPNStatus;
import com.lagradost.cloudstream3.utils.ExtractorApiKt;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jsoup.nodes.Element;

/* JADX INFO: compiled from: Nurgay.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Nurgay/classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010&\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0096@¢\u0006\u0002\u0010-J\f\u0010.\u001a\u00020/*\u000200H\u0002J\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020/0$2\u0006\u00102\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u00103J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u00103JF\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u000e2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0;2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020=0;H\u0096@¢\u0006\u0002\u0010@R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006A"}, d2 = {"Lcom/Nurgay/Nurgay;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "lang", "getLang", "setLang", "hasQuickSearch", "getHasQuickSearch", "hasChromecastSupport", "getHasChromecastSupport", "hasDownloadSupport", "getHasDownloadSupport", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lorg/jsoup/nodes/Element;", "search", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Nurgay"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNurgay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nurgay.kt\ncom/Nurgay/Nurgay\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1642#2,10:175\n1915#2:185\n1916#2:187\n1652#2:188\n1642#2,10:190\n1915#2:200\n1916#2:202\n1652#2:203\n1642#2,10:204\n1915#2:214\n1916#2:217\n1652#2:218\n1#3:186\n1#3:189\n1#3:201\n1#3:215\n1#3:216\n*S KotlinDebug\n*F\n+ 1 Nurgay.kt\ncom/Nurgay/Nurgay\n*L\n50#1:175,10\n50#1:185\n50#1:187\n50#1:188\n79#1:190,10\n79#1:200\n79#1:202\n79#1:203\n134#1:204,10\n134#1:214\n134#1:217\n134#1:218\n50#1:186\n79#1:201\n134#1:216\n*E\n"})
public final class Nurgay extends MainAPI {
    private final boolean hasQuickSearch;

    @NotNull
    private String mainUrl = "https://nurgay.to";

    @NotNull
    private String name = "Nurgay";
    private final boolean hasMainPage = true;

    @NotNull
    private String lang = "en";
    private final boolean hasChromecastSupport = true;
    private final boolean hasDownloadSupport = true;

    @NotNull
    private final Set<TvType> supportedTypes = SetsKt.setOf(new TvType[]{TvType.NSFW, TvType.Movie});

    @NotNull
    private final VPNStatus vpnStatus = VPNStatus.MightBeNeeded;

    @NotNull
    private final List<MainPageData> mainPage = MainAPIKt.mainPageOf(new Pair[]{TuplesKt.to("/?filter=latest", "Latest"), TuplesKt.to("/?filter=most-viewed", "Most Viewed"), TuplesKt.to("/asiaten", "Asian"), TuplesKt.to("/asiaten/?filter=random", "Asian random"), TuplesKt.to("/gruppensex", "Group Sex"), TuplesKt.to("/bisex", "Bisexual"), TuplesKt.to("/hunks", "Hunks"), TuplesKt.to("/hunks/?filter=random", "Hunk random"), TuplesKt.to("/latino", "Latino"), TuplesKt.to("/muskeln", "Muscle"), TuplesKt.to("/bareback", "Bareback")});

    /* JADX INFO: renamed from: com.Nurgay.Nurgay$getMainPage$1 */
    /* JADX INFO: compiled from: Nurgay.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Nurgay.Nurgay", f = "Nurgay.kt", i = {0, 0, 0}, l = {49}, m = "getMainPage", n = {"request", "pageUrl", "page"}, nl = {50}, s = {"L$0", "L$1", "I$0"}, v = 2)
    static final class C00051 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C00051(Continuation<? super C00051> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Nurgay.this.getMainPage(0, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Nurgay.Nurgay$load$1 */
    /* JADX INFO: compiled from: Nurgay.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Nurgay.Nurgay", f = "Nurgay.kt", i = {0, 1, 1, 1, 1, 1}, l = {90, 96}, m = "load", n = {"url", "url", "document", "title", "poster", "description"}, nl = {92, -1}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
    static final class C00061 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C00061(Continuation<? super C00061> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Nurgay.this.load(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Nurgay.Nurgay$loadLinks$1 */
    /* JADX INFO: compiled from: Nurgay.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Nurgay.Nurgay", f = "Nurgay.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {114, 129, 148}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "found", "isCasting", "data", "subtitleCallback", "callback", "found", "mainDoc", "embedUrl", "isCasting", "data", "subtitleCallback", "callback", "found", "mainDoc", "embedUrl", "embedDoc", "mirrors", "isCasting"}, nl = {119, 132, 170}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0"}, v = 2)
    static final class C00081 extends ContinuationImpl {
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

        C00081(Continuation<? super C00081> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Nurgay.this.loadLinks(null, false, null, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Nurgay.Nurgay$search$1 */
    /* JADX INFO: compiled from: Nurgay.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Nurgay.Nurgay", f = "Nurgay.kt", i = {0, 0, 0}, l = {78}, m = "search", n = {"query", "searchResponse", "i"}, nl = {79}, s = {"L$0", "L$1", "I$0"}, v = 2)
    static final class C00101 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C00101(Continuation<? super C00101> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Nurgay.this.search(null, (Continuation) this);
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [184=4] */
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
            boolean r3 = r2 instanceof com.Nurgay.Nurgay.C00051
            if (r3 == 0) goto L1a
            r3 = r2
            com.Nurgay.Nurgay$getMainPage$1 r3 = (com.Nurgay.Nurgay.C00051) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.Nurgay.Nurgay$getMainPage$1 r3 = new com.Nurgay.Nurgay$getMainPage$1
            r3.<init>(r2)
        L1f:
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r3.label
            r7 = 1
            switch(r6) {
                case 0: goto L49;
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
            java.lang.Object r5 = r3.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r3.L$0
            com.lagradost.cloudstream3.MainPageRequest r6 = (com.lagradost.cloudstream3.MainPageRequest) r6
            kotlin.ResultKt.throwOnFailure(r4)
            r18 = r3
            r3 = r4
            r22 = 1
            goto Ld8
        L49:
            kotlin.ResultKt.throwOnFailure(r4)
            if (r1 != r7) goto L68
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r0.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = r25.getData()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            goto L8b
        L68:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r0.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = "/page/"
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r8 = r25.getData()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
        L8b:
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
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            if (r4 != r1) goto Ld4
            return r1
        Ld4:
            r1 = r24
            r6 = r25
        Ld8:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r4 = r4.getDocument()
            java.lang.String r7 = "article.loop-video"
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
        Lf6:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L11a
            java.lang.Object r15 = r14.next()
            r16 = r15
            r17 = 0
            r24 = r1
            r1 = r16
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            r19 = 0
            com.lagradost.cloudstream3.SearchResponse r1 = r0.toSearchResult(r1)
            if (r1 == 0) goto L117
            r19 = 0
            r9.add(r1)
        L117:
            r1 = r24
            goto Lf6
        L11a:
            r24 = r1
            r1 = r9
            java.util.List r1 = (java.util.List) r1
            com.lagradost.cloudstream3.HomePageList r7 = new com.lagradost.cloudstream3.HomePageList
            java.lang.String r8 = r6.getName()
            r9 = 0
            r7.<init>(r8, r1, r9)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r22)
            com.lagradost.cloudstream3.HomePageResponse r7 = com.lagradost.cloudstream3.MainAPIKt.newHomePageResponse(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nurgay.Nurgay.getMainPage(int, com.lagradost.cloudstream3.MainPageRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final SearchResponse toSearchResult(Element $this$toSearchResult) {
        String title = $this$toSearchResult.select("header.entry-header span").text();
        String href = MainAPIKt.fixUrl(this, $this$toSearchResult.select("a").attr("href"));
        final String posterUrl = MainAPIKt.fixUrlNull(this, $this$toSearchResult.select("img").attr("data-src"));
        String str = posterUrl;
        if (str == null || StringsKt.isBlank(str)) {
            posterUrl = null;
        }
        if (posterUrl == null) {
            posterUrl = MainAPIKt.fixUrlNull(this, $this$toSearchResult.select("img").attr("src"));
        }
        return MainAPIKt.newMovieSearchResponse$default(this, title, href, TvType.NSFW, false, new Function1() { // from class: com.Nurgay.Nurgay$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(Object obj) {
                return Nurgay.toSearchResult$lambda$1(posterUrl, (MovieSearchResponse) obj);
            }
        }, 8, (Object) null);
    }

    static final Unit toSearchResult$lambda$1(String $posterUrl, MovieSearchResponse $this$newMovieSearchResponse) {
        $this$newMovieSearchResponse.setPosterUrl($posterUrl);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [199=4] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00cb -> B:20:0x00d4). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object search(@org.jetbrains.annotations.NotNull java.lang.String r27, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.SearchResponse>> r28) {
        /*
            r26 = this;
            r0 = r28
            boolean r1 = r0 instanceof com.Nurgay.Nurgay.C00101
            if (r1 == 0) goto L18
            r1 = r0
            com.Nurgay.Nurgay$search$1 r1 = (com.Nurgay.Nurgay.C00101) r1
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
            com.Nurgay.Nurgay$search$1 r1 = new com.Nurgay.Nurgay$search$1
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
            goto Ld4
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
            r7 = 8
            if (r5 >= r7) goto L13b
            com.lagradost.nicehttp.Requests r7 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r21.getMainUrl()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = "/?s="
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r9 = "&page="
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r5)
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
            if (r3 != r0) goto Lcb
            return r0
        Lcb:
            r4 = r0
            r7 = r21
            r6 = r22
            r0 = r23
            r5 = r24
        Ld4:
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
        Lf2:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L116
            java.lang.Object r16 = r15.next()
            r18 = r16
            r19 = 0
            r27 = r0
            r0 = r18
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            r21 = 0
            com.lagradost.cloudstream3.SearchResponse r0 = r7.toSearchResult(r0)
            if (r0 == 0) goto L113
            r21 = 0
            r10.add(r0)
        L113:
            r0 = r27
            goto Lf2
        L116:
            r27 = r0
            r0 = r10
            java.util.List r0 = (java.util.List) r0
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L134
            r8 = r0
            java.util.Collection r8 = (java.util.Collection) r8
            r6.addAll(r8)
            int r5 = r5 + 1
            r21 = r7
            r3 = r17
            r0 = r27
            goto L60
        L134:
            r0 = r27
            r21 = r7
            r3 = r17
            goto L143
        L13b:
            r23 = r0
            r17 = r3
            r24 = r5
            r22 = r6
        L143:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nurgay.Nurgay.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(@org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.LoadResponse> r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof com.Nurgay.Nurgay.C00061
            if (r2 == 0) goto L18
            r2 = r1
            com.Nurgay.Nurgay$load$1 r2 = (com.Nurgay.Nurgay.C00061) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Nurgay.Nurgay$load$1 r2 = new com.Nurgay.Nurgay$load$1
            r2.<init>(r1)
        L1d:
            r9 = r2
            java.lang.Object r2 = r9.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r9.label
            switch(r4) {
                case 0: goto L58;
                case 1: goto L4d;
                case 2: goto L31;
                default: goto L29;
            }
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L31:
            java.lang.Object r3 = r9.L$4
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r9.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r9.L$2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r9.L$1
            org.jsoup.nodes.Document r6 = (org.jsoup.nodes.Document) r6
            java.lang.Object r7 = r9.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r2)
            r0 = r2
            r17 = r9
            goto L122
        L4d:
            java.lang.Object r4 = r9.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.ResultKt.throwOnFailure(r2)
            r0 = r3
            r5 = r4
            r3 = r2
            goto L88
        L58:
            kotlin.ResultKt.throwOnFailure(r2)
            r4 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r5 = r21
            r9.L$0 = r5
            r6 = 1
            r9.label = r6
            r5 = 0
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
            r18 = 4094(0xffe, float:5.737E-42)
            r19 = 0
            r0 = r4
            r4 = r21
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r9 = r17
            if (r3 != r0) goto L86
            return r0
        L86:
            r5 = r21
        L88:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r10 = r3.getDocument()
            java.lang.String r3 = "meta[property=og:title]"
            org.jsoup.nodes.Element r3 = r10.selectFirst(r3)
            java.lang.String r4 = "content"
            if (r3 == 0) goto Laa
            java.lang.String r3 = r3.attr(r4)
            if (r3 == 0) goto Laa
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r3 = kotlin.text.StringsKt.trim(r3)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto Lac
        Laa:
            java.lang.String r3 = ""
        Lac:
            java.lang.String r6 = "meta[property=og:image]"
            org.jsoup.nodes.Element r6 = r10.selectFirst(r6)
            r7 = 0
            if (r6 == 0) goto Lc6
            java.lang.String r6 = r6.attr(r4)
            if (r6 == 0) goto Lc6
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.CharSequence r6 = kotlin.text.StringsKt.trim(r6)
            java.lang.String r6 = r6.toString()
            goto Lc7
        Lc6:
            r6 = r7
        Lc7:
            r11 = r6
            java.lang.String r6 = "meta[property=og:description]"
            org.jsoup.nodes.Element r6 = r10.selectFirst(r6)
            if (r6 == 0) goto Le1
            java.lang.String r4 = r6.attr(r4)
            if (r4 == 0) goto Le1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim(r4)
            java.lang.String r4 = r4.toString()
            goto Le2
        Le1:
            r4 = r7
        Le2:
            r12 = r4
            r4 = r3
            r3 = r20
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            com.lagradost.cloudstream3.TvType r6 = com.lagradost.cloudstream3.TvType.Movie
            com.Nurgay.Nurgay$load$2 r8 = new com.Nurgay.Nurgay$load$2
            r8.<init>(r11, r12, r7)
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
            r7 = 2
            r9.label = r7
            r7 = r5
            java.lang.Object r3 = com.lagradost.cloudstream3.MainAPIKt.newMovieLoadResponse(r3, r4, r5, r6, r7, r8, r9)
            r17 = r9
            if (r3 != r0) goto L11c
            return r0
        L11c:
            r0 = r3
            r7 = r5
            r6 = r10
            r3 = r12
            r5 = r4
            r4 = r11
        L122:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nurgay.Nurgay.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.Nurgay.Nurgay$load$2 */
    /* JADX INFO: compiled from: Nurgay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Nurgay.Nurgay$load$2", f = "Nurgay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00072 extends SuspendLambda implements Function2<MovieLoadResponse, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $description;
        final /* synthetic */ String $poster;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00072(String str, String str2, Continuation<? super C00072> continuation) {
            super(2, continuation);
            this.$poster = str;
            this.$description = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00072 = new C00072(this.$poster, this.$description, continuation);
            c00072.L$0 = obj;
            return c00072;
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
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [213=4, 102=4] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadLinks(@org.jetbrains.annotations.NotNull java.lang.String r38, boolean r39, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r40, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r41, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r42) {
        /*
            r37 = this;
            r2 = r38
            r0 = r42
            boolean r1 = r0 instanceof com.Nurgay.Nurgay.C00081
            if (r1 == 0) goto L1a
            r1 = r0
            com.Nurgay.Nurgay$loadLinks$1 r1 = (com.Nurgay.Nurgay.C00081) r1
            int r3 = r1.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            int r3 = r1.label
            int r3 = r3 - r4
            r1.label = r3
            r3 = r37
            goto L21
        L1a:
            com.Nurgay.Nurgay$loadLinks$1 r1 = new com.Nurgay.Nurgay$loadLinks$1
            r3 = r37
            r1.<init>(r0)
        L21:
            r15 = r1
            java.lang.Object r1 = r15.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r15.label
            java.lang.String r6 = " ==="
            r8 = 1
            r19 = 0
            java.lang.String r9 = "Nurgay"
            switch(r5) {
                case 0: goto Lc4;
                case 1: goto L9c;
                case 2: goto L6b;
                case 3: goto L3e;
                default: goto L34;
            }
        L34:
            r21 = r1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            boolean r4 = r15.Z$0
            java.lang.Object r5 = r15.L$7
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r7 = r15.L$6
            org.jsoup.nodes.Document r7 = (org.jsoup.nodes.Document) r7
            java.lang.Object r8 = r15.L$5
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r10 = r15.L$4
            org.jsoup.nodes.Document r10 = (org.jsoup.nodes.Document) r10
            java.lang.Object r11 = r15.L$3
            kotlin.jvm.internal.Ref$BooleanRef r11 = (kotlin.jvm.internal.Ref.BooleanRef) r11
            java.lang.Object r12 = r15.L$2
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            java.lang.Object r13 = r15.L$1
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            java.lang.Object r14 = r15.L$0
            r2 = r14
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.throwOnFailure(r1)
            r21 = r1
            r26 = r6
            r1 = r9
            goto L304
        L6b:
            boolean r5 = r15.Z$0
            java.lang.Object r10 = r15.L$5
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r15.L$4
            org.jsoup.nodes.Document r11 = (org.jsoup.nodes.Document) r11
            java.lang.Object r12 = r15.L$3
            kotlin.jvm.internal.Ref$BooleanRef r12 = (kotlin.jvm.internal.Ref.BooleanRef) r12
            java.lang.Object r13 = r15.L$2
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            java.lang.Object r14 = r15.L$1
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            java.lang.Object r7 = r15.L$0
            r2 = r7
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.throwOnFailure(r1)
            r21 = r1
            r0 = r4
            r4 = r5
            r26 = r6
            r8 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r20 = 1
            r5 = r2
            r1 = r9
            r2 = r21
            goto L1ef
        L9c:
            boolean r5 = r15.Z$0
            java.lang.Object r7 = r15.L$3
            kotlin.jvm.internal.Ref$BooleanRef r7 = (kotlin.jvm.internal.Ref.BooleanRef) r7
            java.lang.Object r10 = r15.L$2
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r11 = r15.L$1
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            java.lang.Object r12 = r15.L$0
            r2 = r12
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.throwOnFailure(r1)
            r21 = r1
            r0 = r4
            r26 = r6
            r6 = r7
            r27 = r9
            r3 = r10
            r20 = 1
            r4 = r21
            r1 = r5
            r5 = r2
            r2 = r11
            goto L13b
        Lc4:
            kotlin.ResultKt.throwOnFailure(r1)
            com.lagradost.api.Log r5 = com.lagradost.api.Log.INSTANCE
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "=== LOAD LINKS for: "
            java.lang.StringBuilder r7 = r7.append(r10)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.StringBuilder r7 = r7.append(r6)
            java.lang.String r7 = r7.toString()
            r5.d(r9, r7)
            kotlin.jvm.internal.Ref$BooleanRef r5 = new kotlin.jvm.internal.Ref$BooleanRef
            r5.<init>()
            r7 = r1
            com.lagradost.nicehttp.Requests r1 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r15.L$0 = r2
            r10 = r40
            r15.L$1 = r10
            r11 = r41
            r15.L$2 = r11
            r15.L$3 = r5
            r12 = r39
            r15.Z$0 = r12
            r15.label = r8
            r3 = 0
            r13 = r4
            r4 = 0
            r14 = r5
            r5 = 0
            r17 = r6
            r6 = 0
            r18 = r7
            r7 = 0
            r20 = 1
            r8 = 0
            r21 = r9
            r9 = 0
            r10 = 0
            r12 = 0
            r22 = r13
            r13 = 0
            r23 = r14
            r14 = 0
            r24 = 0
            r16 = 4094(0xffe, float:5.737E-42)
            r25 = r17
            r17 = 0
            r27 = r21
            r0 = r22
            r26 = r25
            r21 = r18
            java.lang.Object r1 = com.lagradost.nicehttp.Requests.get$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17)
            if (r1 != r0) goto L130
            return r0
        L130:
            r5 = r38
            r2 = r40
            r3 = r41
            r4 = r1
            r6 = r23
            r1 = r39
        L13b:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r4 = r4.getDocument()
            java.lang.String r7 = "meta[itemprop=embedUrl]"
            org.jsoup.nodes.Element r7 = r4.selectFirst(r7)
            if (r7 == 0) goto L153
        L14c:
            java.lang.String r8 = "content"
            java.lang.String r7 = r7.attr(r8)
            goto L154
        L153:
            r7 = 0
        L154:
            com.lagradost.api.Log r8 = com.lagradost.api.Log.INSTANCE
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Embed URL: "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r7)
            java.lang.String r9 = r9.toString()
            r10 = r27
            r8.d(r10, r9)
            r8 = r7
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            if (r8 == 0) goto L17d
            boolean r8 = kotlin.text.StringsKt.isBlank(r8)
            if (r8 == 0) goto L17b
            goto L17d
        L17b:
            r8 = 0
            goto L17e
        L17d:
            r8 = 1
        L17e:
            if (r8 == 0) goto L18c
            com.lagradost.api.Log r0 = com.lagradost.api.Log.INSTANCE
            java.lang.String r8 = "No embedUrl found"
            r0.d(r10, r8)
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r19)
            return r0
        L18c:
            com.lagradost.nicehttp.Requests r8 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r15.L$0 = r9
            r15.L$1 = r2
            r15.L$2 = r3
            r15.L$3 = r6
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r15.L$4 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r15.L$5 = r9
            r15.Z$0 = r1
            r9 = 2
            r15.label = r9
            r9 = r4
            r4 = 0
            r23 = r6
            r6 = 0
            r11 = r3
            r3 = r7
            r7 = 0
            r12 = r2
            r2 = r8
            r8 = 0
            r13 = r9
            r9 = 0
            r27 = r10
            r10 = 0
            r16 = r11
            r14 = r12
            r11 = 0
            r17 = r13
            r13 = 0
            r18 = r14
            r14 = 0
            r22 = r16
            r16 = r15
            r15 = 0
            r25 = r17
            r17 = 4090(0xffa, float:5.731E-42)
            r28 = r18
            r18 = 0
            r36 = r27
            r27 = r1
            r1 = r36
            java.lang.Object r2 = com.lagradost.nicehttp.Requests.get$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18)
            r15 = r16
            if (r2 != r0) goto L1e4
            return r0
        L1e4:
            r8 = r3
            r12 = r22
            r11 = r23
            r10 = r25
            r4 = r27
            r13 = r28
        L1ef:
            com.lagradost.nicehttp.NiceResponse r2 = (com.lagradost.nicehttp.NiceResponse) r2
            org.jsoup.nodes.Document r7 = r2.getDocument()
            java.lang.String r2 = "ul#mirrorMenu a.mirror-opt"
            org.jsoup.select.Elements r2 = r7.select(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            r9 = r2
            r14 = 0
            r16 = r9
            r17 = 0
            java.util.Iterator r18 = r16.iterator()
        L211:
            boolean r22 = r18.hasNext()
            if (r22 == 0) goto L266
            java.lang.Object r22 = r18.next()
            r23 = r22
            r25 = 0
            r38 = r2
            r2 = r23
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            r27 = 0
            r39 = r3
            java.lang.String r3 = "data-url"
            java.lang.String r3 = r2.attr(r3)
            r40 = r3
            r28 = 0
            r29 = r40
            java.lang.CharSequence r29 = (java.lang.CharSequence) r29
            boolean r29 = kotlin.text.StringsKt.isBlank(r29)
            if (r29 != 0) goto L24d
            r41 = r2
            java.lang.String r2 = "#"
            r29 = r3
            r3 = r40
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r2)
            if (r2 != 0) goto L253
            r2 = 1
            goto L254
        L24d:
            r41 = r2
            r29 = r3
            r3 = r40
        L253:
            r2 = 0
        L254:
            if (r2 == 0) goto L257
            goto L259
        L257:
            r29 = 0
        L259:
            if (r29 == 0) goto L261
            r2 = r29
            r3 = 0
            r6.add(r2)
        L261:
            r2 = r38
            r3 = r39
            goto L211
        L266:
            r38 = r2
            r39 = r3
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r2 = kotlin.collections.CollectionsKt.toMutableSet(r2)
            com.lagradost.api.Log r3 = com.lagradost.api.Log.INSTANCE
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "Mirrors found: "
            java.lang.StringBuilder r6 = r6.append(r9)
            r27 = r2
            java.lang.Iterable r27 = (java.lang.Iterable) r27
            r34 = 63
            r35 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            java.lang.String r9 = kotlin.collections.CollectionsKt.joinToString$default(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            java.lang.StringBuilder r6 = r6.append(r9)
            java.lang.String r6 = r6.toString()
            r3.d(r1, r6)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L2b8
            com.lagradost.api.Log r0 = com.lagradost.api.Log.INSTANCE
            java.lang.String r3 = "No mirrors found in embed page"
            r0.d(r1, r3)
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r19)
            return r0
        L2b8:
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.CollectionsKt.toList(r3)
            com.Nurgay.Nurgay$loadLinks$2 r6 = new com.Nurgay.Nurgay$loadLinks$2
            r9 = 0
            r6.<init>(r13, r11, r12, r9)
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r15.L$0 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r15.L$1 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r15.L$2 = r9
            r15.L$3 = r11
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r15.L$4 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r15.L$5 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r15.L$6 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r15.L$7 = r9
            r15.Z$0 = r4
            r9 = 3
            r15.label = r9
            java.lang.Object r3 = com.lagradost.cloudstream3.ParCollectionsKt.amap(r3, r6, r15)
            if (r3 != r0) goto L2ff
            return r0
        L2ff:
            r36 = r5
            r5 = r2
            r2 = r36
        L304:
            com.lagradost.api.Log r0 = com.lagradost.api.Log.INSTANCE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "=== finished loadLinks; found="
            java.lang.StringBuilder r3 = r3.append(r6)
            boolean r6 = r11.element
            java.lang.StringBuilder r3 = r3.append(r6)
            r6 = r26
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            r0.d(r1, r3)
            boolean r0 = r11.element
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nurgay.Nurgay.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.Nurgay.Nurgay$loadLinks$2 */
    /* JADX INFO: compiled from: Nurgay.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "url", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Nurgay.Nurgay$loadLinks$2", f = "Nurgay.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"url"}, nl = {161}, s = {"L$0"}, v = 2)
    static final class C00092 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<ExtractorLink, Unit> $callback;
        final /* synthetic */ Ref.BooleanRef $found;
        final /* synthetic */ Function1<SubtitleFile, Unit> $subtitleCallback;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00092(Function1<? super SubtitleFile, Unit> function1, Ref.BooleanRef booleanRef, Function1<? super ExtractorLink, Unit> function12, Continuation<? super C00092> continuation) {
            super(2, continuation);
            this.$subtitleCallback = function1;
            this.$found = booleanRef;
            this.$callback = function12;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00092 = new C00092(this.$subtitleCallback, this.$found, this.$callback, continuation);
            c00092.L$0 = obj;
            return c00092;
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
                        Log.INSTANCE.d("Nurgay", "Trying extractor for: " + url);
                        Function1<SubtitleFile, Unit> function1 = this.$subtitleCallback;
                        final Function1<ExtractorLink, Unit> function12 = this.$callback;
                        this.L$0 = url;
                        this.label = 1;
                        objLoadExtractor = ExtractorApiKt.loadExtractor(url, url, function1, new Function1() { // from class: com.Nurgay.Nurgay$loadLinks$2$$ExternalSyntheticLambda0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final Object invoke(Object obj) {
                                return Nurgay.C00092.invokeSuspend$lambda$0(function12, (ExtractorLink) obj);
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
                Log.INSTANCE.d("Nurgay", "loadExtractor returned " + (ok) + " for " + url);
                if (ok) {
                    this.$found.element = true;
                }
            } catch (Exception e) {
                Log.INSTANCE.e("Nurgay", "Extractor failed for " + url + " -> " + e.getLocalizedMessage());
            }
            return Unit.INSTANCE;
        }

        static final Unit invokeSuspend$lambda$0(Function1 $callback, ExtractorLink link) {
            Log.INSTANCE.d("Nurgay", "EXTRACTOR CALLBACK -> " + link.getUrl());
            $callback.invoke(link);
            return Unit.INSTANCE;
        }
    }
}
