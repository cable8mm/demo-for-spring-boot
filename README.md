# About

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

## Development

You would change vscode `Hot code replace` setting from `manual` to `auto` then you don't need restart when you have changed your codes.

You must run not release mode but debug mode, than you must run [below command](https://www.digitalsanctuary.com/java/springboot-devtools-auto-restart-and-live-reload.html).

```sh
gradle -t classes
```

## License

The Project Demo is open-sourced software licensed under the [MIT license](https://opensource.org/licenses/MIT).
