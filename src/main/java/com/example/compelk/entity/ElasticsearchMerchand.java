package com.example.compelk.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
@Data
@Document(indexName = "merchand")
@NoArgsConstructor
public class ElasticsearchMerchand {

    @Id
    private String sku;

    @Field(type = FieldType.Text)
    private String productName;

    @Field(type = FieldType.Text)
    private String productUrl;

    @Field(type = FieldType.Text)
    private String imageUrl;

    @Field(type = FieldType.Float)
    private float price;

    @Field(type = FieldType.Keyword)
    private String currency;

    @Field(type = FieldType.Text)
    private String brand;

    @Field(type = FieldType.Text)
    private String category;

    @Field(type = FieldType.Keyword)
    private String variantGroup;

    @Field(type = FieldType.Text)
    private String variantSize;

    @Field(type = FieldType.Text)
    private String color;

    @Field(type = FieldType.Text)
    private String material;

    @Field(type = FieldType.Text)
    private String model;

    @Field(type = FieldType.Text)
    private String ageRange;

    @Field(type = FieldType.Keyword)
    private String gender;

    // Constructors, getters, setters (omitted for brevity)
}
