# version-catalog

Version catalog centralizado de Gradle.

Publicar en Maven local:

```bash
./gradlew publishToMavenLocal
```

Consumir en `settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositories { mavenLocal() }
    versionCatalogs {
        create("libs") { from("com.carlosugaz:version-catalog:1.0.0") }
    }
}
```
