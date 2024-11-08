package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.*;
@Builder
@Table(name = "product_images")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductImage {
    public static final int MAXIMUM_IMAGES_PER_PRODUCT = 5;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "image_url" , length = 300)
    private String imageUrl;
}
