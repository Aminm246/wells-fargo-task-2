package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

/**
 * Represents a single investment portfolio owned by a client.
 */
@Entity
public class Portfolio {

    /**
     * Primary key for the portfolio.
     */
    @Id
    @GeneratedValue()
    private long portfolioId;

    /**
     * Name of the portfolio (for example, "Retirement" or "College Fund").
     */
    @Column(nullable = false)
    private String name;

    /**
     * Client who owns this portfolio.
     */
    @ManyToOne(optional = false)
    private Client client;

    /**
     * No-argument constructor required by JPA.
     */
    protected Portfolio() {

    }

    /**
     * Constructs a portfolio with all non-ID fields initialized.
     *
     * @param name   human-readable name of the portfolio
     * @param client client who owns this portfolio
     */
    public Portfolio(String name, Client client) {
        this.name = name;
        this.client = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
