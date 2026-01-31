package fr.spacefox.perftests.quarkus.data.entity470;

import fr.spacefox.perftests.quarkus.core.service470.model.Model470;

final class Mapper {
    private Mapper() {}

    public static Model470 of(Entity470 entity) {
        return new Model470(entity.getId(), entity.getField());
    }
}
