package fr.spacefox.perftests.quarkus.data.entity177;

import fr.spacefox.perftests.quarkus.core.service177.model.Model177;

final class Mapper {
    private Mapper() {}

    public static Model177 of(Entity177 entity) {
        return new Model177(entity.getId(), entity.getField());
    }
}
