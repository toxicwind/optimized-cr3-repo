package com.Jayboys;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Extractors.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump/Jayboys/classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"reconstructDataUris", "", "", "text", "maxCollect", "", "Jayboys"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class ExtractorsKt {
    public static /* synthetic */ List reconstructDataUris$default(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 300000;
        }
        return reconstructDataUris(str, i);
    }

    @NotNull
    public static final List<String> reconstructDataUris(@NotNull String text, int maxCollect) {
        List out = new ArrayList();
        int idx = StringsKt.indexOf$default(text, "data:video/", 0, false, 6, (Object) null);
        while (idx >= 0) {
            int baseStart = StringsKt.indexOf$default(text, "base64,", idx, false, 4, (Object) null);
            if (baseStart < 0) {
                break;
            }
            String prefix = text.substring(idx, baseStart + 7);
            Intrinsics.checkNotNullExpressionValue(prefix, "substring(...)");
            StringBuilder sb = new StringBuilder();
            int i = baseStart + 7;
            int collected = 0;
            while (true) {
                if (i >= text.length() || collected >= maxCollect) {
                    break;
                }
                char c = text.charAt(i);
                if (!('A' <= c && c < '[')) {
                    if (!('a' <= c && c < '{')) {
                        if (!('0' <= c && c < ':') && c != '+' && c != '/' && c != '=') {
                            if (c == '\'' || c == '\"' || c == '+' || CharsKt.isWhitespace(c)) {
                                i++;
                            } else {
                                if (((c == '<' || c == '>') && collected > 8) || (!Character.isLetterOrDigit(c) && collected > 8)) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
                sb.append(c);
                collected++;
                i++;
            }
            if (sb.length() > 0) {
                out.add(prefix + ((Object) sb));
            }
            int nextFrom = i <= idx ? idx + 1 : i;
            idx = StringsKt.indexOf$default(text, "data:video/", nextFrom, false, 4, (Object) null);
        }
        return out;
    }
}
