package com.we.estimate.Search;

import com.we.estimate.Entity.Client;
import com.we.estimate.Entity.McTm010;
import lombok.Data;

//種類、引き継ぎ区分、引き継ぎナビ掲載ID

@Data
public class ClientShosai {
    private McTm010 mcTm010;
    private String nmGyoshu;
    private String cdKaisha;//syain表里
    private String nmEigyoBusho;
    private String nmEigyoTanto;
    private String nmShainDairiten;//在syain表里
    private String nmGinkoShitenVirtual;
    private String noKozaVirtual;//通过拼接mcTm010中的cdGinkoVirtual和cdShitenVirtual，拼接后在从MC_VM042中找到银行支店名字和id

}
