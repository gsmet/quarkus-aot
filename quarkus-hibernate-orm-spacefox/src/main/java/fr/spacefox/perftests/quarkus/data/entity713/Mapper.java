package fr.spacefox.perftests.quarkus.data.entity713;

import fr.spacefox.perftests.quarkus.core.service713.model.Model713;

final class Mapper {
    private Mapper() {}

    public static Model713 of(Entity713 entity) {
        return new Model713(entity.getId(), entity.getField());
    }
}
