package cloud.simple.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.*;

/**
 * Created by Administrator on 2016/10/18.
 */
@Controller
public class FileUploadController {
    //访问路径为：http://127.0.0.1:8080/file

    @RequestMapping("/index")

    public String  file() {

        return "index";

    }


    /**
     * 文件上传具体实现方法;
     *
     * @param file
     * @return
     */

    @RequestMapping("/upload")

    @ResponseBody

    public String handleFileUpload(@RequestParam("file") MultipartFile file) throws FileNotFoundException {

        if (!file.isEmpty()) {

            try {

                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));

                out.write(file.getBytes());

                out.flush();

                out.close();

            } catch (FileNotFoundException e) {

                e.printStackTrace();

                return "上传失败," + e.getMessage();

            } catch (IOException e) {

                e.printStackTrace();

                return "上传失败," + e.getMessage();

            }

            return "上传成功";

        } else {

            return "上传失败，因为文件是空的.";

        }

    }
}
