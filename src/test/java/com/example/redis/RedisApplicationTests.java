package com.example.redis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private RedisTemplate redisTemplate;
	@Test
	public void contextLoads() {

		stringRedisTemplate.opsForValue().set("aaa", "111");
		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
	}

	@Test
	public void add(){
//		UserInfo userInfo = new UserInfo();
//		userInfo.setName("aaa");
		ValueOperations<String, UserInfo> operations=redisTemplate.opsForValue();


//		operations.set("user",userInfo);
		UserInfo userInfo1 = operations.get("user");
		System.out.println(userInfo1);
	}

}
