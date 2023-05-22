package com.we.estimate.Entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * バーチャル銀行支店マスタ
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class McTm130 {
    /**
    * バーチャル銀行コード
    */
    private String cdGinkoVirtual;

    /**
    * バーチャル支店コード
    */
    private String cdShitenVirtual;

    /**
    * 事業区分
    */
    private String kbJigyo;

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
    * バーチャル銀行名
    */
    private String nmGinkoVirtual;

    /**
    * バーチャル支店名
    */
    private String nmShitenVirtual;

    /**
    * 預金種名
    */
    private String nmYokinshu;

    /**
    * 口座名
    */
    private String nmKoza;

    /**
    * 採番可フラグ
    */
    private Short fgSaibanKano;

    /**
    * 表示順
    */
    private Long noHyoji;
}