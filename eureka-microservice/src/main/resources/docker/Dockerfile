FROM java:8-jre
MAINTAINER Yusuf ONDER <yusufonder55@gmail.com>

ADD ../../../../target/eureka-microservice-0.0.1-SNAPSHOT.jar /opt/eureka-server
EXPOSE 1111
WORKDIR /opt/eureka-server
CMD ["java","-Xms512m", "-Xmx1g", "-jar", "eureka-microservice-0.0.1-SNAPSHOT.jar"]