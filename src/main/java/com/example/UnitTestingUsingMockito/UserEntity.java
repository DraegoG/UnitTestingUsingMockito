package com.example.UnitTestingUsingMockito;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int age;

    private String name;

    public UserEntity(UserModel userModel){
        this.age = userModel.getAge();
        this.name = userModel.getName();
    }
}
