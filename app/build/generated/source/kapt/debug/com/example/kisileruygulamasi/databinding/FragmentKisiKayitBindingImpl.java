package com.example.kisileruygulamasi.databinding;
import com.example.kisileruygulamasi.R;
import com.example.kisileruygulamasi.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentKisiKayitBindingImpl extends FragmentKisiKayitBinding implements com.example.kisileruygulamasi.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textInputLayout, 3);
        sViewsWithIds.put(R.id.editTextKisiAd, 4);
        sViewsWithIds.put(R.id.textInputLayout2, 5);
        sViewsWithIds.put(R.id.editTextKisiTel, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentKisiKayitBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentKisiKayitBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            );
        this.buttonKaydet.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.toolbarKisiKayit.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.kisileruygulamasi.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.kisiKayitFragment == variableId) {
            setKisiKayitFragment((com.example.kisileruygulamasi.fragment.KisiKayitFragment) variable);
        }
        else if (BR.kisiKayitToolbarBaslik == variableId) {
            setKisiKayitToolbarBaslik((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setKisiKayitFragment(@Nullable com.example.kisileruygulamasi.fragment.KisiKayitFragment KisiKayitFragment) {
        this.mKisiKayitFragment = KisiKayitFragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.kisiKayitFragment);
        super.requestRebind();
    }
    public void setKisiKayitToolbarBaslik(@Nullable java.lang.String KisiKayitToolbarBaslik) {
        this.mKisiKayitToolbarBaslik = KisiKayitToolbarBaslik;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.kisiKayitToolbarBaslik);
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
        com.example.kisileruygulamasi.fragment.KisiKayitFragment kisiKayitFragment = mKisiKayitFragment;
        java.lang.String kisiKayitToolbarBaslik = mKisiKayitToolbarBaslik;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.buttonKaydet.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.toolbarKisiKayit.setTitle(kisiKayitToolbarBaslik);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // kisiKayitFragment
        com.example.kisileruygulamasi.fragment.KisiKayitFragment kisiKayitFragment = mKisiKayitFragment;
        // kisiKayitFragment != null
        boolean kisiKayitFragmentJavaLangObjectNull = false;



        kisiKayitFragmentJavaLangObjectNull = (kisiKayitFragment) != (null);
        if (kisiKayitFragmentJavaLangObjectNull) {


            if ((editTextKisiAd) != (null)) {


                editTextKisiAd.getText();
                if ((editTextKisiAd.getText()) != (null)) {


                    editTextKisiAd.getText().toString();

                    if ((editTextKisiTel) != (null)) {


                        editTextKisiTel.getText();
                        if ((editTextKisiTel.getText()) != (null)) {


                            editTextKisiTel.getText().toString();

                            kisiKayitFragment.buttonKaydetTikla(editTextKisiAd.getText().toString(), editTextKisiTel.getText().toString());
                        }
                    }
                }
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): kisiKayitFragment
        flag 1 (0x2L): kisiKayitToolbarBaslik
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}