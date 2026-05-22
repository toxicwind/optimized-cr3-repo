package com.Gayxx;

/* JADX INFO: compiled from: GayxxProvider.kt */
/* JADX INFO: loaded from: /tmp/tmp.FInTvDqO98/classes.dex */
@com.lagradost.cloudstream3.plugins.CloudstreamPlugin
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/Gayxx/GayxxProvider;", "Lcom/lagradost/cloudstream3/plugins/Plugin;", "<init>", "()V", "load", "", "context", "Landroid/content/Context;", "Gayxx"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GayxxProvider extends com.lagradost.cloudstream3.plugins.Plugin {
    public GayxxProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    public void load(@org.jetbrains.annotations.NotNull android.content.Context r2) {
            r1 = this;
            com.Gayxx.Gayxx r0 = new com.Gayxx.Gayxx
            r0.<init>()
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            r1.registerMainAPI(r0)
            com.Gayxx.VoeExtractor r0 = new com.Gayxx.VoeExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.lagradost.cloudstream3.extractors.DoodLaExtractor r0 = new com.lagradost.cloudstream3.extractors.DoodLaExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Gayxx.vvide0Extractor r0 = new com.Gayxx.vvide0Extractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Gayxx.dsio r0 = new com.Gayxx.dsio
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Gayxx.Doply r0 = new com.Gayxx.Doply
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.lagradost.cloudstream3.extractors.Voe r0 = new com.lagradost.cloudstream3.extractors.Voe
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Gayxx.Bingezove r0 = new com.Gayxx.Bingezove
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Gayxx.luluvid r0 = new com.Gayxx.luluvid
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Gayxx.Lulustream r0 = new com.Gayxx.Lulustream
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Gayxx.FilemoonV2 r0 = new com.Gayxx.FilemoonV2
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Gayxx.FileMoon r0 = new com.Gayxx.FileMoon
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Gayxx.AbyssExtractor r0 = new com.Gayxx.AbyssExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Gayxx.GaybbExtractor r0 = new com.Gayxx.GaybbExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            return
    }
}
