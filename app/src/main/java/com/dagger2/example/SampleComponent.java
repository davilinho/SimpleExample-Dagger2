package com.dagger2.example;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Component created on 11/12/2015.
 *
 * @author dmartin
 */
@Singleton
@Component(
        modules = SampleModule.class
)
public interface SampleComponent {

    void inject(MainActivity activity);

}
