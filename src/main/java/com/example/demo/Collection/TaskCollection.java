package com.example.demo.Collection;


import com.example.demo.Entity.Task;
import com.example.demo.Serivice.TaskService;
import com.example.demo.utils.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/task")
@Api(tags = "测试报告")
public class TaskCollection {

    @Autowired
    private TaskService taskService;

    @GetMapping(value = "/selecttask",produces = "application/json")
    @ApiOperation( value = "根据状态查询任务",notes = "根据状态查询任务")
    @ApiImplicitParam(name = "state", value = "任务状态", required = true, dataType = "Integer", paramType = "query")
    public JsonResult selecttask(@RequestParam("state") Integer state)
    {
        List<Task> taskall = taskService.taskall(state);
        return new JsonResult(0,"true",taskall);

    }

    @PostMapping(value = "/addtask",produces = "application/json")
    @ApiOperation( value = "添加任务",notes = "添加任务")
    public JsonResult addtask(@RequestBody Task task)
    {
        boolean addtask = taskService.addtask(task);
        return addtask==true?new JsonResult(1,"添加成功",null):new JsonResult(0,"添加失败",null);
    }

    @GetMapping(value = "/deletetask",produces = "application/json")
    @ApiOperation( value = "根据id删除任务",notes = "根据id删除任务")
    public JsonResult deletetask(@RequestParam("id") int id)
    {
        boolean deletestask = taskService.deletestask(id);
        return deletestask==true?new JsonResult(1,"删除成功",null):new JsonResult(0,"删除失败",null);
    }

    @PostMapping(value = "/updatetask",produces = "application/json")
    @ApiOperation( value = "根据id删除任务",notes = "根据id删除任务")
    public JsonResult updatetask(@RequestBody Task task)
    {
        boolean updatetask = taskService.updatetask(task);
        return updatetask==true?new JsonResult(1,"更新成功",null):new JsonResult(0,"更新失败",null);
    }
}
