package net.ivanvzykov.codewarsjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFileInSubDirsTest {

    @Test
    void findFile() {
        var sut = new FindFileInSubDirs();

        var result = sut.findFile();

        assertEquals("test-dir/test-sub-dir/a2/a2b2/the-file", result);
    }
}
