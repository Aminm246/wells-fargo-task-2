package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

/**
 * Represents a tradable financial security (e.g., stock, bond, fund).
 */
@Entity
public class Security {

    /**
     * Primary key for the security.
     */
    @Id
    @GeneratedValue()
    private long securityId;

    /**
     * Symbol or ticker used to identify the security in the market.
     */
    @Column(nullable = false)
    private String ticker;

    /**
     * Full descriptive name of the security.
     */
    @Column(nullable = false)
    private String name;

    /**
     * Current price per unit of the security.
     */
    @Column(nullable = false)
    private BigDecimal currentPrice;

    /**
     * No-argument constructor required by JPA.
     */
    protected Security() {

    }

    /**
     * Constructs a security with all non-ID fields initialized.
     *
     * @param ticker       unique ticker symbol
     * @param name         descriptive name
     * @param currentPrice current unit price
     */
    public Security(String ticker, String name, BigDecimal currentPrice) {
        this.ticker = ticker;
        this.name = name;
        this.currentPrice = currentPrice;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }
}
