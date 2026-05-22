package com.Gaycock4U;

import android.content.Context;
import com.lagradost.cloudstream3.extractors.DoodLaExtractor;
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin;
import com.lagradost.cloudstream3.plugins.Plugin;
import com.lagradost.cloudstream3.utils.ExtractorApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Gaycock4UPlugin.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Gaycock4U/classes.dex */
@CloudstreamPlugin
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/Gaycock4U/Gaycock4UPlugin;", "Lcom/lagradost/cloudstream3/plugins/Plugin;", "<init>", "()V", "load", "", "context", "Landroid/content/Context;", "Gaycock4U"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Gaycock4UPlugin extends Plugin {
    public void load(@NotNull Context context) {
        registerMainAPI(new Gaycock4U());
        registerExtractorAPI((ExtractorApi) new DoodLaExtractor());
        registerExtractorAPI((ExtractorApi) new dsio());
        registerExtractorAPI((ExtractorApi) new DoodstreamCom());
        registerExtractorAPI((ExtractorApi) new vide0());
        registerExtractorAPI(new Davioad(null, null, false, 7, null));
    }
}
