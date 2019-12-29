package com.atyzu.gmall.service;

import com.atyzu.gmall.bean.PmsBaseAttrInfo;
import com.atyzu.gmall.bean.PmsBaseAttrValue;
import com.atyzu.gmall.bean.PmsBaseSaleAttr;

import java.util.List;

public interface AttrService {

    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    void saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseSaleAttr> baseSaleAttrList();
}
