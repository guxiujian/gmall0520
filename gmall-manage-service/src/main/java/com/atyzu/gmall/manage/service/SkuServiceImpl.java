package com.atyzu.gmall.manage.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.atyzu.gmall.bean.PmsSkuAttrValue;
import com.atyzu.gmall.bean.PmsSkuImage;
import com.atyzu.gmall.bean.PmsSkuInfo;
import com.atyzu.gmall.bean.PmsSkuSaleAttrValue;
import com.atyzu.gmall.manage.mapper.PmsSkuAttrValueMapper;
import com.atyzu.gmall.manage.mapper.PmsSkuImageMapper;
import com.atyzu.gmall.manage.mapper.PmsSkuInfoMapper;
import com.atyzu.gmall.manage.mapper.PmsSkuSaleAttrValueMapper;
import com.atyzu.gmall.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SkuServiceImpl implements SkuService {

    @Autowired
    PmsSkuInfoMapper pmsSkuInfoMapper;
    @Autowired
    PmsSkuAttrValueMapper pmsSkuAttrValueMapper;
    @Autowired
    PmsSkuSaleAttrValueMapper pmsSkuSaleAttrValueMapper;
    @Autowired
    PmsSkuImageMapper pmsSkuImageMapper;

    @Override
    public void saveSkuInfo(PmsSkuInfo pmsSkuInfo) {
        //插入pmsSkucInfo数据表
        int i = pmsSkuInfoMapper.insertSelective(pmsSkuInfo);

        //获取skuId值
        String skuId = pmsSkuInfo.getId();

        //插入平台属性
        List<PmsSkuAttrValue> skuAttrValueList = pmsSkuInfo.getSkuAttrValueList();
        for (PmsSkuAttrValue pmsSkuAttrValue : skuAttrValueList) {
            pmsSkuAttrValue.setSkuId(skuId);
            pmsSkuAttrValueMapper.insertSelective(pmsSkuAttrValue);
        }

        //插入销售属性
        List<PmsSkuSaleAttrValue> skuSaleAttrValueList = pmsSkuInfo.getSkuSaleAttrValueList();
        for (PmsSkuSaleAttrValue pmsSkuSaleAttrValue : skuSaleAttrValueList) {
            pmsSkuSaleAttrValue.setSkuId(skuId);
            pmsSkuSaleAttrValueMapper.insertSelective(pmsSkuSaleAttrValue);
        }

        //插入图片属性
        List<PmsSkuImage> skuImageList = pmsSkuInfo.getSkuImageList();
        for (PmsSkuImage pmsSkuImage : skuImageList) {
            pmsSkuImage.setSkuId(skuId);
            pmsSkuImageMapper.insertSelective(pmsSkuImage);
        }


    }
}
