package fr.spacefox.perftests.quarkus.data.entity325;

import fr.spacefox.perftests.quarkus.core.service325.model.Model325;

final class Mapper {
    private Mapper() {}

    public static Model325 of(Entity325 entity) {
        return new Model325(entity.getId(), entity.getField());
    }
}
