package br.com.gradle.line.main.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import br.com.gradle.line.R
import br.com.gradle.line.main.home.HomeActivity

class MainActivity : AppCompatActivity(), OnMainMVP.View {

    //variable
    lateinit var presenter: MainPresenter<OnMainMVP.View, OnMainMVP.Interactor>
    lateinit var interactor: OnMainMVP.Interactor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initInjection()
        initDate()
        toast("ISSO AE ENZO TELES")
    }
    override fun initView(){
        presenter = MainPresenter()
        presenter.initView(this, baseContext)
    }

    override fun initInjection() {
        /*init módule dagger or koin*/
    }

    override fun initDate() {
        interactor = MainInteractor()
        presenter.initInteractor(interactor)
    }

    override fun Context.toast(msg:String) {
        Toast.makeText(baseContext, msg, Toast.LENGTH_SHORT).show()
    }

    override fun startActivity() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}
