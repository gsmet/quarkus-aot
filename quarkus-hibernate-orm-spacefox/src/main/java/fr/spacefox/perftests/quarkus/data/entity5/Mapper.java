package fr.spacefox.perftests.quarkus.data.entity5;

import fr.spacefox.perftests.quarkus.core.service5.model.Model5;

final class Mapper {
    private Mapper() {}

    public static Model5 of(Entity5 entity) {
        return new Model5(entity.getId(), entity.getField());
    }
}
