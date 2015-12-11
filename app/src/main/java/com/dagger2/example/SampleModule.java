package com.dagger2.example;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Component created on 11/12/2015.
 *
 * @author dmartin
 */
@Module
public class SampleModule {

    @Singleton
    @Provides
    public EmployeeBean provideEmployeeBean() {
        return new EmployeeBean("David");
    }

}
