package news.newsuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "news.newsuser.mapper")
public class NewsUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsUserApplication.class, args);
    }

}
