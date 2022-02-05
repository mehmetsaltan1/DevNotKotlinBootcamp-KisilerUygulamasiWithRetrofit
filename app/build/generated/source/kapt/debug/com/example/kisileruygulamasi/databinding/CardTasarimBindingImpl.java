package com.example.kisileruygulamasi.databinding;
import com.example.kisileruygulamasi.R;
import com.example.kisileruygulamasi.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CardTasarimBindingImpl extends CardTasarimBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.satir_card, 2);
        sViewsWithIds.put(R.id.imageViewSilResim, 3);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CardTasarimBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private CardTasarimBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[3]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewKisiBilgi.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.kisiNesnesi == variableId) {
            setKisiNesnesi((com.example.kisileruygulamasi.entity.Kisiler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setKisiNesnesi(@Nullable com.example.kisileruygulamasi.entity.Kisiler KisiNesnesi) {
        this.mKisiNesnesi = KisiNesnesi;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.kisiNesnesi);
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
        java.lang.String kisiNesnesiKisiTel = null;
        java.lang.String kisiNesnesiKisiAdJavaLangStringKisiNesnesiKisiTel = null;
        com.example.kisileruygulamasi.entity.Kisiler kisiNesnesi = mKisiNesnesi;
        java.lang.String kisiNesnesiKisiAdJavaLangString = null;
        java.lang.String kisiNesnesiKisiAd = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (kisiNesnesi != null) {
                    // read kisiNesnesi.kisi_tel
                    kisiNesnesiKisiTel = kisiNesnesi.getKisi_tel();
                    // read kisiNesnesi.kisi_ad
                    kisiNesnesiKisiAd = kisiNesnesi.getKisi_ad();
                }


                // read (kisiNesnesi.kisi_ad) + ("-")
                kisiNesnesiKisiAdJavaLangString = (kisiNesnesiKisiAd) + ("-");


                // read ((kisiNesnesi.kisi_ad) + ("-")) + (kisiNesnesi.kisi_tel)
                kisiNesnesiKisiAdJavaLangStringKisiNesnesiKisiTel = (kisiNesnesiKisiAdJavaLangString) + (kisiNesnesiKisiTel);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewKisiBilgi, kisiNesnesiKisiAdJavaLangStringKisiNesnesiKisiTel);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): kisiNesnesi
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}