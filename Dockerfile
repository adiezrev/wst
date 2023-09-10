FROM tomcat:9.0-jdk11-corretto-al2
#VOLUME /tmp
ADD app/wst-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8080   