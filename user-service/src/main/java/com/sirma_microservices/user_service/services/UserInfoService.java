package com.sirma_microservices.user_service.services;
import com.sirma_microservices.user_service.model.UserInfo;
import com.sirma_microservices.user_service.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoRepository repository;

    public UserInfo create(UserInfo user){
        return repository.save(user);
    }

    public List<UserInfo> getAllUsers(){
        return repository.findAll();
    }

    public Optional<UserInfo> findById(Long id){
        return Optional.ofNullable(repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid id provided")));
    }

    public UserInfo update(UserInfo user){
        if (repository.existsById(user.getId())){
            UserInfo existingUser = repository.findById(user.getId()).orElse(null);

            if (existingUser != null){
                existingUser.setUsername(user.getUsername());
                existingUser.setPassword(user.getPassword());
                return repository.save(existingUser);
            }
        }
        return null;
    }
}
