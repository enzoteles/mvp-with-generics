package br.com.gradle.line.main.home

/**
 * Created by Enzo Teles on 30,July,2018
 * Barueri - SP
 * email: enzo.carvalho.teles@gmail.com
 * Software Developer Sr.
 */

class HomeInteractor: OnHomeMVP.Interactor{

    override fun loadApiRest(callback: HomePresenter<OnHomeMVP.View, OnHomeMVP.Interactor>) {
        callback.loadList("carregando a lista...")
    }
}