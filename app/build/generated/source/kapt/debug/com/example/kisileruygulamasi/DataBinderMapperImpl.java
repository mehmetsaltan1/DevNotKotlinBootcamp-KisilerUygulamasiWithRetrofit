package com.example.kisileruygulamasi;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.kisileruygulamasi.databinding.CardTasarimBindingImpl;
import com.example.kisileruygulamasi.databinding.FragmentAnasayfaBindingImpl;
import com.example.kisileruygulamasi.databinding.FragmentKisiDetayBindingImpl;
import com.example.kisileruygulamasi.databinding.FragmentKisiKayitBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_CARDTASARIM = 1;

  private static final int LAYOUT_FRAGMENTANASAYFA = 2;

  private static final int LAYOUT_FRAGMENTKISIDETAY = 3;

  private static final int LAYOUT_FRAGMENTKISIKAYIT = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.kisileruygulamasi.R.layout.card_tasarim, LAYOUT_CARDTASARIM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.kisileruygulamasi.R.layout.fragment_anasayfa, LAYOUT_FRAGMENTANASAYFA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.kisileruygulamasi.R.layout.fragment_kisi_detay, LAYOUT_FRAGMENTKISIDETAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.kisileruygulamasi.R.layout.fragment_kisi_kayit, LAYOUT_FRAGMENTKISIKAYIT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_CARDTASARIM: {
          if ("layout/card_tasarim_0".equals(tag)) {
            return new CardTasarimBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for card_tasarim is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTANASAYFA: {
          if ("layout/fragment_anasayfa_0".equals(tag)) {
            return new FragmentAnasayfaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_anasayfa is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTKISIDETAY: {
          if ("layout/fragment_kisi_detay_0".equals(tag)) {
            return new FragmentKisiDetayBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_kisi_detay is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTKISIKAYIT: {
          if ("layout/fragment_kisi_kayit_0".equals(tag)) {
            return new FragmentKisiKayitBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_kisi_kayit is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(9);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "anasayfaFragment");
      sKeys.put(2, "anasayfaToolBarBaslik");
      sKeys.put(3, "kisiDetayFragment");
      sKeys.put(4, "kisiDetayToolbarBaslik");
      sKeys.put(5, "kisiKayitFragment");
      sKeys.put(6, "kisiKayitToolbarBaslik");
      sKeys.put(7, "kisiNesnesi");
      sKeys.put(8, "kisilerAdapter");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/card_tasarim_0", com.example.kisileruygulamasi.R.layout.card_tasarim);
      sKeys.put("layout/fragment_anasayfa_0", com.example.kisileruygulamasi.R.layout.fragment_anasayfa);
      sKeys.put("layout/fragment_kisi_detay_0", com.example.kisileruygulamasi.R.layout.fragment_kisi_detay);
      sKeys.put("layout/fragment_kisi_kayit_0", com.example.kisileruygulamasi.R.layout.fragment_kisi_kayit);
    }
  }
}
