/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.view.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.ejb.Stateless;
import project.view.model.User;
/**
 *
 * @author David
 */

@Stateless
public class ApiUser {
    private List<User> users = new ArrayList<User>();
    
    public void create (User user) {
        int maxId = 0;
        for (User us : users) {
            if (us.getId() > maxId) {
                maxId = us.getId();
            }
        }
        user.setId(maxId + 1);
        users.add(user);
    }
    public void update (User user) {
        user.setNombre(user.getNombre());
        user.setApellido(user.getApellido());
        user.setEdad(user.getEdad());
        user.setPais(user.getPais());
        user.setDni(user.getDni());
    }
    public void list () {
        
    }
    public List<String> getCountries () {
        List<String> countries = new ArrayList<String>();
        countries.add("Argentina");
        countries.add("Alemania");
        countries.add("Chile");
        countries.add("Perú");
        countries.add("Bolivia");
        countries.add("Venezuela");
        countries.add("Guatemala");
        countries.add("España");
        return countries;
    }
    public void delete (User user) {
        users.remove(user);
    }
    public User getUserById(String userId) {
        for (User us : users) {
            if (us.getId().equals(Integer.parseInt(userId))) {
                return us;
            }
        }
        return null;
    }
    
    public List<User> getUsers() {
       return users;
    }
    public void setUsers(List<User> users) {
       this.users = users;
    }
}
