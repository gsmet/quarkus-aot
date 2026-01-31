package fr.spacefox.perftests.quarkus.data.entity774;

import fr.spacefox.perftests.quarkus.core.service774.model.Model774;

final class Mapper {
    private Mapper() {}

    public static Model774 of(Entity774 entity) {
        return new Model774(entity.getId(), entity.getField());
    }
}
