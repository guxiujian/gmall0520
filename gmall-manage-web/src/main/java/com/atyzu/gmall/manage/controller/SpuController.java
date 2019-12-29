package com.atyzu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atyzu.gmall.bean.PmsProductImage;
import com.atyzu.gmall.bean.PmsProductInfo;
import com.atyzu.gmall.bean.PmsProductSaleAttr;
import com.atyzu.gmall.bean.PmsProductSaleAttrValue;
import com.atyzu.gmall.manage.util.PmsUploadUtil;
import com.atyzu.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@CrossOrigin
public class SpuController {

    @Reference
    SpuService spuService;

    @RequestMapping("spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList(String catalog3Id){
        List<PmsProductInfo> pmsProductInfos = spuService.spuList(catalog3Id);
        return pmsProductInfos;
    }

    @RequestMapping("saveSpuInfo")
    @ResponseBody
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo){
        spuService.saveSpuInfo(pmsProductInfo);
        //System.out.println("商品的名称："+pmsProductInfo.getProductName());

        return "success";

    }

    @RequestMapping("spuSaleAttrList")
    @ResponseBody
    public List<PmsProductSaleAttr> spuSaleAttrList(String spuId) {
        List<PmsProductSaleAttr> pmsProductSaleAttrs = spuService.spuSaleAttrList(spuId);
        for (PmsProductSaleAttr pmsProductSaleAttr : pmsProductSaleAttrs) {
            System.out.println("销售商品ID："+pmsProductSaleAttr.getSaleAttrName());
            List<PmsProductSaleAttrValue> spuSaleAttrValueList = pmsProductSaleAttr.getSpuSaleAttrValueList();
            if(spuSaleAttrValueList!=null&&spuSaleAttrValueList.size()>0){
                for (PmsProductSaleAttrValue pmsProductSaleAttrValue : spuSaleAttrValueList) {
                    System.out.println("商品属性值：" + pmsProductSaleAttrValue.getSaleAttrValueName());
                }
            }else{
                System.out.println("is null");
            }

        }
        return pmsProductSaleAttrs;
    }

    @RequestMapping("spuImageList")
    @ResponseBody
    public List<PmsProductImage> spuImageList(String spuId){
        List<PmsProductImage> pmsProductImages = spuService.spuImageList(spuId);
        return pmsProductImages;
    }


    @RequestMapping("fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile){
        //System.out.println("商品图片信息"+multipartFile.getOriginalFilename());
        String imageUrl = PmsUploadUtil.uploadImage(multipartFile);
        System.out.println(imageUrl);
        return imageUrl;
    }

}
