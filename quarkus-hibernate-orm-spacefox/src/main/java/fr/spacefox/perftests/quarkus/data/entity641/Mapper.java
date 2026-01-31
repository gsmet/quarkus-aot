package fr.spacefox.perftests.quarkus.data.entity641;

import fr.spacefox.perftests.quarkus.core.service641.model.Model641;

final class Mapper {
    private Mapper() {}

    public static Model641 of(Entity641 entity) {
        return new Model641(entity.getId(), entity.getField());
    }
}
