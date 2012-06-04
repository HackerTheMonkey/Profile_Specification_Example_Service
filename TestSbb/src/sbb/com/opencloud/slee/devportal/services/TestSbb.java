package com.opencloud.slee.devportal.services;

import com.opencloud.slee.devportal.services.base.BaseSbb;
import com.opencloud.slee.devportal.services.profileSpec.ProfileLocalInterface;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.slee.ActivityContextInterface;
import javax.slee.profile.ProfileLocalObject;
import javax.slee.profile.ProfileTable;
import javax.slee.serviceactivity.ServiceStartedEvent;

/**
 *
 * @author Hasanein.Khafaji
 */
public abstract class TestSbb extends BaseSbb
{

    public void onServiceStartedEvent(ServiceStartedEvent serviceStartedEvent, ActivityContextInterface aci)
    {
        try
        {
            /**
             * Obtained an instance of an already created (using rhino command line
             * console) ProfileTable
             */
            ProfileTable profileTable = profileFacility.getProfileTable("TestProfileTable");
            /**
             * Create a new Profile and access the methods exposed by it via
             * the implementation of the profile abstract class
             */
            ProfileLocalObject profileLocalObject = profileTable.create("TestProfile01");
            /**
             * Cast the obtained ProfileLocalObject into the developer-provided
             * profile local interface. The obtained ProfileLocalObject can be
             * type casted into the developer-provided profile local interface
             * because that the latter extends the former.
             */
            ProfileLocalInterface profileLocalInterface = (ProfileLocalInterface) profileLocalObject;
            profileLocalInterface.setTestMessage("TEST MESSAGE");
            tracer.info(profileLocalInterface.getTestMessage());
        }
        catch (Exception ex)
        {
            Logger.getLogger(TestSbb.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
