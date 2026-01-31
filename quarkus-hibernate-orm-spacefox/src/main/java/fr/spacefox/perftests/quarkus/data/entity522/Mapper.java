package fr.spacefox.perftests.quarkus.data.entity522;

import fr.spacefox.perftests.quarkus.core.service522.model.Model522;

final class Mapper {
    private Mapper() {}

    public static Model522 of(Entity522 entity) {
        return new Model522(entity.getId(), entity.getField());
    }
}
