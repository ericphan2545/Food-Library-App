plugins {
    alias(libs.plugins.android.application)
}

android {
<<<<<<< HEAD
    namespace = "com.midterm.foodlib"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.midterm.foodlib"
        minSdk = 21
=======
    namespace = "com.finalterm.foodlibraryapp"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.finalterm.foodlibraryapp"
        minSdk = 29
>>>>>>> c2d9576345dfb6b6ba00a79d8773b6da849960b4
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}