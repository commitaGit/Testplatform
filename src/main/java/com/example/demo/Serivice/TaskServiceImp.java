package com.example.demo.Serivice;

import com.example.demo.Entity.Task;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import com.example.demo.DAO.taskDAO;
import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

@Service
public class TaskServiceImp implements TaskService {
    Logger logger=Logger.getLogger("TaskServiceImp.class");


    @Scheduled(cron = "0 0 0-3 * * ? ")
    @Override
    public boolean jobemail() {
        int jobemail = taskDAO.jobemail();
        if (jobemail>0)
        {
            logger.info("更新结束状态成功=========更新条数："+jobemail);
            return true;
        }else
        {
            logger.info("更新结束状态失败或无需更新=========更新条数："+jobemail);
            return false;
        }

    }

    @Scheduled(cron = "0 0/1 * * * ? ")
    @Override
    public boolean jobtask() {

        int i = taskDAO.jobtask();
        if (i>0)
        {
            logger.info("更新结束状态成功=========更新条数："+i);
            return true;
        }else
        {
            logger.info("更新结束状态失败或无需更新=========更新条数："+i);
            return false;
        }
    }

    @Override
    public List<Task> taskall(int state) {
        List<Task> stask = taskDAO.taskall(state);
        return stask;
    }

    @Override
    public boolean addtask(Task task) {
        Date date=new Date(new Date().getTime());
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        task.setCreate_time(date);
        int addtask = taskDAO.addtask(task);

        return addtask>0?true:false;
    }

    @Override
    public boolean deletestask(int id) {
        int deletestask = taskDAO.deletestask(id);
        return deletestask>0?true:false;
    }

    @Override
    public boolean updatetask(Task task) {
        int updatetask = taskDAO.updatetask(task);
        return updatetask>0?true:false;
    }

    @Resource
    private taskDAO taskDAO;

}
