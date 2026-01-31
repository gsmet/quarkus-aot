package fr.spacefox.perftests.quarkus.data.entity824;

import fr.spacefox.perftests.quarkus.core.service824.model.Model824;

final class Mapper {
    private Mapper() {}

    public static Model824 of(Entity824 entity) {
        return new Model824(entity.getId(), entity.getField());
    }
}
