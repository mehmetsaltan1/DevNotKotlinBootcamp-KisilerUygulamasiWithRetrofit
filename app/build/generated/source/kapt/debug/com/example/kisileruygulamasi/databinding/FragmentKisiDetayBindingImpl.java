package com.example.kisileruygulamasi.databinding;
import com.example.kisileruygulamasi.R;
import com.example.kisileruygulamasi.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentKisiDetayBindingImpl extends FragmentKisiDetayBinding implements com.example.kisileruygulamasi.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textInputLayout3, 5);
        sViewsWithIds.put(R.id.textInputLayout4, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentKisiDetayBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentKisiDetayBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            );
        this.buttonGuncelle.setTag(null);
        this.editTextKisiAd.setTag(null);
        this.editTextKisiTel.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.toolbarKisiDetay.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.kisileruygulamasi.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.kisiDetayToolbarBaslik == variableId) {
            setKisiDetayToolbarBaslik((java.lang.String) variable);
        }
        else if (BR.kisiNesnesi == variableId) {
            setKisiNesnesi((com.example.kisileruygulamasi.entity.Kisiler) variable);
        }
        else if (BR.kisiDetayFragment == variableId) {
            setKisiDetayFragment((com.example.kisileruygulamasi.fragment.KisiDetayFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setKisiDetayToolbarBaslik(@Nullable java.lang.String KisiDetayToolbarBaslik) {
        this.mKisiDetayToolbarBaslik = KisiDetayToolbarBaslik;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.kisiDetayToolbarBaslik);
        super.requestRebind();
    }
    public void setKisiNesnesi(@Nullable com.example.kisileruygulamasi.entity.Kisiler KisiNesnesi) {
        this.mKisiNesnesi = KisiNesnesi;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.kisiNesnesi);
        super.requestRebind();
    }
    public void setKisiDetayFragment(@Nullable com.example.kisileruygulamasi.fragment.KisiDetayFragment KisiDetayFragment) {
        this.mKisiDetayFragment = KisiDetayFragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.kisiDetayFragment);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String kisiDetayToolbarBaslik = mKisiDetayToolbarBaslik;
        com.example.kisileruygulamasi.entity.Kisiler kisiNesnesi = mKisiNesnesi;
        java.lang.String kisiNesnesiKisiAd = null;
        java.lang.String kisiNesnesiKisiTel = null;
        com.example.kisileruygulamasi.fragment.KisiDetayFragment kisiDetayFragment = mKisiDetayFragment;

        if ((dirtyFlags & 0x9L) != 0) {
        }
        if ((dirtyFlags & 0xaL) != 0) {



                if (kisiNesnesi != null) {
                    // read kisiNesnesi.kisi_ad
                    kisiNesnesiKisiAd = kisiNesnesi.getKisi_ad();
                    // read kisiNesnesi.kisi_tel
                    kisiNesnesiKisiTel = kisiNesnesi.getKisi_tel();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.buttonGuncelle.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextKisiAd, kisiNesnesiKisiAd);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextKisiTel, kisiNesnesiKisiTel);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.toolbarKisiDetay.setTitle(kisiDetayToolbarBaslik);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // kisiNesnesi
        com.example.kisileruygulamasi.entity.Kisiler kisiNesnesi = mKisiNesnesi;
        // kisiNesnesi != null
        boolean kisiNesnesiJavaLangObjectNull = false;
        // kisiDetayFragment != null
        boolean kisiDetayFragmentJavaLangObjectNull = false;
        // kisiNesnesi.kisi_id
        int kisiNesnesiKisiId = 0;
        // kisiDetayFragment
        com.example.kisileruygulamasi.fragment.KisiDetayFragment kisiDetayFragment = mKisiDetayFragment;



        kisiDetayFragmentJavaLangObjectNull = (kisiDetayFragment) != (null);
        if (kisiDetayFragmentJavaLangObjectNull) {



            kisiNesnesiJavaLangObjectNull = (kisiNesnesi) != (null);
            if (kisiNesnesiJavaLangObjectNull) {


                kisiNesnesiKisiId = kisiNesnesi.getKisi_id();

                if ((editTextKisiAd) != (null)) {


                    editTextKisiAd.getText();
                    if ((editTextKisiAd.getText()) != (null)) {


                        editTextKisiAd.getText().toString();

                        if ((editTextKisiTel) != (null)) {


                            editTextKisiTel.getText();
                            if ((editTextKisiTel.getText()) != (null)) {


                                editTextKisiTel.getText().toString();

                                kisiDetayFragment.buttonGuncelleTikla(kisiNesnesiKisiId, editTextKisiAd.getText().toString(), editTextKisiTel.getText().toString());
                            }
                        }
                    }
                }
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): kisiDetayToolbarBaslik
        flag 1 (0x2L): kisiNesnesi
        flag 2 (0x3L): kisiDetayFragment
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}