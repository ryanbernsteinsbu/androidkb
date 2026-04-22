package com.example.customkeyboard

import android.inputmethodservice.InputMethodService
import android.inputmethodservice.KeyboardView
import android.view.View

class CustomKeyboardApp: InputMethodService(), KeyboardView.OnKeyboardActionListener {

    override fun onCreateInputView(): View? {
        return super.onCreateInputView()
    }

    override fun onKey(primaryCode: Int, keyCodes: IntArray?) {
        TODO("Not yet implemented")
    }

    override fun onPress(primaryCode: Int) {
        TODO("Not yet implemented")
    }

    override fun onRelease(primaryCode: Int) {
        TODO("Not yet implemented")
    }

    override fun onText(text: CharSequence?) {
        TODO("Not yet implemented")
    }

    override fun swipeDown() {
        TODO("Not yet implemented")
    }

    override fun swipeLeft() {
        TODO("Not yet implemented")
    }

    override fun swipeRight() {
        TODO("Not yet implemented")
    }

    override fun swipeUp() {
        TODO("Not yet implemented")
    }

}