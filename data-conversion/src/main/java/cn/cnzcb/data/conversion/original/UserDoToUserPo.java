package cn.cnzcb.data.conversion.original;

import cn.cnzcb.data.conversion.entity.UserDo;
import cn.cnzcb.data.conversion.entity.UserDto;
import cn.cnzcb.data.conversion.entity.UserPo;

/**
 * UserDo  转  UserPo
 */
public class UserDoToUserPo {
    public UserPo convert(UserDo userDo){
        UserPo userPo = new UserPo();
        userPo.setId(userDo.getId());
        userPo.setName(userDo.getName());
        return userPo;
    }
}
