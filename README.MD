# KMP code kata

This is a kata bootstrap like [other kata-bootstraps](https://github.com/swkBerlin/kata-bootstraps)
But with Kotlin Multiplatform, Kotest and PowerAssert.

A failing test
```kotlin
class PowerAssertTest : FreeSpec({
    "Power-assert with Kotest" {
        val hello = "Hello"
        val world = "world!"
        assertEquals(hello.length, world.substring(1, 4).length)
    }
})
```

will have the output:
```
de.nielsfalk.kata.PowerAssertTest[jvm] > Power-assert with Kotest[jvm] FAILED
    org.opentest4j.AssertionFailedError: 
    assertEquals(hello.length, world.substring(1, 4).length)
                 |     |       |     |               |
                 |     |       |     |               3
                 |     |       |     orl
                 |     |       world!
                 |     5
                 Hello
     ==> expected: <5> but was: <3>
```

## Run Test

### All

`./gradlew clean allTests`

### JVM

`./gradlew shared:cleanJvmTest shared:jvmTest`

### JS

`./gradlew :shared:jsBrowserTest`

### iOS

`./gradlew :shared:cleanIosX64Test :shared:iosX64Test`

### MacOs

`./gradlew :shared:cleanMacosX64Test :shared:macosX64Test`

### Android

`./gradlew :shared:cleanTestDebugUnitTest :shared:testDebugUnitTest`


### Wasm
`./gradlew :shared:cleanWasmJsBrowserTest :shared:wasmJsBrowserTest`


### Publish to MavenCentral

1) Registering a Sonatype account as described here: 
   https://dev.to/kotlin/how-to-build-and-publish-a-kotlin-multiplatform-library-going-public-4a8k
2) Add developer id, name, email and the project url to
   `/convention-plugins/src/main/kotlin/convention.publication.gradle.kts`
3) Add the secrets to `local.properties`:

```
signing.keyId=...
signing.password=...
signing.secretKeyRingFile=...
ossrhUsername=...
ossrhPassword=...
```

4) Run `./gradlew :shared:publishAllPublicationsToSonatypeRepository`

### Build platform artifacts

#### Android aar

- Run `./gradlew :shared:assembleRelease`
- Output: `/shared/build/outputs/aar/shared-release.aar`

#### JVM jar

- Run `./gradlew :shared:jvmJar`
- Output: `/shared/build/libs/shared-jvm-1.0.jar`

#### iOS Framework

- Run `./gradlew :shared:linkReleaseFrameworkIosArm64`
- Output: `/shared/build/bin/iosArm64/releaseFramework/shared.framework`

#### JS file

- Run `./gradlew :shared:jsBrowserProductionWebpack`
- Output: `/shared/build/dist/js/productionExecutable/shared.js`

#### macOS Framework

- Run `./gradlew :shared:linkReleaseFrameworkMacosArm64`
- Output: `/shared/build/bin/macosArm64/releaseFramework/shared.framework`

#### Linux static library

- Run `./gradlew :shared:linkReleaseStaticLinuxX64`
- Output: `/shared/build/bin/linuxX64/releaseStatic/libshared.a`

#### Windows static library

- Run `./gradlew :shared:linkReleaseStaticMingwX64`
- Output: `/shared/build/bin/mingwX64/releaseStatic/libshared.a`

#### Wasm binary file

- Run `./gradlew :shared:wasmJsBrowserDistribution`
- Output: `/shared/build/dist/wasmJs/productionExecutable/shared-wasm-js.wasm`
