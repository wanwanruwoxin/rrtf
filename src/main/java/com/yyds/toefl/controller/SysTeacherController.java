package com.yyds.toefl.controller;


import com.yyds.toefl.entity.SysTeacher;
import com.yyds.toefl.service.SysTeacherService;
import com.yyds.toefl.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "讲师管理模块")
@RestController
@RequestMapping("/teacher")
public class SysTeacherController {
    @Autowired
    private SysTeacherService sysTeacherService;


    @ApiOperation(value = "新增讲师")
    @PostMapping
    public Result<Void> save(@RequestBody SysTeacher sysTeacher){
        sysTeacherService.save(sysTeacher);
        return Result.ok();
    }

    @ApiOperation(value = "根据id删除讲师")
    @DeleteMapping
    public Result<String> delete(Long id){
        sysTeacherService.removeById(id);
        return Result.ok("删除成功");
    }

    @ApiOperation(value = "查询全部讲师")
    @GetMapping
    public Result<List<SysTeacher>> list(){
        List<SysTeacher> list = sysTeacherService.list();
        return Result.ok(list);
    }

    @ApiOperation(value = "根据用户名查询讲师")
    @GetMapping("/{user_name}")
    public SysTeacher getTeacherById(@PathVariable("user_name") String username){
        return sysTeacherService.getSysTeacher(username);
    }

    @ApiOperation(value = "根据id修改讲师")
    @PutMapping
    public Result<Void> updateById(@RequestBody SysTeacher sysTeacher){
        sysTeacherService.updateById(sysTeacher);
        return Result.ok();

    }
}
