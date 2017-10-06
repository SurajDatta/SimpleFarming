/*
 * Copyright 2017 MovingBlocks
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
package org.terasology.simpleFarming.components;

import org.terasology.entitySystem.Component;
import org.terasology.entitySystem.prefab.Prefab;
import org.terasology.world.block.Block;

/**
 * Stores the data needed in order to grow a vine.
 * Should be added to a prefab in order to be able to plant it via a SeedDefinitionComponent
 */
public class VineDefinitionComponent implements Component {
    /**
     * The block to use for a stem.
     */
    public Block stem;
    /**
     * The prefab of the bush to use as the bud.
     */
    public Prefab bud;
    /**
     * maxTime and minTime should be specified in milliseconds.
     */
    public int minGrowTime;
    public int maxGrowTime;
}
