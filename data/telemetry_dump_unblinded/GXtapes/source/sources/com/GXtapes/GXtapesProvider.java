package com.GXtapes;

/* JADX INFO: compiled from: GXtapesProvider.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump_unblinded/GXtapes/classes.dex */
@com.lagradost.cloudstream3.plugins.CloudstreamPlugin
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/GXtapes/GXtapesProvider;", "Lcom/lagradost/cloudstream3/plugins/Plugin;", "<init>", "()V", "load", "", "context", "Landroid/content/Context;", "GXtapes"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GXtapesProvider extends com.lagradost.cloudstream3.plugins.Plugin {
    public GXtapesProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    public void load(@org.jetbrains.annotations.NotNull android.content.Context r9) {
            r8 = this;
            com.GXtapes.GXtapes r0 = new com.GXtapes.GXtapes
            r0.<init>()
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            r8.registerMainAPI(r0)
            com.GXtapes.Stream r0 = new com.GXtapes.Stream
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r8.registerExtractorAPI(r0)
            com.GXtapes.Stream88z r0 = new com.GXtapes.Stream88z
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r8.registerExtractorAPI(r0)
            com.GXtapes.Stream44x r0 = new com.GXtapes.Stream44x
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r8.registerExtractorAPI(r0)
            com.GXtapes.GXtapes74k r1 = new com.GXtapes.GXtapes74k
            r5 = 7
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            com.lagradost.cloudstream3.utils.ExtractorApi r1 = (com.lagradost.cloudstream3.utils.ExtractorApi) r1
            r8.registerExtractorAPI(r1)
            com.GXtapes.GXtapes88z r2 = new com.GXtapes.GXtapes88z
            r6 = 7
            r7 = 0
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            com.lagradost.cloudstream3.utils.ExtractorApi r2 = (com.lagradost.cloudstream3.utils.ExtractorApi) r2
            r8.registerExtractorAPI(r2)
            com.lagradost.cloudstream3.extractors.DoodLaExtractor r0 = new com.lagradost.cloudstream3.extractors.DoodLaExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r8.registerExtractorAPI(r0)
            return
    }
}
