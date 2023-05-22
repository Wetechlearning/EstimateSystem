package com.we.estimate.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * バーチャル銀行支店ビュー
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class McVm042 {
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
    * バーチャル銀行支店コード
    */
    private String cdGinkoShitenVirtual;

    /**
    * バーチャル銀行支店名
    */
    private String nmGinkoShitenVirtual;

    /**
    * 表示順
    */
    private Long noHyoji;

    /**
    * 採番可フラグ
    */
    private Short fgSaibanKano;
}