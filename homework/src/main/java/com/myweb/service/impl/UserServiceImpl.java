package com.myweb.service.impl;

import com.myweb.mapper.UserMapper;
import com.myweb.pojo.User;
import com.myweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	public UserMapper userMapper;

	@Override
	public int save(User user) {
		return userMapper.insert(user);
	}

	@Override
	public User findByUserLoginName(String loginName) {
		return userMapper.findByUserLoginName(loginName);
	}

	@Override
	public User userLogin(String loginName, String loginPwd) {
		return userMapper.userLogin(loginName,loginPwd);
	}

	@Override
	public User findUserByRealname(String realname) {
		return userMapper.findUserByRealname(realname);
	}

	@Override
	public User findById(Integer uid) {
		return userMapper.findById(uid);
	}

	@Override
	public int saveResume(User user) {
		return userMapper.saveResume(user);
	}


}
