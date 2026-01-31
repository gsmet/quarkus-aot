package fr.spacefox.perftests.quarkus.data.entity642;

import fr.spacefox.perftests.quarkus.core.service642.model.Model642;

final class Mapper {
    private Mapper() {}

    public static Model642 of(Entity642 entity) {
        return new Model642(entity.getId(), entity.getField());
    }
}
