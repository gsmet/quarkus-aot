package fr.spacefox.perftests.quarkus.data.entity603;

import fr.spacefox.perftests.quarkus.core.service603.model.Model603;

final class Mapper {
    private Mapper() {}

    public static Model603 of(Entity603 entity) {
        return new Model603(entity.getId(), entity.getField());
    }
}
