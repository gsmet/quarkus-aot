package fr.spacefox.perftests.quarkus.data.entity611;

import fr.spacefox.perftests.quarkus.core.service611.model.Model611;

final class Mapper {
    private Mapper() {}

    public static Model611 of(Entity611 entity) {
        return new Model611(entity.getId(), entity.getField());
    }
}
