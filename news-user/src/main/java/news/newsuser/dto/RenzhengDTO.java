package news.newsuser.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: ym
 * @Date: 2020/5/15 0:41
 * @Version 1.0
 */
@Data
public class RenzhengDTO {
    private String title;
    private MultipartFile file;
}
