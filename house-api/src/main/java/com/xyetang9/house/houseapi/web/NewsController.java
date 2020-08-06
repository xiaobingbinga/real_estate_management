package com.xyetang9.house.houseapi.web;

import com.xyetang9.house.houseapi.domain.news.News;
import com.xyetang9.house.houseapi.domain.properties.Agency;
import com.xyetang9.house.houseapi.dto.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: NewsController
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-04 17:12
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@RestController
@RequestMapping("/news")
@Api(tags = "新闻数据访问接口")
public class NewsController {

    @GetMapping("recent")
    @ApiOperation(value = "推荐最近新闻接口",tags = "新闻数据访问接口")
    public JsonResult recent(@RequestBody @ApiParam(value = "测试对象",required = true)News news){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setData(news);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("查询数据库失败");
        }

        return jsonResult;
    }

    @GetMapping("popular")
    @ApiOperation(value = "推荐热点新闻接口",tags = "新闻数据访问接口")
    public JsonResult popular(@RequestBody @ApiParam(value = "测试对象",required = true)News news){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setData(news);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("查询数据库失败");
        }

        return jsonResult;
    }

    @PostMapping("search")
    @ApiOperation(value = "条件搜索新闻接口",tags = "新闻数据访问接口")
    public JsonResult search(@RequestBody @ApiParam(value = "查询对象",required = true)News news){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setData(news);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("查询数据库失败");
        }

        return jsonResult;
    }

    @PostMapping("news-info")
    @ApiOperation(value = "新闻详细信息接口",tags = "新闻数据访问接口")
    public JsonResult newsInfo(@RequestBody @ApiParam(value = "查询对象",required = true)News news){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setData(news);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("查询数据库失败");
        }

        return jsonResult;
    }

    @GetMapping("news-list")
    @ApiOperation(value = "新闻列表接口",tags = "新闻数据访问接口")
    public JsonResult newsList(@RequestBody @ApiParam(value = "测试对象",required = true)News news){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setData(news);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("查询数据库失败");
        }

        return jsonResult;
    }

    @PostMapping("evaluation-add")
    @ApiOperation(value = "新闻回复接口",tags = "新闻数据新增接口")
    public JsonResult evaluationAdd(@RequestBody @ApiParam(value = "测试对象",required = true)News news){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setData(news);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("查询数据库失败");
        }

        return jsonResult;
    }

    @PostMapping("news-add")
    @ApiOperation(value = "新闻发布接口",tags = "新闻数据新增接口")
    public JsonResult newsAdd(@RequestBody @ApiParam(value = "测试对象",required = true)News news){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setData(news);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("查询数据库失败");
        }

        return jsonResult;
    }

}
