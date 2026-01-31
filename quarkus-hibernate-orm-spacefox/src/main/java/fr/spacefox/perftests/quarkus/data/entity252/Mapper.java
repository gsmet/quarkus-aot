package fr.spacefox.perftests.quarkus.data.entity252;

import fr.spacefox.perftests.quarkus.core.service252.model.Model252;

final class Mapper {
    private Mapper() {}

    public static Model252 of(Entity252 entity) {
        return new Model252(entity.getId(), entity.getField());
    }
}
