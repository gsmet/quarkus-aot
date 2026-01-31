package fr.spacefox.perftests.quarkus.data.entity859;

import fr.spacefox.perftests.quarkus.core.service859.model.Model859;

final class Mapper {
    private Mapper() {}

    public static Model859 of(Entity859 entity) {
        return new Model859(entity.getId(), entity.getField());
    }
}
