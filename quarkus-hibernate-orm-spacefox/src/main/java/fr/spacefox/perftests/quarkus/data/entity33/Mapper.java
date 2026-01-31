package fr.spacefox.perftests.quarkus.data.entity33;

import fr.spacefox.perftests.quarkus.core.service33.model.Model33;

final class Mapper {
    private Mapper() {}

    public static Model33 of(Entity33 entity) {
        return new Model33(entity.getId(), entity.getField());
    }
}
