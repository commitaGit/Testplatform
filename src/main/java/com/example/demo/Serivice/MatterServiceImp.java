package com.example.demo.Serivice;

import com.example.demo.DAO.MatterDAO;
import com.example.demo.Entity.Matter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@Service
public class MatterServiceImp implements MatterService {
    @Resource
    private  MatterDAO matterDAO;
    @Override
    public boolean addmatter(Matter matter) {
        Logger logger=Logger.getLogger("MatterServiceImp.class");
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        matter.setCreate_time(date);
        matter.setUpdate_time(date);
        logger.info(simpleDateFormat.format(date));
        int i=matterDAO.addmatter(matter);
        if (i>0)
        {
            return true;
        }else {
            return false;
        }

    }
    public List<Matter> inall()
    {
        List<Matter> allmat=matterDAO.inall();
        return allmat;
    }

    @Override
    public boolean DeleteMatter(int i) {
        int y = matterDAO.DeleteMatter(i);
        if(y>0)
        {
            return true;
        }else
        {
            return  false;
        }
    }

    @Override
    public boolean updateMatter(String str, int i) {
        int z=matterDAO.updateMatter(str,i);
        if(z>0)
        {return true;
        }else {
        return false;}
    }
}
