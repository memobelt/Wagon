package io.intrepid.wagon.screens.dashboard

import io.intrepid.wagon.base.BasePresenter
import io.intrepid.wagon.base.PresenterConfiguration

internal class DashboardPresenter(view: DashboardContract.View, configuration: PresenterConfiguration)
        : BasePresenter<DashboardContract.View>(view, configuration), DashboardContract.Presenter {
        }
