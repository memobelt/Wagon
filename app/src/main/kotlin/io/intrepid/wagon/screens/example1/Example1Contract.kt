package io.intrepid.wagon.screens.example1

import io.intrepid.wagon.base.BaseContract

interface Example1Contract {
    interface View : BaseContract.View {

        fun gotoExample2()
    }

    interface Presenter : BaseContract.Presenter {

        fun onButtonClick()
    }
}
