package com.we.estimate.Entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * クライアントマスタワーク
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class McTm010 {
    /**
    * 仮クライアントコード
    */
    private Integer cdClientKari;

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
    * 版数
    */
    private Short noHan;

    /**
    * 承認ステータス区分
    */
    private String kbWfStatus;

    /**
    * 承認ステータスNO
    */
    private Short noWfSt;

    /**
    * 申請者コード
    */
    private String cdShinsei;

    /**
    * 申請日
    */
    private Integer dtShinsei;

    /**
    * 承認者コード
    */
    private String cdShonin;

    /**
    * 承認日
    */
    private Integer dtShonin;

    /**
    * クライアントコード
    */
    private Integer cdClient;

    /**
    * 登録種別
    */
    private String kbShubetsu;

    /**
    * カナ社名
    */
    private String knClient;

    /**
    * 社名漢字
    */
    private String nmClient;

    /**
    * 郵便番号
    */
    private Integer noYubin;

    /**
    * 所在地
    */
    private String nmAddress;

    /**
    * TEL
    */
    private String noTel;

    /**
    * FAX
    */
    private String noFax;

    /**
    * クラ担当者所属部署
    */
    private String nmClientBusho;

    /**
    * クラ担当者肩書氏名
    */
    private String nmClientTanto;

    /**
    * 業種コード
    */
    private Integer cdGyoshu;

    /**
    * 上場区分
    */
    private Short kbJohjoh;

    /**
    * 証券コード
    */
    private Short cdShoken;

    /**
    * 営業部署コード
    */
    private String cdEigyoBusho;

    /**
    * 営業担当コード
    */
    private String cdEigyoTanto;

    /**
    * 取引区分-本年度
    */
    private Short kbTorihikiHonnen;

    /**
    * 取引区分-前年度
    */
    private Short kbTorihikiZennen;

    /**
    * 取引区分-一昨年度
    */
    private Short kbTorihikiSakunen;

    /**
    * 入金形態
    */
    private Short kbNyukinKeitai;

    /**
    * 入金サイト
    */
    private Short noNyukinSite;

    /**
    * 締日
    */
    private Short dtShime;

    /**
    * 請求特記事項
    */
    private String nmSeikyuTokki;

    /**
    * クライアント区分(1)
    */
    private Short kbClient1;

    /**
    * クライアント区分(2)
    */
    private Short kbClient2;

    /**
    * クライアント区分(3)
    */
    private Short kbClient3;

    /**
    * クライアント区分(4)
    */
    private Short kbClient4;

    /**
    * 事業区分
    */
    private Short kbJigyo;

    /**
    * 郵便番号7
    */
    private String noYubin7;

    /**
    * マップ企業ID
    */
    private Integer idMapKigyo;

    /**
    * 登録前期実績区分
    */
    private Short kbTorokuMae;

    /**
    * 登録前期実績クライアントコード
    */
    private Integer cdClientTorokuMae;

    /**
    * 代理店社員コード
    */
    private String cdShainDairiten;

    /**
    * フラグ１
    */
    private String fgFlag1;

    /**
    * フラグ２
    */
    private String fgFlag2;

    /**
    * クラ特記事項
    */
    private String nmTokki;

    /**
    * LBCコード
    */
    private Long cdLbc;

    /**
    * 未入金フラグ
    */
    private String fgMinyukin;

    /**
    * 事故履歴フラグ
    */
    private String fgJiko;

    /**
    * 非課税フラグ
    */
    private String fgHikazei;

    /**
    * 営業担当会社コード
    */
    private String cdEigyoKaisha;

    /**
    * クライアント名カナ全角
    */
    private String knClientZenkaku;

    /**
    * 経理保留フラグ
    */
    private Short fgHoryuKeiri;

    /**
    * 反社フラグ
    */
    private Short fgHansha;

    /**
    * 反社フラグコメント
    */
    private String nmHanshaComment;

    /**
    * 与信超過フラグ
    */
    private Short fgYoshin;

    /**
    * 与信超過フラグコメント
    */
    private String nmYoshinComment;

    /**
    * 請求書印字コメント
    */
    private String nmSeikyushoInjiComment;

    /**
    * 部分修正フラグ
    */
    private Short fgPartModify;

    /**
    * 反社審査No
    */
    private String noHanshaShinsa;

    /**
    * 企業審査保留フラグ
    */
    private Short fgHoryuKigyo;

    /**
    * 請求文言（CL固定）
    */
    private String nmSeikyuMongonCl;

    /**
    * 振込先口座変更区分
    */
    private String kbFurikomiKozaHenko;

    /**
    * 振込先口座コード
    */
    private String cdFurikomiKoza;

    private String cdGinkoVirtual;

    private String cdShitenVirtual;

    private String noKozaVirtual;

    /**
    * WEB申込禁止フラグ
    */
    private Short fgWebKinshi;

    /**
    * WEB申込禁止フラグコメント
    */
    private String nmWebKinshiComment;

    /**
    * WEB申込可否区分
    */
    private String kbWebKahi;

    /**
    * グループコード
    */
    private String cdClientGroup;
}