package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Represents a position in a specific security within a particular portfolio.
 */
@Entity
public class SecurityHolding {

    /**
     * Primary key for the holding.
     */
    @Id
    @GeneratedValue()
    private long holdingId;

    /**
     * Portfolio that owns this holding.
     */
    @ManyToOne(optional = false)
    private Portfolio portfolio;

    /**
     * Security this holding tracks.
     */
    @ManyToOne(optional = false)
    private Security security;

    /**
     * Quantity of the security held in the portfolio.
     */
    @Column(nullable = false)
    private BigDecimal quantity;

    /**
     * Price paid per unit at the time of purchase.
     */
    @Column(nullable = false)
    private BigDecimal purchasePrice;

    /**
     * Date on which the holding was acquired.
     */
    @Column(nullable = false)
    private LocalDate purchaseDate;

    /**
     * No-argument constructor required by JPA.
     */
    protected SecurityHolding() {

    }

    /**
     * Constructs a holding with all non-ID fields initialized.
     *
     * @param portfolio     owning portfolio
     * @param security      underlying security
     * @param quantity      number of units held
     * @param purchasePrice price per unit at purchase time
     * @param purchaseDate  date the position was opened
     */
    public SecurityHolding(Portfolio portfolio,
                           Security security,
                           BigDecimal quantity,
                           BigDecimal purchasePrice,
                           LocalDate purchaseDate) {
        this.portfolio = portfolio;
        this.security = security;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
    }

    public Long getHoldingId() {
        return holdingId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
