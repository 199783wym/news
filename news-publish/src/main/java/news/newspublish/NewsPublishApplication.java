package news.newspublish;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "news.newspublish.mapper")
public class NewsPublishApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewsPublishApplication.class, args);
    }
}
