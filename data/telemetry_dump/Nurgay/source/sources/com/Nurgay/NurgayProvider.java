package com.Nurgay;

import android.content.Context;
import com.lagradost.cloudstream3.extractors.MixDrop;
import com.lagradost.cloudstream3.extractors.StreamTape;
import com.lagradost.cloudstream3.extractors.VinovoTo;
import com.lagradost.cloudstream3.extractors.Voe;
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin;
import com.lagradost.cloudstream3.plugins.Plugin;
import com.lagradost.cloudstream3.utils.ExtractorApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NurgayProvider.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Nurgay/classes.dex */
@CloudstreamPlugin
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/Nurgay/NurgayProvider;", "Lcom/lagradost/cloudstream3/plugins/Plugin;", "<init>", "()V", "load", "", "context", "Landroid/content/Context;", "Nurgay"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NurgayProvider extends Plugin {
    public void load(@NotNull Context context) {
        registerMainAPI(new Nurgay());
        registerExtractorAPI(new Bigwarp());
        registerExtractorAPI((ExtractorApi) new Voe());
        registerExtractorAPI(new VoeExtractor());
        registerExtractorAPI(new dsio());
        registerExtractorAPI((ExtractorApi) new DoodstreamCom());
        registerExtractorAPI((ExtractorApi) new Doodspro());
        registerExtractorAPI((ExtractorApi) new DoodLiExtractor());
        registerExtractorAPI((ExtractorApi) new DoodToExtractor());
        registerExtractorAPI((ExtractorApi) new DoodPmExtractor());
        registerExtractorAPI((ExtractorApi) new DoodCxExtractor());
        registerExtractorAPI((ExtractorApi) new doodre());
        registerExtractorAPI((ExtractorApi) new DoodShExtractor());
        registerExtractorAPI((ExtractorApi) new DoodSoExtractor());
        registerExtractorAPI((ExtractorApi) new DoodWatchExtractor());
        registerExtractorAPI((ExtractorApi) new DoodWfExtractor());
        registerExtractorAPI((ExtractorApi) new DoodWsExtractor());
        registerExtractorAPI((ExtractorApi) new D0000d());
        registerExtractorAPI((ExtractorApi) new D000dCom());
        registerExtractorAPI((ExtractorApi) new Ds2play());
        registerExtractorAPI((ExtractorApi) new Ds2video());
        registerExtractorAPI((ExtractorApi) new DSVPlay());
        registerExtractorAPI((ExtractorApi) new Dooodster());
        registerExtractorAPI((ExtractorApi) new Dooood());
        registerExtractorAPI((ExtractorApi) new vide0());
        registerExtractorAPI(new ListMirror());
        registerExtractorAPI((ExtractorApi) new MixDrop());
        registerExtractorAPI((ExtractorApi) new MxDrop());
        registerExtractorAPI((ExtractorApi) new MixDropCv());
        registerExtractorAPI((ExtractorApi) new mdfx9dc8n());
        registerExtractorAPI((ExtractorApi) new MixDropIs());
        registerExtractorAPI((ExtractorApi) new MixDropAg());
        registerExtractorAPI((ExtractorApi) new StreamTape());
        registerExtractorAPI((ExtractorApi) new VinovoTo());
        registerExtractorAPI(new VidNest());
        registerExtractorAPI(new Videzz());
    }
}
