package fr.spacefox.perftests.quarkus.data.entity727;

import fr.spacefox.perftests.quarkus.core.service727.model.Model727;

final class Mapper {
    private Mapper() {}

    public static Model727 of(Entity727 entity) {
        return new Model727(entity.getId(), entity.getField());
    }
}
