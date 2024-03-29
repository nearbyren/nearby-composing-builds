package nearby.composing.builds

/**
 * @author:
 * @created on: 2022/3/4 13:36
 * @description:
 */
object AndroidX {
    const val percent = "androidx.percentlayout:percentlayout:1.0.0"
    const val support_annotations = "androidx.annotation:annotation:1.0.0"
    const val appcompat = "androidx.appcompat:appcompat:1.3.0-alpha01"
    const val support_compat = "androidx.core:core:1.0.0"
    const val recyclerView = "androidx.recyclerview:recyclerview:1.2.0-alpha03"
    const val coreKtx = "androidx.core:core-ktx:1.2.0"
    const val support_v13 = "androidx.legacy:legacy-support-v13:1.0.0"
    const val activityKtx = "androidx.activity:activity-ktx:1.2.0-alpha04"
    const val cardview = "androidx.cardview:cardview:1.0.0"
    const val multidex = "androidx.multidex:multidex:2.0.0"
    const val legacy = "androidx.legacy:legacy-support-v4:1.0.0"
    const val paging = "androidx.paging:paging-runtime-ktx:2.1.2"
    const val viewpager = "androidx.viewpager:viewpager:1.0.0"


    val fragment = Fragment

    object Fragment {
        private const val fragment_version = "1.3.0-alpha05"
        const val fragment = "androidx.fragment:fragment:$fragment_version"
        const val fragmentKtx = "androidx.fragment:fragment-ktx:$fragment_version"
        const val fragmentTesting = "androidx.fragment:fragment-testing:$fragment_version"
    }

    val lifecyle = Lifecycle

    object Lifecycle {
        private const val lifecycle_version = "2.2.0"
        const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
        const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
        const val viewModelSavedState =
            "androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version"
        const val commonJava8 = "androidx.lifecycle:lifecycle-common-java8:$lifecycle_version"
        const val service = "androidx.lifecycle:lifecycle-service:$lifecycle_version"
        const val lcy_ext = "androidx.lifecycle:lifecycle-extensions:$lifecycle_version"

    }


    val constraintlayout = Constraintlayout

    object Constraintlayout {
        private const val constraintlayout_version = "1.1.2"
        const val constraint_layout = "androidx.constraintlayout:constraintlayout:$constraintlayout_version"
        const val constraint_layoutSolver = "androidx.constraintlayout:constraintlayout-solver:$constraintlayout_version"

    }



    val navigation = Navigation

    object Navigation {
        private const val navigation_version = "2.1.0"
        const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$navigation_version"
        const val uiKtx = "androidx.navigation:navigation-ui-ktx:$navigation_version"
        const val kot_cor_and = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.7"
        const val kot_cor_cor = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7"
    }


    val room = Room

    object Room {
        private const val room_version = "2.2.5"
        const val roomRuntime = "androidx.room:room-runtime:$room_version"
        const val roomCompiler = "androidx.room:room-compiler:$room_version"
        const val roomKtx = "androidx.room:room-ktx:$room_version"
    }


    val camera = Camera

    object Camera {
        private const val camera_version = "1.0.0-beta06"
        const val camera_core = "androidx.camera:camera-core:$camera_version"
        const val camera_camera2 = "androidx.camera:camera-camera2:$camera_version"
        const val camera_lifecycle = "androidx.camera:camera-lifecycle:$camera_version"
        const val camera_view = "androidx.camera:camera-view:1.0.0-alpha13"
        const val camera_extensions = "androidx.camera:camera-extensions:1.0.0-alpha13"
    }
}