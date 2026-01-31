package fr.spacefox.perftests.quarkus.data.entity892;

import fr.spacefox.perftests.quarkus.core.service892.model.Model892;

final class Mapper {
    private Mapper() {}

    public static Model892 of(Entity892 entity) {
        return new Model892(entity.getId(), entity.getField());
    }
}
