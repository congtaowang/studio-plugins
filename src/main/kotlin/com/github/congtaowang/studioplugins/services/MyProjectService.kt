package com.github.congtaowang.studioplugins.services

import com.intellij.openapi.project.Project
import com.github.congtaowang.studioplugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
