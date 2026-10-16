plugins {
    `version-catalog`
    `maven-publish`
}

group = "com.carlosugaz"
version = "1.0.0"

catalog {
    versionCatalog {
        from(files("catalog/libs.versions.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("versionCatalog") {
            artifactId = "version-catalog"
            from(components["versionCatalog"])
        }
    }
}
