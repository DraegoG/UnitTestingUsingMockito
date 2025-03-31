package com.example.UnitTestingUsingMockito;


import org.aspectj.weaver.ast.Call;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private CallerOfLazy callerOfLazy;

    private final UserRepositoryInterface userRepositoryInterface;

    @Autowired
    public UserService(UserRepositoryInterface userRepositoryInterface){
        this.userRepositoryInterface = userRepositoryInterface;
    }

    public UserEntity addUser(UserModel userModel){
        UserEntity userEntity = new UserEntity(userModel);

        callerOfLazy.callLazy();
        return userRepositoryInterface.save(userEntity);

    }

    public List<UserEntity> getAllUsers() {
        return userRepositoryInterface.findAll();
    }

}
