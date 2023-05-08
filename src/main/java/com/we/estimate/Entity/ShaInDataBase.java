package com.we.estimate.Entity;

import lombok.Data;

@Data
public class ShaInDataBase {
    private String td_insert; // 追加日時
    private String id_user_i; // 追加ユーザID
    private String id_computer_i; // 追加コンピュータID
    private String id_pg_i; // 追加PGID
    private String td_update; // 更新日時
    private String id_user_u; // 更新ユーザID
    private String id_computer_u; // 更新コンピュータID
    private String id_pg_u; // 更新PGID
    private String td_delete; // 削除日時
    private String id_user_d; // 削除ユーザID
    private String id_computer_d; // 削除コンピュータID
    private String id_pg_d; // 削除PGID
    private String fg_delete; // 削除フラグ
    private String td_bat; // バッチ処理日時
    private String id_user_b; // バッチユーザID
    private String id_computer_b; // バッチコンピュータID
    private String id_pg_b; // バッチPGID
    private String id_user_god_i; // 追加ユーザID(GOD)
    private String id_user_god_u; // 更新ユーザID(GOD)
    private String id_user_god_d; // 削除ユーザID(GOD)
    private String id_user_god_b; // バッチユーザID(GOD)
    private String cd_kaisha; // 会社コード
    private String cd_busho; // 部署コード
    private String cd_shain; // 社員コード
    private String kn_shain; // 社員名カナ
    private String nm_shain; // 社員名
    private String kb_shain; // 社員区分
    private String kb_kessai; // 決済方法区分
    private String cd_ginko_shiten; // 銀行支店コード
    private String kn_meigi; // 名義人カナ
    private String kb_koza_shubetsu; // 口座種別
    private String no_koza; // 口座ＮＯ
    private String kb_fruites; // FRUITSシステム権限
    private String cd_bu; // 部コード
    private String kb_dairi; // 代理店区分
    private String cd_dairi_kankatsu; // 代理店管轄社員コード
    private String kb_menu_sk; // SKメニュー権限
    private String kb_shozoku_mc5; // MC5所属長区分
    private String kb_kengen_mc5; // MC5権限区分
    private String nm_yobi; // 予備
    private String dt_update; // 更新日付
    private String tm_update; // 更新時刻
    private String cd_old_shain; // 旧社員コード
    private String fg_chk_shushoku; // 申込チェックグループフラグ(就職)
    private String fg_chk_kyoiku; // 申込チェックグループフラグ(教育)
    private String fg_yoshin_dairiten; // 代理店与信超過フラグ
    private String nm_yoshin_comment_dairiten; // 代理店与信超過コメント
    private String kb_web_kahi; // WEB申込可否区分

    // getters and setters

}
