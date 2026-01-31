package fr.spacefox.perftests.quarkus.data.entity731;

import fr.spacefox.perftests.quarkus.core.service731.model.Model731;

final class Mapper {
    private Mapper() {}

    public static Model731 of(Entity731 entity) {
        return new Model731(entity.getId(), entity.getField());
    }
}
