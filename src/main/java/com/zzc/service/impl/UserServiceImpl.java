package com.zzc.service.impl;

import com.zzc.service.UserService;
import com.zzc.tk.mapper.TBUserMapper;
import com.zzc.tk.model.TBUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TBUserMapper tbUserMapper;

    @Override
    public TBUser selectByNameAndPwd(TBUser user) {

        return tbUserMapper.selectOne(user);
    }
}
