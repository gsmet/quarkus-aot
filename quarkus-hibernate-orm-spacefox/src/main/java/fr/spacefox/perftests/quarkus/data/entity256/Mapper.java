package fr.spacefox.perftests.quarkus.data.entity256;

import fr.spacefox.perftests.quarkus.core.service256.model.Model256;

final class Mapper {
    private Mapper() {}

    public static Model256 of(Entity256 entity) {
        return new Model256(entity.getId(), entity.getField());
    }
}
