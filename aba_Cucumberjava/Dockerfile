FROM markhobson/maven-chrome:jdk-8

WORKDIR /source

#COPY features/ ./features/
COPY *.xml .
#COPY *.json .
#COPY *.sh .
COPY src/ ./src/


RUN mvn dependency:resolve

#ENTRYPOINT ["mvn", "clean", "compile", "test", "-Dcucumber.plugin=json:report.json", "-Dcucumber.features=features/"]
ENTRYPOINT ["mvn" , "test"]