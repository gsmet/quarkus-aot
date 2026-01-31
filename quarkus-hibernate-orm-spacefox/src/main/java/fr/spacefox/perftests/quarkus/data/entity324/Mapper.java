package fr.spacefox.perftests.quarkus.data.entity324;

import fr.spacefox.perftests.quarkus.core.service324.model.Model324;

final class Mapper {
    private Mapper() {}

    public static Model324 of(Entity324 entity) {
        return new Model324(entity.getId(), entity.getField());
    }
}
