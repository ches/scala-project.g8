package $package$

import org.scalatest._

abstract class UnitSpec extends FunSpec with Matchers with OptionValues

class $name;format="Camel"$Spec extends UnitSpec {
  describe("$name$") {
    it("should do awesome stuff") {
      pending
    }
  }
}

