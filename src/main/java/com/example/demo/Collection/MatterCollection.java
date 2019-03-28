package com.example.demo.Collection;

import com.example.demo.Entity.Matter;
import com.example.demo.Serivice.MatterService;
import com.example.demo.utils.JsonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/matter")
public class MatterCollection {

    @Autowired
    MatterService matterService;

    @PostMapping(value = "/addmatter",produces = "application/json")
    public JsonResult add(@RequestBody Matter matter)
    {
       boolean bool= matterService.addmatter(matter);
       if(bool==true)
       {
           return new JsonResult(0,"Success",null);
       }else
           {
        return new JsonResult(0,"fail",null);
    }

    }

    @GetMapping(value = "/inall",produces = "application/json")
    public JsonResult inal()
    {
        List<Matter> list =matterService.inall();
        return new JsonResult(1,"Success",list);
    }

    @GetMapping(value = "/DeleteMatter/{i}",produces = "application/json" )
    public JsonResult  DeleteMatter(@PathVariable int i) {
        boolean is = matterService.DeleteMatter(i);
        System.out.printf(String.valueOf(is));
        if (is == true)
        {
            return new JsonResult(1, "删除成功！！！", null);
        } else
        {
            return new JsonResult(0, "删除失败，没有"+i+"这条记录", null);
        }
    }
    @GetMapping(value = "/updateMatter",produces = "application/json" )
    //TODO:前端如何传参
    public JsonResult updateMatter(@RequestParam("id") Integer i, @RequestParam(value = "title",required = false,defaultValue = "默认标题") String str)
    {
       boolean bool2= matterService.updateMatter(str,i);
        if (bool2 == true)
        {
            return new JsonResult(1, "更新成功！！！", null);
        } else
        {
            return new JsonResult(0, "更新失败"+i+"这条记录", null);
        }

    }
}



