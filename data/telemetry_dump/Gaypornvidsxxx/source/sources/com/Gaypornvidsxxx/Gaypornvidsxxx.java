package com.Gaypornvidsxxx;

import com.lagradost.cloudstream3.MainAPI;
import com.lagradost.cloudstream3.MainAPIKt;
import com.lagradost.cloudstream3.MainPageData;
import com.lagradost.cloudstream3.MovieLoadResponse;
import com.lagradost.cloudstream3.MovieSearchResponse;
import com.lagradost.cloudstream3.TvType;
import com.lagradost.cloudstream3.network.CloudflareKiller;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Gaypornvidsxxx.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Gaypornvidsxxx/classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0002J\u001e\u0010\u001e\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0096@¢\u0006\u0002\u0010)J\u000e\u0010*\u001a\u0004\u0018\u00010+*\u00020,H\u0002J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u001c2\u0006\u0010.\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010/J\u0016\u00100\u001a\u0002012\u0006\u0010!\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010/JF\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u000e2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000208062\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020806H\u0096@¢\u0006\u0002\u0010;R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/Gaypornvidsxxx/Gaypornvidsxxx;", "Lcom/lagradost/cloudstream3/MainAPI;", "<init>", "()V", "mainUrl", "", "getMainUrl", "()Ljava/lang/String;", "setMainUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "hasMainPage", "", "getHasMainPage", "()Z", "lang", "getLang", "setLang", "supportedTypes", "", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "()Ljava/util/Set;", "cfkiller", "Lcom/lagradost/cloudstream3/network/CloudflareKiller;", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "fixUrl", "url", "cookies", "", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSearchResult", "Lcom/lagradost/cloudstream3/SearchResponse;", "Lorg/jsoup/nodes/Element;", "search", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "loadLinks", "data", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Gaypornvidsxxx"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGaypornvidsxxx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gaypornvidsxxx.kt\ncom/Gaypornvidsxxx/Gaypornvidsxxx\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1642#2,10:214\n1915#2:224\n1916#2:226\n1652#2:227\n1642#2,10:229\n1915#2:239\n1916#2:241\n1652#2:242\n1642#2,10:244\n1915#2:254\n1916#2:256\n1652#2:257\n1915#2,2:258\n1#3:225\n1#3:228\n1#3:240\n1#3:243\n1#3:255\n*S KotlinDebug\n*F\n+ 1 Gaypornvidsxxx.kt\ncom/Gaypornvidsxxx/Gaypornvidsxxx\n*L\n66#1:214,10\n66#1:224\n66#1:226\n66#1:227\n111#1:229,10\n111#1:239\n111#1:241\n111#1:242\n180#1:244,10\n180#1:254\n180#1:256\n180#1:257\n186#1:258,2\n66#1:225\n111#1:240\n180#1:255\n*E\n"})
public final class Gaypornvidsxxx extends MainAPI {

    @NotNull
    private String mainUrl = "https://www.gaypornvidsxxx.com";

    @NotNull
    private String name = "Gaypornvidsxxx";
    private final boolean hasMainPage = true;

    @NotNull
    private String lang = "en";

    @NotNull
    private final Set<TvType> supportedTypes = SetsKt.setOf(TvType.NSFW);

    @NotNull
    private final CloudflareKiller cfkiller = new CloudflareKiller();

    @NotNull
    private final List<MainPageData> mainPage = MainAPIKt.mainPageOf(new Pair[]{TuplesKt.to(getMainUrl(), "Latxest"), TuplesKt.to(getMainUrl() + "/home/tag/Chinese", "Chinese"), TuplesKt.to(getMainUrl() + "/home/tag/Cambodian", "Cambodian"), TuplesKt.to(getMainUrl() + "/home/tag/Western", "Western")});

    @NotNull
    private Map<String, String> cookies = MapsKt.emptyMap();

