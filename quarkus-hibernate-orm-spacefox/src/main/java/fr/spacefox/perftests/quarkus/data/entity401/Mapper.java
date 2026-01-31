package fr.spacefox.perftests.quarkus.data.entity401;

import fr.spacefox.perftests.quarkus.core.service401.model.Model401;

final class Mapper {
    private Mapper() {}

    public static Model401 of(Entity401 entity) {
        return new Model401(entity.getId(), entity.getField());
    }
}
