package net.javaguides.springboot.mapper;

import javax.annotation.processing.Generated;
import net.javaguides.springboot.dto.UserDto;
import net.javaguides.springboot.entity.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-24T08:35:46+0530",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
public class AutoUserMapperImpl implements AutoUserMapper {

    @Override
    public UserDto mapToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        String email = null;
        String firstName = null;
        Long id = null;
        String lastName = null;

        email = user.getEmail();
        firstName = user.getFirstName();
        id = user.getId();
        lastName = user.getLastName();

        UserDto userDto = new UserDto( id, firstName, lastName, email );

        return userDto;
    }

    @Override
    public User mapToUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        String email = null;
        String firstName = null;
        Long id = null;
        String lastName = null;

        email = userDto.getEmail();
        firstName = userDto.getFirstName();
        id = userDto.getId();
        lastName = userDto.getLastName();

        User user = new User( id, firstName, lastName, email );

        return user;
    }
}
