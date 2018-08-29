package br.com.gradle.line.main

import android.content.Context
import br.com.gradle.line.main.home.HomePresenter
import br.com.gradle.line.main.home.OnHomeMVP

/**
 * Created by Enzo Teles on 30,July,2018
 * Barueri - SP
 * email: enzo.carvalho.teles@gmail.com
 * Software Developer Sr.
 */

interface OnGenericMVP{
    interface View{
        fun initView()
        fun initInjection()
        fun initDate()
    }
    interface Presenter<V: OnGenericMVP.View, I: OnGenericMVP.Interactor>{
        fun initView(view: V, baseContext: Context)
        fun initInteractor(interactor: I)
    }
    interface Interactor {
    }
}