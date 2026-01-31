package fr.spacefox.perftests.quarkus.data.entity503;

import fr.spacefox.perftests.quarkus.core.service503.model.Model503;

final class Mapper {
    private Mapper() {}

    public static Model503 of(Entity503 entity) {
        return new Model503(entity.getId(), entity.getField());
    }
}
