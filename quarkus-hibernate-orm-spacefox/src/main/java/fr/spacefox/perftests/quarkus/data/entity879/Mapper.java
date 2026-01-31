package fr.spacefox.perftests.quarkus.data.entity879;

import fr.spacefox.perftests.quarkus.core.service879.model.Model879;

final class Mapper {
    private Mapper() {}

    public static Model879 of(Entity879 entity) {
        return new Model879(entity.getId(), entity.getField());
    }
}
