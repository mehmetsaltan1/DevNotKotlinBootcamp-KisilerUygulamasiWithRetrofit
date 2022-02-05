package com.example.kisileruygulamasi.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.kisileruygulamasi.R

public class KisiKayitFragmentDirections private constructor() {
  public companion object {
    public fun actionKisiKayitFragmentToAnasayfaFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_kisiKayitFragment_to_anasayfaFragment)
  }
}
