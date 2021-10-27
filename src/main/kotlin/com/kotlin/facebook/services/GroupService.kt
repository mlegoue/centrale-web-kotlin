package com.kotlin.facebook.services

import com.kotlin.facebook.repositiories.Group
import com.kotlin.facebook.repositiories.GroupRepository
import org.springframework.stereotype.Service

@Service
class GroupService(val db: GroupRepository) {

    fun findGroups(): List<Group> = db.findGroups()

    fun post(group: Group){
        db.save(group)
    }
}