package com.nbgsoftware.gbrains.baseMVP;

import androidx.viewbinding.ViewBinding;

import javax.inject.Inject;

public abstract class MVPFragmentPresenter<
        VB extends ViewBinding,
        V extends MVPContract.View,
        P extends MVPContract.Presenter<V>>
        extends MVPFragment<VB> implements MVPContract.View {

    @Inject
    public P presenter;

//    public abstract P getPresenter();

//    @SuppressWarnings("unchecked")
//    @CallSuper
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (presenter == null){
//            presenter = getPresenter();
//        }
//        getLifecycle().addObserver(presenter);
//        presenter.attachView((V) this);
//    }
}
