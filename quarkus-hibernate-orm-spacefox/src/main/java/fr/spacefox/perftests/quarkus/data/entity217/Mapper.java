package fr.spacefox.perftests.quarkus.data.entity217;

import fr.spacefox.perftests.quarkus.core.service217.model.Model217;

final class Mapper {
    private Mapper() {}

    public static Model217 of(Entity217 entity) {
        return new Model217(entity.getId(), entity.getField());
    }
}
