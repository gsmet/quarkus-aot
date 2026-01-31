package fr.spacefox.perftests.quarkus.data.entity208;

import fr.spacefox.perftests.quarkus.core.service208.model.Model208;

final class Mapper {
    private Mapper() {}

    public static Model208 of(Entity208 entity) {
        return new Model208(entity.getId(), entity.getField());
    }
}
