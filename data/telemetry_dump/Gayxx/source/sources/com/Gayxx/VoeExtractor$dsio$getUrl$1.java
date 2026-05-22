package com.Gayxx;

import com.Gayxx.VoeExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extractor.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Gayxx/classes.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.Gayxx.VoeExtractor$dsio", f = "Extractor.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {72, 78, 92}, m = "getUrl", n = {"url", "referer", "url", "referer", "response0", "passMd5Path", "token", "md5Url", "url", "referer", "response0", "passMd5Path", "token", "md5Url", "res", "videoData", "randomStr", "link", "quality"}, nl = {74, 79, 91}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10"}, v = 2)
final class VoeExtractor$dsio$getUrl$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VoeExtractor.dsio this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VoeExtractor$dsio$getUrl$1(VoeExtractor.dsio dsioVar, Continuation<? super VoeExtractor$dsio$getUrl$1> continuation) {
        super(continuation);
        this.this$0 = dsioVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getUrl(null, null, (Continuation) this);
    }
}
