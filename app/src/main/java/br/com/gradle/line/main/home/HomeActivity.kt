package br.com.gradle.line.main.home

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import br.com.gradle.line.R

class HomeActivity : AppCompatActivity(), OnHomeMVP.View{

    lateinit var mPresenter: HomePresenter<OnHomeMVP.View, OnHomeMVP.Interactor>
    lateinit var mInteractor: OnHomeMVP.Interactor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initView()
        initInjection()
        initDate()
    }

    override fun initView() {
        mPresenter = HomePresenter()
        mPresenter.initView(this, baseContext)
    }

    override fun initInjection() {
        /** init injection */
    }

    override fun initDate() {
        mInteractor = HomeInteractor()
        mPresenter.initInteractor(mInteractor)
    }

    override fun loadList(msg: String) {
        Toast.makeText(baseContext, msg, Toast.LENGTH_SHORT).show()
    }



}
