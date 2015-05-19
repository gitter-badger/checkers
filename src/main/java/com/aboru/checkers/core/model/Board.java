/*
 * Copyright 2015 Anders Borg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aboru.checkers.core.model;

/**
 * Board.java (interface)
 *
 * Provides a definition of board functions so that this can be extended to let
 * checkers and chess play using the same board logic. These methods define the
 * common functions for all boards.
 *
 * @since 0.1.0
 * @author aboru
 */
public interface Board {

  /**
   * Loads saved game content from a specified file into the board for use in a
   * continued game. The filename given must be either absolute or relative the
   * current directory.
   *
   * @param filename The name of the file to be loaded.
   * @return {@link Boolean} True if the load completed successfully.
   */
  public Boolean load( String filename );

  /**
   * Saves the current game state into the specified file for use in a continue
   * of the game at a later time. The filename must be specified using either a
   * relative path to the current directory, or an absolute path.
   *
   * @param filename The name of the file to save data into.
   * @return {@link Boolean} True if the save completed successfully.
   */
  public Boolean save( String filename );

}
