package com.Gayxx;

import com.Gayxx.Gayxx;
import com.lagradost.api.Log;
import com.lagradost.cloudstream3.MainAPI;
import com.lagradost.cloudstream3.MainAPIKt;
import com.lagradost.cloudstream3.MainPageData;
import com.lagradost.cloudstream3.MovieLoadResponse;
import com.lagradost.cloudstream3.MovieSearchResponse;
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

/* JADX INFO: compiled from: Gayxx.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Gayxx/classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010&\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0096@¢\u0006\u0002\u0010-J\u000e\u0010.\u001a\u0004\u0018\u00010/*\u000200H\u0002J\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020/0$2\u0006\u00102\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u00103J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u00103JF\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u000e2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0;2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020=0;H\u0096@¢\u0006\u0002\u0010@R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006A"}, d2 = {"Lcom/Gayxx/Gayxx;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "lang", "getLang", "setLang", "hasQuickSearch", "getHasQuickSearch", "hasChromecastSupport", "getHasChromecastSupport", "hasDownloadSupport", "getHasDownloadSupport", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lorg/jsoup/nodes/Element;", "search", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Gayxx"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGayxx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gayxx.kt\ncom/Gayxx/Gayxx\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1642#2,10:203\n1915#2:213\n1916#2:215\n1652#2:216\n296#2,2:218\n1642#2,10:220\n1915#2:230\n1916#2:232\n1652#2:233\n1915#2:234\n1916#2:236\n1915#2,2:237\n1915#2,2:239\n1#3:214\n1#3:217\n1#3:231\n1#3:235\n*S KotlinDebug\n*F\n+ 1 Gayxx.kt\ncom/Gayxx/Gayxx\n*L\n50#1:203,10\n50#1:213\n50#1:215\n50#1:216\n84#1:218,2\n115#1:220,10\n115#1:230\n115#1:232\n115#1:233\n151#1:234\n151#1:236\n162#1:237,2\n173#1:239,2\n50#1:214\n115#1:231\n*E\n"})
public final class Gayxx extends MainAPI {

    @NotNull
    private String mainUrl = "https://japangaysex.com";

    @NotNull
    private String name = "Gayxx 🖕";
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
    private final List<MainPageData> mainPage = MainAPIKt.mainPageOf(new Pair[]{TuplesKt.to("/", "Latest"), TuplesKt.to("/tag/gay-viet/", "Việt Nam Y"), TuplesKt.to("/tag/gay-chinese/", "Tung Của"), TuplesKt.to("/category/a/", "A"), TuplesKt.to("/tag/group/", "Nhóm"), TuplesKt.to("/tag/magazine/", "Magazine"), TuplesKt.to("/tag/gay-korea/", "Hàn Xẻng"), TuplesKt.to("/category/sex-gay-onlyfans-korea/", "Hàn Xẻng Quốc"), TuplesKt.to("/asian-gay-onlyfans-sex/?type=today/", "Nóng nhất"), TuplesKt.to("/category/asian-gay-sex/", "Asian"), TuplesKt.to("/category/sex-gay-onlyfans-thailand/", "Thái lẻn"), TuplesKt.to("/category/asian-gay-onlyfans-sex/", "Asians Onlyfans"), TuplesKt.to("/category/asian-gay-group-sex/", "Càng đông càng vui"), TuplesKt.to("/category/sex-gay-onlyfans-viet-nam/", "Việt Nam ngày nay"), TuplesKt.to("/category/sex-gay-onlyfans-chinese/", "Tung Của")});

    /* JADX INFO: renamed from: com.Gayxx.Gayxx$getMainPage$1 */
    /* JADX INFO: compiled from: Gayxx.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gayxx.Gayxx", f = "Gayxx.kt", i = {0, 0, 0}, l = {49}, m = "getMainPage", n = {"request", "pageUrl", "page"}, nl = {50}, s = {"L$0", "L$1", "I$0"}, v = 2)
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
            return Gayxx.this.getMainPage(0, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Gayxx.Gayxx$load$1 */
    /* JADX INFO: compiled from: Gayxx.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gayxx.Gayxx", f = "Gayxx.kt", i = {0, 1, 1, 1, 1, 1}, l = {124, 130}, m = "load", n = {"url", "url", "document", "title", "poster", "description"}, nl = {126, -1}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
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
            return Gayxx.this.load(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Gayxx.Gayxx$loadLinks$1 */
    /* JADX INFO: compiled from: Gayxx.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gayxx.Gayxx", f = "Gayxx.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {143, 184}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "isCasting", "data", "subtitleCallback", "callback", "document", "found", "urls", "vipRegex", "isCasting"}, nl = {144, 198}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0"}, v = 2)
    static final class C00081 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
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
            return Gayxx.this.loadLinks(null, false, null, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Gayxx.Gayxx$search$1 */
    /* JADX INFO: compiled from: Gayxx.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gayxx.Gayxx", f = "Gayxx.kt", i = {0, 0, 0}, l = {113}, m = "search", n = {"query", "searchResponse", "i"}, nl = {115}, s = {"L$0", "L$1", "I$0"}, v = 2)
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
            return Gayxx.this.search(null, (Continuation) this);
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [212=4] */
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
            boolean r3 = r2 instanceof com.Gayxx.Gayxx.C00051
            if (r3 == 0) goto L1a
            r3 = r2
            com.Gayxx.Gayxx$getMainPage$1 r3 = (com.Gayxx.Gayxx.C00051) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.Gayxx.Gayxx$getMainPage$1 r3 = new com.Gayxx.Gayxx$getMainPage$1
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
            goto Ldc
        L46:
            kotlin.ResultKt.throwOnFailure(r4)
            if (r1 != r7) goto L65
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r0.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = r25.getData()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            goto L8e
        L65:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r0.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = r25.getData()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = "page/"
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r1)
            r8 = 47
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
        L8e:
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
            if (r4 != r1) goto Ld8
            return r1
        Ld8:
            r1 = r24
            r6 = r25
        Ldc:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r4 = r4.getDocument()
            java.lang.String r7 = "div.videopost"
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
        Lfa:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L11b
            java.lang.Object r15 = r14.next()
            r16 = r15
            r17 = 0
            r2 = r16
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            r19 = 0
            com.lagradost.cloudstream3.SearchResponse r2 = r0.toSearchResult(r2)
            if (r2 == 0) goto L119
            r19 = 0
            r9.add(r2)
        L119:
            r2 = 1
            goto Lfa
        L11b:
            r2 = r9
            java.util.List r2 = (java.util.List) r2
            java.lang.String r7 = "a.next.page-numbers, a.next, li.next a, .pagination a.next"
            org.jsoup.select.Elements r7 = r4.select(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r7 = kotlin.collections.CollectionsKt.any(r7)
            com.lagradost.cloudstream3.HomePageList r8 = new com.lagradost.cloudstream3.HomePageList
            java.lang.String r9 = r6.getName()
            r14 = 1
            r8.<init>(r9, r2, r14)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            com.lagradost.cloudstream3.HomePageResponse r8 = com.lagradost.cloudstream3.MainAPIKt.newHomePageResponse(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Gayxx.Gayxx.getMainPage(int, com.lagradost.cloudstream3.MainPageRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [82=4, 83=4, 84=5, 91=4, 92=4, 98=4] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.lagradost.cloudstream3.SearchResponse toSearchResult(org.jsoup.nodes.Element r19) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "div.deno.video-title a"
            org.jsoup.nodes.Element r1 = r0.selectFirst(r1)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            java.lang.String r3 = r1.text()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r3 = kotlin.text.StringsKt.trim(r3)
            java.lang.String r5 = r3.toString()
            r3 = r18
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            java.lang.String r4 = "href"
            java.lang.String r4 = r1.attr(r4)
            java.lang.String r6 = com.lagradost.cloudstream3.MainAPIKt.fixUrl(r3, r4)
            java.lang.String r3 = "div.thumb-img img, a.thumb-video img, picture img, img[data-src], img[data-srcset]"
            org.jsoup.nodes.Element r3 = r0.selectFirst(r3)
            r4 = 1
            r7 = 2
            r8 = 0
            if (r3 == 0) goto Laa
            r9 = r3
            r10 = 0
            java.lang.String r11 = "data-src"
            java.lang.String r11 = r9.attr(r11)
            r12 = r11
            r13 = 0
            r14 = r12
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            boolean r14 = kotlin.text.StringsKt.isBlank(r14)
            if (r14 != 0) goto L49
            goto L4a
        L49:
            r11 = r2
        L4a:
            if (r11 != 0) goto La8
        L4e:
            java.lang.String r11 = "data-srcset"
            java.lang.String r11 = r9.attr(r11)
            r12 = r11
            r13 = 0
            r14 = r12
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            boolean r14 = kotlin.text.StringsKt.isBlank(r14)
            if (r14 != 0) goto L60
            goto L61
        L60:
            r11 = r2
        L61:
            if (r11 == 0) goto L9f
            r12 = r11
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            char[] r13 = new char[r4]
            r11 = 32
            r13[r8] = r11
            r16 = 6
            r17 = 0
            r14 = 0
            r15 = 0
            java.util.List r11 = kotlin.text.StringsKt.split$default(r12, r13, r14, r15, r16, r17)
            if (r11 == 0) goto L9f
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            r12 = 0
            java.util.Iterator r13 = r11.iterator()
        L80:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L9a
            java.lang.Object r14 = r13.next()
            r15 = r14
            java.lang.String r15 = (java.lang.String) r15
            r16 = 0
            java.lang.String r4 = "http"
            boolean r4 = kotlin.text.StringsKt.startsWith$default(r15, r4, r8, r7, r2)
            if (r4 == 0) goto L98
            goto L9b
        L98:
            r4 = 1
            goto L80
        L9a:
            r14 = r2
        L9b:
            java.lang.String r14 = (java.lang.String) r14
            r11 = r14
            goto La0
        L9f:
            r11 = r2
        La0:
            if (r11 != 0) goto La8
            java.lang.String r4 = "src"
            java.lang.String r11 = r9.attr(r4)
        La8:
            if (r11 != 0) goto Le4
        Laa:
            r4 = r19
            r9 = 0
            java.lang.String r10 = "div.thumb-img"
            org.jsoup.nodes.Element r10 = r4.selectFirst(r10)
            if (r10 == 0) goto Le1
            r11 = 0
            kotlin.text.Regex r12 = new kotlin.text.Regex
            java.lang.String r13 = "url\\(['\"]?(.*?)['\"]?\\)"
            r12.<init>(r13)
            java.lang.String r13 = "style"
            java.lang.String r13 = r10.attr(r13)
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            kotlin.text.MatchResult r7 = kotlin.text.Regex.find$default(r12, r13, r8, r7, r2)
            if (r7 == 0) goto Ldd
        Lce:
            java.util.List r7 = r7.getGroupValues()
            if (r7 == 0) goto Ldd
        Ld5:
            r8 = 1
            java.lang.Object r7 = kotlin.collections.CollectionsKt.getOrNull(r7, r8)
            java.lang.String r7 = (java.lang.String) r7
            goto Lde
        Ldd:
            r7 = r2
        Lde:
            r11 = r7
            goto Le2
        Le1:
            r11 = r2
        Le2:
        Le4:
            r12 = r11
            if (r12 == 0) goto L104
        Lea:
            r16 = 4
            r17 = 0
            java.lang.String r13 = "&amp;"
            java.lang.String r14 = "&"
            r15 = 0
            java.lang.String r4 = kotlin.text.StringsKt.replace$default(r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L104
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r2 = kotlin.text.StringsKt.trim(r4)
            java.lang.String r2 = r2.toString()
            goto L105
        L104:
        L105:
            r4 = r18
            com.lagradost.cloudstream3.MainAPI r4 = (com.lagradost.cloudstream3.MainAPI) r4
            java.lang.String r13 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r4, r2)
            r4 = r18
            com.lagradost.cloudstream3.MainAPI r4 = (com.lagradost.cloudstream3.MainAPI) r4
            com.lagradost.cloudstream3.TvType r7 = com.lagradost.cloudstream3.TvType.NSFW
            com.Gayxx.Gayxx$$ExternalSyntheticLambda0 r9 = new com.Gayxx.Gayxx$$ExternalSyntheticLambda0
            r9.<init>()
            r10 = 8
            r11 = 0
            r8 = 0
            com.lagradost.cloudstream3.MovieSearchResponse r4 = com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse$default(r4, r5, r6, r7, r8, r9, r10, r11)
            com.lagradost.cloudstream3.SearchResponse r4 = (com.lagradost.cloudstream3.SearchResponse) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Gayxx.Gayxx.toSearchResult(org.jsoup.nodes.Element):com.lagradost.cloudstream3.SearchResponse");
    }

    static final Unit toSearchResult$lambda$2(String $poster, MovieSearchResponse $this$newMovieSearchResponse) {
        if ($poster != null) {
            $this$newMovieSearchResponse.setPosterUrl($poster);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [229=4] */
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
            boolean r1 = r0 instanceof com.Gayxx.Gayxx.C00101
            if (r1 == 0) goto L18
            r1 = r0
            com.Gayxx.Gayxx$search$1 r1 = (com.Gayxx.Gayxx.C00101) r1
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
            com.Gayxx.Gayxx$search$1 r1 = new com.Gayxx.Gayxx$search$1
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
            java.lang.String r8 = "div.videopost"
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
        throw new UnsupportedOperationException("Method not decompiled: com.Gayxx.Gayxx.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
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
            boolean r2 = r1 instanceof com.Gayxx.Gayxx.C00061
            if (r2 == 0) goto L18
            r2 = r1
            com.Gayxx.Gayxx$load$1 r2 = (com.Gayxx.Gayxx.C00061) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Gayxx.Gayxx$load$1 r2 = new com.Gayxx.Gayxx$load$1
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
            com.lagradost.cloudstream3.TvType r6 = com.lagradost.cloudstream3.TvType.NSFW
            com.Gayxx.Gayxx$load$2 r8 = new com.Gayxx.Gayxx$load$2
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
        throw new UnsupportedOperationException("Method not decompiled: com.Gayxx.Gayxx.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.Gayxx.Gayxx$load$2 */
    /* JADX INFO: compiled from: Gayxx.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gayxx.Gayxx$load$2", f = "Gayxx.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadLinks(@org.jetbrains.annotations.NotNull java.lang.String r34, boolean r35, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r36, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r37, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r38) {
        /*
            r33 = this;
            r0 = r38
            boolean r1 = r0 instanceof com.Gayxx.Gayxx.C00081
            if (r1 == 0) goto L18
            r1 = r0
            com.Gayxx.Gayxx$loadLinks$1 r1 = (com.Gayxx.Gayxx.C00081) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            r2 = r33
            goto L1f
        L18:
            com.Gayxx.Gayxx$loadLinks$1 r1 = new com.Gayxx.Gayxx$loadLinks$1
            r2 = r33
            r1.<init>(r0)
        L1f:
            java.lang.Object r3 = r1.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r1.label
            java.lang.String r6 = " ==="
            r7 = 1
            java.lang.String r8 = "Gaxx"
            switch(r5) {
                case 0: goto L7f;
                case 1: goto L61;
                case 2: goto L38;
                default: goto L2f;
            }
        L2f:
            r4 = r1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            boolean r4 = r1.Z$0
            java.lang.Object r5 = r1.L$6
            kotlin.text.Regex r5 = (kotlin.text.Regex) r5
            java.lang.Object r7 = r1.L$5
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r9 = r1.L$4
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref.BooleanRef) r9
            java.lang.Object r10 = r1.L$3
            org.jsoup.nodes.Document r10 = (org.jsoup.nodes.Document) r10
            java.lang.Object r11 = r1.L$2
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            java.lang.Object r12 = r1.L$1
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            java.lang.Object r13 = r1.L$0
            java.lang.String r13 = (java.lang.String) r13
            kotlin.ResultKt.throwOnFailure(r3)
            r20 = r3
            r3 = r4
            r0 = r6
            r2 = r8
            r4 = r1
            goto L36f
        L61:
            boolean r5 = r1.Z$0
            java.lang.Object r9 = r1.L$2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r1.L$1
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r11 = r1.L$0
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r3)
            r0 = r4
            r4 = r1
            r1 = r0
            r20 = r3
            r0 = r6
            r2 = r8
            r7 = r10
            r6 = r11
            r3 = r5
            r5 = r20
            goto Ld8
        L7f:
            kotlin.ResultKt.throwOnFailure(r3)
            r5 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            r9 = r34
            r1.L$0 = r9
            r10 = r36
            r1.L$1 = r10
            r11 = r37
            r1.L$2 = r11
            r12 = r35
            r1.Z$0 = r12
            r1.label = r7
            r13 = r5
            r5 = 0
            r14 = r6
            r6 = 0
            r15 = 1
            r7 = 0
            r16 = r8
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r17 = r13
            r12 = 0
            r18 = r14
            r14 = 0
            r19 = 1
            r15 = 0
            r20 = r16
            r16 = 0
            r21 = r18
            r18 = 4094(0xffe, float:5.737E-42)
            r22 = 1
            r19 = 0
            r2 = r20
            r0 = r21
            r20 = r17
            r17 = r1
            r1 = r4
            r4 = r34
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r4 = r17
            if (r3 != r1) goto Lcf
            return r1
        Lcf:
            r6 = r34
            r7 = r36
            r9 = r37
            r5 = r3
            r3 = r35
        Ld8:
            com.lagradost.nicehttp.NiceResponse r5 = (com.lagradost.nicehttp.NiceResponse) r5
            org.jsoup.nodes.Document r11 = r5.getDocument()
            com.lagradost.api.Log r5 = com.lagradost.api.Log.INSTANCE
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "=== LOAD LINKS for: "
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.StringBuilder r8 = r8.append(r6)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            r5.d(r2, r8)
            com.lagradost.api.Log r5 = com.lagradost.api.Log.INSTANCE
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "Document title: "
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r10 = "title"
            org.jsoup.nodes.Element r10 = r11.selectFirst(r10)
            if (r10 == 0) goto L115
            java.lang.String r10 = r10.text()
            if (r10 != 0) goto L117
        L115:
            java.lang.String r10 = "no title"
        L117:
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r8 = r8.toString()
            r5.d(r2, r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
            r8.<init>()
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            r12 = r5
            java.util.Set r12 = (java.util.Set) r12
            java.lang.String r5 = "div.yolo-player-container iframe[src]"
            org.jsoup.select.Elements r5 = r11.select(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r10 = 0
            java.util.Iterator r13 = r5.iterator()
        L13c:
            boolean r14 = r13.hasNext()
            java.lang.String r15 = "http"
            r35 = r5
            if (r14 == 0) goto L1d7
            java.lang.Object r14 = r13.next()
            r5 = r14
            org.jsoup.nodes.Element r5 = (org.jsoup.nodes.Element) r5
            r16 = 0
            r17 = r6
            java.lang.String r6 = "src"
            java.lang.String r6 = r5.attr(r6)
            r37 = r6
            r18 = 0
            r19 = r37
            java.lang.CharSequence r19 = (java.lang.CharSequence) r19
            boolean r19 = kotlin.text.StringsKt.isBlank(r19)
            if (r19 != 0) goto L174
            r19 = r5
            r5 = r37
            r37 = r6
            r6 = 1
            boolean r15 = kotlin.text.StringsKt.startsWith(r5, r15, r6)
            if (r15 == 0) goto L17a
            r5 = 1
            goto L17b
        L174:
            r19 = r5
            r5 = r37
            r37 = r6
        L17a:
            r5 = 0
        L17b:
            if (r5 == 0) goto L180
            r5 = r37
            goto L181
        L180:
            r5 = 0
        L181:
            com.lagradost.api.Log r6 = com.lagradost.api.Log.INSTANCE
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r37 = r7
            java.lang.String r7 = "Found iframe src: "
            java.lang.StringBuilder r7 = r15.append(r7)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r7 = r7.toString()
            r6.d(r2, r7)
            if (r5 == 0) goto L1cb
            r6 = r5
            r7 = 0
            r15 = r6
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            java.lang.CharSequence r15 = kotlin.text.StringsKt.trim(r15)
            java.lang.String r15 = r15.toString()
            r12.add(r15)
            com.lagradost.api.Log r15 = com.lagradost.api.Log.INSTANCE
            r34 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r36 = r7
            java.lang.String r7 = "Added iframe URL: "
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r15.d(r2, r5)
            goto L1cd
        L1cb:
            r34 = r5
        L1cd:
            r5 = r35
            r7 = r37
            r6 = r17
            goto L13c
        L1d7:
            r17 = r6
            r37 = r7
            kotlin.text.Regex r5 = new kotlin.text.Regex
            java.lang.String r6 = "switchServer\\('([^']+)'"
            r5.<init>(r6)
            r13 = r5
            java.lang.String r5 = "div.vip-links-container a.vip-link[onclick]"
            org.jsoup.select.Elements r5 = r11.select(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L1f0:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L268
            java.lang.Object r10 = r7.next()
            r14 = r10
            org.jsoup.nodes.Element r14 = (org.jsoup.nodes.Element) r14
            r16 = 0
            r18 = r5
            java.lang.String r5 = "onclick"
            java.lang.String r5 = r14.attr(r5)
            r19 = r6
            com.lagradost.api.Log r6 = com.lagradost.api.Log.INSTANCE
            r21 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r23 = r8
            java.lang.String r8 = "Found VIP onclick: "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r7 = r7.toString()
            r6.d(r2, r7)
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r34 = r5
            r5 = 0
            r7 = 2
            r8 = 0
            kotlin.text.MatchResult r6 = kotlin.text.Regex.find$default(r13, r6, r8, r7, r5)
            if (r6 == 0) goto L25d
            kotlin.text.MatchGroupCollection r6 = r6.getGroups()
            if (r6 == 0) goto L25d
            r7 = 1
            kotlin.text.MatchGroup r6 = r6.get(r7)
            if (r6 == 0) goto L25d
            java.lang.String r6 = r6.getValue()
            if (r6 == 0) goto L25d
            r24 = 0
            boolean r25 = kotlin.text.StringsKt.startsWith(r6, r15, r7)
            if (r25 == 0) goto L25c
            r7 = r6
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.CharSequence r7 = kotlin.text.StringsKt.trim(r7)
            java.lang.String r7 = r7.toString()
            r12.add(r7)
        L25c:
        L25d:
            r5 = r18
            r6 = r19
            r7 = r21
            r8 = r23
            goto L1f0
        L268:
            r18 = r5
            r19 = r6
            r23 = r8
            r5 = 0
            java.lang.String r6 = "div.download-buttons a.download-btn[href]"
            org.jsoup.select.Elements r6 = r11.select(r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r7 = 0
            java.util.Iterator r8 = r6.iterator()
        L27c:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L2dd
            java.lang.Object r10 = r8.next()
            r14 = r10
            org.jsoup.nodes.Element r14 = (org.jsoup.nodes.Element) r14
            r16 = 0
            java.lang.String r5 = "href"
            java.lang.String r5 = r14.attr(r5)
            r34 = r5
            r18 = 0
            r19 = r5
            r34 = r6
            r6 = 1
            boolean r5 = kotlin.text.StringsKt.startsWith(r5, r15, r6)
            if (r5 == 0) goto L2a3
            r5 = r19
            goto L2a4
        L2a3:
            r5 = 0
        L2a4:
            com.lagradost.api.Log r6 = com.lagradost.api.Log.INSTANCE
            r18 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r21 = r8
            java.lang.String r8 = "Found download button: "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r7 = r7.toString()
            r6.d(r2, r7)
            if (r5 == 0) goto L2d4
            r6 = r5
            r7 = 0
            r8 = r6
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.CharSequence r8 = kotlin.text.StringsKt.trim(r8)
            java.lang.String r8 = r8.toString()
            r12.add(r8)
        L2d4:
            r6 = r34
            r7 = r18
            r8 = r21
            r5 = 0
            goto L27c
        L2dd:
            r34 = r6
            r18 = r7
            com.lagradost.api.Log r5 = com.lagradost.api.Log.INSTANCE
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "All URLs found ("
            java.lang.StringBuilder r6 = r6.append(r7)
            int r7 = r12.size()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = "): "
            java.lang.StringBuilder r6 = r6.append(r7)
            r24 = r12
            java.lang.Iterable r24 = (java.lang.Iterable) r24
            r31 = 63
            r32 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            java.lang.String r7 = kotlin.collections.CollectionsKt.joinToString$default(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.d(r2, r6)
            r5 = r12
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r14 = kotlin.collections.CollectionsKt.toList(r5)
            com.Gayxx.Gayxx$loadLinks$5 r5 = new com.Gayxx.Gayxx$loadLinks$5
            r10 = 0
            r7 = r37
            r6 = r17
            r8 = r23
            r5.<init>(r6, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r17)
            r4.L$0 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r4.L$1 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r4.L$2 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r4.L$3 = r6
            r4.L$4 = r8
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r4.L$5 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r4.L$6 = r6
            r4.Z$0 = r3
            r6 = 2
            r4.label = r6
            java.lang.Object r5 = com.lagradost.cloudstream3.ParCollectionsKt.amap(r14, r5, r4)
            if (r5 != r1) goto L366
            return r1
        L366:
            r5 = r12
            r12 = r7
            r7 = r5
            r10 = r11
            r5 = r13
            r13 = r17
            r11 = r9
            r9 = r8
        L36f:
            com.lagradost.api.Log r1 = com.lagradost.api.Log.INSTANCE
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "=== finished loadLinks; found="
            java.lang.StringBuilder r6 = r6.append(r8)
            boolean r8 = r9.element
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r0 = r6.append(r0)
            java.lang.String r0 = r0.toString()
            r1.d(r2, r0)
            boolean r0 = r9.element
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Gayxx.Gayxx.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.Gayxx.Gayxx$loadLinks$5 */
    /* JADX INFO: compiled from: Gayxx.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "url", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gayxx.Gayxx$loadLinks$5", f = "Gayxx.kt", i = {0}, l = {186}, m = "invokeSuspend", n = {"url"}, nl = {194}, s = {"L$0"}, v = 2)
    static final class C00095 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<ExtractorLink, Unit> $callback;
        final /* synthetic */ String $data;
        final /* synthetic */ Ref.BooleanRef $found;
        final /* synthetic */ Function1<SubtitleFile, Unit> $subtitleCallback;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00095(String str, Function1<? super SubtitleFile, Unit> function1, Ref.BooleanRef booleanRef, Function1<? super ExtractorLink, Unit> function12, Continuation<? super C00095> continuation) {
            super(2, continuation);
            this.$data = str;
            this.$subtitleCallback = function1;
            this.$found = booleanRef;
            this.$callback = function12;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00095 = new C00095(this.$data, this.$subtitleCallback, this.$found, this.$callback, continuation);
            c00095.L$0 = obj;
            return c00095;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return create(str, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object $result) {
            Object objLoadExtractor;
            String url = (String) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.INSTANCE.d("Gaxx", "Trying loadExtractor for: " + url + " (referer=" + this.$data + ')');
                    String str = this.$data;
                    Function1<SubtitleFile, Unit> function1 = this.$subtitleCallback;
                    final Function1<ExtractorLink, Unit> function12 = this.$callback;
                    this.L$0 = url;
                    this.label = 1;
                    objLoadExtractor = ExtractorApiKt.loadExtractor(url, str, function1, new Function1() { // from class: com.Gayxx.Gayxx$loadLinks$5$$ExternalSyntheticLambda0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final Object invoke(Object obj) {
                            return Gayxx.C00095.invokeSuspend$lambda$0(function12, (ExtractorLink) obj);
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
            Log.INSTANCE.d("Gaxx", "loadExtractor returned " + ok + " for " + url);
            if (ok) {
                this.$found.element = true;
            }
            return Unit.INSTANCE;
        }

        static final Unit invokeSuspend$lambda$0(Function1 $callback, ExtractorLink link) {
            Log.INSTANCE.d("Gaxx", "EXTRACTOR CALLBACK -> " + link.getName() + ": " + StringsKt.take(link.getUrl(), 100) + "...");
            $callback.invoke(link);
            return Unit.INSTANCE;
        }
    }
}
