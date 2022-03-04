# 插件构建如下

在根目录创建根目录 xx->src->main-xxx
xx目录名称
xxx包名目录

创建插件class
class NearbyGradlePlugin : Plugin<Project>{
override fun apply(p0: Project) {

    }

    companion object{

    }
}
在目录build.gradle
添加

apply plugin: 'java-gradle-plugin'
apply plugin: 'maven-publish'


//本地依赖插件时使用
gradlePlugin {
    plugins {
        routerPlugin {
        // 在 app 模块须要经过 id 引用这个插件
        id = 'nearby.composing.builds'
        // 实现这个插件的类的路径
        implementationClass = 'nearby.composing.builds.NearbyGradlePlugin'
        }
    }
}


group = 'nearby.composing.builds'
version = '1.0.0'
//远程上传插件
publishing {
    publications {
        maven(MavenPublication) {
        // 版本id，最终会根据这个id-version生成相应的插件
        artifactId = 'nearby_plugin'
        from components.java
    }
}

    repositories {
        maven {
            // 生成的插件位置
            url = uri('../repo')
        }
    }
}

在app build.gradle

plugins {
    //...
    id 'org.jetbrains.kotlin.android'
}
在settings.gradle

dependencyResolutionManagement {
repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter() // Warning: this repository is going to shut down soon
        maven { url 'https://jitpack.io' }//此处标记上传插件的地址
    }
}


include ':composing-builds'


# JitPack 步骤

步骤一 项目根目录 build.gradle 添加

classpath 'com.github.dcendents:android-maven-gradle-plugin:2.1'


------------------------------------------------------------------------------------------------------------------------


步骤二 项目module目录 build.gradle 添加

plugins { //... id 'maven-publish' }

afterEvaluate { publishing { publications { release(MavenPublication) { from components.release
groupId = 'ren.nearby.ren.lib.http' artifactId = 'http' version = '1.0.0' } } } }