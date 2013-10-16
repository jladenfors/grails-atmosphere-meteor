def atmosphereMeteorResourcesFile = new File(basedir, "grails-app/conf/AtmosphereMeteorConfig.groovy")


if (!atmosphereMeteorResourcesFile?.exists()) {
    println """
***********************************************************
* You have installed the atmosphere-meteor plugin.        *
*                                                         *
* Documentation:                                          *
* https://github.com/kensiprell/grails-atmosphere-meteor  *
*                                                         *
* To active the plugin please run                         *
* grails installAtmosphere                                *
*                                                         *
* Next steps:                                             *
* grails create-meteor-handler com.example.Default        *
* grails create-meteor-servlet com.example.Default        *
* Edit grails-app/conf/AtmosphereMeteorConfig.groovy      *
* Create controller, view, JavaScript client, etc.        *
*                                                         *
***********************************************************
"""
}

