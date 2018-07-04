import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class SimpleSpec : Spek({
    given("simple test") {
        it("should succeed") {
            assertEquals(1, 1)
        }

        it("shouldn't succeed") {
            assertEquals(0, 1)
        }
    }
})
