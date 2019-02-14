package org.sample

import org.gradle.api.{Plugin, Project}


class GenerateModelPlugin extends Plugin[Project] {
  override def apply(project: Project): Unit = project.getTasks.create("generateModel", classOf[GenerateModelTask])
} 