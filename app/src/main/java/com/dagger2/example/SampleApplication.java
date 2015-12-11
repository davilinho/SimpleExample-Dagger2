package com.dagger2.example;

import android.app.Application;

/**
 * Component created on 11/12/2015.
 *
 * @author dmartin
 */
public class SampleApplication extends Application {

    private SampleComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        initDependencyInjector();
    }

    private void initDependencyInjector() {
        component = DaggerSampleComponent.builder().sampleModule(new SampleModule()).build();
    }

    public SampleComponent getComponent() {
        return component;
    }
}
