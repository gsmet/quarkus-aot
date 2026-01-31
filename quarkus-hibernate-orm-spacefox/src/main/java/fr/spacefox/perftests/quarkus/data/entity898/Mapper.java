package fr.spacefox.perftests.quarkus.data.entity898;

import fr.spacefox.perftests.quarkus.core.service898.model.Model898;

final class Mapper {
    private Mapper() {}

    public static Model898 of(Entity898 entity) {
        return new Model898(entity.getId(), entity.getField());
    }
}
