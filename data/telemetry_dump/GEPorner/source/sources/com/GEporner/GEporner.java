package com.GEporner;

import com.lagradost.cloudstream3.MainAPI;
import com.lagradost.cloudstream3.MainAPIKt;
import com.lagradost.cloudstream3.MainPageData;
import com.lagradost.cloudstream3.MovieLoadResponse;
import com.lagradost.cloudstream3.MovieSearchResponse;
import com.lagradost.cloudstream3.SearchResponse;
import com.lagradost.cloudstream3.TvType;
import com.lagradost.cloudstream3.VPNStatus;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import com.lagradost.cloudstream3.utils.Qualities;
import java.math.BigInteger;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jsoup.nodes.Element;

/* JADX INFO: compiled from: GEporner.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/GEPorner/classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010$\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0096@¢\u0006\u0002\u0010+J\f\u0010,\u001a\u00020-*\u00020.H\u0002J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\"2\u0006\u00100\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u00101J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u00101JF\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u000e2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;092\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020;09H\u0096@¢\u0006\u0002\u0010>J\u000e\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u0005J\u0012\u0010A\u001a\u00020(2\b\u0010B\u001a\u0004\u0018\u00010\u0005H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006C"}, d2 = {"Lcom/GEporner/GEporner;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "lang", "getLang", "setLang", "hasDownloadSupport", "getHasDownloadSupport", "hasChromecastSupport", "getHasChromecastSupport", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lorg/jsoup/nodes/Element;", "search", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "base36", "hash", "getIndexQuality", "str", "GEPorner"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGEporner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GEporner.kt\ncom/GEporner/GEporner\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1642#2,10:134\n1915#2:144\n1916#2:146\n1652#2:147\n1642#2,10:148\n1915#2:158\n1916#2:160\n1652#2:161\n1#3:145\n1#3:159\n*S KotlinDebug\n*F\n+ 1 GEporner.kt\ncom/GEporner/GEporner\n*L\n32#1:134,10\n32#1:144\n32#1:146\n32#1:147\n62#1:148,10\n62#1:158\n62#1:160\n62#1:161\n32#1:145\n62#1:159\n*E\n"})
public final class GEporner extends MainAPI {

    @NotNull
    private String mainUrl = "https://www.eporner.com";

    @NotNull
    private String name = "EpornerGay";
    private final boolean hasMainPage = true;

    @NotNull
    private String lang = "en";
    private final boolean hasDownloadSupport = true;
    private final boolean hasChromecastSupport = true;

    @NotNull
    private final Set<TvType> supportedTypes = SetsKt.setOf(TvType.NSFW);

    @NotNull
    private final VPNStatus vpnStatus = VPNStatus.MightBeNeeded;

    @NotNull
    private final List<MainPageData> mainPage = MainAPIKt.mainPageOf(new Pair[]{TuplesKt.to("cat/gay/hd-sex", "Recent Videos"), TuplesKt.to("cat/gay/asian", "Châu Á"), TuplesKt.to("cat/gay/group-sex", "Chơi tập thể"), TuplesKt.to("cat/gay/orgy", "Chơi bày đàn"), TuplesKt.to("cat/gay/threesome", "Chơi 3"), TuplesKt.to("cat/gay/bisexual", "Bi"), TuplesKt.to("cat/gay/hd-1080p", "1080 Porn"), TuplesKt.to("cat/gay/4k-porn", "4K Porn")});

    /* JADX INFO: renamed from: com.GEporner.GEporner$getMainPage$1 */
    /* JADX INFO: compiled from: GEporner.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GEporner.GEporner", f = "GEporner.kt", i = {0, 0}, l = {31}, m = "getMainPage", n = {"request", "page"}, nl = {32}, s = {"L$0", "I$0"}, v = 2)
    static final class C00001 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00001(Continuation<? super C00001> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GEporner.this.getMainPage(0, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.GEporner.GEporner$load$1 */
    /* JADX INFO: compiled from: GEporner.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GEporner.GEporner", f = "GEporner.kt", i = {0, 1, 1, 1, 1, 1}, l = {72, 79}, m = "load", n = {"url", "url", "document", "title", "poster", "description"}, nl = {74, -1}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
    static final class C00011 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C00011(Continuation<? super C00011> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GEporner.this.load(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.GEporner.GEporner$loadLinks$1 */
    /* JADX INFO: compiled from: GEporner.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GEporner.GEporner", f = "GEporner.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {86, 91, 102}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "isCasting", "data", "subtitleCallback", "callback", "doc", "vid", "hash", "url", "isCasting", "data", "subtitleCallback", "callback", "doc", "vid", "hash", "url", "json", "jsonObject", "sources", "mp4Sources", "qualities", "quality", "sourceObject", "src", "labelShort", "isCasting"}, nl = {87, 92, 101}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "Z$0"}, v = 2)
    static final class C00031 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$16;
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
            return GEporner.this.loadLinks(null, false, null, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.GEporner.GEporner$search$1 */
    /* JADX INFO: compiled from: GEporner.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GEporner.GEporner", f = "GEporner.kt", i = {0, 0, 0, 0}, l = {61}, m = "search", n = {"query", "searchResponse", "subquery", "i"}, nl = {62}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 2)
    static final class C00051 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C00051(Continuation<? super C00051> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GEporner.this.search(null, (Continuation) this);
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [143=4] */
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
            boolean r3 = r2 instanceof com.GEporner.GEporner.C00001
            if (r3 == 0) goto L1a
            r3 = r2
            com.GEporner.GEporner$getMainPage$1 r3 = (com.GEporner.GEporner.C00001) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.GEporner.GEporner$getMainPage$1 r3 = new com.GEporner.GEporner$getMainPage$1
            r3.<init>(r2)
        L1f:
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r3.label
            r7 = 1
            switch(r6) {
                case 0: goto L46;
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
            java.lang.Object r5 = r3.L$0
            com.lagradost.cloudstream3.MainPageRequest r5 = (com.lagradost.cloudstream3.MainPageRequest) r5
            kotlin.ResultKt.throwOnFailure(r4)
            r18 = r3
            r21 = r4
            r3 = r1
            r1 = 1
            goto Lb9
        L46:
            kotlin.ResultKt.throwOnFailure(r4)
            r6 = r4
            com.lagradost.nicehttp.Requests r4 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r0.getMainUrl()
            java.lang.StringBuilder r8 = r8.append(r9)
            r9 = 47
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r10 = r25.getData()
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r9 = r25
            r3.L$0 = r9
            r3.I$0 = r1
            r3.label = r7
            r10 = r6
            r6 = 0
            r11 = 1
            r7 = 0
            r12 = r5
            r5 = r8
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
            r1 = 1
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            if (r4 != r3) goto Lb5
            return r3
        Lb5:
            r3 = r24
            r5 = r25
        Lb9:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r4 = r4.getDocument()
            java.lang.String r6 = "#div-search-results div.mb"
            org.jsoup.select.Elements r6 = r4.select(r6)
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
        Ld7:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lf6
            java.lang.Object r14 = r13.next()
            r15 = r14
            r16 = 0
            r1 = r15
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            r19 = 0
            com.lagradost.cloudstream3.SearchResponse r1 = r0.toSearchResult(r1)
            if (r1 == 0) goto Lf4
            r19 = 0
            r8.add(r1)
        Lf4:
            r1 = 1
            goto Ld7
        Lf6:
            r1 = r8
            java.util.List r1 = (java.util.List) r1
            com.lagradost.cloudstream3.HomePageList r6 = new com.lagradost.cloudstream3.HomePageList
            java.lang.String r7 = r5.getName()
            r14 = 1
            r6.<init>(r7, r1, r14)
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r14)
            com.lagradost.cloudstream3.HomePageResponse r6 = com.lagradost.cloudstream3.MainAPIKt.newHomePageResponse(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.GEporner.GEporner.getMainPage(int, com.lagradost.cloudstream3.MainPageRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final SearchResponse toSearchResult(Element $this$toSearchResult) {
        String strText = $this$toSearchResult.select("div.mbunder p.mbtit a").text();
        if (strText == null) {
            strText = "No Title";
        }
        String title = StringsKt.trim(MainAPIKt.fixTitle(strText)).toString();
        String href = MainAPIKt.fixUrl(this, $this$toSearchResult.select("div.mbcontent a").attr("href"));
        final Ref.ObjectRef posterUrl = new Ref.ObjectRef();
        Element elementSelectFirst = $this$toSearchResult.selectFirst("img");
        posterUrl.element = elementSelectFirst != null ? elementSelectFirst.attr("data-src") : null;
        CharSequence charSequence = (CharSequence) posterUrl.element;
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            Element elementSelectFirst2 = $this$toSearchResult.selectFirst("img");
            posterUrl.element = elementSelectFirst2 != null ? elementSelectFirst2.attr("src") : null;
        }
        return MainAPIKt.newMovieSearchResponse$default(this, title, href, TvType.Movie, false, new Function1() { // from class: com.GEporner.GEporner$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(Object obj) {
                return GEporner.toSearchResult$lambda$0(posterUrl, (MovieSearchResponse) obj);
            }
        }, 8, (Object) null);
    }

    static final Unit toSearchResult$lambda$0(Ref.ObjectRef $posterUrl, MovieSearchResponse $this$newMovieSearchResponse) {
        $this$newMovieSearchResponse.setPosterUrl((String) $posterUrl.element);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [157=4] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00d8 -> B:20:0x00e3). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object search(@org.jetbrains.annotations.NotNull java.lang.String r28, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.SearchResponse>> r29) {
        /*
            r27 = this;
            r0 = r29
            boolean r1 = r0 instanceof com.GEporner.GEporner.C00051
            if (r1 == 0) goto L18
            r1 = r0
            com.GEporner.GEporner$search$1 r1 = (com.GEporner.GEporner.C00051) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            r2 = r27
            goto L1f
        L18:
            com.GEporner.GEporner$search$1 r1 = new com.GEporner.GEporner$search$1
            r2 = r27
            r1.<init>(r0)
        L1f:
            java.lang.Object r3 = r1.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r1.label
            switch(r5) {
                case 0: goto L4b;
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
            r10 = r2
            r9 = r8
            r8 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            goto Le3
        L4b:
            kotlin.ResultKt.throwOnFailure(r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r5 = (java.util.List) r5
            r6 = 1
            r7 = r6
            r6 = r5
            r5 = r7
            r7 = r28
            r25 = r2
        L5d:
            r8 = 8
            if (r5 >= r8) goto L150
            r11 = 4
            r12 = 0
            java.lang.String r8 = " "
            java.lang.String r9 = "-"
            r10 = 0
            java.lang.String r8 = kotlin.text.StringsKt.replace$default(r7, r8, r9, r10, r11, r12)
            com.lagradost.nicehttp.Requests r9 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r25.getMainUrl()
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = "/?s="
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r8)
            r11 = 47
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r5)
            java.lang.String r10 = r10.toString()
            r1.L$0 = r7
            r1.L$1 = r6
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r1.L$2 = r11
            r1.I$0 = r5
            r11 = 1
            r1.label = r11
            r11 = r8
            r8 = r9
            r9 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r13 = r12
            r12 = 0
            r14 = r13
            r13 = 0
            r15 = r14
            r14 = 0
            r16 = r15
            r15 = 0
            r17 = r16
            r16 = 0
            r19 = r17
            r17 = 0
            r20 = r19
            r19 = 0
            r21 = r20
            r20 = 0
            r22 = r21
            r21 = 0
            r23 = 4094(0xffe, float:5.737E-42)
            r24 = 0
            r26 = r22
            r22 = r1
            r1 = r26
            java.lang.Object r8 = com.lagradost.nicehttp.Requests.get$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24)
            if (r8 != r4) goto Ld8
            return r4
        Ld8:
            r9 = r7
            r10 = r25
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r8
            r8 = r1
            r1 = r22
        Le3:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r3 = r3.getDocument()
            java.lang.String r11 = "div.mb"
            org.jsoup.select.Elements r11 = r3.select(r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            r12 = 0
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Collection r13 = (java.util.Collection) r13
            r14 = r11
            r15 = 0
            r16 = r14
            r17 = 0
            java.util.Iterator r18 = r16.iterator()
        L103:
            boolean r19 = r18.hasNext()
            if (r19 == 0) goto L127
            java.lang.Object r19 = r18.next()
            r20 = r19
            r21 = 0
            r28 = r0
            r0 = r20
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            r22 = 0
            com.lagradost.cloudstream3.SearchResponse r0 = r10.toSearchResult(r0)
            if (r0 == 0) goto L124
            r22 = 0
            r13.add(r0)
        L124:
            r0 = r28
            goto L103
        L127:
            r28 = r0
            r0 = r13
            java.util.List r0 = (java.util.List) r0
            boolean r11 = r0.isEmpty()
            if (r11 != 0) goto L148
            r11 = r0
            java.util.Collection r11 = (java.util.Collection) r11
            r7.addAll(r11)
            int r0 = r6 + 1
            r3 = r4
            r4 = r5
            r6 = r7
            r7 = r9
            r25 = r10
            r5 = r0
            r0 = r28
            goto L5d
        L148:
            r0 = r28
            r3 = r4
            r6 = r7
            r7 = r9
            r25 = r10
            goto L152
        L150:
            r22 = r1
        L152:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.GEporner.GEporner.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
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
            boolean r2 = r1 instanceof com.GEporner.GEporner.C00011
            if (r2 == 0) goto L18
            r2 = r1
            com.GEporner.GEporner$load$1 r2 = (com.GEporner.GEporner.C00011) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.GEporner.GEporner$load$1 r2 = new com.GEporner.GEporner$load$1
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
            goto L120
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
            r6 = 0
            if (r3 == 0) goto Laa
            java.lang.String r3 = r3.attr(r4)
            if (r3 == 0) goto Laa
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r3 = kotlin.text.StringsKt.trim(r3)
            java.lang.String r3 = r3.toString()
            goto Lab
        Laa:
            r3 = r6
        Lab:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r7 = r20
            com.lagradost.cloudstream3.MainAPI r7 = (com.lagradost.cloudstream3.MainAPI) r7
            java.lang.String r8 = "[property='og:image']"
            org.jsoup.nodes.Element r8 = r10.selectFirst(r8)
            if (r8 == 0) goto Lc0
            java.lang.String r8 = r8.attr(r4)
            goto Lc1
        Lc0:
            r8 = r6
        Lc1:
            java.lang.String r11 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r7, r8)
            java.lang.String r7 = "meta[property=og:description]"
            org.jsoup.nodes.Element r7 = r10.selectFirst(r7)
            if (r7 == 0) goto Lde
            java.lang.String r4 = r7.attr(r4)
            if (r4 == 0) goto Lde
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim(r4)
            java.lang.String r4 = r4.toString()
            goto Ldf
        Lde:
            r4 = r6
        Ldf:
            r12 = r4
            r4 = r3
            r3 = r20
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            com.lagradost.cloudstream3.TvType r7 = com.lagradost.cloudstream3.TvType.NSFW
            com.GEporner.GEporner$load$2 r8 = new com.GEporner.GEporner$load$2
            r8.<init>(r11, r12, r6)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r9.L$0 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r9.L$1 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r9.L$2 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r9.L$3 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r9.L$4 = r6
            r6 = 2
            r9.label = r6
            r6 = r7
            r7 = r5
            java.lang.Object r3 = com.lagradost.cloudstream3.MainAPIKt.newMovieLoadResponse(r3, r4, r5, r6, r7, r8, r9)
            r17 = r9
            if (r3 != r0) goto L11a
            return r0
        L11a:
            r0 = r3
            r7 = r5
            r6 = r10
            r3 = r12
            r5 = r4
            r4 = r11
        L120:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.GEporner.GEporner.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.GEporner.GEporner$load$2 */
    /* JADX INFO: compiled from: GEporner.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GEporner.GEporner$load$2", f = "GEporner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00022 extends SuspendLambda implements Function2<MovieLoadResponse, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $description;
        final /* synthetic */ String $poster;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00022(String str, String str2, Continuation<? super C00022> continuation) {
            super(2, continuation);
            this.$poster = str;
            this.$description = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00022 = new C00022(this.$poster, this.$description, continuation);
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
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [85=4] */
    /* JADX WARN: Path cross not found for [B:21:0x0160, B:24:0x016e], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:27:0x0185, B:30:0x0192], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0215 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x030a -> B:45:0x0325). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadLinks(@org.jetbrains.annotations.NotNull java.lang.String r30, boolean r31, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r32, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r33, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r34) throws org.json.JSONException {
        /*
            r29 = this;
            r0 = r29
            r1 = r34
            boolean r2 = r1 instanceof com.GEporner.GEporner.C00031
            if (r2 == 0) goto L18
            r2 = r1
            com.GEporner.GEporner$loadLinks$1 r2 = (com.GEporner.GEporner.C00031) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.GEporner.GEporner$loadLinks$1 r2 = new com.GEporner.GEporner$loadLinks$1
            r2.<init>(r1)
        L1d:
            java.lang.Object r3 = r2.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.label
            switch(r5) {
                case 0: goto Lf4;
                case 1: goto Ld6;
                case 2: goto Lab;
                case 3: goto L30;
                default: goto L28;
            }
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L30:
            boolean r5 = r2.Z$0
            java.lang.Object r8 = r2.L$16
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r9 = r2.L$15
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.L$14
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r2.L$13
            org.json.JSONObject r11 = (org.json.JSONObject) r11
            java.lang.Object r12 = r2.L$12
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.L$11
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r14 = r2.L$10
            org.json.JSONObject r14 = (org.json.JSONObject) r14
            java.lang.Object r15 = r2.L$9
            org.json.JSONObject r15 = (org.json.JSONObject) r15
            java.lang.Object r7 = r2.L$8
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.Object r6 = r2.L$7
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r2.L$6
            java.lang.String r1 = (java.lang.String) r1
            r31 = r1
            java.lang.Object r1 = r2.L$5
            java.lang.String r1 = (java.lang.String) r1
            r18 = r1
            java.lang.Object r1 = r2.L$4
            java.lang.String r1 = (java.lang.String) r1
            r19 = r1
            java.lang.Object r1 = r2.L$3
            java.lang.String r1 = (java.lang.String) r1
            r20 = r1
            java.lang.Object r1 = r2.L$2
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r33 = r1
            java.lang.Object r1 = r2.L$1
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r32 = r1
            java.lang.Object r1 = r2.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r2
            r22 = r3
            r2 = r5
            r21 = r7
            r16 = r13
            r24 = r14
            r25 = r15
            r7 = r19
            r23 = 1
            r5 = r31
            r15 = r33
            r13 = r1
            r19 = r6
            r14 = r12
            r6 = r18
            r1 = r34
            r18 = r0
            r12 = r11
            r0 = r20
            r11 = r32
            goto L325
        Lab:
            boolean r1 = r2.Z$0
            java.lang.Object r5 = r2.L$6
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.L$5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.L$4
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r2.L$3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.L$2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r2.L$1
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r11 = r2.L$0
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r3)
            r28 = r1
            r17 = r2
            r21 = r3
            r1 = r4
            r2 = 1
            goto L223
        Ld6:
            boolean r1 = r2.Z$0
            java.lang.Object r5 = r2.L$2
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            java.lang.Object r6 = r2.L$1
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            java.lang.Object r7 = r2.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r3)
            r21 = r3
            r23 = r6
            r22 = r7
            r3 = r1
            r6 = r21
            r1 = r4
            r4 = r2
            r2 = 1
            goto L146
        Lf4:
            kotlin.ResultKt.throwOnFailure(r3)
            r1 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r30)
            r2.L$0 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r32)
            r2.L$1 = r5
            r5 = r33
            r2.L$2 = r5
            r6 = r31
            r2.Z$0 = r6
            r7 = 1
            r2.label = r7
            r5 = 0
            r6 = 0
            r17 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r18 = 0
            r16 = 0
            r19 = r18
            r18 = 4094(0xffe, float:5.737E-42)
            r20 = r19
            r19 = 0
            r21 = r1
            r17 = r2
            r1 = r4
            r2 = 1
            r4 = r30
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r4 = r17
            if (r3 != r1) goto L13d
            return r1
        L13d:
            r22 = r30
            r23 = r32
            r5 = r33
            r6 = r3
            r3 = r31
        L146:
            com.lagradost.nicehttp.NiceResponse r6 = (com.lagradost.nicehttp.NiceResponse) r6
            java.lang.String r24 = r6.toString()
            kotlin.text.Regex r6 = new kotlin.text.Regex
            java.lang.String r7 = "EP.video.player.vid = '([^']+)'"
            r6.<init>(r7)
            r7 = r24
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r8 = 0
            r9 = 2
            r10 = 0
            kotlin.text.MatchResult r6 = kotlin.text.Regex.find$default(r6, r7, r8, r9, r10)
            if (r6 == 0) goto L16e
            java.util.List r6 = r6.getGroupValues()
            if (r6 == 0) goto L16e
            java.lang.Object r6 = r6.get(r2)
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            goto L16f
        L16e:
            r7 = 0
        L16f:
            java.lang.String r6 = java.lang.String.valueOf(r7)
            kotlin.text.Regex r7 = new kotlin.text.Regex
            java.lang.String r10 = "EP.video.player.hash = '([^']+)'"
            r7.<init>(r10)
            r10 = r24
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r11 = 0
            kotlin.text.MatchResult r7 = kotlin.text.Regex.find$default(r7, r10, r8, r9, r11)
            if (r7 == 0) goto L192
            java.util.List r7 = r7.getGroupValues()
            if (r7 == 0) goto L192
            java.lang.Object r7 = r7.get(r2)
            java.lang.String r7 = (java.lang.String) r7
            goto L193
        L192:
            r7 = 0
        L193:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "https://www.eporner.com/xhr/video/"
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.StringBuilder r8 = r8.append(r6)
            java.lang.String r10 = "?hash="
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r10 = r0.base36(r7)
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r8 = r8.toString()
            com.lagradost.nicehttp.Requests r10 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r4.L$0 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)
            r4.L$1 = r11
            r4.L$2 = r5
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r4.L$3 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r4.L$4 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r4.L$5 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r4.L$6 = r11
            r4.Z$0 = r3
            r4.label = r9
            r9 = r5
            r5 = 0
            r11 = r6
            r6 = 0
            r12 = r7
            r7 = 0
            r17 = r4
            r4 = r8
            r8 = 0
            r13 = r9
            r9 = 0
            r14 = r3
            r3 = r10
            r10 = 0
            r15 = r11
            r11 = 0
            r16 = r12
            r18 = r13
            r12 = 0
            r19 = r14
            r14 = 0
            r25 = r15
            r15 = 0
            r26 = r16
            r16 = 0
            r27 = r18
            r18 = 4094(0xffe, float:5.737E-42)
            r28 = r19
            r19 = 0
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r3 != r1) goto L216
            return r1
        L216:
            r5 = r4
            r11 = r22
            r10 = r23
            r8 = r24
            r7 = r25
            r6 = r26
            r9 = r27
        L223:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            java.lang.String r3 = r3.toString()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>(r3)
            java.lang.String r12 = "sources"
            org.json.JSONObject r12 = r4.getJSONObject(r12)
            java.lang.String r13 = "mp4"
            org.json.JSONObject r13 = r12.getJSONObject(r13)
            java.util.Iterator r14 = r13.keys()
            r15 = r14
            r14 = r13
            r13 = r15
            r15 = r0
            r18 = r3
            r19 = r4
            r22 = r12
            r4 = r1
            r12 = r9
            r9 = r28
            r1 = r34
            r3 = r17
        L250:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L342
            r23 = 1
            java.lang.Object r2 = r13.next()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r0)
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r2 = r14.getJSONObject(r0)
            r30 = r0
            java.lang.String r0 = "src"
            java.lang.String r0 = r2.getString(r0)
            r31 = r0
            java.lang.String r0 = "labelShort"
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L27c
            java.lang.String r0 = ""
        L27c:
            java.lang.String r16 = r15.getName()
            java.lang.String r17 = r15.getName()
            com.lagradost.cloudstream3.utils.ExtractorLinkType r24 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getINFER_TYPE()
            r32 = r1
            com.GEporner.GEporner$loadLinks$2 r1 = new com.GEporner.GEporner$loadLinks$2
            r33 = r2
            r2 = 0
            r1.<init>(r0, r2)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r3.L$0 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r3.L$1 = r2
            r3.L$2 = r12
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r3.L$3 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r3.L$4 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r3.L$5 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r3.L$6 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r18)
            r3.L$7 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)
            r3.L$8 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r3.L$9 = r2
            r3.L$10 = r14
            r3.L$11 = r13
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r30)
            r3.L$12 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r33)
            r3.L$13 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r31)
            r3.L$14 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r3.L$15 = r2
            r3.L$16 = r12
            r3.Z$0 = r9
            r2 = 3
            r3.label = r2
            r2 = r13
            r13 = r17
            r17 = r3
            r3 = r12
            r12 = r16
            r16 = r1
            r1 = r15
            r15 = r24
            r24 = r14
            r14 = r31
            java.lang.Object r12 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink(r12, r13, r14, r15, r16, r17)
            if (r12 != r4) goto L30a
            return r4
        L30a:
            r16 = r2
            r15 = r3
            r2 = r9
            r13 = r11
            r25 = r22
            r9 = r0
            r0 = r8
            r11 = r10
            r3 = r12
            r10 = r14
            r22 = r21
            r14 = r30
            r12 = r33
            r8 = r15
            r21 = r19
            r19 = r18
            r18 = r1
            r1 = r32
        L325:
            r8.invoke(r3)
            r8 = r0
            r9 = r2
            r10 = r11
            r11 = r13
            r12 = r15
            r13 = r16
            r15 = r18
            r18 = r19
            r19 = r21
            r21 = r22
            r14 = r24
            r22 = r25
            r2 = 1
            r0 = r29
            r3 = r17
            goto L250
        L342:
            r23 = 1
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.GEporner.GEporner.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.GEporner.GEporner$loadLinks$2 */
    /* JADX INFO: compiled from: GEporner.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GEporner.GEporner$loadLinks$2", f = "GEporner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00042 extends SuspendLambda implements Function2<ExtractorLink, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $labelShort;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00042(String str, Continuation<? super C00042> continuation) {
            super(2, continuation);
            this.$labelShort = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00042 = GEporner.this.new C00042(this.$labelShort, continuation);
            c00042.L$0 = obj;
            return c00042;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        public final Object invoke(ExtractorLink extractorLink, Continuation<? super Unit> continuation) {
            return create(extractorLink, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object $result) {
            ExtractorLink $this$newExtractorLink = (ExtractorLink) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    $this$newExtractorLink.setReferer("");
                    $this$newExtractorLink.setQuality(GEporner.this.getIndexQuality(this.$labelShort));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @NotNull
    public final String base36(@NotNull String hash) {
        if (hash.length() >= 32) {
            String strSubstring = hash.substring(0, 8);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String part1 = new BigInteger(strSubstring, 16).toString(36);
            String strSubstring2 = hash.substring(8, 16);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            String part2 = new BigInteger(strSubstring2, 16).toString(36);
            String strSubstring3 = hash.substring(16, 24);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            String part3 = new BigInteger(strSubstring3, 16).toString(36);
            String strSubstring4 = hash.substring(24, 32);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
            String part4 = new BigInteger(strSubstring4, 16).toString(36);
            return part1 + part2 + part3 + part4;
        }
        throw new IllegalArgumentException("Hash length is invalid");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getIndexQuality(String str) {
        List groupValues;
        String str2;
        Integer intOrNull;
        MatchResult matchResultFind$default = Regex.find$default(new Regex("(\\d{3,4})[pP]"), str == null ? "" : str, 0, 2, (Object) null);
        return (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null || (str2 = (String) CollectionsKt.getOrNull(groupValues, 1)) == null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) ? Qualities.Unknown.getValue() : intOrNull.intValue();
    }
}
