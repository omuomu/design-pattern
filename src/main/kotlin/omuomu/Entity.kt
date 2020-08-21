package omuomu

open class Entity {

    private val children: ArrayList<Entity>?

    constructor(children: ArrayList<Entity>?) {
        this.children = children
    }

    public fun getChildren():ArrayList<Entity>? { 
        return this.children
    }
}