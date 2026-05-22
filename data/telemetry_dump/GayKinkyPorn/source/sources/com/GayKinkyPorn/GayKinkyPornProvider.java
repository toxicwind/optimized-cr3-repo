package com.GayKinkyPorn;

import android.content.Context;
import com.lagradost.cloudstream3.extractors.Voe;
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin;
import com.lagradost.cloudstream3.plugins.Plugin;
import com.lagradost.cloudstream3.utils.ExtractorApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GayKinkyPornProvider.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/GayKinkyPorn/classes.dex */
@CloudstreamPlugin
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/GayKinkyPorn/GayKinkyPornProvider;", "Lcom/lagradost/cloudstream3/plugins/Plugin;", "<init>", "()V", "load", "", "context", "Landroid/content/Context;", "GayKinkyPorn"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GayKinkyPornProvider extends Plugin {
    public void load(@NotNull Context context) {
        registerMainAPI(new GayKinkyPorn());
        registerExtractorAPI(new Bigwarp());
        registerExtractorAPI((ExtractorApi) new Voe());
        registerExtractorAPI(new VoeExtractor());
        registerExtractorAPI(new dsio());
        registerExtractorAPI((ExtractorApi) new DoodstreamCom());
        registerExtractorAPI((ExtractorApi) new Doodspro());
        registerExtractorAPI((ExtractorApi) new Doodyt());
        registerExtractorAPI((ExtractorApi) new Doodre());
        registerExtractorAPI((ExtractorApi) new Doodpm());
        registerExtractorAPI((ExtractorApi) new Dsvplay());
        registerExtractorAPI((ExtractorApi) new Vidply());
        registerExtractorAPI((ExtractorApi) new Doply());
        registerExtractorAPI((ExtractorApi) new vide0());
        registerExtractorAPI(new FilemoonV2());
    }
}
