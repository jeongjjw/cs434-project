import org.scalatest.funsuite.AnyFunSuite

import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MainSuite extends AnyFunSuite {
    test("Root project test") {
        assert(1 == 1)
    }
}