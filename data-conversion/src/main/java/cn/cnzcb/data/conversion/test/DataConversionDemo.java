package cn.cnzcb.data.conversion.test;

import cn.cnzcb.data.conversion.entity.UserDo;
import cn.cnzcb.data.conversion.entity.UserDto;
import cn.cnzcb.data.conversion.entity.UserPo;
import cn.cnzcb.data.conversion.original.UserDoToUserDto;
import cn.cnzcb.data.conversion.original.UserDoToUserPo;
import cn.cnzcb.data.conversion.original.UserDtoToUserDo;
import cn.cnzcb.data.conversion.original.UserPoToUserDo;
import cn.cnzcb.data.conversion.transform.*;

public class DataConversionDemo {
    public static void main(String[] args) {
        UserDto userDto = new UserDto();
        userDto.setId(1);
        userDto.setName("java圈");
        ////////////////////////////
        //UserDto转成对象UserDo
        UserDtoToUserDo userDtoToUserDo = new UserDtoToUserDo();
        UserDo userDo = userDtoToUserDo.convert(userDto);
        //UserDo转成对象UserPo
        UserDoToUserPo userDoToUserPo = new UserDoToUserPo();
        UserPo userPo = userDoToUserPo.convert(userDo);
        //UserPo转成对象UserDo
        UserPoToUserDo userPoToUserDo = new UserPoToUserDo();
        UserDo userDo1 = userPoToUserDo.convert(userPo);
        //UserDo转成对象UserDto
        UserDoToUserDto userDoToUserDto = new UserDoToUserDto();
        UserDto userDto1 = userDoToUserDto.convert(userDo1);
        System.out.println("改造之前的结果:"+userDto1);
        ////////////////////////////

        UserDo userDo2 = AssemblerFactory.getInstance().execute(UserDtoToUserDoAssembler.class,userDto, UserDo.class);
        UserPo userPo1 = AssemblerFactory.getInstance().execute(UserDoToUserPoAssembler.class,userDo2, UserPo.class);
        UserDo userDo3 = AssemblerFactory.getInstance().execute(UserPoToUserDoAssembler.class,userPo1, UserDo.class);
        UserDto userDto2 = AssemblerFactory.getInstance().execute(UserDoToUserDtoAssembler.class,userDo3, UserDto.class);
        System.out.println("改造之后的结果:"+userDto2);

    }
}
