package com.fruit.domain.fruit;

import java.io.Serializable;

public class Place implements Serializable {
    
    private static final long serialVersionUID = 1392757101944931428L;

    private Integer placeId;

    private String placeCountry;

    private String placeState;

    private String placeCity;

    private String placeDistrict;

    private String placeWrite;

    private Integer placeSortOrder;

    private Integer state;

    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public String getPlaceCountry() {
        return placeCountry;
    }

    public void setPlaceCountry(String placeCountry) {
        this.placeCountry = placeCountry == null ? null : placeCountry.trim();
    }

    public String getPlaceState() {
        return placeState;
    }

    public void setPlaceState(String placeState) {
        this.placeState = placeState == null ? null : placeState.trim();
    }

    public String getPlaceCity() {
        return placeCity;
    }

    public void setPlaceCity(String placeCity) {
        this.placeCity = placeCity == null ? null : placeCity.trim();
    }

    public String getPlaceDistrict() {
        return placeDistrict;
    }

    public void setPlaceDistrict(String placeDistrict) {
        this.placeDistrict = placeDistrict == null ? null : placeDistrict.trim();
    }

    public String getPlaceWrite() {
        return placeWrite;
    }

    public void setPlaceWrite(String placeWrite) {
        this.placeWrite = placeWrite == null ? null : placeWrite.trim();
    }

    public Integer getPlaceSortOrder() {
        return placeSortOrder;
    }

    public void setPlaceSortOrder(Integer placeSortOrder) {
        this.placeSortOrder = placeSortOrder;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}