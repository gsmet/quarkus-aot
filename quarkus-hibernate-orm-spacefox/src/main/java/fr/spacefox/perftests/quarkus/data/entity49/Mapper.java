package fr.spacefox.perftests.quarkus.data.entity49;

import fr.spacefox.perftests.quarkus.core.service49.model.Model49;

final class Mapper {
    private Mapper() {}

    public static Model49 of(Entity49 entity) {
        return new Model49(entity.getId(), entity.getField());
    }
}
