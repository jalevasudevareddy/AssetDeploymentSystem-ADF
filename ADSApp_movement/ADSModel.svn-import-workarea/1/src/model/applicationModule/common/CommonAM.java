package model.applicationModule.common;

import java.util.Map;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 27 09:38:19 IST 2022
// ---------------------------------------------------------------------
public interface CommonAM extends ApplicationModule {
    Map loadJWTData();

    String UserRoles();

    String decodeUrl();

}
