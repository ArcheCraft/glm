package glm_.vec1

import glm_.BYTES
import glm_.b
import glm_.i
import glm_.vec2.Vec2bool
import glm_.vec2.Vec2t
import glm_.vec3.Vec3bool
import glm_.vec3.Vec3t
import glm_.vec4.Vec4bool
import glm_.vec4.Vec4t
import java.nio.*

class Vec1b(x: Byte) : Vec1t<Byte>(x) {

    // -- Explicit basic, conversion other main.and conversion vector constructors --

    constructor() : this(0)

    constructor(v: Vec2t<out Number>) : this(v.x)
    constructor(v: Vec3t<out Number>) : this(v.x)
    constructor(v: Vec4t<out Number>) : this(v.x)

    constructor(v: Vec2bool) : this(v.x.b)
    constructor(v: Vec3bool) : this(v.x.b)
    constructor(v: Vec4bool) : this(v.x.b)

    constructor(bytes: ByteArray, index: Int = 0) : this(bytes[index])
    constructor(chars: CharArray, index: Int = 0) : this(chars[index].b)
    constructor(shorts: ShortArray, index: Int = 0) : this(shorts[index])
    constructor(ints: IntArray, index: Int = 0) : this(ints[index])
    constructor(longs: LongArray, index: Int = 0) : this(longs[index])
    constructor(floats: FloatArray, index: Int = 0) : this(floats[index])
    constructor(doubles: DoubleArray, index: Int = 0) : this(doubles[index])
    constructor(booleans: BooleanArray, index: Int = 0) : this(booleans[index].b)

    constructor(numbers: Array<out Number>, index: Int = 0) : this(numbers[index])
    constructor(chars: Array<Char>, index: Int = 0) : this(chars[index].b)
    constructor(booleans: Array<Boolean>, index: Int = 0) : this(booleans[index].b)

    constructor(list: List<Any>, index: Int = 0) : this(list[index].b)

    constructor(bytes: ByteBuffer, index: Int = bytes.position()) : this(bytes[index])
    constructor(chars: CharBuffer, index: Int = chars.position()) : this(chars[index].b)
    constructor(shorts: ShortBuffer, index: Int = shorts.position()) : this(shorts[index])
    constructor(ints: IntBuffer, index: Int = ints.position()) : this(ints[index])
    constructor(longs: LongBuffer, index: Int = longs.position()) : this(longs[index])
    constructor(floats: FloatBuffer, index: Int = floats.position()) : this(floats[index])
    constructor(doubles: DoubleBuffer, index: Int = doubles.position()) : this(doubles[index])

    constructor(x: Number) : this(x.b)


    fun put(x: Byte, y: Byte): Vec1b {
        this.x = x
        return this
    }

    override fun put(x: Number): Vec1b {
        this.x = x.b
        return this
    }


    // -- Component accesses --

    operator fun get(i: Int) = when (i) {
        0 -> x
        else -> throw ArrayIndexOutOfBoundsException()
    }

    operator fun set(i: Int, s: Byte) = when (i) {
        0 -> x = s
        else -> throw ArrayIndexOutOfBoundsException()
    }

    operator fun set(i: Int, s: Number) = when (i) {
        0 -> x = s.b
        else -> throw ArrayIndexOutOfBoundsException()
    }
}