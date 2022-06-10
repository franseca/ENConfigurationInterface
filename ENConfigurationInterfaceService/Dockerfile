FROM openjdk:11.0-jdk-slim-stretch

RUN apt-get install -y tzdata

ENV TZ America/Bogota

#VOLUME ["/usr/local/tecnoapp"]

LABEL maintainer="tecnotree.com"
WORKDIR /usr/local/tecnoapp/logs
#WORKDIR /usr/local/tecnoapp/
RUN mk en-configuration-interface.log

RUN groupadd tecnoapp
RUN useradd -rms /bin/sh -d /usr/local/tecnoapp/ tecnoapp -g tecnoapp

#EXPOSE 9898


RUN chown -R tecnoapp:tecnoapp /usr/local/tecnoapp

WORKDIR /usr/local/tecnoapp
ADD target/ENConfigurationInterfaceService-0.0.1-SNAPSHOT.jar ENConfigurationInterfaceService-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=release", "/usr/local/tecnoapp/ENConfigurationInterfaceService-0.0.1-SNAPSHOT.jar"]
#CMD ["java", "-jar", "/usr/local/tecnoapp/ENConfigurationInterfaceService-0.0.1-SNAPSHOT.jar"]
#CMD ["/bin/sh", "-c", "exec java -jar /usr/local/tecnoapp/ENConfigurationInterfaceService-0.0.1-SNAPSHOT.jar"]
