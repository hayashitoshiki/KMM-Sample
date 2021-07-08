package com.example.kmmsampleandroid

import android.app.Application
import android.util.Log
import com.example.data.repository.HumanRepositoryImp
import com.example.kmmsampleandroid.ui.dashboard.DashboardViewModel
import com.example.kmmsharedmodule.repository.LocalHumanRepository
import com.example.kmmsharedmodule.usecase.HumanUseCase
import com.example.kmmsharedmodule.usecase.HumanUseCaseImp
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

class MyApplication: Application() {

    companion object {
        const val TAG = "MyApplication"
    }
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate")

        startKoin {
            androidContext(applicationContext)
            modules(module)
        }

    }

    // Koinモジュール
    private val module: Module = module {
        // viewModel
        viewModel { DashboardViewModel(get()) }

        // useCase
        factory<HumanUseCase> { HumanUseCaseImp(get()) }

        // repository
        factory<LocalHumanRepository> { HumanRepositoryImp() }
    }
}