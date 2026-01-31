package fr.spacefox.perftests.quarkus.data.entity748;

import fr.spacefox.perftests.quarkus.core.service748.model.Model748;

final class Mapper {
    private Mapper() {}

    public static Model748 of(Entity748 entity) {
        return new Model748(entity.getId(), entity.getField());
    }
}
