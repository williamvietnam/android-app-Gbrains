package com.nbgsoftware.gbrains.ui.container;

import com.nbgsoftware.gbrains.baseMVP.MVPActivity;
import com.nbgsoftware.gbrains.databinding.ActivityContainerBinding;

public class ContainerActivity extends MVPActivity<ActivityContainerBinding> {

    @Override
    public ActivityContainerBinding getActivityBinding() {
        return ActivityContainerBinding.inflate(getLayoutInflater());
    }

}