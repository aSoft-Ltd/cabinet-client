@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package cabinet

import symphony.CollectionScene
import symphony.paged
import kotlin.js.JsExport

class RootDirScene(val config: RootDirSceneConfig) : CollectionScene<Attachment>(config) {
    protected val api get() = config.api

    fun initialize() {
        paginator.initialize { no, capacity ->
            api.list().andThen { it.paged(no, capacity) }
        }
    }
}