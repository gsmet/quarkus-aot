package fr.spacefox.perftests.quarkus.data.entity12;

import fr.spacefox.perftests.quarkus.core.service12.model.Model12;

final class Mapper {
    private Mapper() {}

    public static Model12 of(Entity12 entity) {
        return new Model12(entity.getId(), entity.getField());
    }
}
