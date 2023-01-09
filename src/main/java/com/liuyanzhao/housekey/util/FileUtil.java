package com.liuyanzhao.housekey.util;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.text.StrBuilder;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author 言曌
 */
public class FileUtil {

    /**
     * 上传文件返回URL
     *
     * @param file
     * @return
     */
    public static String upload(MultipartFile file) {
        String path = "";
        try {
            //用户目录
            final StrBuilder uploadPath = new StrBuilder(System.getProperties().getProperty("user.home"));
            uploadPath.append("/sens/upload/" + DateUtil.thisYear()).append("/").append(DateUtil.thisMonth() + 1).append("/");
            final File mediaPath = new File(uploadPath.toString());
            if (!mediaPath.exists()) {
                if (!mediaPath.mkdirs()) {
                    throw new Exception("operation failed");
                }
            }

            //不带后缀
            String nameWithOutSuffix = UUID.randomUUID().toString().replace("-", "");
//            String nameWithOutSuffix = file.getOriginalFilename().substring(0, file.getOriginalFilename().lastIndexOf('.')).replaceAll(" ", "_").replaceAll(",", "");

            //文件后缀
            final String fileSuffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf('.') + 1);

            //带后缀
            String fileName = nameWithOutSuffix + "." + fileSuffix;

            //判断文件名是否已存在
            File descFile = new File(mediaPath.getAbsoluteFile(), fileName);
//            int i = 1;
//            while (descFile.exists()) {
//                String newNameWithOutSuffix = nameWithOutSuffix + "(" + i + ")";
//                descFile = new File(mediaPath.getAbsoluteFile(), newNameWithOutSuffix + "." + fileSuffix);
//                i++;
//            }
            file.transferTo(descFile);


            //映射路径
            final StrBuilder filePath = new StrBuilder("/upload/");
            filePath.append(DateUtil.thisYear());
            filePath.append("/");
            filePath.append(DateUtil.thisMonth() + 1);
            filePath.append("/");
            filePath.append(nameWithOutSuffix + "." + fileSuffix);
            path = filePath.toString().replace("\\", "/");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return path;
    }

}
