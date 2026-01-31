package fr.spacefox.perftests.quarkus.data.entity996;

import fr.spacefox.perftests.quarkus.core.service996.model.Model996;

final class Mapper {
    private Mapper() {}

    public static Model996 of(Entity996 entity) {
        return new Model996(entity.getId(), entity.getField());
    }
}
