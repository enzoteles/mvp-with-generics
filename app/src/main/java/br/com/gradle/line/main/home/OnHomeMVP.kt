package br.com.gradle.line.main.home

import br.com.gradle.line.main.OnGenericMVP

/**
 * Created by Enzo Teles on 30,July,2018
 * Barueri - SP
 * email: enzo.carvalho.teles@gmail.com
 * Software Developer Sr.
 */
interface OnHomeMVP{
    interface View: OnGenericMVP.View{
        fun loadList(msg: String)
    }
    interface Presenter<V, I>:OnGenericMVP.Presenter<OnHomeMVP.View, OnHomeMVP.Interactor>{
        fun getView(): V
        fun getInteractor():I
        fun loadList(msg: String)
    }
    interface Interactor:OnGenericMVP.Interactor{
        fun loadApiRest(callback: HomePresenter<OnHomeMVP.View, OnHomeMVP.Interactor>)
    }
}
