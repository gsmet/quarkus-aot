package fr.spacefox.perftests.quarkus.data.entity876;

import fr.spacefox.perftests.quarkus.core.service876.model.Model876;

final class Mapper {
    private Mapper() {}

    public static Model876 of(Entity876 entity) {
        return new Model876(entity.getId(), entity.getField());
    }
}
