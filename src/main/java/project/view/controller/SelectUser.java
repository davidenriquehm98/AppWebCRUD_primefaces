/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.view.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import project.view.model.User;

import project.view.service.ApiUser;

/**
 *
 * @author David
 */
@Named
@ViewScoped
public class SelectUser implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @EJB
    private ApiUser apiUser;
    
    private List<User> userList;
    
    @PostConstruct
    public void init() {
        userList = apiUser.getUsers();
    }
    
    public List<User> getUserList() {
        return userList;
    }
    
    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}