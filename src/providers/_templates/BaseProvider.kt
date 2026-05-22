package com.reaver

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*

open class BaseReaverProvider : MainAPI() {
    override val hasMainPage = true
    override val hasQuickSearch = true

    // Reaver-style multi-fallback headers
    protected val baseHeaders = mapOf(
        "User-Agent" to "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36"
    )

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        TODO("Implement in child provider")
    }

    override suspend fun search(query: String): List<SearchResponse> {
        TODO("Implement with Reaver multi-fallback")
    }

    override suspend fun load(url: String): LoadResponse? {
        TODO("Implement")
    }
}
