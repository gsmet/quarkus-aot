package fr.spacefox.perftests.quarkus.data.entity308;

import fr.spacefox.perftests.quarkus.core.service308.model.Model308;

final class Mapper {
    private Mapper() {}

    public static Model308 of(Entity308 entity) {
        return new Model308(entity.getId(), entity.getField());
    }
}
