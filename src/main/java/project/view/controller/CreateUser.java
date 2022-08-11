/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.view.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

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
public class CreateUser implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @EJB
    private ApiUser apiUser;
    
    private User user;
    private List<String> countries;
    private String selectedCountry;
    
    
    @PostConstruct
    public void init() {
        countries = apiUser.getCountries();
        user = new User();
    }
    
    public void runCreate() throws IOException {
        user.setPais(selectedCountry);
        apiUser.create(user);
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        context.redirect("index.xhtml");
    }
    
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    
    public List<String> getCountries() {
        return countries;
    } 
    
    public void setCountries(List<String> countries) {
        this.countries = countries;
    }
    
    public String getSelectedCountry() {
        return selectedCountry;
    }
    public void setSelectedCountry (String selectedCountry) {
        this.selectedCountry = selectedCountry;
    }
}