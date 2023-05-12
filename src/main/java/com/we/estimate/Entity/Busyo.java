package com.we.estimate.Entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
    * 部署マスタ
    */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Busyo {
    /**
    * 会社コード
    */
    private String cdKaisha;

    /**
    * 部署コード
    */
    private String cdBusho;

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
    * 部署漢字１
    */
    private String nmBusho;

    /**
    * 部署漢字２
    */
    private String nmBusho2;

    /**
    * 部署漢字３
    */
    private String nmBusho3;

    /**
    * 郵便番号
    */
    private String noYubin;

    /**
    * 所在地
    */
    private String nmShozaichi;

    /**
    * TEL
    */
    private String noTel;

    /**
    * FAX
    */
    private String noFax;

    /**
    * 発注担当部署
    */
    private String noHatchuBusho;

    /**
    * 事業本部区分
    */
    private String kbJigyoHombu;

    /**
    * 事業区分
    */
    private Short kbJigyo;

    /**
    * センター発注権限レベル
    */
    private Short kbHatchuLevel;

    /**
    * 親部署コード
    */
    private String cdBushoOya;

    /**
    * 部署区分
    */
    private String kbBusho;

    /**
    * 上位部門区分
    */
    private String kbBushoOya;

    /**
    * 部署表示順
    */
    private String noHyojiBusho;

    /**
    * 営業部署区分
    */
    private String kbBushoEigyo;

    /**
    * MC5事業部コード
    */
    private String cdJigyoMc5;

    /**
    * MC5部署区分
    */
    private String kbBushoMc5;

    /**
    * 作業部署初期値１
    */
    private String cdSagyoBushoDef1;

    /**
    * 作業部署初期値２
    */
    private String cdSagyoBushoDef2;

    /**
    * 作業部署初期値３
    */
    private String cdSagyoBushoDef3;

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
    * 旧部署コード
    */
    private Short cdOldBusho;

    /**
    * 管轄統括部区分
    */
    private String kbKankatsuTokatsu;
}