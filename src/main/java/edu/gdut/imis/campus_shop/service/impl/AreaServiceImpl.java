package edu.gdut.imis.campus_shop.service.impl;

import edu.gdut.imis.campus_shop.dao.AreaDao;
import edu.gdut.imis.campus_shop.entity.Area;
import edu.gdut.imis.campus_shop.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> getAreaList() {

        return areaDao.queryArea();
    }
}
