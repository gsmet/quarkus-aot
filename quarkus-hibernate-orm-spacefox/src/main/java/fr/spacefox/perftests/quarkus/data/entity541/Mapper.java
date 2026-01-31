package fr.spacefox.perftests.quarkus.data.entity541;

import fr.spacefox.perftests.quarkus.core.service541.model.Model541;

final class Mapper {
    private Mapper() {}

    public static Model541 of(Entity541 entity) {
        return new Model541(entity.getId(), entity.getField());
    }
}
