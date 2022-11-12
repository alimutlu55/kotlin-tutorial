package anonymousobject

interface Switcher {
    fun on(): String
}

fun powerOn(): String {
    //...
    val powerSwitch = object : Switcher {
        override fun on(): String {
            return "On"
        }
    }
    return powerSwitch.on()
}
