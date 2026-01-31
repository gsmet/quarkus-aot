package fr.spacefox.perftests.quarkus.data.entity994;

import fr.spacefox.perftests.quarkus.core.service994.model.Model994;

final class Mapper {
    private Mapper() {}

    public static Model994 of(Entity994 entity) {
        return new Model994(entity.getId(), entity.getField());
    }
}
