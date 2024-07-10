package com.RowdyAvocado

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class LibriVoxAudiobookPlugin : Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list
        // directly.
        registerMainAPI(LibriVoxAudiobook())
    }
}
