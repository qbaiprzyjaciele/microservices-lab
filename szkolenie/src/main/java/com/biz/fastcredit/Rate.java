package com.biz.fastcredit;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by B0638667_2 on 2019-02-09.
 */
public interface Rate {

    public BigDecimal getRate(Date date);
}


