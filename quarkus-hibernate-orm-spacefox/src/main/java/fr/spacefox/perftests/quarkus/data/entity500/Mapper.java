package fr.spacefox.perftests.quarkus.data.entity500;

import fr.spacefox.perftests.quarkus.core.service500.model.Model500;

final class Mapper {
    private Mapper() {}

    public static Model500 of(Entity500 entity) {
        return new Model500(entity.getId(), entity.getField());
    }
}
