package com.we.estimate.InputCheckMessage;


import java.util.HashMap;
import java.util.Map;

public class ShaInInputCheck {
    public Map<String, Map<String, String>> errorMap = new HashMap<>();
    public String[] isNullOrEmptyCheckingKeys;

    // エラーメッセージ初期化
    public ShaInInputCheck() {


        Map<String, String> cdKaisha = new HashMap<>();
        cdKaisha.put("isEmptyError", "会社");
        cdKaisha.put("formatError", "");

        errorMap.put("cdKaisha", cdKaisha);

        Map<String, String> cdBusho = new HashMap<>();
        cdBusho.put("isEmptyError", "部署コードを入力してください");
        cdBusho.put("formatError", "");

        errorMap.put("cdBusho", cdBusho);

        Map<String, String> cdShain = new HashMap<>();
        cdShain.put("isEmptyError", "社員コードを入力してください");
        cdShain.put("formatError", "");

        errorMap.put("cdShain", cdShain);

        Map<String, String> cdOldShain = new HashMap<>();
        cdOldShain.put("isEmptyError", "旧社員コード");
        cdOldShain.put("formatError", "");

        errorMap.put("cdOldShain", cdOldShain);

        Map<String, String> knShain = new HashMap<>();
        knShain.put("isEmptyError", "社員名（カナ）");
        knShain.put("formatError", "");

        errorMap.put("knShain", knShain);

        Map<String, String> nmShain = new HashMap<>();
        nmShain.put("isEmptyError", "社員名");
        nmShain.put("formatError", "");

        errorMap.put("nmShain", nmShain);

        Map<String, String> kbShain = new HashMap<>();
        kbShain.put("isEmptyError", "社員区分");
        kbShain.put("formatError", "");

        errorMap.put("kbShain", kbShain);

        Map<String, String> kbFruites = new HashMap<>();
        kbFruites.put("isEmptyError", "FRUITS権限レベル");
        kbFruites.put("formatError", "");

        errorMap.put("kbFruites", kbFruites);

        Map<String, String> kbDairi = new HashMap<>();
        kbDairi.put("isEmptyError", "代理店区分");
        kbDairi.put("formatError", "");

        errorMap.put("kbDairi", kbDairi);

        Map<String, String> cdDairiKankatsu = new HashMap<>();
        cdDairiKankatsu.put("isEmptyError", "代理店管轄社員");
        cdDairiKankatsu.put("formatError", "");

        errorMap.put("cdDairiKankatsu", cdDairiKankatsu);

        Map<String, String> kbShozokuMc5 = new HashMap<>();
        kbShozokuMc5.put("isEmptyError", "権限区分");
        kbShozokuMc5.put("formatError", "");

        errorMap.put("kbShozokuMc5", kbShozokuMc5);

        Map<String, String> fgChkShushoku = new HashMap<>();
        fgChkShushoku.put("isEmptyError", "申込チェックグループ（就職）");
        fgChkShushoku.put("formatError", "");

        errorMap.put("fgChkShushoku", fgChkShushoku);

        Map<String, String> fgChkKyoiku = new HashMap<>();
        fgChkKyoiku.put("isEmptyError", "申込チェックグループ（教育）");
        fgChkKyoiku.put("formatError", "");

        errorMap.put("fgChkKyoiku", fgChkKyoiku);

        Map<String, String> fgYoshinDairiten = new HashMap<>();
        fgYoshinDairiten.put("isEmptyError", "代理店与信超過フラグ区分");
        fgYoshinDairiten.put("formatError", "");

        errorMap.put("fgYoshinDairiten", fgYoshinDairiten);

        Map<String, String> nmYoshinCommentDairiten = new HashMap<>();
        nmYoshinCommentDairiten.put("isEmptyError", "代理店与信超過コメント");
        nmYoshinCommentDairiten.put("formatError", "");

        errorMap.put("nmYoshinCommentDairiten", nmYoshinCommentDairiten);

        Map<String, String> fgDelete = new HashMap<>();
        fgDelete.put("isEmptyError", "有効フラグ");
        fgDelete.put("formatError", "");

        errorMap.put("fgDelete", fgDelete);

        Map<String, String> kbWebKahi = new HashMap<>();
        kbWebKahi.put("isEmptyError", "WEB申込可否区分");
        kbWebKahi.put("formatError", "");

        errorMap.put("kbWebKahi", kbWebKahi);

        isNullOrEmptyCheckingKeys = new String[] {
                "cdKaisha",
                "cdBusho",
                "cdShain",

        };

    }

}
