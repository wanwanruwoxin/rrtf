package com.yyds.toefl.controller;

import com.yyds.toefl.entity.SysLink;
import com.yyds.toefl.service.SysLinkService;
import com.yyds.toefl.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lsx on 2022/08/09
 */
@Api(tags = "超链接管理模块")
@RestController
@RequestMapping("/link")
public class SysLinkController {

    @Autowired
    private SysLinkService sysLinkService;

    @ApiOperation(value = "新增超链接")
    @PostMapping
    public Result save(@RequestBody SysLink sysLink){

        sysLinkService.save(sysLink);
        return Result.ok("新增超链接成功");
    }

    @ApiOperation(value = "查询全部超链接")
    @GetMapping
    public Result<List<SysLink>> list(){
        List<SysLink> list = sysLinkService.list();

        return Result.ok(list);
    }

    @ApiOperation(value = "根据id删除超链接")
    @DeleteMapping
    public Result<String> delete(Long id){
        sysLinkService.removeById(id);

        return Result.ok("删除超链接成功");
    }

    @ApiOperation(value = "根据id修改超链接")
    @PutMapping
    public Result<String> update(@RequestBody SysLink sysLink){

        sysLinkService.updateById(sysLink);

        return Result.ok("修改超链接成功");
    }


    @ApiOperation(value = "根据id查询超链接")
    @GetMapping("/{id}")
    public SysLink getLinkById(@PathVariable Long id){

        return sysLinkService.getById(id);
    }
}
