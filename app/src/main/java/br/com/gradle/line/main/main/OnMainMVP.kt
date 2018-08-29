package br.com.gradle.line.main.main

import android.content.Context
import br.com.gradle.line.main.OnGenericMVP

/**
 * Created by Enzo Teles on 30,July,2018
 * Barueri - SP
 * email: enzo.carvalho.teles@gmail.com
 * Software Developer Sr.
 */

interface OnMainMVP{

    interface View: OnGenericMVP.View{
        fun Context.toast(msg:String)
        fun startActivity()
    }
    interface Presenter<V, I> : OnGenericMVP.Presenter<OnMainMVP.View,OnMainMVP.Interactor> {
        fun Context.error(msg:String)
        fun callbackInteractor(msg: String)
        fun getView(): V
        fun getInteractor(): I
        fun callView()
    }

    interface Interactor : OnGenericMVP.Interactor {
        fun loadApi(mPresenter: MainPresenter<OnMainMVP.View, OnMainMVP.Interactor>)
    }

}