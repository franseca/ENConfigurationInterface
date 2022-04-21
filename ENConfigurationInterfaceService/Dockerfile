FROM openjdk:11
LABEL maintainer="tecnotree.com"
WORKDIR /usr/local/tecnoapp/
ADD target/ENConfigurationInterfaceService-0.0.1-SNAPSHOT.jar /usr/local/tecnoapp/ENConfigurationInterfaceService-0.0.1-SNAPSHOT.jar
EXPOSE 9898
ENTRYPOINT ["java", "-jar", "/usr/local/tecnoapp/ENConfigurationInterfaceService-0.0.1-SNAPSHOT.jar"]