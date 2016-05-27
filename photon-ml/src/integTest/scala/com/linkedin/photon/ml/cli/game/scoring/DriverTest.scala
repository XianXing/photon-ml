/*
 * Copyright 2016 LinkedIn Corp. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.linkedin.photon.ml.cli.game.scoring

import org.apache.hadoop.fs.Path

class DriverTest {

}

object DriverTest {

  val inputRoot = getClass.getClassLoader.getResource("GameIntegTest").getPath
  val inputDir = new Path(inputRoot, "input/test-with-uid").toString
  val featurePath = new Path(inputRoot, "input/feature-lists").toString
  val modelDir = new Path(inputRoot, "gameModel").toString
  val numExecutors = 1

  /**
    * Default arguments to the Game scoring driver
    */
  def defaultArgs: Map[String, String] = Map(
    "input-data-dirs" -> inputDir,
    "feature-name-and-term-set-path" -> featurePath,
    "game-model-input-dir" -> modelDir
  )
}