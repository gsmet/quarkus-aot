package fr.spacefox.perftests.quarkus.data.entity355;

import fr.spacefox.perftests.quarkus.core.service355.model.Model355;

final class Mapper {
    private Mapper() {}

    public static Model355 of(Entity355 entity) {
        return new Model355(entity.getId(), entity.getField());
    }
}
