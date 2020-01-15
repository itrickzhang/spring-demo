package cn.cnzcb.data.conversion.original;

import cn.cnzcb.data.conversion.entity.UserDo;
import cn.cnzcb.data.conversion.entity.UserDto;

/**
 * UserDto  转  UserPo
 */
public class UserDtoToUserDo {
    public UserDo convert(UserDto userDto){
        UserDo userDo = new UserDo();
        userDo.setId(userDto.getId());
        userDo.setName(userDto.getName());
        return userDo;
    }
}
