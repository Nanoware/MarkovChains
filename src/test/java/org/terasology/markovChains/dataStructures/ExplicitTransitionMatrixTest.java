/*
 * Copyright 2015 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.markovChains.dataStructures;

import org.junit.Test;
import org.terasology.markovChains.MarkovChainBase;
import org.terasology.markovChains.RawMarkovChain;

import static org.junit.Assert.fail;

/**
 * Created by Linus on 14-2-2015.
 */
public class ExplicitTransitionMatrixTest {

    /**
     * Checks that the createTransitionArray creates an array of the right size and
     * that it only contains zeros.
     */
    @Test
    public void testCreateTransitionArray() {
        final int order = 0;
        final int nrOfStates = 1;
        final int[][] orderAndStateNrPairs = {
                {1, 1},
                {1, 9},
                {3, 4},
                {5, 3}
        };

        for (int[] param : orderAndStateNrPairs) {
            try {
                TransitionMatrix matrix = new ExplicitTransitionMatrix(
                        param[order], param[nrOfStates], ExplicitTransitionMatrix.createTransitionArray(param[order], param[nrOfStates])
                );
            } catch (Exception e) {
                fail("Constructor threw an exception / transition array was not accepted.");
            }
        }
    }
}
