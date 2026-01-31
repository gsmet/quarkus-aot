package fr.spacefox.perftests.quarkus.data.entity11;

import fr.spacefox.perftests.quarkus.core.service11.model.Model11;

final class Mapper {
    private Mapper() {}

    public static Model11 of(Entity11 entity) {
        return new Model11(entity.getId(), entity.getField());
    }
}
