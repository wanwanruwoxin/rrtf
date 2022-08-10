package com.yyds.toefl.controller;



import com.yyds.toefl.entity.SysUser;
import com.yyds.toefl.service.SysUserService;
import com.yyds.toefl.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by ql on 2022/8/8
 */
@Api(tags = "用户账号模块")
@RestController("/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @ApiOperation(value = "用户注册")
    @PostMapping("/register")
    public Result register(@RequestBody SysUser sysUser) {
        sysUserService.register(sysUser);
        return Result.ok();
    }
    /**
     * Created by zyc on 2022/8/9
     */
    @ApiOperation(value = "用户登录")
    @ResponseBody
    public Result login(String loginName, String passWord){
        sysUserService.getSysUser(loginName,passWord);
        return Result.ok();
    }

//
//    /**
//     * Created by zyc on 2022/8/9
//     */
//    @ApiOperation(value = "验证码")
//    @GetMapping("/verifyCode")
//    public void verifyCode(HttpServletRequest request, HttpServletResponse response){
//        VerifyService verifyService=new VerifyServiceImpl();
//        try {
//            //设置长宽
//            Verify verify =verifyService.generate(80,28);
//            String code = verify.getCode();
//            LOGGER.info(code);
//
//            //将VerifyCode绑定session
//            request.getSession().setAttribute("VerifyCode", code);
//            //设置响应头
//            response.setHeader("Pragma", "no-cache");
//            //设置响应头
//            response.setHeader("Cache-Control", "no-cache");
//            //在代理服务器端防止缓冲
//            response.setDateHeader("Expires", 0);
//            //设置响应内容类型
//            response.setContentType("image/jpeg");
//            response.getOutputStream().write(verify.getImBytes());
//            response.getOutputStream().flush();
//        }catch (IOException e){
//           LOGGER.info("");
//        }
//    }

    @ApiOperation(value = "修改密码")
    @PostMapping("/updatePassword")
    public Result updatePassword(@RequestBody SysUser sysUser) {
        sysUserService.updatePassword(sysUser);
        return Result.ok();
    }
}
