/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.view.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
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
public class DeleteUser implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @EJB
    private ApiUser apiUser;
    
    private User user;
    
    @PostConstruct
    public void init() {
        FacesContext params = FacesContext.getCurrentInstance(); 
        String userId = params.getExternalContext().getRequestParameterMap().get("userId");
        user = apiUser.getUserById(userId);
    }
    public void delete() throws IOException {
        apiUser.delete(user);
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        context.redirect("index.xhtml");
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}