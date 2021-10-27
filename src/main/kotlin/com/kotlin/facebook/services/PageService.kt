package com.kotlin.facebook.services

import com.kotlin.facebook.repositiories.Page
import com.kotlin.facebook.repositiories.PageRepository
import org.springframework.stereotype.Service

@Service
class PageService(val db: PageRepository) {

    fun findPages(): List<Page> = db.findPages()

    fun post(page: Page){
        db.save(page)
    }
}