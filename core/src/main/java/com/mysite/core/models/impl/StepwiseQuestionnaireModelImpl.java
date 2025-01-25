package com.mysite.core.models.impl;

import com.mysite.core.bean.ImageEntity;
import com.mysite.core.models.StepwiseQuestionnaireModel;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.api.resource.Resource;

import java.util.*;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = StepwiseQuestionnaireModel.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class StepwiseQuestionnaireModelImpl implements StepwiseQuestionnaireModel {

    @ChildResource
    private Resource options;
    @ChildResource
    private Resource screen2;
    @ChildResource
    private Resource screen3;
    @ValueMapValue
    private String question;
    @ValueMapValue
    private String question2;
    @ValueMapValue
    private String question3;
    @ChildResource
    private Resource screen4;
    @ChildResource
    private Resource personalInterest;
    @ChildResource
    private Resource backgroundImages;
    @ValueMapValue
    private String question4;
    @ValueMapValue
    private String draggableIcon;

    @ValueMapValue
    private String stepOneNextButtonCtaLabel;

    @ValueMapValue
    private String stepTwoNextButtonCtaLabel;

    @ValueMapValue
    private String stepTwoBackButtonCtaLabel;

    @ValueMapValue
    private String stepThreeBackButtonCtaLabel;

    @ValueMapValue
    private String stepThreeNextButtonCtaLabel;

    @ValueMapValue
    private String stepFourBackButtonCtaLabel;

    @ValueMapValue
    private String stepFourNextButtonCtaLabel;

    @ValueMapValue
    private String stepFiveNextButtonCtaLabel;


    @ValueMapValue
    private String stepFiveBackButtonCtaLabel;

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public String getQuestion2() {
        return question2;
    }

    @Override
    public String getQuestion3() {
        return question3;
    }
    @Override
    public String getDraggableIcon() {
        return draggableIcon;
    }

    @Override
    public List<Map<String, String>> getAnswers() {
        List<Map<String, String>> answers = new ArrayList<>();
        if(options != null && options.hasChildren()){
            int i=1;
            for(Resource resource : options.getChildren()){
                Map<String, String> itemData = new HashMap<>();
                String answer = resource.getValueMap().get("answers", String.class);
                itemData.put("index", String.valueOf(i++)); // Store index as a String
                itemData.put("answers", answer);
                itemData.put("motorcycleRankingImage", resource.getValueMap().get("motorcycleRankingImage", String.class));
                itemData.put("motorcycleRankingDesktopImage", resource.getValueMap().get("motorcycleRankingDesktopImage", String.class));
                answers.add(itemData);
            }
        }
        return answers;
    }

    @Override
    public List<Map<String, String>> getScreen2Answers() {
        List<Map<String, String>> screen2Answers = new ArrayList<>();
        if(screen2 != null && screen2.hasChildren()){
            for(Resource resource : screen2.getChildren()){
                Map<String, String> itemData = new HashMap<>();
                itemData.put("checkbox", resource.getValueMap().get("checkbox", String.class));
                itemData.put("pillionFrequencyImage", resource.getValueMap().get("pillionFrequencyImage", String.class));
                itemData.put("pillionFrequencyDesktopImage", resource.getValueMap().get("pillionFrequencyDesktopImage", String.class));
                screen2Answers.add(itemData);
            }
        }
        return screen2Answers;
    }

    @Override
    public List<String> getRidingPositionImageAttributes() {
        List<String> ridingPositionImageAttributes = new ArrayList<>();
        ridingPositionImageAttributes.add("Cruiser");
        ridingPositionImageAttributes.add("Upright");
        ridingPositionImageAttributes.add("Off");
        ridingPositionImageAttributes.add("Agg");
        ridingPositionImageAttributes.add("Relax");
        ridingPositionImageAttributes.add("Cafe");
        return ridingPositionImageAttributes;
    }

    @Override
    public String getQuestion4(){
        return question4; }

    @Override
    public List<Map<String, String>> getRidingPositionImagesURL() {
        List<Map<String, String>> ridingPositionDataList = new ArrayList<>();

        if (screen4 != null && screen4.hasChildren()) {
            for (Resource resource : screen4.getChildren()) {
                Map<String, String> itemData = new HashMap<>();
                itemData.put("ridingPosition", resource.getValueMap().get("ridingPosition", String.class));
                itemData.put("ridingPositionDesktopImage", resource.getValueMap().get("ridingPositionDesktopImage", String.class));
                itemData.put("ridingPositionShowingNameKey", resource.getValueMap().get("ridingPositionShowingNameKey", String.class));
                itemData.put("ridingPositionShowingNameValue", resource.getValueMap().get("ridingPositionShowingNameValue", String.class));

                ridingPositionDataList.add(itemData);
            }
        }

        return ridingPositionDataList;
    }

    @Override
    public String getStepOneNextButtonCtaLabel() {
        return stepOneNextButtonCtaLabel;
    }

    @Override
    public String getStepTwoBackButtonCtaLabel() {
        return stepTwoBackButtonCtaLabel;
    }

    @Override
    public String getStepTwoNextButtonCtaLabel() {
        return stepTwoNextButtonCtaLabel;
    }

    @Override
    public String getStepThreeNextButtonCtaLabel() {
        return stepThreeNextButtonCtaLabel;
    }

    @Override
    public String getStepThreeBackButtonCtaLabel() {
        return stepThreeBackButtonCtaLabel;
    }

    @Override
    public String getStepFourNextButtonCtaLabel() {
        return stepFourNextButtonCtaLabel;
    }

    @Override
    public String getStepFourBackButtonCtaLabel() {
        return stepFourBackButtonCtaLabel;
    }

    @Override
    public String getStepFiveBackButtonCtaLabel() {
        return stepFiveBackButtonCtaLabel;
    }

    @Override
    public String getStepFiveNextButtonCtaLabel() {
        return stepFiveNextButtonCtaLabel;
    }

    @Override
    public List<ImageEntity> getScreen3Answers(){
        List<ImageEntity> optionWithImages = new ArrayList<>();
        if(screen3 != null && screen3.hasChildren()){
            Iterator<Resource> placeToRideIterator = screen3.getChildren().iterator();
            while( placeToRideIterator.hasNext()){
                Resource placeToRideResource = placeToRideIterator.next();
                String optionText = placeToRideResource.getValueMap().get("option3", String.class);
                String backgroundiMageURL = placeToRideResource.getValueMap().get("images",String.class);
                String optionImageForDesktop = placeToRideResource.getValueMap().get("optionImageForDesktop",String.class);
                optionWithImages.add(new ImageEntity(optionText,backgroundiMageURL,optionImageForDesktop));
            }
        }
        return optionWithImages;
    }
}

