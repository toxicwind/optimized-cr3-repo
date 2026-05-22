package com.iGay69;

import android.content.Context;
import com.lagradost.cloudstream3.extractors.Lulustream1;
import com.lagradost.cloudstream3.extractors.Lulustream2;
import com.lagradost.cloudstream3.extractors.MixDrop;
import com.lagradost.cloudstream3.extractors.StreamTape;
import com.lagradost.cloudstream3.extractors.Voe;
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin;
import com.lagradost.cloudstream3.plugins.Plugin;
import com.lagradost.cloudstream3.utils.ExtractorApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: iGay69Provider.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/iGay69/classes.dex */
@CloudstreamPlugin
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/iGay69/iGay69Plugin;", "Lcom/lagradost/cloudstream3/plugins/Plugin;", "<init>", "()V", "load", "", "context", "Landroid/content/Context;", "iGay69"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class iGay69Plugin extends Plugin {
    public void load(@NotNull Context context) {
        registerMainAPI(new iGay69());
        registerExtractorAPI(new Bigwarp());
        registerExtractorAPI((ExtractorApi) new Voe());
        registerExtractorAPI(new VoeExtractor());
        registerExtractorAPI(new dsio());
        registerExtractorAPI((ExtractorApi) new DoodstreamCom());
        registerExtractorAPI((ExtractorApi) new vide0());
        registerExtractorAPI((ExtractorApi) new doodspro());
        registerExtractorAPI((ExtractorApi) new doodyt());
        registerExtractorAPI((ExtractorApi) new doodre());
        registerExtractorAPI((ExtractorApi) new doodpm());
        registerExtractorAPI(new Lulustream());
        registerExtractorAPI((ExtractorApi) new Lulustream1());
        registerExtractorAPI((ExtractorApi) new Lulustream2());
        registerExtractorAPI((ExtractorApi) new luluvid());
        registerExtractorAPI((ExtractorApi) new StreamTape());
        registerExtractorAPI((ExtractorApi) new watchadsontape());
        registerExtractorAPI((ExtractorApi) new MxDrop());
        registerExtractorAPI((ExtractorApi) new MixDropCv());
        registerExtractorAPI((ExtractorApi) new MixDropIs());
        registerExtractorAPI((ExtractorApi) new MixDropSn());
        registerExtractorAPI((ExtractorApi) new MixDrop());
        registerExtractorAPI((ExtractorApi) new mdfx9dc8n());
        registerExtractorAPI(new FileMoon());
        registerExtractorAPI(new FilemoonV2());
        registerExtractorAPI(new FileMoonSx());
        registerExtractorAPI(new WaawExtractor());
    }
}
