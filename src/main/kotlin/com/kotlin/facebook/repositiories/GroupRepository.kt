package com.kotlin.facebook.repositiories

import com.kotlin.facebook.models.User
import org.springframework.data.annotation.Id
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.CrudRepository

@Table("GROUP")
data class Group(
    @Id val id: String?,
    val name: String,
    val description: String,
    val admin: User,
    val privacy: String
)

interface GroupRepository : CrudRepository<Group, String> {

    @Query("select * from groups")
    fun findGroups(): List<Group>
    abstract fun save(group: com.kotlin.facebook.models.Group)
}