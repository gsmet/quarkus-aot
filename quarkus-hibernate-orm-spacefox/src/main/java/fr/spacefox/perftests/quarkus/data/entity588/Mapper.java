package fr.spacefox.perftests.quarkus.data.entity588;

import fr.spacefox.perftests.quarkus.core.service588.model.Model588;

final class Mapper {
    private Mapper() {}

    public static Model588 of(Entity588 entity) {
        return new Model588(entity.getId(), entity.getField());
    }
}
