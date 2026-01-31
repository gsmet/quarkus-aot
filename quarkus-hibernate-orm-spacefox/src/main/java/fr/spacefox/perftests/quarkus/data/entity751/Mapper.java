package fr.spacefox.perftests.quarkus.data.entity751;

import fr.spacefox.perftests.quarkus.core.service751.model.Model751;

final class Mapper {
    private Mapper() {}

    public static Model751 of(Entity751 entity) {
        return new Model751(entity.getId(), entity.getField());
    }
}
