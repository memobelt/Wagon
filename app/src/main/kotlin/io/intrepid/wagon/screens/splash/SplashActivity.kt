package io.intrepid.wagon.screens.splash

import io.intrepid.wagon.R
import io.intrepid.wagon.base.BaseMvpActivity
import io.intrepid.wagon.base.PresenterConfiguration

class SplashActivity : BaseMvpActivity<SplashContract.Presenter>(), SplashContract.View {

    override val layoutResourceId: Int = R.layout.activity_splash

    override fun createPresenter(configuration: PresenterConfiguration): SplashContract.Presenter {
        return SplashPresenter(this, configuration)
    }
}
