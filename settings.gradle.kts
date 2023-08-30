import java.io.FileFilter

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

val ignoreDirectories = listOf("gradle", ".gradle", "build", ".idea")
val lessonDirectoryFilter = FileFilter { file -> file.isDirectory && !ignoreDirectories.contains(file.name) }
val taskDirectoryFilter = FileFilter { file -> file.isDirectory }

rootProject.name = "learn-kotlin-by-example"
rootProject.projectDir.listFiles(lessonDirectoryFilter)?.forEach { lessonDir ->
    val lessonName = lessonDir.name.sanitize()
    lessonDir.listFiles(taskDirectoryFilter)?.forEach { taskDir ->
        if (taskDir.isDirectory && taskDir.resolve("src").isDirectory) {
            val taskName = taskDir.name.sanitize()
            val moduleName = "${lessonName}-${taskName}".lowercase()

            include(moduleName)
            project(":$moduleName").projectDir = taskDir
        }
    }
}

include("support")

fun String.sanitize() = this
    .replace(".", "")
    .replace(Regex("(^[.]+)|([.]+\$)"), "")
    .replace(Regex("[ /\\\\:<>\"?*|()]"), "_")
    .trim()
