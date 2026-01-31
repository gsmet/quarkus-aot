package fr.spacefox.perftests.quarkus.data.entity743;

import fr.spacefox.perftests.quarkus.core.service743.model.Model743;

final class Mapper {
    private Mapper() {}

    public static Model743 of(Entity743 entity) {
        return new Model743(entity.getId(), entity.getField());
    }
}
