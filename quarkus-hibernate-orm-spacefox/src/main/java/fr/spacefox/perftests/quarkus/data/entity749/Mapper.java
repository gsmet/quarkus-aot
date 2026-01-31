package fr.spacefox.perftests.quarkus.data.entity749;

import fr.spacefox.perftests.quarkus.core.service749.model.Model749;

final class Mapper {
    private Mapper() {}

    public static Model749 of(Entity749 entity) {
        return new Model749(entity.getId(), entity.getField());
    }
}
