package com.we.estimate.Search;

import com.we.estimate.Entity.ShaIn;
import lombok.Data;

@Data
public class ShaInSearchModel {
    private int offset;
    private int count;

    private ShaIn shaIn;
}
