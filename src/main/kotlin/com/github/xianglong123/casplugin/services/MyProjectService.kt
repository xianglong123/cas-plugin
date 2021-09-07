package com.github.xianglong123.casplugin.services

import com.github.xianglong123.casplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
