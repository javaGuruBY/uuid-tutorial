package by.jrr.uuidtutorial.service;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class SyntaxTest {

    @Test
    void uuidBaseSyntax() {
    }

    @Test
    public void generateUuid() {
        UUID uuid = UUID.randomUUID();
        assertNotNull(uuid);
    }

    @Test void getUuidFromString() {
        UUID uuid = UUID.fromString("4bcb2796-5af6-476e-befb-d56db038873f");
        assertNotNull(uuid);
    }

    @Test void getUuidFromBytes() {
        UUID uuid = UUID.nameUUIDFromBytes("4bcb2796-5af6-476e-befb-d56db038873f".getBytes());
        assertNotNull(uuid);
    }

    @Test void getUuidVersion() {
        UUID uuid = UUID.randomUUID();
        int version = uuid.version();
        int variant = uuid.variant();
        assertEquals(4, version);
        assertEquals(2, variant);

        long leastSignificant = uuid.getLeastSignificantBits();
        long mostSignificant = uuid.getMostSignificantBits();
        int clock = uuid.clockSequence();
        long timestamp = uuid.timestamp();
    }
}
