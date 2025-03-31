package com.example.UnitTestingUsingMockito;


import org.springframework.data.repository.ListCrudRepository;


public interface UserRepositoryInterface extends ListCrudRepository<UserEntity, Long> {

}
