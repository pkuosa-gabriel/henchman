FROM java:8-alpine

COPY target/uberjar/henchman.jar /henchman/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/henchman/app.jar"]
