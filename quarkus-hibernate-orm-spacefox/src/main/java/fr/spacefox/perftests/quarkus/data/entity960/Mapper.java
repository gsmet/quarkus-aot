package fr.spacefox.perftests.quarkus.data.entity960;

import fr.spacefox.perftests.quarkus.core.service960.model.Model960;

final class Mapper {
    private Mapper() {}

    public static Model960 of(Entity960 entity) {
        return new Model960(entity.getId(), entity.getField());
    }
}
