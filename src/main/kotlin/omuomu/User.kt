package omuomu

import omuomu.Entity

class User: Entity {
    private val name: String
    constructor(name:String): super(null) {
        this.name = name
    }

    public fun getName(): String {
        return this.name
    }
}