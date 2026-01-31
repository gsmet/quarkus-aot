package fr.spacefox.perftests.quarkus.data.entity212;

import fr.spacefox.perftests.quarkus.core.service212.model.Model212;

final class Mapper {
    private Mapper() {}

    public static Model212 of(Entity212 entity) {
        return new Model212(entity.getId(), entity.getField());
    }
}
