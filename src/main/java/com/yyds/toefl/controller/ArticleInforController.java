package com.yyds.toefl.controller;

import com.yyds.toefl.dao.ArticleInforDao;
import com.yyds.toefl.entity.ArticleInfor;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "托福人管理模块")
@RestController
@RequestMapping("/toefl")
public class ArticleInforController {
    @Autowired
    private ArticleInforDao articleInforDao;

//    @ApiOperation("根据标题、讲师、类别查询托福文章")
//    @GetMapping("{/title}")
//    public ArticleInfor getAticleInfoBy(@PathVariable String title, Integer publish_teacher, Integer article_type)
}
