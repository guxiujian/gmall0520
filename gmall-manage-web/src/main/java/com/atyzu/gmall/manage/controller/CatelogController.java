package com.atyzu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atyzu.gmall.bean.PmsBaseCatalog1;
import com.atyzu.gmall.bean.PmsBaseCatalog2;
import com.atyzu.gmall.bean.PmsBaseCatalog3;
import com.atyzu.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class CatelogController {

    @Reference
    CatalogService catalogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> catalog1 = catalogService.getCatalog1();
        return catalog1;
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(){
        List<PmsBaseCatalog2> catalog2 = catalogService.getCatalog2();
        return catalog2;
    }

    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(){
        List<PmsBaseCatalog3> catalog3 = catalogService.getCatalog3();
        return catalog3;
    }
}
