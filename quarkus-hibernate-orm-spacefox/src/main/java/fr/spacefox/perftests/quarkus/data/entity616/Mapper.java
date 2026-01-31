package fr.spacefox.perftests.quarkus.data.entity616;

import fr.spacefox.perftests.quarkus.core.service616.model.Model616;

final class Mapper {
    private Mapper() {}

    public static Model616 of(Entity616 entity) {
        return new Model616(entity.getId(), entity.getField());
    }
}
