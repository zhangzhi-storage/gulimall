package com.atguigu.gulimall.product;


import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/**
 * 1.引入oos-starter
 * 2.配置key,endpoint相关信息即可
 * 3.使用OSSClient进行相关操作
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;
    /*@Autowired
    OSS ossClient;*/
    @Test
    public void testUpload() throws FileNotFoundException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
//        String endpoint = "oss-cn-shenzhen.aliyuncs.com";
//// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
//        String accessKeyId = "LTAI4G56gKd3TvHgFnumVVGk";
//        String accessKeySecret = "x25I5NYT3Ut4vzE5t0c0L2AS28qywW";

// 创建OSSClient实例。
 //       OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

// 上传文件流。
//        InputStream inputStream = new FileInputStream("E:\\jks\\20200609175835.jpg");
//        ossClient.putObject("gulimall-hellowordjava", "pic.png", inputStream);
//
//// 关闭OSSClient。
//        ossClient.shutdown();
        System.out.println("上传完成");
    }
    @Test
    public void contextLoads() {
//        BrandEntity brandEntity=new BrandEntity();
//        brandEntity.setBrandId(13L);
//        brandEntity.setDescript("华为");
//        brandService.updateById(brandEntity);

//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 9L));
        list.forEach((item)-> {
            System.out.println(item);
                }
        );
    }

}
