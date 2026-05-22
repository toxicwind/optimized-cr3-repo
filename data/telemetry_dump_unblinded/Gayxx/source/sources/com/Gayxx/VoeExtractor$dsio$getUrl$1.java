package com.Gayxx;

/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump_unblinded/Gayxx/classes.dex */
@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.Gayxx.VoeExtractor$dsio", f = "Extractor.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {72, 78, 92}, m = "getUrl", n = {"url", "referer", "url", "referer", "response0", "passMd5Path", "token", "md5Url", "url", "referer", "response0", "passMd5Path", "token", "md5Url", "res", "videoData", "randomStr", "link", "quality"}, nl = {74, 79, 91}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10"}, v = 2)
final class VoeExtractor$dsio$getUrl$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$10;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    java.lang.Object L$7;
    java.lang.Object L$8;
    java.lang.Object L$9;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.Gayxx.VoeExtractor.dsio this$0;

    VoeExtractor$dsio$getUrl$1(com.Gayxx.VoeExtractor.dsio r1, kotlin.coroutines.Continuation<? super com.Gayxx.VoeExtractor$dsio$getUrl$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            r3 = this;
            r3.result = r4
            int r0 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            r3.label = r0
            com.Gayxx.VoeExtractor$dsio r0 = r3.this$0
            r1 = 0
            r2 = r3
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.getUrl(r1, r1, r2)
            return r0
    }
}
