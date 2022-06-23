package org.sdase.submission.documentscanner

import org.junit.Assert.assertEquals
import org.junit.Test
import org.sdase.submission.documentscanner.constants.ResponseType

/** Unit test to make sure ResponseType constants are the right value */
class ResponseTypeUnitTest {
  @Test
  fun constantValue_isCorrect() {
    assertEquals(ResponseType.BASE64, "base64")
  }
}
