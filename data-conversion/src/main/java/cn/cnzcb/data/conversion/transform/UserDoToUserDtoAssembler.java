package cn.cnzcb.data.conversion.transform;

import cn.cnzcb.data.conversion.entity.UserDo;
import cn.cnzcb.data.conversion.entity.UserDto;

/**
 * UserDo  转  UserDto
 */
public class UserDoToUserDtoAssembler implements Assembler<UserDo,UserDto>{
    @Override
    public UserDto convert(UserDo userDo,Class<UserDto> target){
        UserDto userDto = new UserDto();
        userDto.setId(userDo.getId());
        userDto.setName(userDo.getName());
        return userDto;
    }

}
