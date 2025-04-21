package dev.whosnickdoglio.lib.foo

import com.squareup.anvil.annotations.ContributesMultibinding
import dev.whosnickdoglio.lib.Bind
import dev.whosnickdoglio.lib.BindingKey
import javax.inject.Inject

interface Foo

@Bind(BindingKey.FOO)
@ContributesMultibinding(Unit::class)
class FooImpl @Inject constructor() : Foo
