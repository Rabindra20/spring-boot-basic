For quick start with Spring Initializer.
```
https://start.spring.io/
```
Create a web controller<br/>
Added `HealthController` in `src/main/java/com/rab/springbootbasic/SpringBootBasicApplication.java` file<br/>
And also update class in `src/main/java/com/rab/springbootbasic/SpringBootBasicApplication.java` file<br/>
Change dependencies in `build.gradle` folder for web<br/>
`org.springframework.boot:spring-boot-starter` to `org.springframework.boot:spring-boot-starter-web`<br/>
Build docker image in local
```
docker build -t spring-app:test .
```
Run docker images
```
docker run -itd -p 8080:8080 spring-app:test
```
Exec docker container 
```
docker exec -it Container id sh
```
Remove image from local
```
docker rmi -f sample:test
```
Docker compose up
```
docker-compose up -d
```
Docker compose down
```
docker-compose down
```
To check 
```
curl localhost:8080/
```