package news.newsuser.dto;

import lombok.Data;

/**
 * @Author: ym
 * @Date: 2020/3/29 0:04
 * @Version 1.0
 */
@Data
public class UserDTO {
    private Long id;

    private String name;

    private String avatarUrl;

    private Long renzheng;

    private String renzhengString;

    private String phone;

    private Long score;

    private Long password;
}
