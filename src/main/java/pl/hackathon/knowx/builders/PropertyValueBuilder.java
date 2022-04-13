package pl.hackathon.knowx.builders;

import pl.hackathon.knowx.model.PropertiesList;
import pl.hackathon.knowx.model.PropertyValue;

public class PropertyValueBuilder {
    private String name;
    private PropertiesList propertiesList;

    public PropertyValueBuilder withPropertiesList(PropertiesList propertiesList) {
        this.propertiesList = propertiesList;
        return this;
    }

    public PropertyValueBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PropertyValue build(){
        PropertyValue propertyValue = new PropertyValue();
        propertyValue.setName(name);
        propertyValue.setPropertiesList(propertiesList);
        return propertyValue;
    }
}
