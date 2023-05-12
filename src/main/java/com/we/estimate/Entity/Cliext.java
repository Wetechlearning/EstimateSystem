package com.we.estimate.Entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
    * クライアント拡張マスタ
    */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cliext {
    /**
    * クライアントコード
    */
    private Integer cdClient;

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
    * ＬＢＣコード
    */
    private Long cdLbc;

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
}