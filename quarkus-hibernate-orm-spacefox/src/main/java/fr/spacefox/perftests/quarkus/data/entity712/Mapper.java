package fr.spacefox.perftests.quarkus.data.entity712;

import fr.spacefox.perftests.quarkus.core.service712.model.Model712;

final class Mapper {
    private Mapper() {}

    public static Model712 of(Entity712 entity) {
        return new Model712(entity.getId(), entity.getField());
    }
}
