package com.nav.mcv.spring_mvc.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="login_details")
public class LoginEntity {
    public LoginEntity(){}
    public LoginEntity(String userName, LocalDate loginTime, LocalDate logoutTime) {
        this.userName = userName;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int loginId;


    @Column(name = "user_name",nullable = false,length =25)
    private String userName;

    @Column(name = "login_time")
    private LocalDate loginTime;

    @Column(name = "logout_time")
    private LocalDate logoutTime;

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(LocalDate loginTime) {
        this.loginTime = loginTime;
    }

    public LocalDate getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(LocalDate logoutTime) {
        this.logoutTime = logoutTime;
    }
}
