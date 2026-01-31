package fr.spacefox.perftests.quarkus.data.entity398;

import fr.spacefox.perftests.quarkus.core.service398.model.Model398;

final class Mapper {
    private Mapper() {}

    public static Model398 of(Entity398 entity) {
        return new Model398(entity.getId(), entity.getField());
    }
}
