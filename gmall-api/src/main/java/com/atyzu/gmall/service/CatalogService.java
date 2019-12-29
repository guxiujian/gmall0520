package com.atyzu.gmall.service;

import com.atyzu.gmall.bean.PmsBaseCatalog1;
import com.atyzu.gmall.bean.PmsBaseCatalog2;
import com.atyzu.gmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {

    List<PmsBaseCatalog1> getCatalog1();
    List<PmsBaseCatalog2> getCatalog2();
    List<PmsBaseCatalog3> getCatalog3();
}
