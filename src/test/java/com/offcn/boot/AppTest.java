package com.offcn.boot;

import com.offcn.HelloApplication;
import com.offcn.Mapper.MUserMapper;
import com.offcn.POJO.MUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class AppTest {

    @Autowired
    private MUserMapper mUserMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void testRedis(){
        //redis存入数据
        redisTemplate.opsForValue().set("hi","hello");
        //redis去除数据
        String str=(String) redisTemplate.opsForValue().get("hi");
        System.out.println(str);
        MUser mUser= new MUser();
        mUser.setId(1);
        mUser.setName("张三");
        mUser.setUsername("你好呀");
        mUser.setPassword("123456");
        redisTemplate.opsForValue().set("user",mUser);
        MUser user = (MUser)redisTemplate.opsForValue().get("user");
        System.out.println(user);
    }
    @Test
    public void getAllList(){

        List<MUser> userList = mUserMapper.getUserList();
        for (MUser mUser : userList) {
            System.out.println(mUser);
        }
    }
}
