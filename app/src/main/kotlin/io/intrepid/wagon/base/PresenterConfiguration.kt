package io.intrepid.wagon.base

import io.intrepid.wagon.logging.CrashReporter
import io.intrepid.wagon.rest.RestApi
import io.intrepid.wagon.settings.UserSettings
import io.reactivex.Scheduler

/**
 * Wrapper class for common dependencies that all presenters are expected to have
 */
open class PresenterConfiguration(open val ioScheduler: Scheduler,
                                  open val uiScheduler: Scheduler,
                                  val userSettings: UserSettings,
                                  val restApi: RestApi,
                                  val crashReporter: CrashReporter)
