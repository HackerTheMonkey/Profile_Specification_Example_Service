/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencloud.slee.devportal.services.profileSpec;

import javax.slee.profile.ProfileLocalObject;

/**
 *
 * @author Hasanein.Khafaji
 */
public interface ProfileLocalInterface extends ProfileLocalObject, ProfileCmpInterface
{
    public String getTestMessage();

    public void setTestMessage(String message);
}
