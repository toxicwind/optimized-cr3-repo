package com.Nurgay;

/* JADX INFO: compiled from: NurgayProvider.kt */
/* JADX INFO: loaded from: /tmp/tmp.rJvOdrbIG3/classes.dex */
@com.lagradost.cloudstream3.plugins.CloudstreamPlugin
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/Nurgay/NurgayProvider;", "Lcom/lagradost/cloudstream3/plugins/Plugin;", "<init>", "()V", "load", "", "context", "Landroid/content/Context;", "Nurgay"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NurgayProvider extends com.lagradost.cloudstream3.plugins.Plugin {
    public NurgayProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    public void load(@org.jetbrains.annotations.NotNull android.content.Context r2) {
            r1 = this;
            com.Nurgay.Nurgay r0 = new com.Nurgay.Nurgay
            r0.<init>()
            com.lagradost.cloudstream3.MainAPI r0 = (com.lagradost.cloudstream3.MainAPI) r0
            r1.registerMainAPI(r0)
            com.Nurgay.Bigwarp r0 = new com.Nurgay.Bigwarp
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.lagradost.cloudstream3.extractors.Voe r0 = new com.lagradost.cloudstream3.extractors.Voe
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.VoeExtractor r0 = new com.Nurgay.VoeExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.dsio r0 = new com.Nurgay.dsio
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.DoodstreamCom r0 = new com.Nurgay.DoodstreamCom
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.Doodspro r0 = new com.Nurgay.Doodspro
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.DoodLiExtractor r0 = new com.Nurgay.DoodLiExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.DoodToExtractor r0 = new com.Nurgay.DoodToExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.DoodPmExtractor r0 = new com.Nurgay.DoodPmExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.DoodCxExtractor r0 = new com.Nurgay.DoodCxExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.doodre r0 = new com.Nurgay.doodre
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.DoodShExtractor r0 = new com.Nurgay.DoodShExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.DoodSoExtractor r0 = new com.Nurgay.DoodSoExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.DoodWatchExtractor r0 = new com.Nurgay.DoodWatchExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.DoodWfExtractor r0 = new com.Nurgay.DoodWfExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.DoodWsExtractor r0 = new com.Nurgay.DoodWsExtractor
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.D0000d r0 = new com.Nurgay.D0000d
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.D000dCom r0 = new com.Nurgay.D000dCom
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.Ds2play r0 = new com.Nurgay.Ds2play
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.Ds2video r0 = new com.Nurgay.Ds2video
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.DSVPlay r0 = new com.Nurgay.DSVPlay
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.Dooodster r0 = new com.Nurgay.Dooodster
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.Dooood r0 = new com.Nurgay.Dooood
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.vide0 r0 = new com.Nurgay.vide0
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.ListMirror r0 = new com.Nurgay.ListMirror
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.lagradost.cloudstream3.extractors.MixDrop r0 = new com.lagradost.cloudstream3.extractors.MixDrop
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.MxDrop r0 = new com.Nurgay.MxDrop
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.MixDropCv r0 = new com.Nurgay.MixDropCv
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.mdfx9dc8n r0 = new com.Nurgay.mdfx9dc8n
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.MixDropIs r0 = new com.Nurgay.MixDropIs
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.MixDropAg r0 = new com.Nurgay.MixDropAg
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.lagradost.cloudstream3.extractors.StreamTape r0 = new com.lagradost.cloudstream3.extractors.StreamTape
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.lagradost.cloudstream3.extractors.VinovoTo r0 = new com.lagradost.cloudstream3.extractors.VinovoTo
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.VidNest r0 = new com.Nurgay.VidNest
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            com.Nurgay.Videzz r0 = new com.Nurgay.Videzz
            r0.<init>()
            com.lagradost.cloudstream3.utils.ExtractorApi r0 = (com.lagradost.cloudstream3.utils.ExtractorApi) r0
            r1.registerExtractorAPI(r0)
            return
    }
}
