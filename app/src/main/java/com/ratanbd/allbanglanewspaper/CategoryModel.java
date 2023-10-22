package com.ratanbd.allbanglanewspaper;

public class CategoryModel {
    private String categoryId;

    private String categoryImage;
    private String categoryWebsiteUrl;

    public CategoryModel() {
    }

    public CategoryModel(String categoryId, String categoryName, String categoryImage, String categoryWebsiteUrl) {
        this.categoryId = categoryId;

        this.categoryImage = categoryImage;
        this.categoryWebsiteUrl = categoryWebsiteUrl;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }




    public String getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }

    public String getCategoryWebsiteUrl() {
        return categoryWebsiteUrl;
    }

    public void setCategoryWebsiteUrl(String categoryWebsiteUrl) {
        this.categoryWebsiteUrl = categoryWebsiteUrl;
    }
}

