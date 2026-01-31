package fr.spacefox.perftests.quarkus.data.entity789;

import fr.spacefox.perftests.quarkus.core.service789.model.Model789;

final class Mapper {
    private Mapper() {}

    public static Model789 of(Entity789 entity) {
        return new Model789(entity.getId(), entity.getField());
    }
}
