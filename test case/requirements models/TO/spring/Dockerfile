FROM openjdk:11
ARG JAR_FILE
# ADD target/${JAR_FILE} app.jar

#通过 docker inspect WebServer(要启动的容器名字可以查看主机所对应挂载点的目录)
VOLUME /data

ADD docker-compose.yml /data/docker-compose.yml

ADD target/${JAR_FILE} /data/app.jar
ENTRYPOINT ["java", "-jar", "/data/app.jar"]