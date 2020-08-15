package com.funtl.itoken.service.admin.service;

import com.funtl.itoken.service.admin.ServiceAdminApplication;
import com.funtl.itoken.service.admin.domain.TbSysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Date;
import java.util.UUID;

/**
 * @author shkstart
 * @date 2020/8/12  -  18:27
 */
@Transactional
@Rollback
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceAdminApplication.class)
@ActiveProfiles(value="prod")
public class AdminServiceTest {
 @Autowired
  private AdminService adminService;
  @Test
    public void register(){

    TbSysUser tbSysUser=new TbSysUser();
    tbSysUser.setUserCode(UUID.randomUUID().toString());
    tbSysUser.setLoginCode("lusifer@funtl.com");
    tbSysUser.setUserName("Lusifer");
    tbSysUser.setPassword("123456");
    tbSysUser.setUserType("0");
    tbSysUser.setMgrType("1");
    tbSysUser.setStatus("0");
    tbSysUser.setCreateDate(new Date());
    tbSysUser.setCreateBy(tbSysUser.getUserCode());
    tbSysUser.setUpdateBy(tbSysUser.getUserCode());
tbSysUser.setCorpCode("0");
tbSysUser.setCorpName("iToken");
    adminService.register(tbSysUser);
    }
    @Test
    public void login(){

    }
}
