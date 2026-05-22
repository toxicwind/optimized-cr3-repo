package com.Jayboys;

/* JADX INFO: compiled from: JavboysPlugin.kt */
/* JADX INFO: loaded from: /tmp/tmp.3pMnvANAev/classes.dex */
@com.lagradost.cloudstream3.plugins.CloudstreamPlugin
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/Jayboys/JayboysPlugin;", "Lcom/lagradost/cloudstream3/plugins/Plugin;", "<init>", "()V", "load", "", "context", "Landroid/content/Context;", "Jayboys"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JayboysPlugin extends com.lagradost.cloudstream3.plugins.Plugin {
    public JayboysPlugin() {
            r0 = this;
            r0.<init>()
            return
    }

    public void load(@org.jetbrains.annotations.NotNull android.content.Context r2) {
            r1 = this;
            com.Jayboys.Jayboys1 r0 = new com.Jayboys.Jayboys1
            r0.<init>()
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            r1.registerMainAPI(r0)
            com.Jayboys.Jayboys2 r0 = new com.Jayboys.Jayboys2
            r0.<init>()
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            r1.registerMainAPI(r0)
            com.Jayboys.dsio r0 = new com.Jayboys.dsio
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Jayboys.VoeExtractor r0 = new com.Jayboys.VoeExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.lagradost.cloudstream3.extractors.Voe r0 = new com.lagradost.cloudstream3.extractors.Voe
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Jayboys.boynextdoor r0 = new com.Jayboys.boynextdoor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Jayboys.crystal r0 = new com.Jayboys.crystal
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.lagradost.cloudstream3.extractors.StreamTape r0 = new com.lagradost.cloudstream3.extractors.StreamTape
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Jayboys.yi069website r0 = new com.Jayboys.yi069website
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.lagradost.cloudstream3.extractors.DoodLaExtractor r0 = new com.lagradost.cloudstream3.extractors.DoodLaExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Jayboys.DoodstreamCom r0 = new com.Jayboys.DoodstreamCom
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Jayboys.vide0 r0 = new com.Jayboys.vide0
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Jayboys.tapepops r0 = new com.Jayboys.tapepops
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Jayboys.FileMoon r0 = new com.Jayboys.FileMoon
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.lagradost.cloudstream3.extractors.FilemoonV2 r0 = new com.lagradost.cloudstream3.extractors.FilemoonV2
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Jayboys.Base64Extractor r0 = new com.Jayboys.Base64Extractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Jayboys.JP r0 = new com.Jayboys.JP
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Jayboys.jaygo r0 = new com.Jayboys.jaygo
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Jayboys.hypeboy r0 = new com.Jayboys.hypeboy
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Jayboys.do7go r0 = new com.Jayboys.do7go
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Jayboys.myvidplay r0 = new com.Jayboys.myvidplay
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            return
    }
}
