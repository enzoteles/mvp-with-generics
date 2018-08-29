package br.com.gradle.line.main.home

import android.content.Context
import br.com.gradle.line.main.OnGenericMVP

/**
 * Created by Enzo Teles on 30,July,2018
 * Barueri - SP
 * email: enzo.carvalho.teles@gmail.com
 * Software Developer Sr.
 */

class HomePresenter<V:OnHomeMVP.View, I:OnHomeMVP.Interactor>: OnHomeMVP.Presenter<V, I>{

    lateinit var mView: OnHomeMVP.View
    lateinit var mInteractor: OnHomeMVP.Interactor
    lateinit var baseContext: Context

    override fun initView(mView: OnHomeMVP.View, baseContext: Context) {
        this.mView = mView
        this.baseContext = baseContext
    }

    override fun initInteractor(mInteractor: OnHomeMVP.Interactor) {
        this.mInteractor = mInteractor
        getInteractor().loadApiRest(this as HomePresenter<OnHomeMVP.View, OnHomeMVP.Interactor>)
    }

    override fun getView(): V {
        return mView as V
    }

    override fun getInteractor(): I {
        return mInteractor as I
    }

    override fun loadList(msg: String) {
        getView().loadList(msg)
    }

}