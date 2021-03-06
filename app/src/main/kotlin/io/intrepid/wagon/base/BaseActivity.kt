package io.intrepid.wagon.base

import android.content.Intent
import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.v7.app.AppCompatActivity
import butterknife.ButterKnife
import io.intrepid.wagon.WagonApplication
import timber.log.Timber

abstract class BaseActivity : AppCompatActivity() {

    protected abstract val layoutResourceId: Int
    protected val wagonApplication: WagonApplication
        get() = application as WagonApplication

    override fun onCreate(savedInstanceState: Bundle?) {
        Timber.v("Lifecycle onCreate: $this")
        super.onCreate(savedInstanceState)

        setContentView(layoutResourceId)
        ButterKnife.bind(this)
    }

    @CallSuper
    override fun onNewIntent(intent: Intent?) {
        Timber.v("Lifecycle onNewIntent: $this")
        super.onNewIntent(intent)
    }

    @CallSuper
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Timber.v("Lifecycle onActivityResult: $this")
        super.onActivityResult(requestCode, resultCode, data)
    }

    @CallSuper
    override fun onStart() {
        Timber.v("Lifecycle onStart: $this")
        super.onStart()
    }

    @CallSuper
    override fun onResume() {
        Timber.v("Lifecycle onResume: $this")
        super.onResume()
    }

    @CallSuper
    override fun onPause() {
        Timber.v("Lifecycle onPause: $this")
        super.onPause()
    }

    @CallSuper
    override fun onStop() {
        Timber.v("Lifecycle onStop: $this")
        super.onStop()
    }

    @CallSuper
    override fun onDestroy() {
        Timber.v("Lifecycle onDestroy: $this")
        super.onDestroy()
    }
}
