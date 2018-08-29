package br.com.gradle.line.main.main

import android.content.Context
import android.widget.Toast

/**
 * Created by Enzo Teles on 30,July,2018
 * Barueri - SP
 * email: enzo.carvalho.teles@gmail.com
 * Software Developer Sr.
 */

class MainPresenter<V: OnMainMVP.View, I:OnMainMVP.Interactor>: OnMainMVP.Presenter<V,I>{

    lateinit var mView: OnMainMVP.View
    lateinit var mInteractor: OnMainMVP.Interactor
    lateinit var baseContext: Context



    override fun initView(mView: OnMainMVP.View, baseContext: Context) {
        this.mView = mView
        this.baseContext = baseContext
    }

    override fun initInteractor(mInteractor: OnMainMVP.Interactor) {
        this.mInteractor = mInteractor
        getInteractor().loadApi(this as MainPresenter<OnMainMVP.View, OnMainMVP.Interactor>)

    }

    override fun callbackInteractor(msg: String) {
        error(msg)
    }

    override fun Context.error(msg: String) {
        Toast.makeText(baseContext, msg, Toast.LENGTH_SHORT).show()
    }

    override fun getView(): V {
        return mView as V
    }

    override fun getInteractor(): I {
        return mInteractor as I
    }

    //log commit
    override fun callView() {
        getView().startActivity()
    }
}