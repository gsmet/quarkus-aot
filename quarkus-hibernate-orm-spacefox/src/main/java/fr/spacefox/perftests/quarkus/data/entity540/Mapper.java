package fr.spacefox.perftests.quarkus.data.entity540;

import fr.spacefox.perftests.quarkus.core.service540.model.Model540;

final class Mapper {
    private Mapper() {}

    public static Model540 of(Entity540 entity) {
        return new Model540(entity.getId(), entity.getField());
    }
}
