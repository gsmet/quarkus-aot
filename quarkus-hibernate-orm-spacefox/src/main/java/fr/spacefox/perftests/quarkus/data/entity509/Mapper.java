package fr.spacefox.perftests.quarkus.data.entity509;

import fr.spacefox.perftests.quarkus.core.service509.model.Model509;

final class Mapper {
    private Mapper() {}

    public static Model509 of(Entity509 entity) {
        return new Model509(entity.getId(), entity.getField());
    }
}
