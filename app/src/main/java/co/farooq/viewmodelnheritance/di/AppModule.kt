package co.farooq.viewmodelnheritance.di

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import co.farooq.viewmodelnheritance.ui.BaseViewModel
import co.farooq.viewmodelnheritance.ui.home.HomeViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideContext(@ApplicationContext context: Context)  : Context{
        return  context
    }

    @Singleton
    @Provides
    fun providesBaseViewModel() : BaseViewModel {
        return BaseViewModel()
    }
}

