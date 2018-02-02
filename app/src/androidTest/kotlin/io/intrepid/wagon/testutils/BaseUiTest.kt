package io.intrepid.wagon.testutils

import io.intrepid.wagon.InstrumentationTestApplication
import org.junit.After
import org.junit.Rule
import org.mockito.junit.MockitoJUnit

abstract class BaseUiTest {
    @Rule
    @JvmField
    val mockitoRule = MockitoJUnit.rule()

    @After
    fun tearDown() {
        InstrumentationTestApplication.clearRestApiOverride()
        InstrumentationTestApplication.clearUserSettingsOverride()
    }
}
