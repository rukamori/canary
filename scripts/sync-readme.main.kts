#!/usr/bin/env kotlin

import java.io.File
import kotlin.system.exitProcess

fun main() {
    try {
        val tempReadme = File("temp/README.md")
        val readme = File("README.md")
        
        if (!tempReadme.exists()) {
            System.err.println("Error: temp/README.md not found")
            exitProcess(1)
        }
        
        tempReadme.copyTo(readme, overwrite = true)
        println("Copied temp/README.md to README.md")
        println("Synchronization complete!")
    } catch (e: Exception) {
        System.err.println("Error: ${e.message}")
        e.printStackTrace()
        exitProcess(1)
    }
}

main()
