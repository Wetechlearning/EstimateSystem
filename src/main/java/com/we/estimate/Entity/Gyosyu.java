package com.we.estimate.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 業種マスタ
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gyosyu {
    /**
    * 業種コード
    */
    private Integer cdGyoshu;

    /**
    * 業種漢字
    */
    private String nmGyoshu;

    /**
    * 更新日付
    */
    private Integer dtUpdate;

    /**
    * 更新時刻
    */
    private Integer tmUpdate;

    /**
    * 予備
    */
    private String nmYobi;
}