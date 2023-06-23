package io.quarkiverse.custom.deployment;

import io.quarkiverse.custom.runtime.Resource;
import io.quarkiverse.custom.runtime.Service;
import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class CustomProcessor {

    private static final String FEATURE = "custom";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    AdditionalBeanBuildItem beans() {
        return AdditionalBeanBuildItem.builder()
                .addBeanClass(Service.class)
                .addBeanClass(Resource.class)
                .build();
    }
}
