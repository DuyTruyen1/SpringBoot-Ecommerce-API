package com.project.shopapp.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDTO {
    @NotEmpty(message = "Category name cannot be empty")
    private String name;

    public  String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }
}
