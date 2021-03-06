includeTargets << grailsScript("_GrailsInit")

target(updateAtmosphereMeteorJavascript: "Update the atmosphere-meteor plugin Javascript files") {
	def dir = "${atmosphereMeteorPluginDir}/web-app/js"
	def javascriptUrl = "https://raw.github.com/Atmosphere/atmosphere-javascript/master/modules/javascript/src/main/webapp/javascript/atmosphere.js"
	def jqueryUrl = "https://raw.github.com/Atmosphere/atmosphere-javascript/master/modules/jquery/src/main/webapp/jquery/jquery.atmosphere.js"

	//ant.get(usetimestamp: true, src: javascriptUrl, dest: dir)
	//ant.get(usetimestamp: true, src: jqueryUrl, dest: dir)
	ant.get(src: javascriptUrl, dest: dir)
	ant.get(src: jqueryUrl, dest: dir)

	println "Updated the atmosphere-meteor plugin Javascript files"
}

setDefaultTarget(updateAtmosphereMeteorJavascript)

