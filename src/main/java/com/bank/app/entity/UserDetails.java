package com.bank.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tbl_user_bank_account")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fName;
    private String lName;
    private String gender;
    @Column(name = "email_address", nullable = false)
    private String email;
    @Column(name = "mobile_no", nullable = false)
    private BigDecimal mobile;
    @Column(name = "pan_no", nullable = false)
    private String panNumber;
    private Date dob;
    private String address;
    private BigDecimal accBalance;
    private String accType;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
}
