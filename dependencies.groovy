grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir	= "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits( "global" ) {
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
    }
    dependencies {
        compile('org.atmosphere:atmosphere-runtime:2.0.3') { // Modified by atmosphere-meteor plugin on Tue Oct 08 18:53:11 CEST 2013.
            excludes "slf4j-api"
        }
        compile 'org.codehaus.jackson:jackson-core-asl:1.9.13' // Modified by atmosphere-meteor plugin on Tue Oct 08 18:53:11 CEST 2013.
    }
    plugins{

    }
}
