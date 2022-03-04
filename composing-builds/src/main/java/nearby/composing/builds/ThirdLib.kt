package nearby.composing.builds

/**
 * @author:
 * @created on: 2022/3/4 13:46
 * @description:
 */
object ThirdLib {


    val logger = Logger


    object Logger {
        private const val logger_version = "2.1.1"
        const val fragment = "com.orhanobut:logger:${logger_version}"
    }

    val timber = Timber


    object Timber {
        private const val timber_version = "4.7.1"
        const val fragment = "com.jakewharton.timber:timber:${timber_version}"
    }

    val rxjava = Rxjava

    object Rxjava {
        private const val rxjava_version = "2.1.3"
        const val rxjava = "io.reactivex.rxjava2:rxjava:${rxjava_version}"
        const val rxandroid = "io.reactivex.rxjava2:rxandroid:2.0.1"
        const val rxbinding2 = "com.jakewharton.rxbinding2:rxbinding:2.1.1"
    }

    val dagger = Dagger

    object Dagger {
        private const val dagger_version = "2.16"
        const val dagger = "com.google.dagger:dagger:${dagger_version}"
        const val dagger2_compiler = "com.google.dagger:dagger-compiler:2.19"
        const val dagger2_android = "com.google.dagger:dagger-android:2.19"
        const val dagger2_support = "com.google.dagger:dagger-android-support:2.16"
        const val dagger2_processor = "com.google.dagger:dagger-android-processor:2.16"
    }


    val okhttp3 = Okhttp3

    object Okhttp3 {
        private const val okhttp3_version = "3.8.1"
        const val okhttp3 = "com.squareup.okhttp3:okhttp:${okhttp3_version}"
        const val logging_interceptor = "com.squareup.okhttp3:logging-interceptor:3.8.1"
        const val retrofit = "com.squareup.retrofit2:retrofit:2.3.0"
        const val retrofit_converter_gson = "com.squareup.retrofit2:converter-gson:2.3.0"
        const val adapter_rxjava2 = "com.squareup.retrofit2:adapter-rxjava2:2.3.0"
        const val converter_calars = "com.squareup.retrofit2:converter-scalars:2.3.0"
    }


    //拦截请求调试
    val stetho_okhttp3 = Stetho_okhttp3

    object Stetho_okhttp3 {
        private const val stetho_okhttp3_version = "1.5.0"
        const val stetho_okhttp3 = "com.facebook.stetho:stetho-okhttp3:${stetho_okhttp3_version}"
    }


    //拦截请求调试
    val stetho = Stetho

    object Stetho {
        private const val stetho_version = "1.5.0"
        const val stetho = "com.facebook.stetho:stetho:${stetho_version}"
    }

    val crashwoodpecker = Crashwoodpecker

    object Crashwoodpecker {
        private const val crashwoodpecker_version = "2.1.1"
        const val crashwoodpecker = "me.drakeet.library:crashwoodpecker:${crashwoodpecker_version}"
    }


    val banner = Banner

    object Banner {
        private const val banner_version = "2.1.1"
        const val banner = "com.youth.banner:banner:${banner_version}"
    }

    val smarttablayout = Smarttablayout

    object Smarttablayout {
        private const val smarttablayout_version = "2.1.1"
        const val smarttablayout =
            "com.ogaclejapan.smarttablayout:library:${smarttablayout_version}"
        const val smarttablayout_utils =
            "com.ogaclejapan.smarttablayout:utils-v4:${smarttablayout_version}"
    }


    val mtwalle = Mtwalle

    //美团打包
    object Mtwalle {
        private const val mtwalle_version = "1.1.6"
        const val mtwalle = "com.meituan.android.walle:library:${mtwalle_version}"
    }


    val permissionsdispatcher = Permissionsdispatcher

    object Permissionsdispatcher {
        private const val permissionsdispatcher_version = "2.1.3"
        const val permissionsdispatcher =
            "com.github.hotchemi:permissionsdispatcher:${permissionsdispatcher_version}"
        const val permissionsdispatcher_processor =
            "com.github.hotchemi:permissionsdispatcher-processor:${permissionsdispatcher_version}"
    }

    val arouter = Arouter

    object Arouter {
        private const val arouter_version = "1.5.2"
        const val arouter_api = "com.alibaba:arouter-api:$arouter_version"
        const val arouter_compiler = "com.alibaba:arouter-compiler:$arouter_version"
    }

    val tinker = Tinker

    object Tinker {
        private const val tinker_version = "1.9.14.18"
        const val tinker_lib = "com.tencent.tinker:tinker-android-lib:$tinker_version"
        const val tinker_loader = "com.tencent.tinker:tinker-android-loader:$tinker_version"
        const val tinker_ano = "com.tencent.tinker:tinker-android-anno:$tinker_version"
        const val tinker_ano_support =
            "com.tencent.tinker:tinker-android-anno-support:$tinker_version"
    }

    val leakcanary = Leakcanary

    object Leakcanary {
        private const val leakcanary_version = "1.6.2"
        const val leakcanary_a = "com.squareup.leakcanary:leakcanary-android:$leakcanary_version"
        const val leakcanary_a_n_o =
            "com.squareup.leakcanary:leakcanary-android-no-op:$leakcanary_version"
        const val leakcanary_s_f =
            "com.squareup.leakcanary:leakcanary-support-fragment:$leakcanary_version"

    }

    val glide = Glide

    object Glide {
        private const val glide_version = "1.6.2"
        const val glide = "com.github.bumptech.glide:glide:$glide_version"
    }
}