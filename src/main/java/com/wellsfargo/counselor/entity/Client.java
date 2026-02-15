package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 * Represents an individual client managed by a specific advisor.
 */
@Entity
public class Client {

    /**
     * Primary key for the client.
     * Uses automatic ID generation.
     */
    @Id
    @GeneratedValue()
    private long clientId;

    /**
     * Client's given name.
     */
    @Column(nullable = false)
    private String firstName;

    /**
     * Client's family name.
     */
    @Column(nullable = false)
    private String lastName;

    /**
     * Client's date of birth.
     */
    @Column(nullable = false)
    private LocalDate dateOfBirth;

    /**
     * Street address or mailing address for the client.
     */
    @Column(nullable = false)
    private String address;

    /**
     * Contact phone number for the client.
     */
    @Column(nullable = false)
    private String phone;

    /**
     * Contact email address for the client.
     */
    @Column(nullable = false)
    private String email;

    /**
     * Advisor who is responsible for this client.
     */
    @ManyToOne(optional = false)
    private Advisor advisor;

    /**
     * No-argument constructor required by JPA.
     * Protected to prevent accidental direct use.
     */
    protected Client() {

    }

    /**
     * Constructs a new client with all non-ID fields initialized.
     *
     * @param firstName   client's first name
     * @param lastName    client's last name
     * @param dateOfBirth client's date of birth
     * @param address     client's address
     * @param phone       client's phone number
     * @param email       client's email address
     * @param advisor     advisor responsible for this client
     */
    public Client(String firstName,
                  String lastName,
                  LocalDate dateOfBirth,
                  String address,
                  String phone,
                  String email,
                  Advisor advisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.advisor = advisor;
    }

    public Long getClientId() {
        return clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}
