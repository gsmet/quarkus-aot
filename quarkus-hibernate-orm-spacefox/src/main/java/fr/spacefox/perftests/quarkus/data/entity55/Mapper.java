package fr.spacefox.perftests.quarkus.data.entity55;

import fr.spacefox.perftests.quarkus.core.service55.model.Model55;

final class Mapper {
    private Mapper() {}

    public static Model55 of(Entity55 entity) {
        return new Model55(entity.getId(), entity.getField());
    }
}
