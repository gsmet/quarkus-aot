package fr.spacefox.perftests.quarkus.data.entity346;

import fr.spacefox.perftests.quarkus.core.service346.model.Model346;

final class Mapper {
    private Mapper() {}

    public static Model346 of(Entity346 entity) {
        return new Model346(entity.getId(), entity.getField());
    }
}
