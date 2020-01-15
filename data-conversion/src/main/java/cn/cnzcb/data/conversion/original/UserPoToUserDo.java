package cn.cnzcb.data.conversion.original;

import cn.cnzcb.data.conversion.entity.UserDo;
import cn.cnzcb.data.conversion.entity.UserDto;
import cn.cnzcb.data.conversion.entity.UserPo;

/**
 * UserPo  转  UserDo
 */
public class UserPoToUserDo {
    public UserDo convert(UserPo userPo){
        UserDo userDo = new UserDo();
        userDo.setId(userPo.getId());
        userDo.setName(userPo.getName());
        return userDo;
    }
}
