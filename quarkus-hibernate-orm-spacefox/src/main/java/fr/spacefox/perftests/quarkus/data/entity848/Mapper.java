package fr.spacefox.perftests.quarkus.data.entity848;

import fr.spacefox.perftests.quarkus.core.service848.model.Model848;

final class Mapper {
    private Mapper() {}

    public static Model848 of(Entity848 entity) {
        return new Model848(entity.getId(), entity.getField());
    }
}
