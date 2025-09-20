# LearnJavaGradle 项目说明

本项目是一个基于 Gradle 构建的 Java 学习示例，适合 Java 初学者和希望了解 Gradle 构建工具的开发者。

## 项目结构

- `src/main/java/xyz/luobochuanqi/`：主程序包，包含主类和核心接口/类。
  - `Main.java`：程序入口。
  - `Storable.java`：可存储接口。
  - `Warehouse.java`：仓库类。
  - `Medias/`：媒体相关类（如 Book、EBook、Magazine、Media）。
- `build.gradle.kts`：Gradle 构建脚本，使用 Kotlin DSL。
- `settings.gradle.kts`：Gradle 设置文件。
- `README.md`：项目说明文档。

## 主要功能

- 演示 Java 面向对象编程（OOP）基础。
- 实现媒体（图书、电子书、杂志等）及其仓库管理。
- 展示 Gradle 项目结构与构建流程。

## 如何运行

1. 克隆本项目：
   ```bash
   git clone <本项目地址>
   ```
2. 进入项目目录：
   ```bash
   cd LearnJavaGradle
   ```
3. 使用 Gradle 构建并运行：
   ```bash
   ./gradlew build
   ./gradlew run
   ```
   或在 Windows 下：
   ```cmd
   gradlew.bat build
   gradlew.bat run
   ```

## 依赖环境
- JDK 17 或以上
- Gradle 8.x（已集成 Wrapper，无需单独安装）

## 适用场景
- Java 基础语法与 OOP 学习
- Gradle 构建工具入门
- 小型 Java 项目结构参考

---

如有建议或问题，欢迎提交 Issue。

