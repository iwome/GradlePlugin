package com.bbq.lintplugin.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

public class LintTask extends DefaultTask{
    @TaskAction
    void task() {
        System.out.println("========================== lintPluginTestTask running ==========================")
    }
}