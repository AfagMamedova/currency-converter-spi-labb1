FROM eclipse-temurin:17-jdk
WORKDIR /app

COPY currency-converter-api/target/*.jar ./libs/
COPY currency-converter-impl-usd/target/*.jar ./libs/
COPY currency-converter-impl-eur/target/*.jar ./libs/
COPY currency-converter-app/target/*.jar ./libs/

ENTRYPOINT ["java", "-cp", "libs/*", "com.example.app.Main"]
