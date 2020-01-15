package cn.cnzcb.data.conversion.original;

import cn.cnzcb.data.conversion.entity.UserDo;
import cn.cnzcb.data.conversion.entity.UserDto;
import cn.cnzcb.data.conversion.entity.UserPo;

/**
 * UserDo  转  UserDto
 */
public class UserDoToUserDto {
    public UserDto convert(UserDo userDo){
        UserDto userDto = new UserDto();
        userDto.setId(userDo.getId());
        userDto.setName(userDo.getName());
        return userDto;
    }
}
