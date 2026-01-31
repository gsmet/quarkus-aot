package fr.spacefox.perftests.quarkus.data.entity704;

import fr.spacefox.perftests.quarkus.core.service704.model.Model704;

final class Mapper {
    private Mapper() {}

    public static Model704 of(Entity704 entity) {
        return new Model704(entity.getId(), entity.getField());
    }
}
