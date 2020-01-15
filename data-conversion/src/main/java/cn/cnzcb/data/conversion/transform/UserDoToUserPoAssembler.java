package cn.cnzcb.data.conversion.transform;

import cn.cnzcb.data.conversion.entity.UserDo;
import cn.cnzcb.data.conversion.entity.UserDto;
import cn.cnzcb.data.conversion.entity.UserPo;

/**
 * UserDo  转  UserPo
 */
public class UserDoToUserPoAssembler implements Assembler<UserDo,UserPo>{
    @Override
    public UserPo convert(UserDo userDo,Class<UserPo> target){
        UserPo userPo = new UserPo();
        userPo.setId(userDo.getId());
        userPo.setName(userDo.getName());
        return userPo;
    }
}
