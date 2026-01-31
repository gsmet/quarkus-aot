package fr.spacefox.perftests.quarkus.data.entity594;

import fr.spacefox.perftests.quarkus.core.service594.model.Model594;

final class Mapper {
    private Mapper() {}

    public static Model594 of(Entity594 entity) {
        return new Model594(entity.getId(), entity.getField());
    }
}
