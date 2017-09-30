package glm_.vec1.operators

import glm_.i
import glm_.vec1.Vec1i
import glm_.vec1.Vec1i.Companion.div
import glm_.vec1.Vec1i.Companion.minus
import glm_.vec1.Vec1i.Companion.plus
import glm_.vec1.Vec1i.Companion.rem
import glm_.vec1.Vec1i.Companion.times

/**
 * Created by GBarbieri on 08.11.2016.
 */
interface vec1i_operators {

    fun plus(res: Vec1i, a: Vec1i, bX: Int): Vec1i {
        res.x = a.x + bX
        return res
    }

    fun minus(res: Vec1i, a: Vec1i, bX: Int): Vec1i {
        res.x = a.x - bX
        return res
    }

    fun minus(res: Vec1i, aX: Int, b: Vec1i): Vec1i {
        res.x = aX - b.x
        return res
    }

    fun times(res: Vec1i, a: Vec1i, bX: Int): Vec1i {
        res.x = a.x * bX
        return res
    }

    fun div(res: Vec1i, a: Vec1i, bX: Int): Vec1i {
        res.x = a.x / bX
        return res
    }

    fun div(res: Vec1i, aX: Int, b: Vec1i): Vec1i {
        res.x = aX / b.x
        return res
    }

    fun rem(res: Vec1i, a: Vec1i, bX: Int): Vec1i {
        res.x = a.x % bX
        return res
    }

    fun rem(res: Vec1i, aX: Int, b: Vec1i): Vec1i {
        res.x = aX % b.x
        return res
    }

    fun and(res: Vec1i, a: Vec1i, bX: Int): Vec1i {
        res.x = a.x and bX
        return res
    }

    fun or(res: Vec1i, a: Vec1i, bX: Int): Vec1i {
        res.x = a.x or bX
        return res
    }

    fun xor(res: Vec1i, a: Vec1i, bX: Int): Vec1i {
        res.x = a.x xor bX
        return res
    }

    fun shl(res: Vec1i, a: Vec1i, bX: Int): Vec1i {
        res.x = a.x shl bX
        return res
    }

    fun shr(res: Vec1i, a: Vec1i, bX: Int): Vec1i {
        res.x = a.x shr bX
        return res
    }

    fun inv(res: Vec1i, a: Vec1i): Vec1i {
        res.x = a.x.inv()
        return res
    }
}


// -- Specific binary arithmetic operators --

infix operator fun Int.plus(b: Vec1i) = plus(Vec1i(), b, this)
fun Int.plus(b: Vec1i, res: Vec1i) = plus(res, b, this)
infix fun Int.plus_(b: Vec1i) = plus(b, b, this)

infix operator fun Int.minus(b: Vec1i) = minus(Vec1i(), this, b)
fun Int.minus(b: Vec1i, res: Vec1i) = minus(res, b, this)
infix fun Int.minus_(b: Vec1i) = minus(b, this, b)

infix operator fun Int.times(b: Vec1i) = times(Vec1i(), b, this)
fun Int.times(b: Vec1i, res: Vec1i) = times(res, b, this)
infix fun Int.times_(b: Vec1i) = times(b, b, this)

infix operator fun Int.div(b: Vec1i) = div(Vec1i(), this, b)
fun Int.div(b: Vec1i, res: Vec1i) = div(res, b, this)
infix fun Int.div_(b: Vec1i) = div(b, this, b)

infix operator fun Int.rem(b: Vec1i) = rem(Vec1i(), this, b)
fun Int.rem(b: Vec1i, res: Vec1i) = rem(res, b, this)
infix fun Int.rem_(b: Vec1i) = rem(b, this, b)


// -- Generic binary arithmetic operators --

infix operator fun Number.plus(b: Vec1i) = plus(Vec1i(), b, this.i)
fun Number.plus(b: Vec1i, res: Vec1i) = plus(res, b, this.i)
infix fun Number.plus_(b: Vec1i) = plus(b, b, this.i)

infix operator fun Number.minus(b: Vec1i) = minus(Vec1i(), this.i, b)
fun Number.minus(b: Vec1i, res: Vec1i) = minus(res, b, this.i)
infix fun Number.minus_(b: Vec1i) = minus(b, this.i, b)

infix operator fun Number.times(b: Vec1i) = times(Vec1i(), b, this.i)
fun Number.times(b: Vec1i, res: Vec1i) = times(res, b, this.i)
infix fun Number.times_(b: Vec1i) = times(b, b, this.i)

infix operator fun Number.div(b: Vec1i) = div(Vec1i(), this.i, b)
fun Number.div(b: Vec1i, res: Vec1i) = div(res, b, this.i)
infix fun Number.div_(b: Vec1i) = div(b, this.i, b)

infix operator fun Number.rem(b: Vec1i) = rem(Vec1i(), this.i, b)
fun Number.rem(b: Vec1i, res: Vec1i) = rem(res, b, this.i)
infix fun Number.rem_(b: Vec1i) = rem(b, this.i, b)