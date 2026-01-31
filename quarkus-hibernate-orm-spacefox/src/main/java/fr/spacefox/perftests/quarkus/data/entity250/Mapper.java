package fr.spacefox.perftests.quarkus.data.entity250;

import fr.spacefox.perftests.quarkus.core.service250.model.Model250;

final class Mapper {
    private Mapper() {}

    public static Model250 of(Entity250 entity) {
        return new Model250(entity.getId(), entity.getField());
    }
}
