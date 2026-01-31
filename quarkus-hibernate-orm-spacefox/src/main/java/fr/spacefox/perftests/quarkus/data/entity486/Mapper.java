package fr.spacefox.perftests.quarkus.data.entity486;

import fr.spacefox.perftests.quarkus.core.service486.model.Model486;

final class Mapper {
    private Mapper() {}

    public static Model486 of(Entity486 entity) {
        return new Model486(entity.getId(), entity.getField());
    }
}
