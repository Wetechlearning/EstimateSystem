package com.we.estimate.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 振込先口座ビュー
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class McVm041 {
    /**
    * 振込先口座コード
    */
    private String cdFurikomiKoza;

    /**
    * 振込先口座名
    */
    private String nmFurikomiKoza;

    /**
    * 表示順
    */
    private Long noHyoji;
}