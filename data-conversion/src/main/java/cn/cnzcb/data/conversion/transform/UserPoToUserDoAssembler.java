package cn.cnzcb.data.conversion.transform;

import cn.cnzcb.data.conversion.entity.UserDo;
import cn.cnzcb.data.conversion.entity.UserDto;
import cn.cnzcb.data.conversion.entity.UserPo;

/**
 * UserPo  转  UserDo
 */
public class UserPoToUserDoAssembler implements Assembler<UserPo,UserDo>{
    @Override
    public UserDo convert(UserPo userPo,Class<UserDo> target){
        UserDo userDo = new UserDo();
        userDo.setId(userPo.getId());
        userDo.setName(userPo.getName());
        return userDo;
    }
}
