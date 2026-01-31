package fr.spacefox.perftests.quarkus.data.entity694;

import fr.spacefox.perftests.quarkus.core.service694.model.Model694;

final class Mapper {
    private Mapper() {}

    public static Model694 of(Entity694 entity) {
        return new Model694(entity.getId(), entity.getField());
    }
}
