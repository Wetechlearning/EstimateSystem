package com.we.estimate.Search;

import lombok.Data;

import java.util.Date;

@Data
public class MitsumoriShosai {
    /**
     * 見積No
     */
    private Long noMitsumori;

    /**
     * クライアント有無フラグ
     */
    private Short fgClientUmu;

    /**
     * 媒体年度
     */
    private String yyBaitai;

    /**
     * クライアントコード
     */
    private Integer cdClient;

    /**
     * クライアント名
     */
    private String nmClient;

    /**
     * 見積グループ名
     */
    private String nmMitsumoriGrp;

    /**
     * 見積昇格済フラグ
     * グループ昇格
     */
    private Short nmGroupShokaku;

    /**
     * 見積名
     */
    private Date nmMitsumori;

    /**
     * 見積フロー区分
     */
    private String kbMitsumoriFlw;

    /**
     * 営業担当部署コード
     */
    private String cdEigyoBusho;

    /**
     * 営業担当部署名
     */
    private String nmEigyoBusho;

    /**
     * 営業担当者コード
     */
    private String cdEigyoTanto;

    /**
     * 営業担当者名
     */
    private String nmEigyoTanto;

    /**
     * 作業担当者コード
     */
    private String cdSagyoTanto;

    /**
     * 作業担当者名
     */
    private String nmSagyoTanto;

    /**
     * 見積有効期限
     */
    private Integer dtMitsumoriEnd;

    /**
     * 作成日時
     */
    private Date tdSakusei;

    /**
     * 最終更新日時
     */
    private Date tdSaishuKoshin;

    /**
     * 承認ステータスNo
     */
    private Short noWfSt;

    /**
     * 昇格ソートNo
     */
    private Short noSortShokaku;

    /**
     * 見積書フォーマット区分
     */
    private String kbMitsumoriFrm;

    /**
     * 見積明細書出力フラグ
     */
    private Short fgMeisaiPrt;

    /**
     * 表示フラグ
     */
    private Short fgHyoji;

    /**
     * 定価合計
     */
    private Long ynTeikaSum;

    /**
     * 提案価格合計
     */
    private Long ynTeianSum;

    /**
     * 値引合計
     */
    private Long ynNebikiSum;

    /**
     * 値引タイトル
     */
    private String nmNebikiTitle;

    /**
     * 提案価格タイトル
     */
    private String nmTeianTitle;

    /**
     * 備考１
     */
    private String nmBiko1;

    /**
     * 備考２
     */
    private String nmBiko2;

    /**
     * 備考３
     */
    private String nmBiko3;

    /**
     * 備考４
     */
    private String nmBiko4;

    /**
     * 備考５
     */
    private String nmBiko5;

    /**
     * 備考６
     */
    private String nmBiko6;

    /**
     * 備考７
     */
    private String nmBiko7;

    /**
     * 備考８
     */
    private String nmBiko8;

    /**
     * 備考９
     */
    private String nmBiko9;

    /**
     * 備考１０
     */
    private String nmBiko10;

    /**
     * 備考１１
     */
    private String nmBiko11;

    /**
     * 備考１２
     */
    private String nmBiko12;

    /**
     * 申し送り事項
     */
    private String nmMoshiokuri;
}
