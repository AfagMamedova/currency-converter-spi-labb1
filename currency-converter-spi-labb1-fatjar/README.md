
# Laboration 1 – SPI (Service Provider Interface) i Java

Detta projekt är en konsolapplikation byggd med Java SPI, som uppfyller kraven för "Godkänd" enligt uppgiftsbeskrivningen.

## ✅ Funktionalitet

- SPI-interface: `CurrencyConverter`
- Två implementationer:
  - `UsdToSekConverter`
  - `EurToSekConverter`
- Annotation: `@ConverterName` används för att visa menyval
- Dynamisk laddning via `ServiceLoader`
- Konsolbaserat gränssnitt
- Maven multi-modulprojekt
- Körbart som fat JAR
- Stöd för Docker

## 🛠️ Bygga projektet

```bash
mvn clean package
```

## ▶️ Köra applikationen

```bash
java -jar currency-converter-app/target/currency-converter-app-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## 🐳 Docker

### 1. Bygg Docker-image

```bash
docker build -t afag/spi-converter .
```

### 2. Kör applikationen i Docker

```bash
docker run -it afag/spi-converter
```

## 📂 Projektstruktur

```
currency-converter-spi-labb1-fatjar/
├── currency-converter-api/
├── currency-converter-app/
├── currency-converter-impl-usd/
├── currency-converter-impl-eur/
├── pom.xml
├── Dockerfile
└── README.md
```

## 📦 Lämna in

- [x] Lägg upp projektet på GitHub
- [x] Skapa Docker-image och publicera på Docker Hub
- [x] Skicka in **länk till GitHub** och **Docker-image** enligt instruktion
