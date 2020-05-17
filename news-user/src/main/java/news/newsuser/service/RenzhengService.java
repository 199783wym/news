package news.newsuser.service;

import news.newsuser.mapper.RenzhengMapper;
import news.newsuser.model.Renzheng;
import news.newsuser.model.RenzhengExample;
import news.newsuser.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * @Author: ym
 * @Date: 2020/5/15 2:36
 * @Version 1.0
 */
@Service
public class RenzhengService {
    @Autowired
    private RenzhengMapper renzhengMapper;

    public void insert(MultipartFile file, String title) {
//字节流
//        try {
//            InputStream ins = file.getInputStream();
//            byte[] buffer = new byte[1024];
//            int len = 0;
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            while ((len = ins.read(buffer)) != -1) {
//                bos.write(buffer, 0, len);
//            }
//            bos.flush();
//            byte data[] = bos.toByteArray();
//            Renzheng renzheng = new Renzheng();
//            renzheng.setUserId(UserContext.getLoginInfo().getId());
//            renzheng.setName("title");
//            renzheng.setStatus(1L);
//            renzheng.setGmtCreate(System.currentTimeMillis());
//            renzheng.setImg(data);
//            renzhengMapper.insert(renzheng);
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

//        String staticPath = ClassUtils.getDefaultClassLoader().getResource("static").getPath();
//        String fileName = file.getOriginalFilename();  //获取文件名
//
//        // 图片存储目录及图片名称
//        String url_path = "images" + File.separator + fileName;
//        //图片保存路径
//        String savePath = staticPath + File.separator + url_path;
//        System.out.println("图片保存地址："+savePath);
//        // 访问路径=静态资源路径+文件目录路径
//        String visitPath ="static/" + url_path;
//        System.out.println("图片访问uri："+visitPath);
//
//        File saveFile = new File(savePath);
//        if (!saveFile.exists()){
//            saveFile.mkdirs();
//        }
//        try {
//            file.transferTo(saveFile);  //将临时存储的文件移动到真实存储路径下
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }

       try{
           String imgUrl= null;
           String fileName = upload(file,"d:/images",file.getOriginalFilename());
           imgUrl = new File("d:/images").getName()+"/"+fileName;
           Renzheng renzheng= new Renzheng();
           renzheng.setUserId(UserContext.getLoginInfo().getId());
           renzheng.setName(title);
           renzheng.setImg(fileName);
           renzheng.setGmtCreate(System.currentTimeMillis());
           renzheng.setStatus(1L);
           renzhengMapper.insert(renzheng);

       }catch (Exception e){
           e.printStackTrace();
       }
    }

    public String upload(MultipartFile file, String path, String fileName) throws Exception {
String realPath = path + "/" + UUID.randomUUID().toString().replace("-", "")+fileName.substring(fileName.lastIndexOf("."));
File dest = new File(realPath);
// 判断文件父目录是否存在
if (!dest.getParentFile().exists()) { dest.getParentFile().mkdir(); }
// 保存文件
file.transferTo(dest);
return dest.getName();
    }

}
