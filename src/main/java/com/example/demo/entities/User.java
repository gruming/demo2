package com.example.demo.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

  @Id
  @GeneratedValue
  private Long id;
  private String username;
  private String password;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private List<Role> roleList;

  public User() {
  }

  public User(String username, String password,
      List<Role> roleList) {
    this.username = username;
    this.password = password;
    this.roleList = roleList;
  }

  public Long getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Role> getRoleList() {
    return roleList;
  }

  public void setRoleList(List<Role> roleList) {
    this.roleList = roleList;
  }
}

