package glm

import io.kotlintest.specs.StringSpec
import glm.mat.Mat4

/**
 * Created by GBarbieri on 08.03.2017.
 */

class coreMatrixTransform : StringSpec() {

    init {

        "translate" {

            val a = glm.translate(Mat4(
                    0f, 1f, 2f, 3f,
                    4f, 5f, 6f, 7f,
                    8f, 9f, 10f, 11f,
                    12f, 13f, 14f, 15f), 16f, 17f, 18f)

            a shouldBe Mat4(
                    0f, 1f, 2f, 3f,
                    4f, 5f, 6f, 7f,
                    8f, 9f, 10f, 11f,
                    224f, 276f, 328f, 380f)
        }

        "rotate" {

            val a = glm.rotate(Mat4(
                    0f, 1f, 2f, 3f,
                    4f, 5f, 6f, 7f,
                    8f, 9f, 10f, 11f,
                    12f, 13f, 14f, 15f), 16f, 17f, 18f, 19f)

            val ep = .001f

            glm.epsilonEqual(a[0][0], 8.281f, ep) shouldBe true
            glm.epsilonEqual(a[0][1], 9.159f, ep) shouldBe true
            glm.epsilonEqual(a[0][2], 10.038f, ep) shouldBe true
            glm.epsilonEqual(a[0][3], 10.916f, ep) shouldBe true

            glm.epsilonEqual(a[1][0], 3.018f, ep) shouldBe true
            glm.epsilonEqual(a[1][1], 4.033f, ep) shouldBe true
            glm.epsilonEqual(a[1][2], 5.048f, ep) shouldBe true
            glm.epsilonEqual(a[1][3], 6.062f, ep) shouldBe true

            glm.epsilonEqual(a[2][0], 1.520f, ep) shouldBe true
            glm.epsilonEqual(a[2][1], 2.616f, ep) shouldBe true
            glm.epsilonEqual(a[2][2], 3.711f, ep) shouldBe true
            glm.epsilonEqual(a[2][3], 4.806f, ep) shouldBe true

            glm.epsilonEqual(a[3][0], 12f, ep) shouldBe true
            glm.epsilonEqual(a[3][1], 13f, ep) shouldBe true
            glm.epsilonEqual(a[3][2], 14f, ep) shouldBe true
            glm.epsilonEqual(a[3][3], 15f, ep) shouldBe true
        }
    }
}