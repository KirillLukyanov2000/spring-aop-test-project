package ru.lukyanov.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Data
@Setter
@Getter
@ToString
public class Customer {
    private Long id;
    private String login;
    private String password;
}