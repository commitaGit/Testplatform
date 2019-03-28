package com.example.demo.DAO;

import com.example.demo.Base.ComMapper;
import com.example.demo.Entity.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Mapper
public interface taskDAO extends ComMapper<Task> {
    int jobemail();//定时更新已开始==结束状态
    int jobtask(); ////定时更新待开始==已开始
    List<Task> taskall(@Param("state") int state); //状态查询
    int addtask(Task task);
    int deletestask(@Param("id") int id);//删除task
    int updatetask(Task task);
}
