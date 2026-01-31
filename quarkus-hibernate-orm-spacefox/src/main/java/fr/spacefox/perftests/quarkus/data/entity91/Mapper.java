package fr.spacefox.perftests.quarkus.data.entity91;

import fr.spacefox.perftests.quarkus.core.service91.model.Model91;

final class Mapper {
    private Mapper() {}

    public static Model91 of(Entity91 entity) {
        return new Model91(entity.getId(), entity.getField());
    }
}
