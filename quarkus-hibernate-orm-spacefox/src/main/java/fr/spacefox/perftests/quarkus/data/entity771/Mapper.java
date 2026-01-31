package fr.spacefox.perftests.quarkus.data.entity771;

import fr.spacefox.perftests.quarkus.core.service771.model.Model771;

final class Mapper {
    private Mapper() {}

    public static Model771 of(Entity771 entity) {
        return new Model771(entity.getId(), entity.getField());
    }
}
