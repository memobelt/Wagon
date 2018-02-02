package io.intrepid.wagon.screens.example1

import io.intrepid.wagon.base.BasePresenter
import io.intrepid.wagon.base.PresenterConfiguration

internal class Example1Presenter(view: Example1Contract.View, configuration: PresenterConfiguration)
    : BasePresenter<Example1Contract.View>(view, configuration), Example1Contract.Presenter {

    override fun onButtonClick() {
        view?.gotoExample2()
    }
}
