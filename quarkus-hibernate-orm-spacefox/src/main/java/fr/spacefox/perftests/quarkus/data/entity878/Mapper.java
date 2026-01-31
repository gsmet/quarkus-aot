package fr.spacefox.perftests.quarkus.data.entity878;

import fr.spacefox.perftests.quarkus.core.service878.model.Model878;

final class Mapper {
    private Mapper() {}

    public static Model878 of(Entity878 entity) {
        return new Model878(entity.getId(), entity.getField());
    }
}
