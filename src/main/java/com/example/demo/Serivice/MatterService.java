package com.example.demo.Serivice;

import com.example.demo.Entity.Matter;

import java.util.List;

public interface MatterService {

    boolean addmatter(Matter matter);
    List<Matter> inall();
    boolean DeleteMatter(int i);
    boolean updateMatter(String str,int i);
}
