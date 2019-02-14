package org.sample

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction


class GenerateModelTask extends DefaultTask {

  @TaskAction
  def generate(): Unit = {
    println("Tu generuję")
  }
}