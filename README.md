# goodlife_log4j2

Using the @log4j2

To give you a short summary what we are about to do:

1、Setting up the pom.xml on your machine

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <exclusions><!-- È¥µôspringbootÄ¬ÈÏÅäÖÃ -->
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-logging</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <dependency> <!-- ÒýÈëlog4j2ÒÀÀµ -->
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-log4j2</artifactId>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
 2、Define @Log4j2 on the class

 @Log4j2
 public class Log4j2Controller {
 }    
