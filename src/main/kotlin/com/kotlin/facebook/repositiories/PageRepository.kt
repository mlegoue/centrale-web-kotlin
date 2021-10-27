package com.kotlin.facebook.repositiories

import org.springframework.data.annotation.Id
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.CrudRepository

@Table("PAGE")
data class Page(
    @Id val id: String?,
    val name: String,
    val description: String,
    val admin: User
)

interface PageRepository : CrudRepository<Page, String> {

    @Query("select * from pages")
    fun findPages(): List<Page>
    abstract fun save(page: com.kotlin.facebook.models.Page)
}