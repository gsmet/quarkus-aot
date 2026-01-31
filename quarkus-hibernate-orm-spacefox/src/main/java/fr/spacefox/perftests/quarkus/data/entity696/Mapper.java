package fr.spacefox.perftests.quarkus.data.entity696;

import fr.spacefox.perftests.quarkus.core.service696.model.Model696;

final class Mapper {
    private Mapper() {}

    public static Model696 of(Entity696 entity) {
        return new Model696(entity.getId(), entity.getField());
    }
}
