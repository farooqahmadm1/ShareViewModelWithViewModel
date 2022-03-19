package co.farooq.viewmodelnheritance.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class BaseViewModel : ViewModel(){

    val _textTest : MutableLiveData<String> = MutableLiveData<String>("fds")
    val textTest: LiveData<String> = _textTest

}