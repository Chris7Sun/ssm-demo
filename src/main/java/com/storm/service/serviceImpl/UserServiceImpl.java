package com.storm.service.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.storm.dao.UserMapper;
import com.storm.pojo.User;
import com.storm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userDao;

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return (User) userDao.selectByPrimaryKey(id);
	}
	
}
