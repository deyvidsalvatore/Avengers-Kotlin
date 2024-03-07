package com.deyvidsalvatore.avengersapi.application.web.resources

import com.deyvidsalvatore.avengersapi.application.web.resources.request.AvengerRequest
import com.deyvidsalvatore.avengersapi.application.web.resources.response.AvengerResponse
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/api/v1/avenger"])
class AvengerResource {

    @GetMapping
    fun getAvengers(): ResponseEntity<List<AvengerResponse>> = ResponseEntity.ok().body(emptyList<AvengerResponse>())

    @GetMapping("{id}")
    fun getAvengerDetails(@PathVariable(value = "id") id: Long) = ResponseEntity.ok().build<AvengerResponse>()

    @PostMapping
    fun createAvenger(@Valid @RequestBody request: AvengerRequest) = ResponseEntity.ok().build<AvengerResponse>();
}