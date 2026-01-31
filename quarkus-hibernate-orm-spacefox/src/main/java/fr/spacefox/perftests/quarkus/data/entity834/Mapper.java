package fr.spacefox.perftests.quarkus.data.entity834;

import fr.spacefox.perftests.quarkus.core.service834.model.Model834;

final class Mapper {
    private Mapper() {}

    public static Model834 of(Entity834 entity) {
        return new Model834(entity.getId(), entity.getField());
    }
}
