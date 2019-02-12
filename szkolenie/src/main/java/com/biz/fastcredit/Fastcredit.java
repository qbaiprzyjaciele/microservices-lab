/**
 * Created by B0638667_2 on 2019-02-09.
 */

package com.biz.fastcredit;


import java.math.BigDecimal;
import java.util.Date;

class Fastcredit {

    private String clientId;
    private BigDecimal limit;
    private Rate rate;
    private Date aagrementDate;
    private Date endDate;
    private BigDecimal margin;

    public Fastcredit(String clientId, BigDecimal limit) {
        this.clientId = clientId;
        this.limit = limit;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public Date getAagrementDate() {
        return aagrementDate;
    }

    public void setAagrementDate(Date aagrementDate) {
        this.aagrementDate = aagrementDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getMargin() {
        return margin;
    }

    public void setMargin(BigDecimal margin) {
        this.margin = margin;
    }
}
