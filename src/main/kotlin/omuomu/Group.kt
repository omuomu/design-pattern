package omuomu

import omuomu.Entity
import java.util.List

class Group: Entity{
    private val name: String
    constructor(name: String, list: ArrayList<Entity>): super(list){
        this.name = name
    }

    public fun getName(): String {
        return this.name
    }
}