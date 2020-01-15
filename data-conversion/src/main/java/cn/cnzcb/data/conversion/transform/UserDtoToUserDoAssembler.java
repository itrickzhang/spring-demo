package cn.cnzcb.data.conversion.transform;

import cn.cnzcb.data.conversion.entity.UserDo;
import cn.cnzcb.data.conversion.entity.UserDto;
import cn.cnzcb.data.conversion.entity.UserPo;

/**
 * UserDto  转  UserPo
 */
public class UserDtoToUserDoAssembler implements Assembler<UserDto,UserDo>{

    @Override
    public UserDo convert(UserDto userDto,Class<UserDo> target){
        UserDo userDo = new UserDo();
        userDo.setId(userDto.getId());
        userDo.setName(userDto.getName());
        return userDo;
    }

}
