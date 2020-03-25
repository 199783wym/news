package news.newsworker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "news.newsworker.mapper")
public class NewsWorkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsWorkerApplication.class, args);
    }

}
