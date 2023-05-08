package com.we.estimate.Search;

import com.we.estimate.Entity.ShaInDataBase;
import lombok.Data;

import java.util.List;

@Data
public class ShaInSearchResult {
    private int count;

    private List<ShaInDataBase> data;

}
