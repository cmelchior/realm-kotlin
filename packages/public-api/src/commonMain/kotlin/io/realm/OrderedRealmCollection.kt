package io.realm

interface OrderedRealmCollection<E> : List<E>, RealmCollection<E> {
    fun first(): E
    fun firstOrDefault(defaultValue: E?): E?
    fun last(): E
    fun lastOrDefault(defaultValue: E?): E?
    fun deleteFromRealm(location: Int)
    fun deleteFirstFromRealm(): Boolean
    fun deleteLastFromRealm(): Boolean
}