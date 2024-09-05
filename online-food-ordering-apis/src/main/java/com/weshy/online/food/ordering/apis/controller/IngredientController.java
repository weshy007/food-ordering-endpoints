package com.weshy.online.food.ordering.apis.controller;

import com.weshy.online.food.ordering.apis.models.IngredientCategory;
import com.weshy.online.food.ordering.apis.models.IngredientsItem;
import com.weshy.online.food.ordering.apis.request.IngredientCategoryRequest;
import com.weshy.online.food.ordering.apis.request.IngredientItemRequest;
import com.weshy.online.food.ordering.apis.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/ingredients")
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @PostMapping("/category")
    public ResponseEntity<IngredientCategory> createIngredientCategory(@RequestBody IngredientCategoryRequest req)
            throws Exception {
        IngredientCategory item = ingredientService.createIngredientCategory(req.getName(), req.getRestaurantId());

        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @PostMapping()
    public ResponseEntity<IngredientsItem> createIngredientItem(@RequestBody IngredientItemRequest req)
            throws Exception {
        IngredientsItem item = ingredientService.createIngredientItem(req.getRestaurantId(), req.getName(), req.getRestaurantId());

        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @PutMapping("/{id}/stock")
    public ResponseEntity<IngredientsItem> updateStock(@PathVariable Long id) throws Exception {

        IngredientsItem item = ingredientService.updateStock(id);

        return new ResponseEntity<>(item, HttpStatus.OK);
    }

    @GetMapping("/restaurant/{id}")
    public ResponseEntity<List<IngredientsItem>> getRestaurantIngredients(@PathVariable Long id) throws Exception {

        List<IngredientsItem> item = ingredientService.findByRestaurantIngredients(id);

        return new ResponseEntity<>(item, HttpStatus.OK);
    }

    @GetMapping("/restaurant/{id}/category")
    public ResponseEntity<List<IngredientCategory>> getRestaurantIngredientCategory(@PathVariable Long id) throws Exception {

        List<IngredientCategory> item = ingredientService.findIngredientCategoryByRestaurantId(id);

        return new ResponseEntity<>(item, HttpStatus.OK);
    }



}
