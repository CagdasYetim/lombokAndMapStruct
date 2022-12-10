package com.example.demo;

import com.example.demo.AppUserDto;
import com.example.demo.AppUser;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AppUserMapper {
    AppUser appUserDtoToAppUser(AppUserDto appUserDto);

    AppUserDto appUserToAppUserDto(AppUser appUser);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AppUser updateAppUserFromAppUserDto(AppUserDto appUserDto, @MappingTarget AppUser appUser);
}
