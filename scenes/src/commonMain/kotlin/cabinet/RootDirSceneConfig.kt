package cabinet

import keep.Cacheable

interface RootDirSceneConfig : Cacheable {
    val api: RootDir
}