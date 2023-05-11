FROM eclipse-temurin:11

WORKDIR /opt
COPY pgf.jar /opt/pgf.jar
ENV JVM_OPTS="-Dspring.profiles.active=h2"
ENTRYPOINT [ "sh", "-c", "java ${JVM_OPTS} -jar /opt/pgf.jar"]
