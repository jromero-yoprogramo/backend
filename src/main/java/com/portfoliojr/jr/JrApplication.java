package com.portfoliojr.jr;

//import java.util.HashSet;
//import java.util.Set;
//import java.util.concurrent.ScheduledFuture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication(scanBasePackages={"com.portfolio.jr"})
//@Configuration
//@ComponentScan("com.portfoliojr.jr.Repository")
//@EnableJpaRepositories("com.portfoliojr.jr.Repository")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,WebMvcAutoConfiguration.class})
public class JrApplication {


    public static void main(String[] args) {
       
        SpringApplication.run(JrApplication.class, args);

    }

//    public ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler() {
//        private final Set<ScheduledFuture<?>> futures = new HashSet<>();
//
//        @Override
//        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable task, long delay) {
//            ScheduledFuture<?> future = super.scheduleWithFixedDelay(task, delay);
//            futures.add(future);
//            return future;
//        }
//
//        @Override
//        public ScheduledFuture<?> schedule(Runnable task, Trigger trigger) {
//            ScheduledFuture<?> future = super.schedule(task, trigger);
//            futures.add(future);
//            return future;
//        }
//
//        @Override
//        public void shutdown() {
//            futures.forEach(future -> future.cancel(true));
//            super.shutdown();
//        }
//
//    };
}