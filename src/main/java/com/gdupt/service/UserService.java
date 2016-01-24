package com.gdupt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gdupt.entity.User;
@Service
public class UserService implements IUserService{

	@Override
	public List<User> getList() {
		User u =new User();
		u.setId(1l);
		u.setName("测试");
		List<User> list = new ArrayList<>();
		list.add(u);
		return list;
	}

}
