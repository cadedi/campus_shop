package edu.gdut.imis.campus_shop.dao;

import edu.gdut.imis.campus_shop.entity.Area;

import java.util.List;

public interface AreaDao {
    //列出区域列表
    List<Area> queryArea();
}
