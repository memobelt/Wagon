package io.intrepid.wagon.screens.splash

import io.intrepid.wagon.base.BasePresenter
import io.intrepid.wagon.base.PresenterConfiguration

internal class SplashPresenter(view: SplashContract.View, configuration: PresenterConfiguration)
    : BasePresenter<SplashContract.View>(view, configuration), SplashContract.Presenter {
}
