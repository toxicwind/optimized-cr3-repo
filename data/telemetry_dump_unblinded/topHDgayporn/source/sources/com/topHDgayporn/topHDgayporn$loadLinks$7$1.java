package com.topHDgayporn;

/* JADX INFO: compiled from: topHDgayporn.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump_unblinded/topHDgayporn/classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.topHDgayporn.topHDgayporn$loadLinks$7$1", f = "topHDgayporn.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
final class topHDgayporn$loadLinks$7$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.lagradost.cloudstream3.utils.ExtractorLink, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $data;
    final /* synthetic */ java.util.Map<java.lang.String, java.lang.String> $headers;
    final /* synthetic */ java.lang.String $url;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    topHDgayporn$loadLinks$7$1(java.lang.String r2, java.lang.String r3, java.util.Map<java.lang.String, java.lang.String> r4, kotlin.coroutines.Continuation<? super com.topHDgayporn.topHDgayporn$loadLinks$7$1> r5) {
            r1 = this;
            r1.$data = r2
            r1.$url = r3
            r1.$headers = r4
            r0 = 2
            r1.<init>(r0, r5)
            return
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r5, kotlin.coroutines.Continuation<?> r6) {
            r4 = this;
            com.topHDgayporn.topHDgayporn$loadLinks$7$1 r0 = new com.topHDgayporn.topHDgayporn$loadLinks$7$1
            java.lang.String r1 = r4.$data
            java.lang.String r2 = r4.$url
            java.util.Map<java.lang.String, java.lang.String> r3 = r4.$headers
            r0.<init>(r1, r2, r3, r6)
            r0.L$0 = r5
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    public final java.lang.Object invoke(com.lagradost.cloudstream3.utils.ExtractorLink r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
            com.topHDgayporn.topHDgayporn$loadLinks$7$1 r0 = (com.topHDgayporn.topHDgayporn$loadLinks$7$1) r0
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

    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3.L$0
            com.lagradost.cloudstream3.utils.ExtractorLink r0 = (com.lagradost.cloudstream3.utils.ExtractorLink) r0
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r3.label
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
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.String r1 = r3.$data
            r0.setReferer(r1)
            java.lang.String r1 = r3.$url
            int r1 = com.lagradost.cloudstream3.utils.ExtractorApiKt.getQualityFromName(r1)
            r0.setQuality(r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.$headers
            r0.setHeaders(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
