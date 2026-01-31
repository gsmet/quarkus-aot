package fr.spacefox.perftests.quarkus.data.entity578;

import fr.spacefox.perftests.quarkus.core.service578.model.Model578;

final class Mapper {
    private Mapper() {}

    public static Model578 of(Entity578 entity) {
        return new Model578(entity.getId(), entity.getField());
    }
}
