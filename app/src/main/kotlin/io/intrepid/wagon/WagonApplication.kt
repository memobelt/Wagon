package io.intrepid.wagon

import android.app.Application
import com.squareup.leakcanary.LeakCanary
import io.intrepid.wagon.base.PresenterConfiguration
import io.intrepid.wagon.logging.CrashlyticsReporter
import io.intrepid.wagon.logging.TimberConfig
import io.intrepid.wagon.rest.RetrofitClient
import io.intrepid.wagon.settings.SharedPreferencesManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

open class WagonApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        setupLeakCanary()

        CrashlyticsReporter.init(this)

        TimberConfig.init(CrashlyticsReporter)
    }

    protected open fun setupLeakCanary() {
        LeakCanary.install(this)
    }

    open fun getPresenterConfiguration(): PresenterConfiguration {
        return PresenterConfiguration(
                Schedulers.io(),
                AndroidSchedulers.mainThread(),
                SharedPreferencesManager.getInstance(this),
                RetrofitClient.restApi,
                CrashlyticsReporter
        )
    }
}
