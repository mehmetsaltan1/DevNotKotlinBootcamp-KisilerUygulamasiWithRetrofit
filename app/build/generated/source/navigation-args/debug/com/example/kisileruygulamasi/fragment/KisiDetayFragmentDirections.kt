package com.example.kisileruygulamasi.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.kisileruygulamasi.R

public class KisiDetayFragmentDirections private constructor() {
  public companion object {
    public fun actionKisiDetayFragmentToAnasayfaFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_kisiDetayFragment_to_anasayfaFragment)
  }
}
