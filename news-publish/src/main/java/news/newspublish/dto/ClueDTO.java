package news.newspublish.dto;

import lombok.Data;
import news.newspublish.model.User;


/**
 * @Author: ym
 * @Date: 2020/4/21 17:00
 * @Version 1.0
 */
@Data
public class ClueDTO {

    private Long id;

    private String content;

    private Long createId;

    private Long audit1;

    private Long audit1No;

    private Long audit2;

    private Long audit2No;

    private Long toId;

    private Long status;

    private Long type;

    private Long gmtCreate;

    private Long gmtModified;

    private String title;

    private User user;
}
