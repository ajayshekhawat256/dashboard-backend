package com.example.dashboard.Modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Data {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "end_year")
    private int endYear;
    private String citylng;
    private String citylat;
    private int intensity;
    private String sector;
    private String topic;
    private String insight;
    private String swot;
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEnd_year() {
        return endYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public void setCitylng(String citylng) {
        this.citylng = citylng;
    }

    public String getCitylat() {
        return citylat;
    }

    public void setCitylat(String citylat) {
        this.citylat = citylat;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getInsight() {
        return insight;
    }

    public void setInsight(String insight) {
        this.insight = insight;
    }

    public String getSwot() {
        return swot;
    }

    public void setSwot(String swot) {
        this.swot = swot;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStart_year() {
        return start_year;
    }

    public void setStart_year(String start_year) {
        this.start_year = start_year;
    }

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRelevance() {
        return relevance;
    }

    public void setRelevance(int relevance) {
        this.relevance = relevance;
    }

    public String getPestle() {
        return pestle;
    }

    public void setPestle(String pestle) {
        this.pestle = pestle;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLikelihood() {
        return likelihood;
    }

    public void setLikelihood(int likelihood) {
        this.likelihood = likelihood;
    }

    private String region;
    private String start_year;
    private String impact;
    private String added;
    private String published;
    private String city;
    private String country;
    private int relevance;
    private String pestle;
    private String source;
    private String title;
    private int likelihood;
}
