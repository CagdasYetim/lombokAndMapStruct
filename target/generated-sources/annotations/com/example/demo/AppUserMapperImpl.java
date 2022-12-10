package com.example.demo;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-10T21:48:24+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11 (Oracle Corporation)"
)
@Component
public class AppUserMapperImpl implements AppUserMapper {

    @Override
    public AppUser appUserDtoToAppUser(AppUserDto appUserDto) {
        if ( appUserDto == null ) {
            return null;
        }

        AppUser appUser = new AppUser();

        appUser.setName( appUserDto.getName() );
        appUser.setPassword( appUserDto.getPassword() );
        appUser.setMail( appUserDto.getMail() );

        return appUser;
    }

    @Override
    public AppUserDto appUserToAppUserDto(AppUser appUser) {
        if ( appUser == null ) {
            return null;
        }

        String name = null;
        String password = null;
        String mail = null;

        name = appUser.getName();
        password = appUser.getPassword();
        mail = appUser.getMail();

        AppUserDto appUserDto = new AppUserDto( name, password, mail );

        return appUserDto;
    }

    @Override
    public AppUser updateAppUserFromAppUserDto(AppUserDto appUserDto, AppUser appUser) {
        if ( appUserDto == null ) {
            return appUser;
        }

        if ( appUserDto.getName() != null ) {
            appUser.setName( appUserDto.getName() );
        }
        if ( appUserDto.getPassword() != null ) {
            appUser.setPassword( appUserDto.getPassword() );
        }
        if ( appUserDto.getMail() != null ) {
            appUser.setMail( appUserDto.getMail() );
        }

        return appUser;
    }
}
