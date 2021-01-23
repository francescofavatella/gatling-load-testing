package sample

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import java.net.InetAddress

class SampleService extends Simulation {

    val httpProtocol = http.baseUrl("http://spring-app:8080").acceptHeader("*/*")

    val myaddress = InetAddress.getLocalHost.toString

    val scn = scenario("Sample Service Root").exec(http(myaddress).get("/"))

    setUp(
        scn.inject(
            nothingFor(5 seconds),
            constantUsersPerSec(150) during(10.seconds)
        )
    ).protocols(httpProtocol)
}