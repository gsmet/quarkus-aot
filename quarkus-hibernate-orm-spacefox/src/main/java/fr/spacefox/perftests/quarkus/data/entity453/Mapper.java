package fr.spacefox.perftests.quarkus.data.entity453;

import fr.spacefox.perftests.quarkus.core.service453.model.Model453;

final class Mapper {
    private Mapper() {}

    public static Model453 of(Entity453 entity) {
        return new Model453(entity.getId(), entity.getField());
    }
}
