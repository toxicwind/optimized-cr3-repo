package com.GXtapes;

/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump_unblinded/GXtapes/classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.GXtapes.GXtapes88z$getUrl$2$1", f = "Extractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
final class GXtapes88z$getUrl$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.GXtapes.GXtapes88z this$0;

    GXtapes88z$getUrl$2$1(com.GXtapes.GXtapes88z r2, kotlin.coroutines.Continuation<? super com.GXtapes.GXtapes88z$getUrl$2$1> r3) {
            r1 = this;
            r1.this$0 = r2
            r0 = 2
            r1.<init>(r0, r3)
            return
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            com.GXtapes.GXtapes88z$getUrl$2$1 r0 = new com.GXtapes.GXtapes88z$getUrl$2$1
            com.GXtapes.GXtapes88z r1 = r2.this$0
            r0.<init>(r1, r4)
            r0.L$0 = r3
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    public final java.lang.Object invoke(com.lagradost.cloudstream3.utils.ExtractorLink r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
            com.GXtapes.GXtapes88z$getUrl$2$1 r0 = (com.GXtapes.GXtapes88z$getUrl$2$1) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.lagradost.cloudstream3.utils.ExtractorLink r2 = (com.lagradost.cloudstream3.utils.ExtractorLink) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r0 = r1.invoke(r2, r3)
            return r0
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.L$0
            com.lagradost.cloudstream3.utils.ExtractorLink r0 = (com.lagradost.cloudstream3.utils.ExtractorLink) r0
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            switch(r1) {
                case 0: goto L14;
                default: goto Lc;
            }
        Lc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L14:
            kotlin.ResultKt.throwOnFailure(r5)
            com.lagradost.cloudstream3.utils.Qualities r1 = com.lagradost.cloudstream3.utils.Qualities.Unknown
            int r1 = r1.getValue()
            r0.setQuality(r1)
            com.GXtapes.GXtapes88z r1 = r4.this$0
            java.lang.String r1 = r1.getMainUrl()
            r0.setReferer(r1)
            r1 = 2
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            java.lang.String r2 = "User-Agent"
            java.lang.String r3 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            r3 = 0
            r1[r3] = r2
            com.GXtapes.GXtapes88z r2 = r4.this$0
            java.lang.String r2 = r2.getMainUrl()
            java.lang.String r3 = "Referer"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r3, r2)
            r3 = 1
            r1[r3] = r2
            java.util.Map r1 = kotlin.collections.MapsKt.mapOf(r1)
            r0.setHeaders(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
