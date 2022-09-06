package de.siastudios.ions.backend.repository

import de.siastudios.ions.backend.model.LocationCategory
import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.FluentQuery
import org.springframework.stereotype.Repository
import java.util.*
import java.util.function.Function

@Repository
class LocationCategoryRepository : MongoRepository<LocationCategory, String> {

    override fun <S : LocationCategory> save(entity: S): S {
        TODO("Not yet implemented")
    }

    override fun <S : LocationCategory?> saveAll(entities: MutableIterable<S>): MutableList<S> {
        TODO("Not yet implemented")
    }

    override fun findById(id: String): Optional<LocationCategory> {
        TODO("Not yet implemented")
    }

    override fun existsById(id: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun findAll(): MutableList<LocationCategory> {
        TODO("Not yet implemented")
    }

    override fun findAll(sort: Sort): MutableList<LocationCategory> {
        TODO("Not yet implemented")
    }

    override fun findAll(pageable: Pageable): Page<LocationCategory> {
        TODO("Not yet implemented")
    }

    override fun count(): Long {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }

    override fun <S : LocationCategory?> insert(entities: MutableIterable<S>): MutableList<S> {
        TODO("Not yet implemented")
    }

    override fun <S : LocationCategory> insert(entity: S): S {
        TODO("Not yet implemented")
    }

    override fun <S : LocationCategory?, R : Any> findBy(
        example: Example<S>,
        queryFunction: Function<FluentQuery.FetchableFluentQuery<S>, R>
    ): R {
        TODO("Not yet implemented")
    }

    override fun <S : LocationCategory?> exists(example: Example<S>): Boolean {
        TODO("Not yet implemented")
    }

    override fun <S : LocationCategory?> findOne(example: Example<S>): Optional<S> {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: MutableIterable<LocationCategory>) {
        TODO("Not yet implemented")
    }

    override fun deleteAllById(ids: MutableIterable<String>) {
        TODO("Not yet implemented")
    }

    override fun delete(entity: LocationCategory) {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: String) {
        TODO("Not yet implemented")
    }

    override fun <S : LocationCategory?> count(example: Example<S>): Long {
        TODO("Not yet implemented")
    }

    override fun findAllById(ids: MutableIterable<String>): MutableIterable<LocationCategory> {
        TODO("Not yet implemented")
    }

    override fun <S : LocationCategory?> findAll(example: Example<S>, pageable: Pageable): Page<S> {
        TODO("Not yet implemented")
    }

    override fun <S : LocationCategory?> findAll(example: Example<S>, sort: Sort): MutableList<S> {
        TODO("Not yet implemented")
    }

    override fun <S : LocationCategory?> findAll(example: Example<S>): MutableList<S> {
        TODO("Not yet implemented")
    }
}