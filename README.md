# About

[![Validate Gradle Wrapper](https://github.com/cable8mm/demo-for-spring-boot/actions/workflows/gradle-wrapper-validation.yml/badge.svg)](https://github.com/cable8mm/demo-for-spring-boot/actions/workflows/gradle-wrapper-validation.yml)
[![Test with Gradle](https://github.com/cable8mm/demo-for-spring-boot/actions/workflows/gradle-test.yml/badge.svg)](https://github.com/cable8mm/demo-for-spring-boot/actions/workflows/gradle-test.yml)
[![Java CI with Gradle](https://github.com/cable8mm/demo-for-spring-boot/actions/workflows/gradle.yml/badge.svg)](https://github.com/cable8mm/demo-for-spring-boot/actions/workflows/gradle.yml)
![SpringBoot 3.2.3](https://img.shields.io/badge/SpringBoot-3.2.3-6DB33F?logo=SpringBoot)
![Java 17](https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk&logoColor=white)
![Gradle-Kotlin](https://img.shields.io/badge/Gradle-Kotlin-8151FF?logo=Gradle&labelColor=012F38)
![Packaging Jar](https://img.shields.io/badge/packaging-Jar-brown?logo=Spring)
![Error Report Sentry](https://img.shields.io/badge/error_report-Sentry-79628C?logo=Sentry)
![Visual Studio Code](https://img.shields.io/badge/Visual_Studio_Code-0078D4?logo=visual%20studio%20code&logoColor=white)

This repository has been developed for testing the last spring stack. We will find out the best practice.

## Installation

```sh
git https://github.com/cable8mm/demo-for-spring-boot.git

cd demo-for-spring-boot

./gradlew bootRun
```

And visit http://localhost:8080 or you would be better visit https://demo-for-spring-boot.test to refer [the article](https://www.palgle.com/2024/02/23/spring-boot-with-custom-domain/).

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
