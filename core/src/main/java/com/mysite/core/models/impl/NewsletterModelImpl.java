package com.mysite.core.models.impl;

import com.mysite.core.models.NewsletterModel;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class,
adapters = NewsletterModel.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NewsletterModelImpl implements NewsletterModel {

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String emailPlaceholder;

    @ValueMapValue
    private String emailErrorMessage;

    @ValueMapValue
    private String buttonLabel;

    @ValueMapValue
    private String desktopBackgroundImage;

    @ValueMapValue
    private String mobileBackgroundImage;

    @ValueMapValue
    private String title;


    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getEmailPlaceholder() {
        return emailPlaceholder;
    }

    @Override
    public String getEmailErrorMessage() {
        return emailErrorMessage;
    }

    @Override
    public String getButtonLabel() {
        return buttonLabel;
    }

    @Override
    public String getDesktopBackgroundImage() {
        return desktopBackgroundImage;
    }

    @Override
    public String getMobileBackgroundImage() {
        return mobileBackgroundImage;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
