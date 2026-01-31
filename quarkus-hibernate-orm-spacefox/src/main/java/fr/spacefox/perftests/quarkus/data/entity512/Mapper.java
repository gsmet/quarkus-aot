package fr.spacefox.perftests.quarkus.data.entity512;

import fr.spacefox.perftests.quarkus.core.service512.model.Model512;

final class Mapper {
    private Mapper() {}

    public static Model512 of(Entity512 entity) {
        return new Model512(entity.getId(), entity.getField());
    }
}
