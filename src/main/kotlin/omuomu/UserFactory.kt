package omuomu

import java.util.HashMap
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap
import java.util.concurrent.ExecutionException
import java.util.concurrent.Future
import java.util.concurrent.FutureTask

import omuomu.UserFactory

object UserFactory {
    val pool: ConcurrentMap<String, Future<User>> = ConcurrentHashMap()
    fun get(name: String): User {
        var f: Future<User>? = this.pool.get(name)
        if(f == null) {
            val ft: FutureTask<User> = FutureTask({User(name)})
            f = pool.putIfAbsent(name, ft)
            if (f == null) {
                f = ft
                ft.run()
            }
        }
        return f.get()
    }
}