package edu.gdut.imis.campus_shop.service;

import edu.gdut.imis.campus_shop.BaseTest;
import edu.gdut.imis.campus_shop.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AreaServiceTest extends BaseTest{
    @Autowired
    private AreaService areaService;
    @Test
    public void testGetAreaList(){
        List<Area> areaList = areaService.getAreaList();
        assertEquals("东风路",areaList.get(0).getAreaName());

    }
}
