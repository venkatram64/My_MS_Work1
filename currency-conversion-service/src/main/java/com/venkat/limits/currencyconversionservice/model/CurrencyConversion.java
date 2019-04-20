package com.venkat.limits.currencyconversionservice.model;

import java.math.BigDecimal;

public class CurrencyConversion {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal calculatedAmoutn;
    private String port;

    public CurrencyConversion(){}

    public CurrencyConversion(Long id, String from, String to, BigDecimal conversionMultiple,
                              BigDecimal quantity, BigDecimal calculatedAmoutn, String port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.calculatedAmoutn = calculatedAmoutn;
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getCalculatedAmoutn() {
        return calculatedAmoutn;
    }

    public String getPort() {
        return port;
    }
}
