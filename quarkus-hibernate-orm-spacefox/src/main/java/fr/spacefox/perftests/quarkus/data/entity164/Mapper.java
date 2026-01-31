package fr.spacefox.perftests.quarkus.data.entity164;

import fr.spacefox.perftests.quarkus.core.service164.model.Model164;

final class Mapper {
    private Mapper() {}

    public static Model164 of(Entity164 entity) {
        return new Model164(entity.getId(), entity.getField());
    }
}
