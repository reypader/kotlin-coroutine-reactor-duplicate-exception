import com.rmpader.bar
import com.rmpader.foo
import kotlinx.coroutines.reactor.awaitSingle
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Test

class Test {

    @Test
    fun `test foo`() = runTest {
        foo("Unit Test: foo")
    }

    @Test
    fun `test bar`() = runTest {
        bar("Unit Test: foo").awaitSingle()
    }
}