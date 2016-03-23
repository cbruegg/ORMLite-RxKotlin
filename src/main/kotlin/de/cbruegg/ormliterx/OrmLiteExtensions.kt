package de.cbruegg.ormliterx

import com.j256.ormlite.dao.Dao
import com.j256.ormlite.dao.RuntimeExceptionDao
import com.j256.ormlite.stmt.QueryBuilder
import com.j256.ormlite.stmt.RuntimeExceptionQueryBuilder
import com.j256.ormlite.stmt.RuntimeExceptionWhere
import com.j256.ormlite.stmt.Where
import rx.Observable

/**
 * @see Dao.queryForAll()
 */
fun <T, ID> Dao<T, ID>.queryForAllRx(): Observable<List<T>> = OrmLiteRx.queryForAll(this)

/**
 * @see RuntimeExceptionDao#queryForAll()
 */
fun <T, ID> RuntimeExceptionDao<T, ID>.queryForAllRx(): Observable<List<T>> = OrmLiteRx.queryForAll(this)

/**
 * @see Where#query()
 */
fun <T, ID> Where<T, ID>.queryRx(): Observable<List<T>> = OrmLiteRx.query(this)

/**
 * @see RuntimeExceptionWhere#query()
 */
fun <T, ID> RuntimeExceptionWhere<T, ID>.queryRx(): Observable<List<T>> = OrmLiteRx.query(this)

/**
 * @see QueryBuilder#query()
 */
fun <T, ID> QueryBuilder<T, ID>.queryRx(): Observable<List<T>> = OrmLiteRx.query(this)

/**
 * @see RuntimeExceptionQueryBuilder#query()
 */
fun <T, ID> RuntimeExceptionQueryBuilder<T, ID>.queryRx(): Observable<List<T>> = OrmLiteRx.query(this)

/**
 * @see Where#queryForFirst()
 */
fun <T, ID> Where<T, ID>.queryForFirstRx(): Observable<T> = OrmLiteRx.queryForFirst(this)

/**
 * @see RuntimeExceptionWhere#queryForFirst()
 */
fun <T, ID> RuntimeExceptionWhere<T, ID>.queryForFirstRx(): Observable<T> = OrmLiteRx.queryForFirst(this)

/**
 * @see QueryBuilder#queryForFirst()
 */
fun <T, ID> QueryBuilder<T, ID>.queryForFirstRx(): Observable<T> = OrmLiteRx.queryForFirst(this)

/**
 * @see RuntimeExceptionQueryBuilder#queryForFirst()
 */
fun <T, ID> RuntimeExceptionQueryBuilder<T, ID>.queryForFirstRx(): Observable<T> = OrmLiteRx.queryForFirst(this)

/**
 * @see Dao#queryForId(Object)
 */
fun <T, ID> Dao<T, ID>.queryForIdRx(id: ID): Observable<T> = OrmLiteRx.queryForId(this, id)

/**
 * @see RuntimeExceptionDao#queryForId(Object)
 */
fun <T, ID> RuntimeExceptionDao<T, ID>.queryForIdRx(id: ID): Observable<T> = OrmLiteRx.queryForId(this, id)

/**
 * @see Dao#queryForEq(String, Object)
 */
fun <T, ID> Dao<T, ID>.queryForEqRx(columnName: String, value: Any): Observable<List<T>> = OrmLiteRx.queryForEq(this, columnName, value)

/**
 * @see RuntimeExceptionDao#queryForEq(String, Object)
 */
fun <T, ID> RuntimeExceptionDao<T, ID>.queryForEqRx(columnName: String, value: Any): Observable<List<T>> = OrmLiteRx.queryForEq(this, columnName, value)