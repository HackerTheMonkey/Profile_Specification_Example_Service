/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencloud.slee.devportal.services.profileSpec;

import javax.slee.CreateException;
import javax.slee.SLEEException;
import javax.slee.TransactionRequiredLocalException;
import javax.slee.TransactionRolledbackLocalException;
import javax.slee.profile.Profile;
import javax.slee.profile.ProfileContext;
import javax.slee.profile.ProfileLocalObject;
import javax.slee.profile.ProfileTable;
import javax.slee.profile.ProfileVerificationException;

/**
 * This abstract class need to provide an implementation for the methods
 * defined by the profile local interface, these methods are visible to the other
 * SLEE components accessing a profile built on this spec.
 * @author Hasanein.Khafaji
 */
public abstract class ProfileAbstractClass implements Profile, ProfileCmpInterface
{

    /**
     * An empty-parenthesis constructor must be included in the implementation
     * of the profile abstract class as per the JAIN SLEE 1.1 specs
     */
    public ProfileAbstractClass()
    {
    }

    public void profileActivate()
    {
    }

    public void profileInitialize()
    {
    }

    public void profileLoad()
    {
    }

    public void profilePassivate()
    {
    }

    public void profilePostCreate() throws CreateException
    {
    }

    public void profileRemove()
    {
    }

    public void profileStore()
    {
    }

    public void profileVerify() throws ProfileVerificationException
    {
    }

    public void setProfileContext(ProfileContext pc)
    {
    }

    public void unsetProfileContext()
    {
    }

    public String getTestMessage()
    {
        return "** " + getMessage() + " **";
    }

    public void setTestMessage(String message)
    {
        setMessage(message);
    }

}
