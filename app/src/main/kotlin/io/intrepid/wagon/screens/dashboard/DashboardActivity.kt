package io.intrepid.wagon.screens.dashboard

import io.intrepid.wagon.R
import io.intrepid.wagon.base.BaseMvpActivity
import io.intrepid.wagon.base.PresenterConfiguration

class DashboardActivity : BaseMvpActivity<DashboardContract.Presenter>(), DashboardContract.View {

    override val layoutResourceId: Int = R.layout.activity_dashboard

    override fun createPresenter(configuration: PresenterConfiguration): DashboardContract.Presenter {
        return DashboardPresenter(this, configuration)
    }
}
