package  glm.mat3x4

import glm.BYTES
import glm.set
import glm.vec4.Vec4d
import java.nio.DoubleBuffer

/**
 * Created by GBarbieri on 09.12.2016.
 */

class Mat3x4d(override var value: MutableList<Vec4d>) : Mat3x4t<Vec4d> {

    // -- Accesses --

    override operator fun get(i: Int) = value[i]

    operator fun set(i: Int, v: Vec4d) = value[i] put v

    infix fun to(dfb: DoubleBuffer) = to(dfb, 0)

    fun to(dfb: DoubleBuffer, offset: Int): DoubleBuffer {
        dfb[offset + 0] = value[0][0]
        dfb[offset + 1] = value[0][1]
        dfb[offset + 2] = value[0][2]
        dfb[offset + 3] = value[0][3]
        dfb[offset + 4] = value[1][0]
        dfb[offset + 5] = value[1][1]
        dfb[offset + 6] = value[1][2]
        dfb[offset + 7] = value[1][3]
        dfb[offset + 8] = value[2][0]
        dfb[offset + 9] = value[2][1]
        dfb[offset + 10] = value[2][2]
        dfb[offset + 11] = value[2][3]
        return dfb
    }

    companion object {
        @JvmField val size = 3 * 4 * Double.BYTES
    }
}