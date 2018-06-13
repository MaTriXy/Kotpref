package com.chibatching.kotprefsample.preferencefragment

import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat
import com.chibatching.kotprefsample.R


class PreferenceFragmentSampleFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        preferenceManager.sharedPreferencesName = AppSettings.kotprefName
        setPreferencesFromResource(R.xml.pref_sample, rootKey)
    }
}
