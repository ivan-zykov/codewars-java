package net.ivanvzykov.codewarsjava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/*
  Script recreating the files structure for code to work:

  ```bash
  #!/usr/bin/env bash

  set -eo pipefail

  mkdir -p \
    test-dir/test-sub-dir/a1/a1b1 \
    test-dir/test-sub-dir/a1/a1b2 \
    test-dir/test-sub-dir/a2/a2b1 \
    test-dir/test-sub-dir/a2/a2b2

  touch test-dir/test-sub-dir/a2/a2b2/the-file
  ```
 */

/**
 * Find "the-file" file in sub-dirs of "test-dir/test-sub-dir" and return its path.
 * If file not found, return null.
 * Assume code is run on Linux
 * <p>
 * Cases:
 * <p>
 * 1. test-dir is on same level
 * 2. test-dir is somewhere else -> return null
 * 3. Multiple files can be found -> return first found
 * 4. Other OS, not Linux not considered
 */
public class FindFileInSubDirs {

    public String findFile() {
        final String startingDir = "test-dir/test-sub-dir";
        final String fileToSearch = "the-file";
        final int depth = 12;
        final Path startingPath = Paths.get(startingDir);

        String result = null;

        try (Stream<Path> stream = Files.walk(startingPath, depth)) {
            result = stream
                    .filter(file -> !Files.isDirectory(file))
                    .filter(file -> fileToSearch.equals(file.getFileName().toString()))
                    .map(startingPath::relativize)
                    .map(startingPath::resolve)
                    .map(Path::toString)
                    .findFirst()
                    .orElse(null);
        } catch (IOException e) {
            String errorMessage = String.format("Error. Failed to read starting path: %s. %s",
                    startingPath,
                    e.getMessage());
            System.out.println(errorMessage);
        } catch (SecurityException e) {
            String errorMessage = String.format("Error. Access denied to path: %s. %s",
                    startingPath,
                    e.getMessage());
            System.out.println(errorMessage);
        } catch (Throwable throwable) {
            System.out.println("Error. " + throwable.getMessage());
        }

        return result;
    }
}
