rootProject.name = "LearnJavaGradle"
pluginManagement {
    repositories {
        // 腾讯源
        maven("https://mirrors.cloud.tencent.com/nexus/repository/maven-public")
        // 阿里云备用
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        // 官方源保底
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    // 强制所有模块只用这里声明的仓库，防止个别 module 私自写死 jcenter 等
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven("https://maven.aliyun.com/repository/public")
        maven("https://maven.aliyun.com/repository/central")
        maven("https://maven.aliyun.com/repository/google")
        mavenCentral()
    }
}