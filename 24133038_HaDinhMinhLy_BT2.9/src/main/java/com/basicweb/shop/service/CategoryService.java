package com.basicweb.shop.service;

import com.basicweb.shop.entity.Category;
import com.basicweb.shop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@SuppressWarnings("null")
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
}
