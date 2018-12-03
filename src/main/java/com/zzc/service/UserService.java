package com.zzc.service;

import com.zzc.tk.model.TBUser;

public interface UserService {

    TBUser selectByNameAndPwd(TBUser user);
}
