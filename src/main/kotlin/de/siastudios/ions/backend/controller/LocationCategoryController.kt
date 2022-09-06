package de.siastudios.ions.backend.controller

import de.siastudios.ions.backend.service.LocationCategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/category")
class LocationCategoryController(@Autowired val locationCategoryService: LocationCategoryService) {

    // TODO

}