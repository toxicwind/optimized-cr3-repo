package com.Jayboys;

/* JADX INFO: compiled from: Extractors.kt */
/* JADX INFO: loaded from: /home/toxic/cr3_forge/telemetry_dump_unblinded/Jayboys/classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"}, d2 = {"reconstructDataUris", "", "", "text", "maxCollect", "", "Jayboys"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class ExtractorsKt {
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.String> reconstructDataUris(@org.jetbrains.annotations.NotNull java.lang.String r14, int r15) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1 = r14
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r5 = 6
            r6 = 0
            java.lang.String r2 = "data:video/"
            r3 = 0
            r4 = 0
            int r1 = kotlin.text.StringsKt.indexOf$default(r1, r2, r3, r4, r5, r6)
            r4 = r1
        L15:
            if (r4 < 0) goto Le3
            r2 = r14
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r6 = 4
            r7 = 0
            java.lang.String r3 = "base64,"
            r5 = 0
            int r1 = kotlin.text.StringsKt.indexOf$default(r2, r3, r4, r5, r6, r7)
            if (r1 < 0) goto Le3
            int r2 = r1 + 7
            java.lang.String r2 = r14.substring(r4, r2)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r5 = r1 + 7
            r6 = 0
        L38:
            int r7 = r14.length()
            r8 = 0
            r9 = 1
            if (r5 >= r7) goto Lae
            if (r6 >= r15) goto Lae
            char r7 = r14.charAt(r5)
            r10 = 65
            if (r10 > r7) goto L50
            r10 = 91
            if (r7 >= r10) goto L50
            r10 = 1
            goto L51
        L50:
            r10 = 0
        L51:
            if (r10 != 0) goto La6
            r10 = 97
            if (r10 > r7) goto L5d
            r10 = 123(0x7b, float:1.72E-43)
            if (r7 >= r10) goto L5d
            r10 = 1
            goto L5e
        L5d:
            r10 = 0
        L5e:
            if (r10 != 0) goto La6
            r10 = 48
            if (r10 > r7) goto L6a
            r10 = 58
            if (r7 >= r10) goto L6a
            r10 = 1
            goto L6b
        L6a:
            r10 = 0
        L6b:
            if (r10 != 0) goto La6
            r10 = 43
            if (r7 == r10) goto La6
            r11 = 47
            if (r7 == r11) goto La6
            r11 = 61
            if (r7 != r11) goto L7a
            goto La6
        L7a:
            r11 = 39
            if (r7 == r11) goto La3
            r11 = 34
            if (r7 == r11) goto La3
            if (r7 == r10) goto La3
            boolean r10 = kotlin.text.CharsKt.isWhitespace(r7)
            if (r10 == 0) goto L8b
            goto La3
        L8b:
            r10 = 60
            r11 = 8
            if (r7 == r10) goto L95
            r10 = 62
            if (r7 != r10) goto L97
        L95:
            if (r6 > r11) goto Lae
        L97:
            boolean r10 = java.lang.Character.isLetterOrDigit(r7)
            if (r10 != 0) goto L9f
            if (r6 > r11) goto Lae
        L9f:
        La0:
            int r5 = r5 + 1
            goto L38
        La3:
            int r5 = r5 + 1
            goto L38
        La6:
            r3.append(r7)
            int r6 = r6 + 1
            int r5 = r5 + 1
            goto L38
        Lae:
            r7 = r3
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 <= 0) goto Lb8
            r8 = 1
        Lb8:
            if (r8 == 0) goto Lce
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.StringBuilder r7 = r7.append(r3)
            java.lang.String r7 = r7.toString()
            r0.add(r7)
        Lce:
            if (r5 > r4) goto Ld3
            int r7 = r4 + 1
            goto Ld4
        Ld3:
            r7 = r5
        Ld4:
            r10 = r7
            r8 = r14
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r12 = 4
            r13 = 0
            java.lang.String r9 = "data:video/"
            r11 = 0
            int r4 = kotlin.text.StringsKt.indexOf$default(r8, r9, r10, r11, r12, r13)
            goto L15
        Le3:
            return r0
    }

    public static /* synthetic */ java.util.List reconstructDataUris$default(java.lang.String r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 2
            if (r2 == 0) goto L7
            r1 = 300000(0x493e0, float:4.2039E-40)
        L7:
            java.util.List r0 = reconstructDataUris(r0, r1)
            return r0
    }
}
