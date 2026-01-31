package fr.spacefox.perftests.quarkus.data.entity539;

import fr.spacefox.perftests.quarkus.core.service539.model.Model539;

final class Mapper {
    private Mapper() {}

    public static Model539 of(Entity539 entity) {
        return new Model539(entity.getId(), entity.getField());
    }
}
