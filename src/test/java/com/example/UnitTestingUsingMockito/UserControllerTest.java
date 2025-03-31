package com.example.UnitTestingUsingMockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @Mock
    UserService userService;

    @Mock
    LazyClass lazyClass;

    @InjectMocks
    UserController userController;


    @Test
    void givenAddUser_whenPassedValidUserInfo_shouldCreateUserAndSendHttpOkAsResponse() {
        UserModel userModel = new UserModel(1, "Abhishek");

        when(userService.addUser(any(UserModel.class))).thenReturn(new UserEntity(userModel));

        ResponseEntity controllerResponse = userController.addUser(userModel);

        assertEquals(HttpStatus.OK, controllerResponse.getStatusCode());
        assertNotNull(controllerResponse.getBody());
    }

}