package com.we.estimate.Entity;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
public class ShaIn {
    private Timestamp tdInsert; // 登録日時
    private String idUserI; // 登録ユーザーID
    private String idComputerI; // 登録コンピューターID
    private String idPgI; // 登録プログラムID
    private Timestamp tdUpdate; // 更新日時
    private String idUserU; // 更新ユーザーID
    private String idComputerU; // 更新コンピューターID
    private String idPgU; // 更新プログラムID
    private Timestamp tdDelete; // 削除日時
    private String idUserD; // 削除ユーザーID
    private String idComputerD; // 削除コンピューターID
    private String idPgD; // 削除プログラムID
    private Integer fgDelete; // 削除フラグ
    private Timestamp tdBat; // バッチ処理日時
    private String idUserB; // バッチ処理ユーザーID
    private String idComputerB; // バッチ処理コンピューターID
    private String idPgB; // バッチ処理プログラムID
    private String idUserGodI; // 登録神ユーザーID
    private String idUserGodU; // 更新神ユーザーID
    private String idUserGodD; // 削除神ユーザーID
    private String idUserGodB; // バッチ処理神ユーザーID
    private String cdKaisha; // 会社コード
    private String cdBusho; // 部署コード
    private String cdShain; // 社員コード
    private String knShain; // 社員名（カナ）
    private String nmShain; // 社員名（漢字）
    private Integer kbShain; // 社員区分
    private Integer kbKessai; // 決済区分
    private Integer cdGinkoShiten; // 銀行支店コード
    private String knMeigi; // 名義人名
    private Integer kbKozaShubetsu; // 口座種別
    private Integer noKoza; // 口座番号
    private String kbFruites; // FRUITS権限
    private String cdBu; // BUコード
    private Integer kbDairi; // 代理店区分
    private String cdDairiKankatsu; // 代理店管轄社員コード
    private String kbMenuSk; // メニューSK
    private String kbShozokuMc5; // 所属MC5
    private String kbKengenMc5; // 権限MC5
    private String nmYobi; // 予備
    private Integer dtUpdate; // 更新日付
    private Integer tmUpdate; // 更新時刻
    private Integer cdOldShain; // 旧社員コード
    private Integer fgChkShushoku; // 申込チェックグループ（就職）
    private Integer fgChkKyoiku; // 申込チェックグループ（教育）
    private Integer fgYoshinDairiten; // 代理店与信超過フラグ区分
    private String nmYoshinCommentDairiten; // 代理店与信超過コメント
    private String kbWebKahi; // WEB申込可否区分

    // ShaInデータベースに保存されてない　もしくは足りない項目
    private String nmBusho; // 部署名
    private String kbShozokucho; // 所属長区分名
    private String fgYukou; // 有効フラグ

}
