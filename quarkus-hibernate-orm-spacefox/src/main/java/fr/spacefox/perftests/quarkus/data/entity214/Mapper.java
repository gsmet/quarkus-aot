package fr.spacefox.perftests.quarkus.data.entity214;

import fr.spacefox.perftests.quarkus.core.service214.model.Model214;

final class Mapper {
    private Mapper() {}

    public static Model214 of(Entity214 entity) {
        return new Model214(entity.getId(), entity.getField());
    }
}
