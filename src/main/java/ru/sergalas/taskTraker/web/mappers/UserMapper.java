package ru.sergalas.taskTraker.web.mappers;

import org.mapstruct.Mapper;
import ru.sergalas.taskTraker.web.dto.user.UserData;
import ru.sergalas.taskTraker.domains.user.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

     UserData toDto(User user);

     User toEntity(UserData $userData);
}
