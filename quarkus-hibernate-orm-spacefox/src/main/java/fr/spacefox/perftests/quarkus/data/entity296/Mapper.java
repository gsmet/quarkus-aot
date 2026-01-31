package fr.spacefox.perftests.quarkus.data.entity296;

import fr.spacefox.perftests.quarkus.core.service296.model.Model296;

final class Mapper {
    private Mapper() {}

    public static Model296 of(Entity296 entity) {
        return new Model296(entity.getId(), entity.getField());
    }
}
