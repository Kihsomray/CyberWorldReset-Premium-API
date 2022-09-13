<img src="https://dev.zerotoil.net/cyberworldreset-premium/images/CWR_Prototype_2022_Logo_Colored.png" width="250" height="250"></img>
# CyberWorldReset Premium API
Access tools regarding CWR Premium. Useful for developers who want to integrate it into their SpigotMC plugins.

Please note that this is **not a plugin!** It is an API for a plugin.

Requires at least Java 8 to compile, project SDK must be at least Java 17.

> I plan to add events to this API in the near future. Stay tuned!

## Setup
1. Add CyberWorldReset Premium API into your project via Maven or Gradle.

2. Include "CyberWorldReset" as a dependency in plugin.yml.
   ```yaml
   # Not doing so may result in a null return value for step 3.
   depend: [ CyberWorldReset ]
   ```

4. Get an instance of the main class, and access what's needed.
    ```java
   // Get an instance from the CyberWorldResetAPI class:
   CWRMain cwrMain = CyberWorldResetAPI.getInstance();

   // Access loaded information in cache:
   CWRCache cache = cwrMain.cache();
   ```

And you're all set!

## Maven and Gradle Integration
Maven - add to pom.xml
```xml
<!-- JitPack -->
 <repository>
     <id>jitpack.io</id>
     <url>https://jitpack.io</url>
 </repository>
```
```xml
<!-- CyberWorldReset API -->
 <dependency>
     <groupId>com.github.Kihsomray</groupId>
     <artifactId>CyberWorldReset-Premium-API</artifactId>
     <!--Replace version with the latest release version-->
     <version>RELEASE_TAG</version>
    <scope>provided</scope>
 </dependency>
```

Gradle - add to build.gradle
```
 repositories {
     maven { url 'https://jitpack.io' }
 }
```
```
dependencies {
    implementation 'com.github.Kihsomray:CyberWorldReset-Premium-API:RELEASE_TAG'
}
```