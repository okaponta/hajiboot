package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Customer implements Serializable {
    private Integer id;
    private String firstName;
    private String lastName;
}