    /* JADX INFO: renamed from: com.Gaypornvidsxxx.Gaypornvidsxxx$getMainPage$1 */
    /* JADX INFO: compiled from: Gaypornvidsxxx.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gaypornvidsxxx.Gaypornvidsxxx", f = "Gaypornvidsxxx.kt", i = {0, 0, 0}, l = {51}, m = "getMainPage", n = {"request", "url", "page"}, nl = {62}, s = {"L$0", "L$1", "I$0"}, v = 2)
    static final class C00021 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C00021(Continuation<? super C00021> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Gaypornvidsxxx.this.getMainPage(0, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Gaypornvidsxxx.Gaypornvidsxxx$load$1 */
    /* JADX INFO: compiled from: Gaypornvidsxxx.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gaypornvidsxxx.Gaypornvidsxxx", f = "Gaypornvidsxxx.kt", i = {0, 1, 1, 1, 1, 1}, l = {117, 135}, m = "load", n = {"url", "url", "document", "title", "poster", "description"}, nl = {122, -1}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
    static final class C00031 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C00031(Continuation<? super C00031> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Gaypornvidsxxx.this.load(null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Gaypornvidsxxx.Gaypornvidsxxx$loadLinks$1 */
    /* JADX INFO: compiled from: Gaypornvidsxxx.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gaypornvidsxxx.Gaypornvidsxxx", f = "Gaypornvidsxxx.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {155, 198}, m = "loadLinks", n = {"data", "subtitleCallback", "callback", "isCasting", "data", "subtitleCallback", "callback", "document", "videoUrls", "url", "isCasting", "found"}, nl = {162, 204}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "Z$0", "I$0"}, v = 2)
    static final class C00051 extends ContinuationImpl {
        int I$0;
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

        C00051(Continuation<? super C00051> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Gaypornvidsxxx.this.loadLinks(null, false, null, null, (Continuation) this);
        }
    }

    /* JADX INFO: renamed from: com.Gaypornvidsxxx.Gaypornvidsxxx$search$1 */
    /* JADX INFO: compiled from: Gaypornvidsxxx.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gaypornvidsxxx.Gaypornvidsxxx", f = "Gaypornvidsxxx.kt", i = {0, 0, 0}, l = {108}, m = "search", n = {"query", "q", "url"}, nl = {110}, s = {"L$0", "L$1", "L$2"}, v = 2)
    static final class C00061 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C00061(Continuation<? super C00061> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Gaypornvidsxxx.this.search(null, (Continuation) this);
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

    @NotNull
    public Set<TvType> getSupportedTypes() {
        return this.supportedTypes;
    }

    @NotNull
    public List<MainPageData> getMainPage() {
        return this.mainPage;
    }

    private final String fixUrl(String url) {
        return StringsKt.startsWith$default(url, "http", false, 2, (Object) null) ? url : StringsKt.startsWith$default(url, "//", false, 2, (Object) null) ? "https:" + url : StringsKt.startsWith$default(url, "/", false, 2, (Object) null) ? getMainUrl() + url : getMainUrl() + '/' + url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [223=4, 51=7, 56=4] */
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
            boolean r3 = r2 instanceof com.Gaypornvidsxxx.Gaypornvidsxxx.C00021
            if (r3 == 0) goto L1a
            r3 = r2
            com.Gaypornvidsxxx.Gaypornvidsxxx$getMainPage$1 r3 = (com.Gaypornvidsxxx.Gaypornvidsxxx.C00021) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.Gaypornvidsxxx.Gaypornvidsxxx$getMainPage$1 r3 = new com.Gaypornvidsxxx.Gaypornvidsxxx$getMainPage$1
            r3.<init>(r2)
        L1f:
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r3.label
            r7 = 1
            switch(r6) {
                case 0: goto L4a;
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
            r21 = r4
            r3 = r1
            r1 = 1
            goto L134
        L4a:
            kotlin.ResultKt.throwOnFailure(r4)
            if (r1 != r7) goto L55
            java.lang.String r6 = r25.getData()
            goto La8
        L55:
            java.lang.String r6 = r25.getData()
            java.lang.String r8 = r0.getMainUrl()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r8)
            r8 = 47
            if (r6 == 0) goto L89
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = r0.getMainUrl()
            java.lang.StringBuilder r6 = r6.append(r9)
            java.lang.String r9 = "/?page="
            java.lang.StringBuilder r6 = r6.append(r9)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            goto La8
        L89:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = r25.getData()
            java.lang.StringBuilder r6 = r6.append(r9)
            java.lang.String r9 = "?page="
            java.lang.StringBuilder r6 = r6.append(r9)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
        La8:
            r8 = r4
            com.lagradost.nicehttp.Requests r4 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            com.lagradost.cloudstream3.network.CloudflareKiller r9 = r0.cfkiller
            java.lang.String r10 = r0.getMainUrl()
            r11 = 4
            kotlin.Pair[] r11 = new kotlin.Pair[r11]
            java.lang.String r12 = "User-Agent"
            java.lang.String r13 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.0.0 Safari/537.36"
            kotlin.Pair r12 = kotlin.TuplesKt.to(r12, r13)
            r13 = 0
            r11[r13] = r12
            java.lang.String r12 = "Accept"
        */
        //  java.lang.String r13 = "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"
        /*
            kotlin.Pair r12 = kotlin.TuplesKt.to(r12, r13)
            r11[r7] = r12
            java.lang.String r12 = "Accept-Language"
            java.lang.String r13 = "vi-VN,vi;q=0.9,fr-FR;q=0.8,fr;q=0.7,en-US;q=0.6,en;q=0.5"
            kotlin.Pair r12 = kotlin.TuplesKt.to(r12, r13)
            r13 = 2
            r11[r13] = r12
            java.lang.String r12 = "Accept-Encoding"
            java.lang.String r13 = "gzip, deflate, br, zstd"
            kotlin.Pair r12 = kotlin.TuplesKt.to(r12, r13)
            r13 = 3
            r11[r13] = r12
            java.util.Map r11 = kotlin.collections.MapsKt.mapOf(r11)
            r15 = r9
            okhttp3.Interceptor r15 = (okhttp3.Interceptor) r15
            r9 = r25
            r3.L$0 = r9
            java.lang.Object r12 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r3.L$1 = r12
            r3.I$0 = r1
            r3.label = r7
            r12 = r8
            r8 = 0
            r9 = 0
            r7 = r10
            r13 = 1
            r10 = 1
            r14 = r5
            r5 = r6
            r6 = r11
            r11 = 0
            r16 = r12
            r12 = 0
            r17 = r14
            r18 = 1
            r13 = 0
            r19 = r16
            r16 = 0
            r20 = r17
            r17 = 0
            r21 = r19
            r19 = 3544(0xdd8, float:4.966E-42)
            r22 = r20
            r20 = 0
            r18 = r3
            r3 = r22
            r1 = 1
            java.lang.Object r4 = com.lagradost.nicehttp.Requests.get$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            if (r4 != r3) goto L130
            return r3
        L130:
            r3 = r24
            r6 = r25
        L134:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r4 = r4.getDocument()
            java.lang.String r7 = "article.blog-item"
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
        L155:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L176
            java.lang.Object r15 = r14.next()
            r16 = r15
            r17 = 0
            r1 = r16
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            r20 = 0
            com.lagradost.cloudstream3.SearchResponse r1 = r0.toSearchResult(r1)
            if (r1 == 0) goto L174
            r20 = 0
            r9.add(r1)
        L174:
            r1 = 1
            goto L155
        L176:
            r1 = r9
            java.util.List r1 = (java.util.List) r1
            com.lagradost.cloudstream3.HomePageList r7 = new com.lagradost.cloudstream3.HomePageList
            java.lang.String r8 = r6.getName()
            r13 = 1
            r7.<init>(r8, r1, r13)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r13)
            com.lagradost.cloudstream3.HomePageResponse r7 = com.lagradost.cloudstream3.MainAPIKt.newHomePageResponse(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Gaypornvidsxxx.Gaypornvidsxxx.getMainPage(int, com.lagradost.cloudstream3.MainPageRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [89=5, 90=4] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.lagradost.cloudstream3.SearchResponse toSearchResult(org.jsoup.nodes.Element r12) {
        /*
            r11 = this;
            java.lang.String r0 = "h1.blog-title a"
            org.jsoup.nodes.Element r0 = r12.selectFirst(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r2 = r0.text()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.CharSequence r2 = kotlin.text.StringsKt.trim(r2)
            java.lang.String r4 = r2.toString()
            r2 = r4
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            if (r2 == 0) goto L27
            return r1
        L27:
            java.lang.String r2 = "href"
            java.lang.String r2 = r0.attr(r2)
            java.lang.String r5 = r11.fixUrl(r2)
            java.lang.String r2 = "img"
            org.jsoup.nodes.Element r2 = r12.selectFirst(r2)
            if (r2 == 0) goto L55
            java.lang.String r3 = "src"
            java.lang.String r3 = r2.attr(r3)
            if (r3 == 0) goto L55
        L44:
            r6 = r3
            r7 = 0
            r8 = r6
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = kotlin.text.StringsKt.isBlank(r8)
            if (r8 != 0) goto L50
            goto L51
        L50:
            r3 = r1
        L51:
            if (r3 == 0) goto L55
            r1 = r3
            goto L5d
        L55:
            if (r2 == 0) goto L5d
            java.lang.String r1 = "data-src"
            java.lang.String r1 = r2.attr(r1)
        L5d:
            r3 = r11
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            com.lagradost.cloudstream3.TvType r6 = com.lagradost.cloudstream3.TvType.NSFW
            com.Gaypornvidsxxx.Gaypornvidsxxx$$ExternalSyntheticLambda0 r8 = new com.Gaypornvidsxxx.Gaypornvidsxxx$$ExternalSyntheticLambda0
            r8.<init>()
            r9 = 8
            r10 = 0
            r7 = 0
            com.lagradost.cloudstream3.MovieSearchResponse r3 = com.lagradost.cloudstream3.MainAPIKt.newMovieSearchResponse$default(r3, r4, r5, r6, r7, r8, r9, r10)
            com.lagradost.cloudstream3.SearchResponse r3 = (com.lagradost.cloudstream3.SearchResponse) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Gaypornvidsxxx.Gaypornvidsxxx.toSearchResult(org.jsoup.nodes.Element):com.lagradost.cloudstream3.SearchResponse");
    }

    static final Unit toSearchResult$lambda$1(String $poster, MovieSearchResponse $this$newMovieSearchResponse) {
        $this$newMovieSearchResponse.setPosterUrl($poster);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [238=4] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object search(@org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends com.lagradost.cloudstream3.SearchResponse>> r24) throws java.io.UnsupportedEncodingException {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof com.Gaypornvidsxxx.Gaypornvidsxxx.C00061
            if (r2 == 0) goto L18
            r2 = r1
            com.Gaypornvidsxxx.Gaypornvidsxxx$search$1 r2 = (com.Gaypornvidsxxx.Gaypornvidsxxx.C00061) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Gaypornvidsxxx.Gaypornvidsxxx$search$1 r2 = new com.Gaypornvidsxxx.Gaypornvidsxxx$search$1
            r2.<init>(r1)
        L1d:
            java.lang.Object r3 = r2.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.label
            switch(r5) {
                case 0: goto L46;
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
            java.lang.Object r4 = r2.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.L$0
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r2
            r2 = r3
            goto Lbd
        L46:
            kotlin.ResultKt.throwOnFailure(r3)
            java.lang.String r5 = "UTF-8"
            r6 = r23
            java.lang.String r5 = java.net.URLEncoder.encode(r6, r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r0.getMainUrl()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = "/?s="
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r7 = r7.toString()
            r8 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r2.L$0 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r2.L$1 = r9
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r2.L$2 = r9
            r9 = 1
            r2.label = r9
            r9 = r5
            r5 = 0
            r6 = 0
            r10 = r4
            r4 = r7
            r7 = 0
            r11 = r8
            r8 = 0
            r12 = r9
            r9 = 0
            r13 = r10
            r10 = 0
            r14 = r11
            r11 = 0
            r16 = r12
            r15 = r13
            r12 = 0
            r17 = r14
            r14 = 0
            r18 = r15
            r15 = 0
            r19 = r16
            r16 = 0
            r20 = r18
            r18 = 4094(0xffe, float:5.737E-42)
            r21 = r19
            r19 = 0
            r1 = r17
            r17 = r2
            r2 = r1
            r1 = r20
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r3 != r1) goto Lb9
            return r1
        Lb9:
            r6 = r23
            r5 = r21
        Lbd:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r1 = r3.getDocument()
            java.lang.String r3 = "div.item, div.video-item"
            org.jsoup.select.Elements r3 = r1.select(r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r7 = 0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r8 = (java.util.Collection) r8
            r9 = r3
            r10 = 0
            r11 = r9
            r12 = 0
            java.util.Iterator r13 = r11.iterator()
        Ldc:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lfe
            java.lang.Object r14 = r13.next()
            r15 = r14
            r16 = 0
            r23 = r1
            r1 = r15
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            r18 = 0
            com.lagradost.cloudstream3.SearchResponse r1 = r0.toSearchResult(r1)
            if (r1 == 0) goto Lfb
            r18 = 0
            r8.add(r1)
        Lfb:
            r1 = r23
            goto Ldc
        Lfe:
            r23 = r1
            r1 = r8
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Gaypornvidsxxx.Gaypornvidsxxx.search(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [131=5, 133=4, 117=5] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(@org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.lagradost.cloudstream3.LoadResponse> r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r1 instanceof com.Gaypornvidsxxx.Gaypornvidsxxx.C00031
            if (r2 == 0) goto L18
            r2 = r1
            com.Gaypornvidsxxx.Gaypornvidsxxx$load$1 r2 = (com.Gaypornvidsxxx.Gaypornvidsxxx.C00031) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.Gaypornvidsxxx.Gaypornvidsxxx$load$1 r2 = new com.Gaypornvidsxxx.Gaypornvidsxxx$load$1
            r2.<init>(r1)
        L1d:
            r9 = r2
            java.lang.Object r2 = r9.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r9.label
            r5 = 2
            switch(r4) {
                case 0: goto L5a;
                case 1: goto L4e;
                case 2: goto L32;
                default: goto L2a;
            }
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L32:
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
            r1 = r2
            r17 = r9
            goto L15c
        L4e:
            java.lang.Object r4 = r9.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.ResultKt.throwOnFailure(r2)
            r0 = r3
            r5 = r4
            r1 = 2
            r3 = r2
            goto Lbe
        L5a:
            kotlin.ResultKt.throwOnFailure(r2)
            r4 = r3
            com.lagradost.nicehttp.Requests r3 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            com.lagradost.cloudstream3.network.CloudflareKiller r6 = r0.cfkiller
            kotlin.Pair[] r7 = new kotlin.Pair[r5]
            java.lang.String r8 = "User-Agent"
            java.lang.String r10 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36"
            kotlin.Pair r8 = kotlin.TuplesKt.to(r8, r10)
            r10 = 0
            r7[r10] = r8
            java.lang.String r8 = "Accept"
            java.lang.String r10 = "text/html"
            kotlin.Pair r8 = kotlin.TuplesKt.to(r8, r10)
            r10 = 1
            r7[r10] = r8
            java.util.Map r7 = kotlin.collections.MapsKt.mapOf(r7)
            r8 = r6
            java.lang.String r6 = r0.getMainUrl()
            r14 = r8
            okhttp3.Interceptor r14 = (okhttp3.Interceptor) r14
            r8 = r22
            r9.L$0 = r8
            r9.label = r10
            r5 = r7
            r10 = 2
            r7 = 0
            r8 = 0
            r17 = r9
            r9 = 0
            r11 = 2
            r10 = 0
            r12 = 2
            r11 = 0
            r15 = 2
            r12 = 0
            r16 = 2
            r15 = 0
            r18 = 2
            r16 = 0
            r19 = 2
            r18 = 3576(0xdf8, float:5.011E-42)
            r20 = 2
            r19 = 0
            r0 = r4
            r1 = 2
            r4 = r22
            java.lang.Object r3 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r9 = r17
            if (r3 != r0) goto Lbc
            return r0
        Lbc:
            r5 = r22
        Lbe:
            com.lagradost.nicehttp.NiceResponse r3 = (com.lagradost.nicehttp.NiceResponse) r3
            org.jsoup.nodes.Document r3 = r3.getDocument()
            r10 = r3
            java.lang.String r3 = "meta[property=og:title]"
            org.jsoup.nodes.Element r3 = r10.selectFirst(r3)
            java.lang.String r4 = "content"
            r6 = 0
            if (r3 == 0) goto Le1
            java.lang.String r3 = r3.attr(r4)
            if (r3 == 0) goto Le1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r3 = kotlin.text.StringsKt.trim(r3)
            java.lang.String r3 = r3.toString()
            goto Le2
        Le1:
            r3 = r6
        Le2:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r7 = r21
            com.lagradost.cloudstream3.MainAPI r7 = (com.lagradost.cloudstream3.MainAPI) r7
            java.lang.String r8 = "[property='og:image']"
            org.jsoup.nodes.Element r8 = r10.selectFirst(r8)
            if (r8 == 0) goto Lf7
            java.lang.String r4 = r8.attr(r4)
            goto Lf8
        Lf7:
            r4 = r6
        Lf8:
            java.lang.String r11 = com.lagradost.cloudstream3.MainAPIKt.fixUrlNull(r7, r4)
            java.lang.String r4 = "div.entry-content, article .blog-content, article .entry-content"
            org.jsoup.nodes.Element r4 = r10.selectFirst(r4)
            if (r4 == 0) goto L119
        L108:
            java.lang.String r4 = r4.text()
            if (r4 == 0) goto L119
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim(r4)
            java.lang.String r4 = r4.toString()
            goto L11a
        L119:
            r4 = r6
        L11a:
            r12 = r4
            r4 = r3
            r3 = r21
            com.lagradost.cloudstream3.MainAPI r3 = (com.lagradost.cloudstream3.MainAPI) r3
            com.lagradost.cloudstream3.TvType r7 = com.lagradost.cloudstream3.TvType.NSFW
            com.Gaypornvidsxxx.Gaypornvidsxxx$load$2 r8 = new com.Gaypornvidsxxx.Gaypornvidsxxx$load$2
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
            r9.label = r1
            r6 = r7
            r7 = r5
            java.lang.Object r1 = com.lagradost.cloudstream3.MainAPIKt.newMovieLoadResponse(r3, r4, r5, r6, r7, r8, r9)
            r17 = r9
            if (r1 != r0) goto L157
            return r0
        L157:
            r7 = r5
            r6 = r10
            r3 = r12
            r5 = r4
            r4 = r11
        L15c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Gaypornvidsxxx.Gaypornvidsxxx.load(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.Gaypornvidsxxx.Gaypornvidsxxx$load$2 */
    /* JADX INFO: compiled from: Gaypornvidsxxx.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/MovieLoadResponse;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @DebugMetadata(c = "com.Gaypornvidsxxx.Gaypornvidsxxx$load$2", f = "Gaypornvidsxxx.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    static final class C00042 extends SuspendLambda implements Function2<MovieLoadResponse, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $description;
        final /* synthetic */ String $poster;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00042(String str, String str2, Continuation<? super C00042> continuation) {
            super(2, continuation);
            this.$poster = str;
            this.$description = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Continuation<Unit> c00042 = new C00042(this.$poster, this.$description, continuation);
            c00042.L$0 = obj;
            return c00042;
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [148=4, 155=6, 170=4, 171=4, 172=5, 173=4, 183=4, 184=4, 253=4] */
    /* JADX WARN: Can't wrap try/catch for region: R(7:57|81|58|59|83|60|(1:62)(6:63|85|64|(1:66)(1:67)|55|(3:(1:77)(1:78)|79|80)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x024e, code lost:
    
        r17 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cf A[LOOP:1: B:51:0x01c9->B:53:0x01cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x022d -> B:85:0x0232). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0251 -> B:55:0x01f2). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadLinks(@org.jetbrains.annotations.NotNull java.lang.String r28, boolean r29, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.SubtitleFile, kotlin.Unit> r30, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.Unit> r31, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r32) {
        /*
            r27 = this;
            r1 = r27
            r2 = r32
            boolean r0 = r2 instanceof com.Gaypornvidsxxx.Gaypornvidsxxx.C00051
            if (r0 == 0) goto L18
            r0 = r2
            com.Gaypornvidsxxx.Gaypornvidsxxx$loadLinks$1 r0 = (com.Gaypornvidsxxx.Gaypornvidsxxx.C00051) r0
            int r3 = r0.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r0.label
            int r3 = r3 - r4
            r0.label = r3
            goto L1d
        L18:
            com.Gaypornvidsxxx.Gaypornvidsxxx$loadLinks$1 r0 = new com.Gaypornvidsxxx.Gaypornvidsxxx$loadLinks$1
            r0.<init>(r2)
        L1d:
            r3 = r0
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            r6 = 1
            r7 = 0
            r8 = 2
            switch(r0) {
                case 0: goto L87;
                case 1: goto L6e;
                case 2: goto L34;
                default: goto L2c;
            }
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            int r9 = r3.I$0
            boolean r10 = r3.Z$0
            java.lang.Object r0 = r3.L$6
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r0 = r3.L$5
            r12 = r0
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r0 = r3.L$4
            r13 = r0
            java.util.Set r13 = (java.util.Set) r13
            java.lang.Object r0 = r3.L$3
            r14 = r0
            org.jsoup.nodes.Document r14 = (org.jsoup.nodes.Document) r14
            java.lang.Object r0 = r3.L$2
            r15 = r0
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15
            java.lang.Object r0 = r3.L$1
            r16 = r0
            kotlin.jvm.functions.Function1 r16 = (kotlin.jvm.functions.Function1) r16
            java.lang.Object r0 = r3.L$0
            r17 = r0
            java.lang.String r17 = (java.lang.String) r17
            kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Exception -> L67
            r8 = r1
            r1 = r4
            r6 = r16
            r7 = 2
            goto L232
        L67:
            r0 = move-exception
            r8 = r1
            r6 = r16
            r7 = 2
            goto L251
        L6e:
            boolean r0 = r3.Z$0
            java.lang.Object r9 = r3.L$2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r3.L$1
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r11 = r3.L$0
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r4)
            r17 = r3
            r20 = r4
            r1 = r5
            r2 = 0
            goto L101
        L87:
            kotlin.ResultKt.throwOnFailure(r4)
            com.lagradost.nicehttp.Requests r0 = com.lagradost.cloudstream3.MainActivityKt.getApp()
            com.lagradost.cloudstream3.network.CloudflareKiller r9 = r1.cfkiller
            kotlin.Pair[] r10 = new kotlin.Pair[r8]
            java.lang.String r11 = "User-Agent"
            java.lang.String r12 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36"
            kotlin.Pair r11 = kotlin.TuplesKt.to(r11, r12)
            r10[r7] = r11
            java.lang.String r11 = "Accept"
            java.lang.String r12 = "text/html"
            kotlin.Pair r11 = kotlin.TuplesKt.to(r11, r12)
            r10[r6] = r11
            java.util.Map r10 = kotlin.collections.MapsKt.mapOf(r10)
            java.lang.String r11 = r1.getMainUrl()
            r14 = r9
            okhttp3.Interceptor r14 = (okhttp3.Interceptor) r14
            r9 = r28
            r3.L$0 = r9
            r12 = r30
            r3.L$1 = r12
            r13 = r31
            r3.L$2 = r13
            r15 = r29
            r3.Z$0 = r15
            r3.label = r6
            r16 = 0
            r7 = 0
            r17 = 2
            r8 = 0
            r9 = 0
            r18 = r5
            r5 = r10
            r10 = 0
            r6 = r11
            r19 = 1
            r11 = 0
            r12 = 0
            r15 = 0
            r20 = 0
            r16 = 0
            r21 = r18
            r18 = 3576(0xdf8, float:5.011E-42)
            r22 = 1
            r19 = 0
            r17 = r3
            r20 = r4
            r1 = r21
            r2 = 0
            r4 = r28
            r3 = r0
            java.lang.Object r0 = com.lagradost.nicehttp.Requests.get$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            if (r0 != r1) goto Lf8
            return r1
        Lf8:
            r11 = r28
            r10 = r30
            r9 = r31
            r4 = r0
            r0 = r29
        L101:
            com.lagradost.nicehttp.NiceResponse r4 = (com.lagradost.nicehttp.NiceResponse) r4
            org.jsoup.nodes.Document r3 = r4.getDocument()
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.Set r4 = (java.util.Set) r4
            r5 = 0
            java.lang.String r6 = "iframe#video-frame[src]"
            org.jsoup.nodes.Element r6 = r3.selectFirst(r6)
            r7 = 0
            if (r6 == 0) goto L142
        L11d:
            java.lang.String r8 = "src"
            java.lang.String r6 = r6.attr(r8)
            if (r6 == 0) goto L140
        L126:
            r8 = r6
            r12 = 0
            java.lang.String r13 = "http"
            r14 = 2
            boolean r8 = kotlin.text.StringsKt.startsWith$default(r8, r13, r2, r14, r7)
            if (r8 == 0) goto L132
            goto L133
        L132:
            r6 = r7
        L133:
            if (r6 == 0) goto L143
        L137:
            r8 = 0
            boolean r6 = r4.add(r6)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            goto L144
        L140:
            r14 = 2
            goto L143
        L142:
            r14 = 2
        L143:
        L144:
            java.lang.String r6 = "button[onclick]"
            org.jsoup.select.Elements r6 = r3.select(r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r8 = 0
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Collection r12 = (java.util.Collection) r12
            r13 = r6
            r15 = 0
            r16 = r13
            r18 = 0
            java.util.Iterator r19 = r16.iterator()
        L15f:
            boolean r21 = r19.hasNext()
            if (r21 == 0) goto L1b6
            java.lang.Object r21 = r19.next()
            r23 = r21
            r24 = 0
            r2 = r23
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            r26 = 0
            kotlin.text.Regex r7 = new kotlin.text.Regex
            java.lang.String r14 = "changeServer\\([^,]+,\\s*['\"](https?://[^'\"]+)['\"]\\)"
            r7.<init>(r14)
            java.lang.String r14 = "onclick"
            java.lang.String r14 = r2.attr(r14)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r30 = r0
            r25 = r1
            r28 = r2
            r0 = 0
            r1 = 0
            r2 = 2
            kotlin.text.MatchResult r7 = kotlin.text.Regex.find$default(r7, r14, r1, r2, r0)
            if (r7 == 0) goto L1a5
        L194:
            java.util.List r2 = r7.getGroupValues()
            if (r2 == 0) goto L1a3
        L19b:
            r7 = 1
            java.lang.Object r2 = r2.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            goto L1a7
        L1a3:
            r7 = 1
            goto L1a6
        L1a5:
            r7 = 1
        L1a6:
            r2 = r0
        L1a7:
            if (r2 == 0) goto L1ae
            r14 = 0
            r12.add(r2)
        L1ae:
            r7 = r0
            r1 = r25
            r2 = 0
            r14 = 2
            r0 = r30
            goto L15f
        L1b6:
            r30 = r0
            r25 = r1
            r1 = 0
            r7 = 1
            r0 = r12
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = 0
            java.util.Iterator r6 = r0.iterator()
        L1c9:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L1db
            java.lang.Object r8 = r6.next()
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            r13 = 0
            r4.add(r12)
            goto L1c9
        L1db:
            java.util.Iterator r0 = r4.iterator()
            r8 = r27
            r2 = r32
            r12 = r0
            r14 = r3
            r13 = r4
            r15 = r9
            r6 = r10
            r3 = r17
            r4 = r20
            r10 = r30
            r9 = r5
            r5 = r25
        L1f2:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L256
            java.lang.Object r0 = r12.next()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            r3.L$0 = r11     // Catch: java.lang.Exception -> L24c
            r3.L$1 = r6     // Catch: java.lang.Exception -> L24c
            r3.L$2 = r15     // Catch: java.lang.Exception -> L24c
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)     // Catch: java.lang.Exception -> L24c
            r3.L$3 = r0     // Catch: java.lang.Exception -> L24c
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)     // Catch: java.lang.Exception -> L24c
            r3.L$4 = r0     // Catch: java.lang.Exception -> L24c
            r3.L$5 = r12     // Catch: java.lang.Exception -> L24c
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)     // Catch: java.lang.Exception -> L24c
            r3.L$6 = r0     // Catch: java.lang.Exception -> L24c
            r3.Z$0 = r10     // Catch: java.lang.Exception -> L24c
            r3.I$0 = r9     // Catch: java.lang.Exception -> L24c
            r7 = 2
            r3.label = r7     // Catch: java.lang.Exception -> L24a
            java.lang.Object r0 = com.lagradost.cloudstream3.utils.ExtractorApiKt.loadExtractor(r1, r11, r6, r15, r3)     // Catch: java.lang.Exception -> L24a
            if (r0 != r5) goto L22d
            return r5
        L22d:
            r17 = r11
            r11 = r1
            r1 = r4
            r4 = r0
        L232:
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Exception -> L247
            boolean r0 = r4.booleanValue()     // Catch: java.lang.Exception -> L247
            if (r0 == 0) goto L241
            r9 = 1
            r4 = r1
            r11 = r17
            r1 = 0
            r7 = 1
            goto L1f2
        L241:
            r4 = r1
            r11 = r17
            r1 = 0
            r7 = 1
            goto L1f2
        L247:
            r0 = move-exception
            r4 = r1
            goto L251
        L24a:
            r0 = move-exception
            goto L24e
        L24c:
            r0 = move-exception
            r7 = 2
        L24e:
            r17 = r11
            r11 = r1
        L251:
            r11 = r17
            r1 = 0
            r7 = 1
            goto L1f2
        L256:
            if (r9 == 0) goto L25b
            r16 = 1
            goto L25d
        L25b:
            r16 = 0
        L25d:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Gaypornvidsxxx.Gaypornvidsxxx.loadLinks(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
