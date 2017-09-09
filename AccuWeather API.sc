val url = "http://apidev.accuweather.com/currentconditions/v1/258278.json?language=en&apikey=hoArfRosT1215"
val result = scala.io.Source.fromURL(url).mkString
println(result)
