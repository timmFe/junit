package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testParseCSV() {
        String[] mapping = {"id", "firstName", "lastName", "country", "age"};
        var list = Main.parseCSV(mapping, "data.csv");
        assertEquals(2, list.size());
        assertEquals("John", list.get(0).firstName);
    }

    @Test
    public void testListToJson() {
        var list = Main.parseCSV(
                new String[]{"id", "firstName", "lastName", "country", "age"},
                "data.csv"
        );
        String json = Main.listToJson(list);
        assertTrue(json.contains("John"));
        assertTrue(json.contains("Inav"));
    }

    @Test
    public void testWriteString() {
        Main.writeString("test", "test_write.txt");
        assertTrue(new java.io.File("test_write.txt").exists());
    }
}