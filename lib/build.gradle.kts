plugins {
    alias(libs.plugins.jetbrains.kotlin.jvm)
    alias(libs.plugins.ksp)
    alias(libs.plugins.anvil)
}
java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
    }
}
anvil {
    useKsp(
        contributesAndFactoryGeneration = true,
        componentMerging = true
    )
    generateDaggerFactories = true
}

dependencies {
    implementation(libs.dagger)
}
