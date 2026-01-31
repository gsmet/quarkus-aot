package fr.spacefox.perftests.quarkus.data.entity223;

import fr.spacefox.perftests.quarkus.core.service223.model.Model223;

final class Mapper {
    private Mapper() {}

    public static Model223 of(Entity223 entity) {
        return new Model223(entity.getId(), entity.getField());
    }
}
