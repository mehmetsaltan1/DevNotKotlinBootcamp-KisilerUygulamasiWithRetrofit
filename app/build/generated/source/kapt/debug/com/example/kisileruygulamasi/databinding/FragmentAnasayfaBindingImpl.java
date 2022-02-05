package com.example.kisileruygulamasi.databinding;
import com.example.kisileruygulamasi.R;
import com.example.kisileruygulamasi.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAnasayfaBindingImpl extends FragmentAnasayfaBinding implements com.example.kisileruygulamasi.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAnasayfaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentAnasayfaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            );
        this.fab.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rv.setTag(null);
        this.toolbarAnasayfa.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.kisileruygulamasi.generated.callback.OnClickListener(this, 1);
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
        if (BR.anasayfaFragment == variableId) {
            setAnasayfaFragment((com.example.kisileruygulamasi.fragment.AnasayfaFragment) variable);
        }
        else if (BR.kisilerAdapter == variableId) {
            setKisilerAdapter((com.example.kisileruygulamasi.adapter.KisilerAdapter) variable);
        }
        else if (BR.anasayfaToolBarBaslik == variableId) {
            setAnasayfaToolBarBaslik((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAnasayfaFragment(@Nullable com.example.kisileruygulamasi.fragment.AnasayfaFragment AnasayfaFragment) {
        this.mAnasayfaFragment = AnasayfaFragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.anasayfaFragment);
        super.requestRebind();
    }
    public void setKisilerAdapter(@Nullable com.example.kisileruygulamasi.adapter.KisilerAdapter KisilerAdapter) {
        this.mKisilerAdapter = KisilerAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.kisilerAdapter);
        super.requestRebind();
    }
    public void setAnasayfaToolBarBaslik(@Nullable java.lang.String AnasayfaToolBarBaslik) {
        this.mAnasayfaToolBarBaslik = AnasayfaToolBarBaslik;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.anasayfaToolBarBaslik);
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
        com.example.kisileruygulamasi.fragment.AnasayfaFragment anasayfaFragment = mAnasayfaFragment;
        com.example.kisileruygulamasi.adapter.KisilerAdapter kisilerAdapter = mKisilerAdapter;
        java.lang.String anasayfaToolBarBaslik = mAnasayfaToolBarBaslik;

        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.fab.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.rv.setAdapter(kisilerAdapter);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.toolbarAnasayfa.setTitle(anasayfaToolBarBaslik);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // anasayfaFragment
        com.example.kisileruygulamasi.fragment.AnasayfaFragment anasayfaFragment = mAnasayfaFragment;
        // anasayfaFragment != null
        boolean anasayfaFragmentJavaLangObjectNull = false;



        anasayfaFragmentJavaLangObjectNull = (anasayfaFragment) != (null);
        if (anasayfaFragmentJavaLangObjectNull) {



            anasayfaFragment.fabTikla(fab);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): anasayfaFragment
        flag 1 (0x2L): kisilerAdapter
        flag 2 (0x3L): anasayfaToolBarBaslik
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}