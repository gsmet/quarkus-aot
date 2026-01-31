package fr.spacefox.perftests.quarkus.data.entity421;

import fr.spacefox.perftests.quarkus.core.service421.model.Model421;

final class Mapper {
    private Mapper() {}

    public static Model421 of(Entity421 entity) {
        return new Model421(entity.getId(), entity.getField());
    }
}
