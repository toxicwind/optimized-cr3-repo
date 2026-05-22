package com.Gaycock4U;

/* JADX INFO: compiled from: Gaycock4UPlugin.kt */
/* JADX INFO: loaded from: /tmp/tmp.gEcNE2slhR/classes.dex */
@com.lagradost.cloudstream3.plugins.CloudstreamPlugin
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/Gaycock4U/Gaycock4UPlugin;", "Lcom/lagradost/cloudstream3/plugins/Plugin;", "<init>", "()V", "load", "", "context", "Landroid/content/Context;", "Gaycock4U"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Gaycock4UPlugin extends com.lagradost.cloudstream3.plugins.Plugin {
    public Gaycock4UPlugin() {
            r0 = this;
            r0.<init>()
            return
    }

    public void load(@org.jetbrains.annotations.NotNull android.content.Context r8) {
            r7 = this;
            com.Gaycock4U.Gaycock4U r0 = new com.Gaycock4U.Gaycock4U
            r0.<init>()
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            r7.registerMainAPI(r0)
            com.lagradost.cloudstream3.extractors.DoodLaExtractor r0 = new com.lagradost.cloudstream3.extractors.DoodLaExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r7.registerExtractorAPI(r0)
            com.Gaycock4U.dsio r0 = new com.Gaycock4U.dsio
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r7.registerExtractorAPI(r0)
            com.Gaycock4U.DoodstreamCom r0 = new com.Gaycock4U.DoodstreamCom
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r7.registerExtractorAPI(r0)
            com.Gaycock4U.vide0 r0 = new com.Gaycock4U.vide0
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r7.registerExtractorAPI(r0)
            com.Gaycock4U.Davioad r1 = new com.Gaycock4U.Davioad
            r5 = 7
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            com.lagradost.cloudstream3.utils.ExtractorApi r1 = (com.lagradost.cloudstream3.utils.ExtractorApi) r1
            r7.registerExtractorAPI(r1)
            return
    }
}
