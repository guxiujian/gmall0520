package com.atyzu.gmall.service;

import com.atyzu.gmall.bean.PmsProductImage;
import com.atyzu.gmall.bean.PmsProductInfo;
import com.atyzu.gmall.bean.PmsProductSaleAttr;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);

    void saveSpuInfo(PmsProductInfo pmsProductInfo);

    List<PmsProductSaleAttr> spuSaleAttrList(String spuId);

    List<PmsProductImage> spuImageList(String spuId);
}
