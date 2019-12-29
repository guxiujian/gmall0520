package com.atyzu.gmall.manage.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.atyzu.gmall.bean.PmsBaseCatalog1;
import com.atyzu.gmall.bean.PmsBaseCatalog2;
import com.atyzu.gmall.bean.PmsBaseCatalog3;
import com.atyzu.gmall.manage.mapper.PmsBaseCatalog1Mapper;
import com.atyzu.gmall.manage.mapper.PmsBaseCatalog2Mapper;
import com.atyzu.gmall.manage.mapper.PmsBaseCatalog3Mapper;
import com.atyzu.gmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;
    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        List<PmsBaseCatalog1> pmsBaseCatalog1s = pmsBaseCatalog1Mapper.selectAll();
        return pmsBaseCatalog1s;
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2() {
        List<PmsBaseCatalog2> pmsBaseCatalog2s = pmsBaseCatalog2Mapper.selectAll();
        return pmsBaseCatalog2s;
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3() {
        List<PmsBaseCatalog3> pmsBaseCatalog3s = pmsBaseCatalog3Mapper.selectAll();
        return pmsBaseCatalog3s;
    }
}
