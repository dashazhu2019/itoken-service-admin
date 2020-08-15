package com.funtl.itoken.service.admin.service.impl;

import com.funtl.itoken.service.admin.domain.TbSysUser;
import com.funtl.itoken.service.admin.mapper.TbSysUserMapper;
import com.funtl.itoken.service.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author shkstart
 * @date 2020/8/13  -  19:54
 */
@Service
@Transactional(readOnly = true)
public class AdminServiceImpl implements AdminService {
    @Autowired
    private TbSysUserMapper tbSysUserMapper;
    @Override
    @Transactional(readOnly = false)
    public void register(TbSysUser tbSysUser) {

        tbSysUserMapper.insert(tbSysUser);
    }

    @Override
    public TbSysUser login(String loginCode, String plantPassword) {
        return null;
    }
}
