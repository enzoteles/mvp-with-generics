package br.com.gradle.line.main.main

import android.os.Handler
import br.com.gradle.line.main.OnGenericMVP

/**
 * Created by Enzo Teles on 30,July,2018
 * Barueri - SP
 * email: enzo.carvalho.teles@gmail.com
 * Software Developer Sr.
 */

class MainInteractor: OnMainMVP.Interactor{


    override fun loadApi(mPresenter: MainPresenter<OnMainMVP.View, OnMainMVP.Interactor>) {
        Handler().postDelayed({
            mPresenter.callView()
        }, 1000)
    }


}