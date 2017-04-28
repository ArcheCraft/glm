package  glm.mat2x3

import glm.BYTES
import glm.set
import glm.vec3.Vec3d
import java.nio.DoubleBuffer

/**
 * Created by GBarbieri on 09.12.2016.
 */

data class Mat2x3d(override var value: MutableList<Vec3d>) : Mat2x3t<Vec3d> {


    // -- Accesses --

    override operator fun get(i: Int) = value[i]

    operator fun set(i: Int, v: Vec3d) = value[i] put v

    infix fun to(dfb: DoubleBuffer) = to(dfb, 0)

    fun to(dfb: DoubleBuffer, offset: Int): DoubleBuffer {
        dfb[offset + 0] = value[0][0]
        dfb[offset + 1] = value[0][1]
        dfb[offset + 2] = value[0][2]
        dfb[offset + 3] = value[1][0]
        dfb[offset + 4] = value[1][1]
        dfb[offset + 5] = value[1][2]
        return dfb
    }

    companion object {
        @JvmField val size = 2 * 3 * Double.BYTES
    }
}