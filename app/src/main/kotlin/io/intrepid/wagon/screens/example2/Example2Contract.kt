package io.intrepid.wagon.screens.example2

import io.intrepid.wagon.base.BaseContract

interface Example2Contract {
    interface View : BaseContract.View {

        fun showCurrentIpAddress(ip: String)

        fun showPreviousIpAddress(ip: String)

        fun hidePreviousIpAddress()
    }

    interface Presenter : BaseContract.Presenter {

    }
}
