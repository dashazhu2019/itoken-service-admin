package com.funtl.itoken.service.admin.service;

import com.funtl.itoken.service.admin.domain.TbSysUser;

/**
 * @author shkstart
 * @date 2020/8/13  -  19:53
 */
public interface AdminService {

    public void register(TbSysUser tbSysUser);

    public TbSysUser login(String loginCode,String plantPassword);
}
