package omuomu

import omuomu.User
import omuomu.Entity
import omuomu.Group
import omuomu.UserFactory


fun main(args: Array<String>) {
    var userA: User = UserFactory.get("A")
    var userB: User = UserFactory.get("B")
    
    var groupA: Group = Group("group-A", arrayListOf(userA, userB))
    var groupB: Group = Group("group-B", arrayListOf(UserFactory.get("A")))

    var userAA: User = UserFactory.get("A")

    var roleA: Role = Role(arrayListOf(userA, groupA))

    var entitys: ArrayList<Entity> = roleA.getMembers()

    println(entitys)
}
