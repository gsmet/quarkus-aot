package fr.spacefox.perftests.quarkus.data.entity891;

import fr.spacefox.perftests.quarkus.core.service891.model.Model891;

final class Mapper {
    private Mapper() {}

    public static Model891 of(Entity891 entity) {
        return new Model891(entity.getId(), entity.getField());
    }
}
