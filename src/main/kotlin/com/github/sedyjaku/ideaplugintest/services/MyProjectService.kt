package com.github.sedyjaku.ideaplugintest.services

import com.github.sedyjaku.ideaplugintest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
