package io.intrepid.wagon.base

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import io.intrepid.wagon.R

/**
 * Base class for activities whose sole purpose to to host a fragment. Child classes simply need
 * to override [.createFragment] and create the appropriate Fragment. If the activity
 * contains any additional logic, use [BaseMvpActivity] instead
 */
abstract class BaseFragmentActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
