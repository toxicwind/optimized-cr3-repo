package com.GPornOne;

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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jsoup.nodes.Element;

/* JADX INFO: compiled from: GPornOne.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/GPornOne/classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010&\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0096@¢\u0006\u0002\u0010-J\f\u0010.\u001a\u00020/*\u000200H\u0002J\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020/0$2\u0006\u00102\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u00103J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u00103JF\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u000e2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0;2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020=0;H\u0096@¢\u0006\u0002\u0010@R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006A"}, d2 = {"Lcom/GPornOne/GPornOne;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "lang", "getLang", "setLang", "hasDownloadSupport", "getHasDownloadSupport", "hasChromecastSupport", "getHasChromecastSupport", "hasQuickSearch", "getHasQuickSearch", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lorg/jsoup/nodes/Element;", "search", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GPornOne"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGPornOne.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GPornOne.kt\ncom/GPornOne/GPornOne\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1642#2,10:125\n1915#2:135\n1916#2:137\n1652#2:138\n1642#2,10:139\n1915#2:149\n1916#2:151\n1652#2:152\n1915#2,2:153\n1#3:136\n1#3:150\n*S KotlinDebug\n*F\n+ 1 GPornOne.kt\ncom/GPornOne/GPornOne\n*L\n45#1:125,10\n45#1:135\n45#1:137\n45#1:138\n73#1:139,10\n73#1:149\n73#1:151\n73#1:152\n106#1:153,2\n45#1:136\n73#1:150\n*E\n"})
public final class GPornOne extends MainAPI {

    @NotNull
    private String mainUrl = "https://pornone.com/gay";

    @NotNull
    private String name = "PornOneGay";
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
    private final List<MainPageData> mainPage = MainAPIKt.mainPageOf(new Pair[]{TuplesKt.to("/", "Latest Updates"), TuplesKt.to("/1080p/", "1080p"), TuplesKt.to("/720p/", "720p"), TuplesKt.to("/asian/", "Asian"), TuplesKt.to("/bisexual/", "Bi"), TuplesKt.to("/boy/", "Boy"), TuplesKt.to("/big-dick/", "Big Dick"), TuplesKt.to("/full-movie/", "Phim dài"), TuplesKt.to("/gangbang/", "Gang bang"), TuplesKt.to("/group-sex/", "Group"), TuplesKt.to("/love/", "Love"), TuplesKt.to("/orgy/", "Orgy"), TuplesKt.to("/romantic/", "Romantic"), TuplesKt.to("/foursome/", "Foursome"), TuplesKt.to("/search?q=fraternityx/", "FraternityX"), TuplesKt.to("/search?q=slamrush/", "SlRu")});

    /* JADX INFO: renamed from: com.GPornOne.GPornOne$getMainPage$1 */
    /* JADX INFO: compiled from: GPornOne.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GPornOne.GPornOne", f = "GPornOne.kt", i = {0, 0}, l = {44}, m = "getMainPage", n = {"request", "page"}, nl = {45}, s = {"L$0", "I$0"}, v = 2)
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
            return GPornOne.this.getMainPage(0, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.GPornOne.GPornOne$load$1 */
    /* JADX INFO: compiled from: GPornOne.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GPornOne.GPornOne", f = "GPornOne.kt", i = {0, 1, 1, 1, 1, 1, 1, 1}, l = {89, 97}, m = "load", n = {"url", "url", "document", "script", "jsonObj", "title", "poster", "description"}, nl = {90, -1}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"}, v = 2)
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
            return GPornOne.this.load(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.GPornOne.GPornOne$loadLinks$1 */
    /* JADX INFO: compiled from: GPornOne.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GPornOne.GPornOne", f = "GPornOne.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {104, 109}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "isCasting", "data", "subtitleCallback", "callback", "doc", "sources", "$this$forEach$iv", "element$iv", "item", "src", "quality", "isCasting", "$i$f$forEach", "$i$a$-forEach-GPornOne$loadLinks$2"}, nl = {105, 118}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "L$10", "Z$0", "I$0", "I$1"}, v = 2)
    static final class C00031 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
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
            return GPornOne.this.loadLinks(null, false, null, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.GPornOne.GPornOne$search$1 */
    /* JADX INFO: compiled from: GPornOne.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GPornOne.GPornOne", f = "GPornOne.kt", i = {0, 0, 0}, l = {69}, m = "search", n = {"query", "searchResponse", "i"}, nl = {73}, s = {"L$0", "L$1", "I$0"}, v = 2)
    static final class C00041 extends ContinuationImpl {
        int I$0;
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
            return GPornOne.this.search(null, (Continuation) this);
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [134=4] */
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
            boolean r3 = r2 instanceof com.GPornOne.GPornOne.C00001
            if (r3 == 0) goto L1a
            r3 = r2
            com.GPornOne.GPornOne$getMainPage$1 r3 = (com.GPornOne.GPornOne.C00001) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.GPornOne.GPornOne$getMainPage$1 r3 = new com.GPornOne.GPornOne$getMainPage$1
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
            goto Lab
        L46:
            kotlin.ResultKt.throwOnFailure(r4)
            r6 = r4
            com.lagradost.nicehttp.Requests r4 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r0.getMainUrl()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = r25.getData()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r1)
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
            r13 = 30
            r18 = r15
            r15 = 0
            r19 = r16
            r16 = 0
            r20 = 1
            r17 = 0
            r21 = r19
            r19 = 3838(0xefe, float:5.378E-42)
            r22 = 1
            r20 = 0
            r1 = r18
            r18 = r3
            r3 = r1
            r1 = 1
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            if (r4 != r3) goto La7
            return r3
        La7:
            r3 = r24
            r5 = r25
        Lab:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r4 = r4.getDocument()
            java.lang.String r6 = ".popbop.vidLinkFX"
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
        Lc9:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Le8
            java.lang.Object r14 = r13.next()
            r15 = r14
            r16 = 0
            r1 = r15
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            r19 = 0
            com.lagradost.cloudstream3.SearchResponse r1 = r0.toSearchResult(r1)
            if (r1 == 0) goto Le6
            r19 = 0
            r8.add(r1)
        Le6:
            r1 = 1
            goto Lc9
        Le8:
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
        throw new UnsupportedOperationException("Method not decompiled: com.GPornOne.GPornOne.getMainPage(int, com.lagradost.cloudstream3.MainPageRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final SearchResponse toSearchResult(Element $this$toSearchResult) {
        String title = $this$toSearchResult.select(".videotitle").text();
        String href = $this$toSearchResult.attr("href");
        final Ref.ObjectRef posterUrl = new Ref.ObjectRef();
        posterUrl.element = $this$toSearchResult.select(".imgvideo").attr("data-src");
        if (((CharSequence) posterUrl.element).length() == 0) {
            posterUrl.element = $this$toSearchResult.select(".imgvideo").attr("src");
        }
        return MainAPIKt.newMovieSearchResponse$default(this, title, href, TvType.Movie, false, new Function1() { // from class: com.GPornOne.GPornOne$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(Object obj) {
                return GPornOne.toSearchResult$lambda$0(posterUrl, (MovieSearchResponse) obj);
            }
        }, 8, (Object) null);
    }

    static final Unit toSearchResult$lambda$0(Ref.ObjectRef $posterUrl, MovieSearchResponse $this$newMovieSearchResponse) {
        $this$newMovieSearchResponse.setPosterUrl((String) $posterUrl.element);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [148=4] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0145  */
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
            boolean r1 = r0 instanceof com.GPornOne.GPornOne.C00041
            if (r1 == 0) goto L18
            r1 = r0
            com.GPornOne.GPornOne$search$1 r1 = (com.GPornOne.GPornOne.C00041) r1
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
            com.GPornOne.GPornOne$search$1 r1 = new com.GPornOne.GPornOne$search$1
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
            if (r5 >= r7) goto L145
            com.lagradost.nicehttp.Requests r7 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r21.getMainUrl()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = "/search/gay/"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r5)
            java.lang.String r9 = "?q="
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
            r12 = 30
            r18 = r14
            r14 = 0
            r19 = r15
            r15 = 0
            r22 = r16
            r16 = 0
            r23 = r18
            r18 = 3838(0xefe, float:5.378E-42)
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
            java.lang.String r8 = ".popbop.vidLinkFX"
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
            r8 = r0
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r6.containsAll(r8)
            if (r8 != 0) goto L13d
            r8 = r0
            java.util.Collection r8 = (java.util.Collection) r8
            r6.addAll(r8)
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L13e
            int r5 = r5 + 1
            r21 = r7
            r3 = r17
            r0 = r27
            goto L60
        L13d:
        L13e:
            r0 = r27
            r21 = r7
            r3 = r17
            goto L14d
        L145:
            r23 = r0
            r17 = r3
            r24 = r5
            r22 = r6
        L14d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.GPornOne.GPornOne.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(@org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.LoadResponse> r22) throws org.json.JSONException {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof com.GPornOne.GPornOne.C00011
            if (r2 == 0) goto L18
            r2 = r1
            com.GPornOne.GPornOne$load$1 r2 = (com.GPornOne.GPornOne.C00011) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.GPornOne.GPornOne$load$1 r2 = new com.GPornOne.GPornOne$load$1
            r2.<init>(r1)
        L1d:
            r9 = r2
            java.lang.Object r2 = r9.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r9.label
            switch(r4) {
                case 0: goto L5a;
                case 1: goto L4f;
                case 2: goto L31;
                default: goto L29;
            }
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L31:
            java.lang.Object r3 = r9.L$6
            java.lang.Object r4 = r9.L$5
            java.lang.Object r5 = r9.L$4
            java.lang.Object r6 = r9.L$3
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.lang.Object r7 = r9.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r9.L$1
            org.jsoup.nodes.Document r8 = (org.jsoup.nodes.Document) r8
            java.lang.Object r10 = r9.L$0
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r2)
            r0 = r2
            r17 = r9
            goto L109
        L4f:
            java.lang.Object r4 = r9.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.ResultKt.throwOnFailure(r2)
            r0 = r3
            r5 = r4
            r3 = r2
            goto L8a
        L5a:
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
            if (r3 != r0) goto L88
            return r0
        L88:
            r5 = r21
        L8a:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r10 = r3.getDocument()
            java.lang.String r3 = "script[data-react-helmet=\"true\"]"
            org.jsoup.select.Elements r3 = r10.select(r3)
            java.lang.String r11 = r3.html()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r11)
            r12 = r3
            java.lang.String r3 = "name"
            java.lang.Object r13 = r12.get(r3)
            java.lang.String r3 = "thumbnailUrl"
            org.json.JSONArray r3 = r12.getJSONArray(r3)
            r4 = 0
            java.lang.Object r14 = r3.get(r4)
            java.lang.String r3 = "description"
            java.lang.Object r15 = r12.get(r3)
            r3 = r20
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            java.lang.String r4 = r13.toString()
            com.lagradost.cloudstream3.TvType r6 = com.lagradost.cloudstream3.TvType.NSFW
            com.GPornOne.GPornOne$load$2 r7 = new com.GPornOne.GPornOne$load$2
            r8 = 0
            r7.<init>(r14, r15, r8)
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r9.L$0 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r9.L$1 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r9.L$2 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r9.L$3 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r9.L$4 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r9.L$5 = r7
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r9.L$6 = r7
            r7 = 2
            r9.label = r7
            r7 = r5
            java.lang.Object r3 = com.lagradost.cloudstream3.MainAPIKt.newMovieLoadResponse(r3, r4, r5, r6, r7, r8, r9)
            r17 = r9
            if (r3 != r0) goto L101
            return r0
        L101:
            r0 = r3
            r8 = r10
            r7 = r11
            r6 = r12
            r4 = r14
            r3 = r15
            r10 = r5
            r5 = r13
        L109:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.GPornOne.GPornOne.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.GPornOne.GPornOne$load$2 */
    /* JADX INFO: compiled from: GPornOne.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.GPornOne.GPornOne$load$2", f = "GPornOne.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00022 extends SuspendLambda implements Function2<MovieLoadResponse, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $description;
        final /* synthetic */ Object $poster;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00022(Object obj, Object obj2, Continuation<? super C00022> continuation) {
            super(2, continuation);
            this.$poster = obj;
            this.$description = obj2;
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
                    $this$newMovieLoadResponse.setPosterUrl(this.$poster.toString());
                    $this$newMovieLoadResponse.setPlot(this.$description.toString());
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x01a8 -> B:25:0x01bb). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadLinks(@org.jetbrains.annotations.NotNull java.lang.String r26, boolean r27, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r28, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r29, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r30) {
        /*
            r25 = this;
            r0 = r30
            boolean r1 = r0 instanceof com.GPornOne.GPornOne.C00031
            if (r1 == 0) goto L18
            r1 = r0
            com.GPornOne.GPornOne$loadLinks$1 r1 = (com.GPornOne.GPornOne.C00031) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            r2 = r25
            goto L1f
        L18:
            com.GPornOne.GPornOne$loadLinks$1 r1 = new com.GPornOne.GPornOne$loadLinks$1
            r2 = r25
            r1.<init>(r0)
        L1f:
            java.lang.Object r3 = r1.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r1.label
            switch(r5) {
                case 0: goto La7;
                case 1: goto L8d;
                case 2: goto L34;
                default: goto L2a;
            }
        L2a:
            r17 = r1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            int r5 = r1.I$1
            int r7 = r1.I$0
            boolean r8 = r1.Z$0
            java.lang.Object r9 = r1.L$11
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r1.L$10
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r1.L$9
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r1.L$8
            org.jsoup.nodes.Element r12 = (org.jsoup.nodes.Element) r12
            java.lang.Object r13 = r1.L$7
            java.lang.Object r14 = r1.L$6
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r15 = r1.L$5
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.lang.Object r6 = r1.L$4
            org.jsoup.select.Elements r6 = (org.jsoup.select.Elements) r6
            java.lang.Object r0 = r1.L$3
            org.jsoup.nodes.Document r0 = (org.jsoup.nodes.Document) r0
            r27 = r0
            java.lang.Object r0 = r1.L$2
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r29 = r0
            java.lang.Object r0 = r1.L$1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r28 = r0
            java.lang.Object r0 = r1.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r3)
            r23 = r29
            r17 = r2
            r2 = r3
            r19 = r8
            r21 = r12
            r16 = r15
            r20 = 1
            r8 = r0
            r15 = r1
            r1 = r4
            r12 = r11
            r4 = r27
            r0 = r30
            r11 = r10
            r10 = r9
            r9 = r7
            r7 = r28
            goto L1bb
        L8d:
            boolean r0 = r1.Z$0
            java.lang.Object r5 = r1.L$2
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            java.lang.Object r6 = r1.L$1
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            java.lang.Object r7 = r1.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r1
            r1 = r4
            r20 = 1
            r4 = r3
            r3 = r0
            r0 = r4
            goto Lf2
        La7:
            kotlin.ResultKt.throwOnFailure(r3)
            r0 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)
            r1.L$0 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r28)
            r1.L$1 = r5
            r5 = r29
            r1.L$2 = r5
            r6 = r27
            r1.Z$0 = r6
            r7 = 1
            r1.label = r7
            r5 = 0
            r6 = 0
            r16 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 1
            r16 = 0
            r18 = 4094(0xffe, float:5.737E-42)
            r19 = 0
            r17 = r1
            r1 = r4
            r20 = 1
            r4 = r26
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r3 != r1) goto Le9
            return r1
        Le9:
            r7 = r26
            r6 = r28
            r5 = r29
            r4 = r3
            r3 = r27
        Lf2:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r4 = r4.getDocument()
            java.lang.String r8 = "#pornone-video-player source"
            org.jsoup.select.Elements r8 = r4.select(r8)
            r9 = r8
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r10 = 0
            java.util.Iterator r11 = r9.iterator()
            r13 = r10
            r10 = r5
            r5 = r8
            r8 = r13
            r16 = r9
            r13 = r17
            r17 = r2
            r9 = r3
            r3 = r0
            r0 = r30
        L114:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L1ce
            java.lang.Object r18 = r11.next()
            r12 = r18
            org.jsoup.nodes.Element r12 = (org.jsoup.nodes.Element) r12
            r14 = 0
            java.lang.String r15 = "src"
            java.lang.String r15 = r12.attr(r15)
            r26 = r0
            java.lang.String r0 = "res"
            java.lang.String r0 = r12.attr(r0)
            java.lang.String r19 = r17.getName()
            java.lang.String r21 = r17.getName()
            com.GPornOne.GPornOne$loadLinks$2$1 r2 = new com.GPornOne.GPornOne$loadLinks$2$1
            r27 = r3
            r3 = 0
            r2.<init>(r0, r3)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r13.L$0 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r13.L$1 = r3
            r13.L$2 = r10
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r13.L$3 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r13.L$4 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r13.L$5 = r3
            r13.L$6 = r11
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r18)
            r13.L$7 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r13.L$8 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r13.L$9 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r13.L$10 = r3
            r13.L$11 = r10
            r13.Z$0 = r9
            r13.I$0 = r8
            r13.I$1 = r14
            r3 = 2
            r13.label = r3
            r3 = r11
            r11 = 0
            r22 = r14
            r14 = 8
            r23 = r10
            r10 = r15
            r15 = 0
            r24 = r12
            r12 = r2
            r2 = r8
            r8 = r19
            r19 = r9
            r9 = r21
            r21 = r24
            java.lang.Object r8 = com.lagradost.cloudstream3.utils.ExtractorApiKt.newExtractorLink$default(r8, r9, r10, r11, r12, r13, r14, r15)
            if (r8 != r1) goto L1a8
            return r1
        L1a8:
            r11 = r0
            r9 = r2
            r14 = r3
            r3 = r8
            r12 = r10
            r15 = r13
            r13 = r18
            r10 = r23
            r0 = r26
            r2 = r27
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r22
        L1bb:
            r10.invoke(r3)
            r3 = r2
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r11 = r14
            r13 = r15
            r9 = r19
            r10 = r23
            r2 = r25
            goto L114
        L1ce:
            r26 = r0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.GPornOne.GPornOne.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
