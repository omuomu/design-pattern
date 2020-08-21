package omuomu

import omuomu.Entity
import java.util.List

class Role {
    private val members: ArrayList<Entity>
    constructor(members: ArrayList<Entity>) {
        this.members = members
    }

    public fun getMembers(): ArrayList<Entity> {
        return this.members
    }
}