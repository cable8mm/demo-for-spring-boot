# About

[![Validate Gradle Wrapper](https://github.com/cable8mm/demo-for-spring-boot/actions/workflows/gradle-wrapper-validation.yml/badge.svg)](https://github.com/cable8mm/demo-for-spring-boot/actions/workflows/gradle-wrapper-validation.yml)
[![Test with Gradle](https://github.com/cable8mm/demo-for-spring-boot/actions/workflows/gradle-test.yml/badge.svg)](https://github.com/cable8mm/demo-for-spring-boot/actions/workflows/gradle-test.yml)
[![Java CI with Gradle](https://github.com/cable8mm/demo-for-spring-boot/actions/workflows/gradle.yml/badge.svg)](https://github.com/cable8mm/demo-for-spring-boot/actions/workflows/gradle.yml)

This repository has been developed for testing the last spring stack. We will find out the best practice.

## Spring initalizr setting

- Project : Gradle - Kotlin
- Language : Java
- Spring Boot : 3.2.3

Project metadata:

- Group : com.example
- Artifact : demo
- Name : demo
- Description : Demo project for Spring Boot
- Package name : com.example.demo
- Packaging : Jar
- java : 17

Dependencies

- None

## Coding Style

Accourding to [spring java format](https://github.com/spring-io/spring-javaformat?tab=readme-ov-file#visual-studio-code), you must follow that.

> The Visual Studio Code extension provides custom formatter support for Microsoft Visual Studio Code. The extension using the [DocumentFormattingEditProvider](https://code.visualstudio.com/api/references/vscode-api#DocumentFormattingEditProvider) API. Once installed it may be activated by using the “Format Document” action available in the editor context menu or from the Command Palette.
>
> To install the extension select “Install from VSIX” in the extensions panel and choose the spring-javaformat-vscode-extension vsix file. You can download the latest version from [Maven Central](https://repo1.maven.org/maven2/io/spring/javaformat/spring-javaformat-vscode-extension/0.0.41/).

I saved the lastest version from Maven Central, so you would use it easily.

## Development

You would change vscode `Hot code replace` setting from `manual` to `auto` then you don't need restart when you have changed your codes.

You must run not release mode but debug mode, than you must run [below command](https://www.digitalsanctuary.com/java/springboot-devtools-auto-restart-and-live-reload.html).

```sh
gradle -t classes
```

## License

The Project Demo is open-sourced software licensed under the [MIT license](https://opensource.org/licenses/MIT).
