package fr.spacefox.perftests.quarkus.data.entity795;

import fr.spacefox.perftests.quarkus.core.service795.model.Model795;

final class Mapper {
    private Mapper() {}

    public static Model795 of(Entity795 entity) {
        return new Model795(entity.getId(), entity.getField());
    }
}
