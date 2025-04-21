package dev.whosnickdoglio.lib

import dagger.MapKey

enum class BindingKey {
    FOO,
    BAR
}

@MapKey
@Retention(AnnotationRetention.BINARY)
annotation class Bind(val key: BindingKey)
