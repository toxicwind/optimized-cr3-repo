package com.GayStream;

/* JADX INFO: compiled from: GayStreamProvider.kt */
/* JADX INFO: loaded from: /tmp/tmp.mVtwsAxdAD/classes.dex */
@com.lagradost.cloudstream3.plugins.CloudstreamPlugin
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/GayStream/GayStreamProvider;", "Lcom/lagradost/cloudstream3/plugins/Plugin;", "<init>", "()V", "load", "", "context", "Landroid/content/Context;", "GayStream"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GayStreamProvider extends com.lagradost.cloudstream3.plugins.Plugin {
    public GayStreamProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    public void load(@org.jetbrains.annotations.NotNull android.content.Context r2) {
            r1 = this;
            com.GayStream.GayStream r0 = new com.GayStream.GayStream
            r0.<init>()
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            r1.registerMainAPI(r0)
            com.GayStream.Bigwarp r0 = new com.GayStream.Bigwarp
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.lagradost.cloudstream3.extractors.Voe r0 = new com.lagradost.cloudstream3.extractors.Voe
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.GayStream.VoeExtractor r0 = new com.GayStream.VoeExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.GayStream.dsio r0 = new com.GayStream.dsio
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.GayStream.DoodstreamCom r0 = new com.GayStream.DoodstreamCom
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.GayStream.vide0 r0 = new com.GayStream.vide0
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.GayStream.ListMirror r0 = new com.GayStream.ListMirror
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.GayStream.FilemoonV2 r0 = new com.GayStream.FilemoonV2
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.GayStream.FileMoonSx r0 = new com.GayStream.FileMoonSx
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.GayStream.byseqekaho r0 = new com.GayStream.byseqekaho
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.lagradost.cloudstream3.extractors.VidhideExtractor r0 = new com.lagradost.cloudstream3.extractors.VidhideExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.GayStream.Space r0 = new com.GayStream.Space
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            return
    }
}
