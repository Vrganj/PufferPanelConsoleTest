plugins {
    id("java")
    id("de.eldoria.plugin-yml.bukkit") version "0.8.0"
}

group = "me.vrganj"
version = "1.0-SNAPSHOT"

repositories {
    maven {
        name = "papermc"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.10-R0.1-SNAPSHOT")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

bukkit {
    name = "PufferPanelConsoleTest"
    version = "1.0"
    description = "This is a test plugin for the PufferPanel console"

    main = "me.vrganj.pufferpanelconsoletest.PufferPanelConsoleTestPlugin"

    apiVersion = "1.21"
    author = "Vrganj"

    commands {
        register("pufferpanelconsoletest") {
            description = "This is a test command!"
        }
    }
}
