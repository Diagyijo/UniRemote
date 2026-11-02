# UniRemote

Aplicación Android en desarrollo para explorar compatibilidad con televisores de distintas marcas.

## Estado actual

Esta es una base inicial compilable. La interfaz todavía no controla televisores reales. La comunicación se añadirá por etapas según los protocolos compatibles con cada marca y modelo (por ejemplo, red local o infrarrojos cuando el teléfono tenga emisor IR).

## Compilar

Requisitos:
- JDK 17
- Gradle 8.9
- Android SDK Platform 35

Ejecutar:

```bash
gradle assembleDebug
```

El APK de depuración se genera en:

`app/build/outputs/apk/debug/app-debug.apk`

GitHub Actions compila el APK automáticamente al subir cambios a `main`.
