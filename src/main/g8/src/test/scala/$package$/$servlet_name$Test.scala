package $package$

import org.scalatra.test.scalatest._
import org.scalatest.FunSuite

class $servlet_name$Test extends ScalatraFunSuite {

  addServlet(classOf[$servlet_name$], "/*")

  test("simple get") {
    get("/hello-scalate") {
      status should equal(200)
      body should include("Welcome to Scalatra")
      body should include("Hello")
    }
  }

  test("helloWorld") {
    assert(1 == 1)
  }

}
