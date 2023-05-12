package com.we.estimate.Entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
    * 社員マスタ
    */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Syain {
    /**
    * 社員コード
    */
    private String cdShain;

    /**
    * 追加日時
    */
    private Date tdInsert;

    /**
    * 追加ユーザID
    */
    private String idUserI;

    /**
    * 追加コンピュータID
    */
    private String idComputerI;

    /**
    * 追加PGID
    */
    private String idPgI;

    /**
    * 更新日時
    */
    private Date tdUpdate;

    /**
    * 更新ユーザID
    */
    private String idUserU;

    /**
    * 更新コンピュータID
    */
    private String idComputerU;

    /**
    * 更新PGID
    */
    private String idPgU;

    /**
    * 削除日時
    */
    private Date tdDelete;

    /**
    * 削除ユーザID
    */
    private String idUserD;

    /**
    * 削除コンピュータID
    */
    private String idComputerD;

    /**
    * 削除PGID
    */
    private String idPgD;

    /**
    * 削除フラグ
    */
    private Short fgDelete;

    /**
    * バッチ処理日時
    */
    private Date tdBat;

    /**
    * バッチユーザID
    */
    private String idUserB;

    /**
    * バッチコンピュータID
    */
    private String idComputerB;

    /**
    * バッチPGID
    */
    private String idPgB;

    /**
    * 追加ユーザID(GOD)
    */
    private String idUserGodI;

    /**
    * 更新ユーザID(GOD)
    */
    private String idUserGodU;

    /**
    * 削除ユーザID(GOD)
    */
    private String idUserGodD;

    /**
    * バッチユーザID(GOD)
    */
    private String idUserGodB;

    /**
    * 会社コード
    */
    private String cdKaisha;

    /**
    * 部署コード
    */
    private String cdBusho;

    /**
    * 社員名カナ
    */
    private String knShain;

    /**
    * 社員名
    */
    private String nmShain;

    /**
    * 社員区分
    */
    private Short kbShain;

    /**
    * 決済方法区分
    */
    private Short kbKessai;

    /**
    * 銀行支店コード
    */
    private Integer cdGinkoShiten;

    /**
    * 名義人カナ
    */
    private String knMeigi;

    /**
    * 口座種別
    */
    private Short kbKozaShubetsu;

    /**
    * 口座ＮＯ
    */
    private Integer noKoza;

    /**
    * FRUITSシステム権限
    */
    private String kbFruites;

    /**
    * 部コード
    */
    private String cdBu;

    /**
    * 代理店区分
    */
    private Short kbDairi;

    /**
    * 代理店管轄社員コード
    */
    private String cdDairiKankatsu;

    /**
    * SKメニュー権限
    */
    private String kbMenuSk;

    /**
    * MC5所属長区分
    */
    private String kbShozokuMc5;

    /**
    * MC5権限区分
    */
    private String kbKengenMc5;

    /**
    * 予備
    */
    private String nmYobi;

    /**
    * 更新日付
    */
    private Integer dtUpdate;

    /**
    * 更新時刻
    */
    private Integer tmUpdate;

    /**
    * 旧社員コード
    */
    private Integer cdOldShain;

    /**
    * 申込チェックグループフラグ(就職)
    */
    private Short fgChkShushoku;

    /**
    * 申込チェックグループフラグ(教育)
    */
    private Short fgChkKyoiku;

    /**
    * 代理店与信超過フラグ
    */
    private Short fgYoshinDairiten;

    /**
    * 代理店与信超過コメント
    */
    private String nmYoshinCommentDairiten;

    /**
    * WEB申込可否区分
    */
    private String kbWebKahi;
}