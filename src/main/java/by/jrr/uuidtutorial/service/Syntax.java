package by.jrr.uuidtutorial.service;

import java.util.UUID;

public class Syntax {

    public void uuidBaseSyntax() {
        UUID uuid1 = UUID.fromString("4bcb2796-5af6-476e-befb-d56db038873f");
        UUID uuid2 = UUID.randomUUID();
        UUID uuid3 = UUID.nameUUIDFromBytes("4bcb2796-5af6-476e-befb-d56db038873f".getBytes());
    }
}
