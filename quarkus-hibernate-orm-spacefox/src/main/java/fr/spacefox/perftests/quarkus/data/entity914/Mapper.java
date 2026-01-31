package fr.spacefox.perftests.quarkus.data.entity914;

import fr.spacefox.perftests.quarkus.core.service914.model.Model914;

final class Mapper {
    private Mapper() {}

    public static Model914 of(Entity914 entity) {
        return new Model914(entity.getId(), entity.getField());
    }
}
