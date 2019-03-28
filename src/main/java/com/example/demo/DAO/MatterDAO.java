package com.example.demo.DAO;

import com.example.demo.Base.ComMapper;
import com.example.demo.Entity.Matter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MatterDAO extends ComMapper<Matter> {
    int addmatter(Matter matter); //增
    List<Matter> inall();   //查
    int DeleteMatter(int i);     //删
    int updateMatter(@Param("title") String str, @Param("id") int i1); //更

}
