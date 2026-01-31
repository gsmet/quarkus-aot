package fr.spacefox.perftests.quarkus.data.entity780;

import fr.spacefox.perftests.quarkus.core.service780.model.Model780;

final class Mapper {
    private Mapper() {}

    public static Model780 of(Entity780 entity) {
        return new Model780(entity.getId(), entity.getField());
    }
}
