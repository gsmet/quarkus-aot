package fr.spacefox.perftests.quarkus.data.entity69;

import fr.spacefox.perftests.quarkus.core.service69.model.Model69;

final class Mapper {
    private Mapper() {}

    public static Model69 of(Entity69 entity) {
        return new Model69(entity.getId(), entity.getField());
    }
}
