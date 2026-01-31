package fr.spacefox.perftests.quarkus.data.entity785;

import fr.spacefox.perftests.quarkus.core.service785.model.Model785;

final class Mapper {
    private Mapper() {}

    public static Model785 of(Entity785 entity) {
        return new Model785(entity.getId(), entity.getField());
    }
}
