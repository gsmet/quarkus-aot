package fr.spacefox.perftests.quarkus.data.entity858;

import fr.spacefox.perftests.quarkus.core.service858.model.Model858;

final class Mapper {
    private Mapper() {}

    public static Model858 of(Entity858 entity) {
        return new Model858(entity.getId(), entity.getField());
    }
}
