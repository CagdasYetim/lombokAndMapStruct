package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AppUserController {

    private final AppUserRepository appUserRepository;
    private final AppUserMapper appUserMapper;

    public AppUserController(AppUserRepository appUserRepository, AppUserMapper appUserMapper) {
        this.appUserRepository = appUserRepository;
        this.appUserMapper = appUserMapper;
    }

    @GetMapping("/")
    public String getTest(){
        return "hi";
    }

    @GetMapping(path = "/all")
    public List<AppUserDto> getAllAppUsers(){
        return appUserRepository
                .findAll()
                .stream()
                .map(appUser -> appUserMapper.appUserToAppUserDto(appUser))
                .collect(Collectors.toList());
    }

}
