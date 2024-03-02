package ru.sergalas.taskTraker.domains.mappers;

import org.mapstruct.Mapper;
import ru.sergalas.taskTraker.domains.dto.UserData;
import ru.sergalas.taskTraker.domains.user.User;

@Mapper
public interface UserMapper {

     UserData toDto(User user);

     User toEntity(UserData $userData);
}
